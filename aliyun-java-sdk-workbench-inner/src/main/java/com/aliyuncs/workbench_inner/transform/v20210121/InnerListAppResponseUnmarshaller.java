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

import com.aliyuncs.workbench_inner.model.v20210121.InnerListAppResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListAppResponseUnmarshaller {

	public static InnerListAppResponse unmarshall(InnerListAppResponse innerListAppResponse, UnmarshallerContext _ctx) {
		
		innerListAppResponse.setRequestId(_ctx.stringValue("InnerListAppResponse.RequestId"));
		innerListAppResponse.setCode(_ctx.stringValue("InnerListAppResponse.Code"));
		innerListAppResponse.setMessage(_ctx.stringValue("InnerListAppResponse.Message"));
		innerListAppResponse.setPage(_ctx.integerValue("InnerListAppResponse.Page"));
		innerListAppResponse.setPageSize(_ctx.integerValue("InnerListAppResponse.PageSize"));
		innerListAppResponse.setTotal(_ctx.integerValue("InnerListAppResponse.Total"));
		innerListAppResponse.setTotalPage(_ctx.integerValue("InnerListAppResponse.TotalPage"));

		List<Map<Object, Object>> data = _ctx.listMapValue("InnerListAppResponse.Data");
		innerListAppResponse.setData(data);
	 
	 	return innerListAppResponse;
	}
}