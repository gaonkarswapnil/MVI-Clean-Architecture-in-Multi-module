package com.example.presentation.view.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.domain.model.User

@Composable
fun SingleUser(
    user: User,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier.padding(12.dp).fillMaxWidth(),
        elevation = CardDefaults.elevatedCardElevation(20.dp),
        border = BorderStroke(2.dp, Color.LightGray)
    ){
        Text(
            user.name,
            modifier = Modifier.padding(start = 12.dp, top = 3.dp)
        )

        Text(
            user.email,
            modifier = Modifier.padding(start = 12.dp, top = 3.dp)
        )

        Text(
            user.company.name,
            modifier = Modifier.padding(start = 12.dp, top = 3.dp)
        )

        Text(
            user.address.city,
            modifier = Modifier.padding(start = 12.dp, top = 3.dp)
        )
    }
}