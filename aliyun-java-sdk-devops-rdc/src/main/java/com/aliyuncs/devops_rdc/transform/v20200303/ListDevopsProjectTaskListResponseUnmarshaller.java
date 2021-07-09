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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectTaskListResponse;
import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectTaskListResponse.Object;
import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectTaskListResponse.Object.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevopsProjectTaskListResponseUnmarshaller {

	public static ListDevopsProjectTaskListResponse unmarshall(ListDevopsProjectTaskListResponse listDevopsProjectTaskListResponse, UnmarshallerContext _ctx) {
		
		listDevopsProjectTaskListResponse.setRequestId(_ctx.stringValue("ListDevopsProjectTaskListResponse.RequestId"));
		listDevopsProjectTaskListResponse.setErrorMsg(_ctx.stringValue("ListDevopsProjectTaskListResponse.ErrorMsg"));
		listDevopsProjectTaskListResponse.setSuccessful(_ctx.booleanValue("ListDevopsProjectTaskListResponse.Successful"));
		listDevopsProjectTaskListResponse.setErrorCode(_ctx.stringValue("ListDevopsProjectTaskListResponse.ErrorCode"));

		Object object = new Object();

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDevopsProjectTaskListResponse.Object.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.stringValue("ListDevopsProjectTaskListResponse.Object.Result["+ i +"].Id"));

			result.add(resultItem);
		}
		object.setResult(result);
		listDevopsProjectTaskListResponse.setObject(object);
	 
	 	return listDevopsProjectTaskListResponse;
	}
}