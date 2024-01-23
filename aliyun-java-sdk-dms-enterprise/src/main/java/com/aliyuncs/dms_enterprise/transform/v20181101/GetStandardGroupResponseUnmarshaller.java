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

import com.aliyuncs.dms_enterprise.model.v20181101.GetStandardGroupResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetStandardGroupResponse.StandardGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStandardGroupResponseUnmarshaller {

	public static GetStandardGroupResponse unmarshall(GetStandardGroupResponse getStandardGroupResponse, UnmarshallerContext _ctx) {
		
		getStandardGroupResponse.setRequestId(_ctx.stringValue("GetStandardGroupResponse.RequestId"));
		getStandardGroupResponse.setSuccess(_ctx.booleanValue("GetStandardGroupResponse.Success"));
		getStandardGroupResponse.setErrorMessage(_ctx.stringValue("GetStandardGroupResponse.ErrorMessage"));
		getStandardGroupResponse.setErrorCode(_ctx.stringValue("GetStandardGroupResponse.ErrorCode"));

		StandardGroup standardGroup = new StandardGroup();
		standardGroup.setGroupName(_ctx.stringValue("GetStandardGroupResponse.StandardGroup.GroupName"));
		standardGroup.setDescription(_ctx.stringValue("GetStandardGroupResponse.StandardGroup.Description"));
		standardGroup.setDbType(_ctx.stringValue("GetStandardGroupResponse.StandardGroup.DbType"));
		standardGroup.setLastMenderId(_ctx.longValue("GetStandardGroupResponse.StandardGroup.LastMenderId"));
		standardGroup.setGroupMode(_ctx.stringValue("GetStandardGroupResponse.StandardGroup.GroupMode"));
		standardGroup.setGroupId(_ctx.longValue("GetStandardGroupResponse.StandardGroup.GroupId"));
		getStandardGroupResponse.setStandardGroup(standardGroup);
	 
	 	return getStandardGroupResponse;
	}
}