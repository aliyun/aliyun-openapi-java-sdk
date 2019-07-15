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

package com.aliyuncs.aas.transform.v20150701;

import com.aliyuncs.aas.model.v20150701.CreateAccessKeyForAccountResponse;
import com.aliyuncs.aas.model.v20150701.CreateAccessKeyForAccountResponse.AccessKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAccessKeyForAccountResponseUnmarshaller {

	public static CreateAccessKeyForAccountResponse unmarshall(CreateAccessKeyForAccountResponse createAccessKeyForAccountResponse, UnmarshallerContext _ctx) {
		
		createAccessKeyForAccountResponse.setRequestId(_ctx.stringValue("CreateAccessKeyForAccountResponse.RequestId"));
		createAccessKeyForAccountResponse.setPK(_ctx.stringValue("CreateAccessKeyForAccountResponse.PK"));

		AccessKey accessKey = new AccessKey();
		accessKey.setCreateTime(_ctx.stringValue("CreateAccessKeyForAccountResponse.AccessKey.CreateTime"));
		accessKey.setAccessKeyId(_ctx.stringValue("CreateAccessKeyForAccountResponse.AccessKey.AccessKeyId"));
		accessKey.setAccessKeySecret(_ctx.stringValue("CreateAccessKeyForAccountResponse.AccessKey.AccessKeySecret"));
		accessKey.setAccessKeyStatus(_ctx.stringValue("CreateAccessKeyForAccountResponse.AccessKey.AccessKeyStatus"));
		accessKey.setAccessKeyType(_ctx.stringValue("CreateAccessKeyForAccountResponse.AccessKey.AccessKeyType"));
		createAccessKeyForAccountResponse.setAccessKey(accessKey);
	 
	 	return createAccessKeyForAccountResponse;
	}
}