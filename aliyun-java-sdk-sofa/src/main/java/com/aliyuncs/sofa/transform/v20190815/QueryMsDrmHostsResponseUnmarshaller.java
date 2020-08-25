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

import com.aliyuncs.sofa.model.v20190815.QueryMsDrmHostsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsDrmHostsResponse.ClientInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsDrmHostsResponseUnmarshaller {

	public static QueryMsDrmHostsResponse unmarshall(QueryMsDrmHostsResponse queryMsDrmHostsResponse, UnmarshallerContext _ctx) {
		
		queryMsDrmHostsResponse.setRequestId(_ctx.stringValue("QueryMsDrmHostsResponse.RequestId"));
		queryMsDrmHostsResponse.setResultCode(_ctx.stringValue("QueryMsDrmHostsResponse.ResultCode"));
		queryMsDrmHostsResponse.setResultMessage(_ctx.stringValue("QueryMsDrmHostsResponse.ResultMessage"));

		List<ClientInfosItem> clientInfos = new ArrayList<ClientInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsDrmHostsResponse.ClientInfos.Length"); i++) {
			ClientInfosItem clientInfosItem = new ClientInfosItem();
			clientInfosItem.setIp(_ctx.stringValue("QueryMsDrmHostsResponse.ClientInfos["+ i +"].Ip"));
			clientInfosItem.setPushValue(_ctx.stringValue("QueryMsDrmHostsResponse.ClientInfos["+ i +"].PushValue"));
			clientInfosItem.setValue(_ctx.stringValue("QueryMsDrmHostsResponse.ClientInfos["+ i +"].Value"));
			clientInfosItem.setZone(_ctx.stringValue("QueryMsDrmHostsResponse.ClientInfos["+ i +"].Zone"));

			clientInfos.add(clientInfosItem);
		}
		queryMsDrmHostsResponse.setClientInfos(clientInfos);
	 
	 	return queryMsDrmHostsResponse;
	}
}