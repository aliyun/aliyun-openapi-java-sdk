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

import com.aliyuncs.sofa.model.v20190815.QueryMSDdcsClientValueResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMSDdcsClientValueResponse.ClientsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMSDdcsClientValueResponseUnmarshaller {

	public static QueryMSDdcsClientValueResponse unmarshall(QueryMSDdcsClientValueResponse queryMSDdcsClientValueResponse, UnmarshallerContext _ctx) {
		
		queryMSDdcsClientValueResponse.setRequestId(_ctx.stringValue("QueryMSDdcsClientValueResponse.RequestId"));

		List<ClientsItem> clients = new ArrayList<ClientsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMSDdcsClientValueResponse.Clients.Length"); i++) {
			ClientsItem clientsItem = new ClientsItem();
			clientsItem.setData(_ctx.stringValue("QueryMSDdcsClientValueResponse.Clients["+ i +"].Data"));
			clientsItem.setIp(_ctx.stringValue("QueryMSDdcsClientValueResponse.Clients["+ i +"].Ip"));
			clientsItem.setSuccess(_ctx.booleanValue("QueryMSDdcsClientValueResponse.Clients["+ i +"].Success"));

			clients.add(clientsItem);
		}
		queryMSDdcsClientValueResponse.setClients(clients);
	 
	 	return queryMSDdcsClientValueResponse;
	}
}