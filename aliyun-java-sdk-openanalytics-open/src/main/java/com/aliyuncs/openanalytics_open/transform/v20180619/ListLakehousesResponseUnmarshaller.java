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

import com.aliyuncs.openanalytics_open.model.v20180619.ListLakehousesResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLakehousesResponseUnmarshaller {

	public static ListLakehousesResponse unmarshall(ListLakehousesResponse listLakehousesResponse, UnmarshallerContext _ctx) {
		
		listLakehousesResponse.setRequestId(_ctx.stringValue("ListLakehousesResponse.RequestId"));
		listLakehousesResponse.setPageNumber(_ctx.integerValue("ListLakehousesResponse.PageNumber"));
		listLakehousesResponse.setPageSize(_ctx.integerValue("ListLakehousesResponse.PageSize"));
		listLakehousesResponse.setTotalCount(_ctx.integerValue("ListLakehousesResponse.TotalCount"));

		List<Map<Object, Object>> items = _ctx.listMapValue("ListLakehousesResponse.Items");
		listLakehousesResponse.setItems(items);
	 
	 	return listLakehousesResponse;
	}
}