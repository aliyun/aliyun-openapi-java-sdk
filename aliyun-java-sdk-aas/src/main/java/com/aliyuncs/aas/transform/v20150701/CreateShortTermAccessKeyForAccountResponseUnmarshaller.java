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

import com.aliyuncs.aas.model.v20150701.CreateShortTermAccessKeyForAccountResponse;
import com.aliyuncs.aas.model.v20150701.CreateShortTermAccessKeyForAccountResponse.AccessKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateShortTermAccessKeyForAccountResponseUnmarshaller {

	public static CreateShortTermAccessKeyForAccountResponse unmarshall(CreateShortTermAccessKeyForAccountResponse createShortTermAccessKeyForAccountResponse, UnmarshallerContext _ctx) {
		
		createShortTermAccessKeyForAccountResponse.setRequestId(_ctx.stringValue("CreateShortTermAccessKeyForAccountResponse.RequestId"));
		createShortTermAccessKeyForAccountResponse.setPK(_ctx.stringValue("CreateShortTermAccessKeyForAccountResponse.PK"));

		AccessKey accessKey = new AccessKey();
		accessKey.setCreateTime(_ctx.stringValue("CreateShortTermAccessKeyForAccountResponse.AccessKey.CreateTime"));
		accessKey.setAccessKeyId(_ctx.stringValue("CreateShortTermAccessKeyForAccountResponse.AccessKey.AccessKeyId"));
		accessKey.setAccessKeySecret(_ctx.stringValue("CreateShortTermAccessKeyForAccountResponse.AccessKey.AccessKeySecret"));
		accessKey.setAccessKeyStatus(_ctx.stringValue("CreateShortTermAccessKeyForAccountResponse.AccessKey.AccessKeyStatus"));
		accessKey.setAccessKeyType(_ctx.stringValue("CreateShortTermAccessKeyForAccountResponse.AccessKey.AccessKeyType"));
		accessKey.setExpireTime(_ctx.stringValue("CreateShortTermAccessKeyForAccountResponse.AccessKey.ExpireTime"));
		createShortTermAccessKeyForAccountResponse.setAccessKey(accessKey);
	 
	 	return createShortTermAccessKeyForAccountResponse;
	}
}