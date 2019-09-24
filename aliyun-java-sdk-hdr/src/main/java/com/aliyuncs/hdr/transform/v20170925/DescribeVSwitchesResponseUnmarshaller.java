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

import com.aliyuncs.hdr.model.v20170925.DescribeVSwitchesResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeVSwitchesResponse.VSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVSwitchesResponseUnmarshaller {

	public static DescribeVSwitchesResponse unmarshall(DescribeVSwitchesResponse describeVSwitchesResponse, UnmarshallerContext _ctx) {
		
		describeVSwitchesResponse.setRequestId(_ctx.stringValue("DescribeVSwitchesResponse.RequestId"));
		describeVSwitchesResponse.setSuccess(_ctx.booleanValue("DescribeVSwitchesResponse.Success"));
		describeVSwitchesResponse.setCode(_ctx.stringValue("DescribeVSwitchesResponse.Code"));
		describeVSwitchesResponse.setMessage(_ctx.stringValue("DescribeVSwitchesResponse.Message"));
		describeVSwitchesResponse.setTotalCount(_ctx.integerValue("DescribeVSwitchesResponse.TotalCount"));
		describeVSwitchesResponse.setPageNumber(_ctx.integerValue("DescribeVSwitchesResponse.PageNumber"));
		describeVSwitchesResponse.setPageSize(_ctx.integerValue("DescribeVSwitchesResponse.PageSize"));

		List<VSwitch> vSwitches = new ArrayList<VSwitch>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVSwitchesResponse.VSwitches.Length"); i++) {
			VSwitch vSwitch = new VSwitch();
			vSwitch.setId(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Id"));
			vSwitch.setName(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Name"));
			vSwitch.setIsDefault(_ctx.booleanValue("DescribeVSwitchesResponse.VSwitches["+ i +"].IsDefault"));
			vSwitch.setAvailableSelectionInfo(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].AvailableSelectionInfo"));

			vSwitches.add(vSwitch);
		}
		describeVSwitchesResponse.setVSwitches(vSwitches);
	 
	 	return describeVSwitchesResponse;
	}
}