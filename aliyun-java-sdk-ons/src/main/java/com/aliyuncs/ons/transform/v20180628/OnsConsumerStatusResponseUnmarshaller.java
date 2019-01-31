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

package com.aliyuncs.ons.transform.v20180628;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20180628.OnsConsumerStatusResponse;
import com.aliyuncs.ons.model.v20180628.OnsConsumerStatusResponse.Data;
import com.aliyuncs.ons.model.v20180628.OnsConsumerStatusResponse.Data.ConnectionDo;
import com.aliyuncs.ons.model.v20180628.OnsConsumerStatusResponse.Data.ConsumerConnectionInfoDo;
import com.aliyuncs.ons.model.v20180628.OnsConsumerStatusResponse.Data.ConsumerConnectionInfoDo.ConsumerRunningDataDo;
import com.aliyuncs.ons.model.v20180628.OnsConsumerStatusResponse.Data.ConsumerConnectionInfoDo.SubscriptionData;
import com.aliyuncs.ons.model.v20180628.OnsConsumerStatusResponse.Data.ConsumerConnectionInfoDo.ThreadTrackDo;
import com.aliyuncs.ons.model.v20180628.OnsConsumerStatusResponse.Data.DetailInTopicDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsConsumerStatusResponseUnmarshaller {

	public static OnsConsumerStatusResponse unmarshall(OnsConsumerStatusResponse onsConsumerStatusResponse, UnmarshallerContext context) {
		
		onsConsumerStatusResponse.setRequestId(context.stringValue("OnsConsumerStatusResponse.RequestId"));
		onsConsumerStatusResponse.setHelpUrl(context.stringValue("OnsConsumerStatusResponse.HelpUrl"));

		Data data = new Data();
		data.setOnline(context.booleanValue("OnsConsumerStatusResponse.Data.Online"));
		data.setTotalDiff(context.longValue("OnsConsumerStatusResponse.Data.TotalDiff"));
		data.setConsumeTps(context.floatValue("OnsConsumerStatusResponse.Data.ConsumeTps"));
		data.setLastTimestamp(context.longValue("OnsConsumerStatusResponse.Data.LastTimestamp"));
		data.setDelayTime(context.longValue("OnsConsumerStatusResponse.Data.DelayTime"));
		data.setConsumeModel(context.stringValue("OnsConsumerStatusResponse.Data.ConsumeModel"));
		data.setSubscriptionSame(context.booleanValue("OnsConsumerStatusResponse.Data.SubscriptionSame"));
		data.setRebalanceOK(context.booleanValue("OnsConsumerStatusResponse.Data.RebalanceOK"));
		data.setInstanceId(context.stringValue("OnsConsumerStatusResponse.Data.InstanceId"));

		List<ConnectionDo> connectionSet = new ArrayList<ConnectionDo>();
		for (int i = 0; i < context.lengthValue("OnsConsumerStatusResponse.Data.ConnectionSet.Length"); i++) {
			ConnectionDo connectionDo = new ConnectionDo();
			connectionDo.setClientId(context.stringValue("OnsConsumerStatusResponse.Data.ConnectionSet["+ i +"].ClientId"));
			connectionDo.setClientAddr(context.stringValue("OnsConsumerStatusResponse.Data.ConnectionSet["+ i +"].ClientAddr"));
			connectionDo.setLanguage(context.stringValue("OnsConsumerStatusResponse.Data.ConnectionSet["+ i +"].Language"));
			connectionDo.setVersion(context.stringValue("OnsConsumerStatusResponse.Data.ConnectionSet["+ i +"].Version"));

			connectionSet.add(connectionDo);
		}
		data.setConnectionSet(connectionSet);

		List<DetailInTopicDo> detailInTopicList = new ArrayList<DetailInTopicDo>();
		for (int i = 0; i < context.lengthValue("OnsConsumerStatusResponse.Data.DetailInTopicList.Length"); i++) {
			DetailInTopicDo detailInTopicDo = new DetailInTopicDo();
			detailInTopicDo.setTopic(context.stringValue("OnsConsumerStatusResponse.Data.DetailInTopicList["+ i +"].Topic"));
			detailInTopicDo.setTotalDiff(context.longValue("OnsConsumerStatusResponse.Data.DetailInTopicList["+ i +"].TotalDiff"));
			detailInTopicDo.setLastTimestamp(context.longValue("OnsConsumerStatusResponse.Data.DetailInTopicList["+ i +"].LastTimestamp"));
			detailInTopicDo.setDelayTime(context.longValue("OnsConsumerStatusResponse.Data.DetailInTopicList["+ i +"].DelayTime"));

			detailInTopicList.add(detailInTopicDo);
		}
		data.setDetailInTopicList(detailInTopicList);

		List<ConsumerConnectionInfoDo> consumerConnectionInfoList = new ArrayList<ConsumerConnectionInfoDo>();
		for (int i = 0; i < context.lengthValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList.Length"); i++) {
			ConsumerConnectionInfoDo consumerConnectionInfoDo = new ConsumerConnectionInfoDo();
			consumerConnectionInfoDo.setClientId(context.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].ClientId"));
			consumerConnectionInfoDo.setConnection(context.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Connection"));
			consumerConnectionInfoDo.setLanguage(context.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Language"));
			consumerConnectionInfoDo.setVersion(context.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Version"));
			consumerConnectionInfoDo.setConsumeModel(context.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].ConsumeModel"));
			consumerConnectionInfoDo.setConsumeType(context.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].ConsumeType"));
			consumerConnectionInfoDo.setThreadCount(context.integerValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].ThreadCount"));
			consumerConnectionInfoDo.setStartTimeStamp(context.longValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].StartTimeStamp"));
			consumerConnectionInfoDo.setLastTimeStamp(context.longValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].LastTimeStamp"));

			List<SubscriptionData> subscriptionSet = new ArrayList<SubscriptionData>();
			for (int j = 0; j < context.lengthValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet.Length"); j++) {
				SubscriptionData subscriptionData = new SubscriptionData();
				subscriptionData.setTopic(context.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].Topic"));
				subscriptionData.setSubString(context.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].SubString"));
				subscriptionData.setSubVersion(context.longValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].SubVersion"));

				List<String> tagsSet = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].TagsSet.Length"); k++) {
					tagsSet.add(context.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].TagsSet["+ k +"]"));
				}
				subscriptionData.setTagsSet(tagsSet);

				subscriptionSet.add(subscriptionData);
			}
			consumerConnectionInfoDo.setSubscriptionSet(subscriptionSet);

			List<ConsumerRunningDataDo> runningDataList = new ArrayList<ConsumerRunningDataDo>();
			for (int j = 0; j < context.lengthValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList.Length"); j++) {
				ConsumerRunningDataDo consumerRunningDataDo = new ConsumerRunningDataDo();
				consumerRunningDataDo.setGroupId(context.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].GroupId"));
				consumerRunningDataDo.setTopic(context.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].Topic"));
				consumerRunningDataDo.setRt(context.floatValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].Rt"));
				consumerRunningDataDo.setOkTps(context.floatValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].OkTps"));
				consumerRunningDataDo.setFailedTps(context.floatValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].FailedTps"));
				consumerRunningDataDo.setFailedCountPerHour(context.longValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].FailedCountPerHour"));

				runningDataList.add(consumerRunningDataDo);
			}
			consumerConnectionInfoDo.setRunningDataList(runningDataList);

			List<ThreadTrackDo> jstack = new ArrayList<ThreadTrackDo>();
			for (int j = 0; j < context.lengthValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Jstack.Length"); j++) {
				ThreadTrackDo threadTrackDo = new ThreadTrackDo();
				threadTrackDo.setThread(context.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Jstack["+ j +"].Thread"));

				List<String> trackList = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Jstack["+ j +"].TrackList.Length"); k++) {
					trackList.add(context.stringValue("OnsConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Jstack["+ j +"].TrackList["+ k +"]"));
				}
				threadTrackDo.setTrackList(trackList);

				jstack.add(threadTrackDo);
			}
			consumerConnectionInfoDo.setJstack(jstack);

			consumerConnectionInfoList.add(consumerConnectionInfoDo);
		}
		data.setConsumerConnectionInfoList(consumerConnectionInfoList);
		onsConsumerStatusResponse.setData(data);
	 
	 	return onsConsumerStatusResponse;
	}
}