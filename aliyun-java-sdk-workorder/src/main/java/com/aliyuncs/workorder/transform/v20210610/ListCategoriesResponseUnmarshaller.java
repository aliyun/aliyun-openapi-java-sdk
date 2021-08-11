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

package com.aliyuncs.workorder.transform.v20210610;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.workorder.model.v20210610.ListCategoriesResponse;
import com.aliyuncs.workorder.model.v20210610.ListCategoriesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCategoriesResponseUnmarshaller {

	public static ListCategoriesResponse unmarshall(ListCategoriesResponse listCategoriesResponse, UnmarshallerContext _ctx) {
		
		listCategoriesResponse.setRequestId(_ctx.stringValue("ListCategoriesResponse.RequestId"));
		listCategoriesResponse.setCode(_ctx.integerValue("ListCategoriesResponse.Code"));
		listCategoriesResponse.setMessage(_ctx.stringValue("ListCategoriesResponse.Message"));
		listCategoriesResponse.setSuccess(_ctx.booleanValue("ListCategoriesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCategoriesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCategoryId(_ctx.longValue("ListCategoriesResponse.Data["+ i +"].CategoryId"));
			dataItem.setCategoryName(_ctx.stringValue("ListCategoriesResponse.Data["+ i +"].CategoryName"));

			data.add(dataItem);
		}
		listCategoriesResponse.setData(data);
	 
	 	return listCategoriesResponse;
	}
}