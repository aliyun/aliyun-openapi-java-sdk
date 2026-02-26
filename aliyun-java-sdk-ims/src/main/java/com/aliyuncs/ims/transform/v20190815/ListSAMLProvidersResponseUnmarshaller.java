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

import com.aliyuncs.ims.model.v20190815.ListSAMLProvidersResponse;
import com.aliyuncs.ims.model.v20190815.ListSAMLProvidersResponse.SAMLProvider;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSAMLProvidersResponseUnmarshaller {

	public static ListSAMLProvidersResponse unmarshall(ListSAMLProvidersResponse listSAMLProvidersResponse, UnmarshallerContext _ctx) {
		
		listSAMLProvidersResponse.setRequestId(_ctx.stringValue("ListSAMLProvidersResponse.RequestId"));
		listSAMLProvidersResponse.setIsTruncated(_ctx.booleanValue("ListSAMLProvidersResponse.IsTruncated"));
		listSAMLProvidersResponse.setMarker(_ctx.stringValue("ListSAMLProvidersResponse.Marker"));

		List<SAMLProvider> sAMLProviders = new ArrayList<SAMLProvider>();
		for (int i = 0; i < _ctx.lengthValue("ListSAMLProvidersResponse.SAMLProviders.Length"); i++) {
			SAMLProvider sAMLProvider = new SAMLProvider();
			sAMLProvider.setUpdateDate(_ctx.stringValue("ListSAMLProvidersResponse.SAMLProviders["+ i +"].UpdateDate"));
			sAMLProvider.setDescription(_ctx.stringValue("ListSAMLProvidersResponse.SAMLProviders["+ i +"].Description"));
			sAMLProvider.setSAMLProviderName(_ctx.stringValue("ListSAMLProvidersResponse.SAMLProviders["+ i +"].SAMLProviderName"));
			sAMLProvider.setCreateDate(_ctx.stringValue("ListSAMLProvidersResponse.SAMLProviders["+ i +"].CreateDate"));
			sAMLProvider.setArn(_ctx.stringValue("ListSAMLProvidersResponse.SAMLProviders["+ i +"].Arn"));

			sAMLProviders.add(sAMLProvider);
		}
		listSAMLProvidersResponse.setSAMLProviders(sAMLProviders);
	 
	 	return listSAMLProvidersResponse;
	}
}