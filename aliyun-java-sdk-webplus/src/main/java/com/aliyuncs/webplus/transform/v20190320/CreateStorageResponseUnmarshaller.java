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

package com.aliyuncs.webplus.transform.v20190320;

import com.aliyuncs.webplus.model.v20190320.CreateStorageResponse;
import com.aliyuncs.webplus.model.v20190320.CreateStorageResponse.Storage;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStorageResponseUnmarshaller {

	public static CreateStorageResponse unmarshall(CreateStorageResponse createStorageResponse, UnmarshallerContext _ctx) {
		
		createStorageResponse.setRequestId(_ctx.stringValue("CreateStorageResponse.RequestId"));
		createStorageResponse.setCode(_ctx.stringValue("CreateStorageResponse.Code"));
		createStorageResponse.setMessage(_ctx.stringValue("CreateStorageResponse.Message"));

		Storage storage = new Storage();
		storage.setBucketName(_ctx.stringValue("CreateStorageResponse.Storage.BucketName"));
		storage.setCreateTime(_ctx.longValue("CreateStorageResponse.Storage.CreateTime"));
		storage.setUpdateTime(_ctx.longValue("CreateStorageResponse.Storage.UpdateTime"));
		createStorageResponse.setStorage(storage);
	 
	 	return createStorageResponse;
	}
}