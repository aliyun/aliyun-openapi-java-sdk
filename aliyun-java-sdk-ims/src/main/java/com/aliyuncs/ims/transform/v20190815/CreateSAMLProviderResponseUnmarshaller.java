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

import com.aliyuncs.ims.model.v20190815.CreateSAMLProviderResponse;
import com.aliyuncs.ims.model.v20190815.CreateSAMLProviderResponse.SAMLProvider;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSAMLProviderResponseUnmarshaller {

	public static CreateSAMLProviderResponse unmarshall(CreateSAMLProviderResponse createSAMLProviderResponse, UnmarshallerContext _ctx) {
		
		createSAMLProviderResponse.setRequestId(_ctx.stringValue("CreateSAMLProviderResponse.RequestId"));

		SAMLProvider sAMLProvider = new SAMLProvider();
		sAMLProvider.setUpdateDate(_ctx.stringValue("CreateSAMLProviderResponse.SAMLProvider.UpdateDate"));
		sAMLProvider.setDescription(_ctx.stringValue("CreateSAMLProviderResponse.SAMLProvider.Description"));
		sAMLProvider.setSAMLProviderName(_ctx.stringValue("CreateSAMLProviderResponse.SAMLProvider.SAMLProviderName"));
		sAMLProvider.setCreateDate(_ctx.stringValue("CreateSAMLProviderResponse.SAMLProvider.CreateDate"));
		sAMLProvider.setArn(_ctx.stringValue("CreateSAMLProviderResponse.SAMLProvider.Arn"));
		createSAMLProviderResponse.setSAMLProvider(sAMLProvider);
	 
	 	return createSAMLProviderResponse;
	}
}