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

import com.aliyuncs.mpaas.model.v20200415.UpdateMcubeAmrUrlResponse;
import com.aliyuncs.mpaas.model.v20200415.UpdateMcubeAmrUrlResponse.UpdateAmrUrlResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMcubeAmrUrlResponseUnmarshaller {

	public static UpdateMcubeAmrUrlResponse unmarshall(UpdateMcubeAmrUrlResponse updateMcubeAmrUrlResponse, UnmarshallerContext _ctx) {
		
		updateMcubeAmrUrlResponse.setRequestId(_ctx.stringValue("UpdateMcubeAmrUrlResponse.RequestId"));
		updateMcubeAmrUrlResponse.setResultMessage(_ctx.stringValue("UpdateMcubeAmrUrlResponse.ResultMessage"));
		updateMcubeAmrUrlResponse.setResultCode(_ctx.stringValue("UpdateMcubeAmrUrlResponse.ResultCode"));

		UpdateAmrUrlResult updateAmrUrlResult = new UpdateAmrUrlResult();
		updateAmrUrlResult.setSuccess(_ctx.booleanValue("UpdateMcubeAmrUrlResponse.UpdateAmrUrlResult.Success"));
		updateAmrUrlResult.setResultMsg(_ctx.stringValue("UpdateMcubeAmrUrlResponse.UpdateAmrUrlResult.ResultMsg"));
		updateMcubeAmrUrlResponse.setUpdateAmrUrlResult(updateAmrUrlResult);
	 
	 	return updateMcubeAmrUrlResponse;
	}
}