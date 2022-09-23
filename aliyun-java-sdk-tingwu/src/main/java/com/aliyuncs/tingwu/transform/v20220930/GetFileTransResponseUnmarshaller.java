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

import com.aliyuncs.tingwu.model.v20220930.GetFileTransResponse;
import com.aliyuncs.tingwu.model.v20220930.GetFileTransResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFileTransResponseUnmarshaller {

	public static GetFileTransResponse unmarshall(GetFileTransResponse getFileTransResponse, UnmarshallerContext _ctx) {
		
		getFileTransResponse.setRequestId(_ctx.stringValue("GetFileTransResponse.RequestId"));
		getFileTransResponse.setCode(_ctx.stringValue("GetFileTransResponse.Code"));
		getFileTransResponse.setMessage(_ctx.stringValue("GetFileTransResponse.Message"));

		Data data = new Data();
		data.setTransId(_ctx.stringValue("GetFileTransResponse.Data.TransId"));
		data.setTransStatus(_ctx.stringValue("GetFileTransResponse.Data.TransStatus"));
		data.setTransKey(_ctx.stringValue("GetFileTransResponse.Data.TransKey"));
		getFileTransResponse.setData(data);
	 
	 	return getFileTransResponse;
	}
}