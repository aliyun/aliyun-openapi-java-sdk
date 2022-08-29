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

package com.aliyuncs.mpaas.transform.v20200415;

import com.aliyuncs.mpaas.model.v20200415.UpdateMcubeIconUrlResponse;
import com.aliyuncs.mpaas.model.v20200415.UpdateMcubeIconUrlResponse.UpdateIconUrlResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMcubeIconUrlResponseUnmarshaller {

	public static UpdateMcubeIconUrlResponse unmarshall(UpdateMcubeIconUrlResponse updateMcubeIconUrlResponse, UnmarshallerContext _ctx) {
		
		updateMcubeIconUrlResponse.setRequestId(_ctx.stringValue("UpdateMcubeIconUrlResponse.RequestId"));
		updateMcubeIconUrlResponse.setResultMessage(_ctx.stringValue("UpdateMcubeIconUrlResponse.ResultMessage"));
		updateMcubeIconUrlResponse.setResultCode(_ctx.stringValue("UpdateMcubeIconUrlResponse.ResultCode"));

		UpdateIconUrlResult updateIconUrlResult = new UpdateIconUrlResult();
		updateIconUrlResult.setSuccess(_ctx.booleanValue("UpdateMcubeIconUrlResponse.UpdateIconUrlResult.Success"));
		updateIconUrlResult.setResultMsg(_ctx.stringValue("UpdateMcubeIconUrlResponse.UpdateIconUrlResult.ResultMsg"));
		updateMcubeIconUrlResponse.setUpdateIconUrlResult(updateIconUrlResult);
	 
	 	return updateMcubeIconUrlResponse;
	}
}