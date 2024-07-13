package pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NotificationAdd
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.avatar
import aoogle.composeapp.generated.resources.avatar2
import aoogle.composeapp.generated.resources.avatar3
import common_ui.sideInfo
import common_ui.smallDot
import org.jetbrains.compose.resources.painterResource
import utils.getAge


@Composable
fun about(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(vertical = 10.dp)
            .background(color = Color(0XFF202124))
    ) {

        LazyColumn {

            item {

                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .background(color = Color(0xFF33353A))
                ) {

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = modifier.padding(10.dp)
                    ) {
                        Column {
                            Text(
                                text = "Akshay Pawar",
                                color = Color.White,
                                fontSize = 24.sp,

                                )
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "Software Developer",
                                    color = Color.White,
                                    fontSize = 16.sp,
                                )
                                smallDot()

                                Text(
                                    text = "Android",
                                    color = Color.White,
                                    fontSize = 16.sp,
                                )
                            }
                        }
                        Spacer(modifier = modifier.weight(1f))
                        Icon(
                            imageVector = Icons.Default.NotificationAdd,
                            contentDescription = "Notification Icon",
                            modifier = modifier
                                .padding(10.dp)
                                .background(
                                    color = Color(0xFF75D3EF),
                                    shape = CircleShape
                                )
                                .padding(6.dp)
                        )
                    }

                    LazyRow(modifier = modifier.padding(top = 10.dp)) {

                        item {
                            Image(
                                painter = painterResource(Res.drawable.avatar),
                                contentDescription = "Profile Pics",
                                contentScale = ContentScale.Crop,
                                modifier = modifier
                                    .padding(start = 6.dp, end = 4.dp)
                                    .size(140.dp, 120.dp)
                                    .clip(RoundedCornerShape(topStart = 20.dp, bottomStart = 20.dp))
                            )
                        }

                        item {
                            Image(
                                painter = painterResource(Res.drawable.avatar2),
                                contentDescription = "Profile Pics",
                                contentScale = ContentScale.Crop,
                                modifier = modifier
                                    .size(140.dp, 120.dp)
                            )

                        }

                        item {
                            Image(
                                painter = painterResource(Res.drawable.avatar3),
                                contentDescription = "Profile Pics",
                                contentScale = ContentScale.Crop,
                                modifier = modifier
                                    .padding(horizontal = 4.dp)
                                    .size(140.dp, 120.dp)
                                    .clip(RoundedCornerShape(topEnd = 20.dp, bottomEnd = 20.dp))
                            )
                        }
                    }

                    Row(
                        modifier = modifier
                            .wrapContentHeight()
                            .height(130.dp)
                    ) {

                        Card(
                            modifier = modifier
                                .padding(start = 10.dp, end = 8.dp, top = 10.dp, bottom = 10.dp)
                                .weight(1f),
                            colors = CardDefaults.cardColors(containerColor = Color(0XFF202124))) {

                            Column(modifier = modifier.padding(10.dp)) {
                                Text(
                                    text = "Age",
                                    fontSize = 14.sp,
                                    color = Color.White
                                )

                                Spacer(modifier = modifier.weight(1f))

                                Text(
                                    text = "${getAge()} years",
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                                Text(
                                    text = "10 July 1996",
                                    fontSize = 12.sp,
                                    color = Color.White
                                )
                            }
                        }

                        Card(
                            modifier = modifier
                                .padding(end = 10.dp, top = 10.dp, bottom = 10.dp)
                                .weight(1f),
                            colors = CardDefaults.cardColors(containerColor = Color(0XFF202124))
                        ) {
                            Column(modifier = modifier.padding(10.dp)) {
                                Text(
                                    text = "Education",
                                    fontSize = 14.sp,
                                    color = Color.White
                                )
                                Spacer(modifier = modifier.weight(1f))

                                Text(
                                    text = "Sir Visvesvaraya Institute of Technology, Chincholi, Nashik, 2014 - 2019",
                                    fontSize = 12.sp,
                                    color = Color.White,
                                    lineHeight = 1.2.em
                                )
                            }
                        }
                    }

                    Card(
                        modifier = modifier
                            .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
                            .clip(RoundedCornerShape(20.dp)),
                        colors = CardDefaults.cardColors(containerColor = Color(0XFF202124))
                    ) {
                        Text(
                            text = "I am a passionate Android developer with 3+ years of experience, specialising in Kotlin. " +
                                    "Currently a Software Developer, I am working towards becoming a Professional Android developer " +
                                    "at our parent company. The skills and experience I have gained in my role will help me achieve this goal.",
                            fontSize = 14.sp,
                            color = Color(0XFFBDC1C6),
                            modifier = modifier.padding(12.dp)
                        )
                    }
                }
            }

            item {

                HorizontalDivider(thickness = 8.dp, modifier = modifier, color = Color(0XFF202124))
            }

            item {
                sideInfo(modifier = modifier

                    .background(color = Color(0xFF303136))
                )
            }
        }
    }
}