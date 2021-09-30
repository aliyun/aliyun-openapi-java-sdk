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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeNatGatewaysResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeNatGatewaysResponse.NatGateway;
import com.aliyuncs.vpc.model.v20160428.DescribeNatGatewaysResponse.NatGateway.IpList;
import com.aliyuncs.vpc.model.v20160428.DescribeNatGatewaysResponse.NatGateway.NatGatewayPrivateInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNatGatewaysResponseUnmarshaller {

	public static DescribeNatGatewaysResponse unmarshall(DescribeNatGatewaysResponse describeNatGatewaysResponse, UnmarshallerContext _ctx) {
		
		describeNatGatewaysResponse.setRequestId(_ctx.stringValue("DescribeNatGatewaysResponse.RequestId"));
		describeNatGatewaysResponse.setPageSize(_ctx.integerValue("DescribeNatGatewaysResponse.PageSize"));
		describeNatGatewaysResponse.setPageNumber(_ctx.integerValue("DescribeNatGatewaysResponse.PageNumber"));
		describeNatGatewaysResponse.setTotalCount(_ctx.integerValue("DescribeNatGatewaysResponse.TotalCount"));

		List<NatGateway> natGateways = new ArrayList<NatGateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNatGatewaysResponse.NatGateways.Length"); i++) {
			NatGateway natGateway = new NatGateway();
			natGateway.setStatus(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].Status"));
			natGateway.setCreationTime(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].CreationTime"));
			natGateway.setVpcId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].VpcId"));
			natGateway.setNatType(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatType"));
			natGateway.setAutoPay(_ctx.booleanValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].AutoPay"));
			natGateway.setSpec(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].Spec"));
			natGateway.setDeletionProtection(_ctx.booleanValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].DeletionProtection"));
			natGateway.setNetworkType(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NetworkType"));
			natGateway.setSecurityProtectionEnabled(_ctx.booleanValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].SecurityProtectionEnabled"));
			natGateway.setInstanceChargeType(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].InstanceChargeType"));
			natGateway.setRegionId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].RegionId"));
			natGateway.setEcsMetricEnabled(_ctx.booleanValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].EcsMetricEnabled"));
			natGateway.setIcmpReplyEnabled(_ctx.booleanValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].IcmpReplyEnabled"));
			natGateway.setDescription(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].Description"));
			natGateway.setExpiredTime(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].ExpiredTime"));
			natGateway.setResourceGroupId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].ResourceGroupId"));
			natGateway.setNatGatewayId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatGatewayId"));
			natGateway.setInternetChargeType(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].InternetChargeType"));
			natGateway.setBusinessStatus(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].BusinessStatus"));
			natGateway.setName(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].Name"));

			List<String> forwardTableIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].ForwardTableIds.Length"); j++) {
				forwardTableIds.add(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].ForwardTableIds["+ j +"]"));
			}
			natGateway.setForwardTableIds(forwardTableIds);

			List<String> snatTableIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].SnatTableIds.Length"); j++) {
				snatTableIds.add(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].SnatTableIds["+ j +"]"));
			}
			natGateway.setSnatTableIds(snatTableIds);

			List<String> bandwidthPackageIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].BandwidthPackageIds.Length"); j++) {
				bandwidthPackageIds.add(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].BandwidthPackageIds["+ j +"]"));
			}
			natGateway.setBandwidthPackageIds(bandwidthPackageIds);

			NatGatewayPrivateInfo natGatewayPrivateInfo = new NatGatewayPrivateInfo();
			natGatewayPrivateInfo.setVswitchId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatGatewayPrivateInfo.VswitchId"));
			natGatewayPrivateInfo.setEniInstanceId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatGatewayPrivateInfo.EniInstanceId"));
			natGatewayPrivateInfo.setMaxBandwidth(_ctx.integerValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatGatewayPrivateInfo.MaxBandwidth"));
			natGatewayPrivateInfo.setPrivateIpAddress(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatGatewayPrivateInfo.PrivateIpAddress"));
			natGatewayPrivateInfo.setIzNo(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatGatewayPrivateInfo.IzNo"));
			natGatewayPrivateInfo.setEniType(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatGatewayPrivateInfo.EniType"));
			natGateway.setNatGatewayPrivateInfo(natGatewayPrivateInfo);

			List<IpList> ipLists = new ArrayList<IpList>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].IpLists.Length"); j++) {
				IpList ipList = new IpList();
				ipList.setUsingStatus(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].IpLists["+ j +"].UsingStatus"));
				ipList.setIpAddress(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].IpLists["+ j +"].IpAddress"));
				ipList.setSnatEntryEnabled(_ctx.booleanValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].IpLists["+ j +"].SnatEntryEnabled"));
				ipList.setAllocationId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].IpLists["+ j +"].AllocationId"));
				ipList.setApAccessEnabled(_ctx.booleanValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].IpLists["+ j +"].ApAccessEnabled"));
				ipList.setPrivateIpAddress(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].IpLists["+ j +"].PrivateIpAddress"));

				ipLists.add(ipList);
			}
			natGateway.setIpLists(ipLists);

			natGateways.add(natGateway);
		}
		describeNatGatewaysResponse.setNatGateways(natGateways);
	 
	 	return describeNatGatewaysResponse;
	}
}