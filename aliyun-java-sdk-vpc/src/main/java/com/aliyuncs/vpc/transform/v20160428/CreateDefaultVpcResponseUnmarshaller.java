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

import com.aliyuncs.vpc.model.v20160428.CreateDefaultVpcResponse;
import com.aliyuncs.vpc.model.v20160428.CreateDefaultVpcResponse.DefaultVSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDefaultVpcResponseUnmarshaller {

	public static CreateDefaultVpcResponse unmarshall(CreateDefaultVpcResponse createDefaultVpcResponse, UnmarshallerContext _ctx) {
		
		createDefaultVpcResponse.setRequestId(_ctx.stringValue("CreateDefaultVpcResponse.RequestId"));
		createDefaultVpcResponse.setVpcId(_ctx.stringValue("CreateDefaultVpcResponse.VpcId"));
		createDefaultVpcResponse.setVRouterId(_ctx.stringValue("CreateDefaultVpcResponse.VRouterId"));
		createDefaultVpcResponse.setRouteTableId(_ctx.stringValue("CreateDefaultVpcResponse.RouteTableId"));

		List<DefaultVSwitch> defaultVSwitchs = new ArrayList<DefaultVSwitch>();
		for (int i = 0; i < _ctx.lengthValue("CreateDefaultVpcResponse.DefaultVSwitchs.Length"); i++) {
			DefaultVSwitch defaultVSwitch = new DefaultVSwitch();
			defaultVSwitch.setZoneId(_ctx.stringValue("CreateDefaultVpcResponse.DefaultVSwitchs["+ i +"].ZoneId"));
			defaultVSwitch.setVSwitchId(_ctx.stringValue("CreateDefaultVpcResponse.DefaultVSwitchs["+ i +"].VSwitchId"));

			defaultVSwitchs.add(defaultVSwitch);
		}
		createDefaultVpcResponse.setDefaultVSwitchs(defaultVSwitchs);
	 
	 	return createDefaultVpcResponse;
	}
}