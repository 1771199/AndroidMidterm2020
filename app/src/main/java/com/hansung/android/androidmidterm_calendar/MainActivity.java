package com.hansung.android.androidmidterm_calendar;


import android.content.Intent;
import android.os.Bundle;
/*
    SwipeView로 캘린더를 나타내는 프로젝트입니다.
    실행 시 현재 날자의 월 달력이 실행되고, 화면 swipe를 통하여 달력을 탐색할 수 있습니다.
    Actionc Bar에는 현재 표시되고 있는 달력의 연, 월이 title로 나타납니다.
    달력의 특정 일을 클릭하면 "연, 월, 일"이 Toast 메시지로 출력됩니다.
 */

/*
    어플 실행 시 MainActivity에서는 intent 객체에 CalendarActivity를 담아 CalendarActivity를 시작합니다.

    CalendarActivity에 설정된 layout에는 ViewPager가 있어 CalendarAcitivity에서는 ViewPager에 표시할 Fragment와 연결되는 Adpater를 연결합니다.
    또한 ViewPager의 선택된 Page에 따라서 ActionBar의 Title을 변경하고, 프래그먼트 목록의 앞뒤에 프래그먼트를 생성하는 등의 역할을 합니다.

    CalendarAdapter에서는 Fragment를 관리합니다. 이 곳에는 HashMap<integer, fragment>와 ArrayList<Long>이 있습니다.
    HashMap의 key로 position을 value로 CalendarFragment를 담아 관리하며, ArrayList에는 HashMap처럼 index에 따라 Calendar에 설정해야 할 시간 값을 가지고 있습니다.

    CalendarFragment의 layout에는 GridView가 있습니다. CalendarFragment 클래스에 GridAdapter 클래스를 정의하였습니다.
    CalendarFragment의 GridView에 GridAdapter를 통해 각 Grid의 요소를 지정해 연결해 줍니다. 각 요소는 TextView(one_day)입니다.
    GridAdapter로 dayList라는 배열을 넘겨 날짜 값을 전달합니다. dayList는 해당 달의 1일과 요일을 맞춰 주기 위한 공백과 1부터 해당 달의 마지막 날까지의 String을 가지고 있습니다.

 */

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }
}
