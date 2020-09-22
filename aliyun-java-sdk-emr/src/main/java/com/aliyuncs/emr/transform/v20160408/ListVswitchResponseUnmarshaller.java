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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListVswitchResponse;
import com.aliyuncs.emr.model.v20160408.ListVswitchResponse.Vswitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVswitchResponseUnmarshaller {

	public static ListVswitchResponse unmarshall(ListVswitchResponse listVswitchResponse, UnmarshallerContext _ctx) {
		
		listVswitchResponse.setRequestId(_ctx.stringValue("ListVswitchResponse.RequestId"));

		List<Vswitch> vswitchList = new ArrayList<Vswitch>();
		for (int i = 0; i < _ctx.lengthValue("ListVswitchResponse.VswitchList.Length"); i++) {
			Vswitch vswitch = new Vswitch();
			vswitch.setVSwitchId(_ctx.stringValue("ListVswitchResponse.VswitchList["+ i +"].VSwitchId"));
			vswitch.setVpcId(_ctx.stringValue("ListVswitchResponse.VswitchList["+ i +"].VpcId"));
			vswitch.setStatus(_ctx.stringValue("ListVswitchResponse.VswitchList["+ i +"].Status"));
			vswitch.setCidrBlock(_ctx.stringValue("ListVswitchResponse.VswitchList["+ i +"].CidrBlock"));
			vswitch.setZoneId(_ctx.stringValue("ListVswitchResponse.VswitchList["+ i +"].ZoneId"));
			vswitch.setAvailableIpAddressCount(_ctx.stringValue("ListVswitchResponse.VswitchList["+ i +"].AvailableIpAddressCount"));
			vswitch.setDescription(_ctx.stringValue("ListVswitchResponse.VswitchList["+ i +"].Description"));
			vswitch.setVSwitchName(_ctx.stringValue("ListVswitchResponse.VswitchList["+ i +"].VSwitchName"));
			vswitch.setCreationTime(_ctx.stringValue("ListVswitchResponse.VswitchList["+ i +"].CreationTime"));
			vswitch.setIsDefault(_ctx.booleanValue("ListVswitchResponse.VswitchList["+ i +"].IsDefault"));
			vswitch.setResourceGroupId(_ctx.stringValue("ListVswitchResponse.VswitchList["+ i +"].ResourceGroupId"));

			vswitchList.add(vswitch);
		}
		listVswitchResponse.setVswitchList(vswitchList);
	 
	 	return listVswitchResponse;
	}
}