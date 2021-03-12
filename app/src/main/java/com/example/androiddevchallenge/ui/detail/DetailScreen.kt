package com.example.androiddevchallenge.ui.detail

import androidx.compose.foundation.clickable
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R


@Composable
fun DetailScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = stringResource(id = R.string.detail_title)) })
        },
        content = {
            Text(text = "詳細画面です", Modifier.clickable { navController.navigate("list") })
        }
    )
}