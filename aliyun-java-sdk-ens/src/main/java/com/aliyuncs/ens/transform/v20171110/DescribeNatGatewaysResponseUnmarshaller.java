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

import com.aliyuncs.ens.model.v20171110.DescribeNatGatewaysResponse;
import com.aliyuncs.ens.model.v20171110.DescribeNatGatewaysResponse.NatGateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNatGatewaysResponseUnmarshaller {

	public static DescribeNatGatewaysResponse unmarshall(DescribeNatGatewaysResponse describeNatGatewaysResponse, UnmarshallerContext _ctx) {
		
		describeNatGatewaysResponse.setRequestId(_ctx.stringValue("DescribeNatGatewaysResponse.RequestId"));
		describeNatGatewaysResponse.setPageNumber(_ctx.integerValue("DescribeNatGatewaysResponse.PageNumber"));
		describeNatGatewaysResponse.setTotalCount(_ctx.integerValue("DescribeNatGatewaysResponse.TotalCount"));
		describeNatGatewaysResponse.setPageSize(_ctx.integerValue("DescribeNatGatewaysResponse.PageSize"));

		List<NatGateway> natGateways = new ArrayList<NatGateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNatGatewaysResponse.NatGateways.Length"); i++) {
			NatGateway natGateway = new NatGateway();
			natGateway.setEnsRegionId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].EnsRegionId"));
			natGateway.setNatGatewayId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NatGatewayId"));
			natGateway.setNetworkId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].NetworkId"));
			natGateway.setVSwitchId(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].VSwitchId"));
			natGateway.setName(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].Name"));
			natGateway.setCreationTime(_ctx.stringValue("DescribeNatGatewaysResponse.NatGateways["+ i +"].CreationTime"));

			natGateways.add(natGateway);
		}
		describeNatGatewaysResponse.setNatGateways(natGateways);
	 
	 	return describeNatGatewaysResponse;
	}
}