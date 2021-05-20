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

package com.aliyuncs.mpaas.transform.v20200710;

import com.aliyuncs.mpaas.model.v20200710.DeleteMcubeUpgradeResourceResponse;
import com.aliyuncs.mpaas.model.v20200710.DeleteMcubeUpgradeResourceResponse.DeleteResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMcubeUpgradeResourceResponseUnmarshaller {

	public static DeleteMcubeUpgradeResourceResponse unmarshall(DeleteMcubeUpgradeResourceResponse deleteMcubeUpgradeResourceResponse, UnmarshallerContext _ctx) {
		
		deleteMcubeUpgradeResourceResponse.setRequestId(_ctx.stringValue("DeleteMcubeUpgradeResourceResponse.RequestId"));
		deleteMcubeUpgradeResourceResponse.setResultCode(_ctx.stringValue("DeleteMcubeUpgradeResourceResponse.ResultCode"));
		deleteMcubeUpgradeResourceResponse.setResultMessage(_ctx.stringValue("DeleteMcubeUpgradeResourceResponse.ResultMessage"));

		DeleteResult deleteResult = new DeleteResult();
		deleteResult.setErrorCode(_ctx.stringValue("DeleteMcubeUpgradeResourceResponse.DeleteResult.ErrorCode"));
		deleteResult.setResultMsg(_ctx.stringValue("DeleteMcubeUpgradeResourceResponse.DeleteResult.ResultMsg"));
		deleteResult.setSuccess(_ctx.booleanValue("DeleteMcubeUpgradeResourceResponse.DeleteResult.Success"));
		deleteResult.setRequestId(_ctx.stringValue("DeleteMcubeUpgradeResourceResponse.DeleteResult.RequestId"));
		deleteMcubeUpgradeResourceResponse.setDeleteResult(deleteResult);
	 
	 	return deleteMcubeUpgradeResourceResponse;
	}
}