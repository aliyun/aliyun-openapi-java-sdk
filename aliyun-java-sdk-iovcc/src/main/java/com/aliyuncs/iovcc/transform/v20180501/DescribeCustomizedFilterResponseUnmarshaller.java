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

package com.aliyuncs.iovcc.transform.v20180501;

import com.aliyuncs.iovcc.model.v20180501.DescribeCustomizedFilterResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeCustomizedFilterResponse.CustomizedFilter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomizedFilterResponseUnmarshaller {

	public static DescribeCustomizedFilterResponse unmarshall(DescribeCustomizedFilterResponse describeCustomizedFilterResponse, UnmarshallerContext _ctx) {
		
		describeCustomizedFilterResponse.setRequestId(_ctx.stringValue("DescribeCustomizedFilterResponse.RequestId"));

		CustomizedFilter customizedFilter = new CustomizedFilter();
		customizedFilter.setId(_ctx.longValue("DescribeCustomizedFilterResponse.CustomizedFilter.Id"));
		customizedFilter.setVersionType(_ctx.stringValue("DescribeCustomizedFilterResponse.CustomizedFilter.VersionType"));
		customizedFilter.setVersionId(_ctx.longValue("DescribeCustomizedFilterResponse.CustomizedFilter.VersionId"));
		customizedFilter.setName(_ctx.stringValue("DescribeCustomizedFilterResponse.CustomizedFilter.Name"));
		customizedFilter.setValue(_ctx.stringValue("DescribeCustomizedFilterResponse.CustomizedFilter.Value"));
		customizedFilter.setValueCompareType(_ctx.stringValue("DescribeCustomizedFilterResponse.CustomizedFilter.ValueCompareType"));
		customizedFilter.setBlackWhiteType(_ctx.stringValue("DescribeCustomizedFilterResponse.CustomizedFilter.BlackWhiteType"));
		customizedFilter.setGmtCreate(_ctx.stringValue("DescribeCustomizedFilterResponse.CustomizedFilter.GmtCreate"));
		customizedFilter.setGmtModify(_ctx.stringValue("DescribeCustomizedFilterResponse.CustomizedFilter.GmtModify"));
		customizedFilter.setValueType(_ctx.stringValue("DescribeCustomizedFilterResponse.CustomizedFilter.ValueType"));
		customizedFilter.setGmtCreateTimestamp(_ctx.longValue("DescribeCustomizedFilterResponse.CustomizedFilter.GmtCreateTimestamp"));
		customizedFilter.setGmtModifyTimestamp(_ctx.longValue("DescribeCustomizedFilterResponse.CustomizedFilter.GmtModifyTimestamp"));
		describeCustomizedFilterResponse.setCustomizedFilter(customizedFilter);
	 
	 	return describeCustomizedFilterResponse;
	}
}