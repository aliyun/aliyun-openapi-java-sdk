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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDetailInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDetailInstanceResponseUnmarshaller {

	public static OpsDetailInstanceResponse unmarshall(OpsDetailInstanceResponse opsDetailInstanceResponse, UnmarshallerContext _ctx) {
		
		opsDetailInstanceResponse.setRequestId(_ctx.stringValue("OpsDetailInstanceResponse.RequestId"));
		opsDetailInstanceResponse.setRegionId(_ctx.stringValue("OpsDetailInstanceResponse.RegionId"));
		opsDetailInstanceResponse.setZoneId(_ctx.stringValue("OpsDetailInstanceResponse.ZoneId"));
		opsDetailInstanceResponse.setClusterId(_ctx.stringValue("OpsDetailInstanceResponse.ClusterId"));
		opsDetailInstanceResponse.setInstanceId(_ctx.stringValue("OpsDetailInstanceResponse.InstanceId"));
		opsDetailInstanceResponse.setResourceOwnerId(_ctx.longValue("OpsDetailInstanceResponse.ResourceOwnerId"));
		opsDetailInstanceResponse.setHostname(_ctx.stringValue("OpsDetailInstanceResponse.Hostname"));
		opsDetailInstanceResponse.setInstanceName(_ctx.stringValue("OpsDetailInstanceResponse.InstanceName"));
		opsDetailInstanceResponse.setDescription(_ctx.stringValue("OpsDetailInstanceResponse.Description"));
		opsDetailInstanceResponse.setStatus(_ctx.stringValue("OpsDetailInstanceResponse.Status"));
		opsDetailInstanceResponse.setBusinessStatus(_ctx.stringValue("OpsDetailInstanceResponse.BusinessStatus"));
		opsDetailInstanceResponse.setHouyiStatus(_ctx.stringValue("OpsDetailInstanceResponse.HouyiStatus"));
		opsDetailInstanceResponse.setInnerIpAddress(_ctx.stringValue("OpsDetailInstanceResponse.InnerIpAddress"));
		opsDetailInstanceResponse.setPublicBindIpAddress(_ctx.stringValue("OpsDetailInstanceResponse.PublicBindIpAddress"));
		opsDetailInstanceResponse.setPublicAssignIpAddress(_ctx.stringValue("OpsDetailInstanceResponse.PublicAssignIpAddress"));
		opsDetailInstanceResponse.setPublicAssignNatIpAddress(_ctx.stringValue("OpsDetailInstanceResponse.PublicAssignNatIpAddress"));
		opsDetailInstanceResponse.setImageId(_ctx.stringValue("OpsDetailInstanceResponse.ImageId"));
		opsDetailInstanceResponse.setImageName(_ctx.stringValue("OpsDetailInstanceResponse.ImageName"));
		opsDetailInstanceResponse.setCores(_ctx.integerValue("OpsDetailInstanceResponse.Cores"));
		opsDetailInstanceResponse.setMem(_ctx.integerValue("OpsDetailInstanceResponse.Mem"));
		opsDetailInstanceResponse.setIntranetRx(_ctx.integerValue("OpsDetailInstanceResponse.IntranetRx"));
		opsDetailInstanceResponse.setIntranetTx(_ctx.integerValue("OpsDetailInstanceResponse.IntranetTx"));
		opsDetailInstanceResponse.setInternetRx(_ctx.integerValue("OpsDetailInstanceResponse.InternetRx"));
		opsDetailInstanceResponse.setInternetTx(_ctx.integerValue("OpsDetailInstanceResponse.InternetTx"));
		opsDetailInstanceResponse.setSecurityControl(_ctx.stringValue("OpsDetailInstanceResponse.SecurityControl"));
		opsDetailInstanceResponse.setSystemDeviceCategory(_ctx.stringValue("OpsDetailInstanceResponse.SystemDeviceCategory"));
		opsDetailInstanceResponse.setVpcId(_ctx.stringValue("OpsDetailInstanceResponse.VpcId"));
		opsDetailInstanceResponse.setVswId(_ctx.stringValue("OpsDetailInstanceResponse.VswId"));
		opsDetailInstanceResponse.setNatIp(_ctx.stringValue("OpsDetailInstanceResponse.NatIp"));
		opsDetailInstanceResponse.setEip(_ctx.stringValue("OpsDetailInstanceResponse.Eip"));
		opsDetailInstanceResponse.setEipId(_ctx.stringValue("OpsDetailInstanceResponse.EipId"));
		opsDetailInstanceResponse.setEipBandwidth(_ctx.integerValue("OpsDetailInstanceResponse.EipBandwidth"));
		opsDetailInstanceResponse.setNetWorkType(_ctx.stringValue("OpsDetailInstanceResponse.NetWorkType"));
		opsDetailInstanceResponse.setNetworkValidation(_ctx.booleanValue("OpsDetailInstanceResponse.NetworkValidation"));
		opsDetailInstanceResponse.setIoOptimized(_ctx.booleanValue("OpsDetailInstanceResponse.IoOptimized"));
		opsDetailInstanceResponse.setVlanId(_ctx.stringValue("OpsDetailInstanceResponse.VlanId"));
		opsDetailInstanceResponse.setNcId(_ctx.stringValue("OpsDetailInstanceResponse.NcId"));
		opsDetailInstanceResponse.setRackId(_ctx.stringValue("OpsDetailInstanceResponse.RackId"));
		opsDetailInstanceResponse.setInstanceType(_ctx.stringValue("OpsDetailInstanceResponse.InstanceType"));
		opsDetailInstanceResponse.setPayType(_ctx.integerValue("OpsDetailInstanceResponse.PayType"));

		List<String> securityGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDetailInstanceResponse.SecurityGroupIds.Length"); i++) {
			securityGroupIds.add(_ctx.stringValue("OpsDetailInstanceResponse.SecurityGroupIds["+ i +"]"));
		}
		opsDetailInstanceResponse.setSecurityGroupIds(securityGroupIds);
	 
	 	return opsDetailInstanceResponse;
	}
}