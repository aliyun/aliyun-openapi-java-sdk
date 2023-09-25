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

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaDBTableListResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaDBTableListResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaDBTableListResponse.Data.TableEntityListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaDBTableListResponseUnmarshaller {

	public static GetMetaDBTableListResponse unmarshall(GetMetaDBTableListResponse getMetaDBTableListResponse, UnmarshallerContext _ctx) {
		
		getMetaDBTableListResponse.setRequestId(_ctx.stringValue("GetMetaDBTableListResponse.RequestId"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("GetMetaDBTableListResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("GetMetaDBTableListResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("GetMetaDBTableListResponse.Data.TotalCount"));

		List<TableEntityListItem> tableEntityList = new ArrayList<TableEntityListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaDBTableListResponse.Data.TableEntityList.Length"); i++) {
			TableEntityListItem tableEntityListItem = new TableEntityListItem();
			tableEntityListItem.setTableName(_ctx.stringValue("GetMetaDBTableListResponse.Data.TableEntityList["+ i +"].TableName"));
			tableEntityListItem.setTableGuid(_ctx.stringValue("GetMetaDBTableListResponse.Data.TableEntityList["+ i +"].TableGuid"));
			tableEntityListItem.setDatabaseName(_ctx.stringValue("GetMetaDBTableListResponse.Data.TableEntityList["+ i +"].DatabaseName"));

			tableEntityList.add(tableEntityListItem);
		}
		data.setTableEntityList(tableEntityList);
		getMetaDBTableListResponse.setData(data);
	 
	 	return getMetaDBTableListResponse;
	}
}