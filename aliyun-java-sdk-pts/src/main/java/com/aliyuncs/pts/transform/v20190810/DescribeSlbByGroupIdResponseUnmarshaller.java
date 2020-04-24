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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.DescribeSlbByGroupIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlbByGroupIdResponseUnmarshaller {

	public static DescribeSlbByGroupIdResponse unmarshall(DescribeSlbByGroupIdResponse describeSlbByGroupIdResponse, UnmarshallerContext _ctx) {
		
		describeSlbByGroupIdResponse.setRequestId(_ctx.stringValue("DescribeSlbByGroupIdResponse.RequestId"));
		describeSlbByGroupIdResponse.setCode(_ctx.stringValue("DescribeSlbByGroupIdResponse.Code"));
		describeSlbByGroupIdResponse.setMessage(_ctx.stringValue("DescribeSlbByGroupIdResponse.Message"));
		describeSlbByGroupIdResponse.setSuccess(_ctx.booleanValue("DescribeSlbByGroupIdResponse.Success"));
		describeSlbByGroupIdResponse.setPageNumber(_ctx.integerValue("DescribeSlbByGroupIdResponse.PageNumber"));
		describeSlbByGroupIdResponse.setPageSize(_ctx.integerValue("DescribeSlbByGroupIdResponse.PageSize"));
		describeSlbByGroupIdResponse.setSlbViews(_ctx.stringValue("DescribeSlbByGroupIdResponse.SlbViews"));
		describeSlbByGroupIdResponse.setTotalCount(_ctx.longValue("DescribeSlbByGroupIdResponse.TotalCount"));
	 
	 	return describeSlbByGroupIdResponse;
	}
}