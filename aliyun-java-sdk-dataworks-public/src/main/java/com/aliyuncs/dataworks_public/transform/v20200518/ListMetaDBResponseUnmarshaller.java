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

import com.aliyuncs.dataworks_public.model.v20200518.ListMetaDBResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListMetaDBResponse.DatabaseInfo;
import com.aliyuncs.dataworks_public.model.v20200518.ListMetaDBResponse.DatabaseInfo.DbListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMetaDBResponseUnmarshaller {

	public static ListMetaDBResponse unmarshall(ListMetaDBResponse listMetaDBResponse, UnmarshallerContext _ctx) {
		
		listMetaDBResponse.setRequestId(_ctx.stringValue("ListMetaDBResponse.RequestId"));

		DatabaseInfo databaseInfo = new DatabaseInfo();
		databaseInfo.setTotalCount(_ctx.longValue("ListMetaDBResponse.DatabaseInfo.TotalCount"));

		List<DbListItem> dbList = new ArrayList<DbListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMetaDBResponse.DatabaseInfo.DbList.Length"); i++) {
			DbListItem dbListItem = new DbListItem();
			dbListItem.setName(_ctx.stringValue("ListMetaDBResponse.DatabaseInfo.DbList["+ i +"].Name"));
			dbListItem.setType(_ctx.stringValue("ListMetaDBResponse.DatabaseInfo.DbList["+ i +"].Type"));
			dbListItem.setOwnerId(_ctx.stringValue("ListMetaDBResponse.DatabaseInfo.DbList["+ i +"].OwnerId"));
			dbListItem.setLocation(_ctx.stringValue("ListMetaDBResponse.DatabaseInfo.DbList["+ i +"].Location"));
			dbListItem.setCreateTimeStamp(_ctx.longValue("ListMetaDBResponse.DatabaseInfo.DbList["+ i +"].CreateTimeStamp"));
			dbListItem.setModifiedTimeStamp(_ctx.longValue("ListMetaDBResponse.DatabaseInfo.DbList["+ i +"].ModifiedTimeStamp"));
			dbListItem.setUUID(_ctx.stringValue("ListMetaDBResponse.DatabaseInfo.DbList["+ i +"].UUID"));

			dbList.add(dbListItem);
		}
		databaseInfo.setDbList(dbList);
		listMetaDBResponse.setDatabaseInfo(databaseInfo);
	 
	 	return listMetaDBResponse;
	}
}