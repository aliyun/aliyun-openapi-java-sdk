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

import com.aliyuncs.emr.model.v20160408.DescribeFlowProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowProjectResponseUnmarshaller {

	public static DescribeFlowProjectResponse unmarshall(DescribeFlowProjectResponse describeFlowProjectResponse, UnmarshallerContext _ctx) {
		
		describeFlowProjectResponse.setRequestId(_ctx.stringValue("DescribeFlowProjectResponse.RequestId"));
		describeFlowProjectResponse.setId(_ctx.stringValue("DescribeFlowProjectResponse.Id"));
		describeFlowProjectResponse.setGmtCreate(_ctx.longValue("DescribeFlowProjectResponse.GmtCreate"));
		describeFlowProjectResponse.setGmtModified(_ctx.longValue("DescribeFlowProjectResponse.GmtModified"));
		describeFlowProjectResponse.setUserId(_ctx.stringValue("DescribeFlowProjectResponse.UserId"));
		describeFlowProjectResponse.setName(_ctx.stringValue("DescribeFlowProjectResponse.Name"));
		describeFlowProjectResponse.setDescription(_ctx.stringValue("DescribeFlowProjectResponse.Description"));
	 
	 	return describeFlowProjectResponse;
	}
}