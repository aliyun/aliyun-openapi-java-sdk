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

import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqTopicSubDetailResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqTopicSubDetailResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqTopicSubDetailResponse.Data.SubscriptionDataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqSofamqTopicSubDetailResponseUnmarshaller {

	public static QueryMqSofamqTopicSubDetailResponse unmarshall(QueryMqSofamqTopicSubDetailResponse queryMqSofamqTopicSubDetailResponse, UnmarshallerContext _ctx) {
		
		queryMqSofamqTopicSubDetailResponse.setRequestId(_ctx.stringValue("QueryMqSofamqTopicSubDetailResponse.RequestId"));
		queryMqSofamqTopicSubDetailResponse.setResultCode(_ctx.stringValue("QueryMqSofamqTopicSubDetailResponse.ResultCode"));
		queryMqSofamqTopicSubDetailResponse.setResultMessage(_ctx.stringValue("QueryMqSofamqTopicSubDetailResponse.ResultMessage"));

		Data data = new Data();
		data.setLatestSendTime(_ctx.longValue("QueryMqSofamqTopicSubDetailResponse.Data.LatestSendTime"));
		data.setTopic(_ctx.stringValue("QueryMqSofamqTopicSubDetailResponse.Data.Topic"));

		List<SubscriptionDataListItem> subscriptionDataList = new ArrayList<SubscriptionDataListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMqSofamqTopicSubDetailResponse.Data.SubscriptionDataList.Length"); i++) {
			SubscriptionDataListItem subscriptionDataListItem = new SubscriptionDataListItem();
			subscriptionDataListItem.setGroupId(_ctx.stringValue("QueryMqSofamqTopicSubDetailResponse.Data.SubscriptionDataList["+ i +"].GroupId"));
			subscriptionDataListItem.setMessageModel(_ctx.stringValue("QueryMqSofamqTopicSubDetailResponse.Data.SubscriptionDataList["+ i +"].MessageModel"));
			subscriptionDataListItem.setSubString(_ctx.stringValue("QueryMqSofamqTopicSubDetailResponse.Data.SubscriptionDataList["+ i +"].SubString"));

			subscriptionDataList.add(subscriptionDataListItem);
		}
		data.setSubscriptionDataList(subscriptionDataList);
		queryMqSofamqTopicSubDetailResponse.setData(data);
	 
	 	return queryMqSofamqTopicSubDetailResponse;
	}
}