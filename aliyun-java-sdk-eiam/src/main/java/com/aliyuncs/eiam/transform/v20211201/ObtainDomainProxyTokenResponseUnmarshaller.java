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

package com.aliyuncs.eiam.transform.v20211201;

import com.aliyuncs.eiam.model.v20211201.ObtainDomainProxyTokenResponse;
import com.aliyuncs.eiam.model.v20211201.ObtainDomainProxyTokenResponse.DomainProxyToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class ObtainDomainProxyTokenResponseUnmarshaller {

	public static ObtainDomainProxyTokenResponse unmarshall(ObtainDomainProxyTokenResponse obtainDomainProxyTokenResponse, UnmarshallerContext _ctx) {
		
		obtainDomainProxyTokenResponse.setRequestId(_ctx.stringValue("ObtainDomainProxyTokenResponse.RequestId"));

		DomainProxyToken domainProxyToken = new DomainProxyToken();
		domainProxyToken.setInstanceId(_ctx.stringValue("ObtainDomainProxyTokenResponse.DomainProxyToken.InstanceId"));
		domainProxyToken.setDomainProxyTokenId(_ctx.stringValue("ObtainDomainProxyTokenResponse.DomainProxyToken.DomainProxyTokenId"));
		domainProxyToken.setDomainProxyToken(_ctx.stringValue("ObtainDomainProxyTokenResponse.DomainProxyToken.DomainProxyToken"));
		domainProxyToken.setDomainId(_ctx.stringValue("ObtainDomainProxyTokenResponse.DomainProxyToken.DomainId"));
		domainProxyToken.setStatus(_ctx.stringValue("ObtainDomainProxyTokenResponse.DomainProxyToken.Status"));
		domainProxyToken.setCreateTime(_ctx.longValue("ObtainDomainProxyTokenResponse.DomainProxyToken.CreateTime"));
		domainProxyToken.setUpdateTime(_ctx.longValue("ObtainDomainProxyTokenResponse.DomainProxyToken.UpdateTime"));
		domainProxyToken.setLastUsedTime(_ctx.longValue("ObtainDomainProxyTokenResponse.DomainProxyToken.LastUsedTime"));
		obtainDomainProxyTokenResponse.setDomainProxyToken(domainProxyToken);
	 
	 	return obtainDomainProxyTokenResponse;
	}
}