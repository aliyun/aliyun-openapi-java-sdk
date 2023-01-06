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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ims.model.v20190815.ListOIDCProvidersResponse;
import com.aliyuncs.ims.model.v20190815.ListOIDCProvidersResponse.OIDCProvider;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOIDCProvidersResponseUnmarshaller {

	public static ListOIDCProvidersResponse unmarshall(ListOIDCProvidersResponse listOIDCProvidersResponse, UnmarshallerContext _ctx) {
		
		listOIDCProvidersResponse.setRequestId(_ctx.stringValue("ListOIDCProvidersResponse.RequestId"));
		listOIDCProvidersResponse.setIsTruncated(_ctx.booleanValue("ListOIDCProvidersResponse.IsTruncated"));
		listOIDCProvidersResponse.setMarker(_ctx.stringValue("ListOIDCProvidersResponse.Marker"));

		List<OIDCProvider> oIDCProviders = new ArrayList<OIDCProvider>();
		for (int i = 0; i < _ctx.lengthValue("ListOIDCProvidersResponse.OIDCProviders.Length"); i++) {
			OIDCProvider oIDCProvider = new OIDCProvider();
			oIDCProvider.setUpdateDate(_ctx.stringValue("ListOIDCProvidersResponse.OIDCProviders["+ i +"].UpdateDate"));
			oIDCProvider.setDescription(_ctx.stringValue("ListOIDCProvidersResponse.OIDCProviders["+ i +"].Description"));
			oIDCProvider.setOIDCProviderName(_ctx.stringValue("ListOIDCProvidersResponse.OIDCProviders["+ i +"].OIDCProviderName"));
			oIDCProvider.setCreateDate(_ctx.stringValue("ListOIDCProvidersResponse.OIDCProviders["+ i +"].CreateDate"));
			oIDCProvider.setArn(_ctx.stringValue("ListOIDCProvidersResponse.OIDCProviders["+ i +"].Arn"));
			oIDCProvider.setIssuerUrl(_ctx.stringValue("ListOIDCProvidersResponse.OIDCProviders["+ i +"].IssuerUrl"));
			oIDCProvider.setFingerprints(_ctx.stringValue("ListOIDCProvidersResponse.OIDCProviders["+ i +"].Fingerprints"));
			oIDCProvider.setClientIds(_ctx.stringValue("ListOIDCProvidersResponse.OIDCProviders["+ i +"].ClientIds"));
			oIDCProvider.setGmtCreate(_ctx.stringValue("ListOIDCProvidersResponse.OIDCProviders["+ i +"].GmtCreate"));
			oIDCProvider.setGmtModified(_ctx.stringValue("ListOIDCProvidersResponse.OIDCProviders["+ i +"].GmtModified"));

			oIDCProviders.add(oIDCProvider);
		}
		listOIDCProvidersResponse.setOIDCProviders(oIDCProviders);
	 
	 	return listOIDCProvidersResponse;
	}
}