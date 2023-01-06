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

import com.aliyuncs.ims.model.v20190815.CreateOIDCProviderResponse;
import com.aliyuncs.ims.model.v20190815.CreateOIDCProviderResponse.OIDCProvider;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOIDCProviderResponseUnmarshaller {

	public static CreateOIDCProviderResponse unmarshall(CreateOIDCProviderResponse createOIDCProviderResponse, UnmarshallerContext _ctx) {
		
		createOIDCProviderResponse.setRequestId(_ctx.stringValue("CreateOIDCProviderResponse.RequestId"));

		OIDCProvider oIDCProvider = new OIDCProvider();
		oIDCProvider.setUpdateDate(_ctx.stringValue("CreateOIDCProviderResponse.OIDCProvider.UpdateDate"));
		oIDCProvider.setDescription(_ctx.stringValue("CreateOIDCProviderResponse.OIDCProvider.Description"));
		oIDCProvider.setOIDCProviderName(_ctx.stringValue("CreateOIDCProviderResponse.OIDCProvider.OIDCProviderName"));
		oIDCProvider.setCreateDate(_ctx.stringValue("CreateOIDCProviderResponse.OIDCProvider.CreateDate"));
		oIDCProvider.setArn(_ctx.stringValue("CreateOIDCProviderResponse.OIDCProvider.Arn"));
		oIDCProvider.setIssuerUrl(_ctx.stringValue("CreateOIDCProviderResponse.OIDCProvider.IssuerUrl"));
		oIDCProvider.setFingerprints(_ctx.stringValue("CreateOIDCProviderResponse.OIDCProvider.Fingerprints"));
		oIDCProvider.setClientIds(_ctx.stringValue("CreateOIDCProviderResponse.OIDCProvider.ClientIds"));
		oIDCProvider.setGmtCreate(_ctx.stringValue("CreateOIDCProviderResponse.OIDCProvider.GmtCreate"));
		oIDCProvider.setGmtModified(_ctx.stringValue("CreateOIDCProviderResponse.OIDCProvider.GmtModified"));
		createOIDCProviderResponse.setOIDCProvider(oIDCProvider);
	 
	 	return createOIDCProviderResponse;
	}
}