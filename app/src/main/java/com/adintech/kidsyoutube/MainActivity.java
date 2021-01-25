package com.adintech.kidsyoutube;

import android.app.PictureInPictureParams;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.adintech.kidsyoutube.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mActivityMainBinding;

    //https://www.youtube.com/watch?v=Nkmarl4ynRM

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //set Thumbnail

        //video1 Set Data
        Picasso.get()
                .load("https://i.ytimg.com/vi/WNAcO8U8CBU/maxresdefault.jpg")
                .placeholder(R.drawable.no_image_icon)
                .error(R.drawable.no_image_icon)
                .into(mActivityMainBinding.videoThumbnail1);

        //video2 Set Data
        Picasso.get()
                .load("https://1.bp.blogspot.com/-pwsHYqQY7jM/XXpf_vqVbmI/AAAAAAAAAqM/neSOFubSnwgB74BU57zk_pCw6PiVMJlEwCLcBGAsYHQ/s1600/Johny%2BJohny%2BYes%2BPapa%2BLyrics.jpg")
                .placeholder(R.drawable.no_image_icon)
                .error(R.drawable.no_image_icon)
                .into(mActivityMainBinding.videoThumbnail2);

        //video3 Set Data
        Picasso.get()
                .load("https://i.ytimg.com/vi/WNAcO8U8CBU/maxresdefault.jpg")
                .placeholder(R.drawable.no_image_icon)
                .error(R.drawable.no_image_icon)
                .into(mActivityMainBinding.videoThumbnail3);

        //video4 Set Data
        Picasso.get()
                .load("https://i.ytimg.com/vi/uQIE7it-AZs/maxresdefault.jpg")
                .placeholder(R.drawable.no_image_icon)
                .error(R.drawable.no_image_icon)
                .into(mActivityMainBinding.videoThumbnail4);

        //video5 Set Data
        Picasso.get()
                .load("https://i.ytimg.com/vi/mL-iOOAac0I/maxresdefault.jpg")
                .placeholder(R.drawable.no_image_icon)
                .error(R.drawable.no_image_icon)
                .into(mActivityMainBinding.videoThumbnail5);

        //video6 Set Data
        Picasso.get()
                .load("https://i.pinimg.com/originals/8f/b2/78/8fb278739dad42e988dfa6bfc9fb83a0.jpg")
                .placeholder(R.drawable.no_image_icon)
                .error(R.drawable.no_image_icon)
                .into(mActivityMainBinding.videoThumbnail6);

        //video7 Set Data
        Picasso.get()
                .load("https://s2.dmcdn.net/v/Rm3Bl1TzcFq08xUFM/x720")
                .placeholder(R.drawable.no_image_icon)
                .error(R.drawable.no_image_icon)
                .into(mActivityMainBinding.videoThumbnail7);

       /* //video8 Set Data
        Picasso.get()
                .load("https://i.ytimg.com/vi/WNAcO8U8CBU/maxresdefault.jpg")
                .placeholder(R.drawable.no_image_icon)
                .error(R.drawable.no_image_icon)
                .into(mActivityMainBinding.videoThumbnail8);

        //video9 Set Data
        Picasso.get()
                .load("https://i.ytimg.com/vi/WNAcO8U8CBU/maxresdefault.jpg")
                .placeholder(R.drawable.no_image_icon)
                .error(R.drawable.no_image_icon)
                .into(mActivityMainBinding.videoThumbnail9);

        //video10 Set Data
        Picasso.get()
                .load("https://i.ytimg.com/vi/WNAcO8U8CBU/maxresdefault.jpg")
                .placeholder(R.drawable.no_image_icon)
                .error(R.drawable.no_image_icon)
                .into(mActivityMainBinding.videoThumbnail0);

        //video11 Set Data
        Picasso.get()
                .load("https://i.ytimg.com/vi/WNAcO8U8CBU/maxresdefault.jpg")
                .placeholder(R.drawable.no_image_icon)
                .error(R.drawable.no_image_icon)
                .into(mActivityMainBinding.videoThumbnail11);
*/

        OnClickMethod();
    }



    private void OnClickMethod() {

        mActivityMainBinding.videoItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoItem1 = new Intent(MainActivity.this, YoutubePlayActivity.class);
                videoItem1.putExtra("videoId", "Nkmarl4ynRM");
                videoItem1.putExtra("videoTitle", "Best Learning Video for Toddlers Learn Colors with Crayon Surprises !");
                videoItem1.putExtra("videoDescription", "Best Learning Video for Toddlers Learn Colors with Crayon Surprises! In this preschool learning video for kids, teach kids colors, common words, and simple sentences with this educational video for toddlers and babies. We'll open each of our rainbow colored crayons to find three toy surprises ");
                startActivity(videoItem1);
            }
        });

        mActivityMainBinding.videoItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoItem1 = new Intent(MainActivity.this, YoutubePlayActivity.class);
                videoItem1.putExtra("videoId", "F4tHL8reNCs");
                videoItem1.putExtra("videoTitle", "Johny Johny Yes Papa THE BEST Song for Children | LooLoo Kids");
                videoItem1.putExtra("videoDescription", "Johny Johny Yes Papa Lyrics\n" +
                        "\n" +
                        "Johny, Johny\n" +
                        "Yes, Papa?\n" +
                        "Eating sugar?\n" +
                        "No, papa!\n" +
                        "Telling lies?\n" +
                        "No, papa!\n" +
                        "Open your mouth\n" +
                        "Ha, ha, ha!\n" +
                        "\n" +
                        "Johny, Johny\n" +
                        "Yes, Papa?\n" +
                        "Eating sugar?\n" +
                        "No, papa!\n" +
                        "Telling lies?\n" +
                        "No, papa!\n" +
                        "Open your mouth\n" +
                        "Ha, ha, ha!\n");
                startActivity(videoItem1);
            }
        });

        mActivityMainBinding.videoItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoItem1 = new Intent(MainActivity.this, YoutubePlayActivity.class);
                videoItem1.putExtra("videoId", "YY890ByPpg8");
                videoItem1.putExtra("videoTitle", "TuTiTu Preschool | Numbers Train Song");
                videoItem1.putExtra("videoDescription", "TuTiTu Learning - the beloved hovercraft will teach your children numbers, how to count, the English alphabet and more!\n" +
                        "\n" +
                        "In this video, learn to count with TuTiTu's numbers train! Call out the number together with your child and for extra learning, call out the number's color as well!");
                startActivity(videoItem1);
            }
        });

        mActivityMainBinding.videoItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoItem1 = new Intent(MainActivity.this, YoutubePlayActivity.class);
                videoItem1.putExtra("videoId", "Euajm_vNLW8");
                videoItem1.putExtra("videoTitle", "Learn Alphabet Train Song - 3D Animation Alphabet ABC Train song for children");
                videoItem1.putExtra("videoDescription", "An alphabet train that teaches alphabets to children in a fun and colorful way. A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
                startActivity(videoItem1);
            }
        });

        mActivityMainBinding.videoItem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoItem1 = new Intent(MainActivity.this, YoutubePlayActivity.class);
                videoItem1.putExtra("videoId", "zAlX1V3lK5s");
                videoItem1.putExtra("videoTitle", "ABC Song | ABCD Alphabet Songs | ABC Songs for Children - 3D ABC Nursery Rhymes");
                videoItem1.putExtra("videoDescription", "ABC Song and ABC Alphabet Songs Plus More 3D Animation Learning English Alphabet Songs Collection and ABCD Nursery rhymes for children.");
                startActivity(videoItem1);
            }
        });

        mActivityMainBinding.videoItem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoItem1 = new Intent(MainActivity.this, YoutubePlayActivity.class);
                videoItem1.putExtra("videoId", "ai8vQmBjxUo");
                videoItem1.putExtra("videoTitle", "Abc Song | Abcd | A for apple | Abc kids | Nursery Rhymes Hindi balgeet");
                videoItem1.putExtra("videoDescription", "Abc Song | Abcd | A for apple | Abc kids | Nursery Rhymes Hindi balgeet,\n" +
                        "best power bank on gear best\n" +
                        " https://www.gearbest.com/chargers---p...\n" +
                        "आज के जमाने मे पढ़ाई स्मार्ट तरीके से होने लगी है ओर ये जरूरी भी है क्योकि दुनिया डिजिटल होती जारही है साथ ही बच्चे पढ़कर सीखने की जगह देखकर जल्दी सीखते है साथ ही बच्चे मोबाइल मे ज्यादा व्यस्त रहते है, इसी समस्या के समाधान के लिए हम लेकर आए है आपके बच्चो के लिए डिजिटल ओर स्मार्ट एडुकेशन शिक्षा ।\n" +
                        "Abc song , abcd, a for apple, hindi rhymes, Hindi rhymes for children, Hindi rhymes for kids, kids rhymes Hindi, baby songs Hindi, Hindi rhymes nursery, bal geet, Hindi rhymes playlist, chuchutv rhymes, Hindi lullabies, bal geet in hindi, bachon ke songs hindi, a se anar, varnamala, geet, phonics\n" +
                        " हमारे चैनल पर बच्चों को नये तरीके से मस्ती और खेल के साथ साथ सिखाया जाता है जिससे बच्चे मनोरंजन के साथ ज्ञान प्राप्त कर सके। यहाँ पर आपको मिलेगी हिंदी, अंग्रेजी और गणित की प्री लर्निंग ओर साथ मे कविता, कहानियां ओर कई बच्चों के मनोरंजन की वीडियो , जिससे बच्चे सिख सके और उनका सामान्य ज्ञान बढ़ सके। kids video for kids .\n" +
                        "Apko milenge Kids video for Kids, or Funny video kids. lil baby video, kids tv hindi , hindi rhymes, हिंदी बालगीत, हिन्दी सीखे , kids learn.\n" +
                        "बच्चों के लिए मस्ती, मनोरंजन और सिखाने वाले वीडियो रोज पाने के लिए हमारे चैनल को सब्सक्राइब करे और बेल आइकॉन को दबा दे।\n" +
                        "धन्यवादAbc Song | Abcd | A for apple | Abc kids | Nursery Rhymes Hindi balgeet,\n" +
                        "best power bank on gear best\n" +
                        " https://www.gearbest.com/chargers---p...\n" +
                        "आज के जमाने मे पढ़ाई स्मार्ट तरीके से होने लगी है ओर ये जरूरी भी है क्योकि दुनिया डिजिटल होती जारही है साथ ही बच्चे पढ़कर सीखने की जगह देखकर जल्दी सीखते है साथ ही बच्चे मोबाइल मे ज्यादा व्यस्त रहते है, इसी समस्या के समाधान के लिए हम लेकर आए है आपके बच्चो के लिए डिजिटल ओर स्मार्ट एडुकेशन शिक्षा ।\n" +
                        "Abc song , abcd, a for apple, hindi rhymes, Hindi rhymes for children, Hindi rhymes for kids, kids rhymes Hindi, baby songs Hindi, Hindi rhymes nursery, bal geet, Hindi rhymes playlist, chuchutv rhymes, Hindi lullabies, bal geet in hindi, bachon ke songs hindi, a se anar, varnamala, geet, phonics\n" +
                        " हमारे चैनल पर बच्चों को नये तरीके से मस्ती और खेल के साथ साथ सिखाया जाता है जिससे बच्चे मनोरंजन के साथ ज्ञान प्राप्त कर सके। यहाँ पर आपको मिलेगी हिंदी, अंग्रेजी और गणित की प्री लर्निंग ओर साथ मे कविता, कहानियां ओर कई बच्चों के मनोरंजन की वीडियो , जिससे बच्चे सिख सके और उनका सामान्य ज्ञान बढ़ सके। kids video for kids .\n" +
                        "Apko milenge Kids video for Kids, or Funny video kids. lil baby video, kids tv hindi , hindi rhymes, हिंदी बालगीत, हिन्दी सीखे , kids learn.\n" +
                        "बच्चों के लिए मस्ती, मनोरंजन और सिखाने वाले वीडियो रोज पाने के लिए हमारे चैनल को सब्सक्राइब करे और बेल आइकॉन को दबा दे।\n" +
                        "धन्यवाद ");
                startActivity(videoItem1);
            }
        });

        mActivityMainBinding.videoItem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoItem1 = new Intent(MainActivity.this, YoutubePlayActivity.class);
                videoItem1.putExtra("videoId", "XbclGWkdOwg");
                videoItem1.putExtra("videoTitle", "ABCD in Hindi|ABCD for kids learning in Hindi |ABCD for kids in Hindi | ABC in Hindi| ABC in English");
                videoItem1.putExtra("videoDescription", "In this video , ABCD is explained in very easy way .This video is helpful for those who wants their kids to learn ABCD in Hindi or ABC in Hindi OR ABCD in English or ABC in English .In this video , Teacher tell ABCD in Hindi after that Students Speaks ABCD in Hindi or ABC in Hindi or ABCD in English or ABC in English .If teacher speaks and then students follows the same . Then it's easy for kids to learn .Therefore , Firstly teacher speaks ABCD in Hindi or ABC in Hindi or ABCD in English or ABC in English after that Students also speaks ABCD in Hindi or ABC in Hindi .As we all know that Repetition is the Mother of Skills . So teacher helps kids to revise it .Firstly teacher Speaks ABCD in Hindi or ABC in Hindi or ABCD in English or ABC in English then Students Speaks ABCD in Hindi or ABC in Hindi or ABCD in English or ABC in English .\n" +
                        "ABC in Hindi or ABC in English is explains as ABC DEF GHI JKL MNO PQR STU VWX YZ\n" +
                        "ABCD in Hindi or ABCD in English is explains as ABCD EFGH IJKL  MNOP QRST UVWX  YZ");
                startActivity(videoItem1);
            }
        });

       /* mActivityMainBinding.videoItem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoItem1 = new Intent(MainActivity.this, YoutubePlayActivity.class);
                videoItem1.putExtra("videoId", "Nkmarl4ynRM");
                videoItem1.putExtra("videoTitle", "ttttttttttttttttttttttttttttttttt");
                videoItem1.putExtra("videoDescription", "dddddddddddddddddddddddddddddddddddd");
                startActivity(videoItem1);
            }
        });

        mActivityMainBinding.videoItem9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoItem1 = new Intent(MainActivity.this, YoutubePlayActivity.class);
                videoItem1.putExtra("videoId", "Nkmarl4ynRM");
                videoItem1.putExtra("videoTitle", "ttttttttttttttttttttttttttttttttt");
                videoItem1.putExtra("videoDescription", "dddddddddddddddddddddddddddddddddddd");
                startActivity(videoItem1);
            }
        });

        mActivityMainBinding.videoItem10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoItem1 = new Intent(MainActivity.this, YoutubePlayActivity.class);
                videoItem1.putExtra("videoId", "Nkmarl4ynRM");
                videoItem1.putExtra("videoTitle", "ttttttttttttttttttttttttttttttttt");
                videoItem1.putExtra("videoDescription", "dddddddddddddddddddddddddddddddddddd");
                startActivity(videoItem1);
            }
        });

        mActivityMainBinding.videoItem11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoItem1 = new Intent(MainActivity.this, YoutubePlayActivity.class);
                videoItem1.putExtra("videoId", "Nkmarl4ynRM");
                videoItem1.putExtra("videoTitle", "ttttttttttttttttttttttttttttttttt");
                videoItem1.putExtra("videoDescription", "dddddddddddddddddddddddddddddddddddd");
                startActivity(videoItem1);
            }
        });*/
    }

}