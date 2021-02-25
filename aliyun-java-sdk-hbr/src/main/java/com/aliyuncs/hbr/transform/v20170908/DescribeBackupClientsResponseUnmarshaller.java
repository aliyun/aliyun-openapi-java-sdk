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

import com.aliyuncs.hbr.model.v20170908.DescribeBackupClientsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeBackupClientsResponse.Client;
import com.aliyuncs.hbr.model.v20170908.DescribeBackupClientsResponse.Client.Settings;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupClientsResponseUnmarshaller {

	public static DescribeBackupClientsResponse unmarshall(DescribeBackupClientsResponse describeBackupClientsResponse, UnmarshallerContext _ctx) {
		
		describeBackupClientsResponse.setRequestId(_ctx.stringValue("DescribeBackupClientsResponse.RequestId"));
		describeBackupClientsResponse.setSuccess(_ctx.booleanValue("DescribeBackupClientsResponse.Success"));
		describeBackupClientsResponse.setCode(_ctx.stringValue("DescribeBackupClientsResponse.Code"));
		describeBackupClientsResponse.setMessage(_ctx.stringValue("DescribeBackupClientsResponse.Message"));
		describeBackupClientsResponse.setTotalCount(_ctx.longValue("DescribeBackupClientsResponse.TotalCount"));
		describeBackupClientsResponse.setPageSize(_ctx.integerValue("DescribeBackupClientsResponse.PageSize"));
		describeBackupClientsResponse.setPageNumber(_ctx.integerValue("DescribeBackupClientsResponse.PageNumber"));

		List<Client> clients = new ArrayList<Client>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupClientsResponse.Clients.Length"); i++) {
			Client client = new Client();
			client.setCreatedTime(_ctx.longValue("DescribeBackupClientsResponse.Clients["+ i +"].CreatedTime"));
			client.setUpdatedTime(_ctx.longValue("DescribeBackupClientsResponse.Clients["+ i +"].UpdatedTime"));
			client.setClientType(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ClientType"));
			client.setClientId(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ClientId"));
			client.setClientVersion(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ClientVersion"));
			client.setOsType(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].OsType"));
			client.setArchType(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ArchType"));
			client.setHostname(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Hostname"));
			client.setLastHeartBeatTime(_ctx.longValue("DescribeBackupClientsResponse.Clients["+ i +"].LastHeartBeatTime"));
			client.setInstanceId(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].InstanceId"));
			client.setZoneId(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ZoneId"));
			client.setPrivateIpV4(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].PrivateIpV4"));
			client.setAppliance(_ctx.booleanValue("DescribeBackupClientsResponse.Clients["+ i +"].Appliance"));
			client.setProductManufacturer(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ProductManufacturer"));
			client.setProductName(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ProductName"));
			client.setProductPartNumber(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ProductPartNumber"));
			client.setProductVersion(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ProductVersion"));
			client.setProductSerialNumber(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ProductSerialNumber"));
			client.setProductAssetTag(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ProductAssetTag"));
			client.setStatus(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Status"));
			client.setBackupStatus(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].BackupStatus"));
			client.setInstanceName(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].InstanceName"));
			client.setClusterId(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ClusterId"));
			client.setRegisterTime(_ctx.longValue("DescribeBackupClientsResponse.Clients["+ i +"].RegisterTime"));
			client.setMaxClientVersion(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].MaxClientVersion"));

			Settings settings = new Settings();
			settings.setDataNetworkType(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.DataNetworkType"));
			settings.setUseHttps(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.UseHttps"));
			settings.setMaxCpuCore(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.MaxCpuCore"));
			settings.setMaxWorker(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.MaxWorker"));
			settings.setDataProxySetting(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.DataProxySetting"));
			settings.setProxyHost(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.ProxyHost"));
			settings.setProxyPort(_ctx.integerValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.ProxyPort"));
			settings.setProxyUser(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.ProxyUser"));
			settings.setProxyPassword(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.ProxyPassword"));
			client.setSettings(settings);

			clients.add(client);
		}
		describeBackupClientsResponse.setClients(clients);
	 
	 	return describeBackupClientsResponse;
	}
}