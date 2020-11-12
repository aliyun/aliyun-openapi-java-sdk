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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.DecodeStsTokenResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.DecodeStsTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DecodeStsTokenResponseUnmarshaller {

	public static DecodeStsTokenResponse unmarshall(DecodeStsTokenResponse decodeStsTokenResponse, UnmarshallerContext _ctx) {
		
		decodeStsTokenResponse.setRequestId(_ctx.stringValue("DecodeStsTokenResponse.RequestId"));
		decodeStsTokenResponse.setRegionId(_ctx.stringValue("DecodeStsTokenResponse.RegionId"));

		Data data = new Data();
		data.setAccountUid(_ctx.longValue("DecodeStsTokenResponse.Data.AccountUid"));
		data.setAccountBid(_ctx.longValue("DecodeStsTokenResponse.Data.AccountBid"));
		data.setGrantorId(_ctx.longValue("DecodeStsTokenResponse.Data.GrantorId"));
		data.setTokenPrincipalId(_ctx.stringValue("DecodeStsTokenResponse.Data.TokenPrincipalId"));
		data.setTokenPrincipalName(_ctx.stringValue("DecodeStsTokenResponse.Data.TokenPrincipalName"));
		data.setMfaAuthenticated(_ctx.booleanValue("DecodeStsTokenResponse.Data.MfaAuthenticated"));
		data.setRoleId(_ctx.longValue("DecodeStsTokenResponse.Data.RoleId"));
		data.setAkProxy(_ctx.stringValue("DecodeStsTokenResponse.Data.AkProxy"));
		data.setProxyTrustTransportInfo(_ctx.booleanValue("DecodeStsTokenResponse.Data.ProxyTrustTransportInfo"));
		data.setPolicy(_ctx.stringValue("DecodeStsTokenResponse.Data.Policy"));
		data.setRoleName(_ctx.stringValue("DecodeStsTokenResponse.Data.RoleName"));
		data.setPlayerUid(_ctx.stringValue("DecodeStsTokenResponse.Data.PlayerUid"));
		data.setExpireDate(_ctx.longValue("DecodeStsTokenResponse.Data.ExpireDate"));
		data.setTokenType(_ctx.stringValue("DecodeStsTokenResponse.Data.TokenType"));
		decodeStsTokenResponse.setData(data);
	 
	 	return decodeStsTokenResponse;
	}
}