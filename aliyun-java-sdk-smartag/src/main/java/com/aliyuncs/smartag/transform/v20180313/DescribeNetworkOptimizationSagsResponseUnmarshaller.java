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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeNetworkOptimizationSagsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeNetworkOptimizationSagsResponse.SmartAccessGateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkOptimizationSagsResponseUnmarshaller {

	public static DescribeNetworkOptimizationSagsResponse unmarshall(DescribeNetworkOptimizationSagsResponse describeNetworkOptimizationSagsResponse, UnmarshallerContext _ctx) {
		
		describeNetworkOptimizationSagsResponse.setRequestId(_ctx.stringValue("DescribeNetworkOptimizationSagsResponse.RequestId"));
		describeNetworkOptimizationSagsResponse.setTotalCount(_ctx.integerValue("DescribeNetworkOptimizationSagsResponse.TotalCount"));
		describeNetworkOptimizationSagsResponse.setPageSize(_ctx.integerValue("DescribeNetworkOptimizationSagsResponse.PageSize"));
		describeNetworkOptimizationSagsResponse.setPageNumber(_ctx.integerValue("DescribeNetworkOptimizationSagsResponse.PageNumber"));

		List<SmartAccessGateway> smartAccessGateways = new ArrayList<SmartAccessGateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkOptimizationSagsResponse.SmartAccessGateways.Length"); i++) {
			SmartAccessGateway smartAccessGateway = new SmartAccessGateway();
			smartAccessGateway.setEndTime(_ctx.longValue("DescribeNetworkOptimizationSagsResponse.SmartAccessGateways["+ i +"].EndTime"));
			smartAccessGateway.setInstanceId(_ctx.stringValue("DescribeNetworkOptimizationSagsResponse.SmartAccessGateways["+ i +"].InstanceId"));
			smartAccessGateway.setState(_ctx.stringValue("DescribeNetworkOptimizationSagsResponse.SmartAccessGateways["+ i +"].State"));
			smartAccessGateway.setMaxBandwidth(_ctx.stringValue("DescribeNetworkOptimizationSagsResponse.SmartAccessGateways["+ i +"].MaxBandwidth"));
			smartAccessGateway.setCreateTime(_ctx.longValue("DescribeNetworkOptimizationSagsResponse.SmartAccessGateways["+ i +"].CreateTime"));
			smartAccessGateway.setName(_ctx.stringValue("DescribeNetworkOptimizationSagsResponse.SmartAccessGateways["+ i +"].Name"));

			smartAccessGateways.add(smartAccessGateway);
		}
		describeNetworkOptimizationSagsResponse.setSmartAccessGateways(smartAccessGateways);
	 
	 	return describeNetworkOptimizationSagsResponse;
	}
}