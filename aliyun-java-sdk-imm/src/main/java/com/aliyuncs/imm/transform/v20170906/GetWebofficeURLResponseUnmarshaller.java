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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.GetWebofficeURLResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWebofficeURLResponseUnmarshaller {

	public static GetWebofficeURLResponse unmarshall(GetWebofficeURLResponse getWebofficeURLResponse, UnmarshallerContext _ctx) {
		
		getWebofficeURLResponse.setRequestId(_ctx.stringValue("GetWebofficeURLResponse.RequestId"));
		getWebofficeURLResponse.setWebofficeURL(_ctx.stringValue("GetWebofficeURLResponse.WebofficeURL"));
		getWebofficeURLResponse.setAccessToken(_ctx.stringValue("GetWebofficeURLResponse.AccessToken"));
		getWebofficeURLResponse.setRefreshToken(_ctx.stringValue("GetWebofficeURLResponse.RefreshToken"));
		getWebofficeURLResponse.setAccessTokenExpiredTime(_ctx.stringValue("GetWebofficeURLResponse.AccessTokenExpiredTime"));
		getWebofficeURLResponse.setRefreshTokenExpiredTime(_ctx.stringValue("GetWebofficeURLResponse.RefreshTokenExpiredTime"));
	 
	 	return getWebofficeURLResponse;
	}
}