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

import com.aliyuncs.webplus.model.v20190320.DescribeStorageResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeStorageResponse.Storage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStorageResponseUnmarshaller {

	public static DescribeStorageResponse unmarshall(DescribeStorageResponse describeStorageResponse, UnmarshallerContext _ctx) {
		
		describeStorageResponse.setRequestId(_ctx.stringValue("DescribeStorageResponse.RequestId"));
		describeStorageResponse.setCode(_ctx.stringValue("DescribeStorageResponse.Code"));
		describeStorageResponse.setMessage(_ctx.stringValue("DescribeStorageResponse.Message"));

		Storage storage = new Storage();
		storage.setBucketName(_ctx.stringValue("DescribeStorageResponse.Storage.BucketName"));
		storage.setCreateTime(_ctx.longValue("DescribeStorageResponse.Storage.CreateTime"));
		storage.setUpdateTime(_ctx.longValue("DescribeStorageResponse.Storage.UpdateTime"));
		describeStorageResponse.setStorage(storage);
	 
	 	return describeStorageResponse;
	}
}