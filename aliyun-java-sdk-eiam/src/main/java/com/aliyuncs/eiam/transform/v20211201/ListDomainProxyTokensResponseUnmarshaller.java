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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListDomainProxyTokensResponse;
import com.aliyuncs.eiam.model.v20211201.ListDomainProxyTokensResponse.DomainProxyToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDomainProxyTokensResponseUnmarshaller {

	public static ListDomainProxyTokensResponse unmarshall(ListDomainProxyTokensResponse listDomainProxyTokensResponse, UnmarshallerContext _ctx) {
		
		listDomainProxyTokensResponse.setRequestId(_ctx.stringValue("ListDomainProxyTokensResponse.RequestId"));

		List<DomainProxyToken> domainProxyTokens = new ArrayList<DomainProxyToken>();
		for (int i = 0; i < _ctx.lengthValue("ListDomainProxyTokensResponse.DomainProxyTokens.Length"); i++) {
			DomainProxyToken domainProxyToken = new DomainProxyToken();
			domainProxyToken.setInstanceId(_ctx.stringValue("ListDomainProxyTokensResponse.DomainProxyTokens["+ i +"].InstanceId"));
			domainProxyToken.setDomainProxyTokenId(_ctx.stringValue("ListDomainProxyTokensResponse.DomainProxyTokens["+ i +"].DomainProxyTokenId"));
			domainProxyToken.setDomainProxyToken(_ctx.stringValue("ListDomainProxyTokensResponse.DomainProxyTokens["+ i +"].DomainProxyToken"));
			domainProxyToken.setDomainId(_ctx.stringValue("ListDomainProxyTokensResponse.DomainProxyTokens["+ i +"].DomainId"));
			domainProxyToken.setStatus(_ctx.stringValue("ListDomainProxyTokensResponse.DomainProxyTokens["+ i +"].Status"));
			domainProxyToken.setCreateTime(_ctx.longValue("ListDomainProxyTokensResponse.DomainProxyTokens["+ i +"].CreateTime"));
			domainProxyToken.setUpdateTime(_ctx.longValue("ListDomainProxyTokensResponse.DomainProxyTokens["+ i +"].UpdateTime"));
			domainProxyToken.setLastUsedTime(_ctx.longValue("ListDomainProxyTokensResponse.DomainProxyTokens["+ i +"].LastUsedTime"));

			domainProxyTokens.add(domainProxyToken);
		}
		listDomainProxyTokensResponse.setDomainProxyTokens(domainProxyTokens);
	 
	 	return listDomainProxyTokensResponse;
	}
}