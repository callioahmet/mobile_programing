package com.example.buldanyemektarifleri.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.buldanyemektarifleri.Adapters.MealAdapter
import com.example.buldanyemektarifleri.Model.Meal
import com.example.buldanyemektarifleri.R

class MainActivity : AppCompatActivity() {
    private lateinit var mealRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mealList = listOf(
            Meal(
                "BalcanSoğanı",
                R.drawable.balcansogan,
                "\n" +
                        "\n" +
                        "2 adet patlıcan\n" +
                        "3 adet biber\n" +
                        "2 adet soğan\n" +
                        "1 adet yufka\n" +
                        "Tuz\n" +
                        "Koruk suyu (nar ekşisi ya da erik ekşisi de kullanılabilir.)\n" +
                        "½ Limon\n" +
                        "3 yemek kaşığı sıvı yağ\n" +
                        "\n" +
                        "Patlıcanlar közlenip soyulur.\n" +
                        "Patlıcanların üzerine kararmaması için limon sıkılır, bekletilir.\n" +
                        "Daha sonra patlıcanlar küçük küçük kesilir.\n" +
                        "Yağda biber ve soğan kavrulur.\n" +
                        "Yufka açılıp içerisine patlıcanlar konur.\n" +
                        "Yağda kavrulan soğan ve biberler yufkanın içerisine konulur.\n" +
                        "Üzerine koruk dökülür, dürüm yapılarak servis edilir.\n",
                "30dakika-1saat arası",
                "4 kişilik"
            ),
            Meal(
                "Buldan Kebabı",
                R.drawable.buldankebabi,
                "Buldan Kebabı Tarifi İçin Malzemeler\n\n" +
                        "500 gr dana kuşbaşı\n" +
                        "2 adet patates\n" +
                        "250 gr arpacık soğan\n" +
                        "2 su bardağı pilavlık pirinç\n" +
                        "3 su bardağı su\n" +
                        "1 yemek kaşığı salça\n" +
                        "Birer tatlı kaşığı tuz, karabiber, kekik\n" +
                        "3 yemek kaşığı tereyağı\n\n" +
                        "Buldan Kebabı Tarifi Nasıl Yapılır?\n\n" +
                        "Etlerimizi tencerede suyunu salıp çekene kadar kavuruyoruz. Bu arada patatesleri kuşbaşı et büyüklüğünde doğruyoruz. Arpacık soğanlar, 1 yemek kaşığı salça ve baharatlarla patatesleri bir kapta harmanlıyoruz. Etleri ekleyip fırına dayanıklı bir kaseye koyuyoruz. Fırına dayanıklı bir kabın ortasına ters çevirerek oturtuyoruz. Etrafına 3 su bardağı suyu ekliyoruz. 180 derecede 40 dk kadar pişiriyoruz. 40 dk sonunda 2 su bardağı yıkanmış pirinci eşit bir şekilde yayıyoruz ve 3 kaşık tereyağını ekliyoruz. Üzerini folyo ile kaplayıp 12-15 dk kadar daha fırında pişiriyoruz. Afiyet olsun.",
                "10dk Hazırlık - 55dk Pişirme",
                "6-8 Kişilik"
            ),
            Meal(
                "Kabak Çentmesi",
                R.drawable.kabakcentmesi,
                "Kabak Çentmesi Tarifi İçin Malzemeler\n\n" +
                        "4 orta boy kabak\n" +
                        "2 orta boy domates\n" +
                        "2 biber\n" +
                        "Bir tutam maydanoz\n" +
                        "Bir tutam dere otu\n" +
                        "Zeytinyağı\n" +
                        "Kırmızı toz biber\n" +
                        "Tuz\n" +
                        "1 çay bardağı su\n" +
                        "Üzerine yoğurt\n\n" +
                        "Kabak Çentmesi Tarifi Nasıl Yapılır?\n\n" +
                        "Öncelikle tavamıza yarım çay bardağı kadar zeytinyağı koyuyoruz, biberleri doğrayıp atıyor hemen ardından küp küp doğradığımız, domatesleri atıyoruz, iki çevirip çenttiğimiz ( küp doğranan) kabakları koyuyor tuzu ve bir tatlı kaşığı toz kırmızı biberi koyuyor, altını azaltıp suyunu bırakması için kapağını kapatıyoruz, beş dakika sonra kabak suyunu bırakınca isteğe göre maydanoz ve dere otu doğrayıp koyuyoruz ,( koymayadabilirsiniz) kabak bıraktığı suyu azalınca bir çay bardağı su ekleyip kapağı kapatıp pişmeye bırakıyoruz ,en geç on dakikaya pişecektir servis ederken sarımsaklı yoğurtta kullanırsanız harika bir lezzet olacak şimdiden afiyet olsun.",
                "10dk Hazırlık - 15dk Pişirme",
                "2-4 Kişilik"
            ),
            Meal(
                "Çağla Dövmesi Tarifi İçin Malzemeler",
                R.drawable.cagladovmesi,
                "Yarım kilo kadar taze badem çağlası\n" +
                        "2- 3 tane yeşil taze soğan.\n" +
                        "3 kaynamış yumurta.\n" +
                        "Tuz\n" +
                        " 1 çay kaşığı kadar pulbiber.\n" +
                        "2, 3 kaşık zeytinyağı.\n" +
                        "1 bağ bediren otu (İsteğe bağlı)\n" +
                        "2, 3tane yufka ekmeyi\n\n" +
                        "Nasıl Yapılır? " +
                        "\n\n" +
                        "1.Çağlaları blenderdan geçirelim içerisine kaynamış yumurtaları soyup doğrayalım\n\n" +
                        "2.Yeşil soğanı incecik doğrayalım, tuzunu, biberini yağını ayarlayalım\n\n" +
                        "3.Bediren otu bende olmadığı için kullanmadık, varsa mutlaka kullanın\n\n" +
                        "4.Onuda incecik doğrayın bu arada salatayı Denizli li olan sevgili eşim yapmıştır, ellerine sağlık salata hazırsa yufka ekmekle çok güzel oluyor, denemek isteyenlere tavsiye ederim ben Sivaslıyım çok beğendim, \uD83D\uDC4D\uD83D\uDE0A\uD83E\uDD17 kolay gelsin afiyet olsun",
                "10dk Hazırlık",
                "1-2 Kişilik"
            ),
            Meal(
                "Kahvaltılık Marul Dürüm Tarifi ",
                R.drawable.kahvaltilikmaruldurum,
                "Malzemeler\n\n" +
                        "8 yaprak marul\n" +
                        "2 yemek kaşığı acuka\n" +
                        "1 adet yeşil biber\n" +
                        "1 adet salatalık\n" +
                        "İsteğe bağlı miktarda tulum peyniri (kaşarda olur)\n" +
                        "İsteğe bağlı miktarda mor lahana\n" +
                        "İsteğe bağlı miktarda Siyah zeytin\n" +
                        "İsteğe bağlı miktarda Yeşil zeytin\n\n" +
                        "Yapılışı\n\n" +
                        "1.Yağlı kağıt serilir üzerine marullar önce dikine .\n" +
                        "2.Sonra yanına dizilir.\n" +
                        "3.Tüm malzemeler sırasıyla üzerine yerleştirilir ve yağlı kağıt yardımıyla sıkıca dürüm şeklinde sarılır .\n" +
                        "4.Kenarları da içe doğru güzelce sıkıştırılır ve ortadan bıçak yardımıyla kesilir (iç malzemeye kırmızı salçalık biber kaşar İsteğe bağlı eklenebilir acuka yada salça sevmeyenler aynı tarifi avokadoylada yapabilirler) afiyet olsun:)",
                "5 dakika ",
                "1-2 Kişilik"
            ),
            Meal(
                "Arabaşı Çorbası", R.drawable.arabasicorbasi, "Hamur Malzemeleri için:\n\n" +
                        "1 çorba kasesi un\n" +
                        "Tuz\n" +
                        "Sıcak su (tahminen 1, 5-2 lt)\n\n" +
                        "Çorba Malzemeleri:\n\n" +
                        "Yarım tavuk eti (haşlanmış)\n" +
                        "4 yemek kaşığı un\n" +
                        "Yarım çay bardağı sıvı yağ\n" +
                        "2 yemek kaşığı domates salçası\n" +
                        "5-6 adet kurutulmuş acı biber ya da kırmızı pul biber" +
                        "1-1,5 lt su yarısı tavuk suyu\n\n" +
                        "Hamurun Hazırlanışı\n\n" +
                        "Elenmiş unu ve tuzu derin bir tencereye koyun. 2 lt suyun üçte biri ılık su ile pürüzsüz olana kadar elinizle ezin (bu aşamada blendır kullanabilirsiniz) kalan sıcak suyun yarısını da hamura koyup ocağa alın ve sürekli karıştırarak pişirin.\n\n" +
                        "Hamur koyu ise azar azar sıcak su ekleyip karıştırmaya devam edin. Akışkan kıvamda olması gerekiyor.\n" +
                        "Su ile ıslatılmış tepsiye pişen hamuru dökün." +
                        "Hamurun yayılması için tepsiyi iyice sallayın ve soğumaya bırakın." +
                        "Soğuyan hamuru baklava dilimi şeklinde kesin." +
                        "Çorbanın Hazırlanışı Yağı ve unu teflon tavaya koyup pembeleşene kadar kavurun." +
                        "Kavrulan unu tencereye koyup 2 bardak soğuk su ekleyip topak topak olmaması için blendırdan geçirin." +
                        "Su ve tavuk suyu katıp kaynayana kadar karıştırın. (Su miktarını çorbanın koyuluğuna göre artırıp eksiltebilirsiniz)\n" +
                        " Ayrı bir tavaya sıvı yağ ve salçayı koyup kavurun kaynayan çorba ya ilave edin." +
                        "  Didiklenmiş tavuk ve biberi de ekleyip 10 dk daha kaynatın ve altını kapatın." +
                        "", "15dk Hazırlanış ", "4-6 Kişilik"
            ),
            Meal(
                "Omaç Tarifi İçin Malzemeler",
                R.drawable.omac,
                "Malzemeleri\n\n" +
                        "1 adet köy yufkası\n" +
                        "1 adet yumurta\n" +
                        "1 tatlı kaşığı tereyağı\n" +
                        "Tuz\n\n"
                        +
                        "Tarifi\n" +
                        "\n1.Köy yufkasını, resimdeki gibi çok küçük parçalara ayırın ve tavaya alın.\n" +
                        "2.Üzerine tereyağını da ekleyip, orta ateşte çıtır çıtır olana kadar kavurun.\n" +
                        "3.Kavrulmuş yufkayı, tavanın bir kenarına çekin.\n" +
                        "4.Tavanın boş kalan yarısına yumurtayı kırın ve pişirin. Yufkaların çıtırlığını kaybetmemesi gerektiği için, yumurtayı direk yufkanın üzerine kırmıyoruz.\n" +
                        "5.Pişmeye yakın, yumurtayı yufkalarla karıştırın ve tuzunu ekleyin.\n" +
                        "6.Pişen omacı, yine köy yufkasının içine sararak da yiyebilirsiniz.",
                "5dk Hazırlık - 10dk Pişirme",
                "1-2 Kişilik"
            ),
            Meal(
                "Pekmezli Balkabağı Tatlısı",
                R.drawable.pekmezlibalkabagi,
                "Malzemeler\n\n" +
                        "2 kg temizlenmiş bal kabağı \n" +
                        "2 su bardağı toz şeker \n" +
                        "1 su bardağı pekmez \n\n" +
                        "Üzeri için \n" +
                        "1 kase iri çekilmiş ceviz içi \n" +
                        "\n" +
                        "Nasıl Yapılır\n\n" +
                        "Bal kabağını yıkayıp istediğiniz gibi dilimleyin. Tabanı düz ve geniş bir tencereye sıralayın. Üzerine toz şekeri serpin. Tencerenin kapağını kapatıp en az 3 saat bekletin. (Zamanınız yoksa 1 çay bardağı su ilave edip pişirmeye başlayabilirsiniz)\n" +
                        "Tencereyi ocağa alın ve önce yüksek ateşte 5 dakika pişirin. Daha sonra ateşi iyice kısın. Bal kabakları yumuşayana kadar pişirin. İndirmeye 5 dakika kala pekmezi dökün. Tekrar tencerenin kapağını kapatın. 5 dakika sonra ocaktan alın ve oda ısısında soğumaya bırakın. Soğuduktan sonra servis tabağına alın. Üzerine iri kırılmış ceviz içi serperek servis yapın. ",
                "15dk Hazırlık - 20dk Pişirme",
                "6 Kişilik"
            ),
            Meal(
                "Saray Tatlisi",
                R.drawable.saraytatlisi,
                "Saray Tatlısı Tarifi İçin Malzemeler\n\n" +
                        "Yarım kilo un\n" +
                        "1 yumurta\n" +
                        "1 çay bardağı yoğurt\n" +
                        "1 çay kaşığı tuz ," +
                        "1 çay bardağı sıvı yağ\n" +
                        "1 çay kaşığı karbonat\n" +
                        "5 damla limon suyu\n" +
                        "2 çay bardağı içi için kırılmış ceviz\n" +
                        "1 çay bardağı un\n" +
                        "1 çay bardağı nişasta\n" +
                        "Hamuru sert olursa süt veya su kullanabilirsiniz\n\n" +
                        "Üzeri için\n" +
                        "1 çay bardağı üzeri için sıvı yağ\n\n" +

                        "Şerbeti için;\n" +
                        "500 gr şeker" +
                        "500 gr su\n\n" +
                        "Yapılışı\n\n" +
                        "Malzemelerin hepsini karıştırın ve bir hamur yapın. 10 dk dinlendirin.\n" +
                        "Sonra hamurları açabilecek kadar beze yapın.\n" +
                        "Unu ve nişastayı karıştırın, bezeleri ince şekilde açın.\n" +
                        "Ceviz serpiştirin, bir taraftan ortaya kadar büzün. Diğer tarafı da aynı şekilde ortaya kadar büzün.\n" +
                        "Tepsiye yuvarlak şekilde dolayın ve hepsini öyle yapın.\n" +
                        "Bittikten sonra, istediğiniz şekilde kesin.\n" +
                        "Üzerine dökmek için, sıvı yağı ocakta kızdırın ve sıcak halde gezdirin.\n" +
                        "200 derece fırında, üzeri kızarıncaya kadar pişirin, soğusun.\n" +
                        "Şerbeti için; şekeri ve suyu bir tencereye koyun. 15 dk kaynaması yeterli.\n" +
                        "Ardından 10 damla limon suyu ilave edin ve 2 dk daha kaynatıp, ocaktan alın.\n" +
                        "Şerbetin ilk sıcaklığı geçince, soğumuş saraylının üzerine gezdirin ve kapatın.\n" +
                        "Yarım gün beklettikten sonra, servis yapabilirsiniz.\n" +
                        "Afiyet olsun." +
                        "10 damla limon suyu\n ",
                "40dk Hazırlık - 35dk Pişirme",
                "10-12 Kişilik    "
            ),
            Meal(
                "Göce Aşı Tarifi",
                R.drawable.goceasi,
                "Malzemeleri\n\n" +
                        "500 gram buğday\n" +
                        "5 adet kuru biber\n" +
                        "150 gram börülce\n" +
                        "10 adet dağ eriği\n" +
                        "1 baş sarımsak\n" +
                        "Tuz\n\n" +
                        "Yapılışı\n\n" +
                        "1.Buğdayı 5-6 defa yıkayın.\n" +
                        "\n" +
                        "2.Buğday, börülce, biber ve eriği bir tencereye koyup üzeri kapanıncaya kadar su koyun ve kaynatın.\n" +
                        "\n" +
                        "3.Pişinceye kadar suyu bittikçe su ekleyin.\n" +
                        "\n" +
                        "4.Kaşıkla karıştırmayın.\n" +
                        "\n" +
                        "5.Sıcak olarak servis yapın. Afiyet olsun...",
                "30-60 dakika",
                "4-6 Kişilik"
            ),
            Meal(
                "İncir Tatlısı",
                R.drawable.incirtatlisi,
                "İncir Tatlısı Nasıl Yapılır? İçin Malzemeler\n\n" +
                        "3 adet yumurta\n" +
                        "1 su bardağı şeker\n" +
                        "1 su bardağı un\n" +
                        "1 su bardağı dövülmüş ceviz\n" +
                        "6 adet kuru incir (ufak ufak doğranıp 1 su bardağı ılık suda bekletilecek)\n" +
                        "1 paket kabartma tozu\n\n" +
                        "Şerbeti için:\n" +
                        "\n" +
                        "1, 5 su bardağı ılık su\n" +
                        "1 yemek kaşığı granül kahve\n" +
                        "Yarım su bardağı şeker\n\n" +
                        "Kreması için:\n" +
                        "\n" +
                        "1 lt süt\n" +
                        "2 yemek kaşığı elenmiş un (tepeleme)\n" +
                        "2 yemek kaşığı nişasta (tepeleme)\n" +
                        "5 yemek kaşığı şeker\n" +
                        "1 paket sade krem şanti\n" +
                        "1 yemek kaşığı tereyağı veya margarin\n\n" +
                        "Üzeri için \n\n" +

                        "Yapılışı\n\n "+
                        "İlk olarak küp küp doğradığımız incirleri sıcak suda yumuşaması için bekletelim.\n" +
                        "Keki için uygun bir karıştırma kabına olan bütün malzemeyi alıp karıştıralım, 170 derecede 35 dakika pişirelim. Kek ince olduğundan çok çabuk pişiyor. Aynı zamanda incirleri eklerken suyunun güzel bir şekilde süzüldüğünden emin olmalısınız.\n" +
                        "Şerbeti için kahveyi hazırlayalım. Ayrı bir kaba granül kahve, şeker ve ılık suyu alarak şeker ve kahve eriyene kadar karıştıralım, soğumaya bırakalım. Şerbet soğuk olacak ve kek fırından çıktıktan 5 dakika sonra keke dökelim.\n" +
                        "Muhallebisi için uygun bir tencereye krem şanti ve tereyağı hariç tüm malzemeyi alıp, göz göz olup koyulaşana kadar pişirelim.\n" +
                        "İndirmeye yakın tereyağını ilave edelim, eriyene kadar karıştıralım.\n" +
                        "Ocağın altını kapatınca kabuk tutmaması için ara ara karıştırarak ılımaya bırakalım.\n" +
                        "Ilıdıktan sonra krem şantiyi ilave edip mikserle pürüzsüz bir kıvam alana kadar çırpalım.\n" +
                        "Şerbetli kekimize muhallebiyi döküp üzerine isteğe bağlı Hindistan cevizi ve ceviz ile süsleyip soğuması için buzdolabında bekletelim. Vaktiniz varsa tatlınızı 1 gece buzdolabında dinlendirirseniz çok daha lezzetli olacaktır. Afiyet olsun"+


               "", "15dk Hazırlama - 35dk Pişirme",
                "8-10 Kişilik"
            )


        )


        // Initialize RecyclerView
        mealRecyclerView = findViewById(R.id.mainrecycler)
        mealRecyclerView.layoutManager = LinearLayoutManager(this)
        mealRecyclerView.adapter = MealAdapter(mealList)
    }
}