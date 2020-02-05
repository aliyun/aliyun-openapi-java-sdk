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

import com.aliyuncs.imm.model.v20170906.RefreshOfficePreviewTokenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RefreshOfficePreviewTokenResponseUnmarshaller {

	public static RefreshOfficePreviewTokenResponse unmarshall(RefreshOfficePreviewTokenResponse refreshOfficePreviewTokenResponse, UnmarshallerContext _ctx) {
		
		refreshOfficePreviewTokenResponse.setRequestId(_ctx.stringValue("RefreshOfficePreviewTokenResponse.RequestId"));
		refreshOfficePreviewTokenResponse.setAccessToken(_ctx.stringValue("RefreshOfficePreviewTokenResponse.AccessToken"));
		refreshOfficePreviewTokenResponse.setAccessTokenExpiredTime(_ctx.stringValue("RefreshOfficePreviewTokenResponse.AccessTokenExpiredTime"));
		refreshOfficePreviewTokenResponse.setRefreshToken(_ctx.stringValue("RefreshOfficePreviewTokenResponse.RefreshToken"));
		refreshOfficePreviewTokenResponse.setRefreshTokenExpiredTime(_ctx.stringValue("RefreshOfficePreviewTokenResponse.RefreshTokenExpiredTime"));
	 
	 	return refreshOfficePreviewTokenResponse;
	}
}