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

package com.aliyuncs.slb.transform.v20130221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20130221.DescribeLoadBalancersResponse;
import com.aliyuncs.slb.model.v20130221.DescribeLoadBalancersResponse.LoadBalancer;
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
			loadBalancer.setVpcId(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].VpcId"));
			loadBalancer.setCreateTimeStamp(_ctx.longValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].CreateTimeStamp"));
			loadBalancer.setCreateTime(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].CreateTime"));
			loadBalancer.setLoadBalancerId(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerId"));
			loadBalancer.setPayType(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].PayType"));
			loadBalancer.setAddressType(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].AddressType"));
			loadBalancer.setNetworkType(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].NetworkType"));
			loadBalancer.setRegionId(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].RegionId"));
			loadBalancer.setVSwitchId(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].VSwitchId"));
			loadBalancer.setLoadBalancerStatus(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerStatus"));
			loadBalancer.setLoadBalancerName(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerName"));
			loadBalancer.setResourceGroupId(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].ResourceGroupId"));
			loadBalancer.setInternetChargeType(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].InternetChargeType"));
			loadBalancer.setAddress(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].Address"));
			loadBalancer.setSlaveZoneId(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].SlaveZoneId"));
			loadBalancer.setRegionIdAlias(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].RegionIdAlias"));
			loadBalancer.setMasterZoneId(_ctx.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].MasterZoneId"));

			loadBalancers.add(loadBalancer);
		}
		describeLoadBalancersResponse.setLoadBalancers(loadBalancers);
	 
	 	return describeLoadBalancersResponse;
	}
}