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

import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqGroupSubDetailResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqGroupSubDetailResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqGroupSubDetailResponse.Data.SubscriptionDataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqSofamqGroupSubDetailResponseUnmarshaller {

	public static QueryMqSofamqGroupSubDetailResponse unmarshall(QueryMqSofamqGroupSubDetailResponse queryMqSofamqGroupSubDetailResponse, UnmarshallerContext _ctx) {
		
		queryMqSofamqGroupSubDetailResponse.setRequestId(_ctx.stringValue("QueryMqSofamqGroupSubDetailResponse.RequestId"));
		queryMqSofamqGroupSubDetailResponse.setResultCode(_ctx.stringValue("QueryMqSofamqGroupSubDetailResponse.ResultCode"));
		queryMqSofamqGroupSubDetailResponse.setResultMessage(_ctx.stringValue("QueryMqSofamqGroupSubDetailResponse.ResultMessage"));

		Data data = new Data();
		data.setGroupId(_ctx.stringValue("QueryMqSofamqGroupSubDetailResponse.Data.GroupId"));
		data.setMessageModel(_ctx.stringValue("QueryMqSofamqGroupSubDetailResponse.Data.MessageModel"));
		data.setOnline(_ctx.booleanValue("QueryMqSofamqGroupSubDetailResponse.Data.Online"));

		List<SubscriptionDataListItem> subscriptionDataList = new ArrayList<SubscriptionDataListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMqSofamqGroupSubDetailResponse.Data.SubscriptionDataList.Length"); i++) {
			SubscriptionDataListItem subscriptionDataListItem = new SubscriptionDataListItem();
			subscriptionDataListItem.setOnline(_ctx.booleanValue("QueryMqSofamqGroupSubDetailResponse.Data.SubscriptionDataList["+ i +"].Online"));
			subscriptionDataListItem.setSubString(_ctx.stringValue("QueryMqSofamqGroupSubDetailResponse.Data.SubscriptionDataList["+ i +"].SubString"));
			subscriptionDataListItem.setTopic(_ctx.stringValue("QueryMqSofamqGroupSubDetailResponse.Data.SubscriptionDataList["+ i +"].Topic"));

			subscriptionDataList.add(subscriptionDataListItem);
		}
		data.setSubscriptionDataList(subscriptionDataList);
		queryMqSofamqGroupSubDetailResponse.setData(data);
	 
	 	return queryMqSofamqGroupSubDetailResponse;
	}
}