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

package com.aliyuncs.viapi_regen.transform.v20211119;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.viapi_regen.model.v20211119.ListDataReflowDatasResponse;
import com.aliyuncs.viapi_regen.model.v20211119.ListDataReflowDatasResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataReflowDatasResponseUnmarshaller {

	public static ListDataReflowDatasResponse unmarshall(ListDataReflowDatasResponse listDataReflowDatasResponse, UnmarshallerContext _ctx) {
		
		listDataReflowDatasResponse.setRequestId(_ctx.stringValue("ListDataReflowDatasResponse.RequestId"));
		listDataReflowDatasResponse.setMessage(_ctx.stringValue("ListDataReflowDatasResponse.Message"));
		listDataReflowDatasResponse.setCode(_ctx.stringValue("ListDataReflowDatasResponse.Code"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("ListDataReflowDatasResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("ListDataReflowDatasResponse.Data.PageSize"));
		data.setTotalPage(_ctx.longValue("ListDataReflowDatasResponse.Data.TotalPage"));
		data.setTotalCount(_ctx.longValue("ListDataReflowDatasResponse.Data.TotalCount"));

		List<Map<Object, Object>> elements = _ctx.listMapValue("ListDataReflowDatasResponse.Data.Elements");
		data.setElements(elements);
		listDataReflowDatasResponse.setData(data);
	 
	 	return listDataReflowDatasResponse;
	}
}