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

package com.aliyuncs.ims.transform.v20190815;

import com.aliyuncs.ims.model.v20190815.CreateAccessKeyResponse;
import com.aliyuncs.ims.model.v20190815.CreateAccessKeyResponse.AccessKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAccessKeyResponseUnmarshaller {

	public static CreateAccessKeyResponse unmarshall(CreateAccessKeyResponse createAccessKeyResponse, UnmarshallerContext _ctx) {
		
		createAccessKeyResponse.setRequestId(_ctx.stringValue("CreateAccessKeyResponse.RequestId"));

		AccessKey accessKey = new AccessKey();
		accessKey.setStatus(_ctx.stringValue("CreateAccessKeyResponse.AccessKey.Status"));
		accessKey.setAccessKeySecret(_ctx.stringValue("CreateAccessKeyResponse.AccessKey.AccessKeySecret"));
		accessKey.setAccessKeyId(_ctx.stringValue("CreateAccessKeyResponse.AccessKey.AccessKeyId"));
		accessKey.setCreateDate(_ctx.stringValue("CreateAccessKeyResponse.AccessKey.CreateDate"));
		createAccessKeyResponse.setAccessKey(accessKey);
	 
	 	return createAccessKeyResponse;
	}
}