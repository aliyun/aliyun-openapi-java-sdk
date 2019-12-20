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

import com.aliyuncs.ons.model.v20190214.OnsGroupSubDetailResponse;
import com.aliyuncs.ons.model.v20190214.OnsGroupSubDetailResponse.Data;
import com.aliyuncs.ons.model.v20190214.OnsGroupSubDetailResponse.Data.SubscriptionDataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsGroupSubDetailResponseUnmarshaller {

	public static OnsGroupSubDetailResponse unmarshall(OnsGroupSubDetailResponse onsGroupSubDetailResponse, UnmarshallerContext _ctx) {
		
		onsGroupSubDetailResponse.setRequestId(_ctx.stringValue("OnsGroupSubDetailResponse.RequestId"));

		Data data = new Data();
		data.setGroupId(_ctx.stringValue("OnsGroupSubDetailResponse.Data.GroupId"));
		data.setOnline(_ctx.booleanValue("OnsGroupSubDetailResponse.Data.Online"));
		data.setMessageModel(_ctx.stringValue("OnsGroupSubDetailResponse.Data.MessageModel"));

		List<SubscriptionDataListItem> subscriptionDataList = new ArrayList<SubscriptionDataListItem>();
		for (int i = 0; i < _ctx.lengthValue("OnsGroupSubDetailResponse.Data.SubscriptionDataList.Length"); i++) {
			SubscriptionDataListItem subscriptionDataListItem = new SubscriptionDataListItem();
			subscriptionDataListItem.setTopic(_ctx.stringValue("OnsGroupSubDetailResponse.Data.SubscriptionDataList["+ i +"].Topic"));
			subscriptionDataListItem.setSubString(_ctx.stringValue("OnsGroupSubDetailResponse.Data.SubscriptionDataList["+ i +"].SubString"));

			subscriptionDataList.add(subscriptionDataListItem);
		}
		data.setSubscriptionDataList(subscriptionDataList);
		onsGroupSubDetailResponse.setData(data);
	 
	 	return onsGroupSubDetailResponse;
	}
}