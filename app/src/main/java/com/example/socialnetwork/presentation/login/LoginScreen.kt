package com.example.socialnetwork.presentation.login

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.socialnetwork.R
import com.example.socialnetwork.presentation.components.StandardTextField
import com.example.socialnetwork.presentation.theme.SpaceMedium
import com.example.socialnetwork.presentation.theme.SpaceSmall

@Composable
fun LoginScreen(
    navController: NavController,
    viewModel: LoginViewModel = hiltViewModel()
) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = SpaceMedium),

        ) {
        Text(
            text = stringResource(id = R.string.login),
            style = MaterialTheme.typography.h1
        )
        Spacer(modifier = Modifier.height(SpaceSmall))
        StandardTextField(
            text = viewModel.usernameText.value,
            onValueChange = {
                viewModel.setUsernameText(it)
            },
            hint = stringResource(id = R.string.login_hint),
        )
        Spacer(modifier = Modifier.height(SpaceSmall))
        StandardTextField(
            text = viewModel.passwordText.value,
            onValueChange = {
                viewModel.setPasswordText(it)
            },
            hint = stringResource(id = R.string.password_hint),
            keyboardType =  KeyboardType.Password
        )
    }

}
