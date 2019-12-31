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

package com.aliyuncs.mpserverless.transform.v20190615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpserverless.model.v20190615.ListFunctionSpecResponse;
import com.aliyuncs.mpserverless.model.v20190615.ListFunctionSpecResponse.MemoryListItem;
import com.aliyuncs.mpserverless.model.v20190615.ListFunctionSpecResponse.RuntimeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFunctionSpecResponseUnmarshaller {

	public static ListFunctionSpecResponse unmarshall(ListFunctionSpecResponse listFunctionSpecResponse, UnmarshallerContext _ctx) {
		
		listFunctionSpecResponse.setRequestId(_ctx.stringValue("ListFunctionSpecResponse.RequestId"));
		listFunctionSpecResponse.setHttpStatusCode(_ctx.stringValue("ListFunctionSpecResponse.HttpStatusCode"));
		listFunctionSpecResponse.setSuccess(_ctx.booleanValue("ListFunctionSpecResponse.Success"));
		listFunctionSpecResponse.setCode(_ctx.stringValue("ListFunctionSpecResponse.Code"));
		listFunctionSpecResponse.setMessage(_ctx.stringValue("ListFunctionSpecResponse.Message"));

		List<RuntimeListItem> runtimeList = new ArrayList<RuntimeListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionSpecResponse.RuntimeList.Length"); i++) {
			RuntimeListItem runtimeListItem = new RuntimeListItem();
			runtimeListItem.setName(_ctx.stringValue("ListFunctionSpecResponse.RuntimeList["+ i +"].Name"));

			runtimeList.add(runtimeListItem);
		}
		listFunctionSpecResponse.setRuntimeList(runtimeList);

		List<MemoryListItem> memoryList = new ArrayList<MemoryListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionSpecResponse.MemoryList.Length"); i++) {
			MemoryListItem memoryListItem = new MemoryListItem();
			memoryListItem.setName(_ctx.stringValue("ListFunctionSpecResponse.MemoryList["+ i +"].Name"));

			memoryList.add(memoryListItem);
		}
		listFunctionSpecResponse.setMemoryList(memoryList);
	 
	 	return listFunctionSpecResponse;
	}
}