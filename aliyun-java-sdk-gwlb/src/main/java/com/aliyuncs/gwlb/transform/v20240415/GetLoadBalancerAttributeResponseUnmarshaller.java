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

package com.aliyuncs.gwlb.transform.v20240415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gwlb.model.v20240415.GetLoadBalancerAttributeResponse;
import com.aliyuncs.gwlb.model.v20240415.GetLoadBalancerAttributeResponse.TagModel;
import com.aliyuncs.gwlb.model.v20240415.GetLoadBalancerAttributeResponse.ZoneEniModel;
import com.aliyuncs.gwlb.model.v20240415.GetLoadBalancerAttributeResponse.ZoneEniModel.EniModels;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLoadBalancerAttributeResponseUnmarshaller {

	public static GetLoadBalancerAttributeResponse unmarshall(GetLoadBalancerAttributeResponse getLoadBalancerAttributeResponse, UnmarshallerContext _ctx) {
		
		getLoadBalancerAttributeResponse.setRequestId(_ctx.stringValue("GetLoadBalancerAttributeResponse.RequestId"));
		getLoadBalancerAttributeResponse.setAddressIpVersion(_ctx.stringValue("GetLoadBalancerAttributeResponse.AddressIpVersion"));
		getLoadBalancerAttributeResponse.setCreateTime(_ctx.stringValue("GetLoadBalancerAttributeResponse.CreateTime"));
		getLoadBalancerAttributeResponse.setCrossZoneEnabled(_ctx.booleanValue("GetLoadBalancerAttributeResponse.CrossZoneEnabled"));
		getLoadBalancerAttributeResponse.setLoadBalancerBusinessStatus(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerBusinessStatus"));
		getLoadBalancerAttributeResponse.setLoadBalancerId(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerId"));
		getLoadBalancerAttributeResponse.setLoadBalancerName(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerName"));
		getLoadBalancerAttributeResponse.setLoadBalancerStatus(_ctx.stringValue("GetLoadBalancerAttributeResponse.LoadBalancerStatus"));
		getLoadBalancerAttributeResponse.setResourceGroupId(_ctx.stringValue("GetLoadBalancerAttributeResponse.ResourceGroupId"));
		getLoadBalancerAttributeResponse.setVpcId(_ctx.stringValue("GetLoadBalancerAttributeResponse.VpcId"));

		List<TagModel> tags = new ArrayList<TagModel>();
		for (int i = 0; i < _ctx.lengthValue("GetLoadBalancerAttributeResponse.Tags.Length"); i++) {
			TagModel tagModel = new TagModel();
			tagModel.setKey(_ctx.stringValue("GetLoadBalancerAttributeResponse.Tags["+ i +"].Key"));
			tagModel.setValue(_ctx.stringValue("GetLoadBalancerAttributeResponse.Tags["+ i +"].Value"));

			tags.add(tagModel);
		}
		getLoadBalancerAttributeResponse.setTags(tags);

		List<ZoneEniModel> zoneMappings = new ArrayList<ZoneEniModel>();
		for (int i = 0; i < _ctx.lengthValue("GetLoadBalancerAttributeResponse.ZoneMappings.Length"); i++) {
			ZoneEniModel zoneEniModel = new ZoneEniModel();
			zoneEniModel.setVSwitchId(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].VSwitchId"));
			zoneEniModel.setZoneId(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].ZoneId"));

			List<EniModels> loadBalancerAddresses = new ArrayList<EniModels>();
			for (int j = 0; j < _ctx.lengthValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].LoadBalancerAddresses.Length"); j++) {
				EniModels eniModels = new EniModels();
				eniModels.setEniId(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].LoadBalancerAddresses["+ j +"].EniId"));
				eniModels.setPrivateIpv4Address(_ctx.stringValue("GetLoadBalancerAttributeResponse.ZoneMappings["+ i +"].LoadBalancerAddresses["+ j +"].PrivateIpv4Address"));

				loadBalancerAddresses.add(eniModels);
			}
			zoneEniModel.setLoadBalancerAddresses(loadBalancerAddresses);

			zoneMappings.add(zoneEniModel);
		}
		getLoadBalancerAttributeResponse.setZoneMappings(zoneMappings);
	 
	 	return getLoadBalancerAttributeResponse;
	}
}