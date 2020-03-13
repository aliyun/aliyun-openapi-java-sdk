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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetAKSAcrTempAccountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAKSAcrTempAccountResponseUnmarshaller {

	public static GetAKSAcrTempAccountResponse unmarshall(GetAKSAcrTempAccountResponse getAKSAcrTempAccountResponse, UnmarshallerContext _ctx) {
		
		getAKSAcrTempAccountResponse.setRequestId(_ctx.stringValue("GetAKSAcrTempAccountResponse.RequestId"));
		getAKSAcrTempAccountResponse.setResultCode(_ctx.stringValue("GetAKSAcrTempAccountResponse.ResultCode"));
		getAKSAcrTempAccountResponse.setResultMessage(_ctx.stringValue("GetAKSAcrTempAccountResponse.ResultMessage"));
		getAKSAcrTempAccountResponse.setAuthorizationToken(_ctx.stringValue("GetAKSAcrTempAccountResponse.AuthorizationToken"));
		getAKSAcrTempAccountResponse.setExpireDate(_ctx.longValue("GetAKSAcrTempAccountResponse.ExpireDate"));
		getAKSAcrTempAccountResponse.setTempUserName(_ctx.stringValue("GetAKSAcrTempAccountResponse.TempUserName"));
	 
	 	return getAKSAcrTempAccountResponse;
	}
}