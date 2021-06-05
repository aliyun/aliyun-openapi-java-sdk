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

package com.aliyuncs.workorder.transform.v20210510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.workorder.model.v20210510.ListProductsResponse;
import com.aliyuncs.workorder.model.v20210510.ListProductsResponse.DataItem;
import com.aliyuncs.workorder.model.v20210510.ListProductsResponse.DataItem.RootsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductsResponseUnmarshaller {

	public static ListProductsResponse unmarshall(ListProductsResponse listProductsResponse, UnmarshallerContext _ctx) {
		
		listProductsResponse.setRequestId(_ctx.stringValue("ListProductsResponse.RequestId"));
		listProductsResponse.setCode(_ctx.integerValue("ListProductsResponse.Code"));
		listProductsResponse.setMessage(_ctx.stringValue("ListProductsResponse.Message"));
		listProductsResponse.setSuccess(_ctx.booleanValue("ListProductsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProductsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTopCategoryName(_ctx.stringValue("ListProductsResponse.Data["+ i +"].TopCategoryName"));
			dataItem.setTopCategoryId(_ctx.longValue("ListProductsResponse.Data["+ i +"].TopCategoryId"));
			dataItem.setOrderNumber(_ctx.integerValue("ListProductsResponse.Data["+ i +"].OrderNumber"));

			List<RootsItem> roots = new ArrayList<RootsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListProductsResponse.Data["+ i +"].Roots.Length"); j++) {
				RootsItem rootsItem = new RootsItem();
				rootsItem.setCategoryId(_ctx.longValue("ListProductsResponse.Data["+ i +"].Roots["+ j +"].CategoryId"));
				rootsItem.setCategoryName(_ctx.stringValue("ListProductsResponse.Data["+ i +"].Roots["+ j +"].CategoryName"));

				roots.add(rootsItem);
			}
			dataItem.setRoots(roots);

			data.add(dataItem);
		}
		listProductsResponse.setData(data);
	 
	 	return listProductsResponse;
	}
}