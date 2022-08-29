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

import com.aliyuncs.mpaas.model.v20200415.UpdateMcubeMiniprogramConfigResponse;
import com.aliyuncs.mpaas.model.v20200415.UpdateMcubeMiniprogramConfigResponse.UpdateMiniConfigResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMcubeMiniprogramConfigResponseUnmarshaller {

	public static UpdateMcubeMiniprogramConfigResponse unmarshall(UpdateMcubeMiniprogramConfigResponse updateMcubeMiniprogramConfigResponse, UnmarshallerContext _ctx) {
		
		updateMcubeMiniprogramConfigResponse.setRequestId(_ctx.stringValue("UpdateMcubeMiniprogramConfigResponse.RequestId"));
		updateMcubeMiniprogramConfigResponse.setResultMessage(_ctx.stringValue("UpdateMcubeMiniprogramConfigResponse.ResultMessage"));
		updateMcubeMiniprogramConfigResponse.setResultCode(_ctx.stringValue("UpdateMcubeMiniprogramConfigResponse.ResultCode"));

		UpdateMiniConfigResult updateMiniConfigResult = new UpdateMiniConfigResult();
		updateMiniConfigResult.setSuccess(_ctx.booleanValue("UpdateMcubeMiniprogramConfigResponse.UpdateMiniConfigResult.Success"));
		updateMiniConfigResult.setResultMsg(_ctx.stringValue("UpdateMcubeMiniprogramConfigResponse.UpdateMiniConfigResult.ResultMsg"));
		updateMcubeMiniprogramConfigResponse.setUpdateMiniConfigResult(updateMiniConfigResult);
	 
	 	return updateMcubeMiniprogramConfigResponse;
	}
}