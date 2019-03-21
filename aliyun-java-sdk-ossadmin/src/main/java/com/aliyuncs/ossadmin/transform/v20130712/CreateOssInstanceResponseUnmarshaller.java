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

package com.aliyuncs.ossadmin.transform.v20130712;

import com.aliyuncs.ossadmin.model.v20130712.CreateOssInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOssInstanceResponseUnmarshaller {

	public static CreateOssInstanceResponse unmarshall(CreateOssInstanceResponse createOssInstanceResponse, UnmarshallerContext context) {
		
		createOssInstanceResponse.setRequestId(context.stringValue("CreateOssInstanceResponse.RequestId"));
		createOssInstanceResponse.setCode(context.stringValue("CreateOssInstanceResponse.Code"));
		createOssInstanceResponse.setMessage(context.stringValue("CreateOssInstanceResponse.Message"));
		createOssInstanceResponse.setSuccess(context.booleanValue("CreateOssInstanceResponse.Success"));
		createOssInstanceResponse.setAliUid(context.longValue("CreateOssInstanceResponse.aliUid"));
		createOssInstanceResponse.setInstanceId(context.stringValue("CreateOssInstanceResponse.instanceId"));
		createOssInstanceResponse.setInstacneStatus(context.stringValue("CreateOssInstanceResponse.instacneStatus"));
		createOssInstanceResponse.setInstanceName(context.stringValue("CreateOssInstanceResponse.instanceName"));
		createOssInstanceResponse.setStartTime(context.stringValue("CreateOssInstanceResponse.startTime"));
		createOssInstanceResponse.setEndTime(context.stringValue("CreateOssInstanceResponse.endTime"));
	 
	 	return createOssInstanceResponse;
	}
}