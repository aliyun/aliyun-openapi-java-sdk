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

import com.aliyuncs.idaas_doraemon.model.v20210520.ListAuthenticatorOpsLogsResponse;
import com.aliyuncs.idaas_doraemon.model.v20210520.ListAuthenticatorOpsLogsResponse.AuthenticationLogContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAuthenticatorOpsLogsResponseUnmarshaller {

	public static ListAuthenticatorOpsLogsResponse unmarshall(ListAuthenticatorOpsLogsResponse listAuthenticatorOpsLogsResponse, UnmarshallerContext _ctx) {
		
		listAuthenticatorOpsLogsResponse.setRequestId(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.RequestId"));
		listAuthenticatorOpsLogsResponse.setTotalCount(_ctx.longValue("ListAuthenticatorOpsLogsResponse.TotalCount"));
		listAuthenticatorOpsLogsResponse.setPageNumber(_ctx.longValue("ListAuthenticatorOpsLogsResponse.PageNumber"));
		listAuthenticatorOpsLogsResponse.setPageSize(_ctx.longValue("ListAuthenticatorOpsLogsResponse.PageSize"));

		List<AuthenticationLogContentItem> authenticationLogContent = new ArrayList<AuthenticationLogContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent.Length"); i++) {
			AuthenticationLogContentItem authenticationLogContentItem = new AuthenticationLogContentItem();
			authenticationLogContentItem.setTenantId(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].TenantId"));
			authenticationLogContentItem.setAliUid(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].AliUid"));
			authenticationLogContentItem.setApplicationUuid(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].ApplicationUuid"));
			authenticationLogContentItem.setApplicationExternalId(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].ApplicationExternalId"));
			authenticationLogContentItem.setUserId(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].UserId"));
			authenticationLogContentItem.setAuthenticatorUuid(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].AuthenticatorUuid"));
			authenticationLogContentItem.setAuthenticatorName(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].AuthenticatorName"));
			authenticationLogContentItem.setCredentialId(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].CredentialId"));
			authenticationLogContentItem.setAuthenticatorType(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].AuthenticatorType"));
			authenticationLogContentItem.setOperationAction(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].OperationAction"));
			authenticationLogContentItem.setChallengeBase64(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].ChallengeBase64"));
			authenticationLogContentItem.setOperationTime(_ctx.longValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].OperationTime"));
			authenticationLogContentItem.setUserAgent(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].UserAgent"));
			authenticationLogContentItem.setUserSourceIp(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].UserSourceIp"));
			authenticationLogContentItem.setRawContext(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].RawContext"));
			authenticationLogContentItem.setOperationResult(_ctx.booleanValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].OperationResult"));
			authenticationLogContentItem.setErrorCode(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].ErrorCode"));
			authenticationLogContentItem.setErrorMessage(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].ErrorMessage"));
			authenticationLogContentItem.setLogParams(_ctx.stringValue("ListAuthenticatorOpsLogsResponse.AuthenticationLogContent["+ i +"].LogParams"));

			authenticationLogContent.add(authenticationLogContentItem);
		}
		listAuthenticatorOpsLogsResponse.setAuthenticationLogContent(authenticationLogContent);
	 
	 	return listAuthenticatorOpsLogsResponse;
	}
}