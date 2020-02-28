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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeBgpNetworksResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeBgpNetworksResponse.BgpNetwork;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBgpNetworksResponseUnmarshaller {

	public static DescribeBgpNetworksResponse unmarshall(DescribeBgpNetworksResponse describeBgpNetworksResponse, UnmarshallerContext _ctx) {
		
		describeBgpNetworksResponse.setRequestId(_ctx.stringValue("DescribeBgpNetworksResponse.RequestId"));
		describeBgpNetworksResponse.setTotalCount(_ctx.integerValue("DescribeBgpNetworksResponse.TotalCount"));
		describeBgpNetworksResponse.setPageNumber(_ctx.integerValue("DescribeBgpNetworksResponse.PageNumber"));
		describeBgpNetworksResponse.setPageSize(_ctx.integerValue("DescribeBgpNetworksResponse.PageSize"));

		List<BgpNetwork> bgpNetworks = new ArrayList<BgpNetwork>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBgpNetworksResponse.BgpNetworks.Length"); i++) {
			BgpNetwork bgpNetwork = new BgpNetwork();
			bgpNetwork.setVpcId(_ctx.stringValue("DescribeBgpNetworksResponse.BgpNetworks["+ i +"].VpcId"));
			bgpNetwork.setDstCidrBlock(_ctx.stringValue("DescribeBgpNetworksResponse.BgpNetworks["+ i +"].DstCidrBlock"));
			bgpNetwork.setRouterId(_ctx.stringValue("DescribeBgpNetworksResponse.BgpNetworks["+ i +"].RouterId"));
			bgpNetwork.setStatus(_ctx.stringValue("DescribeBgpNetworksResponse.BgpNetworks["+ i +"].Status"));

			bgpNetworks.add(bgpNetwork);
		}
		describeBgpNetworksResponse.setBgpNetworks(bgpNetworks);
	 
	 	return describeBgpNetworksResponse;
	}
}