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

import com.aliyuncs.cbn.model.v20170912.ListGrantVSwitchesToCenResponse;
import com.aliyuncs.cbn.model.v20170912.ListGrantVSwitchesToCenResponse.VSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGrantVSwitchesToCenResponseUnmarshaller {

	public static ListGrantVSwitchesToCenResponse unmarshall(ListGrantVSwitchesToCenResponse listGrantVSwitchesToCenResponse, UnmarshallerContext _ctx) {
		
		listGrantVSwitchesToCenResponse.setRequestId(_ctx.stringValue("ListGrantVSwitchesToCenResponse.RequestId"));
		listGrantVSwitchesToCenResponse.setPageSize(_ctx.integerValue("ListGrantVSwitchesToCenResponse.PageSize"));
		listGrantVSwitchesToCenResponse.setPageNumber(_ctx.integerValue("ListGrantVSwitchesToCenResponse.PageNumber"));
		listGrantVSwitchesToCenResponse.setTotalCount(_ctx.integerValue("ListGrantVSwitchesToCenResponse.TotalCount"));

		List<VSwitch> vSwitches = new ArrayList<VSwitch>();
		for (int i = 0; i < _ctx.lengthValue("ListGrantVSwitchesToCenResponse.VSwitches.Length"); i++) {
			VSwitch vSwitch = new VSwitch();
			vSwitch.setVpcId(_ctx.stringValue("ListGrantVSwitchesToCenResponse.VSwitches["+ i +"].VpcId"));
			vSwitch.setZoneId(_ctx.stringValue("ListGrantVSwitchesToCenResponse.VSwitches["+ i +"].ZoneId"));
			vSwitch.setVSwitchId(_ctx.stringValue("ListGrantVSwitchesToCenResponse.VSwitches["+ i +"].VSwitchId"));

			vSwitches.add(vSwitch);
		}
		listGrantVSwitchesToCenResponse.setVSwitches(vSwitches);
	 
	 	return listGrantVSwitchesToCenResponse;
	}
}