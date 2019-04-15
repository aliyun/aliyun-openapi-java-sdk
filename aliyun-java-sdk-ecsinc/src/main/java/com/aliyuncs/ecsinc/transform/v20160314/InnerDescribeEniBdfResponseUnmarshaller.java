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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerDescribeEniBdfResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerDescribeEniBdfResponse.NetworkInterfaceBdfSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDescribeEniBdfResponseUnmarshaller {

	public static InnerDescribeEniBdfResponse unmarshall(InnerDescribeEniBdfResponse innerDescribeEniBdfResponse, UnmarshallerContext context) {
		
		innerDescribeEniBdfResponse.setRequestId(context.stringValue("InnerDescribeEniBdfResponse.RequestId"));

		List<NetworkInterfaceBdfSet> networkInterfaceBdfSets = new ArrayList<NetworkInterfaceBdfSet>();
		for (int i = 0; i < context.lengthValue("InnerDescribeEniBdfResponse.NetworkInterfaceBdfSets.Length"); i++) {
			NetworkInterfaceBdfSet networkInterfaceBdfSet = new NetworkInterfaceBdfSet();
			networkInterfaceBdfSet.setNetworkInterfaceId(context.stringValue("InnerDescribeEniBdfResponse.NetworkInterfaceBdfSets["+ i +"].NetworkInterfaceId"));
			networkInterfaceBdfSet.setBdf(context.stringValue("InnerDescribeEniBdfResponse.NetworkInterfaceBdfSets["+ i +"].Bdf"));

			networkInterfaceBdfSets.add(networkInterfaceBdfSet);
		}
		innerDescribeEniBdfResponse.setNetworkInterfaceBdfSets(networkInterfaceBdfSets);
	 
	 	return innerDescribeEniBdfResponse;
	}
}