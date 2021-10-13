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

package com.aliyuncs.idaas_doraemon.transform.v20210520;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idaas_doraemon.model.v20210520.ListAuthenticationLogsResponse;
import com.aliyuncs.idaas_doraemon.model.v20210520.ListAuthenticationLogsResponse.AuthenticationLogContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAuthenticationLogsResponseUnmarshaller {

	public static ListAuthenticationLogsResponse unmarshall(ListAuthenticationLogsResponse listAuthenticationLogsResponse, UnmarshallerContext _ctx) {
		
		listAuthenticationLogsResponse.setRequestId(_ctx.stringValue("ListAuthenticationLogsResponse.RequestId"));
		listAuthenticationLogsResponse.setTotalCount(_ctx.longValue("ListAuthenticationLogsResponse.TotalCount"));
		listAuthenticationLogsResponse.setPageNumber(_ctx.longValue("ListAuthenticationLogsResponse.PageNumber"));
		listAuthenticationLogsResponse.setPageSize(_ctx.longValue("ListAuthenticationLogsResponse.PageSize"));

		List<AuthenticationLogContentItem> authenticationLogContent = new ArrayList<AuthenticationLogContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAuthenticationLogsResponse.AuthenticationLogContent.Length"); i++) {
			AuthenticationLogContentItem authenticationLogContentItem = new AuthenticationLogContentItem();
			authenticationLogContentItem.setTenantId(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].TenantId"));
			authenticationLogContentItem.setAliUid(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].AliUid"));
			authenticationLogContentItem.setApplicationUuid(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].ApplicationUuid"));
			authenticationLogContentItem.setApplicationExternalId(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].ApplicationExternalId"));
			authenticationLogContentItem.setUserId(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].UserId"));
			authenticationLogContentItem.setAuthenticatorUuid(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].AuthenticatorUuid"));
			authenticationLogContentItem.setAuthenticatorName(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].AuthenticatorName"));
			authenticationLogContentItem.setCredentialId(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].CredentialId"));
			authenticationLogContentItem.setAuthenticatorType(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].AuthenticatorType"));
			authenticationLogContentItem.setAuthenticationAction(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].AuthenticationAction"));
			authenticationLogContentItem.setChallengeBase64(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].ChallengeBase64"));
			authenticationLogContentItem.setAuthenticationTime(_ctx.longValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].AuthenticationTime"));
			authenticationLogContentItem.setUserAgent(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].UserAgent"));
			authenticationLogContentItem.setUserSourceIp(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].UserSourceIp"));
			authenticationLogContentItem.setRawAuthenticationContext(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].RawAuthenticationContext"));
			authenticationLogContentItem.setVerifyResult(_ctx.booleanValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].VerifyResult"));
			authenticationLogContentItem.setErrorCode(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].ErrorCode"));
			authenticationLogContentItem.setErrorMessage(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].ErrorMessage"));
			authenticationLogContentItem.setLogTag(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].LogTag"));
			authenticationLogContentItem.setLogParams(_ctx.stringValue("ListAuthenticationLogsResponse.AuthenticationLogContent["+ i +"].LogParams"));

			authenticationLogContent.add(authenticationLogContentItem);
		}
		listAuthenticationLogsResponse.setAuthenticationLogContent(authenticationLogContent);
	 
	 	return listAuthenticationLogsResponse;
	}
}