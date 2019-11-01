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

package com.aliyuncs.vs.transform.v20181212;

import com.aliyuncs.vs.model.v20181212.DescribeDirectoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDirectoryResponseUnmarshaller {

	public static DescribeDirectoryResponse unmarshall(DescribeDirectoryResponse describeDirectoryResponse, UnmarshallerContext _ctx) {
		
		describeDirectoryResponse.setRequestId(_ctx.stringValue("DescribeDirectoryResponse.RequestId"));
		describeDirectoryResponse.setId(_ctx.stringValue("DescribeDirectoryResponse.Id"));
		describeDirectoryResponse.setName(_ctx.stringValue("DescribeDirectoryResponse.Name"));
		describeDirectoryResponse.setDescription(_ctx.stringValue("DescribeDirectoryResponse.Description"));
		describeDirectoryResponse.setGroupId(_ctx.stringValue("DescribeDirectoryResponse.GroupId"));
		describeDirectoryResponse.setParentId(_ctx.stringValue("DescribeDirectoryResponse.ParentId"));
		describeDirectoryResponse.setCreatedTime(_ctx.stringValue("DescribeDirectoryResponse.CreatedTime"));
	 
	 	return describeDirectoryResponse;
	}
}