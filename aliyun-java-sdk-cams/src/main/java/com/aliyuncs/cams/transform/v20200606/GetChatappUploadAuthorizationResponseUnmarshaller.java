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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.GetChatappUploadAuthorizationResponse;
import com.aliyuncs.cams.model.v20200606.GetChatappUploadAuthorizationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChatappUploadAuthorizationResponseUnmarshaller {

	public static GetChatappUploadAuthorizationResponse unmarshall(GetChatappUploadAuthorizationResponse getChatappUploadAuthorizationResponse, UnmarshallerContext _ctx) {
		
		getChatappUploadAuthorizationResponse.setRequestId(_ctx.stringValue("GetChatappUploadAuthorizationResponse.RequestId"));
		getChatappUploadAuthorizationResponse.setCode(_ctx.stringValue("GetChatappUploadAuthorizationResponse.Code"));
		getChatappUploadAuthorizationResponse.setMessage(_ctx.stringValue("GetChatappUploadAuthorizationResponse.Message"));
		getChatappUploadAuthorizationResponse.setAccessDeniedDetail(_ctx.stringValue("GetChatappUploadAuthorizationResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setAccessKeyId(_ctx.stringValue("GetChatappUploadAuthorizationResponse.Data.AccessKeyId"));
		data.setAccessKeySecret(_ctx.stringValue("GetChatappUploadAuthorizationResponse.Data.AccessKeySecret"));
		data.setBucketName(_ctx.stringValue("GetChatappUploadAuthorizationResponse.Data.BucketName"));
		data.setDir(_ctx.stringValue("GetChatappUploadAuthorizationResponse.Data.Dir"));
		data.setEndPoint(_ctx.stringValue("GetChatappUploadAuthorizationResponse.Data.EndPoint"));
		data.setSecurityToken(_ctx.stringValue("GetChatappUploadAuthorizationResponse.Data.SecurityToken"));
		data.setExpire(_ctx.integerValue("GetChatappUploadAuthorizationResponse.Data.Expire"));
		getChatappUploadAuthorizationResponse.setData(data);
	 
	 	return getChatappUploadAuthorizationResponse;
	}
}