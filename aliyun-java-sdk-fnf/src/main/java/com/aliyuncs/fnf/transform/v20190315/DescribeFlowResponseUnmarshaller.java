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

package com.aliyuncs.fnf.transform.v20190315;

import com.aliyuncs.fnf.model.v20190315.DescribeFlowResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowResponseUnmarshaller {

	public static DescribeFlowResponse unmarshall(DescribeFlowResponse describeFlowResponse, UnmarshallerContext _ctx) {
		
		describeFlowResponse.setRequestId(_ctx.stringValue("DescribeFlowResponse.RequestId"));
		describeFlowResponse.setName(_ctx.stringValue("DescribeFlowResponse.Name"));
		describeFlowResponse.setDescription(_ctx.stringValue("DescribeFlowResponse.Description"));
		describeFlowResponse.setDefinition(_ctx.stringValue("DescribeFlowResponse.Definition"));
		describeFlowResponse.setId(_ctx.stringValue("DescribeFlowResponse.Id"));
		describeFlowResponse.setType(_ctx.stringValue("DescribeFlowResponse.Type"));
		describeFlowResponse.setRoleArn(_ctx.stringValue("DescribeFlowResponse.RoleArn"));
		describeFlowResponse.setCreatedTime(_ctx.stringValue("DescribeFlowResponse.CreatedTime"));
		describeFlowResponse.setLastModifiedTime(_ctx.stringValue("DescribeFlowResponse.LastModifiedTime"));
		describeFlowResponse.setExternalStorageLocation(_ctx.stringValue("DescribeFlowResponse.ExternalStorageLocation"));
	 
	 	return describeFlowResponse;
	}
}