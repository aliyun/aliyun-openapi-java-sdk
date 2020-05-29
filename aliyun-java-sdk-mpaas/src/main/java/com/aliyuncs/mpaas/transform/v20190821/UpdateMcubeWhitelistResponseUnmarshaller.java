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

package com.aliyuncs.mpaas.transform.v20190821;

import com.aliyuncs.mpaas.model.v20190821.UpdateMcubeWhitelistResponse;
import com.aliyuncs.mpaas.model.v20190821.UpdateMcubeWhitelistResponse.AddWhitelistResult;
import com.aliyuncs.mpaas.model.v20190821.UpdateMcubeWhitelistResponse.AddWhitelistResult.AddWhitelistInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMcubeWhitelistResponseUnmarshaller {

	public static UpdateMcubeWhitelistResponse unmarshall(UpdateMcubeWhitelistResponse updateMcubeWhitelistResponse, UnmarshallerContext _ctx) {
		
		updateMcubeWhitelistResponse.setRequestId(_ctx.stringValue("UpdateMcubeWhitelistResponse.RequestId"));
		updateMcubeWhitelistResponse.setResultCode(_ctx.stringValue("UpdateMcubeWhitelistResponse.ResultCode"));
		updateMcubeWhitelistResponse.setResultMessage(_ctx.stringValue("UpdateMcubeWhitelistResponse.ResultMessage"));

		AddWhitelistResult addWhitelistResult = new AddWhitelistResult();
		addWhitelistResult.setResultMsg(_ctx.stringValue("UpdateMcubeWhitelistResponse.AddWhitelistResult.ResultMsg"));
		addWhitelistResult.setSuccess(_ctx.booleanValue("UpdateMcubeWhitelistResponse.AddWhitelistResult.Success"));

		AddWhitelistInfo addWhitelistInfo = new AddWhitelistInfo();
		addWhitelistInfo.setFailNum(_ctx.longValue("UpdateMcubeWhitelistResponse.AddWhitelistResult.AddWhitelistInfo.FailNum"));
		addWhitelistInfo.setFailUserIds(_ctx.stringValue("UpdateMcubeWhitelistResponse.AddWhitelistResult.AddWhitelistInfo.FailUserIds"));
		addWhitelistInfo.setSuccessNum(_ctx.longValue("UpdateMcubeWhitelistResponse.AddWhitelistResult.AddWhitelistInfo.SuccessNum"));
		addWhitelistResult.setAddWhitelistInfo(addWhitelistInfo);
		updateMcubeWhitelistResponse.setAddWhitelistResult(addWhitelistResult);
	 
	 	return updateMcubeWhitelistResponse;
	}
}