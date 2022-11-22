package mk.ukim.finki.technical_prototype.data;


import lombok.Getter;
import mk.ukim.finki.technical_prototype.model.Hotel;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataHolder {
    public static List<Hotel> hotels = new ArrayList<>();

    @PostConstruct
    public void init() {
        hotels.add(new Hotel(0L, 41.9390026F, 21.6199181F, "Mirror", "http://www.hotelmirror.mk/",
                "11, No. 32, Petrovec, 1043 Skopje, Macedonia", "+389 77 410 444", "-",
                "Hotel Mirror is a new, modern, ecologically sensitive, luxurious Hotel born out of passionate love in the art of traveling. " +
                        "Mirror’s vibe and feel are the results of thoughtful consideration of the cultural and natural environment. " +
                        "The only hotel located just 2 kilometers away from the arrivals and departure terminals of Skopje International Airport, " +
                        "Mirror Hotel offers 27 rooms & 4 suites, 1Fine, Wine & Dine restaurant and a pool bar. The new modern design of " +
                        "Hotel Mirror combined with upscale service, satisfies even the most eclectic guest. " +
                        "We were especially careful to implement 4-star international standards within our story, therefore providing pleasurable experience.",
                "https://cf.bstatic.com/xdata/images/hotel/max1024x768/330897648.jpg?k=605526780dfaa094ae83ece58fdaf2dec2f8fcd2ca4a283262420cbd7cf3bd47&o=&hp=1",
                "https://www.booking.com/hotel/mk/mirror.en-gb.html?aid=311984&label=mirror-q0tmIh1L7YRkPM8ZG9v4UQS625094922391%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atiaud-1110454565907%3Akwd-423978054691%3Alp2807%3Ali%3Adec%3Adm&sid=c526fd74d9f127a67f8da7487f9f52f6&dest_id=-95841;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;req_adults=2;req_children=0;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1669137386;srpvid=8c9d79746e45003e;type=total;ucfs=1&#hotelTmpl"));
        hotels.add(new Hotel(1L, 41.9984102F, 21.3924091F, "OK Hotel", "http://www.okhotel.mk/",
                "St. Londonska No.19, 1000 Skopje", "+389 2 3067 067","contact@okhotel.mk",
                "OK Hotel is a modern, uniquely furnished hotel, located in a quiet area of Skopje, 2.8 km from the city center. " +
                        "This distinctively designed hotel features various modern amenities, including a stylish lobby bar, a snack bar, a gift shop and free Wi-Fi access. " +
                        "All the rooms in the OK Hotel have a contemporary, stylish design, with high-quality comfortable mattresses, air-conditioning, " +
                        "a safe-deposit box, flat-screen TV offering variety of cable channels and a fridge. Each room has a stylish, " +
                        "elegantly designed bathroom, equipped with all modern amenities.\n" +
                        "\n" +
                        "The hotel offers 24- hour reception service, laundry and dry cleaning facilities, luggage storage and video-surveillance." +
                        " Room service and packed lunches are available upon request. The hotel conference room has a capacity of 30-45 persons; " +
                        "the room is air - conditioned and equipped with an LCD projector, TV set, flip-chart tables and other technical equipment " +
                        "for lectures and presentations, available upon request.",
                "https://macedonian-hotels.mk/images/hotels/skopje/ok-hotel/ok-hotel1355934961.jpg",
                "https://www.booking.com/city/mk/skopje.html?aid=303948;label=skopje-Rn5fpsil1q4MNbDnL2BCRQS500061943350:pl:ta:p1:p2:ac:ap:neg:fi:tikwd-327771809:lp2807:li:dec:dm;ws=&gclid=EAIaIQobChMI8cCZ5aXC-wIViajVCh0aMANtEAAYASAAEgKz-_D_BwE"));


        hotels.add(new Hotel(2L,41.0666434F, 20.8009009F, "Granit","http://www.hotelgranit.com.mk,",
                "Sv. Stefan BB 6000 Ohrid • Macedonia", "+389 46207100","reservation@hotelgranit.com.mk",
                "Hotel Granit is located on the shores of Lake Ohrid, in the locality St. Stefan, 5 km from the center of Ohrid and 12km from Ohrid’s airport. " +
                        "Hotel Granit is a four star modern hotel. It has a residential room, restaurant, cafe-bar, large terraces and its own sandy beach",
                "https://hotelgranit.com.mk/wp-content/uploads/2022/04/hotelgranit-1.jpg",
                "https://www.booking.com/hotel/mk/granit.en.html?aid=1486641;label=hotel-granit-EN-EMEA-S627492568766:pl:ta:p1:p2:ac:ap:neg:fi:tikwd-1667665765852:lp2807:li9075775:dec:dm;ws=&gclid=EAIaIQobChMI4b_ogKbC-wIVlZ3VCh10UAHrEAAYASAAEgLBVPD_BwE"));

        hotels.add(new Hotel(3L, 41.0678423F, 20.8016787F, "Prestol","http://www.hotelprestol.com",
                "-","+389 46277858", "-",
                "Welcome to Hotel Prestol, situated 7km from one of the most beautiful cities in Macedonia, Ohrid, " +
                        "which is also known as the city of light. Surrounded by mountains as high as 2800m and a lake extending for miles. " +
                        "Ohrid is a place of historical significance and a distinguished natural beauty that will " +
                        "remain with you for a long time to come. Ohrid is the biblical city of Macedonia, " +
                        "people visiting this amazing city will be fascinated and mezmorised by the allurement of this great city. " +
                        "Ohrid has 365 historical churches, one for each day of the year. Places like Ohrid are hard to find and this is " +
                        "one city you need to visit to understand the culture and history. " +
                        "Our Hotel is situated right across the road from the amazing Ohrid Lake, " +
                        "with breathtaking views of the lake and mountains. We have recently renovated the hotel rooms, " +
                        "the restaurant/function room and now have an outdoor eating area alongside the pools including a jaccuzi. " +
                        "Our elegant atmosphere will make you feel welcome whether it is for a day or a week. We will make your stay comfortable " +
                        "in our modern style hotel for whatever reason you choose Hotel Prestol.",
                "https://cf.bstatic.com/xdata/images/hotel/max500/71256629.jpg?k=dce4f9d0e74246832b2f740092ad66c441b2e176878927b273fd2602fb6985ee&o=&hp=1",
                "https://www.booking.com/hotel/mk/prestol.en.html?aid=1486641;label=hotel-prestol-EN-EMEA-S603088627872:pl:ta:p1:p2:ac:ap:neg:fi:tikwd-1596775971746:lp2807:li9075775:dec:dm;ws=&gclid=EAIaIQobChMIqauXjabC-wIVE_93Ch2Vnw36EAAYASAAEgIsx_D_BwE"));

        hotels.add(new Hotel(4L, 41.1405889F, 22.5048372F, "Holiday Han", "https://holiday-han.hellomacedonia.com/en/",
                "Marsal Tito 110, Gevgelija, North Macedonia", "+389 34 611 593", "holidayhan@yahoo.com",
                "Holiday Han Hotel is a budget venue within 20 minutes' walk of Gevgelija city center. The accommodation comprises 9 classic guestrooms.\n" +
                        "\n" +
                        "You can visit Dinosaur Park of Thessaloniki, which is about a 130-minute drive away from the property. The accommodation lies within a 130-minute drive from Galerius' Palace.\n" +
                        "\n" +
                        "Each room is provided with a laptop-size safe, a cupboard and ironing facilities. Holiday Han Hotel offers rooms with city views. A shared bathroom features a bath, a shower and towels for your comfortable stay.\n" +
                        "\n" +
                        "Holiday Han Hotel features free WiFi throughout the property.",
                "https://www.letsbookhotel.com/img/max300/217/21775760.jpg",
                "https://www.booking.com/country/mk.html?aid=1610684;label=mk-uEX_c3jAsP5r35v1o*vB0QS380886340935:pl:ta:p1:p2:ac:ap:neg:fi:tikwd-303403363424:lp2807:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9YfqnDqqG8nt10AsofPfvtt0;ws=&gclid=EAIaIQobChMIhLCmrKbC-wIVRsTVCh17ZAnXEAAYASAAEgIKE_D_BwE"
                ));

        hotels.add(new Hotel(5L,41.169856F, 20.710435F, "Vila ENHALON", "https://www.facebook.com/Enhalon",
                "Ezerski Lozja 86, Struga, Republic of Macedonia","070243534","enhalon@gmail.com",
                "Relaxing traditional family hotel by the lakeshore. WELCOME at our cosy home!",
                "https://lh3.googleusercontent.com/p/AF1QipMlg3oKwBEJOSjQGmyB2JRGGCrY447Y6Hy7pQYq=s1600-w400",
                "https://www.booking.com/city/mk/struga.en.html?aid=303948;label=struga-nOtTCu5Lo2Z8CJ9_f0BX1gS540957183540:pl:ta:p1:p2:ac:ap:neg:fi:tikwd-4961486709:lp2807:li:dec:dm;ws=&gclid=EAIaIQobChMI8LaGuqbC-wIVi-5RCh1-CQIEEAAYASAAEgLljfD_BwE"));



    }
}
