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

import com.aliyuncs.ons.model.v20190214.OnsTopicSubDetailResponse;
import com.aliyuncs.ons.model.v20190214.OnsTopicSubDetailResponse.Data;
import com.aliyuncs.ons.model.v20190214.OnsTopicSubDetailResponse.Data.SubscriptionDataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsTopicSubDetailResponseUnmarshaller {

	public static OnsTopicSubDetailResponse unmarshall(OnsTopicSubDetailResponse onsTopicSubDetailResponse, UnmarshallerContext context) {
		
		onsTopicSubDetailResponse.setRequestId(context.stringValue("OnsTopicSubDetailResponse.RequestId"));

		Data data = new Data();
		data.setTopic(context.stringValue("OnsTopicSubDetailResponse.Data.Topic"));

		List<SubscriptionDataListItem> subscriptionDataList = new ArrayList<SubscriptionDataListItem>();
		for (int i = 0; i < context.lengthValue("OnsTopicSubDetailResponse.Data.SubscriptionDataList.Length"); i++) {
			SubscriptionDataListItem subscriptionDataListItem = new SubscriptionDataListItem();
			subscriptionDataListItem.setGroupId(context.stringValue("OnsTopicSubDetailResponse.Data.SubscriptionDataList["+ i +"].GroupId"));
			subscriptionDataListItem.setSubString(context.stringValue("OnsTopicSubDetailResponse.Data.SubscriptionDataList["+ i +"].SubString"));
			subscriptionDataListItem.setMessageModel(context.stringValue("OnsTopicSubDetailResponse.Data.SubscriptionDataList["+ i +"].MessageModel"));

			subscriptionDataList.add(subscriptionDataListItem);
		}
		data.setSubscriptionDataList(subscriptionDataList);
		onsTopicSubDetailResponse.setData(data);
	 
	 	return onsTopicSubDetailResponse;
	}
}