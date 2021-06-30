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

package com.aliyuncs.workbench_inner.transform.v20210121;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.workbench_inner.model.v20210121.InnerListSolutionResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListSolutionResponseUnmarshaller {

	public static InnerListSolutionResponse unmarshall(InnerListSolutionResponse innerListSolutionResponse, UnmarshallerContext _ctx) {
		
		innerListSolutionResponse.setRequestId(_ctx.stringValue("InnerListSolutionResponse.RequestId"));
		innerListSolutionResponse.setCode(_ctx.stringValue("InnerListSolutionResponse.Code"));
		innerListSolutionResponse.setMessage(_ctx.stringValue("InnerListSolutionResponse.Message"));
		innerListSolutionResponse.setPage(_ctx.integerValue("InnerListSolutionResponse.Page"));
		innerListSolutionResponse.setPageSize(_ctx.integerValue("InnerListSolutionResponse.PageSize"));
		innerListSolutionResponse.setTotal(_ctx.integerValue("InnerListSolutionResponse.Total"));
		innerListSolutionResponse.setTotalPage(_ctx.integerValue("InnerListSolutionResponse.TotalPage"));

		List<Map<Object, Object>> data = _ctx.listMapValue("InnerListSolutionResponse.Data");
		innerListSolutionResponse.setData(data);
	 
	 	return innerListSolutionResponse;
	}
}