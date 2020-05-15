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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetMqSofamqConsumerStatusResponse;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqConsumerStatusResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqConsumerStatusResponse.Data.ConnectionSetItem;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoListItem;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoListItem.JstackItem;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoListItem.RunningDataListItem;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoListItem.SubscriptionSetItem;
import com.aliyuncs.sofa.model.v20190815.GetMqSofamqConsumerStatusResponse.Data.DetailInTopicListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMqSofamqConsumerStatusResponseUnmarshaller {

	public static GetMqSofamqConsumerStatusResponse unmarshall(GetMqSofamqConsumerStatusResponse getMqSofamqConsumerStatusResponse, UnmarshallerContext _ctx) {
		
		getMqSofamqConsumerStatusResponse.setRequestId(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.RequestId"));
		getMqSofamqConsumerStatusResponse.setResultCode(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.ResultCode"));
		getMqSofamqConsumerStatusResponse.setResultMessage(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.ResultMessage"));

		Data data = new Data();
		data.setConsumeModel(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumeModel"));
		data.setConsumeTps(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumeTps"));
		data.setDelayTime(_ctx.longValue("GetMqSofamqConsumerStatusResponse.Data.DelayTime"));
		data.setInstanceId(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.InstanceId"));
		data.setLastTimestamp(_ctx.longValue("GetMqSofamqConsumerStatusResponse.Data.LastTimestamp"));
		data.setOnline(_ctx.booleanValue("GetMqSofamqConsumerStatusResponse.Data.Online"));
		data.setRebalanceOk(_ctx.booleanValue("GetMqSofamqConsumerStatusResponse.Data.RebalanceOk"));
		data.setSubscriptionSame(_ctx.booleanValue("GetMqSofamqConsumerStatusResponse.Data.SubscriptionSame"));
		data.setTotalDiff(_ctx.longValue("GetMqSofamqConsumerStatusResponse.Data.TotalDiff"));

		List<ConnectionSetItem> connectionSet = new ArrayList<ConnectionSetItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMqSofamqConsumerStatusResponse.Data.ConnectionSet.Length"); i++) {
			ConnectionSetItem connectionSetItem = new ConnectionSetItem();
			connectionSetItem.setClientAddr(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConnectionSet["+ i +"].ClientAddr"));
			connectionSetItem.setClientId(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConnectionSet["+ i +"].ClientId"));
			connectionSetItem.setLanguage(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConnectionSet["+ i +"].Language"));
			connectionSetItem.setRemoteIp(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConnectionSet["+ i +"].RemoteIp"));
			connectionSetItem.setVersion(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConnectionSet["+ i +"].Version"));

			connectionSet.add(connectionSetItem);
		}
		data.setConnectionSet(connectionSet);

		List<ConsumerConnectionInfoListItem> consumerConnectionInfoList = new ArrayList<ConsumerConnectionInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList.Length"); i++) {
			ConsumerConnectionInfoListItem consumerConnectionInfoListItem = new ConsumerConnectionInfoListItem();
			consumerConnectionInfoListItem.setClientId(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].ClientId"));
			consumerConnectionInfoListItem.setConnection(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Connection"));
			consumerConnectionInfoListItem.setConsumeType(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].ConsumeType"));
			consumerConnectionInfoListItem.setLanguage(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Language"));
			consumerConnectionInfoListItem.setLastTimestamp(_ctx.longValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].LastTimestamp"));
			consumerConnectionInfoListItem.setMessageModel(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].MessageModel"));
			consumerConnectionInfoListItem.setStartTimestamp(_ctx.longValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].StartTimestamp"));
			consumerConnectionInfoListItem.setThreadCount(_ctx.longValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].ThreadCount"));
			consumerConnectionInfoListItem.setVersion(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Version"));

			List<JstackItem> jstack = new ArrayList<JstackItem>();
			for (int j = 0; j < _ctx.lengthValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Jstack.Length"); j++) {
				JstackItem jstackItem = new JstackItem();
				jstackItem.setThread(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Jstack["+ j +"].Thread"));

				List<String> trackList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Jstack["+ j +"].TrackList.Length"); k++) {
					trackList.add(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].Jstack["+ j +"].TrackList["+ k +"]"));
				}
				jstackItem.setTrackList(trackList);

				jstack.add(jstackItem);
			}
			consumerConnectionInfoListItem.setJstack(jstack);

			List<RunningDataListItem> runningDataList = new ArrayList<RunningDataListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList.Length"); j++) {
				RunningDataListItem runningDataListItem = new RunningDataListItem();
				runningDataListItem.setDiff(_ctx.longValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].Diff"));
				runningDataListItem.setFailedCountPerHour(_ctx.longValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].FailedCountPerHour"));
				runningDataListItem.setFailedTps(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].FailedTps"));
				runningDataListItem.setGroupId(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].GroupId"));
				runningDataListItem.setOkTps(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].OkTps"));
				runningDataListItem.setRt(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].Rt"));
				runningDataListItem.setTopic(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].RunningDataList["+ j +"].Topic"));

				runningDataList.add(runningDataListItem);
			}
			consumerConnectionInfoListItem.setRunningDataList(runningDataList);

			List<SubscriptionSetItem> subscriptionSet = new ArrayList<SubscriptionSetItem>();
			for (int j = 0; j < _ctx.lengthValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet.Length"); j++) {
				SubscriptionSetItem subscriptionSetItem = new SubscriptionSetItem();
				subscriptionSetItem.setSubString(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].SubString"));
				subscriptionSetItem.setSubVersion(_ctx.longValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].SubVersion"));
				subscriptionSetItem.setTopic(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].Topic"));

				List<String> tagsSet = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].TagsSet.Length"); k++) {
					tagsSet.add(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.ConsumerConnectionInfoList["+ i +"].SubscriptionSet["+ j +"].TagsSet["+ k +"]"));
				}
				subscriptionSetItem.setTagsSet(tagsSet);

				subscriptionSet.add(subscriptionSetItem);
			}
			consumerConnectionInfoListItem.setSubscriptionSet(subscriptionSet);

			consumerConnectionInfoList.add(consumerConnectionInfoListItem);
		}
		data.setConsumerConnectionInfoList(consumerConnectionInfoList);

		List<DetailInTopicListItem> detailInTopicList = new ArrayList<DetailInTopicListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMqSofamqConsumerStatusResponse.Data.DetailInTopicList.Length"); i++) {
			DetailInTopicListItem detailInTopicListItem = new DetailInTopicListItem();
			detailInTopicListItem.setDelayTime(_ctx.longValue("GetMqSofamqConsumerStatusResponse.Data.DetailInTopicList["+ i +"].DelayTime"));
			detailInTopicListItem.setLastTimestamp(_ctx.longValue("GetMqSofamqConsumerStatusResponse.Data.DetailInTopicList["+ i +"].LastTimestamp"));
			detailInTopicListItem.setTopic(_ctx.stringValue("GetMqSofamqConsumerStatusResponse.Data.DetailInTopicList["+ i +"].Topic"));
			detailInTopicListItem.setTotalDiff(_ctx.longValue("GetMqSofamqConsumerStatusResponse.Data.DetailInTopicList["+ i +"].TotalDiff"));

			detailInTopicList.add(detailInTopicListItem);
		}
		data.setDetailInTopicList(detailInTopicList);
		getMqSofamqConsumerStatusResponse.setData(data);
	 
	 	return getMqSofamqConsumerStatusResponse;
	}
}