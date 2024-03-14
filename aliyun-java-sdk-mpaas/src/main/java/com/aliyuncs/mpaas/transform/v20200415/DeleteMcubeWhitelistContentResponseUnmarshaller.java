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

import com.aliyuncs.mpaas.model.v20200415.DeleteMcubeWhitelistContentResponse;
import com.aliyuncs.mpaas.model.v20200415.DeleteMcubeWhitelistContentResponse.DeleteWhitelistContentResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMcubeWhitelistContentResponseUnmarshaller {

	public static DeleteMcubeWhitelistContentResponse unmarshall(DeleteMcubeWhitelistContentResponse deleteMcubeWhitelistContentResponse, UnmarshallerContext _ctx) {
		
		deleteMcubeWhitelistContentResponse.setRequestId(_ctx.stringValue("DeleteMcubeWhitelistContentResponse.RequestId"));
		deleteMcubeWhitelistContentResponse.setResultMessage(_ctx.stringValue("DeleteMcubeWhitelistContentResponse.ResultMessage"));
		deleteMcubeWhitelistContentResponse.setResultCode(_ctx.stringValue("DeleteMcubeWhitelistContentResponse.ResultCode"));

		DeleteWhitelistContentResult deleteWhitelistContentResult = new DeleteWhitelistContentResult();
		deleteWhitelistContentResult.setData(_ctx.stringValue("DeleteMcubeWhitelistContentResponse.DeleteWhitelistContentResult.Data"));
		deleteWhitelistContentResult.setSuccess(_ctx.booleanValue("DeleteMcubeWhitelistContentResponse.DeleteWhitelistContentResult.Success"));
		deleteWhitelistContentResult.setResultMsg(_ctx.stringValue("DeleteMcubeWhitelistContentResponse.DeleteWhitelistContentResult.ResultMsg"));
		deleteMcubeWhitelistContentResponse.setDeleteWhitelistContentResult(deleteWhitelistContentResult);
	 
	 	return deleteMcubeWhitelistContentResponse;
	}
}