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

import com.aliyuncs.ros.model.v20190910.ListStackGroupOperationResultsResponse;
import com.aliyuncs.ros.model.v20190910.ListStackGroupOperationResultsResponse.StackGroupOperationResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStackGroupOperationResultsResponseUnmarshaller {

	public static ListStackGroupOperationResultsResponse unmarshall(ListStackGroupOperationResultsResponse listStackGroupOperationResultsResponse, UnmarshallerContext _ctx) {
		
		listStackGroupOperationResultsResponse.setRequestId(_ctx.stringValue("ListStackGroupOperationResultsResponse.RequestId"));
		listStackGroupOperationResultsResponse.setPageNumber(_ctx.integerValue("ListStackGroupOperationResultsResponse.PageNumber"));
		listStackGroupOperationResultsResponse.setPageSize(_ctx.integerValue("ListStackGroupOperationResultsResponse.PageSize"));
		listStackGroupOperationResultsResponse.setTotalCount(_ctx.integerValue("ListStackGroupOperationResultsResponse.TotalCount"));

		List<StackGroupOperationResult> stackGroupOperationResults = new ArrayList<StackGroupOperationResult>();
		for (int i = 0; i < _ctx.lengthValue("ListStackGroupOperationResultsResponse.StackGroupOperationResults.Length"); i++) {
			StackGroupOperationResult stackGroupOperationResult = new StackGroupOperationResult();
			stackGroupOperationResult.setAccountId(_ctx.stringValue("ListStackGroupOperationResultsResponse.StackGroupOperationResults["+ i +"].AccountId"));
			stackGroupOperationResult.setRegionId(_ctx.booleanValue("ListStackGroupOperationResultsResponse.StackGroupOperationResults["+ i +"].RegionId"));
			stackGroupOperationResult.setStatus(_ctx.stringValue("ListStackGroupOperationResultsResponse.StackGroupOperationResults["+ i +"].Status"));
			stackGroupOperationResult.setStatusReason(_ctx.stringValue("ListStackGroupOperationResultsResponse.StackGroupOperationResults["+ i +"].StatusReason"));

			stackGroupOperationResults.add(stackGroupOperationResult);
		}
		listStackGroupOperationResultsResponse.setStackGroupOperationResults(stackGroupOperationResults);
	 
	 	return listStackGroupOperationResultsResponse;
	}
}