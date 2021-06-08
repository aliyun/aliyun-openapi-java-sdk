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

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.GetLoadBalancerAttributeResponse;
import com.aliyuncs.alb.model.v20200616.GetLoadBalancerAttributeResponse.AccessLogConfig;
import com.aliyuncs.alb.model.v20200616.GetLoadBalancerAttributeResponse.DeletionProtectionConfig;
import com.aliyuncs.alb.model.v20200616.GetLoadBalancerAttributeResponse.LoadBalancerBillingConfig;
import com.aliyuncs.alb.model.v20200616.GetLoadBalancerAttributeResponse.LoadBalancerOperationLock;
import com.aliyuncs.alb.model.v20200616.GetLoadBalancerAttributeResponse.ModificationProtectionConfig;
import com.aliyuncs.alb.model.v20200616.GetLoadBalancerAttributeResponse.Tag;
import com.aliyuncs.alb.model.v20200616.GetLoadBalancerAttributeResponse.ZoneMapping;
import com.aliyuncs.alb.model.v20200616.GetLoadBalancerAttributeResponse.ZoneMapping.LoadBalancerAddress;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLoadBalancerAttributeResponseUnmarshaller {

	public static GetLoadBalancerAttributeResponse unmarshall(GetLoadBalancerAttributeResponse getLoadBalancerAttributeResponse, UnmarshallerContext _ctx) {
		
		getLoadBalancerAttributeResponse.setRequestId(_ctx.stringValue("GetLoadBalancerAttributeResponse.RequestId"));
		getLoadBalancerAttributeResponse.setAddressAllocatedMode(_ctx.stringValue("GetLoadBalancerAttributeResponse.AddressAllocatedMode"));
		getLoadBalancerAttributeResponse.setAddressType(_ctx.stringValue("GetLoadBalancerAttributeResponse.AddressType"));
		getLoadBalancerAttributeResponse.setBandwidthPackageId(_ctx.stringValue("GetLoadBalancerAttributeResponse.BandwidthPackageId"));
		getLoadBalancerAttributeResponse.setCreateTime(_ctx.stringValue("GetLoadBalancerAttributeResponse.CreateTime"));
		getLoadBalancerAttributeResponse.setDNSName(_ctx.stringValue("GetLoadBalancerAttributeResponse.DNSName"));
		getLoadBalancerAttributeResponse.setLoadBalancerBussinessStatus(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerBussinessStatus"));
		getLoadBalancerAttributeResponse.setLoadBalancerEdition(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerEdition"));
		getLoadBalancerAttributeResponse.setLoadBalancerId(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerId"));
		getLoadBalancerAttributeResponse.setLoadBalancerName(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerName"));
		getLoadBalancerAttributeResponse.setLoadBalancerStatus(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerStatus"));
		getLoadBalancerAttributeResponse.setRegionId(_ctx.stringValue("GetLoadBalancerAttributeResponse.RegionId"));
		getLoadBalancerAttributeResponse.setResourceGroupId(_ctx.stringValue("GetLoadBalancerAttributeResponse.ResourceGroupId"));
		getLoadBalancerAttributeResponse.setVpcId(_ctx.stringValue("GetLoadBalancerAttributeResponse.VpcId"));

		AccessLogConfig accessLogConfig = new AccessLogConfig();
		accessLogConfig.setLogProject(_ctx.stringValue("GetLoadBalancerAttributeResponse.AccessLogConfig.LogProject"));
		accessLogConfig.setLogStore(_ctx.stringValue("GetLoadBalancerAttributeResponse.AccessLogConfig.LogStore"));
		getLoadBalancerAttributeResponse.setAccessLogConfig(accessLogConfig);

		DeletionProtectionConfig deletionProtectionConfig = new DeletionProtectionConfig();
		deletionProtectionConfig.setEnabled(_ctx.booleanValue("GetLoadBalancerAttributeResponse.DeletionProtectionConfig.Enabled"));
		deletionProtectionConfig.setEnabledTime(_ctx.stringValue("GetLoadBalancerAttributeResponse.DeletionProtectionConfig.EnabledTime"));
		getLoadBalancerAttributeResponse.setDeletionProtectionConfig(deletionProtectionConfig);

		LoadBalancerBillingConfig loadBalancerBillingConfig = new LoadBalancerBillingConfig();
		loadBalancerBillingConfig.setPayType(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerBillingConfig.PayType"));
		getLoadBalancerAttributeResponse.setLoadBalancerBillingConfig(loadBalancerBillingConfig);

		ModificationProtectionConfig modificationProtectionConfig = new ModificationProtectionConfig();
		modificationProtectionConfig.setReason(_ctx.stringValue("GetLoadBalancerAttributeResponse.ModificationProtectionConfig.Reason"));
		modificationProtectionConfig.setStatus(_ctx.stringValue("GetLoadBalancerAttributeResponse.ModificationProtectionConfig.Status"));
		getLoadBalancerAttributeResponse.setModificationProtectionConfig(modificationProtectionConfig);

		List<LoadBalancerOperationLock> loadBalancerOperationLocks = new ArrayList<LoadBalancerOperationLock>();
		for (int i = 0; i < _ctx.lengthValue("GetLoadBalancerAttributeResponse.LoadBalancerOperationLocks.Length"); i++) {
			LoadBalancerOperationLock loadBalancerOperationLock = new LoadBalancerOperationLock();
			loadBalancerOperationLock.setLockReason(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerOperationLocks["+ i +"].LockReason"));
			loadBalancerOperationLock.setLockType(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerOperationLocks["+ i +"].LockType"));

			loadBalancerOperationLocks.add(loadBalancerOperationLock);
		}
		getLoadBalancerAttributeResponse.setLoadBalancerOperationLocks(loadBalancerOperationLocks);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetLoadBalancerAttributeResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("GetLoadBalancerAttributeResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("GetLoadBalancerAttributeResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		getLoadBalancerAttributeResponse.setTags(tags);

		List<ZoneMapping> zoneMappings = new ArrayList<ZoneMapping>();
		for (int i = 0; i < _ctx.lengthValue("GetLoadBalancerAttributeResponse.ZoneMappings.Length"); i++) {
			ZoneMapping zoneMapping = new ZoneMapping();
			zoneMapping.setVSwitchId(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].VSwitchId"));
			zoneMapping.setZoneId(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].ZoneId"));

			List<LoadBalancerAddress> loadBalancerAddresses = new ArrayList<LoadBalancerAddress>();
			for (int j = 0; j < _ctx.lengthValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].LoadBalancerAddresses.Length"); j++) {
				LoadBalancerAddress loadBalancerAddress = new LoadBalancerAddress();
				loadBalancerAddress.setAddress(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].LoadBalancerAddresses["+ j +"].Address"));

				loadBalancerAddresses.add(loadBalancerAddress);
			}
			zoneMapping.setLoadBalancerAddresses(loadBalancerAddresses);

			zoneMappings.add(zoneMapping);
		}
		getLoadBalancerAttributeResponse.setZoneMappings(zoneMappings);
	 
	 	return getLoadBalancerAttributeResponse;
	}
}