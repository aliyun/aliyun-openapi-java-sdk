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

import com.aliyuncs.dataworks_public.model.v20200518.ListTablesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListTablesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListTablesResponse.Data.TableEntityListItem;
import com.aliyuncs.dataworks_public.model.v20200518.ListTablesResponse.Data.TableEntityListItem.EntityContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTablesResponseUnmarshaller {

	public static ListTablesResponse unmarshall(ListTablesResponse listTablesResponse, UnmarshallerContext _ctx) {
		
		listTablesResponse.setRequestId(_ctx.stringValue("ListTablesResponse.RequestId"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("ListTablesResponse.Data.Total"));
		data.setNextToken(_ctx.stringValue("ListTablesResponse.Data.NextToken"));

		List<TableEntityListItem> tableEntityList = new ArrayList<TableEntityListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTablesResponse.Data.TableEntityList.Length"); i++) {
			TableEntityListItem tableEntityListItem = new TableEntityListItem();
			tableEntityListItem.setEntityQualifiedName(_ctx.stringValue("ListTablesResponse.Data.TableEntityList["+ i +"].EntityQualifiedName"));

			EntityContent entityContent = new EntityContent();
			entityContent.setTableName(_ctx.stringValue("ListTablesResponse.Data.TableEntityList["+ i +"].EntityContent.TableName"));
			entityContent.setDataSourceQualifiedName(_ctx.stringValue("ListTablesResponse.Data.TableEntityList["+ i +"].EntityContent.DataSourceQualifiedName"));
			entityContent.setDataSourceUniqueId(_ctx.stringValue("ListTablesResponse.Data.TableEntityList["+ i +"].EntityContent.DataSourceUniqueId"));
			entityContent.setDatabaseName(_ctx.stringValue("ListTablesResponse.Data.TableEntityList["+ i +"].EntityContent.DatabaseName"));
			entityContent.setProjectName(_ctx.stringValue("ListTablesResponse.Data.TableEntityList["+ i +"].EntityContent.ProjectName"));
			entityContent.setInstanceId(_ctx.stringValue("ListTablesResponse.Data.TableEntityList["+ i +"].EntityContent.InstanceId"));
			tableEntityListItem.setEntityContent(entityContent);

			tableEntityList.add(tableEntityListItem);
		}
		data.setTableEntityList(tableEntityList);
		listTablesResponse.setData(data);
	 
	 	return listTablesResponse;
	}
}