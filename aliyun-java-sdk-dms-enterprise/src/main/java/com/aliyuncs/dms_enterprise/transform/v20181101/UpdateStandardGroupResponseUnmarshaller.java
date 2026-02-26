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

import com.aliyuncs.dms_enterprise.model.v20181101.UpdateStandardGroupResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.UpdateStandardGroupResponse.StandardGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateStandardGroupResponseUnmarshaller {

	public static UpdateStandardGroupResponse unmarshall(UpdateStandardGroupResponse updateStandardGroupResponse, UnmarshallerContext _ctx) {
		
		updateStandardGroupResponse.setRequestId(_ctx.stringValue("UpdateStandardGroupResponse.RequestId"));
		updateStandardGroupResponse.setSuccess(_ctx.booleanValue("UpdateStandardGroupResponse.Success"));
		updateStandardGroupResponse.setErrorMessage(_ctx.stringValue("UpdateStandardGroupResponse.ErrorMessage"));
		updateStandardGroupResponse.setErrorCode(_ctx.stringValue("UpdateStandardGroupResponse.ErrorCode"));

		StandardGroup standardGroup = new StandardGroup();
		standardGroup.setGroupName(_ctx.stringValue("UpdateStandardGroupResponse.StandardGroup.GroupName"));
		standardGroup.setDescription(_ctx.stringValue("UpdateStandardGroupResponse.StandardGroup.Description"));
		standardGroup.setDbType(_ctx.stringValue("UpdateStandardGroupResponse.StandardGroup.DbType"));
		standardGroup.setLastMenderId(_ctx.longValue("UpdateStandardGroupResponse.StandardGroup.LastMenderId"));
		standardGroup.setGroupMode(_ctx.stringValue("UpdateStandardGroupResponse.StandardGroup.GroupMode"));
		standardGroup.setGroupId(_ctx.longValue("UpdateStandardGroupResponse.StandardGroup.GroupId"));
		updateStandardGroupResponse.setStandardGroup(standardGroup);
	 
	 	return updateStandardGroupResponse;
	}
}