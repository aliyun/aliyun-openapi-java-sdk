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

package com.aliyuncs.lto.transform.v20210707;

import com.aliyuncs.lto.model.v20210707.DescribeAccountRoleResponse;
import com.aliyuncs.lto.model.v20210707.DescribeAccountRoleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountRoleResponseUnmarshaller {

	public static DescribeAccountRoleResponse unmarshall(DescribeAccountRoleResponse describeAccountRoleResponse, UnmarshallerContext _ctx) {
		
		describeAccountRoleResponse.setRequestId(_ctx.stringValue("DescribeAccountRoleResponse.RequestId"));
		describeAccountRoleResponse.setCode(_ctx.stringValue("DescribeAccountRoleResponse.Code"));
		describeAccountRoleResponse.setHttpStatusCode(_ctx.integerValue("DescribeAccountRoleResponse.HttpStatusCode"));
		describeAccountRoleResponse.setMessage(_ctx.stringValue("DescribeAccountRoleResponse.Message"));
		describeAccountRoleResponse.setSuccess(_ctx.booleanValue("DescribeAccountRoleResponse.Success"));

		Data data = new Data();
		data.setAuthorizedBaaS(_ctx.booleanValue("DescribeAccountRoleResponse.Data.AuthorizedBaaS"));
		data.setRoleType(_ctx.stringValue("DescribeAccountRoleResponse.Data.RoleType"));
		describeAccountRoleResponse.setData(data);
	 
	 	return describeAccountRoleResponse;
	}
}