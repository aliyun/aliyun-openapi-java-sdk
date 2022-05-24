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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.ListGrantVSwitchEnisResponse;
import com.aliyuncs.cbn.model.v20170912.ListGrantVSwitchEnisResponse.GrantVSwitchEni;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGrantVSwitchEnisResponseUnmarshaller {

	public static ListGrantVSwitchEnisResponse unmarshall(ListGrantVSwitchEnisResponse listGrantVSwitchEnisResponse, UnmarshallerContext _ctx) {
		
		listGrantVSwitchEnisResponse.setRequestId(_ctx.stringValue("ListGrantVSwitchEnisResponse.RequestId"));
		listGrantVSwitchEnisResponse.setTotalCount(_ctx.stringValue("ListGrantVSwitchEnisResponse.TotalCount"));

		List<GrantVSwitchEni> grantVSwitchEnis = new ArrayList<GrantVSwitchEni>();
		for (int i = 0; i < _ctx.lengthValue("ListGrantVSwitchEnisResponse.GrantVSwitchEnis.Length"); i++) {
			GrantVSwitchEni grantVSwitchEni = new GrantVSwitchEni();
			grantVSwitchEni.setVpcId(_ctx.stringValue("ListGrantVSwitchEnisResponse.GrantVSwitchEnis["+ i +"].VpcId"));
			grantVSwitchEni.setVSwitchId(_ctx.stringValue("ListGrantVSwitchEnisResponse.GrantVSwitchEnis["+ i +"].VSwitchId"));
			grantVSwitchEni.setNetworkInterfaceId(_ctx.stringValue("ListGrantVSwitchEnisResponse.GrantVSwitchEnis["+ i +"].NetworkInterfaceId"));
			grantVSwitchEni.setDescription(_ctx.stringValue("ListGrantVSwitchEnisResponse.GrantVSwitchEnis["+ i +"].Description"));
			grantVSwitchEni.setTransitRouterFlag(_ctx.booleanValue("ListGrantVSwitchEnisResponse.GrantVSwitchEnis["+ i +"].TransitRouterFlag"));

			grantVSwitchEnis.add(grantVSwitchEni);
		}
		listGrantVSwitchEnisResponse.setGrantVSwitchEnis(grantVSwitchEnis);
	 
	 	return listGrantVSwitchEnisResponse;
	}
}