## 数据处理流程

由 http://www.weather.com.cn/weather1d/XXXXXXXXX.shtml 可获得如下天气信息，其中XXXXXXXXX表示城市编码

### 当前天气信息

		天气情况综述：html->body->div.con.today.clearfix->div.left.fl->div#today->input#hidden_title

		更新时间：html->body->div.con.today.clearfix->div.left.fl->div#today->input#update_time

		相对湿度：html->body->div.con.today.clearfix->div.left.fl->div#today->div.t->div.sk->div.zs.h->span+em

		风：html->body->div.con.today.clearfix->div.left.fl->div#today->div.t->div.sk->div.zs.w->span+em

		温度：html->body->div.con.today.clearfix->div.left.fl->div#today->div.t->div.sk->div.tem->span+em

		空气质量：html->body->div.con.today.clearfix->div.left.fl->div#today->div.t->div.sk->div.zs.pol->span->a

### 整点天气信息
    html->body->div.con.today.clearfix->div.left.fl->script

		var: observe24h_data
		{
		                "od21":"12",  //时间整点数
		                "od22":"15",  //温度 ℃
		                "od23":"293",  //pm10指数 μg/m³
		                "od24":"西北风", //风向
		                "od25":"1",    //风力 级
		                "od26":"0",    //降水量 mm
		                "od27":"53",  //相对湿度 %
		                "od28":"31"  //空气质量指数AQI
		}

### 生活指数信息

		紫外线指数：html->body->div.con.today.clearfix->div.left.fl->div.livezs->ul.clearfix->li.li1.hot->span+em+p

		感冒指数：html->body->div.con.today.clearfix->div.left.fl->div.livezs->ul.clearfix->li.li2.hot->span+em+p

		穿衣指数：html->body->div.con.today.clearfix->div.left.fl->div.livezs->ul.clearfix->li.li3.hot->span+em+p

		洗车指数：html->body->div.con.today.clearfix->div.left.fl->div.livezs->ul.clearfix->li.li4.hot->span+em+p

		运动指数：html->body->div.con.today.clearfix->div.left.fl->div.livezs->ul.clearfix->li.li5.hot->span+em+p

		空气污染扩散指数：html->body->div.con.today.clearfix->div.left.fl->div.livezs->ul.clearfix->li.li6.hot->span+em+p
