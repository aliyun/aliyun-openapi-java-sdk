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

import com.aliyuncs.iovcc.model.v20180501.ListShadowSchemasResponse;
import com.aliyuncs.iovcc.model.v20180501.ListShadowSchemasResponse.PageList;
import com.aliyuncs.iovcc.model.v20180501.ListShadowSchemasResponse.PageList.ListItem;
import com.aliyuncs.iovcc.model.v20180501.ListShadowSchemasResponse.PageList.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListShadowSchemasResponseUnmarshaller {

	public static ListShadowSchemasResponse unmarshall(ListShadowSchemasResponse listShadowSchemasResponse, UnmarshallerContext _ctx) {
		
		listShadowSchemasResponse.setRequestId(_ctx.stringValue("ListShadowSchemasResponse.RequestId"));

		PageList pageList = new PageList();

		Pagination pagination = new Pagination();
		pagination.setTotalCount(_ctx.integerValue("ListShadowSchemasResponse.PageList.Pagination.TotalCount"));
		pagination.setTotalPageCount(_ctx.integerValue("ListShadowSchemasResponse.PageList.Pagination.TotalPageCount"));
		pagination.setPageIndex(_ctx.integerValue("ListShadowSchemasResponse.PageList.Pagination.PageIndex"));
		pagination.setPageSize(_ctx.integerValue("ListShadowSchemasResponse.PageList.Pagination.PageSize"));
		pagination.setSimpleSign(_ctx.booleanValue("ListShadowSchemasResponse.PageList.Pagination.SimpleSign"));
		pagination.setHasNextPage(_ctx.booleanValue("ListShadowSchemasResponse.PageList.Pagination.HasNextPage"));
		pageList.setPagination(pagination);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListShadowSchemasResponse.PageList.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setAuthTypeDesc(_ctx.stringValue("ListShadowSchemasResponse.PageList.List["+ i +"].AuthTypeDesc"));
			listItem.setId(_ctx.longValue("ListShadowSchemasResponse.PageList.List["+ i +"].Id"));
			listItem.setProjectId(_ctx.stringValue("ListShadowSchemasResponse.PageList.List["+ i +"].ProjectId"));
			listItem.setDeviceModelId(_ctx.longValue("ListShadowSchemasResponse.PageList.List["+ i +"].DeviceModelId"));
			listItem.setDeviceModel(_ctx.stringValue("ListShadowSchemasResponse.PageList.List["+ i +"].DeviceModel"));
			listItem.setModuleSchema(_ctx.stringValue("ListShadowSchemasResponse.PageList.List["+ i +"].ModuleSchema"));
			listItem.setNamespace(_ctx.stringValue("ListShadowSchemasResponse.PageList.List["+ i +"].Namespace"));
			listItem.setAuthType(_ctx.integerValue("ListShadowSchemasResponse.PageList.List["+ i +"].AuthType"));
			listItem.setGmtCreate(_ctx.longValue("ListShadowSchemasResponse.PageList.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.longValue("ListShadowSchemasResponse.PageList.List["+ i +"].GmtModified"));

			list.add(listItem);
		}
		pageList.setList(list);
		listShadowSchemasResponse.setPageList(pageList);
	 
	 	return listShadowSchemasResponse;
	}
}