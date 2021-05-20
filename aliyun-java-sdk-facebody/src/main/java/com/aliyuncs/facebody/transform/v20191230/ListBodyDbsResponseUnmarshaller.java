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

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.ListBodyDbsResponse;
import com.aliyuncs.facebody.model.v20191230.ListBodyDbsResponse.Data;
import com.aliyuncs.facebody.model.v20191230.ListBodyDbsResponse.Data.DbListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBodyDbsResponseUnmarshaller {

	public static ListBodyDbsResponse unmarshall(ListBodyDbsResponse listBodyDbsResponse, UnmarshallerContext _ctx) {
		
		listBodyDbsResponse.setRequestId(_ctx.stringValue("ListBodyDbsResponse.RequestId"));
		listBodyDbsResponse.setCode(_ctx.stringValue("ListBodyDbsResponse.Code"));
		listBodyDbsResponse.setMessage(_ctx.stringValue("ListBodyDbsResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("ListBodyDbsResponse.Data.Total"));

		List<DbListItem> dbList = new ArrayList<DbListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBodyDbsResponse.Data.DbList.Length"); i++) {
			DbListItem dbListItem = new DbListItem();
			dbListItem.setId(_ctx.longValue("ListBodyDbsResponse.Data.DbList["+ i +"].Id"));
			dbListItem.setName(_ctx.stringValue("ListBodyDbsResponse.Data.DbList["+ i +"].Name"));

			dbList.add(dbListItem);
		}
		data.setDbList(dbList);
		listBodyDbsResponse.setData(data);
	 
	 	return listBodyDbsResponse;
	}
}