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

import com.aliyuncs.sofa.model.v20190815.QueryMsConfigClientsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsConfigClientsResponse.ClientsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsConfigClientsResponseUnmarshaller {

	public static QueryMsConfigClientsResponse unmarshall(QueryMsConfigClientsResponse queryMsConfigClientsResponse, UnmarshallerContext _ctx) {
		
		queryMsConfigClientsResponse.setRequestId(_ctx.stringValue("QueryMsConfigClientsResponse.RequestId"));
		queryMsConfigClientsResponse.setResultCode(_ctx.stringValue("QueryMsConfigClientsResponse.ResultCode"));
		queryMsConfigClientsResponse.setResultMessage(_ctx.stringValue("QueryMsConfigClientsResponse.ResultMessage"));
		queryMsConfigClientsResponse.setPageNum(_ctx.longValue("QueryMsConfigClientsResponse.PageNum"));
		queryMsConfigClientsResponse.setPageSize(_ctx.longValue("QueryMsConfigClientsResponse.PageSize"));
		queryMsConfigClientsResponse.setTotalCount(_ctx.longValue("QueryMsConfigClientsResponse.TotalCount"));

		List<ClientsItem> clients = new ArrayList<ClientsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsConfigClientsResponse.Clients.Length"); i++) {
			ClientsItem clientsItem = new ClientsItem();
			clientsItem.setCell(_ctx.stringValue("QueryMsConfigClientsResponse.Clients["+ i +"].Cell"));
			clientsItem.setData(_ctx.stringValue("QueryMsConfigClientsResponse.Clients["+ i +"].Data"));
			clientsItem.setIp(_ctx.stringValue("QueryMsConfigClientsResponse.Clients["+ i +"].Ip"));
			clientsItem.setPushData(_ctx.stringValue("QueryMsConfigClientsResponse.Clients["+ i +"].PushData"));

			clients.add(clientsItem);
		}
		queryMsConfigClientsResponse.setClients(clients);
	 
	 	return queryMsConfigClientsResponse;
	}
}