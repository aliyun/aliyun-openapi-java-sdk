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

import com.aliyuncs.workbench_inner.model.v20210121.InnerListProductResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListProductResponseUnmarshaller {

	public static InnerListProductResponse unmarshall(InnerListProductResponse innerListProductResponse, UnmarshallerContext _ctx) {
		
		innerListProductResponse.setRequestId(_ctx.stringValue("InnerListProductResponse.RequestId"));
		innerListProductResponse.setCode(_ctx.stringValue("InnerListProductResponse.Code"));
		innerListProductResponse.setMessage(_ctx.stringValue("InnerListProductResponse.Message"));
		innerListProductResponse.setPage(_ctx.integerValue("InnerListProductResponse.Page"));
		innerListProductResponse.setPageSize(_ctx.integerValue("InnerListProductResponse.PageSize"));
		innerListProductResponse.setTotal(_ctx.integerValue("InnerListProductResponse.Total"));
		innerListProductResponse.setTotalPage(_ctx.integerValue("InnerListProductResponse.TotalPage"));

		List<Map<Object, Object>> data = _ctx.listMapValue("InnerListProductResponse.Data");
		innerListProductResponse.setData(data);
	 
	 	return innerListProductResponse;
	}
}