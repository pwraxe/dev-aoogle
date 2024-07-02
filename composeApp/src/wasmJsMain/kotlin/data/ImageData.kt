package data

import aoogle.composeapp.generated.resources.*
import org.jetbrains.compose.resources.DrawableResource

data class ImageData (val id: Int,
    val image: DrawableResource,
    val title: String,
    val description: String,
)



val imageList = listOf(

    ImageData(0,Res.drawable.logo_boss,"Boss Sab Dekhta Hai","Boss | Tracking | Hospital | Visiting"),
    ImageData(1,Res.drawable.ic_erxpharma, "ERxPharmaPro","Doctor Software Service | Doctor | Digital Prescription | OPD | IPD"),
    ImageData(2,Res.drawable.logo_innovations, Details.COMPANY.INNOVATIONS,"IT Company | Service base Company in Nashik | Software Developments"),
    ImageData(3,Res.drawable.logo_mobihive,Details.COMPANY.MOBIHIVE,"Fintech service | mobile on Credit | Buy Now Pay Later"),
    ImageData(4,Res.drawable.logo_credithive,"CreditHive | Easy Smartphone Credit","CreditHive London, Africa | Mobile on Credit"),

    ImageData(5,Res.drawable.logo_glasswing,"Glasswing Partner, Consignment","Goods deliver in PAN | Affordable Shifting | Goods Tracking Shifting Company"),
    ImageData(6,Res.drawable.logo_gmd,"11th, 12th Collage","Best Collage | Collage in Sinnar | Science Collage in Nashik | MVP"),
    ImageData(7,Res.drawable.logo_grampanchayat,"Grampanchayat App for Village","Local App | Grampanchayat | Gramin App | Rural App"),
    ImageData(8,Res.drawable.logo_kichenbaba,"Food Delivery Partner","Online Food Order | Zomato | Local Hotel | Online Food Order"),
    ImageData(9,Res.drawable.logo_m3_compose,"App in Jetpack Compose of Material-3","Learning | Education | Compose App | Learn Jetpack Compose | Material 3"),

    ImageData(10,Res.drawable.avatar,"My Profile Avatar","Avatar | Profile Pic | DP | Gmail Account"),
    ImageData(11,Res.drawable.ic_google,"Google","Google, Account, Gmail, Company, US Based Company, Career"),
    ImageData(12,Res.drawable.ic_github,"GitHub/pwraxe","Github repo, code, github Project | Github account, profile"),
    ImageData(13,Res.drawable.ic_linkedin,"LinkedIn/AkshayPawar","LinkedIn | Profile, account, Linkedin member, working at, profile"),
    ImageData(14,Res.drawable.ic_leetcode,"Leetcode/AkshayPawar","Leetcode| LC | Problem solved, DSA, Language, LC Level, premium?, min problems"),


    ImageData(15,Res.drawable.logo_mobile_llc,Details.COMPANY.PROGRAMMING,"Mobile Company, Mobile Development Company, Service based Company, Pune Branch"),
    ImageData(16,Res.drawable.logo_pinnale,Details.COMPANY.PINNACLE,"First Company | Service Based company, Pune based company"),
    ImageData(17,Res.drawable.logo_sky_recharge,"Online Sky Recharge Service","Online Recharge, Recharge App | Mobile App for multi recharge"),
    ImageData(18,Res.drawable.logo_svit,"SVIT Nashik","Engineering Collage in Nashik | Engineering, Pharmacy, Pravara | Degree Collage"),
    ImageData(19,Res.drawable.logo_the_guru,"The Guru App","Seva, Satsang | The guru"),
    ImageData(20,Res.drawable.logo_erx, "ERxPharmaPro Icon","Logo Erx | icon erx | Doctor Software Service | Digital Prescription | OPD | IPD"),

    //Add Certificates
    ImageData(21,Res.drawable.cert_3rd_rank,"Third rank in Class (2017)","Award 2017 | Certificate | Class Certificate"),
    ImageData(22,Res.drawable.cert_apna_clg,"DSA Certificate","DSA | Learning Certificate | Class Certificate | Apna Collage"),
//    ImageData(23,Res.drawable.cert_degree,"Degree Certificate","Bachelor of Engineering | Degree Certificate | Engineering Collage"),
    ImageData(24,Res.drawable.cert_skill_univ,"Skill Universe Certificate","National Engineering Skill Development | Certificate of Participate"),
    ImageData(25,Res.drawable.cert_spoken_c,"C Certificate of Spoken Tutorial","Certificate | C Language | Spoken Tutorial | IIT Bombay"),
    ImageData(26,Res.drawable.cert_spoken_cpp,"C++ Certificate of Spoken Tutorial","C++ | CPP | Certificate of C Plus Plus | Spoken | IIT Bombay"),
    ImageData(27,Res.drawable.cert_spoken_java,"Java Certificate of Spoken Tutorial","Java | Training | Spoken Tutorial | IIT Bombay Java Course"),
    ImageData(28,Res.drawable.cert_unanth_learn_java,"Java Certificate of Unanth Learning","Java Training Certificate | Unanth Learning"),
    ImageData(29,Res.drawable.cert_unanth_comp_java,"Completion Java Certificate of Unanth Learning","Java Completion | Certificate | Course | Unanth"),
    ImageData(30,Res.drawable.cert_unanth_mysql_basic,"MySQL Certificate of Unanth Learning","MySQL | Database | Certificate | Course | Unanth"),
    ImageData(31,Res.drawable.cert_unanth_php_basic,"PHP Certificate of Unanth Learning","PHP | Certificate | Course | Unanth"),


    )