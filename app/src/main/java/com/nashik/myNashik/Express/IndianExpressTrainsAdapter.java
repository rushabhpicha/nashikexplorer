package com.nashik.myNashik.Express;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nashik.myNashik.dreams.R;

import java.util.ArrayList;

public class IndianExpressTrainsAdapter extends ArrayAdapter<IndianExpressTrains> {
    ArrayList<IndianExpressTrains> data = new ArrayList();
    String destination;
    int layoutResourceId;
    Context mContext;
    String source;

    final class MyResult {
        private final int first;
        private final String second;

        public MyResult(int first, String second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return this.first;
        }

        public String getSecond() {
            return this.second;
        }
    }

    class UserHolder {
        LinearLayout layoutDay;
        CardView mCardView;
        TextView txtalldays;
        TextView txtfri;
        TextView txtlivestatus;
        TextView txtmon;
        TextView txtname;
        TextView txtnotitle;
        TextView txtnumber;
        TextView txtsat;
        TextView txtsun;
        TextView txtthu;
        TextView txttime;
        TextView txttimetitle;
        TextView txttue;
        TextView txtwed;

        UserHolder() {
        }
    }

    public IndianExpressTrainsAdapter(Context context, int layoutResourceId, ArrayList<IndianExpressTrains> data, String source, String destination) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.mContext = context;
        this.data = data;
        this.source = source;
        this.destination = destination;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        UserHolder holder;
        View row = convertView;
        if (row == null) {
            row = ((Activity) this.mContext).getLayoutInflater().inflate(this.layoutResourceId, parent, false);
            holder = new UserHolder();
            holder.txtname = (TextView) row.findViewById(R.id.trainname);
            holder.txtnumber = (TextView) row.findViewById(R.id.expno);
            holder.txttime = (TextView) row.findViewById(R.id.exptime);
            holder.txtnotitle = (TextView) row.findViewById(R.id.expnotitle);
            holder.txttimetitle = (TextView) row.findViewById(R.id.exptimetitle);
//            holder.txtlivestatus = (TextView) row.findViewById(R.id.livestatus);
            holder.txtsun = (TextView) row.findViewById(R.id.expsun);
            holder.txtmon = (TextView) row.findViewById(R.id.expmon);
            holder.txttue = (TextView) row.findViewById(R.id.exptue);
            holder.txtwed = (TextView) row.findViewById(R.id.expwed);
            holder.txtthu = (TextView) row.findViewById(R.id.expthu);
            holder.txtfri = (TextView) row.findViewById(R.id.expfri);
            holder.txtsat = (TextView) row.findViewById(R.id.expsat);
            holder.txtalldays = (TextView) row.findViewById(R.id.weekly);
            holder.layoutDay = (LinearLayout) row.findViewById(R.id.layoutday);
            holder.mCardView = (CardView) row.findViewById(R.id.result_card);
            row.setTag(holder);
        } else {
            holder = (UserHolder) row.getTag();
        }
        final IndianExpressTrains user = (IndianExpressTrains) this.data.get(position);
        holder.txtname.setText(user.getTrainName());
        holder.txtnumber.setText(user.getTrainNumber());
        holder.txttime.setText(user.getTime());
        MyResult result = checkalldays(user);
        if (result.getFirst() == 1 || result.getFirst() == 7) {
            holder.layoutDay.setVisibility(8);
            holder.txtalldays.setVisibility(0);
        } else {
            String aaa = user.getSun() + " " + user.getMon() + " " + user.getTue() + " " + user.getWed() + " " + user.getThu() + " " + user.getFri() + " " + user.getSat();
            if (user.getDate_plus() == 0) {
                if (aaa.contains("Mon")) {
                    holder.txttue.setText("Tue");
                } else {
                    holder.txttue.setText("-");
                }
                if (aaa.contains("Tue")) {
                    holder.txtwed.setText("Wed");
                } else {
                    holder.txtwed.setText("-");
                }
                if (aaa.contains("Wed")) {
                    holder.txtthu.setText("Thu");
                } else {
                    holder.txtthu.setText("-");
                }
                if (aaa.contains("Thu")) {
                    holder.txtfri.setText("Fri");
                } else {
                    holder.txtfri.setText("-");
                }
                if (aaa.contains("Fri")) {
                    holder.txtsat.setText("Sat");
                } else {
                    holder.txtsat.setText("-");
                }
                if (aaa.contains("Sat")) {
                    holder.txtsun.setText("Sun");
                } else {
                    holder.txtsun.setText("-");
                }
                if (aaa.contains("Sun")) {
                    holder.txtmon.setText("Mon");
                } else {
                    holder.txtmon.setText("-");
                }
            } else if (user.getDate_plus() == 1) {
                if (aaa.contains("Mon")) {
                    holder.txtwed.setText("Wed");
                } else {
                    holder.txtwed.setText("-");
                }
                if (aaa.contains("Tue")) {
                    holder.txtthu.setText("Thu");
                } else {
                    holder.txtthu.setText("-");
                }
                if (aaa.contains("Wed")) {
                    holder.txtfri.setText("Fri");
                } else {
                    holder.txtfri.setText("-");
                }
                if (aaa.contains("Thu")) {
                    holder.txtsat.setText("Sat");
                } else {
                    holder.txtsat.setText("-");
                }
                if (aaa.contains("Fri")) {
                    holder.txtsun.setText("Sun");
                } else {
                    holder.txtsun.setText("-");
                }
                if (aaa.contains("Sat")) {
                    holder.txtmon.setText("Mon");
                } else {
                    holder.txtmon.setText("-");
                }
                if (aaa.contains("Sun")) {
                    holder.txttue.setText("tue");
                } else {
                    holder.txttue.setText("-");
                }
            } else {
                holder.txtsun.setText(user.getSun());
                holder.txtmon.setText(user.getMon());
                holder.txttue.setText(user.getTue());
                holder.txtwed.setText(user.getWed());
                holder.txtthu.setText(user.getThu());
                holder.txtfri.setText(user.getFri());
                holder.txtsat.setText(user.getSat());
            }
            holder.layoutDay.setVisibility(0);
            holder.txtalldays.setVisibility(8);
        }
        if (result.getFirst() == 1) {
            holder.txtalldays.setText("Weekly Available on " + getCurrentDay(result.getSecond(), user.getDate_plus()));
        } else if (result.getFirst() == 7) {
            holder.txtalldays.setText("Daily Available");
        }
        holder.txtname.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                IndianExpressTrainsAdapter.this.calltoschedule(user.getTrainNumber(), user.getTrainName());
            }
        });
        holder.txtnumber.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                IndianExpressTrainsAdapter.this.calltoschedule(user.getTrainNumber(), user.getTrainName());
            }
        });
        holder.txtnotitle.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                IndianExpressTrainsAdapter.this.calltoschedule(user.getTrainNumber(), user.getTrainName());
            }
        });
        holder.txttime.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                IndianExpressTrainsAdapter.this.calltoschedule(user.getTrainNumber(), user.getTrainName());
            }
        });
        holder.txttimetitle.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                IndianExpressTrainsAdapter.this.calltoschedule(user.getTrainNumber(), user.getTrainName());
            }
        });
        holder.txtalldays.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                IndianExpressTrainsAdapter.this.calltoschedule(user.getTrainNumber(), user.getTrainName());
            }
        });
        return row;
    }

    public void calltoschedule(String number, String name) {
      //  PreferenceUtils.setPrefStoreLastsearch(this.mContext, BuildConfig.FLAVOR + number + "-" + name);
        Intent intent = new Intent(this.mContext, Express_schedule.class);
        intent.putExtra("number", number);
        intent.putExtra("tname", name);
        intent.putExtra("source", this.source);
        intent.putExtra("destination", this.destination);
        this.mContext.startActivity(intent);
    }

    public MyResult checkalldays(IndianExpressTrains user) {
        int count = 0;
        String day = "";
        if (user.getSun().equals("Sun")) {
            count = 0 + 1;
            day = "Sunday";
        }
        if (user.getMon().equals("Mon")) {
            count++;
            day = "Monday";
        }
        if (user.getTue().equals("Tue")) {
            count++;
            day = "Tuesday";
        }
        if (user.getWed().equals("Wed")) {
            count++;
            day = "Wednesday";
        }
        if (user.getThu().equals("Thu")) {
            count++;
            day = "Thursday";
        }
        if (user.getFri().equals("Fri")) {
            count++;
            day = "Friday";
        }
        if (user.getSat().equals("Sat")) {
            count++;
            day = "Saturday";
        }
        return new MyResult(count, day);
    }

    public String getCurrentDay(String day, int count) {
        int k = 0;
        if (count == 0) {
            return day;
        }
        String[] daysArray = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int i = 0; i < daysArray.length; i++) {
            if (daysArray[i].contains(day)) {
                k = i;
            }
        }
        return daysArray[(k + count) % 7];
    }
}
