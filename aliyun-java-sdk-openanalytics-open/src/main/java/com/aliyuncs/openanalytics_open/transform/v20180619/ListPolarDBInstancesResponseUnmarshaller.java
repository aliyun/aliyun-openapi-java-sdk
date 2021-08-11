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

import com.aliyuncs.openanalytics_open.model.v20180619.ListPolarDBInstancesResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPolarDBInstancesResponseUnmarshaller {

	public static ListPolarDBInstancesResponse unmarshall(ListPolarDBInstancesResponse listPolarDBInstancesResponse, UnmarshallerContext _ctx) {
		
		listPolarDBInstancesResponse.setRequestId(_ctx.stringValue("ListPolarDBInstancesResponse.RequestId"));
		listPolarDBInstancesResponse.setPageNumber(_ctx.integerValue("ListPolarDBInstancesResponse.PageNumber"));
		listPolarDBInstancesResponse.setPageSize(_ctx.integerValue("ListPolarDBInstancesResponse.PageSize"));
		listPolarDBInstancesResponse.setTotalCount(_ctx.integerValue("ListPolarDBInstancesResponse.TotalCount"));

		List<Map<Object, Object>> items = _ctx.listMapValue("ListPolarDBInstancesResponse.Items");
		listPolarDBInstancesResponse.setItems(items);
	 
	 	return listPolarDBInstancesResponse;
	}
}