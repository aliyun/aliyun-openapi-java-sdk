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

import com.aliyuncs.facebody.model.v20191230.ListFaceDbsResponse;
import com.aliyuncs.facebody.model.v20191230.ListFaceDbsResponse.Data;
import com.aliyuncs.facebody.model.v20191230.ListFaceDbsResponse.Data.DbListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFaceDbsResponseUnmarshaller {

	public static ListFaceDbsResponse unmarshall(ListFaceDbsResponse listFaceDbsResponse, UnmarshallerContext _ctx) {
		
		listFaceDbsResponse.setRequestId(_ctx.stringValue("ListFaceDbsResponse.RequestId"));

		Data data = new Data();

		List<DbListItem> dbList = new ArrayList<DbListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFaceDbsResponse.Data.DbList.Length"); i++) {
			DbListItem dbListItem = new DbListItem();
			dbListItem.setName(_ctx.stringValue("ListFaceDbsResponse.Data.DbList["+ i +"].Name"));

			dbList.add(dbListItem);
		}
		data.setDbList(dbList);
		listFaceDbsResponse.setData(data);
	 
	 	return listFaceDbsResponse;
	}
}