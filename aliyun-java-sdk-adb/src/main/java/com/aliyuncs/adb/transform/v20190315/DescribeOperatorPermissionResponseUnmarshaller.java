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

package com.aliyuncs.adb.transform.v20190315;

import com.aliyuncs.adb.model.v20190315.DescribeOperatorPermissionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOperatorPermissionResponseUnmarshaller {

	public static DescribeOperatorPermissionResponse unmarshall(DescribeOperatorPermissionResponse describeOperatorPermissionResponse, UnmarshallerContext _ctx) {
		
		describeOperatorPermissionResponse.setRequestId(_ctx.stringValue("DescribeOperatorPermissionResponse.RequestId"));
		describeOperatorPermissionResponse.setPrivileges(_ctx.stringValue("DescribeOperatorPermissionResponse.Privileges"));
		describeOperatorPermissionResponse.setCreatedTime(_ctx.stringValue("DescribeOperatorPermissionResponse.CreatedTime"));
		describeOperatorPermissionResponse.setExpiredTime(_ctx.stringValue("DescribeOperatorPermissionResponse.ExpiredTime"));
		describeOperatorPermissionResponse.setDBClusterId(_ctx.stringValue("DescribeOperatorPermissionResponse.DBClusterId"));
	 
	 	return describeOperatorPermissionResponse;
	}
}