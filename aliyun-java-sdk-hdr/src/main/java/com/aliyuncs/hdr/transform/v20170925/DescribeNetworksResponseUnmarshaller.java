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

package com.aliyuncs.hdr.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.DescribeNetworksResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeNetworksResponse.Network;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworksResponseUnmarshaller {

	public static DescribeNetworksResponse unmarshall(DescribeNetworksResponse describeNetworksResponse, UnmarshallerContext _ctx) {
		
		describeNetworksResponse.setRequestId(_ctx.stringValue("DescribeNetworksResponse.RequestId"));
		describeNetworksResponse.setSuccess(_ctx.booleanValue("DescribeNetworksResponse.Success"));
		describeNetworksResponse.setCode(_ctx.stringValue("DescribeNetworksResponse.Code"));
		describeNetworksResponse.setMessage(_ctx.stringValue("DescribeNetworksResponse.Message"));
		describeNetworksResponse.setTotalCount(_ctx.integerValue("DescribeNetworksResponse.TotalCount"));

		List<Network> networks = new ArrayList<Network>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworksResponse.Networks.Length"); i++) {
			Network network = new Network();
			network.setNetworkInfo(_ctx.stringValue("DescribeNetworksResponse.Networks["+ i +"].networkInfo"));

			networks.add(network);
		}
		describeNetworksResponse.setNetworks(networks);
	 
	 	return describeNetworksResponse;
	}
}