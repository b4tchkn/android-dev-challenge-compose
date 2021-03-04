package com.example.androiddevchallenge.ui.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun ListScreen(navController: NavController) {
    val dogs = listOf("犬A", "犬B", "犬C")
    Scaffold(
        topBar = {
            val title = stringResource(id = R.string.list_title)
            TopAppBar(
                title = { Text(text = title) },
            )
        },
        content = {
            LazyColumn {
                items(dogs) {
                    ListItem(dog = it, onItemClick = { /*TODO*/ })
                }
            }
        },
    )
}

@Preview
@Composable
fun ListScreenPreview() {
    val navController = rememberNavController()
    MyTheme {
        ListScreen(navController = navController)
    }
}