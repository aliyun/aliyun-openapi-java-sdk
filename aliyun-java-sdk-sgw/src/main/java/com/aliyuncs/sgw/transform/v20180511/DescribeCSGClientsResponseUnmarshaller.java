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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeCSGClientsResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeCSGClientsResponse.Client;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCSGClientsResponseUnmarshaller {

	public static DescribeCSGClientsResponse unmarshall(DescribeCSGClientsResponse describeCSGClientsResponse, UnmarshallerContext _ctx) {
		
		describeCSGClientsResponse.setRequestId(_ctx.stringValue("DescribeCSGClientsResponse.RequestId"));
		describeCSGClientsResponse.setSuccess(_ctx.booleanValue("DescribeCSGClientsResponse.Success"));
		describeCSGClientsResponse.setCode(_ctx.stringValue("DescribeCSGClientsResponse.Code"));
		describeCSGClientsResponse.setMessage(_ctx.stringValue("DescribeCSGClientsResponse.Message"));
		describeCSGClientsResponse.setPageSize(_ctx.integerValue("DescribeCSGClientsResponse.PageSize"));
		describeCSGClientsResponse.setPageNumber(_ctx.integerValue("DescribeCSGClientsResponse.PageNumber"));
		describeCSGClientsResponse.setTotalCount(_ctx.integerValue("DescribeCSGClientsResponse.TotalCount"));

		List<Client> clients = new ArrayList<Client>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCSGClientsResponse.Clients.Length"); i++) {
			Client client = new Client();
			client.setVpcId(_ctx.stringValue("DescribeCSGClientsResponse.Clients["+ i +"].VpcId"));
			client.setStatus(_ctx.stringValue("DescribeCSGClientsResponse.Clients["+ i +"].Status"));
			client.setEcsInstanceId(_ctx.stringValue("DescribeCSGClientsResponse.Clients["+ i +"].EcsInstanceId"));
			client.setLastHeartbeatTime(_ctx.longValue("DescribeCSGClientsResponse.Clients["+ i +"].LastHeartbeatTime"));
			client.setClientId(_ctx.stringValue("DescribeCSGClientsResponse.Clients["+ i +"].ClientId"));
			client.setClientVersion(_ctx.stringValue("DescribeCSGClientsResponse.Clients["+ i +"].ClientVersion"));
			client.setClientInstallationCommand(_ctx.stringValue("DescribeCSGClientsResponse.Clients["+ i +"].ClientInstallationCommand"));
			client.setClientDeletionCommand(_ctx.stringValue("DescribeCSGClientsResponse.Clients["+ i +"].ClientDeletionCommand"));
			client.setWorkDirectory(_ctx.stringValue("DescribeCSGClientsResponse.Clients["+ i +"].WorkDirectory"));

			clients.add(client);
		}
		describeCSGClientsResponse.setClients(clients);
	 
	 	return describeCSGClientsResponse;
	}
}