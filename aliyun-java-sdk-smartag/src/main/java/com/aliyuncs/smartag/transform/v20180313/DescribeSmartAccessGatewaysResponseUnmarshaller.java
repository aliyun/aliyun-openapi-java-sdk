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

import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewaysResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewaysResponse.SmartAccessGateway;
import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewaysResponse.SmartAccessGateway.Link;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSmartAccessGatewaysResponseUnmarshaller {

	public static DescribeSmartAccessGatewaysResponse unmarshall(DescribeSmartAccessGatewaysResponse describeSmartAccessGatewaysResponse, UnmarshallerContext _ctx) {
		
		describeSmartAccessGatewaysResponse.setRequestId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.RequestId"));
		describeSmartAccessGatewaysResponse.setTotalCount(_ctx.integerValue("DescribeSmartAccessGatewaysResponse.TotalCount"));
		describeSmartAccessGatewaysResponse.setPageNumber(_ctx.integerValue("DescribeSmartAccessGatewaysResponse.PageNumber"));
		describeSmartAccessGatewaysResponse.setPageSize(_ctx.integerValue("DescribeSmartAccessGatewaysResponse.PageSize"));

		List<SmartAccessGateway> smartAccessGateways = new ArrayList<SmartAccessGateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways.Length"); i++) {
			SmartAccessGateway smartAccessGateway = new SmartAccessGateway();
			smartAccessGateway.setSmartAGId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SmartAGId"));
			smartAccessGateway.setName(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Name"));
			smartAccessGateway.setCity(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].City"));
			smartAccessGateway.setMaxBandwidth(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].MaxBandwidth"));
			smartAccessGateway.setStatus(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Status"));
			smartAccessGateway.setCidrBlock(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].CidrBlock"));
			smartAccessGateway.setAssociatedCcnId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].AssociatedCcnId"));
			smartAccessGateway.setAssociatedCcnName(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].AssociatedCcnName"));
			smartAccessGateway.setDescription(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Description"));
			smartAccessGateway.setCreateTime(_ctx.longValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].CreateTime"));
			smartAccessGateway.setEndTime(_ctx.longValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].EndTime"));
			smartAccessGateway.setSoftwareVersion(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SoftwareVersion"));
			smartAccessGateway.setHardwareVersion(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].HardwareVersion"));
			smartAccessGateway.setSerialNumber(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SerialNumber"));
			smartAccessGateway.setSecurityLockThreshold(_ctx.integerValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SecurityLockThreshold"));
			smartAccessGateway.setAclIds(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].AclIds"));
			smartAccessGateway.setDataPlan(_ctx.longValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].DataPlan"));
			smartAccessGateway.setUserCount(_ctx.integerValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].UserCount"));
			smartAccessGateway.setRoutingStrategy(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].RoutingStrategy"));
			smartAccessGateway.setUpBandwidthWan(_ctx.integerValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].UpBandwidthWan"));
			smartAccessGateway.setUpBandwidth4G(_ctx.integerValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].UpBandwidth4G"));
			smartAccessGateway.setQosIds(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].QosIds"));
			smartAccessGateway.setBackupSoftwareVersion(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].BackupSoftwareVersion"));
			smartAccessGateway.setSmartAGUid(_ctx.longValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SmartAGUid"));
			smartAccessGateway.setBackupStatus(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].BackupStatus"));
			smartAccessGateway.setResourceGroupId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].ResourceGroupId"));
			smartAccessGateway.setVpnStatus(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].VpnStatus"));
			smartAccessGateway.setIpsecStatus(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].IpsecStatus"));
			smartAccessGateway.setAccessPointId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].AccessPointId"));

			List<Link> links = new ArrayList<Link>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links.Length"); j++) {
				Link link = new Link();
				link.setInstanceId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].InstanceId"));
				link.setType(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].Type"));
				link.setStatus(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].Status"));
				link.setEndTime(_ctx.longValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].EndTime"));
				link.setBandwidth(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].Bandwidth"));
				link.setRelateInstanceId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].RelateInstanceId"));
				link.setRelateInstanceRegionId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].RelateInstanceRegionId"));
				link.setCommodityType(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].CommodityType"));

				links.add(link);
			}
			smartAccessGateway.setLinks(links);

			smartAccessGateways.add(smartAccessGateway);
		}
		describeSmartAccessGatewaysResponse.setSmartAccessGateways(smartAccessGateways);
	 
	 	return describeSmartAccessGatewaysResponse;
	}
}