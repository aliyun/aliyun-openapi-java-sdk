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

package com.aliyuncs.mseap.transform.v20210118;

import com.aliyuncs.mseap.model.v20210118.GetPlatformUserInfoForPartnerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPlatformUserInfoForPartnerResponseUnmarshaller {

	public static GetPlatformUserInfoForPartnerResponse unmarshall(GetPlatformUserInfoForPartnerResponse getPlatformUserInfoForPartnerResponse, UnmarshallerContext _ctx) {
		
		getPlatformUserInfoForPartnerResponse.setRequestId(_ctx.stringValue("GetPlatformUserInfoForPartnerResponse.RequestId"));
		getPlatformUserInfoForPartnerResponse.setErrorMsg(_ctx.stringValue("GetPlatformUserInfoForPartnerResponse.ErrorMsg"));
		getPlatformUserInfoForPartnerResponse.setSuccess(_ctx.booleanValue("GetPlatformUserInfoForPartnerResponse.Success"));
		getPlatformUserInfoForPartnerResponse.setEncryptedOpenId(_ctx.stringValue("GetPlatformUserInfoForPartnerResponse.EncryptedOpenId"));
		getPlatformUserInfoForPartnerResponse.setEncryptedUnionId(_ctx.stringValue("GetPlatformUserInfoForPartnerResponse.EncryptedUnionId"));
	 
	 	return getPlatformUserInfoForPartnerResponse;
	}
}