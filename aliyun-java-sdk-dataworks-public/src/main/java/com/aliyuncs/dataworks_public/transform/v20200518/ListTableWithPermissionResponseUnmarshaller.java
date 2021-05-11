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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListTableWithPermissionResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListTableWithPermissionResponse.Tables;
import com.aliyuncs.dataworks_public.model.v20200518.ListTableWithPermissionResponse.Tables.TableListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTableWithPermissionResponseUnmarshaller {

	public static ListTableWithPermissionResponse unmarshall(ListTableWithPermissionResponse listTableWithPermissionResponse, UnmarshallerContext _ctx) {
		
		listTableWithPermissionResponse.setRequestId(_ctx.stringValue("ListTableWithPermissionResponse.RequestId"));

		Tables tables = new Tables();
		tables.setPageNumber(_ctx.integerValue("ListTableWithPermissionResponse.Tables.PageNumber"));
		tables.setPageSize(_ctx.integerValue("ListTableWithPermissionResponse.Tables.PageSize"));
		tables.setTotalCount(_ctx.integerValue("ListTableWithPermissionResponse.Tables.TotalCount"));

		List<TableListItem> tableList = new ArrayList<TableListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTableWithPermissionResponse.Tables.TableList.Length"); i++) {
			TableListItem tableListItem = new TableListItem();
			tableListItem.setProjectGuid(_ctx.stringValue("ListTableWithPermissionResponse.Tables.TableList["+ i +"].ProjectGuid"));
			tableListItem.setGuid(_ctx.stringValue("ListTableWithPermissionResponse.Tables.TableList["+ i +"].Guid"));
			tableListItem.setName(_ctx.stringValue("ListTableWithPermissionResponse.Tables.TableList["+ i +"].Name"));
			tableListItem.setNameCn(_ctx.stringValue("ListTableWithPermissionResponse.Tables.TableList["+ i +"].NameCn"));
			tableListItem.setComment(_ctx.stringValue("ListTableWithPermissionResponse.Tables.TableList["+ i +"].Comment"));
			tableListItem.setOwner(_ctx.stringValue("ListTableWithPermissionResponse.Tables.TableList["+ i +"].Owner"));

			List<String> action = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTableWithPermissionResponse.Tables.TableList["+ i +"].Action.Length"); j++) {
				action.add(_ctx.stringValue("ListTableWithPermissionResponse.Tables.TableList["+ i +"].Action["+ j +"]"));
			}
			tableListItem.setAction(action);

			tableList.add(tableListItem);
		}
		tables.setTableList(tableList);
		listTableWithPermissionResponse.setTables(tables);
	 
	 	return listTableWithPermissionResponse;
	}
}