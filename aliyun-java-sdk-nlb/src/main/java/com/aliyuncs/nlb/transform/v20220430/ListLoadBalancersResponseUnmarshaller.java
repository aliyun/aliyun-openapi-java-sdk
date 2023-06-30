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

package com.aliyuncs.nlb.transform.v20220430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nlb.model.v20220430.ListLoadBalancersResponse;
import com.aliyuncs.nlb.model.v20220430.ListLoadBalancersResponse.LoadbalancerInfo;
import com.aliyuncs.nlb.model.v20220430.ListLoadBalancersResponse.LoadbalancerInfo.DeletionProtectionConfig;
import com.aliyuncs.nlb.model.v20220430.ListLoadBalancersResponse.LoadbalancerInfo.LoadBalancerBillingConfig;
import com.aliyuncs.nlb.model.v20220430.ListLoadBalancersResponse.LoadbalancerInfo.ModificationProtectionConfig;
import com.aliyuncs.nlb.model.v20220430.ListLoadBalancersResponse.LoadbalancerInfo.OperationLock;
import com.aliyuncs.nlb.model.v20220430.ListLoadBalancersResponse.LoadbalancerInfo.TagModels;
import com.aliyuncs.nlb.model.v20220430.ListLoadBalancersResponse.LoadbalancerInfo.ZoneMapping;
import com.aliyuncs.nlb.model.v20220430.ListLoadBalancersResponse.LoadbalancerInfo.ZoneMapping.LoadBalancerAddress;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLoadBalancersResponseUnmarshaller {

	public static ListLoadBalancersResponse unmarshall(ListLoadBalancersResponse listLoadBalancersResponse, UnmarshallerContext _ctx) {
		
		listLoadBalancersResponse.setRequestId(_ctx.stringValue("ListLoadBalancersResponse.RequestId"));
		listLoadBalancersResponse.setSuccess(_ctx.booleanValue("ListLoadBalancersResponse.Success"));
		listLoadBalancersResponse.setCode(_ctx.stringValue("ListLoadBalancersResponse.Code"));
		listLoadBalancersResponse.setMessage(_ctx.stringValue("ListLoadBalancersResponse.Message"));
		listLoadBalancersResponse.setHttpStatusCode(_ctx.integerValue("ListLoadBalancersResponse.HttpStatusCode"));
		listLoadBalancersResponse.setDynamicCode(_ctx.stringValue("ListLoadBalancersResponse.DynamicCode"));
		listLoadBalancersResponse.setDynamicMessage(_ctx.stringValue("ListLoadBalancersResponse.DynamicMessage"));
		listLoadBalancersResponse.setTotalCount(_ctx.integerValue("ListLoadBalancersResponse.TotalCount"));
		listLoadBalancersResponse.setNextToken(_ctx.stringValue("ListLoadBalancersResponse.NextToken"));
		listLoadBalancersResponse.setMaxResults(_ctx.integerValue("ListLoadBalancersResponse.MaxResults"));

		List<LoadbalancerInfo> loadBalancers = new ArrayList<LoadbalancerInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListLoadBalancersResponse.LoadBalancers.Length"); i++) {
			LoadbalancerInfo loadbalancerInfo = new LoadbalancerInfo();
			loadbalancerInfo.setRegionId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].RegionId"));
			loadbalancerInfo.setLoadBalancerId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerId"));
			loadbalancerInfo.setLoadBalancerName(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerName"));
			loadbalancerInfo.setLoadBalancerType(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerType"));
			loadbalancerInfo.setAddressType(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].AddressType"));
			loadbalancerInfo.setAddressIpVersion(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].AddressIpVersion"));
			loadbalancerInfo.setIpv6AddressType(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].Ipv6AddressType"));
			loadbalancerInfo.setLoadBalancerStatus(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerStatus"));
			loadbalancerInfo.setLoadBalancerBusinessStatus(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerBusinessStatus"));
			loadbalancerInfo.setVpcId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].VpcId"));
			loadbalancerInfo.setCapacityUnitCount(_ctx.longValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].CapacityUnitCount"));
			loadbalancerInfo.setCreateTime(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].CreateTime"));
			loadbalancerInfo.setResourceGroupId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ResourceGroupId"));
			loadbalancerInfo.setDNSName(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].DNSName"));
			loadbalancerInfo.setBandwidthPackageId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].BandwidthPackageId"));
			loadbalancerInfo.setSysSecurityGroupId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].SysSecurityGroupId"));
			loadbalancerInfo.setCrossZoneEnabled(_ctx.booleanValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].CrossZoneEnabled"));
			loadbalancerInfo.setTrafficAffinityEnabled(_ctx.booleanValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].TrafficAffinityEnabled"));
			loadbalancerInfo.setAliUid(_ctx.longValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].AliUid"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			loadbalancerInfo.setSecurityGroupIds(securityGroupIds);

			LoadBalancerBillingConfig loadBalancerBillingConfig = new LoadBalancerBillingConfig();
			loadBalancerBillingConfig.setInternetBandwidth(_ctx.integerValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerBillingConfig.InternetBandwidth"));
			loadBalancerBillingConfig.setInternetChargeType(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerBillingConfig.InternetChargeType"));
			loadBalancerBillingConfig.setPayType(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerBillingConfig.PayType"));
			loadbalancerInfo.setLoadBalancerBillingConfig(loadBalancerBillingConfig);

			DeletionProtectionConfig deletionProtectionConfig = new DeletionProtectionConfig();
			deletionProtectionConfig.setEnabled(_ctx.booleanValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].DeletionProtectionConfig.Enabled"));
			deletionProtectionConfig.setReason(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].DeletionProtectionConfig.Reason"));
			deletionProtectionConfig.setEnabledTime(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].DeletionProtectionConfig.EnabledTime"));
			loadbalancerInfo.setDeletionProtectionConfig(deletionProtectionConfig);

			ModificationProtectionConfig modificationProtectionConfig = new ModificationProtectionConfig();
			modificationProtectionConfig.setStatus(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ModificationProtectionConfig.Status"));
			modificationProtectionConfig.setReason(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ModificationProtectionConfig.Reason"));
			modificationProtectionConfig.setEnabledTime(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ModificationProtectionConfig.EnabledTime"));
			loadbalancerInfo.setModificationProtectionConfig(modificationProtectionConfig);

			List<OperationLock> operationLocks = new ArrayList<OperationLock>();
			for (int j = 0; j < _ctx.lengthValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].OperationLocks.Length"); j++) {
				OperationLock operationLock = new OperationLock();
				operationLock.setLockType(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].OperationLocks["+ j +"].LockType"));
				operationLock.setLockReason(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].OperationLocks["+ j +"].LockReason"));

				operationLocks.add(operationLock);
			}
			loadbalancerInfo.setOperationLocks(operationLocks);

			List<ZoneMapping> zoneMappings = new ArrayList<ZoneMapping>();
			for (int j = 0; j < _ctx.lengthValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings.Length"); j++) {
				ZoneMapping zoneMapping = new ZoneMapping();
				zoneMapping.setVSwitchId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].VSwitchId"));
				zoneMapping.setZoneId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].ZoneId"));
				zoneMapping.setEipType(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].EipType"));
				zoneMapping.setStatus(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].Status"));

				List<LoadBalancerAddress> loadBalancerAddresses = new ArrayList<LoadBalancerAddress>();
				for (int k = 0; k < _ctx.lengthValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].LoadBalancerAddresses.Length"); k++) {
					LoadBalancerAddress loadBalancerAddress = new LoadBalancerAddress();
					loadBalancerAddress.setEniId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].LoadBalancerAddresses["+ k +"].EniId"));
					loadBalancerAddress.setPrivateIPv4Address(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].LoadBalancerAddresses["+ k +"].PrivateIPv4Address"));
					loadBalancerAddress.setAllocationId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].LoadBalancerAddresses["+ k +"].AllocationId"));
					loadBalancerAddress.setPublicIPv4Address(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].LoadBalancerAddresses["+ k +"].PublicIPv4Address"));
					loadBalancerAddress.setIpv6Address(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].LoadBalancerAddresses["+ k +"].Ipv6Address"));
					loadBalancerAddress.setPrivateIPv4HcStatus(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].LoadBalancerAddresses["+ k +"].PrivateIPv4HcStatus"));
					loadBalancerAddress.setPrivateIPv6HcStatus(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].LoadBalancerAddresses["+ k +"].PrivateIPv6HcStatus"));

					loadBalancerAddresses.add(loadBalancerAddress);
				}
				zoneMapping.setLoadBalancerAddresses(loadBalancerAddresses);

				zoneMappings.add(zoneMapping);
			}
			loadbalancerInfo.setZoneMappings(zoneMappings);

			List<TagModels> tags = new ArrayList<TagModels>();
			for (int j = 0; j < _ctx.lengthValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].Tags.Length"); j++) {
				TagModels tagModels = new TagModels();
				tagModels.setKey(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].Tags["+ j +"].Key"));
				tagModels.setValue(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagModels);
			}
			loadbalancerInfo.setTags(tags);

			loadBalancers.add(loadbalancerInfo);
		}
		listLoadBalancersResponse.setLoadBalancers(loadBalancers);
	 
	 	return listLoadBalancersResponse;
	}
}