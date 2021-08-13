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
		describeSmartAccessGatewaysResponse.setPageSize(_ctx.integerValue("DescribeSmartAccessGatewaysResponse.PageSize"));
		describeSmartAccessGatewaysResponse.setPageNumber(_ctx.integerValue("DescribeSmartAccessGatewaysResponse.PageNumber"));

		List<SmartAccessGateway> smartAccessGateways = new ArrayList<SmartAccessGateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways.Length"); i++) {
			SmartAccessGateway smartAccessGateway = new SmartAccessGateway();
			smartAccessGateway.setSerialNumber(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SerialNumber"));
			smartAccessGateway.setStatus(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Status"));
			smartAccessGateway.setUpBandwidth4G(_ctx.integerValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].UpBandwidth4G"));
			smartAccessGateway.setBackupStatus(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].BackupStatus"));
			smartAccessGateway.setIdaasApplicationId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].IdaasApplicationId"));
			smartAccessGateway.setSoftwareVersion(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SoftwareVersion"));
			smartAccessGateway.setCreateTime(_ctx.longValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].CreateTime"));
			smartAccessGateway.setSmartAGId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SmartAGId"));
			smartAccessGateway.setUpBandwidthWan(_ctx.integerValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].UpBandwidthWan"));
			smartAccessGateway.setCity(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].City"));
			smartAccessGateway.setAclIds(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].AclIds"));
			smartAccessGateway.setQosIds(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].QosIds"));
			smartAccessGateway.setCidrBlock(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].CidrBlock"));
			smartAccessGateway.setDescription(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Description"));
			smartAccessGateway.setIpsecStatus(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].IpsecStatus"));
			smartAccessGateway.setEnterpriseCode(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].EnterpriseCode"));
			smartAccessGateway.setDpiStatus(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].DpiStatus"));
			smartAccessGateway.setAssociatedCcnId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].AssociatedCcnId"));
			smartAccessGateway.setName(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Name"));
			smartAccessGateway.setHardwareVersion(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].HardwareVersion"));
			smartAccessGateway.setIdaasId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].IdaasId"));
			smartAccessGateway.setDataPlan(_ctx.longValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].DataPlan"));
			smartAccessGateway.setAssociatedCcnName(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].AssociatedCcnName"));
			smartAccessGateway.setResellerUid(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].ResellerUid"));
			smartAccessGateway.setDpiMonitorStatus(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].DpiMonitorStatus"));
			smartAccessGateway.setMaxBandwidth(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].MaxBandwidth"));
			smartAccessGateway.setSmartAGUid(_ctx.longValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SmartAGUid"));
			smartAccessGateway.setBackupSoftwareVersion(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].BackupSoftwareVersion"));
			smartAccessGateway.setEndTime(_ctx.longValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].EndTime"));
			smartAccessGateway.setResellerInstanceId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].ResellerInstanceId"));
			smartAccessGateway.setVpnStatus(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].VpnStatus"));
			smartAccessGateway.setRoutingStrategy(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].RoutingStrategy"));
			smartAccessGateway.setSecurityLockThreshold(_ctx.integerValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SecurityLockThreshold"));
			smartAccessGateway.setResourceGroupId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].ResourceGroupId"));
			smartAccessGateway.setUserCount(_ctx.integerValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].UserCount"));
			smartAccessGateway.setAccessPointId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].AccessPointId"));
			smartAccessGateway.setApplicationBandwidthPackageId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].ApplicationBandwidthPackageId"));
			smartAccessGateway.setAccelerateBandwidth(_ctx.longValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].AccelerateBandwidth"));

			List<Link> links = new ArrayList<Link>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links.Length"); j++) {
				Link link = new Link();
				link.setType(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].Type"));
				link.setStatus(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].Status"));
				link.setEndTime(_ctx.longValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].EndTime"));
				link.setBandwidth(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].Bandwidth"));
				link.setRelateInstanceRegionId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].RelateInstanceRegionId"));
				link.setRelateInstanceId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].RelateInstanceId"));
				link.setInstanceId(_ctx.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Links["+ j +"].InstanceId"));
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