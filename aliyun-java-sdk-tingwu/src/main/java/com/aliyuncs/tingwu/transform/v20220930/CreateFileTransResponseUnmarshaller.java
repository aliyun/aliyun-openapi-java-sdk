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

package com.aliyuncs.tingwu.transform.v20220930;

import com.aliyuncs.tingwu.model.v20220930.CreateFileTransResponse;
import com.aliyuncs.tingwu.model.v20220930.CreateFileTransResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFileTransResponseUnmarshaller {

	public static CreateFileTransResponse unmarshall(CreateFileTransResponse createFileTransResponse, UnmarshallerContext _ctx) {
		
		createFileTransResponse.setRequestId(_ctx.stringValue("CreateFileTransResponse.RequestId"));
		createFileTransResponse.setCode(_ctx.stringValue("CreateFileTransResponse.Code"));
		createFileTransResponse.setMessage(_ctx.stringValue("CreateFileTransResponse.Message"));

		Data data = new Data();
		data.setTransId(_ctx.stringValue("CreateFileTransResponse.Data.TransId"));
		data.setTransKey(_ctx.stringValue("CreateFileTransResponse.Data.TransKey"));
		createFileTransResponse.setData(data);
	 
	 	return createFileTransResponse;
	}
}