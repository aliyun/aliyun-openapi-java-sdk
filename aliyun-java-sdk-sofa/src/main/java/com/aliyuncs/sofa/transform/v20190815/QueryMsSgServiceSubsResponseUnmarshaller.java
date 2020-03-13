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

import com.aliyuncs.sofa.model.v20190815.QueryMsSgServiceSubsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsSgServiceSubsResponse.SubscribersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsSgServiceSubsResponseUnmarshaller {

	public static QueryMsSgServiceSubsResponse unmarshall(QueryMsSgServiceSubsResponse queryMsSgServiceSubsResponse, UnmarshallerContext _ctx) {
		
		queryMsSgServiceSubsResponse.setRequestId(_ctx.stringValue("QueryMsSgServiceSubsResponse.RequestId"));
		queryMsSgServiceSubsResponse.setResultCode(_ctx.stringValue("QueryMsSgServiceSubsResponse.ResultCode"));
		queryMsSgServiceSubsResponse.setResultMessage(_ctx.stringValue("QueryMsSgServiceSubsResponse.ResultMessage"));
		queryMsSgServiceSubsResponse.setCurrentPage(_ctx.longValue("QueryMsSgServiceSubsResponse.CurrentPage"));
		queryMsSgServiceSubsResponse.setPageSize(_ctx.longValue("QueryMsSgServiceSubsResponse.PageSize"));
		queryMsSgServiceSubsResponse.setStartIndex(_ctx.longValue("QueryMsSgServiceSubsResponse.StartIndex"));
		queryMsSgServiceSubsResponse.setTotalSize(_ctx.longValue("QueryMsSgServiceSubsResponse.TotalSize"));

		List<SubscribersItem> subscribers = new ArrayList<SubscribersItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsSgServiceSubsResponse.Subscribers.Length"); i++) {
			SubscribersItem subscribersItem = new SubscribersItem();
			subscribersItem.setAlive(_ctx.booleanValue("QueryMsSgServiceSubsResponse.Subscribers["+ i +"].Alive"));
			subscribersItem.setAppName(_ctx.stringValue("QueryMsSgServiceSubsResponse.Subscribers["+ i +"].AppName"));
			subscribersItem.setCheckSum(_ctx.stringValue("QueryMsSgServiceSubsResponse.Subscribers["+ i +"].CheckSum"));
			subscribersItem.setDataId(_ctx.stringValue("QueryMsSgServiceSubsResponse.Subscribers["+ i +"].DataId"));
			subscribersItem.setGmtCreate(_ctx.stringValue("QueryMsSgServiceSubsResponse.Subscribers["+ i +"].GmtCreate"));
			subscribersItem.setGmtModified(_ctx.stringValue("QueryMsSgServiceSubsResponse.Subscribers["+ i +"].GmtModified"));
			subscribersItem.setHostIp(_ctx.stringValue("QueryMsSgServiceSubsResponse.Subscribers["+ i +"].HostIp"));
			subscribersItem.setId(_ctx.longValue("QueryMsSgServiceSubsResponse.Subscribers["+ i +"].Id"));
			subscribersItem.setInstanceId(_ctx.stringValue("QueryMsSgServiceSubsResponse.Subscribers["+ i +"].InstanceId"));
			subscribersItem.setProcessId(_ctx.stringValue("QueryMsSgServiceSubsResponse.Subscribers["+ i +"].ProcessId"));
			subscribersItem.setScope(_ctx.stringValue("QueryMsSgServiceSubsResponse.Subscribers["+ i +"].Scope"));
			subscribersItem.setZone(_ctx.stringValue("QueryMsSgServiceSubsResponse.Subscribers["+ i +"].Zone"));

			subscribers.add(subscribersItem);
		}
		queryMsSgServiceSubsResponse.setSubscribers(subscribers);
	 
	 	return queryMsSgServiceSubsResponse;
	}
}