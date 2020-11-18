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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.AddFaceUserGroupResponse;
import com.aliyuncs.linkvisual.model.v20180120.AddFaceUserGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddFaceUserGroupResponseUnmarshaller {

	public static AddFaceUserGroupResponse unmarshall(AddFaceUserGroupResponse addFaceUserGroupResponse, UnmarshallerContext _ctx) {
		
		addFaceUserGroupResponse.setRequestId(_ctx.stringValue("AddFaceUserGroupResponse.RequestId"));
		addFaceUserGroupResponse.setSuccess(_ctx.booleanValue("AddFaceUserGroupResponse.Success"));
		addFaceUserGroupResponse.setCode(_ctx.stringValue("AddFaceUserGroupResponse.Code"));
		addFaceUserGroupResponse.setErrorMessage(_ctx.stringValue("AddFaceUserGroupResponse.ErrorMessage"));

		Data data = new Data();
		data.setUserGroupId(_ctx.stringValue("AddFaceUserGroupResponse.Data.UserGroupId"));
		data.setUserGroupName(_ctx.stringValue("AddFaceUserGroupResponse.Data.UserGroupName"));
		data.setModifiedTime(_ctx.stringValue("AddFaceUserGroupResponse.Data.ModifiedTime"));
		addFaceUserGroupResponse.setData(data);
	 
	 	return addFaceUserGroupResponse;
	}
}