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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.GetClientsToRestoreResponse;
import com.aliyuncs.hbr.model.v20170908.GetClientsToRestoreResponse.Client;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClientsToRestoreResponseUnmarshaller {

	public static GetClientsToRestoreResponse unmarshall(GetClientsToRestoreResponse getClientsToRestoreResponse, UnmarshallerContext _ctx) {
		
		getClientsToRestoreResponse.setRequestId(_ctx.stringValue("GetClientsToRestoreResponse.RequestId"));
		getClientsToRestoreResponse.setSuccess(_ctx.booleanValue("GetClientsToRestoreResponse.Success"));
		getClientsToRestoreResponse.setCode(_ctx.stringValue("GetClientsToRestoreResponse.Code"));
		getClientsToRestoreResponse.setMessage(_ctx.stringValue("GetClientsToRestoreResponse.Message"));
		getClientsToRestoreResponse.setTotalCount(_ctx.integerValue("GetClientsToRestoreResponse.TotalCount"));
		getClientsToRestoreResponse.setPageSize(_ctx.integerValue("GetClientsToRestoreResponse.PageSize"));
		getClientsToRestoreResponse.setPageNumber(_ctx.integerValue("GetClientsToRestoreResponse.PageNumber"));

		List<Client> clients = new ArrayList<Client>();
		for (int i = 0; i < _ctx.lengthValue("GetClientsToRestoreResponse.Clients.Length"); i++) {
			Client client = new Client();
			client.setCreatedTime(_ctx.longValue("GetClientsToRestoreResponse.Clients["+ i +"].CreatedTime"));
			client.setUpdatedTime(_ctx.longValue("GetClientsToRestoreResponse.Clients["+ i +"].UpdatedTime"));
			client.setVaultId(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].VaultId"));
			client.setClientId(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].ClientId"));
			client.setClientName(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].ClientName"));
			client.setHostName(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].HostName"));
			client.setPlatformType(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].PlatformType"));
			client.setClientType(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].ClientType"));
			client.setInstanceId(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].InstanceId"));
			client.setInstanceName(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].InstanceName"));
			client.setOsName(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].OsName"));
			client.setEipAddress(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].EipAddress"));
			client.setGatewayId(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].GatewayId"));
			client.setGatewayName(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].GatewayName"));

			List<String> sourceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetClientsToRestoreResponse.Clients["+ i +"].SourceTypes.Length"); j++) {
				sourceTypes.add(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].SourceTypes["+ j +"]"));
			}
			client.setSourceTypes(sourceTypes);

			List<String> innerIpAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetClientsToRestoreResponse.Clients["+ i +"].InnerIpAddresses.Length"); j++) {
				innerIpAddresses.add(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].InnerIpAddresses["+ j +"]"));
			}
			client.setInnerIpAddresses(innerIpAddresses);

			List<String> publicIpAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetClientsToRestoreResponse.Clients["+ i +"].PublicIpAddresses.Length"); j++) {
				publicIpAddresses.add(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].PublicIpAddresses["+ j +"]"));
			}
			client.setPublicIpAddresses(publicIpAddresses);

			List<String> privateIpAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetClientsToRestoreResponse.Clients["+ i +"].PrivateIpAddresses.Length"); j++) {
				privateIpAddresses.add(_ctx.stringValue("GetClientsToRestoreResponse.Clients["+ i +"].PrivateIpAddresses["+ j +"]"));
			}
			client.setPrivateIpAddresses(privateIpAddresses);

			clients.add(client);
		}
		getClientsToRestoreResponse.setClients(clients);
	 
	 	return getClientsToRestoreResponse;
	}
}