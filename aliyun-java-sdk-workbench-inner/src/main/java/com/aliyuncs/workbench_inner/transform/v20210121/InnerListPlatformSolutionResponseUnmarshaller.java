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

import com.aliyuncs.workbench_inner.model.v20210121.InnerListPlatformSolutionResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListPlatformSolutionResponseUnmarshaller {

	public static InnerListPlatformSolutionResponse unmarshall(InnerListPlatformSolutionResponse innerListPlatformSolutionResponse, UnmarshallerContext _ctx) {
		
		innerListPlatformSolutionResponse.setRequestId(_ctx.stringValue("InnerListPlatformSolutionResponse.RequestId"));
		innerListPlatformSolutionResponse.setCode(_ctx.stringValue("InnerListPlatformSolutionResponse.Code"));
		innerListPlatformSolutionResponse.setMessage(_ctx.stringValue("InnerListPlatformSolutionResponse.Message"));
		innerListPlatformSolutionResponse.setPage(_ctx.integerValue("InnerListPlatformSolutionResponse.Page"));
		innerListPlatformSolutionResponse.setPageSize(_ctx.integerValue("InnerListPlatformSolutionResponse.PageSize"));
		innerListPlatformSolutionResponse.setTotal(_ctx.integerValue("InnerListPlatformSolutionResponse.Total"));
		innerListPlatformSolutionResponse.setTotalPage(_ctx.integerValue("InnerListPlatformSolutionResponse.TotalPage"));

		List<Map<Object, Object>> data = _ctx.listMapValue("InnerListPlatformSolutionResponse.Data");
		innerListPlatformSolutionResponse.setData(data);
	 
	 	return innerListPlatformSolutionResponse;
	}
}