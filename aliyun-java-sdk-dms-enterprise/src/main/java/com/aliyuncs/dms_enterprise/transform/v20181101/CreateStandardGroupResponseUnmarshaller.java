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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.CreateStandardGroupResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.CreateStandardGroupResponse.StandardGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStandardGroupResponseUnmarshaller {

	public static CreateStandardGroupResponse unmarshall(CreateStandardGroupResponse createStandardGroupResponse, UnmarshallerContext _ctx) {
		
		createStandardGroupResponse.setRequestId(_ctx.stringValue("CreateStandardGroupResponse.RequestId"));
		createStandardGroupResponse.setSuccess(_ctx.booleanValue("CreateStandardGroupResponse.Success"));
		createStandardGroupResponse.setErrorMessage(_ctx.stringValue("CreateStandardGroupResponse.ErrorMessage"));
		createStandardGroupResponse.setErrorCode(_ctx.stringValue("CreateStandardGroupResponse.ErrorCode"));

		StandardGroup standardGroup = new StandardGroup();
		standardGroup.setGroupName(_ctx.stringValue("CreateStandardGroupResponse.StandardGroup.GroupName"));
		standardGroup.setDescription(_ctx.stringValue("CreateStandardGroupResponse.StandardGroup.Description"));
		standardGroup.setDbType(_ctx.stringValue("CreateStandardGroupResponse.StandardGroup.DbType"));
		standardGroup.setLastMenderId(_ctx.longValue("CreateStandardGroupResponse.StandardGroup.LastMenderId"));
		standardGroup.setGroupMode(_ctx.stringValue("CreateStandardGroupResponse.StandardGroup.GroupMode"));
		createStandardGroupResponse.setStandardGroup(standardGroup);
	 
	 	return createStandardGroupResponse;
	}
}