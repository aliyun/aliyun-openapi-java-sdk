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

import com.aliyuncs.linkvisual.model.v20180120.UpdateFaceUserGroupAndDeviceGroupRelationResponse;
import com.aliyuncs.linkvisual.model.v20180120.UpdateFaceUserGroupAndDeviceGroupRelationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFaceUserGroupAndDeviceGroupRelationResponseUnmarshaller {

	public static UpdateFaceUserGroupAndDeviceGroupRelationResponse unmarshall(UpdateFaceUserGroupAndDeviceGroupRelationResponse updateFaceUserGroupAndDeviceGroupRelationResponse, UnmarshallerContext _ctx) {
		
		updateFaceUserGroupAndDeviceGroupRelationResponse.setRequestId(_ctx.stringValue("UpdateFaceUserGroupAndDeviceGroupRelationResponse.RequestId"));
		updateFaceUserGroupAndDeviceGroupRelationResponse.setSuccess(_ctx.booleanValue("UpdateFaceUserGroupAndDeviceGroupRelationResponse.Success"));
		updateFaceUserGroupAndDeviceGroupRelationResponse.setErrorMessage(_ctx.stringValue("UpdateFaceUserGroupAndDeviceGroupRelationResponse.ErrorMessage"));
		updateFaceUserGroupAndDeviceGroupRelationResponse.setCode(_ctx.stringValue("UpdateFaceUserGroupAndDeviceGroupRelationResponse.Code"));

		Data data = new Data();
		data.setControlId(_ctx.stringValue("UpdateFaceUserGroupAndDeviceGroupRelationResponse.Data.ControlId"));
		data.setModifiedTime(_ctx.stringValue("UpdateFaceUserGroupAndDeviceGroupRelationResponse.Data.ModifiedTime"));
		updateFaceUserGroupAndDeviceGroupRelationResponse.setData(data);
	 
	 	return updateFaceUserGroupAndDeviceGroupRelationResponse;
	}
}