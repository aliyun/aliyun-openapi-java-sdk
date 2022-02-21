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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeDeviceServiceResponse;
import com.aliyuncs.ens.model.v20171110.DescribeDeviceServiceResponse.AppMetaData;
import com.aliyuncs.ens.model.v20171110.DescribeDeviceServiceResponse.AppStatus;
import com.aliyuncs.ens.model.v20171110.DescribeDeviceServiceResponse.DeviceInfo;
import com.aliyuncs.ens.model.v20171110.DescribeDeviceServiceResponse.ResourceInfosItem;
import com.aliyuncs.ens.model.v20171110.DescribeDeviceServiceResponse.ResourceInfosItem.DeviceInfosItem;
import com.aliyuncs.ens.model.v20171110.DescribeDeviceServiceResponse.ResourceInfosItem.DeviceInfosItem.Ports;
import com.aliyuncs.ens.model.v20171110.DescribeDeviceServiceResponse.ResourceInfosItem.InternalIpsItem;
import com.aliyuncs.ens.model.v20171110.DescribeDeviceServiceResponse.ResourceInfosItem.PublicIpsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceServiceResponseUnmarshaller {

	public static DescribeDeviceServiceResponse unmarshall(DescribeDeviceServiceResponse describeDeviceServiceResponse, UnmarshallerContext _ctx) {
		
		describeDeviceServiceResponse.setRequestId(_ctx.stringValue("DescribeDeviceServiceResponse.RequestId"));

		AppStatus appStatus = new AppStatus();
		appStatus.setPhase(_ctx.stringValue("DescribeDeviceServiceResponse.AppStatus.Phase"));
		appStatus.setStatusDescrip(_ctx.stringValue("DescribeDeviceServiceResponse.AppStatus.StatusDescrip"));
		appStatus.setUpdateTime(_ctx.stringValue("DescribeDeviceServiceResponse.AppStatus.UpdateTime"));
		describeDeviceServiceResponse.setAppStatus(appStatus);

		AppMetaData appMetaData = new AppMetaData();
		appMetaData.setAppId(_ctx.stringValue("DescribeDeviceServiceResponse.AppMetaData.AppId"));
		appMetaData.setAppName(_ctx.stringValue("DescribeDeviceServiceResponse.AppMetaData.AppName"));
		appMetaData.setAppStableVersion(_ctx.stringValue("DescribeDeviceServiceResponse.AppMetaData.AppStableVersion"));
		appMetaData.setAppType(_ctx.stringValue("DescribeDeviceServiceResponse.AppMetaData.AppType"));
		appMetaData.setClusterName(_ctx.stringValue("DescribeDeviceServiceResponse.AppMetaData.ClusterName"));
		appMetaData.setCreateTime(_ctx.stringValue("DescribeDeviceServiceResponse.AppMetaData.CreateTime"));
		appMetaData.setDescription(_ctx.stringValue("DescribeDeviceServiceResponse.AppMetaData.Description"));
		describeDeviceServiceResponse.setAppMetaData(appMetaData);

		List<DeviceInfo> resourceDetailInfos = new ArrayList<DeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeviceServiceResponse.ResourceDetailInfos.Length"); i++) {
			DeviceInfo deviceInfo = new DeviceInfo();
			deviceInfo.setRegionID(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].RegionID"));
			deviceInfo.setID(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].ID"));
			deviceInfo.setIP(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].IP"));
			deviceInfo.setServer(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].Server"));
			deviceInfo.setStatus(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].Status"));
			deviceInfo.setType(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].Type"));
			deviceInfo.setMac(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].Mac"));
			deviceInfo.setISP(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].ISP"));
			deviceInfo.setDeviceName(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].DeviceName"));
			deviceInfo.setImageID(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].ImageID"));

			resourceDetailInfos.add(deviceInfo);
		}
		describeDeviceServiceResponse.setResourceDetailInfos(resourceDetailInfos);

		List<ResourceInfosItem> resourceInfos = new ArrayList<ResourceInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeviceServiceResponse.ResourceInfos.Length"); i++) {
			ResourceInfosItem resourceInfosItem = new ResourceInfosItem();
			resourceInfosItem.setAppVersion(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].AppVersion"));
			resourceInfosItem.setAreaCode(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].AreaCode"));
			resourceInfosItem.setAreaName(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].AreaName"));
			resourceInfosItem.setCreateTime(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].CreateTime"));
			resourceInfosItem.setInstanceId(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].InstanceId"));
			resourceInfosItem.setInstanceStatus(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].InstanceStatus"));
			resourceInfosItem.setRegionCode(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].RegionCode"));
			resourceInfosItem.setRegionId(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].RegionId"));
			resourceInfosItem.setRegionName(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].RegionName"));

			List<DeviceInfosItem> deviceInfos = new ArrayList<DeviceInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].DeviceInfos.Length"); j++) {
				DeviceInfosItem deviceInfosItem = new DeviceInfosItem();
				deviceInfosItem.setName(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].DeviceInfos["+ j +"].Name"));
				deviceInfosItem.setStatus(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].DeviceInfos["+ j +"].Status"));

				List<Ports> network = new ArrayList<Ports>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].DeviceInfos["+ j +"].Network.Length"); k++) {
					Ports ports = new Ports();
					ports.setContainerPorts(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].DeviceInfos["+ j +"].Network["+ k +"].ContainerPorts"));
					ports.setExternalIp(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].DeviceInfos["+ j +"].Network["+ k +"].ExternalIp"));
					ports.setHostPorts(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].DeviceInfos["+ j +"].Network["+ k +"].HostPorts"));
					ports.setBizProtocol(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].DeviceInfos["+ j +"].Network["+ k +"].Protocol"));

					network.add(ports);
				}
				deviceInfosItem.setNetwork(network);

				deviceInfos.add(deviceInfosItem);
			}
			resourceInfosItem.setDeviceInfos(deviceInfos);

			List<InternalIpsItem> internalIps = new ArrayList<InternalIpsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].InternalIps.Length"); j++) {
				InternalIpsItem internalIpsItem = new InternalIpsItem();
				internalIpsItem.setIp(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].InternalIps["+ j +"].Ip"));

				internalIps.add(internalIpsItem);
			}
			resourceInfosItem.setInternalIps(internalIps);

			List<PublicIpsItem> publicIps = new ArrayList<PublicIpsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].PublicIps.Length"); j++) {
				PublicIpsItem publicIpsItem = new PublicIpsItem();
				publicIpsItem.setIp(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceInfos["+ i +"].PublicIps["+ j +"].Ip"));

				publicIps.add(publicIpsItem);
			}
			resourceInfosItem.setPublicIps(publicIps);

			resourceInfos.add(resourceInfosItem);
		}
		describeDeviceServiceResponse.setResourceInfos(resourceInfos);
	 
	 	return describeDeviceServiceResponse;
	}
}