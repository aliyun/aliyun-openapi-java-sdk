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

package com.aliyuncs.ons.transform.v20190214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20190214.OnsConsumerStatusResponse;
import com.aliyuncs.ons.model.v20190214.OnsConsumerStatusResponse.Data;
import com.aliyuncs.ons.model.v20190214.OnsConsumerStatusResponse.Data.ConnectionDo;
import com.aliyuncs.ons.model.v20190214.OnsConsumerStatusResponse.Data.ConsumerConnectionInfoDo;
import com.aliyuncs.ons.model.v20190214.OnsConsumerStatusResponse.Data.ConsumerConnectionInfoDo.ConsumerRunningDataDo;
import com.aliyuncs.ons.model.v20190214.OnsConsumerStatusResponse.Data.ConsumerConnectionInfoDo.SubscriptionData;
import com.aliyuncs.ons.model.v20190214.OnsConsumerStatusResponse.Data.ConsumerConnectionInfoDo.ThreadTrackDo;
import com.aliyuncs.ons.model.v20190214.OnsConsumerStatusResponse.Data.DetailInTopicDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsConsumerStatusResponseUnmarshaller {

	public static OnsConsumerStatusResponse unmarshall(OnsConsumerStatusResponse onsConsumerStatusResponse, UnmarshallerContext _ctx) {
		
		onsConsumerStatusResponse.setRequestId(_ctx.stringValue("OnsConsumerStatusResponse.RequestId"));
		onsConsumerStatusResponse.setHelpUrl(_ctx.stringValue("OnsConsumerStatusResponse.HelpUrl"));

		Data data = new Data();
		data.setConsumeTps(_ctx.floatValue("OnsConsumerStatusResponse.Data.ConsumeTps"));
		data.setConsumeModel(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConsumeModel"));
		data.setTotalDiff(_ctx.longValue("OnsConsumerStatusResponse.Data.TotalDiff"));
		data.setInstanceId(_ctx.stringValue("OnsConsumerStatusResponse.Data.InstanceId"));
		data.setSubscriptionSame(_ctx.booleanValue("OnsConsumerStatusResponse.Data.SubscriptionSame"));
		data.setDelayTime(_ctx.longValue("OnsConsumerStatusResponse.Data.DelayTime"));
		data.setLastTimestamp(_ctx.longValue("OnsConsumerStatusResponse.Data.LastTimestamp"));
		data.setOnline(_ctx.booleanValue("OnsConsumerStatusResponse.Data.Online"));
		data.setRebalanceOK(_ctx.booleanValue("OnsConsumerStatusResponse.Data.RebalanceOK"));

		List<ConnectionDo> connectionSet = new ArrayList<ConnectionDo>();
		for (int i = 0; i < _ctx.lengthValue("OnsConsumerStatusResponse.Data.ConnectionSet.Length"); i++) {
			ConnectionDo connectionDo = new ConnectionDo();
			connectionDo.setRemoteIP(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConnectionSet["+ i +"].RemoteIP"));
			connectionDo.setVersion(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConnectionSet["+ i +"].Version"));
			connectionDo.setClientAddr(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConnectionSet["+ i +"].ClientAddr"));
			connectionDo.setLanguage(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConnectionSet["+ i +"].Language"));
			connectionDo.setClientId(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConnectionSet["+ i +"].ClientId"));

			connectionSet.add(connectionDo);
		}
		data.setConnectionSet(connectionSet);

		List<ConsumerConnectionInfoDo> consumerConnectionInfoList = new ArrayList<ConsumerConnectionInfoDo>();
		for (int i = 0; i < _ctx.lengthValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList.Length"); i++) {
			ConsumerConnectionInfoDo consumerConnectionInfoDo = new ConsumerConnectionInfoDo();
			consumerConnectionInfoDo.setConsumeModel(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].ConsumeModel"));
			consumerConnectionInfoDo.setLastTimeStamp(_ctx.longValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].LastTimeStamp"));
			consumerConnectionInfoDo.setStartTimeStamp(_ctx.longValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].StartTimeStamp"));
			consumerConnectionInfoDo.setLanguage(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Language"));
			consumerConnectionInfoDo.setClientId(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].ClientId"));
			consumerConnectionInfoDo.setConnection(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Connection"));
			consumerConnectionInfoDo.setVersion(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Version"));
			consumerConnectionInfoDo.setConsumeType(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].ConsumeType"));
			consumerConnectionInfoDo.setThreadCount(_ctx.integerValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].ThreadCount"));

			List<ConsumerRunningDataDo> runningDataList = new ArrayList<ConsumerRunningDataDo>();
			for (int j = 0; j < _ctx.lengthValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList.Length"); j++) {
				ConsumerRunningDataDo consumerRunningDataDo = new ConsumerRunningDataDo();
				consumerRunningDataDo.setGroupId(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].GroupId"));
				consumerRunningDataDo.setRt(_ctx.floatValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].Rt"));
				consumerRunningDataDo.setTopic(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].Topic"));
				consumerRunningDataDo.setFailedCountPerHour(_ctx.longValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].FailedCountPerHour"));
				consumerRunningDataDo.setOkTps(_ctx.floatValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].OkTps"));
				consumerRunningDataDo.setFailedTps(_ctx.floatValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].FailedTps"));

				runningDataList.add(consumerRunningDataDo);
			}
			consumerConnectionInfoDo.setRunningDataList(runningDataList);

			List<SubscriptionData> subscriptionSet = new ArrayList<SubscriptionData>();
			for (int j = 0; j < _ctx.lengthValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet.Length"); j++) {
				SubscriptionData subscriptionData = new SubscriptionData();
				subscriptionData.setSubString(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].SubString"));
				subscriptionData.setSubVersion(_ctx.longValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].SubVersion"));
				subscriptionData.setTopic(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].Topic"));

				List<String> tagsSet = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].TagsSet.Length"); k++) {
					tagsSet.add(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].TagsSet["+ k +"]"));
				}
				subscriptionData.setTagsSet(tagsSet);

				subscriptionSet.add(subscriptionData);
			}
			consumerConnectionInfoDo.setSubscriptionSet(subscriptionSet);

			List<ThreadTrackDo> jstack = new ArrayList<ThreadTrackDo>();
			for (int j = 0; j < _ctx.lengthValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Jstack.Length"); j++) {
				ThreadTrackDo threadTrackDo = new ThreadTrackDo();
				threadTrackDo.setThread(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Jstack["+ j +"].Thread"));

				List<String> trackList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Jstack["+ j +"].TrackList.Length"); k++) {
					trackList.add(_ctx.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Jstack["+ j +"].TrackList["+ k +"]"));
				}
				threadTrackDo.setTrackList(trackList);

				jstack.add(threadTrackDo);
			}
			consumerConnectionInfoDo.setJstack(jstack);

			consumerConnectionInfoList.add(consumerConnectionInfoDo);
		}
		data.setConsumerConnectionInfoList(consumerConnectionInfoList);

		List<DetailInTopicDo> detailInTopicList = new ArrayList<DetailInTopicDo>();
		for (int i = 0; i < _ctx.lengthValue("OnsConsumerStatusResponse.Data.DetailInTopicList.Length"); i++) {
			DetailInTopicDo detailInTopicDo = new DetailInTopicDo();
			detailInTopicDo.setDelayTime(_ctx.longValue("OnsConsumerStatusResponse.Data.DetailInTopicList["+ i +"].DelayTime"));
			detailInTopicDo.setTotalDiff(_ctx.longValue("OnsConsumerStatusResponse.Data.DetailInTopicList["+ i +"].TotalDiff"));
			detailInTopicDo.setLastTimestamp(_ctx.longValue("OnsConsumerStatusResponse.Data.DetailInTopicList["+ i +"].LastTimestamp"));
			detailInTopicDo.setTopic(_ctx.stringValue("OnsConsumerStatusResponse.Data.DetailInTopicList["+ i +"].Topic"));

			detailInTopicList.add(detailInTopicDo);
		}
		data.setDetailInTopicList(detailInTopicList);
		onsConsumerStatusResponse.setData(data);
	 
	 	return onsConsumerStatusResponse;
	}
}