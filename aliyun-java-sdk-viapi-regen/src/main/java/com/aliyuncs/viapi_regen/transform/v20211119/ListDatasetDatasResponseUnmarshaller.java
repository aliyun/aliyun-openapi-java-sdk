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

import com.aliyuncs.viapi_regen.model.v20211119.ListDatasetDatasResponse;
import com.aliyuncs.viapi_regen.model.v20211119.ListDatasetDatasResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatasetDatasResponseUnmarshaller {

	public static ListDatasetDatasResponse unmarshall(ListDatasetDatasResponse listDatasetDatasResponse, UnmarshallerContext _ctx) {
		
		listDatasetDatasResponse.setRequestId(_ctx.stringValue("ListDatasetDatasResponse.RequestId"));
		listDatasetDatasResponse.setMessage(_ctx.stringValue("ListDatasetDatasResponse.Message"));
		listDatasetDatasResponse.setCode(_ctx.stringValue("ListDatasetDatasResponse.Code"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("ListDatasetDatasResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("ListDatasetDatasResponse.Data.PageSize"));
		data.setTotalPage(_ctx.longValue("ListDatasetDatasResponse.Data.TotalPage"));
		data.setTotalCount(_ctx.longValue("ListDatasetDatasResponse.Data.TotalCount"));

		List<Map<Object, Object>> elements = _ctx.listMapValue("ListDatasetDatasResponse.Data.Elements");
		data.setElements(elements);
		listDatasetDatasResponse.setData(data);
	 
	 	return listDatasetDatasResponse;
	}
}