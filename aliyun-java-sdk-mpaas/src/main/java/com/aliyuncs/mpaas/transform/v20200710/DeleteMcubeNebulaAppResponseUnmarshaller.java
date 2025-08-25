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

import com.aliyuncs.mpaas.model.v20200710.DeleteMcubeNebulaAppResponse;
import com.aliyuncs.mpaas.model.v20200710.DeleteMcubeNebulaAppResponse.DeleteMcubeNebulaAppResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMcubeNebulaAppResponseUnmarshaller {

	public static DeleteMcubeNebulaAppResponse unmarshall(DeleteMcubeNebulaAppResponse deleteMcubeNebulaAppResponse, UnmarshallerContext _ctx) {
		
		deleteMcubeNebulaAppResponse.setRequestId(_ctx.stringValue("DeleteMcubeNebulaAppResponse.RequestId"));
		deleteMcubeNebulaAppResponse.setResultMessage(_ctx.stringValue("DeleteMcubeNebulaAppResponse.ResultMessage"));
		deleteMcubeNebulaAppResponse.setResultCode(_ctx.stringValue("DeleteMcubeNebulaAppResponse.ResultCode"));

		DeleteMcubeNebulaAppResult deleteMcubeNebulaAppResult = new DeleteMcubeNebulaAppResult();
		deleteMcubeNebulaAppResult.setRequestId(_ctx.stringValue("DeleteMcubeNebulaAppResponse.DeleteMcubeNebulaAppResult.RequestId"));
		deleteMcubeNebulaAppResult.setErrorCode(_ctx.stringValue("DeleteMcubeNebulaAppResponse.DeleteMcubeNebulaAppResult.ErrorCode"));
		deleteMcubeNebulaAppResult.setSuccess(_ctx.booleanValue("DeleteMcubeNebulaAppResponse.DeleteMcubeNebulaAppResult.Success"));
		deleteMcubeNebulaAppResult.setResultMsg(_ctx.stringValue("DeleteMcubeNebulaAppResponse.DeleteMcubeNebulaAppResult.ResultMsg"));
		deleteMcubeNebulaAppResponse.setDeleteMcubeNebulaAppResult(deleteMcubeNebulaAppResult);
	 
	 	return deleteMcubeNebulaAppResponse;
	}
}