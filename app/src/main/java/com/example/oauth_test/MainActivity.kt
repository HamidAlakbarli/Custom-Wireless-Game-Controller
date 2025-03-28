package com.example.oauth_test

import android.accounts.AccountManager
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.oauth_test.ui.theme.OAuth_TestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OAuth_TestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val launcher = rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) {
        GoogleSignInUtils.doGoogleSignIn(
            context = context,
            scope = scope,
            launcher = null,
            login = {
                Toast.makeText(context, "Login successful", Toast.LENGTH_SHORT).show()
            }
        )

    }
    val accountManager = AccountManager.get(context)
    val accounts = accountManager.getAccountsByType("com.google")
    Log.d("GoogleAccounts", "searching...")
    for (account in accounts) {
        Log.d("GoogleAccounts", "Found Google account: ${account.name}")
    }
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = {
            GoogleSignInUtils.doGoogleSignIn(
                context = context,
                scope = scope,
                launcher = launcher,
                login = {
                    Toast.makeText(context, "Login successful", Toast.LENGTH_SHORT).show()
                }
            )
        }) {
            Text(text = "Google Sign in")
        }

        val currentUser = GoogleSignInUtils.getCurrentUser()
        if(currentUser != null) {
            Text(text = "Name: " + currentUser.displayName.toString())
        } else(
            Text("No current user.")
        )

    }
}