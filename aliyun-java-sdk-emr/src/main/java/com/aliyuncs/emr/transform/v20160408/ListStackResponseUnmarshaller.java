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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListStackResponse;
import com.aliyuncs.emr.model.v20160408.ListStackResponse.Stack;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStackResponseUnmarshaller {

	public static ListStackResponse unmarshall(ListStackResponse listStackResponse, UnmarshallerContext _ctx) {
		
		listStackResponse.setRequestId(_ctx.stringValue("ListStackResponse.RequestId"));
		listStackResponse.setPageNumber(_ctx.integerValue("ListStackResponse.PageNumber"));
		listStackResponse.setPageSize(_ctx.integerValue("ListStackResponse.PageSize"));
		listStackResponse.setTotalCount(_ctx.integerValue("ListStackResponse.TotalCount"));

		List<Stack> stackList = new ArrayList<Stack>();
		for (int i = 0; i < _ctx.lengthValue("ListStackResponse.StackList.Length"); i++) {
			Stack stack = new Stack();
			stack.setName(_ctx.stringValue("ListStackResponse.StackList["+ i +"].Name"));
			stack.setVersion(_ctx.stringValue("ListStackResponse.StackList["+ i +"].Version"));
			stack.setStatus(_ctx.stringValue("ListStackResponse.StackList["+ i +"].Status"));

			stackList.add(stack);
		}
		listStackResponse.setStackList(stackList);
	 
	 	return listStackResponse;
	}
}