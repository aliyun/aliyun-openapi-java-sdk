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

import com.aliyuncs.viapi_regen.model.v20211119.ListLabelsetDatasResponse;
import com.aliyuncs.viapi_regen.model.v20211119.ListLabelsetDatasResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLabelsetDatasResponseUnmarshaller {

	public static ListLabelsetDatasResponse unmarshall(ListLabelsetDatasResponse listLabelsetDatasResponse, UnmarshallerContext _ctx) {
		
		listLabelsetDatasResponse.setRequestId(_ctx.stringValue("ListLabelsetDatasResponse.RequestId"));
		listLabelsetDatasResponse.setMessage(_ctx.stringValue("ListLabelsetDatasResponse.Message"));
		listLabelsetDatasResponse.setCode(_ctx.stringValue("ListLabelsetDatasResponse.Code"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("ListLabelsetDatasResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("ListLabelsetDatasResponse.Data.PageSize"));
		data.setTotalPage(_ctx.longValue("ListLabelsetDatasResponse.Data.TotalPage"));
		data.setTotalCount(_ctx.longValue("ListLabelsetDatasResponse.Data.TotalCount"));

		List<Map<Object, Object>> elements = _ctx.listMapValue("ListLabelsetDatasResponse.Data.Elements");
		data.setElements(elements);
		listLabelsetDatasResponse.setData(data);
	 
	 	return listLabelsetDatasResponse;
	}
}