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

import com.aliyuncs.edas.model.v20170801.GetPackageStorageCredentialResponse;
import com.aliyuncs.edas.model.v20170801.GetPackageStorageCredentialResponse.Credential;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPackageStorageCredentialResponseUnmarshaller {

	public static GetPackageStorageCredentialResponse unmarshall(GetPackageStorageCredentialResponse getPackageStorageCredentialResponse, UnmarshallerContext _ctx) {
		
		getPackageStorageCredentialResponse.setRequestId(_ctx.stringValue("GetPackageStorageCredentialResponse.RequestId"));
		getPackageStorageCredentialResponse.setCode(_ctx.integerValue("GetPackageStorageCredentialResponse.Code"));
		getPackageStorageCredentialResponse.setMessage(_ctx.stringValue("GetPackageStorageCredentialResponse.Message"));

		Credential credential = new Credential();
		credential.setAccessKeyId(_ctx.stringValue("GetPackageStorageCredentialResponse.Credential.AccessKeyId"));
		credential.setAccessKeySecret(_ctx.stringValue("GetPackageStorageCredentialResponse.Credential.AccessKeySecret"));
		credential.setBucket(_ctx.stringValue("GetPackageStorageCredentialResponse.Credential.Bucket"));
		credential.setExpiration(_ctx.stringValue("GetPackageStorageCredentialResponse.Credential.Expiration"));
		credential.setKeyPrefix(_ctx.stringValue("GetPackageStorageCredentialResponse.Credential.KeyPrefix"));
		credential.setRegionId(_ctx.stringValue("GetPackageStorageCredentialResponse.Credential.RegionId"));
		credential.setSecurityToken(_ctx.stringValue("GetPackageStorageCredentialResponse.Credential.SecurityToken"));
		getPackageStorageCredentialResponse.setCredential(credential);
	 
	 	return getPackageStorageCredentialResponse;
	}
}