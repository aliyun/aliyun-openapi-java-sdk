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

package com.aliyuncs.oam.transform.v20170101;

import com.aliyuncs.oam.model.v20170101.GetGroupResponse;
import com.aliyuncs.oam.model.v20170101.GetGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGroupResponseUnmarshaller {

	public static GetGroupResponse unmarshall(GetGroupResponse getGroupResponse, UnmarshallerContext _ctx) {
		
		getGroupResponse.setCode(_ctx.stringValue("GetGroupResponse.Code"));
		getGroupResponse.setMessage(_ctx.stringValue("GetGroupResponse.Message"));

		Data data = new Data();
		data.setGroupName(_ctx.stringValue("GetGroupResponse.Data.GroupName"));
		data.setDescription(_ctx.stringValue("GetGroupResponse.Data.Description"));
		data.setOwnerName(_ctx.stringValue("GetGroupResponse.Data.OwnerName"));
		data.setGmtCreated(_ctx.stringValue("GetGroupResponse.Data.GmtCreated"));
		data.setGmtModified(_ctx.stringValue("GetGroupResponse.Data.GmtModified"));
		getGroupResponse.setData(data);
	 
	 	return getGroupResponse;
	}
}