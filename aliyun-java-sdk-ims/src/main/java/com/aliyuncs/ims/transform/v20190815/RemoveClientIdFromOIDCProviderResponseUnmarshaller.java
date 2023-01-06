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

import com.aliyuncs.ims.model.v20190815.RemoveClientIdFromOIDCProviderResponse;
import com.aliyuncs.ims.model.v20190815.RemoveClientIdFromOIDCProviderResponse.OIDCProvider;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveClientIdFromOIDCProviderResponseUnmarshaller {

	public static RemoveClientIdFromOIDCProviderResponse unmarshall(RemoveClientIdFromOIDCProviderResponse removeClientIdFromOIDCProviderResponse, UnmarshallerContext _ctx) {
		
		removeClientIdFromOIDCProviderResponse.setRequestId(_ctx.stringValue("RemoveClientIdFromOIDCProviderResponse.RequestId"));

		OIDCProvider oIDCProvider = new OIDCProvider();
		oIDCProvider.setUpdateDate(_ctx.stringValue("RemoveClientIdFromOIDCProviderResponse.OIDCProvider.UpdateDate"));
		oIDCProvider.setDescription(_ctx.stringValue("RemoveClientIdFromOIDCProviderResponse.OIDCProvider.Description"));
		oIDCProvider.setOIDCProviderName(_ctx.stringValue("RemoveClientIdFromOIDCProviderResponse.OIDCProvider.OIDCProviderName"));
		oIDCProvider.setCreateDate(_ctx.stringValue("RemoveClientIdFromOIDCProviderResponse.OIDCProvider.CreateDate"));
		oIDCProvider.setArn(_ctx.stringValue("RemoveClientIdFromOIDCProviderResponse.OIDCProvider.Arn"));
		oIDCProvider.setIssuerUrl(_ctx.stringValue("RemoveClientIdFromOIDCProviderResponse.OIDCProvider.IssuerUrl"));
		oIDCProvider.setFingerprints(_ctx.stringValue("RemoveClientIdFromOIDCProviderResponse.OIDCProvider.Fingerprints"));
		oIDCProvider.setClientIds(_ctx.stringValue("RemoveClientIdFromOIDCProviderResponse.OIDCProvider.ClientIds"));
		oIDCProvider.setGmtCreate(_ctx.stringValue("RemoveClientIdFromOIDCProviderResponse.OIDCProvider.GmtCreate"));
		oIDCProvider.setGmtModified(_ctx.stringValue("RemoveClientIdFromOIDCProviderResponse.OIDCProvider.GmtModified"));
		removeClientIdFromOIDCProviderResponse.setOIDCProvider(oIDCProvider);
	 
	 	return removeClientIdFromOIDCProviderResponse;
	}
}