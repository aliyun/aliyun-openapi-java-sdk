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

import com.aliyuncs.gwlb.model.v20240415.ListLoadBalancersResponse;
import com.aliyuncs.gwlb.model.v20240415.ListLoadBalancersResponse.Data;
import com.aliyuncs.gwlb.model.v20240415.ListLoadBalancersResponse.Data.TagModel;
import com.aliyuncs.gwlb.model.v20240415.ListLoadBalancersResponse.Data.ZoneEniModel;
import com.aliyuncs.gwlb.model.v20240415.ListLoadBalancersResponse.Data.ZoneEniModel.EniModels;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLoadBalancersResponseUnmarshaller {

	public static ListLoadBalancersResponse unmarshall(ListLoadBalancersResponse listLoadBalancersResponse, UnmarshallerContext _ctx) {
		
		listLoadBalancersResponse.setRequestId(_ctx.stringValue("ListLoadBalancersResponse.RequestId"));
		listLoadBalancersResponse.setMaxResults(_ctx.integerValue("ListLoadBalancersResponse.MaxResults"));
		listLoadBalancersResponse.setNextToken(_ctx.stringValue("ListLoadBalancersResponse.NextToken"));
		listLoadBalancersResponse.setTotalCount(_ctx.integerValue("ListLoadBalancersResponse.TotalCount"));

		List<Data> loadBalancers = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListLoadBalancersResponse.LoadBalancers.Length"); i++) {
			Data data = new Data();
			data.setAddressIpVersion(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].AddressIpVersion"));
			data.setCreateTime(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].CreateTime"));
			data.setCrossZoneEnabled(_ctx.booleanValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].CrossZoneEnabled"));
			data.setLoadBalancerBusinessStatus(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerBusinessStatus"));
			data.setLoadBalancerId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerId"));
			data.setLoadBalancerName(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerName"));
			data.setLoadBalancerStatus(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerStatus"));
			data.setResourceGroupId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ResourceGroupId"));
			data.setVpcId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].VpcId"));

			List<TagModel> tags = new ArrayList<TagModel>();
			for (int j = 0; j < _ctx.lengthValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].Tags.Length"); j++) {
				TagModel tagModel = new TagModel();
				tagModel.setKey(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].Tags["+ j +"].Key"));
				tagModel.setValue(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagModel);
			}
			data.setTags(tags);

			List<ZoneEniModel> zoneMappings = new ArrayList<ZoneEniModel>();
			for (int j = 0; j < _ctx.lengthValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings.Length"); j++) {
				ZoneEniModel zoneEniModel = new ZoneEniModel();
				zoneEniModel.setVSwitchId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].VSwitchId"));
				zoneEniModel.setZoneId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].ZoneId"));

				List<EniModels> loadBalancerAddresses = new ArrayList<EniModels>();
				for (int k = 0; k < _ctx.lengthValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].LoadBalancerAddresses.Length"); k++) {
					EniModels eniModels = new EniModels();
					eniModels.setEniId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].LoadBalancerAddresses["+ k +"].EniId"));
					eniModels.setPrivateIpv4Address(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ZoneMappings["+ j +"].LoadBalancerAddresses["+ k +"].PrivateIpv4Address"));

					loadBalancerAddresses.add(eniModels);
				}
				zoneEniModel.setLoadBalancerAddresses(loadBalancerAddresses);

				zoneMappings.add(zoneEniModel);
			}
			data.setZoneMappings(zoneMappings);

			loadBalancers.add(data);
		}
		listLoadBalancersResponse.setLoadBalancers(loadBalancers);
	 
	 	return listLoadBalancersResponse;
	}
}