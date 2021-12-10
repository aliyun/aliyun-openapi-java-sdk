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

package com.aliyuncs.eas.transform.v20210701;

import com.aliyuncs.eas.model.v20210701.DescribeRoleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRoleResponseUnmarshaller {

	public static DescribeRoleResponse unmarshall(DescribeRoleResponse describeRoleResponse, UnmarshallerContext _ctx) {
		
		describeRoleResponse.setRequestId(_ctx.stringValue("DescribeRoleResponse.RequestId"));
		describeRoleResponse.setMessage(_ctx.stringValue("DescribeRoleResponse.Message"));
		describeRoleResponse.setExist(_ctx.booleanValue("DescribeRoleResponse.Exist"));
	 
	 	return describeRoleResponse;
	}
}