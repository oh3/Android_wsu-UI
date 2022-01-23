package com.example.registeration2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //공지사항
    private ListView noticeListView;
    private NoticeListAdapter adapter;
    private List<Notice> noticeList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noticeListView = (ListView)findViewById(R.id.noticeListView);
        noticeList = new ArrayList<Notice>();
        noticeList.add(new Notice("우송대학교 2022학년도 1학기 교수초빙 공고", "관리자", "2021-12-14"));
        noticeList.add(new Notice("2022학년도 1학기 복학신청기간 안내", "관리자", "2021-12-14"));
        noticeList.add(new Notice("2022학년도 1학기 국가장학금 및 국가근로장학금 1차 신청 일정 안내", "관리자", "2021-12-12"));
        noticeList.add(new Notice("2021년도 겨울학기 학부 재학생 등록 및 분납신청 안내", "관리자", "2021-12-11"));
        noticeList.add(new Notice("2021학년도 2학기 수업 운영 방법 안내", "관리자", "2021-12-10"));
        noticeList.add(new Notice("2021학년도 신입생 및 재학생 스마트 캠퍼스 시스템 활용 안내", "관리자", "2021-12-09"));
        noticeList.add(new Notice("2020학년도 온라인 수업 진행 관련 메뉴얼 안내", "관리자", "2021-12-08"));
        noticeList.add(new Notice("2022 학년도 1학기 기숙사(내국인) 간사 모집 공고", "관리자", "2021-12-07"));
        noticeList.add(new Notice("우송대학교 대학원 학칙 일부개정 공포 ", "관리자", "2021-12-06"));

        adapter = new NoticeListAdapter(getApplicationContext(), noticeList);
        noticeListView.setAdapter(adapter);




        final Button courseButton = (Button) findViewById(R.id.CourseButton);   //코스버튼
        final Button staticButton = (Button) findViewById(R.id.StaticButton);   //통계버튼
        final Button scheduleButton = (Button) findViewById(R.id.ScheduleButton);//시간표버튼

        final LinearLayout notice = (LinearLayout) findViewById(R.id.notice); // 리니어레이아웃 프래그먼트 화면바뀌는 레이아웃


        courseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //해당 공지사항이 보이지 않도록 화면을 바꿔주는것
                notice.setVisibility(View.GONE);
                courseButton.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary_dark));
                staticButton.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));

                //화면전환 작업
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new CourseFragment());
                fragmentTransaction.commit();

            }
        });

        staticButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //해당 공지사항이 보이지 않도록 화면을 바꿔주는것
                notice.setVisibility(View.GONE);
                courseButton.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
                staticButton.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary_dark));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));

                //화면전환 작업
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new StatisticsFragment());
                fragmentTransaction.commit();

            }
        });

        scheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //해당 공지사항이 보이지 않도록 화면을 바꿔주는것
                notice.setVisibility(View.GONE);
                courseButton.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
                staticButton.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary_dark));

                //화면전환 작업
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new ScheduleFragment());
                fragmentTransaction.commit();

            }
        });


    }
}