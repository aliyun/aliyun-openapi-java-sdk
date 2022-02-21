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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.DeleteMcubeMiniAppResponse;
import com.aliyuncs.mpaas.model.v20201028.DeleteMcubeMiniAppResponse.DeleteMiniResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMcubeMiniAppResponseUnmarshaller {

	public static DeleteMcubeMiniAppResponse unmarshall(DeleteMcubeMiniAppResponse deleteMcubeMiniAppResponse, UnmarshallerContext _ctx) {
		
		deleteMcubeMiniAppResponse.setRequestId(_ctx.stringValue("DeleteMcubeMiniAppResponse.RequestId"));
		deleteMcubeMiniAppResponse.setResultMessage(_ctx.stringValue("DeleteMcubeMiniAppResponse.ResultMessage"));
		deleteMcubeMiniAppResponse.setResultCode(_ctx.stringValue("DeleteMcubeMiniAppResponse.ResultCode"));

		DeleteMiniResult deleteMiniResult = new DeleteMiniResult();
		deleteMiniResult.setData(_ctx.stringValue("DeleteMcubeMiniAppResponse.DeleteMiniResult.Data"));
		deleteMiniResult.setSuccess(_ctx.booleanValue("DeleteMcubeMiniAppResponse.DeleteMiniResult.Success"));
		deleteMiniResult.setResultMsg(_ctx.stringValue("DeleteMcubeMiniAppResponse.DeleteMiniResult.ResultMsg"));
		deleteMcubeMiniAppResponse.setDeleteMiniResult(deleteMiniResult);
	 
	 	return deleteMcubeMiniAppResponse;
	}
}