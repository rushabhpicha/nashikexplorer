package com.nashik.myNashik.Express;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

class express_databae extends SQLiteOpenHelper {
    private static final String DB_NAME = "ExpressTrain.db";
    private static final int DB_VERSION = 1065;
    private Context myContext;

    public express_databae(Context ctx) {
        super(ctx, DB_NAME, null, DB_VERSION);
        this.myContext = ctx;
    }

    public void onCreate(SQLiteDatabase db) {
        createTables(db);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < newVersion) {
            db.execSQL("DROP TABLE IF EXISTS express");
            createTables(db);
        }
    }
    public void createTables(SQLiteDatabase database) {
        try {
            System.out.println("Creating tables");
            database.execSQL("create table if not exists express (_id integer primary key autoincrement,trainid integer,trainname text, stationname TEXT, arrival TIME,dateplus integer,sun TEXT,mon TEXT,tue TEXT,wed TEXT,thu TEXT,fri TEXT,sat TEXT)");
            //#0099ccPanchavati Express 12110
                database.execSQL("insert into express values(1,12110,'Panchavti Exp','Manmad Junction','06:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(2,12110,'Panchavti Exp','Lasalgaon (LS)','06:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(3,12110,'Panchavti Exp','Nashik Road','07:07','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(4,12110,'Panchavti Exp','Devlali','07:16','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(5,12110,'Panchavti Exp','Igatpuri','07:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(6,12110,'Panchavti Exp','Kasara','08:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(7,12110,'Panchavti Exp','Kalyan Junction','09:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(8,12110,'Panchavti Exp','Dadar','10:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(9,12110,'Panchavti Exp','Mumbai CSMT','10:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            //Rajyarani 22101
                database.execSQL("insert into express values(10,22101,'Rajyarani Exp','Mumbai CSMT','18:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(11,22101,'Rajyarani Exp','Thane','19:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(12,22101,'Rajyarani Exp','Kalyan Junction','19:43','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(13,22101,'Rajyarani Exp','Kasara','20:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(14,22101,'Rajyarani Exp','Igatpuri','21:18','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(15,22101,'Rajyarani Exp','Devlali','22:03','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(16,22101,'Rajyarani Exp','Nashik Road','22:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
                database.execSQL("insert into express values(17,22101,'Rajyarani Exp','Manmad Junction','23:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");

            //CSMT Garibrath- 02187
                database.execSQL("insert into express values(26,02187,'CSMT Garibrath','Jabalpur','19:30','0','-','-','-','Wed','-','-','-')");
                database.execSQL("insert into express values(27,02187,'CSMT Garibrath','Narsinghpur','20:39','0','-','-','-','Wed','-','-','-')");
                database.execSQL("insert into express values(28,02187,'CSMT Garibrath','Pipariya','21:45','0','-','-','-','Wed','-','-','-')");
                database.execSQL("insert into express values(29,02187,'CSMT Garibrath','Itarasi Junction','23:35','0','-','-','-','Wed','-','-','-')");
                database.execSQL("insert into express values(30,02187,'CSMT Garibrath','Harda','00:43','1','-','-','-','Wed','-','-','-')");
                database.execSQL("insert into express values(31,02187,'CSMT Garibrath','Khandwa','02:30','1','-','-','-','Wed','-','-','-')");
                database.execSQL("insert into express values(32,02187,'CSMT Garibrath','Bhusaval Junction','04:15','1','-','-','-','Wed','-','-','-')");
                database.execSQL("insert into express values(33,02187,'CSMT Garibrath','Jalgaon Junction','04:50','1','-','-','-','Wed','-','-','-')");
                database.execSQL("insert into express values(34,02187,'CSMT Garibrath','Manmad Junction','06:50','1','-','-','-','Wed','-','-','-')");
                database.execSQL("insert into express values(35,02187,'CSMT Garibrath','Nashik Road','07:48','1','-','-','-','Wed','-','-','-')");
                database.execSQL("insert into express values(36,02187,'CSMT Garibrath','Igatpuri','09:08','1','-','-','-','Wed','-','-','-')");
                database.execSQL("insert into express values(37,02187,'CSMT Garibrath','Kalyan Junction','10:55','1','-','-','-','Wed','-','-','-')");
                database.execSQL("insert into express values(38,02187,'CSMT Garibrath','Dadar','11:53','1','-','-','-','Wed','-','-','-')");
                database.execSQL("insert into express values(39,02187,'CSMT Garibrath','Mumbai CSMT','12:15','1','-','-','-','Wed','-','-','-')");
            //JBP Garibrath- 02188
                database.execSQL("insert into express values(40,02188,'JBP Garibrath','Mumbai CSMT','01:30','0','-','-','-','-','Thu','-','-')");
                database.execSQL("insert into express values(41,02188,'JBP Garibrath','Dadar','13:43','0','-','-','-','-','Thu','-','-')");
                database.execSQL("insert into express values(42,02188,'JBP Garibrath','Kalyan Junction','14:22','0','-','-','-','-','Thu','-','-')");
                database.execSQL("insert into express values(43,02188,'JBP Garibrath','Igatpuri','16:03','0','-','-','-','-','Thu','-','-')");
                database.execSQL("insert into express values(44,02188,'JBP Garibrath','Nashik Road','16:58','0','-','-','-','-','Thu','-','-')");
                database.execSQL("insert into express values(45,02188,'JBP Garibrath','Manmad Junction','18:00','0','-','-','-','-','Thu','-','-')");
                database.execSQL("insert into express values(46,02188,'JBP Garibrath','Jalgaon Junction','19:58','0','-','-','-','-','Thu','-','-')");
                database.execSQL("insert into express values(47,02188,'JBP Garibrath','Bhusaval Junction','20:35','0','-','-','-','-','Thu','-','-')");
                database.execSQL("insert into express values(48,02188,'JBP Garibrath','Khandwa','23:30','0','-','-','-','-','Thu','-','-')");
                database.execSQL("insert into express values(49,02188,'JBP Garibrath','Harda','00:43','1','-','-','-','-','Thu','-','-')");
                database.execSQL("insert into express values(50,02188,'JBP Garibrath','Itarasi Junction','02:00','1','-','-','-','-','Thu','-','-')");
                database.execSQL("insert into express values(51,02188,'JBP Garibrath','Pipariya','03:03','1','-','-','-','-','Thu','-','-')");
                database.execSQL("insert into express values(52,02188,'JBP Garibrath','Narsinghpur','04:08','1','-','-','-','-','Thu','-','-')");
                database.execSQL("insert into express values(53,02188,'JBP Garibrath','Jabalpur','06:00','1','-','-','-','-','Thu','-','-')");
    //ALD NDLS SF Spl- 04111
                database.execSQL("insert into express values(54,04111,'ALD NDLS SF Spl','Lokmanya Tilak T(LTT)','15:50','0','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(55,04111,'ALD NDLS SF Spl','Kalyan Junction','16:30','0','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(56,04111,'ALD NDLS SF Spl','Igatpuri','18:20','0','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(57,04111,'ALD NDLS SF Spl','Nashik Road','20:28','0','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(58,04111,'ALD NDLS SF Spl','Manmad Junction','22:15','0','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(59,04111,'ALD NDLS SF Spl','Bhusaval Junction','00:50','1','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(60,04111,'ALD NDLS SF Spl','Khandwa','03:00','1','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(61,04111,'ALD NDLS SF Spl','Itarasi Junction','06:10','1','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(62,04111,'ALD NDLS SF Spl','Bhopal Junction','08:45','1','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(63,04111,'ALD NDLS SF Spl','Bina Junction','11:15','1','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(64,04111,'ALD NDLS SF Spl','Lalitpur','12:04','1','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(65,04111,'ALD NDLS SF Spl','Babina','12:49','1','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(66,04111,'ALD NDLS SF Spl','Jhansi Junction','13:55','1','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(67,04111,'ALD NDLS SF Spl','Datia','14:27','1','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(68,04111,'ALD NDLS SF Spl','Dabra','14:52','1','Mon','Tue','-','-','-','-','-')");
                database.execSQL("insert into express values(69,04111,'ALD NDLS SF Spl','Gwalior','15:35','1','Mon','Tue','-','-','-','-','-')");
            //Tapovan Express
            database.execSQL("insert into express values(70,17617,'Tapovan Express','Mumbai CSMT','06:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(71,17617,'Tapovan Express','Dadar','06:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(72,17617,'Tapovan Express','Thane','06:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(74,17617,'Tapovan Express','Kalyan Junction','07:07','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(75,17617,'Tapovan Express','Kasara','08:24','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(76,17617,'Tapovan Express','Igatpuri','08:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(77,17617,'Tapovan Express','Devlali','09:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(78,17617,'Tapovan Express','Nashik Road','09:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(79,17617,'Tapovan Express','Niphad','10:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(80,17617,'Tapovan Express','Lasalgaon','10:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(81,17617,'Tapovan Express','Manmad Junction','11:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(82,17617,'Tapovan Express','Rotegaon','12:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(83,17617,'Tapovan Express','Lasur','12:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(84,17617,'Tapovan Express','Aurangabad','13:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(85,17617,'Tapovan Express','Jalna','14:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(86,17617,'Tapovan Express','Partur','15:03','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(87,17617,'Tapovan Express','Selu','15:27','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(88,17617,'Tapovan Express','Manwath Road','15:39','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(89,17617,'Tapovan Express','Parbhani Junction','16:18','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(90,17617,'Tapovan Express','Purna Junction','16:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(91,17617,'Tapovan Express','Hazur Sahib Nanded','18:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(92,17618,'Tapovan Express','Hazur Sahib Nanded','10:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(93,17618,'Tapovan Express','Purna Junction','10:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(94,17618,'Tapovan Express','Parbhani Junction','11:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(95,17618,'Tapovan Express','Manwath Road','11:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(96,17618,'Tapovan Express','Selu','11:54','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(97,17618,'Tapovan Express','Partur','12:14','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(98,17618,'Tapovan Express','Jalna','13:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(99,17618,'Tapovan Express','Aurangabad','14:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(100,17618,'Tapovan Express','Lasur','14:59','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(101,17618,'Tapovan Express','Rotegaon','15:29','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(102,17618,'Tapovan Express','Manmad Junction','16:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(103,17618,'Tapovan Express','Lasalgaon','17:19','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(104,17618,'Tapovan Express','Niphad','17:29','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(105,17618,'Tapovan Express','Nashik Road','17:57','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(106,17618,'Tapovan Express','Devlali','18:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(107,17618,'Tapovan Express','Igatpuri','19:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(108,17618,'Tapovan Express','Kalyan Junction','20:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(109,17618,'Tapovan Express','Thane','21:03','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(110,17618,'Tapovan Express','Dadar','21:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(4001,17618,'Tapovan Express','Mumbai CSMT','21:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            //Devagiri Express
            database.execSQL("insert into express values(111,17058,'Devagiri Express (PT)','Secunderabad Junction','12:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(112,17058,'Devagiri Express (PT)','Bolarum','12:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(113,17058,'Devagiri Express (PT)','Mirzapalli','13:16','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(114,17058,'Devagiri Express (PT)','Akanapet','13:24','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(115,17058,'Devagiri Express (PT)','Kamareddi','14:03','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(116,17058,'Devagiri Express (PT)','Nizamabad Junction','15:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(117,17058,'Devagiri Express (PT)','Basar','15:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(118,17058,'Devagiri Express (PT)','Dharmabad','15:46','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(119,17058,'Devagiri Express (PT)','Umri','16:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(120,17058,'Devagiri Express (PT)','Mudkhed Junction','17:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(121,17058,'Devagiri Express (PT)','Hazur Sahib Nanded','18:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(122,17058,'Devagiri Express (PT)','Purna Junction','18:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(123,17058,'Devagiri Express (PT)','Parbhani Junction','19:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(124,17058,'Devagiri Express (PT)','Manwath Road','19:54','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(125,17058,'Devagiri Express (PT)','Selu','20:19','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(126,17058,'Devagiri Express (PT)','Partur','20:49','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(127,17058,'Devagiri Express (PT)','Jalna','22:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(128,17058,'Devagiri Express (PT)','Aurangabad','23:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(129,17058,'Devagiri Express (PT)','Lasur','23:49','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(130,17058,'Devagiri Express (PT)','Rotegaon','00:19','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(131,17058,'Devagiri Express (PT)','Manmad Junction','01:40','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(132,17058,'Devagiri Express (PT)','Lasalgaon','02:13','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(133,17058,'Devagiri Express (PT)','Nashik Road','02:55','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(134,17058,'Devagiri Express (PT)','Devlali','03:08','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(135,17058,'Devagiri Express (PT)','Igatpuri','04:10','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(136,17058,'Devagiri Express (PT)','Kalyan Junction','05:47','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(137,17058,'Devagiri Express (PT)','Thane','06:13','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(138,17058,'Devagiri Express (PT)','Dadar','06:37','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(123111,17058,'Devagiri Express (PT)','Mumbai CSMT','07:10','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");



        //Janshatabdi Express


            database.execSQL("insert into express values(162,11401,'Nandigram Express','Mumbai CSMT','16:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(163,11401,'Nandigram Express','Dadar','16:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(164,11401,'Nandigram Express','Thane','17:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(165,11401,'Nandigram Express','Kalyan Junction','17:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(166,11401,'Nandigram Express','Kasara','18:37','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(167,11401,'Nandigram Express','Igatpuri','19:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(168,11401,'Nandigram Express','Nashik Road','19:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(169,11401,'Nandigram Express','Manmad Junction','21:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(170,11401,'Nandigram Express','Nagarsol','22:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(171,11401,'Nandigram Express','Rotegaon','22:44','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(172,11401,'Nandigram Express','Lasur','23:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(173,11401,'Nandigram Express','Aurangabad','23:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(174,11401,'Nandigram Express','Jalna','01:00','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(175,11401,'Nandigram Express','Partur','01:39','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(176,11401,'Nandigram Express','Selu','02:04','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(177,11401,'Nandigram Express','Manwath Road','02:19','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(178,11401,'Nandigram Express','Parbhani Junction','03:13','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(179,11401,'Nandigram Express','Purna Junction','03:48','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(180,11401,'Nandigram Express','Hazur Sahib Nanded','05:10','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(181,11401,'Nandigram Express','Mudkhed Junction','05:48','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(182,11401,'Nandigram Express','Bhokar','06:09','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(183,11401,'Nandigram Express','Himayatnagar','06:54','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(184,11401,'Nandigram Express','Sahasrakund','07:09','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(185,11401,'Nandigram Express','Kinwat','08:09','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(186,11401,'Nandigram Express','Adilabad','09:25','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(187,11401,'Nandigram Express','Pimpal Khuti','10:20','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(188,11401,'Nandigram Express','Lingti','11:11','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(189,11401,'Nandigram Express','Kayar','12:03','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(190,11401,'Nandigram Express','Wani','12:44','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(191,11401,'Nandigram Express','Majri Junction','13:28','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(192,11401,'Nandigram Express','Warora','13:43','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(193,11401,'Nandigram Express','Hinganghat','14:18','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(194,11401,'Nandigram Express','Sewagram Junction','14:59','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(195,11401,'Nandigram Express','Nagpur Junction','16:15','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(196,11402,'Nandigram Express','Nagpur Junction','06:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(197,11402,'Nandigram Express','Sewagram Junction','07:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(198,11402,'Nandigram Express','Hinganghat','07:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(199,11402,'Nandigram Express','Warora','08:14','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(200,11402,'Nandigram Express','Majri Junction','08:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(201,11402,'Nandigram Express','Wani','09:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(202,11402,'Nandigram Express','Kayar','10:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(203,11402,'Nandigram Express','Lingti','10:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(204,11402,'Nandigram Express','Pimpal Khuti','12:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(205,11402,'Nandigram Express','Adilabad','12:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(206,11402,'Nandigram Express','Kinwat','13:24','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(207,11402,'Nandigram Express','Sahasrakund','14:29','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(208,11402,'Nandigram Express','Himayatnagar','14:44','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(209,11402,'Nandigram Express','Bhokar','15:29','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(210,11402,'Nandigram Express','Mudkhed Junction','16:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(211,11402,'Nandigram Express','Hazur Sahib Nanded','16:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(212,11402,'Nandigram Express','Purna Junction','17:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(213,11402,'Nandigram Express','Parbhani Junction','18:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(214,11402,'Nandigram Express','Manwath Road','18:34','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(215,11402,'Nandigram Express','Selu','18:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(216,11402,'Nandigram Express','Partur','19:24','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(217,11402,'Nandigram Express','Jalna','20:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(218,11402,'Nandigram Express','Aurangabad','21:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(219,11402,'Nandigram Express','Lasur','22:09','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(220,11402,'Nandigram Express','Rotegaon','22:39','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(221,11402,'Nandigram Express','Nagarsol','23:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(222,11402,'Nandigram Express','Manmad Junction','00:20','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(223,11402,'Nandigram Express','Nashik Road','01:25','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(224,11402,'Nandigram Express','Igatpuri','02:35','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(225,11402,'Nandigram Express','Kalyan Junction','04:16','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(226,11402,'Nandigram Express','Thane','04:38','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(227,11402,'Nandigram Express','Dadar','05:07','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(228,11402,'Nandigram Express','Mumbai CSMT','05:35','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");



            //NDLS ALD SF Spl- 04112

            database.execSQL("insert into express values(229,04112,'NDLS ALD SF Spl','Gwalior','15:00','0','-','Tue','Wed','-','-','-','-')");
            database.execSQL("insert into express values(230,04112,'NDLS ALD SF Spl','Dabra','15:36','0','-','Tue','Wed','-','-','-','-')");
            database.execSQL("insert into express values(231,04112,'NDLS ALD SF Spl','Datia','16:05','0','-','Tue','Wed','-','-','-','-')");
            database.execSQL("insert into express values(232,04112,'NDLS ALD SF Spl','Jhansi Junction','16:35','0','-','Tue','Wed','-','-','-','-')");
            database.execSQL("insert into express values(233,04112,'NDLS ALD SF Spl','Babina','17:10','0','-','Tue','Wed','-','-','-','-')");
            database.execSQL("insert into express values(234,04112,'NDLS ALD SF Spl','Lalitpur','17:56','0','-','Tue','Wed','-','-','-','-')");
            database.execSQL("insert into express values(235,04112,'NDLS ALD SF Spl','Bina Junction','19:15','0','-','Tue','Wed','-','-','-','-')");
            database.execSQL("insert into express values(236,04112,'NDLS ALD SF Spl','Bhopal Junction','21:50','0','-','Tue','Wed','-','-','-','-')");
            database.execSQL("insert into express values(237,04112,'NDLS ALD SF Spl','Itarasi Junction','23:45','0','-','Tue','Wed','-','-','-','-')");
            database.execSQL("insert into express values(238,04112,'NDLS ALD SF Spl','Khandwa','02:30','1','-','Tue','Wed','-','-','-','-')");
            database.execSQL("insert into express values(239,04112,'NDLS ALD SF Spl','Bhusaval Junction','04:15','1','-','Tue','wed','-','-','-','-')");
            database.execSQL("insert into express values(240,04112,'NDLS ALD SF Spl','Manmad Junction','06:50','1','-','Tue','Wed','-','-','-','-')");
            database.execSQL("insert into express values(241,04112,'NDLS ALD SF Spl','Nashik Road','07:49','1','-','Tue','Wed','-','-','-','-')");
            database.execSQL("insert into express values(242,04112,'NDLS ALD SF Spl','Igatpuri','09:10','1','-','Tue','Wed','-','-','-','-')");
            database.execSQL("insert into express values(243,04112,'NDLS ALD SF Spl','Kalyan Junction','10:55','1','-','Tue','Wed','-','-','-','-')");
            database.execSQL("insert into express values(244,04112,'NDLS ALD SF Spl','Lokmanya Tilak T(LTT)','12:05','1','-','Tue','Wed','-','-','-','-')");

            //GKP LTT Spl- 05041

            database.execSQL("insert into express values(245,05041,'GKP LTT Spl','Gorakhpur Junction','11:00','0','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(246,05041,'GKP LTT Spl','Khalilabad','11:37','0','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(247,05041,'GKP LTT Spl','Basti','12:05','0','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(248,05041,'GKP LTT Spl','Babhnan','12:35','0','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(249,05041,'GKP LTT Spl','Gonda Junction','13:55','0','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(250,05041,'GKP LTT Spl','Jarwal Road','14:36','0','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(251,05041,'GKP LTT Spl','Lucknow Nr','16:05','0','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(252,05041,'GKP LTT Spl','Knapur Central','17:55','0','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(253,05041,'GKP LTT Spl','Pokhrayan','19:00','0','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(254,05041,'GKP LTT Spl','Orai','19:35','0','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(255,05041,'GKP LTT Spl','Jhansi Junction','22:00','0','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(256,05041,'GKP LTT Spl','Lalitpur','23:40','0','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(257,05041,'GKP LTT Spl','Bina Junction','01:30','1','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(258,05041,'GKP LTT Spl','Bhopal Junction','03:50','1','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(259,05041,'GKP LTT Spl','Itarasi Junction','05:40','1','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(260,05041,'GKP LTT Spl','Khandwa','08:35','1','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(261,05041,'GKP LTT Spl','Bhusaval Junction','10:20','1','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(262,05041,'GKP LTT Spl','Jalgaon Junction','10:52','1','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(263,05041,'GKP LTT Spl','Manmad Junction','12:35','1','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(264,05041,'GKP LTT Spl','Nashik Road','13:30','1','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(265,05041,'GKP LTT Spl','Igatpuri','14:40','1','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(266,05041,'GKP LTT Spl','Kalyan Junction','16:38','1','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(267,05041,'GKP LTT Spl','Thane','17:00','1','-','-','-','-','-','Sat','-')");
            database.execSQL("insert into express values(268,05041,'GKP LTT Spl','Lokmanya Tilak T(LTT)','17:50','1','-','-','-','-','-','Sat','-')");


//LTT ALD Express- 12563

            database.execSQL("insert into express values(269,12563,'LTT ALD Express','Lokmanya Tilak T(LTT)','14:30','0','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(270,12563,'LTT ALD Express','Kalyan Junction','15:05','0','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(271,12563,'LTT ALD Express','Nashik Road','17:53','0','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(272,12563,'LTT ALD Express','Jalgaon Junction','20:23','0','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(273,12563,'LTT ALD Express','Itarasi Junction','01:20','1','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(274,12563,'LTT ALD Express','Jabalpur','04:40','1','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(275,12563,'LTT ALD Express','Katni','05:55','1','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(276,12563,'LTT ALD Express','Satna','07:40','1','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(277,12563,'LTT ALD Express','Manikpur Junction','09:45','1','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(278,12563,'LTT ALD Express','Allahabad Junction','11:40','1','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(279,12563,'LTT ALD Express','Janghai Junction','13:03','1','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(280,12563,'LTT ALD Express','Zafarabad Junction','13:53','1','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(281,12563,'LTT ALD Express','Jaunpur Junction','14:43','1','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(282,12563,'LTT ALD Express','Shahganj Junction','15:18','1','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(283,12563,'LTT ALD Express','Akbarpur','15:58','1','Mon','-','-','-','-','-','-')");
            database.execSQL("insert into express values(284,12563,'LTT ALD Express','Faizabad Junction','17:50','1','Mon','-','-','-','-','-','-')");

//GR BPL Special- 01221

            database.execSQL("insert into express values(285,01221,'GR BPL Special','Lokmanya Tilak T(LTT)','11:25','0','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(286,01221,'GR BPL Special','Kalyan Junction','12:05','0','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(287,01221,'GR BPL Special','Nashik Road','15:05','0','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(288,01221,'GR BPL Special','Bhusaval Junction','18:30','0','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(289,01221,'GR BPL Special','Akola Junction','20:35','0','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(290,01221,'GR BPL Special','Badnera Junction','22:30','0','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(291,01221,'GR BPL Special','Nagpur Junction','01:25','1','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(292,01221,'GR BPL Special','Gondia Junction','03:11','1','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(293,01221,'GR BPL Special','Durg','05:10','1','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(294,01221,'GR BPL Special','Raipur Junction','05:50','1','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(295,01221,'GR BPL Special','Bilaspur Junction','07:45','1','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(296,01221,'GR BPL Special','Jharsuguda Junction','10:55','1','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(297,01221,'GR BPL Special','Rourkela','12:12','1','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(298,01221,'GR BPL Special','Chakradharpur','13:43','1','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(299,01221,'GR BPL Special','Tatanagar Junction','14:50','1','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(300,01221,'GR BPL Special','Kharagpur Junction','16:45','1','-','-','-','-','Fri','-','-')");
            database.execSQL("insert into express values(301,01221,'GR BPL Special','Santragachi Junction','18:50','1','-','-','-','-','Fri','-','-')");


//SRC LTT Special- 01222

            database.execSQL("insert into express values(302,01222,'SRC LTT Special','Santragachi Junction','13:00','0','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(303,01222,'SRC LTT Special','Kharagpur Junction','14:30','0','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(304,01222,'SRC LTT Special','Tatanagar Junction','16:20','0','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(305,01222,'SRC LTT Special','Chakradharpur','17:35','0','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(306,01222,'SRC LTT Special','Rourkela','19:05','0','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(307,01222,'SRC LTT Special','Jharsuguda Junction','21:58','0','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(308,01222,'SRC LTT Special','Bilaspur Junction','01:10','1','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(309,01222,'SRC LTT Special','Raipur Junction','03:15','1','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(310,01222,'SRC LTT Special','Durg','04:25','1','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(311,01222,'SRC LTT Special','Gondia Junction','07:00','1','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(312,01222,'SRC LTT Special','Nagpur Junction','08:40','1','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(313,01222,'SRC LTT Special','Badnera Junction','11:30','1','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(314,01222,'SRC LTT Special','Akola Junction','12:30','1','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(315,01222,'SRC LTT Special','Bhusaval Junction','15:00','1','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(316,01222,'SRC LTT Special','Nashik Road','19:10','1','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(317,01222,'SRC LTT Special','Kalyan Junction','22:05','1','-','-','-','Thu','-','-','-')");
            database.execSQL("insert into express values(318,01222,'SRC LTT Special','Lokmanya Tilak T(LTT)','23:15','1','-','-','-','Thu','-','-','-')");

//KWV DD Special- 01304

            database.execSQL("insert into express values(319,01304,'KWV DD Special','Nagpur Junction','16:15','0','Mon','Tue','Wed','Thu','Fri','Sat','Sun')");
            database.execSQL("insert into express values(320,01304,'KWV DD Special','Wardha Junction','17:22','0','Mon','Tue','Wed','Thu','Fri','Sat','Sun')");
            database.execSQL("insert into express values(321,01304,'KWV DD Special','Dhamangaon','18:05','0','Mon','Tue','Wed','Thu','Fri','Sat','Sun')");
            database.execSQL("insert into express values(322,01304,'KWV DD Special','Badnera Junction','19:40','0','Mon','Tue','Wed','Thu','Fri','Sat','Sun')");
            database.execSQL("insert into express values(323,01304,'KWV DD Special','Akola Junction','20:40','0','Mon','Tue','Wed','Thu','Fri','Sat','Sun')");
            database.execSQL("insert into express values(324,01304,'KWV DD Special','Malkapur','22:20','0','Mon','Tue','Wed','Thu','Fri','Sat','Sun')");
            database.execSQL("insert into express values(325,01304,'KWV DD Special','Bhusaval Junction','23:20','0','Mon','Tue','Wed','Thu','Fri','Sat','Sun')");
            database.execSQL("insert into express values(326,01304,'KWV DD Special','Jalgaon Junction','23:55','0','Mon','Tue','Wed','Thu','Fri','Sat','Sun')");
            database.execSQL("insert into express values(327,01304,'KWV DD Special','Manmad Junction','01:45','1','Mon','Tue','Wed','Thu','Fri','Sat','Sun')");
            database.execSQL("insert into express values(328,01304,'KWV DD Special','Nashik Road','02:42','1','Mon','Tue','Wed','Thu','Fri','Sat','Sun')");
            database.execSQL("insert into express values(329,01304,'KWV DD Special','Igatpuri','04:50','1','Mon','Tue','Wed','Thu','Fri','Sat','Sun')");
            database.execSQL("insert into express values(330,01304,'KWV DD Special','Kalyan Junction','07:08','1','Mon','Tue','Wed','Thu','Fri','Sat','Sun')");
            database.execSQL("insert into express values(331,01304,'KWV DD Special','Thane','07:25','1','Mon','Tue','Wed','Thu','Fri','Sat','Sun')");
            database.execSQL("insert into express values(332,01304,'KWV DD Special','Lokmanya Tilak T(LTT)','08:15','1','Mon','Tue','Wed','Thu','Fri','Sat','Sun')");

//BSB CSMT Special- 01080

            database.execSQL("insert into express values(333,01080,'BSB CSMT Special','Varanasi Junction','18:45','0','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(334,01080,'BSB CSMT Special','Mirzapur','20:07','0','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(335,01080,'BSB CSMT Special','Cheoki','22:15','0','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(336,01080,'BSB CSMT Special','Manikpur Junction','23:53','0','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(337,01080,'BSB CSMT Special','Satna','01:10','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(338,01080,'BSB CSMT Special','Maihar','01:48','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(339,01080,'BSB CSMT Special','Katni','02:45','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(340,01080,'BSB CSMT Special','Jabalpur','04:10','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(341,01080,'BSB CSMT Special','Narsinghpur','05:30','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(342,01080,'BSB CSMT Special','Pipariya','06:40','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(343,01080,'BSB CSMT Special','Itarasi Junction','09:25','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(344,01080,'BSB CSMT Special','Khandwa','12:15','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(345,01080,'BSB CSMT Special','Bhusaval Junction','14:00','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(346,01080,'BSB CSMT Special','Jalgaon Junction','14:32','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(347,01080,'BSB CSMT Special','Manmad Junction','16:22','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(348,01080,'BSB CSMT Special','Nashik Road','17:30','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(349,01080,'BSB CSMT Special','Igatpuri','20:20','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(350,01080,'BSB CSMT Special','Kalyan Junction','22:05','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(351,01080,'BSB CSMT Special','Thane','22:38','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(352,01080,'BSB CSMT Special','Dadar','22:55','1','-','-','-','-','-','-','Sun')");
            database.execSQL("insert into express values(353,01080,'BSB CSMT Special','Mumbai CST(CSMT)','23:30','1','-','-','-','-','-','-','Sun')");

            database.execSQL("insert into express values(354,17057,'Devagiri Express (PT)','Mumbai CSMT','21:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(355,17057,'Devagiri Express (PT)','Dadar','21:22','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(356,17057,'Devagiri Express (PT)','Thane','21:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(357,17057,'Devagiri Express (PT)','Kalyan Junction','22:07','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(358,17057,'Devagiri Express (PT)','Kasara','23:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(359,17057,'Devagiri Express (PT)','Igatpuri','23:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(360,17057,'Devagiri Express (PT)','Devlali','00:28','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(361,17057,'Devagiri Express (PT)','Nashik Road','00:38','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(362,17057,'Devagiri Express (PT)','Lasalgaon','01:08','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(363,17057,'Devagiri Express (PT)','Manmad Junction','01:55','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(364,17057,'Devagiri Express (PT)','Rotegaon','03:09','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(365,17057,'Devagiri Express (PT)','Lasur','03:34','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(366,17057,'Devagiri Express (PT)','Aurangabad','04:05','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(367,17057,'Devagiri Express (PT)','Jalna','04:58','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(368,17057,'Devagiri Express (PT)','Partur','05:39','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(369,17057,'Devagiri Express (PT)','Selu','06:04','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(370,17057,'Devagiri Express (PT)','Manwath Road','06:19','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(371,17057,'Devagiri Express (PT)','Parbhani Junction','07:10','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(372,17057,'Devagiri Express (PT)','Purna Junction','08:00','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(373,17057,'Devagiri Express (PT)','Hazur Sahib Nanded','08:40','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(374,17057,'Devagiri Express (PT)','Mudkhed Junction','09:23','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(375,17057,'Devagiri Express (PT)','Umri','09:43','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(376,17057,'Devagiri Express (PT)','Dharmabad','10:11','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(377,17057,'Devagiri Express (PT)','Basar','10:30','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(378,17057,'Devagiri Express (PT)','Nizamabad Junction','11:00','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(379,17057,'Devagiri Express (PT)','Kamareddi','11:50','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(380,17057,'Devagiri Express (PT)','Akanapet','12:19','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(381,17057,'Devagiri Express (PT)','Mirzapalli','12:27','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(382,17057,'Devagiri Express (PT)','Bolarum','13:29','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(383,17057,'Devagiri Express (PT)','Secunderabad Junction','14:30','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");

            database.execSQL("insert into express values(384,11201,'Mumbai LTT - Ajni Express  ','Lokmanya Tilak Terminus','16:40','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(385,11201,'Mumbai LTT - Ajni Express  ','Thane','16:58','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(386,11201,'Mumbai LTT - Ajni Express  ','Kalyan Junction','17:17','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(387,11201,'Mumbai LTT - Ajni Express  ','Igatpuri','19:53','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(388,11201,'Mumbai LTT - Ajni Express  ','Devlali','20:30','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(389,11201,'Mumbai LTT - Ajni Express  ','Nashik Road','20:43','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(390,11201,'Mumbai LTT - Ajni Express  ','Manmad Junction','22:10','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(391,11201,'Mumbai LTT - Ajni Express  ','Rotegaon','22:49','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(392,11201,'Mumbai LTT - Ajni Express  ','Lasur','23:09','0','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(393,11201,'Mumbai LTT - Ajni Express  ','Aurangabad','00:25','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(394,11201,'Mumbai LTT - Ajni Express  ','Jalna','01:30','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(395,11201,'Mumbai LTT - Ajni Express  ','Partur','01:58','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(396,11201,'Mumbai LTT - Ajni Express  ','Selu','02:28','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(397,11201,'Mumbai LTT - Ajni Express  ','Parbhani Junction','04:00','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(398,11201,'Mumbai LTT - Ajni Express  ','Purna Junction','05:00','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(399,11201,'Mumbai LTT - Ajni Express  ','Basmat','05:33','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(400,11201,'Mumbai LTT - Ajni Express  ','Hingoli Deccan','06:19','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(401,11201,'Mumbai LTT - Ajni Express  ','Washim','07:19','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(402,11201,'Mumbai LTT - Ajni Express  ','Akola Junction','09:15','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(403,11201,'Mumbai LTT - Ajni Express  ','Murtizapur Junction','09:58','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(404,11201,'Mumbai LTT - Ajni Express  ','Badnera Junction','10:50','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(405,11201,'Mumbai LTT - Ajni Express  ','Chandur','11:25','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(406,11201,'Mumbai LTT - Ajni Express  ','Dhamangaon','11:40','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(407,11201,'Mumbai LTT - Ajni Express  ','Pulgaon Junction','11:57','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(408,11201,'Mumbai LTT - Ajni Express  ','Wardha Junction','12:32','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(409,11201,'Mumbai LTT - Ajni Express  ','Ajni','14:15','1','-','Mon','-','-','-','-','-')");
            database.execSQL("insert into express values(410,11202,'Ajni - Mumbai LTT Express ','Ajni','16:15','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(411,11202,'Ajni - Mumbai LTT Express ','Wardha Junction','17:10','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(412,11202,'Ajni - Mumbai LTT Express ','Pulgaon Junction','17:36','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(413,11202,'Ajni - Mumbai LTT Express ','Dhamangaon','18:05','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(414,11202,'Ajni - Mumbai LTT Express ','Chandur','18:22','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(415,11202,'Ajni - Mumbai LTT Express ','Badnera Junction','19:30','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(416,11202,'Ajni - Mumbai LTT Express ','Murtizapur Junction','20:08','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(417,11202,'Ajni - Mumbai LTT Express ','Akola Junction','21:25','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(418,11202,'Ajni - Mumbai LTT Express ','Washim','22:49','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(419,11202,'Ajni - Mumbai LTT Express ','Hingoli Deccan','23:39','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(420,11202,'Ajni - Mumbai LTT Express ','Basmat','00:38','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(421,11202,'Ajni - Mumbai LTT Express ','Purna Junction','01:20','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(422,11202,'Ajni - Mumbai LTT Express ','Parbhani Junction','02:30','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(423,11202,'Ajni - Mumbai LTT Express ','Selu','03:28','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(424,11202,'Ajni - Mumbai LTT Express ','Partur','04:03','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(425,11202,'Ajni - Mumbai LTT Express ','Jalna','04:58','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(426,11202,'Ajni - Mumbai LTT Express ','Aurangabad','06:25','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(427,11202,'Ajni - Mumbai LTT Express ','Lasur','06:53','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(428,11202,'Ajni - Mumbai LTT Express ','Rotegaon','07:18','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(429,11202,'Ajni - Mumbai LTT Express ','Manmad Junction','08:45','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(430,11202,'Ajni - Mumbai LTT Express ','Nashik Road','09:48','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(431,11202,'Ajni - Mumbai LTT Express ','Devlali','09:58','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(432,11202,'Ajni - Mumbai LTT Express ','Igatpuri','11:08','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(433,11202,'Ajni - Mumbai LTT Express ','Kalyan Junction','12:37','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(434,11202,'Ajni - Mumbai LTT Express ','Thane','13:03','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(435,11202,'Ajni - Mumbai LTT Express ','Lokmanya Tilak Terminus','13:45','1','-','-','-','-','-','Fri','-')");

            database.execSQL("insert into express values(436,12071,'Dadar - Jalna Jan Shatabdi Express','Dadar','14:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(437,12071,'Dadar - Jalna Jan Shatabdi Express','Thane','14:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(438,12071,'Dadar - Jalna Jan Shatabdi Express','Kalyan Junction','14:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(439,12071,'Dadar - Jalna Jan Shatabdi Express','Nashik Road','17:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(440,12071,'Dadar - Jalna Jan Shatabdi Express','Manmad Junction','18:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(441,12071,'Dadar - Jalna Jan Shatabdi Express','Aurangabad','20:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(442,12071,'Dadar - Jalna Jan Shatabdi Express','Jalna','21:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(443,12072,'Jalna - Dadar Jan Shatabdi Express','Jalna','04:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(444,12072,'Jalna - Dadar Jan Shatabdi Express','Aurangabad','05:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(445,12072,'Jalna - Dadar Jan Shatabdi Express','Manmad Junction','07:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(446,12072,'Jalna - Dadar Jan Shatabdi Express','Nashik Road','08:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(447,12072,'Jalna - Dadar Jan Shatabdi Express','Kalyan Junction','11:27','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(448,12072,'Jalna - Dadar Jan Shatabdi Express','Thane','11:47','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(449,12072,'Jalna - Dadar Jan Shatabdi Express','Dadar','12:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");

            //Rajyarani Express
            database.execSQL("insert into express values(450,22102,'Rajyarani Exp','Manmad Junction','05:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(451,22102,'Rajyarani Exp','Nashik Road','06:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(452,22102,'Rajyarani Exp','Devlali','06:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(453,22102,'Rajyarani Exp','Igatpuri','07:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(454,22102,'Rajyarani Exp','Kasara','07:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(455,22102,'Rajyarani Exp','Kalyan Junction','08:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(456,22102,'Rajyarani Exp','Thane','09:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(457,22102,'Rajyarani Exp','Mumbai CSMT','10:07','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");

            //Mumbai- CST Gorakhpur Special

            database.execSQL("insert into express values(458,01077,'Mumbai- CSMT Gorakhpur Special','Mumbai CSMT','12:25','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(459,01077,'Mumbai- CSMT Gorakhpur Special','Dadar','12:35','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(460,01077,'Mumbai- CSMT Gorakhpur Special','Thane','13:07','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(461,01077,'Mumbai- CSMT Gorakhpur Special','Kalyan Junction','13:35','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(462,01077,'Mumbai- CSMT Gorakhpur Special','Igatpuri','15:25','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(463,01077,'Mumbai- CSMT Gorakhpur Special','Nashik Road','16:20','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(464,01077,'Mumbai- CSMT Gorakhpur Special','Manmad Junction','17:12','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(465,01077,'Mumbai- CSMT Gorakhpur Special','Jalgaon Junction','19:08','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(466,01077,'Mumbai- CSMT Gorakhpur Special','Bhusaval Junction','19:40','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(467,01077,'Mumbai- CSMT Gorakhpur Special','Khandwa','22:10','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(468,01077,'Mumbai- CSMT Gorakhpur Special','Itarasi Junction','01:00','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(469,01077,'Mumbai- CSMT Gorakhpur Special','Pipariya','02:03','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(470,01077,'Mumbai- CSMT Gorakhpur Special','Narsinghpur','02:58','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(471,01077,'Mumbai- CSMT Gorakhpur Special','Jabalpur','04:30','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(472,01077,'Mumbai- CSMT Gorakhpur Special','Katni','05:50','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(473,01077,'Mumbai- CSMT Gorakhpur Special','Maihar','07:28','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(474,01077,'Mumbai- CSMT Gorakhpur Special','Satna','08:20','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(475,01077,'Mumbai- CSMT Gorakhpur Special','Manikpur Junction','10:15','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(476,01077,'Mumbai- CSMT Gorakhpur Special','Cheoki','11:58','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(477,01077,'Mumbai- CSMT Gorakhpur Special','Mirzapur','12:50','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(478,01077,'Mumbai- CSMT Gorakhpur Special','Varanasi Junction','15:35','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(479,01077,'Mumbai- CSMT Gorakhpur Special','Aunrihar Junction','16:32','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(480,01077,'Mumbai- CSMT Gorakhpur Special','Mau Junction','17:55','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(481,01077,'Mumbai- CSMT Gorakhpur Special','Belthara Road','19:10','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(482,01077,'Mumbai- CSMT Gorakhpur Special','Bhatni Junction','19:45','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(483,01077,'Mumbai- CSMT Gorakhpur Special','Deoria Sadar','20:10','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(484,01077,'Mumbai- CSMT Gorakhpur Special','Gorakhpur Junction','21:30','1','-','Tue','-','-','-','-','-')");

//LTT Patna Spl- 03256

            database.execSQL("insert into express values(485,03256,'LTT Patna Spl','Lokmanya Tilak T(LTT)','07:50','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(486,03256,'LTT Patna Spl','Thane','08:08','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(487,03256,'LTT Patna Spl','Kalyan Junction','08:28','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(488,03256,'LTT Patna Spl','Igatpuri','10:10','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(489,03256,'LTT Patna Spl','Nashik Road','11:00','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(490,03256,'LTT Patna Spl','Manmad Junction','12:20','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(491,03256,'LTT Patna Spl','Bhusaval Junction','15:30','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(492,03256,'LTT Patna Spl','Khnadwa','18:10','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(493,03256,'LTT Patna Spl','Itarasi Junction','21:35','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(494,03256,'LTT Patna Spl','Jabalpur','01:30','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(495,03256,'LTT Patna Spl','Katni','02:50','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(496,03256,'LTT Patna Spl','Satna','04:30','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(497,03256,'LTT Patna Spl','Manikpur Junction','06:35','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(498,03256,'LTT Patna Spl','Cheoki','08:20','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(499,03256,'LTT Patna Spl','Mirzapur','10:00','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(500,03256,'LTT Patna Spl','Mughal Sarai Junction','11:40','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(501,03256,'LTT Patna Spl','Buxar','13:08','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(502,03256,'LTT Patna Spl','Ara','13:53','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(503,03256,'LTT Patna Spl','Danapur','14:21','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(504,03256,'LTT Patna Spl','Patna Junction','15:30','1','-','Tue','-','-','-','-','-')");

//LTT MAU Special- 01061

            database.execSQL("insert into express values(505,01061,'LTT MAU Special','Lokmanyatilak T(LTT)','13:20','0','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(506,01061,'LTT MAU Special','Kalyan Junction','14:07','0','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(507,01061,'LTT MAU Special','Igatpuri','16:35','0','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(508,01061,'LTT MAU Special','Nashik Road','17:35','0','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(509,01061,'LTT MAU Special','Manmad Junction','18:30','0','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(510,01061,'LTT MAU Special','Jalgaon Junction','20:13','0','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(511,01061,'LTT MAU Special','Bhusaval Junction','20:40','0','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(512,01061,'LTT MAU Special','Khandwa','22:55','0','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(513,01061,'LTT MAU Special','Itarasi Junction','01:35','1','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(514,01061,'LTT MAU Special','Pipariya','02:35','1','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(515,01061,'LTT MAU Special','Narsinghpur','03:38','1','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(516,01061,'LTT MAU Special','Jabalpur','05:20','1','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(517,01061,'LTT MAU Special','Katni','06:38','1','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(518,01061,'LTT MAU Special','Maihar','07:58','1','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(519,01061,'LTT MAU Special','Satna','08:35','1','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(520,01061,'LTT MAU Special','Manikpur Junction','11:15','1','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(521,01061,'LTT MAU Special','Mirzapur','13:45','1','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(522,01061,'LTT MAU Special','Varanasi Junction','14:37','1','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(523,01061,'LTT MAU Special','Jaunpur Junction','16:30','1','-','-','Wed','-','-','-','-')");
            database.execSQL("insert into express values(524,01061,'LTT MAU Special','Aunrihar Junction','18:08','1','-','-','Wed','-','-','-','-')");
       //     database.execSQL("insert into express values(525,01061,'LTT MAU Special','Mau Junction','19:55','1','-','-','Wed','-','-','-','-')");


//BBS CSMT Spl- 01020

            database.execSQL("insert into express values(526,01020,'BBS CSMT Spl','Lucknow Nr','19:55','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(527,01020,'BBS CSMT Spl','Kanpur Central','21:45','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(528,01020,'BBS CSMT Spl','Hamirpur Road','23:00','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(529,01020,'BBS CSMT Spl','Bharwa Sumerpur','23:23','0','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(530,01020,'BBS CSMT Spl','Banda Junction','00:50','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(531,01020,'BBS CSMT Spl','Atarra','01:26','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(532,01020,'BBS CSMT Spl','Chaitrakot','02:30','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(533,01020,'BBS CSMT Spl','Satna','04:45','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(534,01020,'BBS CSMT Spl','Maihar','05:25','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(535,01020,'BBS CSMT Spl','Katni','06:55','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(536,01020,'BBS CSMT Spl','Jabalpur','08:40','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(537,01020,'BBS CSMT Spl','Narsinghpur','10:00','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(538,01020,'BBS CSMT Spl','Pipariya','11:18','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(539,01020,'BBS CSMT Spl','Itarasi Junction','13:10','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(540,01020,'BBS CSMT Spl','Khandwa','16:00','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(541,01020,'BBS CSMT Spl','Bhusaval Junction','17:50','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(542,01020,'BBS CSMT Spl','Jalgaon Junction','18:23','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(543,01020,'BBS CSMT Spl','Manmad Junction','20:12','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(544,01020,'BBS CSMT Spl','Nashik Road','21:05','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(545,01020,'BBS CSMT Spl','Igatpuri','22:00','1','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(546,01020,'BBS CSMT Spl','Kalyan Junction','00:01','2','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(547,01020,'BBS CSMT Spl','Thane','00:20','2','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(548,01020,'BBS CSMT Spl','Dadar','00:44','2','-','Tue','-','-','-','-','-')");
            database.execSQL("insert into express values(549,01020,'BBS CSMT Spl','Mumbai CSMT','01:00','2','-','Tue','-','-','-','-','-')");


            //Shalimar(SHM)-Lokmanyatilak(LTT)- 18030

            database.execSQL("insert into express values(700,18030,'Shalimar Lokmanyatilak T Express','Shalimar','15:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(701,18030,'Shalimar Lokmanyatilak T Express','Santragachi Junction ','15:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(703,18030,'Shalimar Lokmanyatilak T Express','Uluberia','15:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(704,18030,'Shalimar Lokmanyatilak T Express','Mecheda','16:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(705,18030,'Shalimar Lokmanyatilak T Express','Panskura','16:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(706,18030,'Shalimar Lokmanyatilak T Express','Kharagpur','17:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(707,18030,'Shalimar Lokmanyatilak T Express','Jhargram','18:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(708,18030,'Shalimar Lokmanyatilak T Express','Chakulia','18:46','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(709,18030,'Shalimar Lokmanyatilak T Express','Ghatsila','19:09','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(710,18030,'Shalimar Lokmanyatilak T Express','Galudih','19:21','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(711,18030,'Shalimar Lokmanyatilak T Express','Rakha Mines','19:32','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(712,18030,'Shalimar Lokmanyatilak T Express','Tatanagar Junction','20:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(713,18030,'Shalimar Lokmanyatilak T Express','Sini Junction','20:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(714,18030,'Shalimar Lokmanyatilak T Express','Raj Kharsawan','20:49','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(715,18030,'Shalimar Lokmanyatilak T Express','Chakradharpur','21:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(716,18030,'Shalimar Lokmanyatilak T Express','Sonua','21:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(717,18030,'Shalimar Lokmanyatilak T Express','Goikera','21:41','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(718,18030,'Shalimar Lokmanyatilak T Express','Manoharpur','22:11','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(719,18030,'Shalimar Lokmanyatilak T Express','Bondamunda','22:39','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(720,18030,'Shalimar Lokmanyatilak T Express','Rourkela','23:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(721,18030,'Shalimar Lokmanyatilak T Express','Raj Gangpur','23:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(722,18030,'Shalimar Lokmanyatilak T Express','Bamra','00:06','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(723,18030,'Shalimar Lokmanyatilak T Express','Jharsuguda','00:50','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(724,18030,'Shalimar Lokmanyatilak T Express','Brajrajnagar','01:03','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(725,18030,'Shalimar Lokmanyatilak T Express','Belpahar','01:13','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(726,18030,'Shalimar Lokmanyatilak T Express','Raighrh','01:51','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(727,18030,'Shalimar Lokmanyatilak T Express','Kharsia','02:18','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(728,18030,'Shalimar Lokmanyatilak T Express','Sakti','02:32','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(729,18030,'Shalimar Lokmanyatilak T Express','Champa','02:58','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(730,18030,'Shalimar Lokmanyatilak T Express','Naila','03:12','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(731,18030,'Shalimar Lokmanyatilak T Express','Akaltara','03:26','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(732,18030,'Shalimar Lokmanyatilak T Express','Bilaspur','04:25','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(733,18030,'Shalimar Lokmanyatilak T Express','Belha','05:03','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(734,18030,'Shalimar Lokmanyatilak T Express','Bhatapara','05:28','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(735,18030,'Shalimar Lokmanyatilak T Express','Tilda','05:48','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(736,18030,'Shalimar Lokmanyatilak T Express','Raipur Junction','06:35','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(737,18030,'Shalimar Lokmanyatilak T Express','Devbaloda Charoda','07:01','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(738,18030,'Shalimar Lokmanyatilak T Express','Bhilai','07:08','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(739,18030,'Shalimar Lokmanyatilak T Express','Bhilai Pwr Hs','07:16','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(740,18030,'Shalimar Lokmanyatilak T Express','Bhilainagar ','07:28','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(741,18030,'Shalimar Lokmanyatilak T Express','Durg','07:45','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(742,18030,'Shalimar Lokmanyatilak T Express','Raj Nandgaon','08:16','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(743,18030,'Shalimar Lokmanyatilak T Express','Dongargarh','08:43','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(744,18030,'Shalimar Lokmanyatilak T Express','Salekasa','09:21','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(745,18030,'Shalimar Lokmanyatilak T Express','Amgaon','09:33','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(746,18030,'Shalimar Lokmanyatilak T Express','Gondia Junction','10:05','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(747,18030,'Shalimar Lokmanyatilak T Express','Tirora','10:34','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(748,18030,'Shalimar Lokmanyatilak T Express','Tumsar Road','10:53','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(749,18030,'Shalimar Lokmanyatilak T Express','Bhandara Road','11:11','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(750,18030,'Shalimar Lokmanyatilak T Express','Kamptee','11:50','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(751,18030,'Shalimar Lokmanyatilak T Express','Itwari','12:11','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(752,18030,'Shalimar Lokmanyatilak T Express','Nagpur Junction','13:15','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(753,18030,'Shalimar Lokmanyatilak T Express','Ajni','13:48','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(754,18030,'Shalimar Lokmanyatilak T Express','Sindi','14:21','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(755,18030,'Shalimar Lokmanyatilak T Express','Sewagram','14:53','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(756,18030,'Shalimar Lokmanyatilak T Express','Wardha','15:02','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(757,18030,'Shalimar Lokmanyatilak T Express','Pulgaon','15:26','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(758,18030,'Shalimar Lokmanyatilak T Express','Dhamangaon','15:44','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
           // database.execSQL("insert into express values(759,18030,'Shalimar Lokmanyatilak T Express','Chandur','16:01','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
          //  database.execSQL("insert into express values(760,18030,'Shalimar Lokmanyatilak T Express','Badnera','17:00',’1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(761,18030,'Shalimar Lokmanyatilak T Express','Murtajapur','17:33','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(762,18030,'Shalimar Lokmanyatilak T Express','Akola Junction','18:05','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(763,18030,'Shalimar Lokmanyatilak T Express','Paras','18:24','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(764,18030,'Shalimar Lokmanyatilak T Express','Shegaon','18:39','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(765,18030,'Shalimar Lokmanyatilak T Express','Jalamb','18:49','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(766,18030,'Shalimar Lokmanyatilak T Express','Nandura','18:59','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(767,18030,'Shalimar Lokmanyatilak T Express','Malkapur','19:24','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(768,18030,'Shalimar Lokmanyatilak T Express','Bodvad','19:44','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(769,18030,'Shalimar Lokmanyatilak T Express','Bhusaval Junction','20:30','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(770,18030,'Shalimar Lokmanyatilak T Express','Jalgaon Junction','21:09','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(771,18030,'Shalimar Lokmanyatilak T Express','Pachora Junction','21:44','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(772,18030,'Shalimar Lokmanyatilak T Express','Chalisgaon','22:14','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(773,18030,'Shalimar Lokmanyatilak T Express','Nandgaon','22::44','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(774,18030,'Shalimar Lokmanyatilak T Express','Manmad Junction','23:10','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(775,18030,'Shalimar Lokmanyatilak T Express','Lasalgaon','23:34','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(776,18030,'Shalimar Lokmanyatilak T Express','Nashik Road','00:15','2','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(777,18030,'Shalimar Lokmanyatilak T Express','Devlali','00:29','2','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(778,18030,'Shalimar Lokmanyatilak T Express','Igatpuri','01:49','2','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(779,18030,'Shalimar Lokmanyatilak T Express','Kasara','02:34','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(780,18030,'Shalimar Lokmanyatilak T Express','Kalyan Junction','03:45','2','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(781,18030,'Shalimar Lokmanyatilak T Express','Thane','04:08','2','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(782,18030,'Shalimar Lokmanyatilak T Express','Lokmanya Tilak T','04:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(783,18030,'Shalimar Lokmanyatilak T Express','MAU','15:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//Amravati Mumbai CST Express- 12112



            database.execSQL("insert into express values(784,12112,'Amravati Mumbai CST Express','Amravati','19:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(785,12112,'Amravati Mumbai CST Express','Badnera','19:20','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(786,12112,'Amravati Mumbai CST Express','Murtajapur','19:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(787,12112,'Amravati Mumbai CST Express','Akola Junction ','20:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(788,12112,'Amravati Mumbai CST Express','Shegaon','20:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(789,12112,'Amravati Mumbai CST Express','Nandura','21:18','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(790,12112,'Amravati Mumbai CST Express','Malkapur','21:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(791,12112,'Amravati Mumbai CST Express','Bhusaval Junction','22:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(792,12112,'Amravati Mumbai CST Express','Jalgaon Junction','23:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(793,12112,'Amravati Mumbai CST Express','Nashik Road','01:53','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(794,12112,'Amravati Mumbai CST Express','Igatpuri','03:28','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(795,12112,'Amravati Mumbai CST Express','Kalyan Junction','05:02','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(796,12112,'Amravati Mumbai CST Express','Dadar','05:53','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(797,12112,'Amravati Mumbai CST Express','Mumbai CSMT','06:25','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");

//Vidarbha Express Gondia- Mumbai – 12106

            database.execSQL("insert into express values(798,12106,'Vidarbha Express','Gondia Junction','14:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(799,12106,'Vidarbha Express','Tumsar Road','15:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(800,12106,'Vidarbha Express','Bhandara Road','15:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(801,12106,'Vidarbha Express','Nagpur Junction','17:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(802,12106,'Vidarbha Express','Ajni','17:22','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(803,12106,'Vidarbha Express','Wardha','18:17','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(804,12106,'Vidarbha Express','Pulgaon','18:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(805,12106,'Vidarbha Express','Dhamangaon','19:01','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(806,12106,'Vidarbha Express','Chandur','19:17','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(807,12106,'Vidarbha Express','Badnera','19:57','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(808,12106,'Vidarbha Express','Murtajapur','20:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(809,12106,'Vidarbha Express','Akola Junction','21:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(810,12106,'Vidarbha Express','Shegaon','21:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(811,12106,'Vidarbha Express','Nandura','21:49','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(812,12106,'Vidarbha Express','Malkapur','22:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(813,12106,'Vidarbha Express','Bhusaval Junction','23:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(814,12106,'Vidarbha Express','Jalgaon Junction','23:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(815,12106,'Vidarbha Express','Chalisgaon','00:39','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(816,12106,'Vidarbha Express','Manmad Junction','01:33','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(817,12106,'Vidarbha Express','Nashik Road','02:27','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(818,12106,'Vidarbha Express','Igatpuri','03:40','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(819,12106,'Vidarbha Express','Kalyan Junction','05:40','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(820,12106,'Vidarbha Express','Thane','06:04','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(821,12106,'Vidarbha Express','Dadar','06:34','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(822,12106,'Vidarbha Express','Mumbai CSMT','07:00','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


            //Punjab Mail- Firozpur- Mumbai- 12138

            database.execSQL("insert into express values(823,12138,'Punjab Mail','Firozpur Cant','21:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(824,12138,'Punjab Mail','Faridkot','22:07','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(825,12138,'Punjab Mail','Kot Kapura','22:21','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(826,12138,'Punjab Mail','Gangsar Jaitu','22:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(827,12138,'Punjab Mail','Goneana','22:54','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(828,12138,'Punjab Mail','Bhatinda','23:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(829,12138,'Punjab Mail','Maur','00:02','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(830,12138,'Punjab Mail','Mansa','00:19','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(831,12138,'Punjab Mail','Budhlada','00:35','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(832,12138,'Punjab Mail','Bareta','00:50','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(833,12138,'Punjab Mail','Jakhal Junction','01:08','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(834,12138,'Punjab Mail','Tohana','01:24','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(835,12138,'Punjab Mail','Narwana','01:45','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(836,12138,'Punjab Mail','Jind Junction','02:20','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(837,12138,'Punjab Mail','Rohtak Junction','03:12','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(838,12138,'Punjab Mail','Bahadurgarh','03:44','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(839,12138,'Punjab Mail','Shakurbasti','04:11','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(840,12138,'Punjab Mail','Delhi Kishanganj','04:25','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(841,12138,'Punjab Mail','New Delhi','04:50','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(842,12138,'Punjab Mail','Faridabad','05:44','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(843,12138,'Punjab Mail','Kosi Kalan','06:57','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(844,12138,'Punjab Mail','Mathura','07:37','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(845,12138,'Punjab Mail','Raja ki Mandi','08:21','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(846,12138,'Punjab Mail','Agra Cantt','08:50','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(847,12138,'Punjab Mail','Dhaulpur','09:30','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(848,12138,'Punjab Mail','Morena','09:55','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(849,12138,'Punjab Mail','Gwalior','10:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(850,12138,'Punjab Mail','Dabra','11:11','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(851,12138,'Punjab Mail','Datia','11:34','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(852,12138,'Punjab Mail','Jhansi Junction','12:25','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(853,12138,'Punjab Mail','Babina','12:58','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(854,12138,'Punjab Mail','Lalitpur','13:45','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(855,12138,'Punjab Mail','Bina Junction','14:45','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(856,12138,'Punjab Mail','Ganj Basoda','15:23','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(857,12138,'Punjab Mail','Vidisha','15:52','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(858,12138,'Punjab Mail','Bhopal Junction','16:50','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(859,12138,'Punjab Mail','Habibganj','17:05','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(860,12138,'Punjab Mail','Hoshangabad','18:05','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(861,12138,'Punjab Mail','Itarasi','18:35','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(862,12138,'Punjab Mail','Banapura','19:04','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(863,12138,'Punjab Mail','Harda','19:37','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(864,12138,'Punjab Mail','Khirkiya','20:04','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(865,12138,'Punjab Mail','Khandwa','21:40','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(866,12138,'Punjab Mail','Burhanpur','22:33','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(867,12138,'Punjab Mail','Bhusaval Junction','23:25','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(868,12138,'Punjab Mail','Jalgaon Junction','23:59','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(869,12138,'Punjab Mail','Chalisgaon Junction','00:59','2','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(870,12138,'Punjab Mail','Manmad Junction','01:50','2','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(871,12138,'Punjab Mail','Nashik Road','02:48','2','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(872,12138,'Punjab Mail','Devlali','02:58','2','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(873,12138,'Punjab Mail','Igatpuri','04:28','2','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(874,12138,'Punjab Mail','Kalyan Junction','06:20','2','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(875,12138,'Punjab Mail','Dadar','07:03','2','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(876,12138,'Punjab Mail','Mumbai CSMT','07:35','2','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");




//MAU LTT Spl- 01062

            database.execSQL("insert into express values(901,01062,'MAU LTT Spl','MAU Junction','21:30','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(902,01062,'MAU LTT Spl','Aunrihar Junction','22:40','0','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(903,01062,'MAU LTT Spl','Jaunpur Junction','00:15','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(904,01062,'MAU LTT Spl','Varanasi Junction','01:45','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(905,01062,'MAU LTT Spl','Mirzapur','03:10','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(906,01062,'MAU LTT Spl','Manikpur Junction','05:50','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(907,01062,'MAU LTT Spl','Satna','07:30','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(908,01062,'MAU LTT Spl','Maihar','08:05','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(909,01062,'MAU LTT Spl','Katni','08:57','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(910,01062,'MAU LTT Spl','Jabalpur','10:40','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(911,01062,'MAU LTT Spl','Narsinghpur','11:35','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(912,01062,'MAU LTT Spl','Pipariya','12:48','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(913,01062,'MAU LTT Spl','Itarasi Junction','14:30','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(914,01062,'MAU LTT Spl','Khandwa','17:30','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(915,01062,'MAU LTT Spl','Bhusaval Junction','19:20','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(916,01062,'MAU LTT Spl','Jalgaon Junction','19:53','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(917,01062,'MAU LTT Spl','Manmad Junction','22:52','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(918,01062,'MAU LTT Spl','Nashik Road','23:50','1','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(919,01062,'MAU LTT Spl','Igatpuri','01:25','2','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(920,01062,'MAU LTT Spl','Kalyan Junction','03:16','2','-','-','-','-','Thu','-','-')");
            database.execSQL("insert into express values(921,01062,'MAU LTT Spl','Lokmanya Tilak T(LTT)','04:10','2','-','-','-','-','Thu','-','-')");


//KYQ LTT Spl- 05646

            database.execSQL("insert into express values(922,05646,'KYQ LTT Spl','Kamakhya','06:10','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(923,05646,'KYQ LTT Spl','Goalpara Town','07:42','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(924,05646,'KYQ LTT Spl','New Bongaigaon','08:56','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(925,05646,'KYQ LTT Spl','Alipur Duar Junction','10:23','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(926,05646,'KYQ LTT Spl','Siliguri Junction','12:56','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(927,05646,'KYQ LTT Spl','New Jalpaiguri','13:10','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(928,05646,'KYQ LTT Spl','Kishanganj','14:36','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(929,05646,'KYQ LTT Spl','Katihar Junction','16:55','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(930,05646,'KYQ LTT Spl','Naugachia','17:53','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(931,05646,'KYQ LTT Spl','Begu Sarai','19:25','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(932,05646,'KYQ LTT Spl','Barauni Junction','19:50','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(933,05646,'KYQ LTT Spl','Patna Junction','22:25','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(934,05646,'KYQ LTT Spl','Ara','23:18','0','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(935,05646,'KYQ LTT Spl','Mughal Sarai Junction','01:40','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(936,05646,'KYQ LTT Spl','Satna','06:50','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(937,05646,'KYQ LTT Spl','Katni','08:20','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(938,05646,'KYQ LTT Spl','Jabalpur','09:50','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(939,05646,'KYQ LTT Spl','Pipariya','13:30','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(940,05646,'KYQ LTT Spl','itarasi Junction','15:00','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(941,05646,'KYQ LTT Spl','Harda','16:20','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(942,05646,'KYQ LTT Spl','Khandwa','18:00','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(943,05646,'KYQ LTT Spl','Bhusaval Junction','20:00','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(944,05646,'KYQ LTT Spl','Manmad Junction','23:00','1','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(945,05646,'KYQ LTT Spl','Nashik Road','00:10','2','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(946,05646,'KYQ LTT Spl','Igatpuri','01:15','2','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(947,05646,'KYQ LTT Spl','Kalyan Junction','03:25','2','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(948,05646,'KYQ LTT Spl','Thane','03:50','2','-','-','-','-','-','Fri','-')");
            database.execSQL("insert into express values(949,05646,'KYQ LTT Spl','Lokmanya Tilak T(LTT)','04:30','2','-','-','-','-','-','Fri','-')");


//Manmad LTT Exp- 12118

            database.execSQL("insert into express values(950,12118,'Manmad LTT Exp','Manmad Junction','08:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(951,12118,'Manmad LTT Exp','Lasalgaon','08:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(952,12118,'Manmad LTT Exp','Niphad','09:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(953,12118,'Manmad LTT Exp','Nashik Road','09:32','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(954,12118,'Manmad LTT Exp','Devlali','09:43','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(955,12118,'Manmad LTT Exp','Igatpuri','10:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(956,12118,'Manmad LTT Exp','Kasara','10:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(957,12118,'Manmad LTT Exp','Kalyan Junction','12:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(958,12118,'Manmad LTT Exp','Thane','12:18	','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(959,12118,'Manmad LTT Exp','Lokmanya Tilak T(LTT)','13:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//CSMT JBP Sup Sp- 01701

            database.execSQL("insert into express values(960,01701,'CSMT JBP Sup Sp','Mumbai CSMT','13:30','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express values(961,01701,'CSMT JBP Sup Sp','Dadar','13:43','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express values(962,01701,'CSMT JBP Sup Sp','Kalyan Junction','14:22','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express values(963,01701,'CSMT JBP Sup Sp','Igatpuri','16:00','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express values(964,01701,'CSMT JBP Sup Sp','Nashik Road','16:55','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express values(965,01701,'CSMT JBP Sup Sp','Manmad Junction','17:47','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express values(966,01701,'CSMT JBP Sup Sp','Jalgaon Junction','19:28','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express values(967,01701,'CSMT JBP Sup Sp','Bhusaval Junction','20:00','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express values(968,01701,'CSMT JBP Sup Sp','Khandwa','23:30','0','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express values(969,01701,'CSMT JBP Sup Sp','Harda','00:33','1','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express values(970,01701,'CSMT JBP Sup Sp','Itarasi Junction','02:00','1','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express values(971,01701,'CSMT JBP Sup Sp','Pipariya','03:03','1','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express values(972,01701,'CSMT JBP Sup Sp','Gadarwara	','03:37','1','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express values(973,01701,'CSMT JBP Sup Sp','Narsinghpur','04:17','1','Sun','-','-','-','-','-','-')");
            database.execSQL("insert into express values(974,01701,'CSMT JBP Sup Sp','Jabalpur','06:00','1','Sun','-','-','-','-','-','-')");


//GKP LTT Spl- 05031

            database.execSQL("insert into express values(975,05031,'GKP LTT Spl','Gorakhpur Junction','10:50','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(976,05031,'GKP LTT Spl','Khalilabad','11:29','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(978,05031,'GKP LTT Spl','Basti','12:00','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(979,05031,'GKP LTT Spl','Babhnan','12:30','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(980,05031,'GKP LTT Spl','Gonda Junction','13:35','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(981,05031,'GKP LTT Spl','Jarwal Road','14:16','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(982,05031,'GKP LTT Spl','Lucknow Nr','16:00','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(983,05031,'GKP LTT Spl','Kanpur Central','17:55','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(984,05031,'GKP LTT Spl','Pokhrayan','19:00','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(985,05031,'GKP LTT Spl','Orai','19:55','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(986,05031,'GKP LTT Spl','Jhansi Junction','21:35','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(987,05031,'GKP LTT Spl','Lalitpur','22:49','0','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(988,05031,'GKP LTT Spl','Bina Junction','00:02','1','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(989,05031,'GKP LTT Spl','Bhopal Junction','01:50','1','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(990,05031,'GKP LTT Spl','Habibganj','02:07','1','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(991,05031,'GKP LTT Spl','Itarasi Junction','03:40','1','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(992,05031,'GKP LTT Spl','Khandwa','06:45','1','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(993,05031,'GKP LTT Spl','Bhusaval Junction','08:40','1','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(994,05031,'GKP LTT Spl','Jalgaon Junction','09:23','1','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(995,05031,'GKP LTT Spl','Manmad Junction','11:27','1','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(996,05031,'GKP LTT Spl','Nashik Road','12:20','1','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(997,05031,'GKP LTT Spl','Igatpuri','13:25','1','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(998,05031,'GKP LTT Spl','Kalyan Junction','16:35','1','-','-','-','-','-','-','Sat')");
            database.execSQL("insert into express values(999,05031,'GKP LTT Spl','Lokmanya Tilak T(LTT)','17:50','1','-','-','-','-','-','-','Sat')");

// Mahanagari Express Mumbai- Varanasi- 11093

            database.execSQL("insert into express values(1100,11093,'Mahanagari Express','Mumbai CSMT','00:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1101,11093,'Mahanagari Express','Dadar','00:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1102,11093,'Mahanagari Express','Thane','00:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1103,11093,'Mahanagari Express','Kalyan Junction','01:12','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1104,11093,'Mahanagari Express','Igatpuri','03:03','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1105,11093,'Mahanagari Express','Nashik Road','03:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1106,11093,'Mahanagari Express','Manmad Junction','04:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1107,11093,'Mahanagari Express','Jalgaon Junction','06:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1108,11093,'Mahanagari Express','Bhusaval Junction','07:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1109,11093,'Mahanagari Express','Burhanpur','08:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1110,11093,'Mahanagari Express','Nepanagar','08:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1111,11093,'Mahanagari Express','Khandwa','09:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1112,11093,'Mahanagari Express','Itarasi Junction','12:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1113,11093,'Mahanagari Express','Pipariya','13:52','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1114,11093,'Mahanagari Express','Narsinghpur','14:52','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1115,11093,'Mahanagari Express','Madan Mahal','15:54','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1116,11093,'Mahanagari Express','Jabalpur','16:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1117,11093,'Mahanagari Express','Katni','17:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1118,11093,'Mahanagari Express','Maihar','18:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1119,11093,'Mahanagari Express','Satna','19:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1120,11093,'Mahanagari Express','Manikpur Junction','21:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1121,11093,'Mahanagari Express','Cheoki','00:10','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1122,11093,'Mahanagari Express','Vindhyachal','01:56','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1123,11093,'Mahanagari Express','Mirzapur','02:18','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1124,11093,'Mahanagari Express','Chunar','02:58','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1125,11093,'Mahanagari Express','Kashi','04:18','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1126,11093,'Mahanagari Express','Varanasi Junction','04:40','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//Bhusaval Pune Express- 11025

            database.execSQL("insert into express values(1127,11025,'Bhusaval Pune Express','Bhusaval Junction','00:25','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1128,11025,'Bhusaval Pune Express','Jalgaon Junction','00:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1129,11025,'Bhusaval Pune Express','Pachora','01:26','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1130,11025,'Bhusaval Pune Express','Kajgaon','01:44','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1131,11025,'Bhusaval Pune Express','Chalisgaon','01:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1132,11025,'Bhusaval Pune Express','Manmad Junction','04:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1133,11025,'Bhusaval Pune Express','Nashik Road','05:07','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1134,11025,'Bhusaval Pune Express','Devlali','05:19','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1135,11025,'Bhusaval Pune Express','Igatpuri','06:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1136,11025,'Bhusaval Pune Express','Kalyan Junction','08:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1137,11025,'Bhusaval Pune Express','Panvel','09:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1138,11025,'Bhusaval Pune Express','Karjat','09:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1139,11025,'Bhusaval Pune Express','Lonavala','10:54','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1140,11025,'Bhusaval Pune Express','Chinchwad','11:29','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1141,11025,'Bhusaval Pune Express','Pune Junction','12:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");



            //Sewagram Express Nagpur- Mumbai - 12140

            database.execSQL("insert into express values(1183,12140,'Sewagram Express','Nagpur','21:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1184,12140,'Sewagram Express','Ajni','21:06','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1185,12140,'Sewagram Express','Sindi','21:37','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1186,12140,'Sewagram Express','Sewagram','22:03','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1187,12140,'Sewagram Express','Wardha Junction','22:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1188,12140,'Sewagram Express','Pulgaon','22:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1189,12140,'Sewagram Express','Dhamangaon','23:17','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1190,12140,'Sewagram Express','Chandur','23:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1191,12140,'Sewagram Express','Badnera','00:20','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1192,12140,'Sewagram Express','Murtajapur','00:54','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1193,12140,'Sewagram Express','Akola Junction','01:20','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1194,12140,'Sewagram Express','Shegaon','01:53','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1195,12140,'Sewagram Express','Jalamb','02:03','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1196,12140,'Sewagram Express','Nandura','02:13','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1197,12140,'Sewagram Express','Malkapur','02:38','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1198,12140,'Sewagram Express','Bodvad','02:55','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1199,12140,'Sewagram Express','Varangaon','03:13','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1200,12140,'Sewagram Express','Bhusaval Junction','03:40','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1201,12140,'Sewagram Express','Jalgaon Junction','04:18','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1202,12140,'Sewagram Express','Pachora Junction','04:53','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1203,12140,'Sewagram Express','Chalisgaon Junction','05:30','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1204,12140,'Sewagram Express','Nandgaon','05:58','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1205,12140,'Sewagram Express','Manmad Junction','06:22','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1206,12140,'Sewagram Express','Lasalgaon','06:43','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1207,12140,'Sewagram Express','Niphad','06:58','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1208,12140,'Sewagram Express','Nashik Road','07:27','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1209,12140,'Sewagram Express','Devlali','07:38','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1210,12140,'Sewagram Express','Igatpuri','08:50','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1211,12140,'Sewagram Express','Kasara','09:33','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1212,12140,'Sewagram Express','Kalyan Junction','10:37','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1213,12140,'Sewagram Express','Thane','11:03','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1214,12140,'Sewagram Express','Dadar','11:30','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1215,12140,'Sewagram Express','Mumbai CSMT','12:00','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//Mahanagari Express Varanasi- Mumbai - 11094

            database.execSQL("insert into express values(1216,11094,'Mahanagari Express','Varanasi Junction','11:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1217,11094,'Mahanagari Express','Kashi','11:31','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1218,11094,'Mahanagari Express','Chunar','12:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1219,11094,'Mahanagari Express','Mirzapur','13:03','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1220,11094,'Mahanagari Express','Vindhyachal','13:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1221,11094,'Mahanagari Express','Cheoki','15:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1222,11094,'Mahanagari Express','Manikpur Junction','17:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1223,11094,'Mahanagari Express','Satna','18:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1224,11094,'Mahanagari Express','Maihar','18:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1225,11094,'Mahanagari Express','Katni','19:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1226,11094,'Mahanagari Express','Jabalpur','21:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1227,11094,'Mahanagari Express','Narsinghpur','22:36','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1228,11094,'Mahanagari Express','Pipariya','23:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1229,11094,'Mahanagari Express','Itarasi Junction','01:20','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1230,11094,'Mahanagari Express','Khandwa','04:15','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1231,11094,'Mahanagari Express','Nepanagar','04:53','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1232,11094,'Mahanagari Express','Burhanpur','05:13','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1233,11094,'Mahanagari Express','Bhusaval Junction','06:00','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1234,11094,'Mahanagari Express','Jalgaon Junction','06:38','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1235,11094,'Mahanagari Express','Manmad Junction','08:15','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1236,11094,'Mahanagari Express','Nashik Road','09:18','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1237,11094,'Mahanagari Express','Igatpuri','11:03','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1238,11094,'Mahanagari Express','Kalyan Junction','12:50','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1239,11094,'Mahanagari Express','Thane','13:18','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1240,11094,'Mahanagari Express','Dadar','13:43','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1241,11094,'Mahanagari Express','Mumbai CSMT','14:15','1','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


//Manmad Lokmanyatilak T Express- 12118

            database.execSQL("insert into express values(1242,12118,'Manmad Lokmanyatilak T Express','Manmad Junction','08:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1243,12118,'Manmad Lokmanyatilak T Express','Lasalgaon','08:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1244,12118,'Manmad Lokmanyatilak T Express','Niphad','09:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1245,12118,'Manmad Lokmanyatilak T Express','Nashik Road','15:0llll','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1246,12118,'Manmad Lokmanyatilak T Express','Devlali','09:43','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1247,12118,'Manmad Lokmanyatilak T Express','Igatpuri','10:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1248,12118,'Manmad Lokmanyatilak T Express','Kasara','10:53','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1249,12118,'Manmad Lokmanyatilak T Express','Kalyan Junction','12:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1250,12118,'Manmad Lokmanyatilak T Express','Thane','12:18','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1251,12118,'Manmad Lokmanyatilak T Express','Lokmanya Tilak T','13:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
//Mumbai CSMT Bhusaval Passenger- 51153

            database.execSQL("insert into express values(1252,51153,'Mumbai CSMT Bhusaval Passenger','Mumbai CSMT','05:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1253,51153,'Mumbai CSMT Bhusaval Passenger','Dadar','05:29','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1254,51153,'Mumbai CSMT Bhusaval Passenger','Thane','05:59','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1255,51153,'Mumbai CSMT Bhusaval Passenger','Kalyan Junction','06:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1256,51153,'Mumbai CSMT Bhusaval Passenger','Shahad','06:37','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1257,51153,'Mumbai CSMT Bhusaval Passenger','Ambivli','06:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1258,51153,'Mumbai CSMT Bhusaval Passenger','Titwala','06:49','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1259,51153,'Mumbai CSMT Bhusaval Passenger','Khadavli','06:59','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1260,51153,'Mumbai CSMT Bhusaval Passenger','Vasind','08:00','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1261,51153,'Mumbai CSMT Bhusaval Passenger','Asangaon','08:07','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1262,51153,'Mumbai CSMT Bhusaval Passenger','Atgaon','08:19','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1263,51153,'Mumbai CSMT Bhusaval Passenger','Khardi','08:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1264,51153,'Mumbai CSMT Bhusaval Passenger','Kasara','08:52','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1265,51153,'Mumbai CSMT Bhusaval Passenger','Igatpuri','09:35','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1266,51153,'Mumbai CSMT Bhusaval Passenger','Ghoti','10:07','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1267,51153,'Mumbai CSMT Bhusaval Passenger','Asvali','10:22','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1268,51153,'Mumbai CSMT Bhusaval Passenger','Lahavit','10:31','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1269,51153,'Mumbai CSMT Bhusaval Passenger','Devlali','10:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1270,51153,'Mumbai CSMT Bhusaval Passenger','Nashik Road','10:47','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1271,51153,'Mumbai CSMT Bhusaval Passenger','Odha','11:12','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1272,51153,'Mumbai CSMT Bhusaval Passenger','Khervdi','11:21','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1273,51153,'Mumbai CSMT Bhusaval Passenger','Niphad','11:39','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1274,51153,'Mumbai CSMT Bhusaval Passenger','Ugaon','11:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1275,51153,'Mumbai CSMT Bhusaval Passenger','Lasalgaon','11:59','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1276,51153,'Mumbai CSMT Bhusaval Passenger','Summit','12:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1277,51153,'Mumbai CSMT Bhusaval Passenger','Manmad Junction','13:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1278,51153,'Mumbai CSMT Bhusaval Passenger','Panevadi','13:24','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1279,51153,'Mumbai CSMT Bhusaval Passenger','Hisvahal','13:32','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1280,51153,'Mumbai CSMT Bhusaval Passenger','Panjhan','13:39','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1281,51153,'Mumbai CSMT Bhusaval Passenger','Nandgaon','13:49','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1282,51153,'Mumbai CSMT Bhusaval Passenger','Pimparkhed','13:58','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1283,51153,'Mumbai CSMT Bhusaval Passenger','Naydongri','14:08','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1284,51153,'Mumbai CSMT Bhusaval Passenger','Rohini','14:14','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1285,51153,'Mumbai CSMT Bhusaval Passenger','Hirapur','14:21','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1286,51153,'Mumbai CSMT Bhusaval Passenger','Chalisgaon Junction','14:32','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1287,51153,'Mumbai CSMT Bhusaval Passenger','Vaghli','14:43','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1288,51153,'Mumbai CSMT Bhusaval Passenger','Kajgaon','14:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1289,51153,'Mumbai CSMT Bhusaval Passenger','Nagardevla','14:57','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1290,51153,'Mumbai CSMT Bhusaval Passenger','Galan','15:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1291,51153,'Mumbai CSMT Bhusaval Passenger','Pachora Junction','15:15','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1292,51153,'Mumbai CSMT Bhusaval Passenger','Pardhande','15:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1293,51153,'Mumbai CSMT Bhusaval Passenger','Maheji','15:31','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1294,51153,'Mumbai CSMT Bhusaval Passenger','Mhasavad','15:41','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1295,51153,'Mumbai CSMT Bhusaval Passenger','Shirsoli','16:33','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1296,51153,'Mumbai CSMT Bhusaval Passenger','Jalgaon Junction','16:45','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1297,51153,'Mumbai CSMT Bhusaval Passenger','Bhadli','17:24','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1298,51153,'Mumbai CSMT Bhusaval Passenger','Bhusaval Junction','17:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


// Manmad Igatpuri Passenger- 51424


            database.execSQL("insert into express values(1299,51424,'Manmmad Igatpuri Passenger','Manmad Junction','14:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1300,51424,'Manmmad Igatpuri Passenger','Summit','14:42','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1301,51424,'Manmmad Igatpuri Passenger','Lasalgaon','14:56','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1302,51424,'Manmmad Igatpuri Passenger','Ugaon','15:06','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1303,51424,'Manmmad Igatpuri Passenger','Niphad','15:14','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1304,51424,'Manmmad Igatpuri Passenger','Khervadi','15:30','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1305,51424,'Manmmad Igatpuri Passenger','Odha','15:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1306,51424,'Manmmad Igatpuri Passenger','Nashik Road','15:55','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1307,51424,'Manmmad Igatpuri Passenger','Devlali','16:07','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1308,51424,'Manmmad Igatpuri Passenger','Lahavit','16:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1309,51424,'Manmmad Igatpuri Passenger','Asvali','16:29','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1310,51424,'Manmmad Igatpuri Passenger','Ghoti','16:44','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1311,51424,'Manmmad Igatpuri Passenger','Igatpuri','17:40','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");


            database.execSQL("insert into express values(1312,12109,'Panchavati Express','Mumbai CSMT','18:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1313,12109,'Panchavati Express','Dadar','18:28','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1314,12109,'Panchavati Express','Kalyan Junction','19:10','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1315,12109,'Panchavati Express','Kasara','20:13','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1316,12109,'Panchavati Express','Igatpuri','20:48','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1317,12109,'Panchavati Express','Devlali','21:23','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1318,12109,'Panchavati Express','Nashik Road','21:38','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1319,12109,'Panchavati Express','Niphad','22:05','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1320,12109,'Panchavati Express','Lasalgaon','22:20','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");
            database.execSQL("insert into express values(1321,12109,'Panchavati Express','Manmad Junction','22:50','0','Sun','Mon','Tue','Wed','Thu','Fri','Sat')");





            Log.d("express", "express Table created!");
        } catch (Exception ex) {
            Log.d("express", "express Error in DBHelper.onCreate() : " + ex.getMessage());
        }
    }
}

