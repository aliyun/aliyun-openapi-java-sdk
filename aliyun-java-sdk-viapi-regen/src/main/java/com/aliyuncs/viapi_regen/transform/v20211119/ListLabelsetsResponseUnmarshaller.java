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

import com.aliyuncs.viapi_regen.model.v20211119.ListLabelsetsResponse;
import com.aliyuncs.viapi_regen.model.v20211119.ListLabelsetsResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLabelsetsResponseUnmarshaller {

	public static ListLabelsetsResponse unmarshall(ListLabelsetsResponse listLabelsetsResponse, UnmarshallerContext _ctx) {
		
		listLabelsetsResponse.setRequestId(_ctx.stringValue("ListLabelsetsResponse.RequestId"));
		listLabelsetsResponse.setMessage(_ctx.stringValue("ListLabelsetsResponse.Message"));
		listLabelsetsResponse.setCode(_ctx.stringValue("ListLabelsetsResponse.Code"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("ListLabelsetsResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("ListLabelsetsResponse.Data.PageSize"));
		data.setTotalPage(_ctx.longValue("ListLabelsetsResponse.Data.TotalPage"));
		data.setTotalCount(_ctx.longValue("ListLabelsetsResponse.Data.TotalCount"));

		List<Map<Object, Object>> elements = _ctx.listMapValue("ListLabelsetsResponse.Data.Elements");
		data.setElements(elements);
		listLabelsetsResponse.setData(data);
	 
	 	return listLabelsetsResponse;
	}
}