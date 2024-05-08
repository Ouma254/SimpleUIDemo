package com.deknowh.uidemo.composable

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deknowh.uidemo.data.myChats

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatScreen(modifier: Modifier = Modifier) {
    /**
     * menu icon
     * screen title
     * search
     * options
      */
    // scaffold
    Scaffold(
        topBar = {
            TopAppBar(
                title = { 
                   Text(text = "Inbox")
                },
                navigationIcon = {
                    IconButton(
                        onClick = { /*TODO*/ }
                    ) {
                        Icon(imageVector = Icons.Default.Menu,
                            contentDescription = null
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = { /*TODO*/ }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "search"
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    IconButton(
                        onClick = { /*TODO*/ }
                    ) {
                        Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)
                    }
                }
            )
        }
    ) {paddingValues ->
        Column(modifier.padding(paddingValues)) {
            Text(
                text = "Today",
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(8.dp),
                fontSize = 14.sp
            )
            LazyColumn {
                items(myChats) {chat ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Image(
                            painter = painterResource(id = chat.image),
                            contentDescription = null,
                            Modifier
                                .clip(CircleShape)
                                .padding(16.dp)
                                .size(30.dp)
                            //.padding(top = 20.dp)
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Card(
                            modifier
                                .fillMaxWidth()
                                .height(100.dp)
                                .padding(10.dp),
                            shape = RoundedCornerShape(5.dp)

                        ) {
                            Column(
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier.padding(8.dp)
                            ) {
                                // receiver
                                Text(
                                    text = chat.receiverUsername,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp
                                )
                                // sender - message
                                Row() {
                                    Text(
                                        text = chat.senderUsername,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 16.sp
                                    )
                                    Text(text = " - ${chat.message}")
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun UIDesign() {
    ChatScreen()
}