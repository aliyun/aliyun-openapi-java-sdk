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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListDataSourceItemResponse;
import com.aliyuncs.iot.model.v20180120.ListDataSourceItemResponse.DataSourceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSourceItemResponseUnmarshaller {

	public static ListDataSourceItemResponse unmarshall(ListDataSourceItemResponse listDataSourceItemResponse, UnmarshallerContext _ctx) {
		
		listDataSourceItemResponse.setRequestId(_ctx.stringValue("ListDataSourceItemResponse.RequestId"));
		listDataSourceItemResponse.setSuccess(_ctx.booleanValue("ListDataSourceItemResponse.Success"));
		listDataSourceItemResponse.setCode(_ctx.stringValue("ListDataSourceItemResponse.Code"));
		listDataSourceItemResponse.setErrorMessage(_ctx.stringValue("ListDataSourceItemResponse.ErrorMessage"));
		listDataSourceItemResponse.setPage(_ctx.integerValue("ListDataSourceItemResponse.Page"));
		listDataSourceItemResponse.setPageSize(_ctx.integerValue("ListDataSourceItemResponse.PageSize"));
		listDataSourceItemResponse.setTotal(_ctx.integerValue("ListDataSourceItemResponse.Total"));

		List<DataSourceItem> dataSourceItems = new ArrayList<DataSourceItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSourceItemResponse.DataSourceItems.Length"); i++) {
			DataSourceItem dataSourceItem = new DataSourceItem();
			dataSourceItem.setDataSourceItemId(_ctx.longValue("ListDataSourceItemResponse.DataSourceItems["+ i +"].DataSourceItemId"));
			dataSourceItem.setTopic(_ctx.stringValue("ListDataSourceItemResponse.DataSourceItems["+ i +"].Topic"));
			dataSourceItem.setScopeType(_ctx.stringValue("ListDataSourceItemResponse.DataSourceItems["+ i +"].ScopeType"));
			dataSourceItem.setProductKey(_ctx.stringValue("ListDataSourceItemResponse.DataSourceItems["+ i +"].ProductKey"));
			dataSourceItem.setDeviceName(_ctx.stringValue("ListDataSourceItemResponse.DataSourceItems["+ i +"].DeviceName"));

			dataSourceItems.add(dataSourceItem);
		}
		listDataSourceItemResponse.setDataSourceItems(dataSourceItems);
	 
	 	return listDataSourceItemResponse;
	}
}