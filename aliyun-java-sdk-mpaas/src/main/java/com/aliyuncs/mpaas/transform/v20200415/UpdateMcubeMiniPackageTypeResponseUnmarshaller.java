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

import com.aliyuncs.mpaas.model.v20200415.UpdateMcubeMiniPackageTypeResponse;
import com.aliyuncs.mpaas.model.v20200415.UpdateMcubeMiniPackageTypeResponse.UpdatePackageTypeResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMcubeMiniPackageTypeResponseUnmarshaller {

	public static UpdateMcubeMiniPackageTypeResponse unmarshall(UpdateMcubeMiniPackageTypeResponse updateMcubeMiniPackageTypeResponse, UnmarshallerContext _ctx) {
		
		updateMcubeMiniPackageTypeResponse.setRequestId(_ctx.stringValue("UpdateMcubeMiniPackageTypeResponse.RequestId"));
		updateMcubeMiniPackageTypeResponse.setResultMessage(_ctx.stringValue("UpdateMcubeMiniPackageTypeResponse.ResultMessage"));
		updateMcubeMiniPackageTypeResponse.setResultCode(_ctx.stringValue("UpdateMcubeMiniPackageTypeResponse.ResultCode"));

		UpdatePackageTypeResult updatePackageTypeResult = new UpdatePackageTypeResult();
		updatePackageTypeResult.setSuccess(_ctx.booleanValue("UpdateMcubeMiniPackageTypeResponse.UpdatePackageTypeResult.Success"));
		updatePackageTypeResult.setResultMsg(_ctx.stringValue("UpdateMcubeMiniPackageTypeResponse.UpdatePackageTypeResult.ResultMsg"));
		updateMcubeMiniPackageTypeResponse.setUpdatePackageTypeResult(updatePackageTypeResult);
	 
	 	return updateMcubeMiniPackageTypeResponse;
	}
}