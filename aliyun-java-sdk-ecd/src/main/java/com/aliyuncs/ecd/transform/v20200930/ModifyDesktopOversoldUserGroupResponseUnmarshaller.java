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

package com.aliyuncs.ecd.transform.v20200930;

import com.aliyuncs.ecd.model.v20200930.ModifyDesktopOversoldUserGroupResponse;
import com.aliyuncs.ecd.model.v20200930.ModifyDesktopOversoldUserGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDesktopOversoldUserGroupResponseUnmarshaller {

	public static ModifyDesktopOversoldUserGroupResponse unmarshall(ModifyDesktopOversoldUserGroupResponse modifyDesktopOversoldUserGroupResponse, UnmarshallerContext _ctx) {
		
		modifyDesktopOversoldUserGroupResponse.setRequestId(_ctx.stringValue("ModifyDesktopOversoldUserGroupResponse.RequestId"));

		Data data = new Data();
		data.setUserGroupId(_ctx.stringValue("ModifyDesktopOversoldUserGroupResponse.Data.UserGroupId"));
		modifyDesktopOversoldUserGroupResponse.setData(data);
	 
	 	return modifyDesktopOversoldUserGroupResponse;
	}
}