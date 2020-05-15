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

package com.aliyuncs.imgsearch.transform.v20200320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imgsearch.model.v20200320.ListImageDbsResponse;
import com.aliyuncs.imgsearch.model.v20200320.ListImageDbsResponse.Data;
import com.aliyuncs.imgsearch.model.v20200320.ListImageDbsResponse.Data.DbListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImageDbsResponseUnmarshaller {

	public static ListImageDbsResponse unmarshall(ListImageDbsResponse listImageDbsResponse, UnmarshallerContext _ctx) {
		
		listImageDbsResponse.setRequestId(_ctx.stringValue("ListImageDbsResponse.RequestId"));

		Data data = new Data();

		List<DbListItem> dbList = new ArrayList<DbListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListImageDbsResponse.Data.DbList.Length"); i++) {
			DbListItem dbListItem = new DbListItem();
			dbListItem.setName(_ctx.stringValue("ListImageDbsResponse.Data.DbList["+ i +"].Name"));

			dbList.add(dbListItem);
		}
		data.setDbList(dbList);
		listImageDbsResponse.setData(data);
	 
	 	return listImageDbsResponse;
	}
}