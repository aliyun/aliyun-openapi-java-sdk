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

package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.CreateApiGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateApiGroupResponseUnmarshaller {

	public static CreateApiGroupResponse unmarshall(CreateApiGroupResponse createApiGroupResponse, UnmarshallerContext _ctx) {
		
		createApiGroupResponse.setRequestId(_ctx.stringValue("CreateApiGroupResponse.RequestId"));
		createApiGroupResponse.setGroupId(_ctx.stringValue("CreateApiGroupResponse.GroupId"));
		createApiGroupResponse.setGroupName(_ctx.stringValue("CreateApiGroupResponse.GroupName"));
		createApiGroupResponse.setSubDomain(_ctx.stringValue("CreateApiGroupResponse.SubDomain"));
		createApiGroupResponse.setDescription(_ctx.stringValue("CreateApiGroupResponse.Description"));
		createApiGroupResponse.setInstanceId(_ctx.stringValue("CreateApiGroupResponse.InstanceId"));
		createApiGroupResponse.setInstanceType(_ctx.stringValue("CreateApiGroupResponse.InstanceType"));
		createApiGroupResponse.setTagStatus(_ctx.booleanValue("CreateApiGroupResponse.TagStatus"));
	 
	 	return createApiGroupResponse;
	}
}