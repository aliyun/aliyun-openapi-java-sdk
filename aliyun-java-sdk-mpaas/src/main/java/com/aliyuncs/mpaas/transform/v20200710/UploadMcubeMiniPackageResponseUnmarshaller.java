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

import com.aliyuncs.mpaas.model.v20200710.UploadMcubeMiniPackageResponse;
import com.aliyuncs.mpaas.model.v20200710.UploadMcubeMiniPackageResponse.UploadMiniPackageResult;
import com.aliyuncs.mpaas.model.v20200710.UploadMcubeMiniPackageResponse.UploadMiniPackageResult.ReturnPackageResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadMcubeMiniPackageResponseUnmarshaller {

	public static UploadMcubeMiniPackageResponse unmarshall(UploadMcubeMiniPackageResponse uploadMcubeMiniPackageResponse, UnmarshallerContext _ctx) {
		
		uploadMcubeMiniPackageResponse.setRequestId(_ctx.stringValue("UploadMcubeMiniPackageResponse.RequestId"));
		uploadMcubeMiniPackageResponse.setResultCode(_ctx.stringValue("UploadMcubeMiniPackageResponse.ResultCode"));
		uploadMcubeMiniPackageResponse.setResultMessage(_ctx.stringValue("UploadMcubeMiniPackageResponse.ResultMessage"));

		UploadMiniPackageResult uploadMiniPackageResult = new UploadMiniPackageResult();
		uploadMiniPackageResult.setResultMsg(_ctx.stringValue("UploadMcubeMiniPackageResponse.UploadMiniPackageResult.ResultMsg"));
		uploadMiniPackageResult.setSuccess(_ctx.booleanValue("UploadMcubeMiniPackageResponse.UploadMiniPackageResult.Success"));

		ReturnPackageResult returnPackageResult = new ReturnPackageResult();
		returnPackageResult.setDebugUrl(_ctx.stringValue("UploadMcubeMiniPackageResponse.UploadMiniPackageResult.ReturnPackageResult.DebugUrl"));
		returnPackageResult.setPackageId(_ctx.stringValue("UploadMcubeMiniPackageResponse.UploadMiniPackageResult.ReturnPackageResult.PackageId"));
		returnPackageResult.setUserId(_ctx.stringValue("UploadMcubeMiniPackageResponse.UploadMiniPackageResult.ReturnPackageResult.UserId"));
		uploadMiniPackageResult.setReturnPackageResult(returnPackageResult);
		uploadMcubeMiniPackageResponse.setUploadMiniPackageResult(uploadMiniPackageResult);
	 
	 	return uploadMcubeMiniPackageResponse;
	}
}