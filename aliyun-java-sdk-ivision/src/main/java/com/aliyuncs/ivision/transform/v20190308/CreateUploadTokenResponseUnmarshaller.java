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

package com.aliyuncs.ivision.transform.v20190308;

import com.aliyuncs.ivision.model.v20190308.CreateUploadTokenResponse;
import com.aliyuncs.ivision.model.v20190308.CreateUploadTokenResponse.UploadToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUploadTokenResponseUnmarshaller {

	public static CreateUploadTokenResponse unmarshall(CreateUploadTokenResponse createUploadTokenResponse, UnmarshallerContext context) {
		
		createUploadTokenResponse.setRequestId(context.stringValue("CreateUploadTokenResponse.RequestId"));

		UploadToken uploadToken = new UploadToken();
		uploadToken.setAccessKeyId(context.stringValue("CreateUploadTokenResponse.UploadToken.AccessKeyId"));
		uploadToken.setAccessKeySecret(context.stringValue("CreateUploadTokenResponse.UploadToken.AccessKeySecret"));
		uploadToken.setSecurityToken(context.stringValue("CreateUploadTokenResponse.UploadToken.SecurityToken"));
		uploadToken.setExpiration(context.stringValue("CreateUploadTokenResponse.UploadToken.Expiration"));
		uploadToken.setBucket(context.stringValue("CreateUploadTokenResponse.UploadToken.Bucket"));
		uploadToken.setObject(context.stringValue("CreateUploadTokenResponse.UploadToken.Object"));
		uploadToken.setEndpoint(context.stringValue("CreateUploadTokenResponse.UploadToken.Endpoint"));
		uploadToken.setUrl(context.stringValue("CreateUploadTokenResponse.UploadToken.Url"));
		createUploadTokenResponse.setUploadToken(uploadToken);
	 
	 	return createUploadTokenResponse;
	}
}