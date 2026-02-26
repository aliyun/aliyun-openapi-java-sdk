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
import com.aliyuncs.hbr.model.v20170908.DescribeClientsResponse.Client.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClientsResponseUnmarshaller {

	public static DescribeClientsResponse unmarshall(DescribeClientsResponse describeClientsResponse, UnmarshallerContext _ctx) {
		
		describeClientsResponse.setRequestId(_ctx.stringValue("DescribeClientsResponse.RequestId"));
		describeClientsResponse.setSuccess(_ctx.booleanValue("DescribeClientsResponse.Success"));
		describeClientsResponse.setCode(_ctx.stringValue("DescribeClientsResponse.Code"));
		describeClientsResponse.setMessage(_ctx.stringValue("DescribeClientsResponse.Message"));
		describeClientsResponse.setPageNumber(_ctx.integerValue("DescribeClientsResponse.PageNumber"));
		describeClientsResponse.setPageSize(_ctx.integerValue("DescribeClientsResponse.PageSize"));
		describeClientsResponse.setTotalCount(_ctx.integerValue("DescribeClientsResponse.TotalCount"));

		List<Client> clients = new ArrayList<Client>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClientsResponse.Clients.Length"); i++) {
			Client client = new Client();
			client.setStatus(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].Status"));
			client.setGatewayId(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].GatewayId"));
			client.setVaultId(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].VaultId"));
			client.setGatewayName(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].GatewayName"));
			client.setOsName(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].OsName"));
			client.setSnapshotPartialComplete(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].SnapshotPartialComplete"));
			client.setUseHttps(_ctx.booleanValue("DescribeClientsResponse.Clients["+ i +"].UseHttps"));
			client.setVaultType(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].VaultType"));
			client.setNetworkType(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].NetworkType"));
			client.setClientName(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].ClientName"));
			client.setEipAddress(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].EipAddress"));
			client.setClientId(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].ClientId"));
			client.setAlertSetting(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].AlertSetting"));
			client.setInstanceName(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].InstanceName"));
			client.setSnapshotFailed(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].SnapshotFailed"));
			client.setMaxVersion(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].MaxVersion"));
			client.setCreatedTime(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].CreatedTime"));
			client.setSnapshotRunning(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].SnapshotRunning"));
			client.setStatusMessage(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].StatusMessage"));
			client.setClientOption(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].ClientOption"));
			client.setJobsCount(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].JobsCount"));
			client.setClientType(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].ClientType"));
			client.setHostName(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].HostName"));
			client.setInstanceId(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].InstanceId"));
			client.setSnapshotTotal(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].SnapshotTotal"));
			client.setSnapshotComplete(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].SnapshotComplete"));
			client.setGatewayStatus(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].GatewayStatus"));
			client.setUpdatedTime(_ctx.longValue("DescribeClientsResponse.Clients["+ i +"].UpdatedTime"));
			client.setContactId(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].ContactId"));
			client.setPlatformType(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].PlatformType"));
			client.setGatewayInnerIp(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].GatewayInnerIp"));
			client.setClientVersion(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].ClientVersion"));
			client.setClusterId(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].ClusterId"));

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

			List<String> innerIpAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClientsResponse.Clients["+ i +"].InnerIpAddresses.Length"); j++) {
				innerIpAddresses.add(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].InnerIpAddresses["+ j +"]"));
			}
			client.setInnerIpAddresses(innerIpAddresses);

			List<String> sourceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClientsResponse.Clients["+ i +"].SourceTypes.Length"); j++) {
				sourceTypes.add(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].SourceTypes["+ j +"]"));
			}
			client.setSourceTypes(sourceTypes);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClientsResponse.Clients["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeClientsResponse.Clients["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			client.setTags(tags);

			clients.add(client);
		}
		describeClientsResponse.setClients(clients);
	 
	 	return describeClientsResponse;
	}
}