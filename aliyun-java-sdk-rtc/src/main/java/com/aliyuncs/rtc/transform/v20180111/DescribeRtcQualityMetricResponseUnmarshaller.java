/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.PubInfo;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.DataItem4;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.DataItem4.BitRate7;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.DataItem4.Fps5;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.DataItem4.Network8;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.DataItem4.Resolution6;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.EventsItem9;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.User1;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.SubInfo;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.DataItem;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.DataItem.BitRate;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.DataItem.Fps;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.DataItem.Network;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.DataItem.Resolution;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.EventsItem;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcQualityMetricResponseUnmarshaller {

	public static DescribeRtcQualityMetricResponse unmarshall(DescribeRtcQualityMetricResponse describeRtcQualityMetricResponse, UnmarshallerContext _ctx) {
		
		describeRtcQualityMetricResponse.setRequestId(_ctx.stringValue("DescribeRtcQualityMetricResponse.RequestId"));

		QualityMetric qualityMetric = new QualityMetric();

		SubInfo subInfo = new SubInfo();

		User user = new User();
		user.setUserId(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.User.UserId"));
		user.setSDKVersion(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.User.SDKVersion"));
		user.setOS(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.User.OS"));
		user.setProvince(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.User.Province"));
		subInfo.setUser(user);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTime(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].Time"));

			Fps fps = new Fps();
			fps.setSmall(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].Fps.Small"));
			fps.setLarge(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].Fps.Large"));
			fps.set_Super(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].Fps.Super"));
			fps.setShare(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].Fps.Share"));
			dataItem.setFps(fps);

			Resolution resolution = new Resolution();
			resolution.setSmall(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].Resolution.Small"));
			resolution.setLarge(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].Resolution.Large"));
			resolution.set_Super(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].Resolution.Super"));
			resolution.setShare(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].Resolution.Share"));
			dataItem.setResolution(resolution);

			BitRate bitRate = new BitRate();
			bitRate.setAudio(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].BitRate.Audio"));
			bitRate.setSmall(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].BitRate.Small"));
			bitRate.setLarge(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].BitRate.Large"));
			bitRate.set_Super(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].BitRate.Super"));
			bitRate.setShare(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].BitRate.Share"));
			dataItem.setBitRate(bitRate);

			Network network = new Network();
			network.setLoss(_ctx.floatValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].Network.Loss"));
			network.setRtt(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Data["+ i +"].Network.Rtt"));
			dataItem.setNetwork(network);

			data.add(dataItem);
		}
		subInfo.setData(data);

		List<EventsItem> events = new ArrayList<EventsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Events.Length"); i++) {
			EventsItem eventsItem = new EventsItem();
			eventsItem.setTime(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Events["+ i +"].Time"));
			eventsItem.setEventId(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Events["+ i +"].EventId"));
			eventsItem.setName(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Events["+ i +"].Name"));
			eventsItem.setCategory(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Events["+ i +"].Category"));
			eventsItem.setResult(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Events["+ i +"].Result"));
			eventsItem.setDescription(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.SubInfo.Events["+ i +"].Description"));

			events.add(eventsItem);
		}
		subInfo.setEvents(events);
		qualityMetric.setSubInfo(subInfo);

		PubInfo pubInfo = new PubInfo();

		User1 user1 = new User1();
		user1.setUserId(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.User.UserId"));
		user1.setSDKVersion(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.User.SDKVersion"));
		user1.setOS(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.User.OS"));
		user1.setProvince(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.User.Province"));
		pubInfo.setUser1(user1);

		List<DataItem4> data2 = new ArrayList<DataItem4>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data.Length"); i++) {
			DataItem4 dataItem4 = new DataItem4();
			dataItem4.setTime(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].Time"));

			Fps5 fps5 = new Fps5();
			fps5.setSmall(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].Fps.Small"));
			fps5.setLarge(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].Fps.Large"));
			fps5.set_Super(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].Fps.Super"));
			fps5.setShare(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].Fps.Share"));
			dataItem4.setFps5(fps5);

			Resolution6 resolution6 = new Resolution6();
			resolution6.setSmall(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].Resolution.Small"));
			resolution6.setLarge(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].Resolution.Large"));
			resolution6.set_Super(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].Resolution.Super"));
			resolution6.setShare(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].Resolution.Share"));
			dataItem4.setResolution6(resolution6);

			BitRate7 bitRate7 = new BitRate7();
			bitRate7.setAudio(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].BitRate.Audio"));
			bitRate7.setSmall(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].BitRate.Small"));
			bitRate7.setLarge(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].BitRate.Large"));
			bitRate7.set_Super(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].BitRate.Super"));
			bitRate7.setShare(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].BitRate.Share"));
			dataItem4.setBitRate7(bitRate7);

			Network8 network8 = new Network8();
			network8.setLoss(_ctx.floatValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].Network.Loss"));
			network8.setRtt(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Data["+ i +"].Network.Rtt"));
			dataItem4.setNetwork8(network8);

			data2.add(dataItem4);
		}
		pubInfo.setData2(data2);

		List<EventsItem9> events3 = new ArrayList<EventsItem9>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Events.Length"); i++) {
			EventsItem9 eventsItem9 = new EventsItem9();
			eventsItem9.setTime(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Events["+ i +"].Time"));
			eventsItem9.setEventId(_ctx.longValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Events["+ i +"].EventId"));
			eventsItem9.setName(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Events["+ i +"].Name"));
			eventsItem9.setCategory(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Events["+ i +"].Category"));
			eventsItem9.setResult(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Events["+ i +"].Result"));
			eventsItem9.setDescription(_ctx.stringValue("DescribeRtcQualityMetricResponse.QualityMetric.PubInfo.Events["+ i +"].Description"));

			events3.add(eventsItem9);
		}
		pubInfo.setEvents3(events3);
		qualityMetric.setPubInfo(pubInfo);
		describeRtcQualityMetricResponse.setQualityMetric(qualityMetric);
	 
	 	return describeRtcQualityMetricResponse;
	}
}