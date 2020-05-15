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

import com.aliyuncs.imm.model.v20170906.GetOfficeEditURLResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOfficeEditURLResponseUnmarshaller {

	public static GetOfficeEditURLResponse unmarshall(GetOfficeEditURLResponse getOfficeEditURLResponse, UnmarshallerContext _ctx) {
		
		getOfficeEditURLResponse.setRequestId(_ctx.stringValue("GetOfficeEditURLResponse.RequestId"));
		getOfficeEditURLResponse.setEditURL(_ctx.stringValue("GetOfficeEditURLResponse.EditURL"));
		getOfficeEditURLResponse.setAccessToken(_ctx.stringValue("GetOfficeEditURLResponse.AccessToken"));
		getOfficeEditURLResponse.setRefreshToken(_ctx.stringValue("GetOfficeEditURLResponse.RefreshToken"));
		getOfficeEditURLResponse.setAccessTokenExpiredTime(_ctx.stringValue("GetOfficeEditURLResponse.AccessTokenExpiredTime"));
		getOfficeEditURLResponse.setRefreshTokenExpiredTime(_ctx.stringValue("GetOfficeEditURLResponse.RefreshTokenExpiredTime"));
	 
	 	return getOfficeEditURLResponse;
	}
}