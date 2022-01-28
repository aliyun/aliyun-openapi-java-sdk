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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeLoadBalancerSpecResponse;
import com.aliyuncs.ens.model.v20171110.DescribeLoadBalancerSpecResponse.LoadBalancerSpecsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancerSpecResponseUnmarshaller {

	public static DescribeLoadBalancerSpecResponse unmarshall(DescribeLoadBalancerSpecResponse describeLoadBalancerSpecResponse, UnmarshallerContext _ctx) {
		
		describeLoadBalancerSpecResponse.setRequestId(_ctx.stringValue("DescribeLoadBalancerSpecResponse.RequestId"));
		describeLoadBalancerSpecResponse.setPageNumber(_ctx.integerValue("DescribeLoadBalancerSpecResponse.PageNumber"));
		describeLoadBalancerSpecResponse.setPageSize(_ctx.integerValue("DescribeLoadBalancerSpecResponse.PageSize"));
		describeLoadBalancerSpecResponse.setTotalCount(_ctx.integerValue("DescribeLoadBalancerSpecResponse.TotalCount"));

		List<LoadBalancerSpecsItem> loadBalancerSpecs = new ArrayList<LoadBalancerSpecsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoadBalancerSpecResponse.LoadBalancerSpecs.Length"); i++) {
			LoadBalancerSpecsItem loadBalancerSpecsItem = new LoadBalancerSpecsItem();
			loadBalancerSpecsItem.setDisplayName(_ctx.stringValue("DescribeLoadBalancerSpecResponse.LoadBalancerSpecs["+ i +"].DisplayName"));
			loadBalancerSpecsItem.setLoadBalancerSpec(_ctx.stringValue("DescribeLoadBalancerSpecResponse.LoadBalancerSpecs["+ i +"].LoadBalancerSpec"));

			loadBalancerSpecs.add(loadBalancerSpecsItem);
		}
		describeLoadBalancerSpecResponse.setLoadBalancerSpecs(loadBalancerSpecs);
	 
	 	return describeLoadBalancerSpecResponse;
	}
}