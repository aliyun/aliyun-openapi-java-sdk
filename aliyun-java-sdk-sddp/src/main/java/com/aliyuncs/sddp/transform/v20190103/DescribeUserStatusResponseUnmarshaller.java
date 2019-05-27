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

package com.aliyuncs.sddp.transform.v20190103;

import com.aliyuncs.sddp.model.v20190103.DescribeUserStatusResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeUserStatusResponse.UserStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserStatusResponseUnmarshaller {

	public static DescribeUserStatusResponse unmarshall(DescribeUserStatusResponse describeUserStatusResponse, UnmarshallerContext context) {
		
		describeUserStatusResponse.setRequestId(context.stringValue("DescribeUserStatusResponse.RequestId"));

		UserStatus userStatus = new UserStatus();
		userStatus.setAuthed(context.booleanValue("DescribeUserStatusResponse.UserStatus.Authed"));
		userStatus.setBuyed(context.booleanValue("DescribeUserStatusResponse.UserStatus.Buyed"));
		userStatus.setOssBucketSet(context.booleanValue("DescribeUserStatusResponse.UserStatus.OssBucketSet"));
		userStatus.setOdpsSet(context.booleanValue("DescribeUserStatusResponse.UserStatus.OdpsSet"));
		userStatus.setRdsSet(context.booleanValue("DescribeUserStatusResponse.UserStatus.RdsSet"));
		userStatus.setAccessKeyId(context.stringValue("DescribeUserStatusResponse.UserStatus.AccessKeyId"));
		describeUserStatusResponse.setUserStatus(userStatus);
	 
	 	return describeUserStatusResponse;
	}
}