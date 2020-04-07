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

import com.aliyuncs.hbr.model.v20170908.DescribeClientsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeClientsResponse.Client;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClientsResponseUnmarshaller {

	public static DescribeClientsResponse unmarshall(DescribeClientsResponse describeClientsResponse, UnmarshallerContext _ctx) {
		
		describeClientsResponse.setRequestId(_ctx.stringValue("DescribeClientsResponse.RequestId"));
		describeClientsResponse.setSuccess(_ctx.booleanValue("DescribeClientsResponse.Success"));
		describeClientsResponse.setCode(_ctx.stringValue("DescribeClientsResponse.Code"));
		describeClientsResponse.setMessage(_ctx.stringValue("DescribeClientsResponse.Message"));
		describeClientsResponse.setTotalCount(_ctx.integerValue("DescribeClientsResponse.TotalCount"));
		describeClientsResponse.setPageSize(_ctx.integerValue("DescribeClientsResponse.PageSize"));
		describeClientsResponse.setPageNumber(_ctx.integerValue("DescribeClientsResponse.PageNumber"));

		List<Client> clients = new ArrayList<Client>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClientsResponse.Clients.Length"); i++) {
			Client client = new Client();
			client.setClientId(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].ClientId"));
			client.setClientName(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].ClientName"));
			client.setVaultId(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].VaultId"));
			client.setHostName(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].HostName"));
			client.setStatus(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].Status"));
			client.setNetworkType(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].NetworkType"));
			client.setSnapshotTotal(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].SnapshotTotal"));
			client.setSnapshotRunning(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].SnapshotRunning"));
			client.setSnapshotComplete(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].SnapshotComplete"));
			client.setSnapshotFailed(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].SnapshotFailed"));
			client.setCreatedTime(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].CreatedTime"));
			client.setUpdatedTime(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].UpdatedTime"));
			client.setClientVersion(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].ClientVersion"));
			client.setPlatformType(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].PlatformType"));
			client.setClientType(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].ClientType"));
			client.setAlertSetting(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].AlertSetting"));
			client.setContactId(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].ContactId"));
			client.setSnapshotPartialComplete(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].SnapshotPartialComplete"));
			client.setStatusMessage(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].StatusMessage"));
			client.setInstanceId(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].InstanceId"));
			client.setInstanceName(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].InstanceName"));
			client.setOsName(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].OsName"));
			client.setJobsCount(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].JobsCount"));
			client.setMaxVersion(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].MaxVersion"));
			client.setEipAddress(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].EipAddress"));
			client.setVaultType(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].VaultType"));
			client.setGatewayId(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].GatewayId"));
			client.setGatewayName(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].GatewayName"));
			client.setGatewayInnerIp(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].GatewayInnerIp"));
			client.setGatewayStatus(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].GatewayStatus"));

			List<String> sourceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClientsResponse.Clients["+ i +"].SourceTypes.Length"); j++) {
				sourceTypes.add(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].SourceTypes["+ j +"]"));
			}
			client.setSourceTypes(sourceTypes);

			List<String> innerIpAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClientsResponse.Clients["+ i +"].InnerIpAddresses.Length"); j++) {
				innerIpAddresses.add(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].InnerIpAddresses["+ j +"]"));
			}
			client.setInnerIpAddresses(innerIpAddresses);

			List<String> publicIpAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClientsResponse.Clients["+ i +"].PublicIpAddresses.Length"); j++) {
				publicIpAddresses.add(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].PublicIpAddresses["+ j +"]"));
			}
			client.setPublicIpAddresses(publicIpAddresses);

			List<String> privateIpAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClientsResponse.Clients["+ i +"].PrivateIpAddresses.Length"); j++) {
				privateIpAddresses.add(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].PrivateIpAddresses["+ j +"]"));
			}
			client.setPrivateIpAddresses(privateIpAddresses);

			clients.add(client);
		}
		describeClientsResponse.setClients(clients);
	 
	 	return describeClientsResponse;
	}
}