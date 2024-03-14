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

import com.aliyuncs.mpaas.model.v20200415.DeleteMcubeMiniprogramConfigResponse;
import com.aliyuncs.mpaas.model.v20200415.DeleteMcubeMiniprogramConfigResponse.DeleteMiniConfigResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMcubeMiniprogramConfigResponseUnmarshaller {

	public static DeleteMcubeMiniprogramConfigResponse unmarshall(DeleteMcubeMiniprogramConfigResponse deleteMcubeMiniprogramConfigResponse, UnmarshallerContext _ctx) {
		
		deleteMcubeMiniprogramConfigResponse.setRequestId(_ctx.stringValue("DeleteMcubeMiniprogramConfigResponse.RequestId"));
		deleteMcubeMiniprogramConfigResponse.setResultMessage(_ctx.stringValue("DeleteMcubeMiniprogramConfigResponse.ResultMessage"));
		deleteMcubeMiniprogramConfigResponse.setResultCode(_ctx.stringValue("DeleteMcubeMiniprogramConfigResponse.ResultCode"));

		DeleteMiniConfigResult deleteMiniConfigResult = new DeleteMiniConfigResult();
		deleteMiniConfigResult.setSuccess(_ctx.booleanValue("DeleteMcubeMiniprogramConfigResponse.DeleteMiniConfigResult.Success"));
		deleteMiniConfigResult.setResultMsg(_ctx.stringValue("DeleteMcubeMiniprogramConfigResponse.DeleteMiniConfigResult.ResultMsg"));
		deleteMcubeMiniprogramConfigResponse.setDeleteMiniConfigResult(deleteMiniConfigResult);
	 
	 	return deleteMcubeMiniprogramConfigResponse;
	}
}