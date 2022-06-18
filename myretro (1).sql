-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 02, 2021 at 07:23 PM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `myretro`
--

-- --------------------------------------------------------

--
-- Table structure for table `cassete`
--

CREATE TABLE `cassete` (
  `id` varchar(10) NOT NULL,
  `image` varchar(200) NOT NULL,
  `name` varchar(50) NOT NULL,
  `price` double NOT NULL,
  `stock` int(11) DEFAULT NULL,
  `description` varchar(500) NOT NULL,
  `status` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cassete`
--

INSERT INTO `cassete` (`id`, `image`, `name`, `price`, `stock`, `description`, `status`) VALUES
('CA1', 'https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcT33uwAgs_KpuTy0TE4yASghhxxX9cXY_QuSemPkQFkmi_BxOaG9ApIrV1OepD5IYvVRoRRrRYVNagnlaaqvMz5rRiggWVxLd9o1Ul8XSVw3foH0zvz1m41CQ&usqp=CAE', 'Guardians Of The Galaxy Awesome Mix Vol. 2 Origina', 20, 10, 'Tracklist\r\nA1 –Electric Light Orchestra Mr. Blue Sky 5:02\r\nA2 –The Sweet Fox On The Run 3:24\r\nA3 –Aliotta Haynes Jeremiah Lake Shore Drive 3:48\r\nA4 –Fleetwood Mac The Chain 4:27\r\nA5 –Sam Cooke Bring It On Home To Me 2:42\r\nA6 –Glen Campbell Southern Nights 2:57\r\nA7 –George Harrison My Sweet Lord 4:37\r\nB1 –Looking Glass Brandy (You\'re A Fine Girl) 3:03\r\nB2 –Jay & The Americans Come A Little Bit Closer 2:45\r\nB3 –Silver (10) Wham Bam Shang-A-Lang 3:31\r\nB4 –Cheap Trick Surrender 4:13\r\n', 'active'),
('CA2', 'https://d8mkdcmng3.imgix.net/0c39/732714.jpg?auto=format&bg=0FFF&fit=fill&h=600&q=100&w=600&s=2b6913e910e7f5c1453db83d08e10967', 'Björk ‎- Debut Cassette', 20, 1, 'A1 Human Behaviour 4:12\r\nA2 Crying 4:49\r\nA3 Venus As A Boy 4:41\r\nA4 There\'s More To Life Than This (Recorded Live At The Milk Bar Toilets) 3:21\r\nA5 Like Someone In Love 4:33\r\nA6 Big Time Sensuality 3:56\r\nB1 One Day 5:24\r\nB2 Aeroplane 3:54\r\nB3 Come To Me 4:55\r\nB4 Violently Happy 4:58\r\nB5 The Anchor Song 3:32\r\nB6 Play Dead 3:57', 'active'),
('CA3', 'https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcSiZATzaZlOIEumGxSn-Qs5bvBH94YngyctQ2iXrFQhj3i0QlayZFupuQQ2NL5ZDVgnAkXhoTFkHzOTHyShigCsYn9ulKGF0I7kFTtuHx62nn5blwgblFxk&usqp=CAE', 'BTS - LIFE GOES ON CASSETTE', 10, 1, 'Filmed from their home of Seoul, the group\'s seven members imparted a heartfelt message encouraging youth around the world not to let the events of 2020 — and, in particular, the COVID-19 pandemic — cause them to lose hope in their future.', 'active');

-- --------------------------------------------------------

--
-- Table structure for table `comic`
--

CREATE TABLE `comic` (
  `id` varchar(10) NOT NULL,
  `image` varchar(500) NOT NULL,
  `name` varchar(100) NOT NULL,
  `price` double NOT NULL,
  `stock` int(11) DEFAULT NULL,
  `description` varchar(1000) NOT NULL,
  `status` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `comic`
--

INSERT INTO `comic` (`id`, `image`, `name`, `price`, `stock`, `description`, `status`) VALUES
('CO1', 'https://cdn.shopify.com/s/files/1/0023/9278/4940/products/amazing-spider-man-vol-1-9780785166764-3827069714476_2000x.jpg?v=1598974037', 'Amazing Spider-Man (Vol. 1)', 10, 2, 'The greatest super hero of all time returns! The world may have changed since Spidey\'s been gone, but so has Peter Parker. This is a man with a second chance at life, and he\'s not wasting a moment of it. But his old foes are back as well - re-energized, out of control and madder than ever: Electro and the Black Cat demand revenge! And as if dealing with them isn\'t enough, a new revelati on rocks Spider-Man\'s world to its core: the radioactive spider that gave Peter Parker his powers bit someone else, too! Who is Silk, and where has she been all these years? Find out as Peter Parker retakes his life, putting the \"friendly\" back in the neighborhood, the \"hero\" back in \"super hero..\".and the \"amazing\" back in \"Spider-Man!', 'active'),
('CO2', 'https://cdn.shopify.com/s/files/1/0023/9278/4940/products/9781408855669_001-page1_2000x.jpg?v=1605597825', 'Harry Potter And The Chamber Of Secrets (Book 2)', 10, 1, 'Harry Potter\'s summer has included the worst birthday ever, doomy warnings from a house-elf called Dobby, and rescue from the Dursleys by his friend Ron Weasley in a magical flying car! Back at Hogwarts School of Witchcraft and Wizardry for his second year, Harry hears strange whispers echo through empty corridors - and then the attacks start. Students are found as though turned to stone ... Dobby\'s sinister predictions seem to be coming true', 'deactive'),
('CO3', 'https://encrypted-tbn0.gstatic.com/shopping?q=tbn:ANd9GcTL4LwlrZJlyWTb0KecWU9hrCe02-w2fOg2RkQkTPbkezxyz6wcmeHLhMJnpjy6nCR-tvq_4qwSyq_pQI6IGneZmldhzNuqvbmDWkAG67FB-8ZlfyGjp8T8&usqp=CAE', 'LAWAK KAMPUS JILID 39', 8, 3, 'Pasti gamat dan menghiburkan! \"Lawak Kampus\" jilid ke-39 karya Keith kini kembali lagi! Sarat dengan lawak sempoi Vanness, Froggy, Aditas dan kawan-kawan. Ilustrasi watak Lawak Kampus ala bintang glamor turut diselitkan. Sudah tentu pembaca di luar sana tak kering gusi membelek komik humor ni!', 'active');

-- --------------------------------------------------------

--
-- Table structure for table `dvd`
--

CREATE TABLE `dvd` (
  `id` varchar(10) NOT NULL,
  `image` varchar(500) NOT NULL,
  `name` varchar(100) NOT NULL,
  `price` double NOT NULL,
  `stock` int(11) DEFAULT NULL,
  `description` varchar(1000) NOT NULL,
  `status` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dvd`
--

INSERT INTO `dvd` (`id`, `image`, `name`, `price`, `stock`, `description`, `status`) VALUES
('DVD1', 'https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcRHVnqHEQx7LognSNau9lPT6TaMnTwygTXhLFD5Afl1rbNL-_9krkUr_oLu8n5H0Lku2l-mSDdFLOOrkPIrsnM_LdSPQFZR_zkQqcbn1b46&usqp=CAE', 'Weathering With You / Tenki No Ko The Movie', 15, 2, 'Tokyo is currently experiencing rain showers that seem to disrupt the usual pace of everyone living there to no end. Amidst this seemingly eternal downpour arrives the runaway high school student Hodaka Morishima, who struggles to financially support himself—ending up with a job at a small-time publisher. At the same time, the orphaned Hina Amano also strives to find work to sustain herself and her younger brother.\r\nBoth fates intertwine when Hodaka attempts to rescue Hina from shady men, deciding to run away together. Subsequently, Hodaka discovers that Hina has a strange yet astounding power: the ability to call out the sun whenever she prays for it. With Tokyo\'s unusual weather in mind, Hodaka sees the potential of this ability. He suggests that Hina should become a \"sunshine girl\"—someone who will clear the sky for people when they need it the most.', 'active'),
('DVD2', 'https://d8mkdcmng3.imgix.net/8f00/676703.jpg?auto=format&bg=0FFF&fit=fill&h=600&q=100&w=600&s=9fc975f3a8cd85c5215e3f71ea7a08b9', 'X-Men: Dark Phoenix', 10, 5, 'The X-Men face their most formidable and powerful foe when one of their own, Jean Grey, starts to spiral out of control. During a rescue mission in outer space, Jean is nearly killed when she\'s hit by a mysterious cosmic force. Once she returns home, this force not only makes her infinitely more powerful, but far more unstable. The X-Men must now band together to save her soul and battle aliens that want to use Grey\'s new abilities to rule the galaxy.', 'active'),
('DVD3', 'https://encrypted-tbn0.gstatic.com/shopping?q=tbn:ANd9GcRYeXruFP10kZSki-WjPwxePFsFJpQM24me3VAEWvUn9-zlHyGBlk22CUzN8uOAqWKH3q9LFMFpnxTPk4TRXS2mDN4S59TJYgUL1_oi3GnaMjK2PDGIGwbu&usqp=CAE', 'FATE/STAY NIGHT THE MOVIE : HEAVEN\'S FEEL 2. LOST BUTTERFLY', 10, 2, 'Plot Summary:\r\nTen years after the Holy Grail War—a battle waged by Masters and Servants over the wish-granting container, the Holy Grail—another war breaks out in Fuyuki City. Shirou Emiya—the adopted son of Kiritsugu Emiya, who was a participant of the previous Holy Grail War—resolves to fight, carrying out Kiritsugu\'s dying wish. Shirou attempts to protect Sakura, a girl from the Matoi family who has been by his side for over a year. But once the Holy Grail War starts, there\'s a change in the air of Fuyuki City. Murders abound across the city, and the atmosphere grows ominous. The battle starts to go awry as secret maneuvers by unseen forces are put into play.', 'active'),
('DVD4', 'https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcSvnnFC7rN2noyJsyZvj9TvVAlMVbMAldM7__yOWckfLuPNIa2RCyA2oO6ORMv7miPj3xKR-JoPm6_VgcmXYu7vIhvsDpUdSM4DF_dNJDND&usqp=CAE', 'Descendants 3', 10, 2, 'This highly anticipated trequel continues the contemporary saga of good versus evil as the teenage daughters and sons of Disney\'s most infamous villains - Mal, Evie, Carlos and Jay (also known as the villain kids or VKs) - return to the Isle of the Lost to recruit a new batch of villainous offspring to join them at Auradon Prep. When a barrier breach jeopardises the safety of Auradon during the departure off the Isle, Mal resolves to permanently close the barrier, fearing that nemeses Uma and Hades will wreak vengeance on the kingdom. Despite her decision, an unfathomable dark force threatens the people of Auradon, and it\'s up to Mal and the VKs to save everyone in their most epic battle yet.', 'active'),
('DVD5', 'https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcS4PLYR6Jd7G1pBHqYHVZJSpCwaSsPxY7WXEV48RKpkHhDjHgpX--WDp4rYqPXEm9ZPJuDfR3GXc4BeLPAecg2-twiZLafbG4vvCznyQbeq&usqp=CAE', 'HELLO WORLD THE MOVIE', 8, 3, 'Plot Summary:\r\n\"The year is 2027, and the city of Kyoto has undergone tremendous technological advancement. Within the city lives Naomi Katagaki, a socially awkward and introverted boy with a love for books, and Ruri Ichigyou, a girl with a cold personality who is often blunt with people, but shares his love for reading. Despite having similar interests, Naomi is afraid to approach Ruri due to her unfriendly nature.\r\nOne day, as Naomi goes out for a walk, a crimson aurora pierces through the sky for a brief moment before vanishing. Shortly after, he sees a three-legged crow and a mysterious hooded man who reveals himself to be Naomi from 10 years in the future, explaining that he has come to change an imminent tragic event that happens to Ruri shortly after they start dating. Initially taking his words with a grain of salt, present-day Naomi follows his future self\'s instructions and starts getting closer to Ruri, determined to save her.\r\nHello World focuses on the present Naomi alongs', 'active'),
('DVD6', 'https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcRYEIE3xmpWX2Ofm8EUuQUrW31XgzBg_FVsTUCVBGsmSNbvC2XSREQasO_WzdgEzZVRj897vf9LK05lErUW2bBLt2bKg7Ptyc0B80z6a_Lm&usqp=CAE', 'Peter Pan', 5, 4, 'Everyone knows Peter Pan as the boy who will never grow up. Writer/director P.J. Hogan\'s (MY BEST FRIEND\'S WEDDING) new live-action interpretation of the classic J.M. Barrie tale is surprisingly sentimental, imbuing Peter--played by the charming Jeremy Sumpter--with a sense of longing and a desire to be loved. The object of his affection is Wendy Darling (Rachel Hurd-Wood), a pre-teen in Edwardian London with a penchant for telling dazzling tales to her younger brothers. When Mr. Darling (Jason Isaacs, who doubles as a daunting Captain Hook) decides that Wendy should live with her Aunt Millicent (Lynn Redgrave) in order to become a proper lady, Peter takes the Darling children to Neverland, where all of the characters in Wendy\'s stories actually exist. The trio embarks on the adventure of a lifetime, flying through the skies, encountering nasty mermaids, and enduring Tinker Bell\'s (Ludivine Sagnier) hijinx. Along with the Lost Boys, the Darling children take on Captain Hook, Peter Pan\'', 'active');

-- --------------------------------------------------------

--
-- Table structure for table `pickup`
--

CREATE TABLE `pickup` (
  `CustomerName` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `phone_number` varchar(50) NOT NULL,
  `date_time` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pickup`
--

INSERT INTO `pickup` (`CustomerName`, `Address`, `phone_number`, `date_time`) VALUES
('raziela178@gmail.com', 'kelantan.', '01125711697', '2021-01-07T14:39'),
('raziela178@gmail.com', 'Tumpat,Kelantan.', '01125711697', '2021-01-28T06:38'),
('raziela178@gmail.com', 'Tumpat,Kelantan.', '01125711697', '2021-02-06T23:01'),
('raziela178@gmail.com', 'kelantan.', '01125711697', '2021-02-16T18:11');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `ItemID` varchar(10) NOT NULL,
  `UserID` varchar(50) NOT NULL,
  `Item_name` varchar(100) NOT NULL,
  `Item_type` varchar(50) NOT NULL,
  `status` varchar(20) NOT NULL,
  `return_method` varchar(20) DEFAULT NULL,
  `return_date` varchar(50) DEFAULT NULL,
  `end_date` varchar(50) NOT NULL,
  `start_date` varchar(50) NOT NULL,
  `item_price` double NOT NULL,
  `AdditionalCharges` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`ItemID`, `UserID`, `Item_name`, `Item_type`, `status`, `return_method`, `return_date`, `end_date`, `start_date`, `item_price`, `AdditionalCharges`) VALUES
('CA1', 'raziela178@gmail.com', 'Guardians Of The Galaxy Awesome Mix Vol. 2 Origina', 'cassete', 'approve', NULL, NULL, '2021-02-25T22:20', '2021-02-24T22:20', 20, NULL),
('DVD5', 'raziela178@gmail.com', 'HELLO WORLD THE MOVIE', 'dvd', 'approve', NULL, NULL, '2021-02-17T22:22', '2021-02-10T22:22', 8, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `user_profile`
--

CREATE TABLE `user_profile` (
  `password` varchar(20) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `phone_num` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_profile`
--

INSERT INTO `user_profile` (`password`, `fullname`, `address`, `phone_num`, `email`, `username`) VALUES
('admin123', 'ADMIN', '-', '-', 'AD_admin@gmail.com', 'admin'),
('raziela178', 'Raziela Binti Rosli', 'Pengkalan Kubor, Tumpat,Kelantan', '012-3456789', 'raziela178@gmail.com', 'Raziela'),
('zahfiah288', 'Nurul Zahfiah binti Mohd Hamzah', 'Kuala Lumpur', '2348233457', 'zahfiah288@gmail.com', 'zahfiah');

-- --------------------------------------------------------

--
-- Table structure for table `wishlist`
--

CREATE TABLE `wishlist` (
  `id` varchar(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `userID` varchar(50) NOT NULL,
  `price` double NOT NULL,
  `type` varchar(10) NOT NULL,
  `image` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `wishlist`
--

INSERT INTO `wishlist` (`id`, `name`, `userID`, `price`, `type`, `image`) VALUES
('CO1', 'Amazing Spider-Man (Vol. 1)', 'raziela178@gmail.com', 10, 'comic', 'https://cdn.shopify.com/s/files/1/0023/9278/4940/products/amazing-spider-man-vol-1-9780785166764-3827069714476_2000x.jpg?v=1598974037'),
('DVD1', 'Weathering With You / Tenki No Ko The Movie', 'raziela178@gmail.com', 15, 'dvd', 'https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcRHVnqHEQx7LognSNau9lPT6TaMnTwygTXhLFD5Afl1rbNL-_9krkUr_oLu8n5H0Lku2l-mSDdFLOOrkPIrsnM_LdSPQFZR_zkQqcbn1b46&usqp=CAE');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cassete`
--
ALTER TABLE `cassete`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `comic`
--
ALTER TABLE `comic`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `dvd`
--
ALTER TABLE `dvd`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pickup`
--
ALTER TABLE `pickup`
  ADD PRIMARY KEY (`CustomerName`,`date_time`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`ItemID`,`UserID`),
  ADD UNIQUE KEY `ItemID` (`ItemID`,`UserID`),
  ADD UNIQUE KEY `ItemID_2` (`ItemID`,`UserID`);

--
-- Indexes for table `user_profile`
--
ALTER TABLE `user_profile`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `wishlist`
--
ALTER TABLE `wishlist`
  ADD PRIMARY KEY (`id`,`userID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
