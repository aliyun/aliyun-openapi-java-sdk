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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.ListStackGroupOperationsResponse;
import com.aliyuncs.ros.model.v20190910.ListStackGroupOperationsResponse.StackGroupOperation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStackGroupOperationsResponseUnmarshaller {

	public static ListStackGroupOperationsResponse unmarshall(ListStackGroupOperationsResponse listStackGroupOperationsResponse, UnmarshallerContext _ctx) {
		
		listStackGroupOperationsResponse.setRequestId(_ctx.stringValue("ListStackGroupOperationsResponse.RequestId"));
		listStackGroupOperationsResponse.setPageNumber(_ctx.integerValue("ListStackGroupOperationsResponse.PageNumber"));
		listStackGroupOperationsResponse.setPageSize(_ctx.integerValue("ListStackGroupOperationsResponse.PageSize"));
		listStackGroupOperationsResponse.setTotalCount(_ctx.integerValue("ListStackGroupOperationsResponse.TotalCount"));

		List<StackGroupOperation> stackGroupOperations = new ArrayList<StackGroupOperation>();
		for (int i = 0; i < _ctx.lengthValue("ListStackGroupOperationsResponse.StackGroupOperations.Length"); i++) {
			StackGroupOperation stackGroupOperation = new StackGroupOperation();
			stackGroupOperation.setStackGroupName(_ctx.stringValue("ListStackGroupOperationsResponse.StackGroupOperations["+ i +"].StackGroupName"));
			stackGroupOperation.setStackGroupId(_ctx.stringValue("ListStackGroupOperationsResponse.StackGroupOperations["+ i +"].StackGroupId"));
			stackGroupOperation.setOperationId(_ctx.stringValue("ListStackGroupOperationsResponse.StackGroupOperations["+ i +"].OperationId"));
			stackGroupOperation.setOperationDescription(_ctx.stringValue("ListStackGroupOperationsResponse.StackGroupOperations["+ i +"].OperationDescription"));
			stackGroupOperation.setCreateTime(_ctx.stringValue("ListStackGroupOperationsResponse.StackGroupOperations["+ i +"].CreateTime"));
			stackGroupOperation.setEndTime(_ctx.stringValue("ListStackGroupOperationsResponse.StackGroupOperations["+ i +"].EndTime"));
			stackGroupOperation.setAction(_ctx.stringValue("ListStackGroupOperationsResponse.StackGroupOperations["+ i +"].Action"));
			stackGroupOperation.setStatus(_ctx.stringValue("ListStackGroupOperationsResponse.StackGroupOperations["+ i +"].Status"));

			stackGroupOperations.add(stackGroupOperation);
		}
		listStackGroupOperationsResponse.setStackGroupOperations(stackGroupOperations);
	 
	 	return listStackGroupOperationsResponse;
	}
}