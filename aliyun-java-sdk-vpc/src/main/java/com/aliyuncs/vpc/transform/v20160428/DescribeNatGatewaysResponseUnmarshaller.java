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
		describeNatGatewaysResponse.setTotalCount(_ctx.integerValue("DescribeNatGatewaysResponse.TotalCount"));
		describeNatGatewaysResponse.setPageNumber(_ctx.integerValue("DescribeNatGatewaysResponse.PageNumber"));
		describeNatGatewaysResponse.setPageSize(_ctx.integerValue("DescribeNatGatewaysResponse.PageSize"));

		List<NatGateway> natGateways = new ArrayList<NatGateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNatGatewaysResponse.NatGateways.Length"); i++) {
			NatGateway natGateway = new NatGateway();
			natGateway.setNatGatewayId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatGatewayId"));
			natGateway.setRegionId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].RegionId"));
			natGateway.setName(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].Name"));
			natGateway.setDescription(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].Description"));
			natGateway.setVpcId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].VpcId"));
			natGateway.setSpec(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].Spec"));
			natGateway.setInstanceChargeType(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].InstanceChargeType"));
			natGateway.setExpiredTime(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].ExpiredTime"));
			natGateway.setAutoPay(_ctx.booleanValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].AutoPay"));
			natGateway.setBusinessStatus(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].BusinessStatus"));
			natGateway.setCreationTime(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].CreationTime"));
			natGateway.setStatus(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].Status"));
			natGateway.setNatType(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatType"));
			natGateway.setInternetChargeType(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].InternetChargeType"));
			natGateway.setResourceGroupId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].ResourceGroupId"));
			natGateway.setDeletionProtection(_ctx.booleanValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].DeletionProtection"));

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
			natGatewayPrivateInfo.setEniInstanceId(_ctx.integerValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatGatewayPrivateInfo.EniInstanceId"));
			natGatewayPrivateInfo.setPrivateIpAddress(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatGatewayPrivateInfo.PrivateIpAddress"));
			natGatewayPrivateInfo.setVswitchId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatGatewayPrivateInfo.VswitchId"));
			natGatewayPrivateInfo.setIzNo(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatGatewayPrivateInfo.IzNo"));
			natGatewayPrivateInfo.setMaxBandwidth(_ctx.integerValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatGatewayPrivateInfo.MaxBandwidth"));
			natGateway.setNatGatewayPrivateInfo(natGatewayPrivateInfo);

			List<IpList> ipLists = new ArrayList<IpList>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].IpLists.Length"); j++) {
				IpList ipList = new IpList();
				ipList.setAllocationId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].IpLists["+ j +"].AllocationId"));
				ipList.setIpAddress(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].IpLists["+ j +"].IpAddress"));
				ipList.setUsingStatus(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].IpLists["+ j +"].UsingStatus"));
				ipList.setApAccessEnabled(_ctx.booleanValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].IpLists["+ j +"].ApAccessEnabled"));
				ipList.setSnatEntryEnabled(_ctx.booleanValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].IpLists["+ j +"].SnatEntryEnabled"));

				ipLists.add(ipList);
			}
			natGateway.setIpLists(ipLists);

			natGateways.add(natGateway);
		}
		describeNatGatewaysResponse.setNatGateways(natGateways);
	 
	 	return describeNatGatewaysResponse;
	}
}