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

package com.aliyuncs.pts.transform.v20201020;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20201020.GetUserVpcVSwitchResponse;
import com.aliyuncs.pts.model.v20201020.GetUserVpcVSwitchResponse.VSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserVpcVSwitchResponseUnmarshaller {

	public static GetUserVpcVSwitchResponse unmarshall(GetUserVpcVSwitchResponse getUserVpcVSwitchResponse, UnmarshallerContext _ctx) {
		
		getUserVpcVSwitchResponse.setRequestId(_ctx.stringValue("GetUserVpcVSwitchResponse.RequestId"));
		getUserVpcVSwitchResponse.setVSwitchCount(_ctx.integerValue("GetUserVpcVSwitchResponse.VSwitchCount"));
		getUserVpcVSwitchResponse.setMessage(_ctx.stringValue("GetUserVpcVSwitchResponse.Message"));
		getUserVpcVSwitchResponse.setPageSize(_ctx.integerValue("GetUserVpcVSwitchResponse.PageSize"));
		getUserVpcVSwitchResponse.setPageNumber(_ctx.integerValue("GetUserVpcVSwitchResponse.PageNumber"));
		getUserVpcVSwitchResponse.setHttpStatusCode(_ctx.integerValue("GetUserVpcVSwitchResponse.HttpStatusCode"));
		getUserVpcVSwitchResponse.setCode(_ctx.stringValue("GetUserVpcVSwitchResponse.Code"));
		getUserVpcVSwitchResponse.setSuccess(_ctx.booleanValue("GetUserVpcVSwitchResponse.Success"));

		List<VSwitch> vSwitchList = new ArrayList<VSwitch>();
		for (int i = 0; i < _ctx.lengthValue("GetUserVpcVSwitchResponse.VSwitchList.Length"); i++) {
			VSwitch vSwitch = new VSwitch();
			vSwitch.setVpcId(_ctx.stringValue("GetUserVpcVSwitchResponse.VSwitchList["+ i +"].VpcId"));
			vSwitch.setMaxAgentCount(_ctx.integerValue("GetUserVpcVSwitchResponse.VSwitchList["+ i +"].MaxAgentCount"));
			vSwitch.setAvailableIpAddressCount(_ctx.longValue("GetUserVpcVSwitchResponse.VSwitchList["+ i +"].AvailableIpAddressCount"));
			vSwitch.setVSwitchId(_ctx.stringValue("GetUserVpcVSwitchResponse.VSwitchList["+ i +"].VSwitchId"));
			vSwitch.setVSwitchName(_ctx.stringValue("GetUserVpcVSwitchResponse.VSwitchList["+ i +"].VSwitchName"));

			vSwitchList.add(vSwitch);
		}
		getUserVpcVSwitchResponse.setVSwitchList(vSwitchList);
	 
	 	return getUserVpcVSwitchResponse;
	}
}