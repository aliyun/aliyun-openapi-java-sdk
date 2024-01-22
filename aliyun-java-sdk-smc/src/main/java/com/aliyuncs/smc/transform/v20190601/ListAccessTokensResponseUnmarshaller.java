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

package com.aliyuncs.smc.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smc.model.v20190601.ListAccessTokensResponse;
import com.aliyuncs.smc.model.v20190601.ListAccessTokensResponse.AccessToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccessTokensResponseUnmarshaller {

	public static ListAccessTokensResponse unmarshall(ListAccessTokensResponse listAccessTokensResponse, UnmarshallerContext _ctx) {
		
		listAccessTokensResponse.setRequestId(_ctx.stringValue("ListAccessTokensResponse.RequestId"));
		listAccessTokensResponse.setTotalCount(_ctx.integerValue("ListAccessTokensResponse.TotalCount"));
		listAccessTokensResponse.setPageSize(_ctx.integerValue("ListAccessTokensResponse.PageSize"));
		listAccessTokensResponse.setPageNumber(_ctx.integerValue("ListAccessTokensResponse.PageNumber"));

		List<AccessToken> accessTokens = new ArrayList<AccessToken>();
		for (int i = 0; i < _ctx.lengthValue("ListAccessTokensResponse.AccessTokens.Length"); i++) {
			AccessToken accessToken = new AccessToken();
			accessToken.setAccessTokenId(_ctx.stringValue("ListAccessTokensResponse.AccessTokens["+ i +"].AccessTokenId"));
			accessToken.setTimeToLiveInDays(_ctx.stringValue("ListAccessTokensResponse.AccessTokens["+ i +"].TimeToLiveInDays"));
			accessToken.setCount(_ctx.stringValue("ListAccessTokensResponse.AccessTokens["+ i +"].Count"));
			accessToken.setRegisteredCount(_ctx.stringValue("ListAccessTokensResponse.AccessTokens["+ i +"].RegisteredCount"));
			accessToken.setCreationTime(_ctx.stringValue("ListAccessTokensResponse.AccessTokens["+ i +"].CreationTime"));
			accessToken.setStatus(_ctx.stringValue("ListAccessTokensResponse.AccessTokens["+ i +"].Status"));
			accessToken.setName(_ctx.stringValue("ListAccessTokensResponse.AccessTokens["+ i +"].Name"));
			accessToken.setDescription(_ctx.stringValue("ListAccessTokensResponse.AccessTokens["+ i +"].Description"));

			accessTokens.add(accessToken);
		}
		listAccessTokensResponse.setAccessTokens(accessTokens);
	 
	 	return listAccessTokensResponse;
	}
}