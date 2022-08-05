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

import com.aliyuncs.viapi_regen.model.v20211119.ListDatasetsResponse;
import com.aliyuncs.viapi_regen.model.v20211119.ListDatasetsResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatasetsResponseUnmarshaller {

	public static ListDatasetsResponse unmarshall(ListDatasetsResponse listDatasetsResponse, UnmarshallerContext _ctx) {
		
		listDatasetsResponse.setRequestId(_ctx.stringValue("ListDatasetsResponse.RequestId"));
		listDatasetsResponse.setMessage(_ctx.stringValue("ListDatasetsResponse.Message"));
		listDatasetsResponse.setCode(_ctx.stringValue("ListDatasetsResponse.Code"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("ListDatasetsResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("ListDatasetsResponse.Data.PageSize"));
		data.setTotalPage(_ctx.longValue("ListDatasetsResponse.Data.TotalPage"));
		data.setTotalCount(_ctx.longValue("ListDatasetsResponse.Data.TotalCount"));

		List<Map<Object, Object>> elements = _ctx.listMapValue("ListDatasetsResponse.Data.Elements");
		data.setElements(elements);
		listDatasetsResponse.setData(data);
	 
	 	return listDatasetsResponse;
	}
}