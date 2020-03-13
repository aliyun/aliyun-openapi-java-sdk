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

import com.aliyuncs.sofa.model.v20190815.ListMsSgServiceSubsResponse;
import com.aliyuncs.sofa.model.v20190815.ListMsSgServiceSubsResponse.SubscribersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMsSgServiceSubsResponseUnmarshaller {

	public static ListMsSgServiceSubsResponse unmarshall(ListMsSgServiceSubsResponse listMsSgServiceSubsResponse, UnmarshallerContext _ctx) {
		
		listMsSgServiceSubsResponse.setRequestId(_ctx.stringValue("ListMsSgServiceSubsResponse.RequestId"));
		listMsSgServiceSubsResponse.setResultCode(_ctx.stringValue("ListMsSgServiceSubsResponse.ResultCode"));
		listMsSgServiceSubsResponse.setResultMessage(_ctx.stringValue("ListMsSgServiceSubsResponse.ResultMessage"));

		List<SubscribersItem> subscribers = new ArrayList<SubscribersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMsSgServiceSubsResponse.Subscribers.Length"); i++) {
			SubscribersItem subscribersItem = new SubscribersItem();
			subscribersItem.setAlive(_ctx.booleanValue("ListMsSgServiceSubsResponse.Subscribers["+ i +"].Alive"));
			subscribersItem.setAppName(_ctx.stringValue("ListMsSgServiceSubsResponse.Subscribers["+ i +"].AppName"));
			subscribersItem.setCheckSum(_ctx.stringValue("ListMsSgServiceSubsResponse.Subscribers["+ i +"].CheckSum"));
			subscribersItem.setDataId(_ctx.stringValue("ListMsSgServiceSubsResponse.Subscribers["+ i +"].DataId"));
			subscribersItem.setGmtCreate(_ctx.stringValue("ListMsSgServiceSubsResponse.Subscribers["+ i +"].GmtCreate"));
			subscribersItem.setGmtModified(_ctx.stringValue("ListMsSgServiceSubsResponse.Subscribers["+ i +"].GmtModified"));
			subscribersItem.setHostIp(_ctx.stringValue("ListMsSgServiceSubsResponse.Subscribers["+ i +"].HostIp"));
			subscribersItem.setId(_ctx.longValue("ListMsSgServiceSubsResponse.Subscribers["+ i +"].Id"));
			subscribersItem.setInstanceId(_ctx.stringValue("ListMsSgServiceSubsResponse.Subscribers["+ i +"].InstanceId"));
			subscribersItem.setProcessId(_ctx.stringValue("ListMsSgServiceSubsResponse.Subscribers["+ i +"].ProcessId"));
			subscribersItem.setScope(_ctx.stringValue("ListMsSgServiceSubsResponse.Subscribers["+ i +"].Scope"));
			subscribersItem.setZone(_ctx.stringValue("ListMsSgServiceSubsResponse.Subscribers["+ i +"].Zone"));

			subscribers.add(subscribersItem);
		}
		listMsSgServiceSubsResponse.setSubscribers(subscribers);
	 
	 	return listMsSgServiceSubsResponse;
	}
}