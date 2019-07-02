package com.minwook.mytriphistory.common;

import com.minwook.mytriphistory.DAO.Content;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DumyData {
    private static ArrayList<Content> list = new ArrayList<>();

    private static DumyData instance;
    private DumyData() {
        SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd");
        Date date = new Date();

        list.add(new Content("나들이", "여의도공원", "화창한 토요일 오후. IFC MALL 가기전 여의도 산책", 37.524657, 126.920172, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("남산 야경", "남산타워", "케이블카를 타고 남산에 올라 조명에 바치는 남산타워를 봤다", 37.550948, 126.990892, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("고궁 나들이", "경복궁", "한복을 입고 조선시대에 온것같은 느낌을 살려 구경을 했다", 37.577887, 126.976890, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("아쿠아리움 구경", "코엑스", "수많은 물고기와 수많은 사람들을 보게 되었다", 37.511916, 127.058953, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("마라톤 연습", "올림픽공원", "하프 코스 완주를 위한 특훈!!", 37.519806, 127.122651, dateFormat.format(date), dateFormat.format(date)));

        list.add(new Content("놀이동산", "롯데월드", "자유이용권 아깝지 않도록 타고 싶은거 모두 탔다", 37.508645, 127.099980, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("시장님 만나기", "서울시청", "시장님 만나는 투어가 있어 신청을 하였다", 37.566521, 126.978411, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("전시회 구경", "DDP", "DDP에서 여러 전시회가 열리고 있는데 그 중 하나를 관람하였다", 37.566832, 127.009809, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("사무실 탐방", "IFC MALL", "지인의 사무실이 있는데 높은 층에서 바라보는 경치가 최고였다", 37.525896, 126.925860, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("옷 구경", "타임스퀘어", "수많은 옷가게를 구경하며 내지갑은 텅텅 비어버렸다", 37.517161, 126.904265, dateFormat.format(date), dateFormat.format(date)));

        list.add(new Content("공항 면세점", "김포공항", "제주도 가기전 면세점 투어를 했다", 37.556943, 126.802216, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("가족 나들이", "어린이 대공원", "가족들이랑 오랜만에 나들이를 나왔다", 37.548920, 127.079789, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("국가대표 축구 직관", "서울 월드컵 경기장", "역시 축구는 직관을 해야 보는 맛이 난다", 37.567499, 126.897013, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("갈대밭 구경", "하늘공원", "노을에 비치는 갈대밭은 언제봐도 멋지다", 37.567224, 126.885545, dateFormat.format(date), dateFormat.format(date)));
    }

    public static synchronized DumyData getInstance() {
        if (instance == null)
            instance = new DumyData();
        return instance;
    }

    public ArrayList<Content> getList(){
        return list;
    }

    /*
    public static ArrayList<Content> setDumyData(){
        SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd");
        Date date = new Date();

        list.add(new Content("나들이", "여의도공원", "화창한 토요일 오후. IFC MALL 가기전 여의도 산책", 37.524657, 126.920172, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("남산 야경", "남산타워", "케이블카를 타고 남산에 올라 조명에 바치는 남산타워를 봤다", 37.550948, 126.990892, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("고궁 나들이", "경복궁", "한복을 입고 조선시대에 온것같은 느낌을 살려 구경을 했다", 37.577887, 126.976890, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("아쿠아리움 구경", "코엑스", "수많은 물고기와 수많은 사람들을 보게 되었다", 37.511916, 127.058953, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("마라톤 연습", "올림픽공원", "하프 코스 완주를 위한 특훈!!", 37.519806, 127.122651, dateFormat.format(date), dateFormat.format(date)));

        list.add(new Content("놀이동산", "롯데월드", "자유이용권 아깝지 않도록 타고 싶은거 모두 탔다", 37.508645, 127.099980, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("시장님 만나기", "서울시청", "시장님 만나는 투어가 있어 신청을 하였다", 37.566521, 126.978411, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("전시회 구경", "DDP", "DDP에서 여러 전시회가 열리고 있는데 그 중 하나를 관람하였다", 37.566832, 127.009809, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("사무실 탐방", "IFC MALL", "지인의 사무실이 있는데 높은 층에서 바라보는 경치가 최고였다", 37.525896, 126.925860, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("옷 구경", "타임스퀘어", "수많은 옷가게를 구경하며 내지갑은 텅텅 비어버렸다", 37.517161, 126.904265, dateFormat.format(date), dateFormat.format(date)));

        list.add(new Content("공항 면세점", "김포공항", "제주도 가기전 면세점 투어를 했다", 37.556943, 126.802216, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("가족 나들이", "어린이 대공원", "가족들이랑 오랜만에 나들이를 나왔다", 37.548920, 127.079789, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("국가대표 축구 직관", "서울 월드컵 경기장", "역시 축구는 직관을 해야 보는 맛이 난다", 37.567499, 126.897013, dateFormat.format(date), dateFormat.format(date)));
        list.add(new Content("갈대밭 구경", "하늘공원", "노을에 비치는 갈대밭은 언제봐도 멋지다", 37.567224, 126.885545, dateFormat.format(date), dateFormat.format(date)));

        //37.524657, 126.920172 여의도공원
        //37.550948, 126.990892 남산타워
        //37.577887, 126.976890 경복궁
        //37.511916, 127.058953 코엑스
        //37.519806, 127.122651 올림픽공

        //37.508645, 127.099980 롯데월드
        //37.566521, 126.978411 서울시청
        //37.566832, 127.009809 DDP
        //37.525896, 126.925860 IFC MALL
        //37.517161, 126.904265 타임스퀘어

        //37.556943, 126.802216 김포공항
        //37.548920, 127.079789 어린이 대공
        //37.567499, 126.897013 서울 월드컵 경기장
        //37.567224, 126.885545 하늘공원

        return list;
    }*/
}
