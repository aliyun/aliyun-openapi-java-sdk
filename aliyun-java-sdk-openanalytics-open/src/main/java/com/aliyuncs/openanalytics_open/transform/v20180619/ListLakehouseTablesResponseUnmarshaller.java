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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics_open.model.v20180619.ListLakehouseTablesResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLakehouseTablesResponseUnmarshaller {

	public static ListLakehouseTablesResponse unmarshall(ListLakehouseTablesResponse listLakehouseTablesResponse, UnmarshallerContext _ctx) {
		
		listLakehouseTablesResponse.setRequestId(_ctx.stringValue("ListLakehouseTablesResponse.RequestId"));
		listLakehouseTablesResponse.setPageNumber(_ctx.integerValue("ListLakehouseTablesResponse.PageNumber"));
		listLakehouseTablesResponse.setPageSize(_ctx.integerValue("ListLakehouseTablesResponse.PageSize"));
		listLakehouseTablesResponse.setTotalCount(_ctx.integerValue("ListLakehouseTablesResponse.TotalCount"));

		List<Map<Object, Object>> items = _ctx.listMapValue("ListLakehouseTablesResponse.Items");
		listLakehouseTablesResponse.setItems(items);
	 
	 	return listLakehouseTablesResponse;
	}
}