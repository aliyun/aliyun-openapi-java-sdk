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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.GetSecureTokenResponse;
import com.aliyuncs.edas.model.v20170801.GetSecureTokenResponse.SecureToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecureTokenResponseUnmarshaller {

	public static GetSecureTokenResponse unmarshall(GetSecureTokenResponse getSecureTokenResponse, UnmarshallerContext context) {
		
		getSecureTokenResponse.setRequestId(context.stringValue("GetSecureTokenResponse.RequestId"));
		getSecureTokenResponse.setCode(context.integerValue("GetSecureTokenResponse.Code"));
		getSecureTokenResponse.setMessage(context.stringValue("GetSecureTokenResponse.Message"));

		SecureToken secureToken = new SecureToken();
		secureToken.setId(context.longValue("GetSecureTokenResponse.SecureToken.Id"));
		secureToken.setUserId(context.stringValue("GetSecureTokenResponse.SecureToken.UserId"));
		secureToken.setEdasId(context.stringValue("GetSecureTokenResponse.SecureToken.EdasId"));
		secureToken.setRegionId(context.stringValue("GetSecureTokenResponse.SecureToken.RegionId"));
		secureToken.setRegionName(context.stringValue("GetSecureTokenResponse.SecureToken.RegionName"));
		secureToken.setDescription(context.stringValue("GetSecureTokenResponse.SecureToken.Description"));
		secureToken.setBelongRegion(context.stringValue("GetSecureTokenResponse.SecureToken.BelongRegion"));
		secureToken.setAccessKey(context.stringValue("GetSecureTokenResponse.SecureToken.AccessKey"));
		secureToken.setSecretKey(context.stringValue("GetSecureTokenResponse.SecureToken.SecretKey"));
		secureToken.setTenantId(context.stringValue("GetSecureTokenResponse.SecureToken.TenantId"));
		secureToken.setAddressServerHost(context.stringValue("GetSecureTokenResponse.SecureToken.AddressServerHost"));
		getSecureTokenResponse.setSecureToken(secureToken);
	 
	 	return getSecureTokenResponse;
	}
}