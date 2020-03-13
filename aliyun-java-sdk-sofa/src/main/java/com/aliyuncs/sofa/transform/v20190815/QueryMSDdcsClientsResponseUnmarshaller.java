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

import com.aliyuncs.sofa.model.v20190815.QueryMSDdcsClientsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMSDdcsClientsResponse.ClientsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMSDdcsClientsResponseUnmarshaller {

	public static QueryMSDdcsClientsResponse unmarshall(QueryMSDdcsClientsResponse queryMSDdcsClientsResponse, UnmarshallerContext _ctx) {
		
		queryMSDdcsClientsResponse.setRequestId(_ctx.stringValue("QueryMSDdcsClientsResponse.RequestId"));
		queryMSDdcsClientsResponse.setPageNum(_ctx.integerValue("QueryMSDdcsClientsResponse.PageNum"));
		queryMSDdcsClientsResponse.setPageSize(_ctx.integerValue("QueryMSDdcsClientsResponse.PageSize"));
		queryMSDdcsClientsResponse.setTotalCount(_ctx.integerValue("QueryMSDdcsClientsResponse.TotalCount"));

		List<ClientsItem> clients = new ArrayList<ClientsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMSDdcsClientsResponse.Clients.Length"); i++) {
			ClientsItem clientsItem = new ClientsItem();
			clientsItem.setCell(_ctx.stringValue("QueryMSDdcsClientsResponse.Clients["+ i +"].Cell"));
			clientsItem.setData(_ctx.stringValue("QueryMSDdcsClientsResponse.Clients["+ i +"].Data"));
			clientsItem.setIp(_ctx.stringValue("QueryMSDdcsClientsResponse.Clients["+ i +"].Ip"));
			clientsItem.setPushData(_ctx.stringValue("QueryMSDdcsClientsResponse.Clients["+ i +"].PushData"));

			clients.add(clientsItem);
		}
		queryMSDdcsClientsResponse.setClients(clients);
	 
	 	return queryMSDdcsClientsResponse;
	}
}