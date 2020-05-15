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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListSchemaSubscribesResponse;
import com.aliyuncs.iovcc.model.v20180501.ListSchemaSubscribesResponse.PageListItem;
import com.aliyuncs.iovcc.model.v20180501.ListSchemaSubscribesResponse.PageListItem.ListItem;
import com.aliyuncs.iovcc.model.v20180501.ListSchemaSubscribesResponse.PageListItem.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSchemaSubscribesResponseUnmarshaller {

	public static ListSchemaSubscribesResponse unmarshall(ListSchemaSubscribesResponse listSchemaSubscribesResponse, UnmarshallerContext _ctx) {
		
		listSchemaSubscribesResponse.setRequestId(_ctx.stringValue("ListSchemaSubscribesResponse.RequestId"));

		List<PageListItem> pageList = new ArrayList<PageListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSchemaSubscribesResponse.PageList.Length"); i++) {
			PageListItem pageListItem = new PageListItem();

			Pagination pagination = new Pagination();
			pagination.setTotalCount(_ctx.integerValue("ListSchemaSubscribesResponse.PageList["+ i +"].Pagination.TotalCount"));
			pagination.setTotalPageCount(_ctx.integerValue("ListSchemaSubscribesResponse.PageList["+ i +"].Pagination.TotalPageCount"));
			pagination.setPageIndex(_ctx.integerValue("ListSchemaSubscribesResponse.PageList["+ i +"].Pagination.PageIndex"));
			pagination.setPageSize(_ctx.integerValue("ListSchemaSubscribesResponse.PageList["+ i +"].Pagination.PageSize"));
			pagination.setSimpleSign(_ctx.booleanValue("ListSchemaSubscribesResponse.PageList["+ i +"].Pagination.SimpleSign"));
			pagination.setHasNextPage(_ctx.booleanValue("ListSchemaSubscribesResponse.PageList["+ i +"].Pagination.HasNextPage"));
			pageListItem.setPagination(pagination);

			List<ListItem> list = new ArrayList<ListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListSchemaSubscribesResponse.PageList["+ i +"].List.Length"); j++) {
				ListItem listItem = new ListItem();
				listItem.setId(_ctx.longValue("ListSchemaSubscribesResponse.PageList["+ i +"].List["+ j +"].Id"));
				listItem.setVersion(_ctx.stringValue("ListSchemaSubscribesResponse.PageList["+ i +"].List["+ j +"].Version"));
				listItem.setValiditySchema(_ctx.stringValue("ListSchemaSubscribesResponse.PageList["+ i +"].List["+ j +"].ValiditySchema"));
				listItem.setNamespace(_ctx.stringValue("ListSchemaSubscribesResponse.PageList["+ i +"].List["+ j +"].Namespace"));
				listItem.setProjectId(_ctx.stringValue("ListSchemaSubscribesResponse.PageList["+ i +"].List["+ j +"].ProjectId"));
				listItem.setDeviceModelId(_ctx.longValue("ListSchemaSubscribesResponse.PageList["+ i +"].List["+ j +"].DeviceModelId"));
				listItem.setDeviceModel(_ctx.stringValue("ListSchemaSubscribesResponse.PageList["+ i +"].List["+ j +"].DeviceModel"));
				listItem.setGmtCreate(_ctx.longValue("ListSchemaSubscribesResponse.PageList["+ i +"].List["+ j +"].GmtCreate"));
				listItem.setGmtModified(_ctx.longValue("ListSchemaSubscribesResponse.PageList["+ i +"].List["+ j +"].GmtModified"));

				list.add(listItem);
			}
			pageListItem.setList(list);

			pageList.add(pageListItem);
		}
		listSchemaSubscribesResponse.setPageList(pageList);
	 
	 	return listSchemaSubscribesResponse;
	}
}