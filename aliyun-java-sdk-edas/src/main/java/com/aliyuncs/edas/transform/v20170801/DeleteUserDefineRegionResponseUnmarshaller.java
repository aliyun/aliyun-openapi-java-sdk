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

	public static DeleteUserDefineRegionResponse unmarshall(DeleteUserDefineRegionResponse deleteUserDefineRegionResponse, UnmarshallerContext context) {
		
		deleteUserDefineRegionResponse.setRequestId(context.stringValue("DeleteUserDefineRegionResponse.RequestId"));
		deleteUserDefineRegionResponse.setCode(context.integerValue("DeleteUserDefineRegionResponse.Code"));
		deleteUserDefineRegionResponse.setMessage(context.stringValue("DeleteUserDefineRegionResponse.Message"));

		RegionDefine regionDefine = new RegionDefine();
		regionDefine.setId(context.longValue("DeleteUserDefineRegionResponse.RegionDefine.Id"));
		regionDefine.setUserId(context.stringValue("DeleteUserDefineRegionResponse.RegionDefine.UserId"));
		regionDefine.setRegionId(context.stringValue("DeleteUserDefineRegionResponse.RegionDefine.RegionId"));
		regionDefine.setRegionName(context.stringValue("DeleteUserDefineRegionResponse.RegionDefine.RegionName"));
		regionDefine.setDescription(context.stringValue("DeleteUserDefineRegionResponse.RegionDefine.Description"));
		regionDefine.setBelongRegion(context.stringValue("DeleteUserDefineRegionResponse.RegionDefine.BelongRegion"));
		deleteUserDefineRegionResponse.setRegionDefine(regionDefine);
	 
	 	return deleteUserDefineRegionResponse;
	}
}