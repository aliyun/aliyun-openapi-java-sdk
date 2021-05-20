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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribePortResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribePortResponse.NetworkRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePortResponseUnmarshaller {

	public static DescribePortResponse unmarshall(DescribePortResponse describePortResponse, UnmarshallerContext _ctx) {
		
		describePortResponse.setRequestId(_ctx.stringValue("DescribePortResponse.RequestId"));
		describePortResponse.setTotalCount(_ctx.longValue("DescribePortResponse.TotalCount"));

		List<NetworkRule> networkRules = new ArrayList<NetworkRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribePortResponse.NetworkRules.Length"); i++) {
			NetworkRule networkRule = new NetworkRule();
			networkRule.setInstanceId(_ctx.stringValue("DescribePortResponse.NetworkRules["+ i +"].InstanceId"));
			networkRule.setFrontendProtocol(_ctx.stringValue("DescribePortResponse.NetworkRules["+ i +"].FrontendProtocol"));
			networkRule.setFrontendPort(_ctx.integerValue("DescribePortResponse.NetworkRules["+ i +"].FrontendPort"));
			networkRule.setBackendPort(_ctx.integerValue("DescribePortResponse.NetworkRules["+ i +"].BackendPort"));
			networkRule.setIsAutoCreate(_ctx.booleanValue("DescribePortResponse.NetworkRules["+ i +"].IsAutoCreate"));

			List<String> realServers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePortResponse.NetworkRules["+ i +"].RealServers.Length"); j++) {
				realServers.add(_ctx.stringValue("DescribePortResponse.NetworkRules["+ i +"].RealServers["+ j +"]"));
			}
			networkRule.setRealServers(realServers);

			networkRules.add(networkRule);
		}
		describePortResponse.setNetworkRules(networkRules);
	 
	 	return describePortResponse;
	}
}