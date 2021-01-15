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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.GetVaultCredentialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVaultCredentialResponseUnmarshaller {

	public static GetVaultCredentialResponse unmarshall(GetVaultCredentialResponse getVaultCredentialResponse, UnmarshallerContext _ctx) {
		
		getVaultCredentialResponse.setRequestId(_ctx.stringValue("GetVaultCredentialResponse.RequestId"));
		getVaultCredentialResponse.setSuccess(_ctx.booleanValue("GetVaultCredentialResponse.Success"));
		getVaultCredentialResponse.setCode(_ctx.stringValue("GetVaultCredentialResponse.Code"));
		getVaultCredentialResponse.setMessage(_ctx.stringValue("GetVaultCredentialResponse.Message"));
		getVaultCredentialResponse.setAccessKeyId(_ctx.stringValue("GetVaultCredentialResponse.AccessKeyId"));
		getVaultCredentialResponse.setAccessKeySecret(_ctx.stringValue("GetVaultCredentialResponse.AccessKeySecret"));
		getVaultCredentialResponse.setSecurityToken(_ctx.stringValue("GetVaultCredentialResponse.SecurityToken"));
		getVaultCredentialResponse.setExpiration(_ctx.stringValue("GetVaultCredentialResponse.Expiration"));
	 
	 	return getVaultCredentialResponse;
	}
}