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

import com.aliyuncs.mpaas.model.v20200415.UpdateMcubeH5NameResponse;
import com.aliyuncs.mpaas.model.v20200415.UpdateMcubeH5NameResponse.UpdateMiniNameResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMcubeH5NameResponseUnmarshaller {

	public static UpdateMcubeH5NameResponse unmarshall(UpdateMcubeH5NameResponse updateMcubeH5NameResponse, UnmarshallerContext _ctx) {
		
		updateMcubeH5NameResponse.setRequestId(_ctx.stringValue("UpdateMcubeH5NameResponse.RequestId"));
		updateMcubeH5NameResponse.setResultMessage(_ctx.stringValue("UpdateMcubeH5NameResponse.ResultMessage"));
		updateMcubeH5NameResponse.setResultCode(_ctx.stringValue("UpdateMcubeH5NameResponse.ResultCode"));

		UpdateMiniNameResult updateMiniNameResult = new UpdateMiniNameResult();
		updateMiniNameResult.setSuccess(_ctx.booleanValue("UpdateMcubeH5NameResponse.UpdateMiniNameResult.Success"));
		updateMiniNameResult.setResultMsg(_ctx.stringValue("UpdateMcubeH5NameResponse.UpdateMiniNameResult.ResultMsg"));
		updateMcubeH5NameResponse.setUpdateMiniNameResult(updateMiniNameResult);
	 
	 	return updateMcubeH5NameResponse;
	}
}