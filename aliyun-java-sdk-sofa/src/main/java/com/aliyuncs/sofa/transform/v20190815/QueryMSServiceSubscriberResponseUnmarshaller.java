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

import com.aliyuncs.sofa.model.v20190815.QueryMSServiceSubscriberResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMSServiceSubscriberResponse.SubscribersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMSServiceSubscriberResponseUnmarshaller {

	public static QueryMSServiceSubscriberResponse unmarshall(QueryMSServiceSubscriberResponse queryMSServiceSubscriberResponse, UnmarshallerContext _ctx) {
		
		queryMSServiceSubscriberResponse.setRequestId(_ctx.stringValue("QueryMSServiceSubscriberResponse.RequestId"));
		queryMSServiceSubscriberResponse.setPageNum(_ctx.integerValue("QueryMSServiceSubscriberResponse.PageNum"));
		queryMSServiceSubscriberResponse.setPageSize(_ctx.integerValue("QueryMSServiceSubscriberResponse.PageSize"));
		queryMSServiceSubscriberResponse.setTotalCount(_ctx.integerValue("QueryMSServiceSubscriberResponse.TotalCount"));

		List<SubscribersItem> subscribers = new ArrayList<SubscribersItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMSServiceSubscriberResponse.Subscribers.Length"); i++) {
			SubscribersItem subscribersItem = new SubscribersItem();
			subscribersItem.setAppName(_ctx.stringValue("QueryMSServiceSubscriberResponse.Subscribers["+ i +"].AppName"));
			subscribersItem.setDataId(_ctx.stringValue("QueryMSServiceSubscriberResponse.Subscribers["+ i +"].DataId"));
			subscribersItem.setHostIp(_ctx.stringValue("QueryMSServiceSubscriberResponse.Subscribers["+ i +"].HostIp"));
			subscribersItem.setInstanceId(_ctx.stringValue("QueryMSServiceSubscriberResponse.Subscribers["+ i +"].InstanceId"));
			subscribersItem.setZone(_ctx.stringValue("QueryMSServiceSubscriberResponse.Subscribers["+ i +"].Zone"));

			subscribers.add(subscribersItem);
		}
		queryMSServiceSubscriberResponse.setSubscribers(subscribers);
	 
	 	return queryMSServiceSubscriberResponse;
	}
}