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

package com.aliyuncs.devops_rdc.transform.v20200303;

import com.aliyuncs.devops_rdc.model.v20200303.UpdateCommonGroupResponse;
import com.aliyuncs.devops_rdc.model.v20200303.UpdateCommonGroupResponse.Object;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCommonGroupResponseUnmarshaller {

	public static UpdateCommonGroupResponse unmarshall(UpdateCommonGroupResponse updateCommonGroupResponse, UnmarshallerContext _ctx) {
		
		updateCommonGroupResponse.setRequestId(_ctx.stringValue("UpdateCommonGroupResponse.RequestId"));
		updateCommonGroupResponse.setSuccessful(_ctx.booleanValue("UpdateCommonGroupResponse.Successful"));
		updateCommonGroupResponse.setErrorCode(_ctx.stringValue("UpdateCommonGroupResponse.ErrorCode"));
		updateCommonGroupResponse.setErrorMsg(_ctx.stringValue("UpdateCommonGroupResponse.ErrorMsg"));

		Object object = new Object();
		object.setId(_ctx.stringValue("UpdateCommonGroupResponse.Object.Id"));
		updateCommonGroupResponse.setObject(object);
	 
	 	return updateCommonGroupResponse;
	}
}