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

import com.aliyuncs.ens.model.v20171110.DescribeNetworksResponse;
import com.aliyuncs.ens.model.v20171110.DescribeNetworksResponse.Network;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworksResponseUnmarshaller {

	public static DescribeNetworksResponse unmarshall(DescribeNetworksResponse describeNetworksResponse, UnmarshallerContext _ctx) {
		
		describeNetworksResponse.setRequestId(_ctx.stringValue("DescribeNetworksResponse.RequestId"));
		describeNetworksResponse.setTotalCount(_ctx.integerValue("DescribeNetworksResponse.TotalCount"));
		describeNetworksResponse.setPageSize(_ctx.integerValue("DescribeNetworksResponse.PageSize"));
		describeNetworksResponse.setPageNumber(_ctx.integerValue("DescribeNetworksResponse.PageNumber"));

		List<Network> networks = new ArrayList<Network>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworksResponse.Networks.Length"); i++) {
			Network network = new Network();
			network.setEnsRegionId(_ctx.stringValue("DescribeNetworksResponse.Networks["+ i +"].EnsRegionId"));
			network.setNetworkId(_ctx.stringValue("DescribeNetworksResponse.Networks["+ i +"].NetworkId"));
			network.setNetworkName(_ctx.stringValue("DescribeNetworksResponse.Networks["+ i +"].NetworkName"));
			network.setCidrBlock(_ctx.stringValue("DescribeNetworksResponse.Networks["+ i +"].CidrBlock"));
			network.setStatus(_ctx.stringValue("DescribeNetworksResponse.Networks["+ i +"].Status"));
			network.setDescription(_ctx.stringValue("DescribeNetworksResponse.Networks["+ i +"].Description"));
			network.setCreatedTime(_ctx.stringValue("DescribeNetworksResponse.Networks["+ i +"].CreatedTime"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworksResponse.Networks["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("DescribeNetworksResponse.Networks["+ i +"].VSwitchIds["+ j +"]"));
			}
			network.setVSwitchIds(vSwitchIds);

			networks.add(network);
		}
		describeNetworksResponse.setNetworks(networks);
	 
	 	return describeNetworksResponse;
	}
}