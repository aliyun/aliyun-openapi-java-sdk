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

import com.aliyuncs.mpaas.model.v20201028.DeleteMcubeWhitelistResponse;
import com.aliyuncs.mpaas.model.v20201028.DeleteMcubeWhitelistResponse.DeleteWhitelistResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMcubeWhitelistResponseUnmarshaller {

	public static DeleteMcubeWhitelistResponse unmarshall(DeleteMcubeWhitelistResponse deleteMcubeWhitelistResponse, UnmarshallerContext _ctx) {
		
		deleteMcubeWhitelistResponse.setRequestId(_ctx.stringValue("DeleteMcubeWhitelistResponse.RequestId"));
		deleteMcubeWhitelistResponse.setResultMessage(_ctx.stringValue("DeleteMcubeWhitelistResponse.ResultMessage"));
		deleteMcubeWhitelistResponse.setResultCode(_ctx.stringValue("DeleteMcubeWhitelistResponse.ResultCode"));

		DeleteWhitelistResult deleteWhitelistResult = new DeleteWhitelistResult();
		deleteWhitelistResult.setData(_ctx.stringValue("DeleteMcubeWhitelistResponse.DeleteWhitelistResult.Data"));
		deleteWhitelistResult.setSuccess(_ctx.booleanValue("DeleteMcubeWhitelistResponse.DeleteWhitelistResult.Success"));
		deleteWhitelistResult.setResultMsg(_ctx.stringValue("DeleteMcubeWhitelistResponse.DeleteWhitelistResult.ResultMsg"));
		deleteMcubeWhitelistResponse.setDeleteWhitelistResult(deleteWhitelistResult);
	 
	 	return deleteMcubeWhitelistResponse;
	}
}