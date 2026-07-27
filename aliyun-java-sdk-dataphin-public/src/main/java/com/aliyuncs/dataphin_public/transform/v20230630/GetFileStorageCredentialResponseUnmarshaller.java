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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.GetFileStorageCredentialResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetFileStorageCredentialResponse.StorageCredential;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFileStorageCredentialResponseUnmarshaller {

	public static GetFileStorageCredentialResponse unmarshall(GetFileStorageCredentialResponse getFileStorageCredentialResponse, UnmarshallerContext _ctx) {
		
		getFileStorageCredentialResponse.setRequestId(_ctx.stringValue("GetFileStorageCredentialResponse.RequestId"));
		getFileStorageCredentialResponse.setMessage(_ctx.stringValue("GetFileStorageCredentialResponse.Message"));
		getFileStorageCredentialResponse.setHttpStatusCode(_ctx.integerValue("GetFileStorageCredentialResponse.HttpStatusCode"));
		getFileStorageCredentialResponse.setCode(_ctx.stringValue("GetFileStorageCredentialResponse.Code"));
		getFileStorageCredentialResponse.setSuccess(_ctx.booleanValue("GetFileStorageCredentialResponse.Success"));

		StorageCredential storageCredential = new StorageCredential();
		storageCredential.setSecurityToken(_ctx.stringValue("GetFileStorageCredentialResponse.StorageCredential.SecurityToken"));
		storageCredential.setStorageType(_ctx.stringValue("GetFileStorageCredentialResponse.StorageCredential.StorageType"));
		storageCredential.setEndpoint(_ctx.stringValue("GetFileStorageCredentialResponse.StorageCredential.Endpoint"));
		storageCredential.setBucket(_ctx.stringValue("GetFileStorageCredentialResponse.StorageCredential.Bucket"));
		storageCredential.setAccessId(_ctx.stringValue("GetFileStorageCredentialResponse.StorageCredential.AccessId"));
		storageCredential.setExpiration(_ctx.longValue("GetFileStorageCredentialResponse.StorageCredential.Expiration"));
		storageCredential.setRegion(_ctx.stringValue("GetFileStorageCredentialResponse.StorageCredential.Region"));
		storageCredential.setAccessKey(_ctx.stringValue("GetFileStorageCredentialResponse.StorageCredential.AccessKey"));
		storageCredential.setObjectName(_ctx.stringValue("GetFileStorageCredentialResponse.StorageCredential.ObjectName"));
		getFileStorageCredentialResponse.setStorageCredential(storageCredential);
	 
	 	return getFileStorageCredentialResponse;
	}
}