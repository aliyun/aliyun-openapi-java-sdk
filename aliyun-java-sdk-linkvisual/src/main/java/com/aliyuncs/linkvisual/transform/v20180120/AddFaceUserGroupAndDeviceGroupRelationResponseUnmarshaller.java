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

import com.aliyuncs.linkvisual.model.v20180120.AddFaceUserGroupAndDeviceGroupRelationResponse;
import com.aliyuncs.linkvisual.model.v20180120.AddFaceUserGroupAndDeviceGroupRelationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddFaceUserGroupAndDeviceGroupRelationResponseUnmarshaller {

	public static AddFaceUserGroupAndDeviceGroupRelationResponse unmarshall(AddFaceUserGroupAndDeviceGroupRelationResponse addFaceUserGroupAndDeviceGroupRelationResponse, UnmarshallerContext _ctx) {
		
		addFaceUserGroupAndDeviceGroupRelationResponse.setRequestId(_ctx.stringValue("AddFaceUserGroupAndDeviceGroupRelationResponse.RequestId"));
		addFaceUserGroupAndDeviceGroupRelationResponse.setCode(_ctx.stringValue("AddFaceUserGroupAndDeviceGroupRelationResponse.Code"));
		addFaceUserGroupAndDeviceGroupRelationResponse.setErrorMessage(_ctx.stringValue("AddFaceUserGroupAndDeviceGroupRelationResponse.ErrorMessage"));
		addFaceUserGroupAndDeviceGroupRelationResponse.setSuccess(_ctx.booleanValue("AddFaceUserGroupAndDeviceGroupRelationResponse.Success"));

		Data data = new Data();
		data.setControlId(_ctx.stringValue("AddFaceUserGroupAndDeviceGroupRelationResponse.Data.ControlId"));
		data.setModifiedTime(_ctx.stringValue("AddFaceUserGroupAndDeviceGroupRelationResponse.Data.ModifiedTime"));
		addFaceUserGroupAndDeviceGroupRelationResponse.setData(data);
	 
	 	return addFaceUserGroupAndDeviceGroupRelationResponse;
	}
}