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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.DescribeNotificationConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNotificationConfigResponseUnmarshaller {

	public static DescribeNotificationConfigResponse unmarshall(DescribeNotificationConfigResponse describeNotificationConfigResponse, UnmarshallerContext _ctx) {
		
		describeNotificationConfigResponse.setRequestId(_ctx.stringValue("DescribeNotificationConfigResponse.RequestId"));
		describeNotificationConfigResponse.setErrorMessage(_ctx.stringValue("DescribeNotificationConfigResponse.ErrorMessage"));
		describeNotificationConfigResponse.setSuccess(_ctx.booleanValue("DescribeNotificationConfigResponse.Success"));
		describeNotificationConfigResponse.setErrorCode(_ctx.stringValue("DescribeNotificationConfigResponse.ErrorCode"));
		describeNotificationConfigResponse.setCode(_ctx.stringValue("DescribeNotificationConfigResponse.Code"));
		describeNotificationConfigResponse.setMessage(_ctx.stringValue("DescribeNotificationConfigResponse.Message"));
		describeNotificationConfigResponse.setDynamicMessage(_ctx.stringValue("DescribeNotificationConfigResponse.DynamicMessage"));
		describeNotificationConfigResponse.setDynamicCode(_ctx.stringValue("DescribeNotificationConfigResponse.DynamicCode"));
		describeNotificationConfigResponse.setTopic(_ctx.stringValue("DescribeNotificationConfigResponse.Topic"));
		describeNotificationConfigResponse.setGroupId(_ctx.stringValue("DescribeNotificationConfigResponse.GroupId"));
		describeNotificationConfigResponse.setEndpoint(_ctx.stringValue("DescribeNotificationConfigResponse.Endpoint"));
		describeNotificationConfigResponse.setTag(_ctx.stringValue("DescribeNotificationConfigResponse.Tag"));
		describeNotificationConfigResponse.setEnable(_ctx.booleanValue("DescribeNotificationConfigResponse.Enable"));
	 
	 	return describeNotificationConfigResponse;
	}
}