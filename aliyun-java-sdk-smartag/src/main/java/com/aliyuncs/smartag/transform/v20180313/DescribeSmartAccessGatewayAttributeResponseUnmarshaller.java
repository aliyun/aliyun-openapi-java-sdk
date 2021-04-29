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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewayAttributeResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewayAttributeResponse.Device;
import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewayAttributeResponse.Link;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSmartAccessGatewayAttributeResponseUnmarshaller {

	public static DescribeSmartAccessGatewayAttributeResponse unmarshall(DescribeSmartAccessGatewayAttributeResponse describeSmartAccessGatewayAttributeResponse, UnmarshallerContext _ctx) {
		
		describeSmartAccessGatewayAttributeResponse.setRequestId(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.RequestId"));
		describeSmartAccessGatewayAttributeResponse.setDescription(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Description"));
		describeSmartAccessGatewayAttributeResponse.setUpBandwidth4G(_ctx.integerValue("DescribeSmartAccessGatewayAttributeResponse.UpBandwidth4G"));
		describeSmartAccessGatewayAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.ResourceGroupId"));
		describeSmartAccessGatewayAttributeResponse.setEndTime(_ctx.longValue("DescribeSmartAccessGatewayAttributeResponse.EndTime"));
		describeSmartAccessGatewayAttributeResponse.setUserCount(_ctx.integerValue("DescribeSmartAccessGatewayAttributeResponse.UserCount"));
		describeSmartAccessGatewayAttributeResponse.setVpnStatus(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.VpnStatus"));
		describeSmartAccessGatewayAttributeResponse.setMaxBandwidth(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.MaxBandwidth"));
		describeSmartAccessGatewayAttributeResponse.setAssociatedCcnName(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.AssociatedCcnName"));
		describeSmartAccessGatewayAttributeResponse.setBoxControllerIp(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.BoxControllerIp"));
		describeSmartAccessGatewayAttributeResponse.setCidrBlock(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.CidrBlock"));
		describeSmartAccessGatewayAttributeResponse.setUpBandwidthWan(_ctx.integerValue("DescribeSmartAccessGatewayAttributeResponse.UpBandwidthWan"));
		describeSmartAccessGatewayAttributeResponse.setName(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Name"));
		describeSmartAccessGatewayAttributeResponse.setOptimizationType(_ctx.booleanValue("DescribeSmartAccessGatewayAttributeResponse.OptimizationType"));
		describeSmartAccessGatewayAttributeResponse.setIpsecStatus(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.IpsecStatus"));
		describeSmartAccessGatewayAttributeResponse.setRoutingStrategy(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.RoutingStrategy"));
		describeSmartAccessGatewayAttributeResponse.setAssociatedCcnId(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.AssociatedCcnId"));
		describeSmartAccessGatewayAttributeResponse.setInstanceType(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.InstanceType"));
		describeSmartAccessGatewayAttributeResponse.setSmartAGId(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.SmartAGId"));
		describeSmartAccessGatewayAttributeResponse.setSecurityLockThreshold(_ctx.integerValue("DescribeSmartAccessGatewayAttributeResponse.SecurityLockThreshold"));
		describeSmartAccessGatewayAttributeResponse.setResellerUid(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.ResellerUid"));
		describeSmartAccessGatewayAttributeResponse.setStatus(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Status"));
		describeSmartAccessGatewayAttributeResponse.setCreateTime(_ctx.longValue("DescribeSmartAccessGatewayAttributeResponse.CreateTime"));
		describeSmartAccessGatewayAttributeResponse.setDataPlan(_ctx.longValue("DescribeSmartAccessGatewayAttributeResponse.DataPlan"));
		describeSmartAccessGatewayAttributeResponse.setEnableOptimization(_ctx.booleanValue("DescribeSmartAccessGatewayAttributeResponse.EnableOptimization"));
		describeSmartAccessGatewayAttributeResponse.setCity(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.City"));
		describeSmartAccessGatewayAttributeResponse.setResellerInstanceId(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.ResellerInstanceId"));
		describeSmartAccessGatewayAttributeResponse.setBackupBoxControllerIp(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.BackupBoxControllerIp"));
		describeSmartAccessGatewayAttributeResponse.setSerialNumber(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.SerialNumber"));
		describeSmartAccessGatewayAttributeResponse.setTrafficMasterSn(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.TrafficMasterSn"));
		describeSmartAccessGatewayAttributeResponse.setAccessPointId(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.AccessPointId"));

		List<String> qosIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSmartAccessGatewayAttributeResponse.QosIds.Length"); i++) {
			qosIds.add(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.QosIds["+ i +"]"));
		}
		describeSmartAccessGatewayAttributeResponse.setQosIds(qosIds);

		List<String> flowLogIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSmartAccessGatewayAttributeResponse.FlowLogIds.Length"); i++) {
			flowLogIds.add(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.FlowLogIds["+ i +"]"));
		}
		describeSmartAccessGatewayAttributeResponse.setFlowLogIds(flowLogIds);

		List<String> aclIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSmartAccessGatewayAttributeResponse.AclIds.Length"); i++) {
			aclIds.add(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.AclIds["+ i +"]"));
		}
		describeSmartAccessGatewayAttributeResponse.setAclIds(aclIds);

		List<Link> links = new ArrayList<Link>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSmartAccessGatewayAttributeResponse.Links.Length"); i++) {
			Link link = new Link();
			link.setStatus(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Links["+ i +"].Status"));
			link.setType(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Links["+ i +"].Type"));
			link.setEndTime(_ctx.longValue("DescribeSmartAccessGatewayAttributeResponse.Links["+ i +"].EndTime"));
			link.setInstanceId(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Links["+ i +"].InstanceId"));
			link.setRelateInstanceId(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Links["+ i +"].RelateInstanceId"));
			link.setBandwidth(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Links["+ i +"].Bandwidth"));
			link.setCommodityType(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Links["+ i +"].CommodityType"));
			link.setRelateInstanceRegionId(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Links["+ i +"].RelateInstanceRegionId"));
			link.setHealthCheckTargetIp(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Links["+ i +"].HealthCheckTargetIp"));

			links.add(link);
		}
		describeSmartAccessGatewayAttributeResponse.setLinks(links);

		List<Device> devices = new ArrayList<Device>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSmartAccessGatewayAttributeResponse.Devices.Length"); i++) {
			Device device = new Device();
			device.setMonitorVersion(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Devices["+ i +"].MonitorVersion"));
			device.setSecretKey(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Devices["+ i +"].SecretKey"));
			device.setSoftwareVersion(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Devices["+ i +"].SoftwareVersion"));
			device.setSerialNumber(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Devices["+ i +"].SerialNumber"));
			device.setDistributeSkStatus(_ctx.integerValue("DescribeSmartAccessGatewayAttributeResponse.Devices["+ i +"].DistributeSkStatus"));
			device.setDpiSignatureDbVersion(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Devices["+ i +"].DpiSignatureDbVersion"));
			device.setHaState(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Devices["+ i +"].HaState"));
			device.setHcState(_ctx.stringValue("DescribeSmartAccessGatewayAttributeResponse.Devices["+ i +"].HcState"));

			devices.add(device);
		}
		describeSmartAccessGatewayAttributeResponse.setDevices(devices);
	 
	 	return describeSmartAccessGatewayAttributeResponse;
	}
}