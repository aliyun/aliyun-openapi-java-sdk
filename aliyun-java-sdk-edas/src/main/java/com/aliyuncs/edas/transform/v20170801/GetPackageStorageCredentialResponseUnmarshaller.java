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

	public static GetPackageStorageCredentialResponse unmarshall(GetPackageStorageCredentialResponse getPackageStorageCredentialResponse, UnmarshallerContext context) {
		
		getPackageStorageCredentialResponse.setRequestId(context.stringValue("GetPackageStorageCredentialResponse.RequestId"));
		getPackageStorageCredentialResponse.setCode(context.integerValue("GetPackageStorageCredentialResponse.Code"));
		getPackageStorageCredentialResponse.setMessage(context.stringValue("GetPackageStorageCredentialResponse.Message"));

		Credential credential = new Credential();
		credential.setAccessKeyId(context.stringValue("GetPackageStorageCredentialResponse.Credential.AccessKeyId"));
		credential.setAccessKeySecret(context.stringValue("GetPackageStorageCredentialResponse.Credential.AccessKeySecret"));
		credential.setBucket(context.stringValue("GetPackageStorageCredentialResponse.Credential.Bucket"));
		credential.setExpiration(context.stringValue("GetPackageStorageCredentialResponse.Credential.Expiration"));
		credential.setKeyPrefix(context.stringValue("GetPackageStorageCredentialResponse.Credential.KeyPrefix"));
		credential.setRegionId(context.stringValue("GetPackageStorageCredentialResponse.Credential.RegionId"));
		credential.setSecurityToken(context.stringValue("GetPackageStorageCredentialResponse.Credential.SecurityToken"));
		getPackageStorageCredentialResponse.setCredential(credential);
	 
	 	return getPackageStorageCredentialResponse;
	}
}