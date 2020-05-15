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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeMountedClientsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeMountedClientsResponse.Client;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMountedClientsResponseUnmarshaller {

	public static DescribeMountedClientsResponse unmarshall(DescribeMountedClientsResponse describeMountedClientsResponse, UnmarshallerContext _ctx) {
		
		describeMountedClientsResponse.setRequestId(_ctx.stringValue("DescribeMountedClientsResponse.RequestId"));
		describeMountedClientsResponse.setTotalCount(_ctx.integerValue("DescribeMountedClientsResponse.TotalCount"));
		describeMountedClientsResponse.setPageSize(_ctx.integerValue("DescribeMountedClientsResponse.PageSize"));
		describeMountedClientsResponse.setPageNumber(_ctx.integerValue("DescribeMountedClientsResponse.PageNumber"));

		List<Client> clients = new ArrayList<Client>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMountedClientsResponse.Clients.Length"); i++) {
			Client client = new Client();
			client.setClientIP(_ctx.stringValue("DescribeMountedClientsResponse.Clients["+ i +"].ClientIP"));

			clients.add(client);
		}
		describeMountedClientsResponse.setClients(clients);
	 
	 	return describeMountedClientsResponse;
	}
}