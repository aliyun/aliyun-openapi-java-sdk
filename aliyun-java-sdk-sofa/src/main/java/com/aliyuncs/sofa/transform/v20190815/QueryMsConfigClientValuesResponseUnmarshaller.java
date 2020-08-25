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

import com.aliyuncs.sofa.model.v20190815.QueryMsConfigClientValuesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsConfigClientValuesResponse.ClientsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsConfigClientValuesResponseUnmarshaller {

	public static QueryMsConfigClientValuesResponse unmarshall(QueryMsConfigClientValuesResponse queryMsConfigClientValuesResponse, UnmarshallerContext _ctx) {
		
		queryMsConfigClientValuesResponse.setRequestId(_ctx.stringValue("QueryMsConfigClientValuesResponse.RequestId"));
		queryMsConfigClientValuesResponse.setResultCode(_ctx.stringValue("QueryMsConfigClientValuesResponse.ResultCode"));
		queryMsConfigClientValuesResponse.setResultMessage(_ctx.stringValue("QueryMsConfigClientValuesResponse.ResultMessage"));

		List<ClientsItem> clients = new ArrayList<ClientsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsConfigClientValuesResponse.Clients.Length"); i++) {
			ClientsItem clientsItem = new ClientsItem();
			clientsItem.setData(_ctx.stringValue("QueryMsConfigClientValuesResponse.Clients["+ i +"].Data"));
			clientsItem.setIp(_ctx.stringValue("QueryMsConfigClientValuesResponse.Clients["+ i +"].Ip"));
			clientsItem.setSuccess(_ctx.booleanValue("QueryMsConfigClientValuesResponse.Clients["+ i +"].Success"));

			clients.add(clientsItem);
		}
		queryMsConfigClientValuesResponse.setClients(clients);
	 
	 	return queryMsConfigClientValuesResponse;
	}
}