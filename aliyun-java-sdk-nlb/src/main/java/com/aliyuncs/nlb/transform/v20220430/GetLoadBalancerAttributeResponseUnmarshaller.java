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

import com.aliyuncs.nlb.model.v20220430.GetLoadBalancerAttributeResponse;
import com.aliyuncs.nlb.model.v20220430.GetLoadBalancerAttributeResponse.DeletionProtectionConfig;
import com.aliyuncs.nlb.model.v20220430.GetLoadBalancerAttributeResponse.LoadBalancerBillingConfig;
import com.aliyuncs.nlb.model.v20220430.GetLoadBalancerAttributeResponse.ModificationProtectionConfig;
import com.aliyuncs.nlb.model.v20220430.GetLoadBalancerAttributeResponse.OperationLock;
import com.aliyuncs.nlb.model.v20220430.GetLoadBalancerAttributeResponse.ZoneMapping;
import com.aliyuncs.nlb.model.v20220430.GetLoadBalancerAttributeResponse.ZoneMapping.LoadBalancerAddress;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLoadBalancerAttributeResponseUnmarshaller {

	public static GetLoadBalancerAttributeResponse unmarshall(GetLoadBalancerAttributeResponse getLoadBalancerAttributeResponse, UnmarshallerContext _ctx) {
		
		getLoadBalancerAttributeResponse.setRequestId(_ctx.stringValue("GetLoadBalancerAttributeResponse.RequestId"));
		getLoadBalancerAttributeResponse.setSuccess(_ctx.booleanValue("GetLoadBalancerAttributeResponse.Success"));
		getLoadBalancerAttributeResponse.setCode(_ctx.stringValue("GetLoadBalancerAttributeResponse.Code"));
		getLoadBalancerAttributeResponse.setMessage(_ctx.stringValue("GetLoadBalancerAttributeResponse.Message"));
		getLoadBalancerAttributeResponse.setHttpStatusCode(_ctx.integerValue("GetLoadBalancerAttributeResponse.HttpStatusCode"));
		getLoadBalancerAttributeResponse.setDynamicCode(_ctx.stringValue("GetLoadBalancerAttributeResponse.DynamicCode"));
		getLoadBalancerAttributeResponse.setDynamicMessage(_ctx.stringValue("GetLoadBalancerAttributeResponse.DynamicMessage"));
		getLoadBalancerAttributeResponse.setRegionId(_ctx.stringValue("GetLoadBalancerAttributeResponse.RegionId"));
		getLoadBalancerAttributeResponse.setLoadBalancerId(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerId"));
		getLoadBalancerAttributeResponse.setLoadBalancerName(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerName"));
		getLoadBalancerAttributeResponse.setLoadBalancerType(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerType"));
		getLoadBalancerAttributeResponse.setAddressType(_ctx.stringValue("GetLoadBalancerAttributeResponse.AddressType"));
		getLoadBalancerAttributeResponse.setAddressIpVersion(_ctx.stringValue("GetLoadBalancerAttributeResponse.AddressIpVersion"));
		getLoadBalancerAttributeResponse.setIpv6AddressType(_ctx.stringValue("GetLoadBalancerAttributeResponse.Ipv6AddressType"));
		getLoadBalancerAttributeResponse.setLoadBalancerStatus(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerStatus"));
		getLoadBalancerAttributeResponse.setLoadBalancerBusinessStatus(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerBusinessStatus"));
		getLoadBalancerAttributeResponse.setVpcId(_ctx.stringValue("GetLoadBalancerAttributeResponse.VpcId"));
		getLoadBalancerAttributeResponse.setCapacityUnitCount(_ctx.longValue("GetLoadBalancerAttributeResponse.CapacityUnitCount"));
		getLoadBalancerAttributeResponse.setCreateTime(_ctx.stringValue("GetLoadBalancerAttributeResponse.CreateTime"));
		getLoadBalancerAttributeResponse.setResourceGroupId(_ctx.stringValue("GetLoadBalancerAttributeResponse.ResourceGroupId"));
		getLoadBalancerAttributeResponse.setDNSName(_ctx.stringValue("GetLoadBalancerAttributeResponse.DNSName"));
		getLoadBalancerAttributeResponse.setBandwidthPackageId(_ctx.stringValue("GetLoadBalancerAttributeResponse.BandwidthPackageId"));
		getLoadBalancerAttributeResponse.setCrossZoneEnabled(_ctx.booleanValue("GetLoadBalancerAttributeResponse.CrossZoneEnabled"));
		getLoadBalancerAttributeResponse.setTrafficAffinityEnabled(_ctx.booleanValue("GetLoadBalancerAttributeResponse.TrafficAffinityEnabled"));
		getLoadBalancerAttributeResponse.setCps(_ctx.integerValue("GetLoadBalancerAttributeResponse.Cps"));
		getLoadBalancerAttributeResponse.setSysSecurityGroupId(_ctx.stringValue("GetLoadBalancerAttributeResponse.SysSecurityGroupId"));

		List<String> securityGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLoadBalancerAttributeResponse.SecurityGroupIds.Length"); i++) {
			securityGroupIds.add(_ctx.stringValue("GetLoadBalancerAttributeResponse.SecurityGroupIds["+ i +"]"));
		}
		getLoadBalancerAttributeResponse.setSecurityGroupIds(securityGroupIds);

		LoadBalancerBillingConfig loadBalancerBillingConfig = new LoadBalancerBillingConfig();
		loadBalancerBillingConfig.setInternetBandwidth(_ctx.integerValue("GetLoadBalancerAttributeResponse.LoadBalancerBillingConfig.InternetBandwidth"));
		loadBalancerBillingConfig.setInternetChargeType(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerBillingConfig.InternetChargeType"));
		loadBalancerBillingConfig.setPayType(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerBillingConfig.PayType"));
		getLoadBalancerAttributeResponse.setLoadBalancerBillingConfig(loadBalancerBillingConfig);

		DeletionProtectionConfig deletionProtectionConfig = new DeletionProtectionConfig();
		deletionProtectionConfig.setEnabled(_ctx.booleanValue("GetLoadBalancerAttributeResponse.DeletionProtectionConfig.Enabled"));
		deletionProtectionConfig.setReason(_ctx.stringValue("GetLoadBalancerAttributeResponse.DeletionProtectionConfig.Reason"));
		deletionProtectionConfig.setEnabledTime(_ctx.stringValue("GetLoadBalancerAttributeResponse.DeletionProtectionConfig.EnabledTime"));
		getLoadBalancerAttributeResponse.setDeletionProtectionConfig(deletionProtectionConfig);

		ModificationProtectionConfig modificationProtectionConfig = new ModificationProtectionConfig();
		modificationProtectionConfig.setStatus(_ctx.stringValue("GetLoadBalancerAttributeResponse.ModificationProtectionConfig.Status"));
		modificationProtectionConfig.setReason(_ctx.stringValue("GetLoadBalancerAttributeResponse.ModificationProtectionConfig.Reason"));
		modificationProtectionConfig.setEnabledTime(_ctx.stringValue("GetLoadBalancerAttributeResponse.ModificationProtectionConfig.EnabledTime"));
		getLoadBalancerAttributeResponse.setModificationProtectionConfig(modificationProtectionConfig);

		List<OperationLock> operationLocks = new ArrayList<OperationLock>();
		for (int i = 0; i < _ctx.lengthValue("GetLoadBalancerAttributeResponse.OperationLocks.Length"); i++) {
			OperationLock operationLock = new OperationLock();
			operationLock.setLockType(_ctx.stringValue("GetLoadBalancerAttributeResponse.OperationLocks["+ i +"].LockType"));
			operationLock.setLockReason(_ctx.stringValue("GetLoadBalancerAttributeResponse.OperationLocks["+ i +"].LockReason"));

			operationLocks.add(operationLock);
		}
		getLoadBalancerAttributeResponse.setOperationLocks(operationLocks);

		List<ZoneMapping> zoneMappings = new ArrayList<ZoneMapping>();
		for (int i = 0; i < _ctx.lengthValue("GetLoadBalancerAttributeResponse.ZoneMappings.Length"); i++) {
			ZoneMapping zoneMapping = new ZoneMapping();
			zoneMapping.setVSwitchId(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].VSwitchId"));
			zoneMapping.setZoneId(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].ZoneId"));
			zoneMapping.setEipType(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].EipType"));

			List<LoadBalancerAddress> loadBalancerAddresses = new ArrayList<LoadBalancerAddress>();
			for (int j = 0; j < _ctx.lengthValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].LoadBalancerAddresses.Length"); j++) {
				LoadBalancerAddress loadBalancerAddress = new LoadBalancerAddress();
				loadBalancerAddress.setEniId(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].LoadBalancerAddresses["+ j +"].EniId"));
				loadBalancerAddress.setPrivateIPv4Address(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].LoadBalancerAddresses["+ j +"].PrivateIPv4Address"));
				loadBalancerAddress.setAllocationId(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].LoadBalancerAddresses["+ j +"].AllocationId"));
				loadBalancerAddress.setPublicIPv4Address(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].LoadBalancerAddresses["+ j +"].PublicIPv4Address"));
				loadBalancerAddress.setIpv6Address(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].LoadBalancerAddresses["+ j +"].Ipv6Address"));

				loadBalancerAddresses.add(loadBalancerAddress);
			}
			zoneMapping.setLoadBalancerAddresses(loadBalancerAddresses);

			zoneMappings.add(zoneMapping);
		}
		getLoadBalancerAttributeResponse.setZoneMappings(zoneMappings);
	 
	 	return getLoadBalancerAttributeResponse;
	}
}