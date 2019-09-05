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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeIpControlsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeIpControlsResponse.IpControlInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpControlsResponseUnmarshaller {

	public static DescribeIpControlsResponse unmarshall(DescribeIpControlsResponse describeIpControlsResponse, UnmarshallerContext _ctx) {
		
		describeIpControlsResponse.setRequestId(_ctx.stringValue("DescribeIpControlsResponse.RequestId"));
		describeIpControlsResponse.setTotalCount(_ctx.integerValue("DescribeIpControlsResponse.TotalCount"));
		describeIpControlsResponse.setPageSize(_ctx.integerValue("DescribeIpControlsResponse.PageSize"));
		describeIpControlsResponse.setPageNumber(_ctx.integerValue("DescribeIpControlsResponse.PageNumber"));

		List<IpControlInfo> ipControlInfos = new ArrayList<IpControlInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIpControlsResponse.IpControlInfos.Length"); i++) {
			IpControlInfo ipControlInfo = new IpControlInfo();
			ipControlInfo.setIpControlId(_ctx.stringValue("DescribeIpControlsResponse.IpControlInfos["+ i +"].IpControlId"));
			ipControlInfo.setIpControlName(_ctx.stringValue("DescribeIpControlsResponse.IpControlInfos["+ i +"].IpControlName"));
			ipControlInfo.setIpControlType(_ctx.stringValue("DescribeIpControlsResponse.IpControlInfos["+ i +"].IpControlType"));
			ipControlInfo.setDescription(_ctx.stringValue("DescribeIpControlsResponse.IpControlInfos["+ i +"].Description"));
			ipControlInfo.setCreateTime(_ctx.stringValue("DescribeIpControlsResponse.IpControlInfos["+ i +"].CreateTime"));
			ipControlInfo.setModifiedTime(_ctx.stringValue("DescribeIpControlsResponse.IpControlInfos["+ i +"].ModifiedTime"));
			ipControlInfo.setRegionId(_ctx.stringValue("DescribeIpControlsResponse.IpControlInfos["+ i +"].RegionId"));

			ipControlInfos.add(ipControlInfo);
		}
		describeIpControlsResponse.setIpControlInfos(ipControlInfos);
	 
	 	return describeIpControlsResponse;
	}
}