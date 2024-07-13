package common_ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.avatar
import aoogle.composeapp.generated.resources.ic_globe_asia
import data.*
import org.jetbrains.compose.resources.painterResource
import utils.getActualExperience
import utils.getAge


@OptIn(ExperimentalMaterial3WindowSizeClassApi::class, ExperimentalLayoutApi::class)
@Composable
fun sideInfo(modifier: Modifier = Modifier) {

    var socialId by remember { mutableIntStateOf(0) }
    var socialUri by remember { mutableStateOf("") }
    val uriHandler = LocalUriHandler.current

    var showInfo by remember { mutableStateOf(true) }
    showInfo = calculateWindowSizeClass().widthSizeClass == WindowWidthSizeClass.Expanded

    Column (modifier = modifier
        .wrapContentSize()
        .padding(10.dp)

    ) {

        if (showInfo) {

            Row (verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(Res.drawable.avatar),
                    contentDescription = "Akshay Avatar",
                    modifier = modifier
                        .size(56.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    contentScale = ContentScale.Crop,
                )
                Column (modifier = modifier.padding(start = 16.dp)) {
                    Text(
                        text = "Akshay Pawar",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.W800,
                        color = Color.White
                    )

                    Row (
                        modifier = modifier.padding(top = 1.dp),
                        verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "Software Developer",
                            fontSize = 16.sp,
                            color = Color(0XFFBDC1C6)
                        )

                        smallDot()

                        Text(
                            text = "Android",
                            fontSize = 16.sp,
                            color = Color(0XFFBDC1C6)
                        )
                    }
                }
            }
            Row(verticalAlignment = Alignment.CenterVertically) {

                Row (
                    modifier = modifier
                        .padding(top = 10.dp, bottom = 10.dp, end = 10.dp)
                        .border(
                            width = 1.dp,
                            color = Color(0XFFBDC1C6),
                            shape = CircleShape
                        )
                        .padding(horizontal = 10.dp, vertical = 3.dp),

                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        painter = painterResource(Res.drawable.ic_globe_asia),
                        contentDescription = "Globe Asia",
                        modifier = modifier.size(22.dp),
                        tint = Color.White
                    )

                    Text(
                        text = "codexdroid.com",
                        fontSize = 14.sp,
                        color = Color.White,
                        modifier = modifier.padding(start = 4.dp)
                    )
                }

                Icon(
                    Icons.Default.CheckCircle,
                    contentDescription = null,
                    tint = Color(0XFF3DA288),
                    modifier = modifier
                        .size(26.dp)
                        .align(alignment = Alignment.CenterVertically)
                )
            }

            Text(
                text = "I am a passionate and skilled Android developer with a strong interest in the " +
                        "\nlatest technologies, such as Kotlin. I am currently working as a Software Developer," +
                        "\nand I am excited to be pursuing my goal of becoming a Professional Android " +
                        "\ndeveloper at the Parent company. I am confident that the Skills and experience I have" +
                        "\ngained in my current role will prepare me well for the next stage of my career.",
                color = Color(0XFFBDC1C6))
        }

        Spacer(modifier = modifier.padding(6.dp))

        Text(
            text = "About",
            fontSize = 20.sp,
            color = Color.White,
            modifier = modifier
                .padding(bottom = 6.dp)
                .background(color = Color(0xFF33353A))
        )


        Row (verticalAlignment = Alignment.CenterVertically){
            Text(
                text = "Born: ",
                fontWeight = FontWeight.Bold,
                color = Color.White)
            Text(
                text = "10 July 1996 (age ${getAge()} years), ",
                color = Color.White
            )
            Text(
                text = "Surat, Gujrat",
                color = Color(0XFF99C3FF),
                modifier = modifier
                    .background(color = Color(0xFF33353A))
                    .clickable {
                        uriHandler.openUri("https://maps.app.goo.gl/Vq3CD4yDLS7xb3LG6")
                    }
            )
        }

        Spacer(modifier = modifier.padding(top = 6.dp))

        Row (verticalAlignment = Alignment.CenterVertically){
            Text(
                text = "Education: ",
                fontWeight = FontWeight.Bold,
                color = Color.White)
            Text(
                text = "Bachelor Degree (IT), ",
                color = Color.White
            )
            Text(
                text = "Pune University (2019)",
                color = Color(0XFF99C3FF),
                modifier = modifier
                    .background(color = Color(0xFF33353A))
                    .clickable {
                        uriHandler.openUri("https://maps.app.goo.gl/RoRQ1v7V8ieN2TPr8")
                    }
            )
        }

        Spacer(modifier = modifier.padding(top = 6.dp))

        Row {
            Text(
                text = "Experience: ",
                fontWeight = FontWeight.Bold,
                color = Color.White)
            Text(
                text = "${getActualExperience()}+ years in Native Android",
                color = Color.White
            )
        }

        Spacer(modifier = modifier.padding(top = 6.dp))

        Row {
            Text(
                text = "Awards: ",
                fontWeight = FontWeight.Bold,
                color = Color.White)
            Text(
                text = "3rd Rank in Class (2017)",
                color = Color.White
            )
        }

        Spacer(modifier = modifier.padding(top = 6.dp))

        FlowRow {

            for (index in techStackDataLinks.indices) {

                val stackData = techStackDataLinks[index]

                if (index == 0) {
                    Text(
                        text = stackData.title,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = modifier
                            //.background(color = Color(0xFF33353A))
                    )
                }
                else {
                    Text(
                        text = stackData.title,
                        color = Color(0XFF99C3FF),
                        modifier = modifier
                            //.background(color = Color(0xFF33353A))
                            .clickable {
                                stackData.url?.let {
                                    uriHandler.openUri(it)
                                }
                            }
                    )
                }
            }

            for (index in techStackData.indices) {

                val stackData = techStackData[index]
                Text(
                    text = stackData.title,
                    color = Color.White,
                //    modifier = modifier.background(color = Color(0xFF33353A))
                )
            }
        }

        Spacer(modifier = modifier.padding(top = 6.dp))

        FlowRow {


            for (index in androidAppsLinks.indices) {
                val appData = androidAppsLinks[index]
                if (index == 0) {
                    Text(
                        text = appData.title,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                    //    modifier = modifier.background(color = Color(0xFF33353A))
                    )
                }
                else {
                    Text(
                        text = appData.title,
                        color = Color(0XFF99C3FF),
                        modifier = modifier
                            //.background(color = Color(0xFF33353A))
                            .clickable {
                                appData.url?.let {
                                    uriHandler.openUri(it)
                                }
                            }
                    )
                }
            }

            for (index in androidApps.indices) {
                val appData = androidApps[index]
                Text(
                    text = appData.title,
                    color = Color.White,
                    modifier = modifier
                        //.background(color = Color(0xFF33353A))
                )
            }
        }

        Spacer(modifier = modifier.padding(top = 6.dp))

        FlowRow {
            for (index in areasWorkedOn.indices) {
                Text(
                    text = areasWorkedOn[index],
                    fontWeight = if (index == 0) FontWeight.Bold else FontWeight.Normal,
                    color = Color.White
                )
            }
        }

        Spacer(modifier = modifier.padding(top = 6.dp))

        FlowRow {
            for (index in interest.indices) {
                Text(
                    text = interest[index],
                    fontWeight = if (index == 0) FontWeight.Bold else FontWeight.Normal,
                    color = Color.White
                )
            }
        }

        HorizontalDivider(
            color = Color(0XFF46484A),
            modifier = modifier
                //.background(color = Color(0xFF33353A))
                .padding(vertical = 10.dp))


        Text(text = "Profiles",
            color = Color.White,
            fontSize = 16.sp,
        )

        LazyRow {
            items(socials) {
                socialView(it,{
                    socialUri = it.url
                    socialId = it.id
                })
            }
        }
    }


    when(socialId) {
        1 -> uriHandler.openUri(socialUri)
        2 -> uriHandler.openUri(socialUri)
        3 -> uriHandler.openUri(socialUri)
        4 -> uriHandler.openUri(socialUri)
        5 -> uriHandler.openUri(socialUri)
        6 -> uriHandler.openUri(socialUri)
        7 -> uriHandler.openUri(socialUri)
        else -> {}
    }
}

//val uriHandler = LocalUriHandler.current
//uriHandler.openUri(socialData.url)


@Composable
fun socialView(
    socialData: SocialData,
    onIconClicked: () -> Unit,
    modifier: Modifier = Modifier) {


    Image(
        painter = painterResource(socialData.icon),
        contentDescription = null,
        modifier = modifier
            .size(50.dp)
            .padding(horizontal = 8.dp)
            .pointerHoverIcon(icon = PointerIcon.Hand)
            .clickable {
                onIconClicked()
            }
    )

}