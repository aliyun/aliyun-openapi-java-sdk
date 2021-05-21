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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancersResponse;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancersResponse.LoadBalancer;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancersResponse.LoadBalancer.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancersResponseUnmarshaller {

	public static DescribeLoadBalancersResponse unmarshall(DescribeLoadBalancersResponse describeLoadBalancersResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancersResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancersResponse.RequestId"));
		describeLoadBalancersResponse.setPageNumber(_ctx.integerValue("DescribeLoadBalancersResponse.PageNumber"));
		describeLoadBalancersResponse.setPageSize(_ctx.integerValue("DescribeLoadBalancersResponse.PageSize"));
		describeLoadBalancersResponse.setTotalCount(_ctx.integerValue("DescribeLoadBalancersResponse.TotalCount"));

		List<LoadBalancer> loadBalancers = new ArrayList<LoadBalancer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancersResponse.LoadBalancers.Length"); i++) {
			LoadBalancer loadBalancer = new LoadBalancer();
			loadBalancer.setLoadBalancerId(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerId"));
			loadBalancer.setLoadBalancerName(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerName"));
			loadBalancer.setLoadBalancerStatus(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerStatus"));
			loadBalancer.setAddress(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].Address"));
			loadBalancer.setAddressType(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].AddressType"));
			loadBalancer.setRegionId(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].RegionId"));
			loadBalancer.setRegionIdAlias(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].RegionIdAlias"));
			loadBalancer.setVSwitchId(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].VSwitchId"));
			loadBalancer.setVpcId(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].VpcId"));
			loadBalancer.setNetworkType(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].NetworkType"));
			loadBalancer.setMasterZoneId(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].MasterZoneId"));
			loadBalancer.setSlaveZoneId(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].SlaveZoneId"));
			loadBalancer.setInternetChargeType(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].InternetChargeType"));
			loadBalancer.setCreateTime(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].CreateTime"));
			loadBalancer.setCreateTimeStamp(_ctx.longValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].CreateTimeStamp"));
			loadBalancer.setPayType(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].PayType"));
			loadBalancer.setResourceGroupId(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].ResourceGroupId"));
			loadBalancer.setAddressIPVersion(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].AddressIPVersion"));
			loadBalancer.setBusinessStatus(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].BusinessStatus"));
			loadBalancer.setModificationProtectionStatus(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].ModificationProtectionStatus"));
			loadBalancer.setModificationProtectionReason(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].ModificationProtectionReason"));
			loadBalancer.setBandwidth(_ctx.integerValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].Bandwidth"));
			loadBalancer.setInternetChargeTypeAlias(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].InternetChargeTypeAlias"));
			loadBalancer.setLoadBalancerSpec(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerSpec"));
			loadBalancer.setDeleteProtection(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].DeleteProtection"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			loadBalancer.setTags(tags);

			loadBalancers.add(loadBalancer);
		}
		describeLoadBalancersResponse.setLoadBalancers(loadBalancers);
	 
	 	return describeLoadBalancersResponse;
	}
}