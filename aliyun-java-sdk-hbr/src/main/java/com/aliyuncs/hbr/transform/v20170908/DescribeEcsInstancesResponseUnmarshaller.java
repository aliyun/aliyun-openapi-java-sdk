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

import com.aliyuncs.hbr.model.v20170908.DescribeEcsInstancesResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeEcsInstancesResponse.EcsInstance;
import com.aliyuncs.hbr.model.v20170908.DescribeEcsInstancesResponse.EcsInstance.ClientSettings;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEcsInstancesResponseUnmarshaller {

	public static DescribeEcsInstancesResponse unmarshall(DescribeEcsInstancesResponse describeEcsInstancesResponse, UnmarshallerContext _ctx) {
		
		describeEcsInstancesResponse.setRequestId(_ctx.stringValue("DescribeEcsInstancesResponse.RequestId"));
		describeEcsInstancesResponse.setSuccess(_ctx.booleanValue("DescribeEcsInstancesResponse.Success"));
		describeEcsInstancesResponse.setCode(_ctx.stringValue("DescribeEcsInstancesResponse.Code"));
		describeEcsInstancesResponse.setMessage(_ctx.stringValue("DescribeEcsInstancesResponse.Message"));
		describeEcsInstancesResponse.setTotalCount(_ctx.integerValue("DescribeEcsInstancesResponse.TotalCount"));
		describeEcsInstancesResponse.setPageSize(_ctx.integerValue("DescribeEcsInstancesResponse.PageSize"));
		describeEcsInstancesResponse.setPageNumber(_ctx.integerValue("DescribeEcsInstancesResponse.PageNumber"));

		List<EcsInstance> ecsInstances = new ArrayList<EcsInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEcsInstancesResponse.EcsInstances.Length"); i++) {
			EcsInstance ecsInstance = new EcsInstance();
			ecsInstance.setInstanceId(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].InstanceId"));
			ecsInstance.setInstanceName(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].InstanceName"));
			ecsInstance.setInstanceNetworkType(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].InstanceNetworkType"));
			ecsInstance.setCloudAssistantStatus(_ctx.booleanValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].CloudAssistantStatus"));
			ecsInstance.setClientStatus(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].ClientStatus"));
			ecsInstance.setClientVersion(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].ClientVersion"));
			ecsInstance.setStatus(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].Status"));
			ecsInstance.setOsType(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].OsType"));
			ecsInstance.setOsName(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].OsName"));
			ecsInstance.setOsNameEn(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].OsNameEn"));
			ecsInstance.setClientInstallStatus(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].ClientInstallStatus"));
			ecsInstance.setRegionId(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].RegionId"));
			ecsInstance.setZoneId(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].ZoneId"));
			ecsInstance.setCpu(_ctx.integerValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].Cpu"));
			ecsInstance.setMemory(_ctx.integerValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].Memory"));
			ecsInstance.setHostName(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].HostName"));
			ecsInstance.setEipAddress(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].EipAddress"));
			ecsInstance.setClientId(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].ClientId"));
			ecsInstance.setCreatedByProduct(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].CreatedByProduct"));
			ecsInstance.setMaxClientVersion(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].MaxClientVersion"));

			List<String> innerIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].InnerIpAddress.Length"); j++) {
				innerIpAddress.add(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].InnerIpAddress["+ j +"]"));
			}
			ecsInstance.setInnerIpAddress(innerIpAddress);

			List<String> publicIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].PublicIpAddress.Length"); j++) {
				publicIpAddress.add(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].PublicIpAddress["+ j +"]"));
			}
			ecsInstance.setPublicIpAddress(publicIpAddress);

			List<String> privateIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].PrivateIpAddress.Length"); j++) {
				privateIpAddress.add(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].PrivateIpAddress["+ j +"]"));
			}
			ecsInstance.setPrivateIpAddress(privateIpAddress);

			ClientSettings clientSettings = new ClientSettings();
			clientSettings.setUseHttps(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].ClientSettings.UseHttps"));
			clientSettings.setDataNetworkType(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].ClientSettings.DataNetworkType"));
			clientSettings.setMaxCpuCore(_ctx.integerValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].ClientSettings.MaxCpuCore"));
			clientSettings.setMaxWorker(_ctx.integerValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].ClientSettings.MaxWorker"));
			clientSettings.setDataProxySetting(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].ClientSettings.DataProxySetting"));
			clientSettings.setProxyHost(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].ClientSettings.ProxyHost"));
			clientSettings.setProxyPort(_ctx.integerValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].ClientSettings.ProxyPort"));
			clientSettings.setProxyUser(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].ClientSettings.ProxyUser"));
			clientSettings.setProxyPassword(_ctx.stringValue("DescribeEcsInstancesResponse.EcsInstances["+ i +"].ClientSettings.ProxyPassword"));
			ecsInstance.setClientSettings(clientSettings);

			ecsInstances.add(ecsInstance);
		}
		describeEcsInstancesResponse.setEcsInstances(ecsInstances);
	 
	 	return describeEcsInstancesResponse;
	}
}