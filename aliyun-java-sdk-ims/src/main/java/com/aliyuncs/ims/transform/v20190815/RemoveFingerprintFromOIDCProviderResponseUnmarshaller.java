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

package com.aliyuncs.ims.transform.v20190815;

import com.aliyuncs.ims.model.v20190815.RemoveFingerprintFromOIDCProviderResponse;
import com.aliyuncs.ims.model.v20190815.RemoveFingerprintFromOIDCProviderResponse.OIDCProvider;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveFingerprintFromOIDCProviderResponseUnmarshaller {

	public static RemoveFingerprintFromOIDCProviderResponse unmarshall(RemoveFingerprintFromOIDCProviderResponse removeFingerprintFromOIDCProviderResponse, UnmarshallerContext _ctx) {
		
		removeFingerprintFromOIDCProviderResponse.setRequestId(_ctx.stringValue("RemoveFingerprintFromOIDCProviderResponse.RequestId"));

		OIDCProvider oIDCProvider = new OIDCProvider();
		oIDCProvider.setUpdateDate(_ctx.stringValue("RemoveFingerprintFromOIDCProviderResponse.OIDCProvider.UpdateDate"));
		oIDCProvider.setDescription(_ctx.stringValue("RemoveFingerprintFromOIDCProviderResponse.OIDCProvider.Description"));
		oIDCProvider.setOIDCProviderName(_ctx.stringValue("RemoveFingerprintFromOIDCProviderResponse.OIDCProvider.OIDCProviderName"));
		oIDCProvider.setCreateDate(_ctx.stringValue("RemoveFingerprintFromOIDCProviderResponse.OIDCProvider.CreateDate"));
		oIDCProvider.setArn(_ctx.stringValue("RemoveFingerprintFromOIDCProviderResponse.OIDCProvider.Arn"));
		oIDCProvider.setIssuerUrl(_ctx.stringValue("RemoveFingerprintFromOIDCProviderResponse.OIDCProvider.IssuerUrl"));
		oIDCProvider.setFingerprints(_ctx.stringValue("RemoveFingerprintFromOIDCProviderResponse.OIDCProvider.Fingerprints"));
		oIDCProvider.setClientIds(_ctx.stringValue("RemoveFingerprintFromOIDCProviderResponse.OIDCProvider.ClientIds"));
		oIDCProvider.setGmtCreate(_ctx.stringValue("RemoveFingerprintFromOIDCProviderResponse.OIDCProvider.GmtCreate"));
		oIDCProvider.setGmtModified(_ctx.stringValue("RemoveFingerprintFromOIDCProviderResponse.OIDCProvider.GmtModified"));
		removeFingerprintFromOIDCProviderResponse.setOIDCProvider(oIDCProvider);
	 
	 	return removeFingerprintFromOIDCProviderResponse;
	}
}