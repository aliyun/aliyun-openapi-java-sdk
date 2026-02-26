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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeVSwitchListResponse;
import com.aliyuncs.rds.model.v20140815.DescribeVSwitchListResponse.VSwitchesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVSwitchListResponseUnmarshaller {

	public static DescribeVSwitchListResponse unmarshall(DescribeVSwitchListResponse describeVSwitchListResponse, UnmarshallerContext _ctx) {
		
		describeVSwitchListResponse.setRequestId(_ctx.stringValue("DescribeVSwitchListResponse.RequestId"));
		describeVSwitchListResponse.setTotalCount(_ctx.integerValue("DescribeVSwitchListResponse.TotalCount"));
		describeVSwitchListResponse.setPageNumber(_ctx.integerValue("DescribeVSwitchListResponse.PageNumber"));
		describeVSwitchListResponse.setPageSize(_ctx.integerValue("DescribeVSwitchListResponse.PageSize"));

		List<VSwitchesItem> vSwitches = new ArrayList<VSwitchesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVSwitchListResponse.VSwitches.Length"); i++) {
			VSwitchesItem vSwitchesItem = new VSwitchesItem();
			vSwitchesItem.setIsDefault(_ctx.stringValue("DescribeVSwitchListResponse.VSwitches["+ i +"].IsDefault"));
			vSwitchesItem.setStatus(_ctx.stringValue("DescribeVSwitchListResponse.VSwitches["+ i +"].Status"));
			vSwitchesItem.setIzNo(_ctx.stringValue("DescribeVSwitchListResponse.VSwitches["+ i +"].IzNo"));
			vSwitchesItem.setGmtCreate(_ctx.stringValue("DescribeVSwitchListResponse.VSwitches["+ i +"].GmtCreate"));
			vSwitchesItem.setDescription(_ctx.stringValue("DescribeVSwitchListResponse.VSwitches["+ i +"].Description"));
			vSwitchesItem.setAvailableIpAddressCount(_ctx.stringValue("DescribeVSwitchListResponse.VSwitches["+ i +"].AvailableIpAddressCount"));
			vSwitchesItem.setVSwitchId(_ctx.stringValue("DescribeVSwitchListResponse.VSwitches["+ i +"].VSwitchId"));
			vSwitchesItem.setCidrBlock(_ctx.stringValue("DescribeVSwitchListResponse.VSwitches["+ i +"].CidrBlock"));
			vSwitchesItem.setVSwitchName(_ctx.stringValue("DescribeVSwitchListResponse.VSwitches["+ i +"].VSwitchName"));
			vSwitchesItem.setShareType(_ctx.stringValue("DescribeVSwitchListResponse.VSwitches["+ i +"].ShareType"));

			vSwitches.add(vSwitchesItem);
		}
		describeVSwitchListResponse.setVSwitches(vSwitches);
	 
	 	return describeVSwitchListResponse;
	}
}