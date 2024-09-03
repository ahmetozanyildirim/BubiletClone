package com.example.bubiletclone

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BiletScreen() {
    val searchQuery = remember { mutableStateOf("") }


    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.height(60.dp),
                title = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Bubilet", fontSize = 18.sp)
                    }},
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF2FD87B),
                    titleContentColor = Color.White
                ),navigationIcon = {
                    IconButton(onClick = {  },modifier = Modifier.size(24.dp)) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_menu),
                            contentDescription = "Menu",
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    IconButton(onClick = {  },modifier = Modifier.size(24.dp)) {

                        Icon(
                            painter = painterResource(id = R.drawable.ic_location),
                            contentDescription = "Location",
                            tint = Color.White
                        )
                    }
                }
            )
        },

        bottomBar = {
            BottomAppBar(

                modifier = Modifier.height(68.dp),containerColor = Color(0xFF2FD87B)
            ) {
                IconButton(
                    onClick = {  },
                    modifier = Modifier.weight(1f).size(24.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_home),
                        contentDescription = "Home",
                        tint = Color.White
                    )
                }

                IconButton(
                    onClick = {  },
                    modifier = Modifier.weight(1f).size(24.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_return),
                        contentDescription = "Return",
                        tint = Color.White
                    )
                }

                IconButton(
                    onClick = {  },
                    modifier = Modifier.weight(1f).size(24.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_categories),
                        contentDescription = "Categories",
                        tint = Color.White
                    )
                }

                IconButton(
                    onClick = {  },
                    modifier = Modifier.weight(1f).size(24.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_share),
                        contentDescription = "Share",
                        tint = Color.White
                    )
                }

                IconButton(
                    onClick = {  },
                    modifier = Modifier.weight(1f).size(24.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_profile),
                        contentDescription = "Profile",
                        tint = Color.White
                    )
                }
            }
        },


        content = { paddingValues ->

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 4.dp)
                    .background(Color(0xFFF1F1F1))
            ) {


                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    contentPadding = PaddingValues(16.dp),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                ) {

                    item(span = { GridItemSpan(2) }) {
                        SearchBar(
                            searchQuery = searchQuery.value,
                            onSearchQueryChange = { searchQuery.value = it }
                        )
                    }


                    item {
                        TicketItem(
                            title = "DJ Sound ile Geçmişten...",
                            price = "112.00 TL",
                            location = "Hayal Kahvesi Emaar",
                            date = "01 Eylül, 29 Eylül",
                            imageRes = R.drawable.resim1
                        )
                    }
                    item {
                        TicketItem(
                            title = "Anna Karenina",
                            price = "85.00 TL",
                            location = "Bakırköy AyDem Sahne",
                            date = "02 Eylül, 11 Ekim",
                            imageRes = R.drawable.resim2
                        )
                    }
                    item {
                        TicketItem(
                            title = "Bilinmeyen Bir Kadının...",
                            price = "85.00 TL",
                            location = "Bakırköy AyDem Sahne",
                            date = "02 Eylül, 13 Ekim",
                            imageRes = R.drawable.resim3
                        )
                    }
                    item {
                        TicketItem(
                            title = "Bir Delinin Hatıra Defteri",
                            price = "85.00 TL",
                            location = "Bakırköy AyDem Sahne",
                            date = "02 Eylül, 17 Ekim",
                            imageRes = R.drawable.resim4
                        )
                    }
                    item {
                        TicketItem(
                            title = "DJ Salute ile Geçmişten...",
                            price = "112.00 TL",
                            location = "Hayal Kahvesi Emaar",
                            date = "01 Eylül, 29 Eylül",
                            imageRes = R.drawable.resim5
                        )
                    }
                    item {
                        TicketItem(
                            title = "Frida Kahlo",
                            price = "85.00 TL",
                            location = "Bakırköy AyDem Sahne",
                            date = "02 Eylül, 11 Ekim",
                            imageRes = R.drawable.resim6
                        )
                    }
                }
            }}
    )
}

@Composable
fun TicketItem(title: String, price: String, location: String, date: String, imageRes: Int) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(340.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFFFFF))


        ) {
            // Image
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .clip(RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Title
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                color = Color.Black,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .align(Alignment.Start)
            )

            Spacer(modifier = Modifier.height(4.dp))

            // Location
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_location),
                    contentDescription = "Location",
                    tint = Color(0xFF2CDA7B),
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = location,
                    fontSize = 14.sp,
                    color = Color(0xFF9C9C9C)
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            Divider(
                color = Color.LightGray,
                thickness = 0.5.dp,
                modifier = Modifier.padding(vertical = 4.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_calendar),
                    contentDescription = "Date",
                    tint = Color.Gray,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = date,
                    fontSize = 14.sp,
                    color = Color(0xFF9C9C9C)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
                    .background(
                        Color(0xFFF5F5F5),
                        RoundedCornerShape(50)
                    )
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Price
                Text(
                    text = price,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color(0xFF2CDA7B)
                )


                IconButton(
                    onClick = {  },
                    modifier = Modifier
                        .size(24.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_cart),
                        contentDescription = "Add to cart",
                        tint = Color(0xFF2CDA7B)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(searchQuery: String, onSearchQueryChange: (String) -> Unit) {
    OutlinedTextField(
        value = searchQuery,
        onValueChange = onSearchQueryChange,
        placeholder = { Text("Etkinlik, sanatçı veya mekan arayın") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(56.dp),
        shape = RoundedCornerShape(50),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = Color.White,

            focusedBorderColor = Color.Gray,
            unfocusedBorderColor = Color.Gray
        ),
        trailingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = "Search"
            )
        }
    )
}