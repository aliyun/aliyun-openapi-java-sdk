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

import com.aliyuncs.edas.model.v20170801.ListRootStacksResponse;
import com.aliyuncs.edas.model.v20170801.ListRootStacksResponse.Data;
import com.aliyuncs.edas.model.v20170801.ListRootStacksResponse.Data.RootStack;
import com.aliyuncs.edas.model.v20170801.ListRootStacksResponse.Data.RootStack.ChildStack;
import com.aliyuncs.edas.model.v20170801.ListRootStacksResponse.Data.RootStack.Root;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRootStacksResponseUnmarshaller {

	public static ListRootStacksResponse unmarshall(ListRootStacksResponse listRootStacksResponse, UnmarshallerContext _ctx) {
		
		listRootStacksResponse.setRequestId(_ctx.stringValue("ListRootStacksResponse.RequestId"));
		listRootStacksResponse.setMessage(_ctx.stringValue("ListRootStacksResponse.Message"));
		listRootStacksResponse.setCode(_ctx.integerValue("ListRootStacksResponse.Code"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("ListRootStacksResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("ListRootStacksResponse.Data.PageSize"));
		data.setTotalSize(_ctx.integerValue("ListRootStacksResponse.Data.TotalSize"));

		List<RootStack> result = new ArrayList<RootStack>();
		for (int i = 0; i < _ctx.lengthValue("ListRootStacksResponse.Data.Result.Length"); i++) {
			RootStack rootStack = new RootStack();

			Root root = new Root();
			root.setId(_ctx.longValue("ListRootStacksResponse.Data.Result["+ i +"].Root.Id"));
			root.setName(_ctx.stringValue("ListRootStacksResponse.Data.Result["+ i +"].Root.Name"));
			rootStack.setRoot(root);

			List<ChildStack> children = new ArrayList<ChildStack>();
			for (int j = 0; j < _ctx.lengthValue("ListRootStacksResponse.Data.Result["+ i +"].Children.Length"); j++) {
				ChildStack childStack = new ChildStack();
				childStack.setId(_ctx.longValue("ListRootStacksResponse.Data.Result["+ i +"].Children["+ j +"].Id"));
				childStack.setName(_ctx.stringValue("ListRootStacksResponse.Data.Result["+ i +"].Children["+ j +"].Name"));
				childStack.setIcon(_ctx.stringValue("ListRootStacksResponse.Data.Result["+ i +"].Children["+ j +"].Icon"));
				childStack.setComment(_ctx.stringValue("ListRootStacksResponse.Data.Result["+ i +"].Children["+ j +"].Comment"));

				children.add(childStack);
			}
			rootStack.setChildren(children);

			result.add(rootStack);
		}
		data.setResult(result);
		listRootStacksResponse.setData(data);
	 
	 	return listRootStacksResponse;
	}
}