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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.DeleteUserDefineRegionResponse;
import com.aliyuncs.edas.model.v20170801.DeleteUserDefineRegionResponse.RegionDefine;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteUserDefineRegionResponseUnmarshaller {

	public static DeleteUserDefineRegionResponse unmarshall(DeleteUserDefineRegionResponse deleteUserDefineRegionResponse, UnmarshallerContext _ctx) {
		
		deleteUserDefineRegionResponse.setRequestId(_ctx.stringValue("DeleteUserDefineRegionResponse.RequestId"));
		deleteUserDefineRegionResponse.setCode(_ctx.integerValue("DeleteUserDefineRegionResponse.Code"));
		deleteUserDefineRegionResponse.setMessage(_ctx.stringValue("DeleteUserDefineRegionResponse.Message"));

		RegionDefine regionDefine = new RegionDefine();
		regionDefine.setId(_ctx.longValue("DeleteUserDefineRegionResponse.RegionDefine.Id"));
		regionDefine.setUserId(_ctx.stringValue("DeleteUserDefineRegionResponse.RegionDefine.UserId"));
		regionDefine.setRegionId(_ctx.stringValue("DeleteUserDefineRegionResponse.RegionDefine.RegionId"));
		regionDefine.setRegionName(_ctx.stringValue("DeleteUserDefineRegionResponse.RegionDefine.RegionName"));
		regionDefine.setDescription(_ctx.stringValue("DeleteUserDefineRegionResponse.RegionDefine.Description"));
		regionDefine.setBelongRegion(_ctx.stringValue("DeleteUserDefineRegionResponse.RegionDefine.BelongRegion"));
		deleteUserDefineRegionResponse.setRegionDefine(regionDefine);
	 
	 	return deleteUserDefineRegionResponse;
	}
}