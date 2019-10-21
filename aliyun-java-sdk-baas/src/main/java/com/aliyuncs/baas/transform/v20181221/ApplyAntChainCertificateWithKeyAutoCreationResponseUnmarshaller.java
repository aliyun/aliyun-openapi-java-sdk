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

package com.aliyuncs.baas.transform.v20181221;

import com.aliyuncs.baas.model.v20181221.ApplyAntChainCertificateWithKeyAutoCreationResponse;
import com.aliyuncs.baas.model.v20181221.ApplyAntChainCertificateWithKeyAutoCreationResponse.Result;
import com.aliyuncs.baas.model.v20181221.ApplyAntChainCertificateWithKeyAutoCreationResponse.Result.DownloadPath;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyAntChainCertificateWithKeyAutoCreationResponseUnmarshaller {

	public static ApplyAntChainCertificateWithKeyAutoCreationResponse unmarshall(ApplyAntChainCertificateWithKeyAutoCreationResponse applyAntChainCertificateWithKeyAutoCreationResponse, UnmarshallerContext _ctx) {
		
		applyAntChainCertificateWithKeyAutoCreationResponse.setRequestId(_ctx.stringValue("ApplyAntChainCertificateWithKeyAutoCreationResponse.RequestId"));

		Result result = new Result();
		result.setPrivateKey(_ctx.stringValue("ApplyAntChainCertificateWithKeyAutoCreationResponse.Result.PrivateKey"));

		DownloadPath downloadPath = new DownloadPath();
		downloadPath.setClientCrtUrl(_ctx.stringValue("ApplyAntChainCertificateWithKeyAutoCreationResponse.Result.DownloadPath.ClientCrtUrl"));
		downloadPath.setTrustCaUrl(_ctx.stringValue("ApplyAntChainCertificateWithKeyAutoCreationResponse.Result.DownloadPath.TrustCaUrl"));
		downloadPath.setCaCrtUrl(_ctx.stringValue("ApplyAntChainCertificateWithKeyAutoCreationResponse.Result.DownloadPath.CaCrtUrl"));
		downloadPath.setSdkUrl(_ctx.stringValue("ApplyAntChainCertificateWithKeyAutoCreationResponse.Result.DownloadPath.SdkUrl"));
		result.setDownloadPath(downloadPath);
		applyAntChainCertificateWithKeyAutoCreationResponse.setResult(result);
	 
	 	return applyAntChainCertificateWithKeyAutoCreationResponse;
	}
}