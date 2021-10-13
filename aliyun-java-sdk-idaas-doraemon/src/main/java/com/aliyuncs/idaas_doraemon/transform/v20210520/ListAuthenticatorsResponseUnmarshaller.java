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

import com.aliyuncs.idaas_doraemon.model.v20210520.ListAuthenticatorsResponse;
import com.aliyuncs.idaas_doraemon.model.v20210520.ListAuthenticatorsResponse.AuthenticatorListDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAuthenticatorsResponseUnmarshaller {

	public static ListAuthenticatorsResponse unmarshall(ListAuthenticatorsResponse listAuthenticatorsResponse, UnmarshallerContext _ctx) {
		
		listAuthenticatorsResponse.setRequestId(_ctx.stringValue("ListAuthenticatorsResponse.RequestId"));
		listAuthenticatorsResponse.setPageNumber(_ctx.longValue("ListAuthenticatorsResponse.PageNumber"));
		listAuthenticatorsResponse.setTotalCount(_ctx.longValue("ListAuthenticatorsResponse.TotalCount"));
		listAuthenticatorsResponse.setPageSize(_ctx.longValue("ListAuthenticatorsResponse.PageSize"));

		List<AuthenticatorListDTO> authenticator = new ArrayList<AuthenticatorListDTO>();
		for (int i = 0; i < _ctx.lengthValue("ListAuthenticatorsResponse.Authenticator.Length"); i++) {
			AuthenticatorListDTO authenticatorListDTO = new AuthenticatorListDTO();
			authenticatorListDTO.setApplicationExternalId(_ctx.stringValue("ListAuthenticatorsResponse.Authenticator["+ i +"].ApplicationExternalId"));
			authenticatorListDTO.setAuthenticatorUuid(_ctx.stringValue("ListAuthenticatorsResponse.Authenticator["+ i +"].AuthenticatorUuid"));
			authenticatorListDTO.setCredentialId(_ctx.stringValue("ListAuthenticatorsResponse.Authenticator["+ i +"].CredentialId"));
			authenticatorListDTO.setType(_ctx.stringValue("ListAuthenticatorsResponse.Authenticator["+ i +"].Type"));
			authenticatorListDTO.setAuthenticatorName(_ctx.stringValue("ListAuthenticatorsResponse.Authenticator["+ i +"].AuthenticatorName"));
			authenticatorListDTO.setRegisterTime(_ctx.longValue("ListAuthenticatorsResponse.Authenticator["+ i +"].RegisterTime"));
			authenticatorListDTO.setLastVerifyTime(_ctx.longValue("ListAuthenticatorsResponse.Authenticator["+ i +"].LastVerifyTime"));

			authenticator.add(authenticatorListDTO);
		}
		listAuthenticatorsResponse.setAuthenticator(authenticator);
	 
	 	return listAuthenticatorsResponse;
	}
}