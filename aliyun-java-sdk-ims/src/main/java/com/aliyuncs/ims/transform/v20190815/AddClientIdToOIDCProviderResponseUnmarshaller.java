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

import com.aliyuncs.ims.model.v20190815.AddClientIdToOIDCProviderResponse;
import com.aliyuncs.ims.model.v20190815.AddClientIdToOIDCProviderResponse.OIDCProvider;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddClientIdToOIDCProviderResponseUnmarshaller {

	public static AddClientIdToOIDCProviderResponse unmarshall(AddClientIdToOIDCProviderResponse addClientIdToOIDCProviderResponse, UnmarshallerContext _ctx) {
		
		addClientIdToOIDCProviderResponse.setRequestId(_ctx.stringValue("AddClientIdToOIDCProviderResponse.RequestId"));

		OIDCProvider oIDCProvider = new OIDCProvider();
		oIDCProvider.setUpdateDate(_ctx.stringValue("AddClientIdToOIDCProviderResponse.OIDCProvider.UpdateDate"));
		oIDCProvider.setDescription(_ctx.stringValue("AddClientIdToOIDCProviderResponse.OIDCProvider.Description"));
		oIDCProvider.setOIDCProviderName(_ctx.stringValue("AddClientIdToOIDCProviderResponse.OIDCProvider.OIDCProviderName"));
		oIDCProvider.setCreateDate(_ctx.stringValue("AddClientIdToOIDCProviderResponse.OIDCProvider.CreateDate"));
		oIDCProvider.setArn(_ctx.stringValue("AddClientIdToOIDCProviderResponse.OIDCProvider.Arn"));
		oIDCProvider.setIssuerUrl(_ctx.stringValue("AddClientIdToOIDCProviderResponse.OIDCProvider.IssuerUrl"));
		oIDCProvider.setFingerprints(_ctx.stringValue("AddClientIdToOIDCProviderResponse.OIDCProvider.Fingerprints"));
		oIDCProvider.setClientIds(_ctx.stringValue("AddClientIdToOIDCProviderResponse.OIDCProvider.ClientIds"));
		oIDCProvider.setGmtCreate(_ctx.stringValue("AddClientIdToOIDCProviderResponse.OIDCProvider.GmtCreate"));
		oIDCProvider.setGmtModified(_ctx.stringValue("AddClientIdToOIDCProviderResponse.OIDCProvider.GmtModified"));
		addClientIdToOIDCProviderResponse.setOIDCProvider(oIDCProvider);
	 
	 	return addClientIdToOIDCProviderResponse;
	}
}