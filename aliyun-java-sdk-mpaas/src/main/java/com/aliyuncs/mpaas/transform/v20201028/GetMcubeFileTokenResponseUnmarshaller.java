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

import com.aliyuncs.mpaas.model.v20201028.GetMcubeFileTokenResponse;
import com.aliyuncs.mpaas.model.v20201028.GetMcubeFileTokenResponse.GetFileTokenResult;
import com.aliyuncs.mpaas.model.v20201028.GetMcubeFileTokenResponse.GetFileTokenResult.FileToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMcubeFileTokenResponseUnmarshaller {

	public static GetMcubeFileTokenResponse unmarshall(GetMcubeFileTokenResponse getMcubeFileTokenResponse, UnmarshallerContext _ctx) {
		
		getMcubeFileTokenResponse.setRequestId(_ctx.stringValue("GetMcubeFileTokenResponse.RequestId"));
		getMcubeFileTokenResponse.setResultMessage(_ctx.stringValue("GetMcubeFileTokenResponse.ResultMessage"));
		getMcubeFileTokenResponse.setResultCode(_ctx.stringValue("GetMcubeFileTokenResponse.ResultCode"));

		GetFileTokenResult getFileTokenResult = new GetFileTokenResult();
		getFileTokenResult.setSuccess(_ctx.booleanValue("GetMcubeFileTokenResponse.GetFileTokenResult.Success"));
		getFileTokenResult.setResultMsg(_ctx.stringValue("GetMcubeFileTokenResponse.GetFileTokenResult.ResultMsg"));

		FileToken fileToken = new FileToken();
		fileToken.setSignature(_ctx.stringValue("GetMcubeFileTokenResponse.GetFileTokenResult.FileToken.Signature"));
		fileToken.setHost(_ctx.stringValue("GetMcubeFileTokenResponse.GetFileTokenResult.FileToken.Host"));
		fileToken.setPolicy(_ctx.stringValue("GetMcubeFileTokenResponse.GetFileTokenResult.FileToken.Policy"));
		fileToken.setAccessid(_ctx.stringValue("GetMcubeFileTokenResponse.GetFileTokenResult.FileToken.Accessid"));
		fileToken.setDir(_ctx.stringValue("GetMcubeFileTokenResponse.GetFileTokenResult.FileToken.Dir"));
		fileToken.setExpire(_ctx.stringValue("GetMcubeFileTokenResponse.GetFileTokenResult.FileToken.Expire"));
		getFileTokenResult.setFileToken(fileToken);
		getMcubeFileTokenResponse.setGetFileTokenResult(getFileTokenResult);
	 
	 	return getMcubeFileTokenResponse;
	}
}