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

import com.aliyuncs.viapi_regen.model.v20211119.ListServicesResponse;
import com.aliyuncs.viapi_regen.model.v20211119.ListServicesResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServicesResponseUnmarshaller {

	public static ListServicesResponse unmarshall(ListServicesResponse listServicesResponse, UnmarshallerContext _ctx) {
		
		listServicesResponse.setRequestId(_ctx.stringValue("ListServicesResponse.RequestId"));
		listServicesResponse.setMessage(_ctx.stringValue("ListServicesResponse.Message"));
		listServicesResponse.setCode(_ctx.stringValue("ListServicesResponse.Code"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("ListServicesResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("ListServicesResponse.Data.PageSize"));
		data.setTotalPage(_ctx.longValue("ListServicesResponse.Data.TotalPage"));
		data.setTotalCount(_ctx.longValue("ListServicesResponse.Data.TotalCount"));

		List<Map<Object, Object>> elements = _ctx.listMapValue("ListServicesResponse.Data.Elements");
		data.setElements(elements);
		listServicesResponse.setData(data);
	 
	 	return listServicesResponse;
	}
}