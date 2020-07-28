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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListChildrenStacksResponse;
import com.aliyuncs.edas.model.v20170801.ListChildrenStacksResponse.Data;
import com.aliyuncs.edas.model.v20170801.ListChildrenStacksResponse.Data.Stack;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListChildrenStacksResponseUnmarshaller {

	public static ListChildrenStacksResponse unmarshall(ListChildrenStacksResponse listChildrenStacksResponse, UnmarshallerContext _ctx) {
		
		listChildrenStacksResponse.setRequestId(_ctx.stringValue("ListChildrenStacksResponse.RequestId"));
		listChildrenStacksResponse.setCode(_ctx.integerValue("ListChildrenStacksResponse.Code"));
		listChildrenStacksResponse.setMessage(_ctx.stringValue("ListChildrenStacksResponse.Message"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("ListChildrenStacksResponse.Data.PageSize"));
		data.setTotalSize(_ctx.integerValue("ListChildrenStacksResponse.Data.TotalSize"));
		data.setCurrentPage(_ctx.integerValue("ListChildrenStacksResponse.Data.CurrentPage"));

		List<Stack> result = new ArrayList<Stack>();
		for (int i = 0; i < _ctx.lengthValue("ListChildrenStacksResponse.Data.Result.Length"); i++) {
			Stack stack = new Stack();
			stack.setId(_ctx.longValue("ListChildrenStacksResponse.Data.Result["+ i +"].Id"));
			stack.setName(_ctx.stringValue("ListChildrenStacksResponse.Data.Result["+ i +"].Name"));
			stack.setComment(_ctx.stringValue("ListChildrenStacksResponse.Data.Result["+ i +"].Comment"));
			stack.setPreferred(_ctx.booleanValue("ListChildrenStacksResponse.Data.Result["+ i +"].Preferred"));
			stack.setLatest(_ctx.booleanValue("ListChildrenStacksResponse.Data.Result["+ i +"].Latest"));

			List<String> buildTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListChildrenStacksResponse.Data.Result["+ i +"].BuildTypes.Length"); j++) {
				buildTypes.add(_ctx.stringValue("ListChildrenStacksResponse.Data.Result["+ i +"].BuildTypes["+ j +"]"));
			}
			stack.setBuildTypes(buildTypes);

			result.add(stack);
		}
		data.setResult(result);
		listChildrenStacksResponse.setData(data);
	 
	 	return listChildrenStacksResponse;
	}
}