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
import com.aliyuncs.hbr.model.v20170908.DescribeBackupClientsResponse.Client.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupClientsResponseUnmarshaller {

	public static DescribeBackupClientsResponse unmarshall(DescribeBackupClientsResponse describeBackupClientsResponse, UnmarshallerContext _ctx) {
		
		describeBackupClientsResponse.setRequestId(_ctx.stringValue("DescribeBackupClientsResponse.RequestId"));
		describeBackupClientsResponse.setSuccess(_ctx.booleanValue("DescribeBackupClientsResponse.Success"));
		describeBackupClientsResponse.setCode(_ctx.stringValue("DescribeBackupClientsResponse.Code"));
		describeBackupClientsResponse.setMessage(_ctx.stringValue("DescribeBackupClientsResponse.Message"));
		describeBackupClientsResponse.setPageNumber(_ctx.integerValue("DescribeBackupClientsResponse.PageNumber"));
		describeBackupClientsResponse.setPageSize(_ctx.integerValue("DescribeBackupClientsResponse.PageSize"));
		describeBackupClientsResponse.setTotalCount(_ctx.longValue("DescribeBackupClientsResponse.TotalCount"));

		List<Client> clients = new ArrayList<Client>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupClientsResponse.Clients.Length"); i++) {
			Client client = new Client();
			client.setStatus(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Status"));
			client.setBackupStatus(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].BackupStatus"));
			client.setArchType(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ArchType"));
			client.setClientId(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ClientId"));
			client.setMaxClientVersion(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].MaxClientVersion"));
			client.setPrivateIpV4(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].PrivateIpV4"));
			client.setInstanceName(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].InstanceName"));
			client.setCreatedTime(_ctx.longValue("DescribeBackupClientsResponse.Clients["+ i +"].CreatedTime"));
			client.setLastHeartBeatTime(_ctx.longValue("DescribeBackupClientsResponse.Clients["+ i +"].LastHeartBeatTime"));
			client.setClusterId(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ClusterId"));
			client.setProductAssetTag(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ProductAssetTag"));
			client.setRegisterTime(_ctx.longValue("DescribeBackupClientsResponse.Clients["+ i +"].RegisterTime"));
			client.setClientType(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ClientType"));
			client.setProductName(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ProductName"));
			client.setHostname(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Hostname"));
			client.setInstanceId(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].InstanceId"));
			client.setProductVersion(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ProductVersion"));
			client.setAppliance(_ctx.booleanValue("DescribeBackupClientsResponse.Clients["+ i +"].Appliance"));
			client.setProductPartNumber(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ProductPartNumber"));
			client.setUpdatedTime(_ctx.longValue("DescribeBackupClientsResponse.Clients["+ i +"].UpdatedTime"));
			client.setOsType(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].OsType"));
			client.setZoneId(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ZoneId"));
			client.setProductManufacturer(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ProductManufacturer"));
			client.setUserDefinedKey(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].UserDefinedKey"));
			client.setProductSerialNumber(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ProductSerialNumber"));
			client.setClientVersion(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].ClientVersion"));

			Settings settings = new Settings();
			settings.setProxyHost(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.ProxyHost"));
			settings.setMaxCpuCore(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.MaxCpuCore"));
			settings.setProxyPort(_ctx.integerValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.ProxyPort"));
			settings.setUseHttps(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.UseHttps"));
			settings.setProxyPassword(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.ProxyPassword"));
			settings.setProxyUser(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.ProxyUser"));
			settings.setDataProxySetting(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.DataProxySetting"));
			settings.setDataNetworkType(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.DataNetworkType"));
			settings.setMaxWorker(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.MaxWorker"));
			settings.setMaxMemory(_ctx.longValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.MaxMemory"));
			settings.setAlertOnPartialComplete(_ctx.booleanValue("DescribeBackupClientsResponse.Clients["+ i +"].Settings.AlertOnPartialComplete"));
			client.setSettings(settings);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupClientsResponse.Clients["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeBackupClientsResponse.Clients["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			client.setTags(tags);

			clients.add(client);
		}
		describeBackupClientsResponse.setClients(clients);
	 
	 	return describeBackupClientsResponse;
	}
}