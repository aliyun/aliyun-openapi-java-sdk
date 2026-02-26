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

import com.aliyuncs.eiam.model.v20211201.ListApplicationTokensResponse;
import com.aliyuncs.eiam.model.v20211201.ListApplicationTokensResponse.ApplicationToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationTokensResponseUnmarshaller {

	public static ListApplicationTokensResponse unmarshall(ListApplicationTokensResponse listApplicationTokensResponse, UnmarshallerContext _ctx) {
		
		listApplicationTokensResponse.setRequestId(_ctx.stringValue("ListApplicationTokensResponse.RequestId"));

		List<ApplicationToken> applicationTokens = new ArrayList<ApplicationToken>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationTokensResponse.ApplicationTokens.Length"); i++) {
			ApplicationToken applicationToken = new ApplicationToken();
			applicationToken.setAliUid(_ctx.longValue("ListApplicationTokensResponse.ApplicationTokens["+ i +"].AliUid"));
			applicationToken.setInstanceId(_ctx.stringValue("ListApplicationTokensResponse.ApplicationTokens["+ i +"].InstanceId"));
			applicationToken.setApplicationId(_ctx.stringValue("ListApplicationTokensResponse.ApplicationTokens["+ i +"].ApplicationId"));
			applicationToken.setApplicationTokenId(_ctx.stringValue("ListApplicationTokensResponse.ApplicationTokens["+ i +"].ApplicationTokenId"));
			applicationToken.setApplicationTokenType(_ctx.stringValue("ListApplicationTokensResponse.ApplicationTokens["+ i +"].ApplicationTokenType"));
			applicationToken.setApplicationToken(_ctx.stringValue("ListApplicationTokensResponse.ApplicationTokens["+ i +"].ApplicationToken"));
			applicationToken.setStatus(_ctx.stringValue("ListApplicationTokensResponse.ApplicationTokens["+ i +"].Status"));
			applicationToken.setDescription(_ctx.stringValue("ListApplicationTokensResponse.ApplicationTokens["+ i +"].Description"));
			applicationToken.setExpirationTime(_ctx.longValue("ListApplicationTokensResponse.ApplicationTokens["+ i +"].ExpirationTime"));
			applicationToken.setLastUsedTime(_ctx.longValue("ListApplicationTokensResponse.ApplicationTokens["+ i +"].LastUsedTime"));
			applicationToken.setCreateTime(_ctx.longValue("ListApplicationTokensResponse.ApplicationTokens["+ i +"].CreateTime"));

			applicationTokens.add(applicationToken);
		}
		listApplicationTokensResponse.setApplicationTokens(applicationTokens);
	 
	 	return listApplicationTokensResponse;
	}
}