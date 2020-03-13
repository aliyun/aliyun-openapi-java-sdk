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

import com.aliyuncs.sofa.model.v20190815.QueryMsSgServiceSubscribersResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsSgServiceSubscribersResponse.SubscribersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsSgServiceSubscribersResponseUnmarshaller {

	public static QueryMsSgServiceSubscribersResponse unmarshall(QueryMsSgServiceSubscribersResponse queryMsSgServiceSubscribersResponse, UnmarshallerContext _ctx) {
		
		queryMsSgServiceSubscribersResponse.setRequestId(_ctx.stringValue("QueryMsSgServiceSubscribersResponse.RequestId"));
		queryMsSgServiceSubscribersResponse.setResultCode(_ctx.stringValue("QueryMsSgServiceSubscribersResponse.ResultCode"));
		queryMsSgServiceSubscribersResponse.setResultMessage(_ctx.stringValue("QueryMsSgServiceSubscribersResponse.ResultMessage"));
		queryMsSgServiceSubscribersResponse.setCurrentPage(_ctx.longValue("QueryMsSgServiceSubscribersResponse.CurrentPage"));
		queryMsSgServiceSubscribersResponse.setPageSize(_ctx.longValue("QueryMsSgServiceSubscribersResponse.PageSize"));
		queryMsSgServiceSubscribersResponse.setStartIndex(_ctx.longValue("QueryMsSgServiceSubscribersResponse.StartIndex"));
		queryMsSgServiceSubscribersResponse.setTotalSize(_ctx.longValue("QueryMsSgServiceSubscribersResponse.TotalSize"));

		List<SubscribersItem> subscribers = new ArrayList<SubscribersItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsSgServiceSubscribersResponse.Subscribers.Length"); i++) {
			SubscribersItem subscribersItem = new SubscribersItem();
			subscribersItem.setAlive(_ctx.booleanValue("QueryMsSgServiceSubscribersResponse.Subscribers["+ i +"].Alive"));
			subscribersItem.setAppName(_ctx.stringValue("QueryMsSgServiceSubscribersResponse.Subscribers["+ i +"].AppName"));
			subscribersItem.setCheckSum(_ctx.stringValue("QueryMsSgServiceSubscribersResponse.Subscribers["+ i +"].CheckSum"));
			subscribersItem.setDataId(_ctx.stringValue("QueryMsSgServiceSubscribersResponse.Subscribers["+ i +"].DataId"));
			subscribersItem.setGmtCreate(_ctx.stringValue("QueryMsSgServiceSubscribersResponse.Subscribers["+ i +"].GmtCreate"));
			subscribersItem.setGmtModified(_ctx.stringValue("QueryMsSgServiceSubscribersResponse.Subscribers["+ i +"].GmtModified"));
			subscribersItem.setHostIp(_ctx.stringValue("QueryMsSgServiceSubscribersResponse.Subscribers["+ i +"].HostIp"));
			subscribersItem.setId(_ctx.longValue("QueryMsSgServiceSubscribersResponse.Subscribers["+ i +"].Id"));
			subscribersItem.setInstanceId(_ctx.stringValue("QueryMsSgServiceSubscribersResponse.Subscribers["+ i +"].InstanceId"));
			subscribersItem.setProcessId(_ctx.stringValue("QueryMsSgServiceSubscribersResponse.Subscribers["+ i +"].ProcessId"));
			subscribersItem.setScope(_ctx.stringValue("QueryMsSgServiceSubscribersResponse.Subscribers["+ i +"].Scope"));
			subscribersItem.setZone(_ctx.stringValue("QueryMsSgServiceSubscribersResponse.Subscribers["+ i +"].Zone"));

			subscribers.add(subscribersItem);
		}
		queryMsSgServiceSubscribersResponse.setSubscribers(subscribers);
	 
	 	return queryMsSgServiceSubscribersResponse;
	}
}