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

package com.aliyuncs.workbench_ide.transform.v20210121;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.workbench_ide.model.v20210121.ListPlatformSolutionResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPlatformSolutionResponseUnmarshaller {

	public static ListPlatformSolutionResponse unmarshall(ListPlatformSolutionResponse listPlatformSolutionResponse, UnmarshallerContext _ctx) {
		
		listPlatformSolutionResponse.setRequestId(_ctx.stringValue("ListPlatformSolutionResponse.RequestId"));
		listPlatformSolutionResponse.setMessage(_ctx.stringValue("ListPlatformSolutionResponse.Message"));
		listPlatformSolutionResponse.setCode(_ctx.stringValue("ListPlatformSolutionResponse.Code"));
		listPlatformSolutionResponse.setPageSize(_ctx.integerValue("ListPlatformSolutionResponse.PageSize"));
		listPlatformSolutionResponse.setPage(_ctx.integerValue("ListPlatformSolutionResponse.Page"));
		listPlatformSolutionResponse.setTotal(_ctx.integerValue("ListPlatformSolutionResponse.Total"));
		listPlatformSolutionResponse.setTotalPage(_ctx.integerValue("ListPlatformSolutionResponse.TotalPage"));

		List<Map<Object, Object>> data = _ctx.listMapValue("ListPlatformSolutionResponse.Data");
		listPlatformSolutionResponse.setData(data);
	 
	 	return listPlatformSolutionResponse;
	}
}