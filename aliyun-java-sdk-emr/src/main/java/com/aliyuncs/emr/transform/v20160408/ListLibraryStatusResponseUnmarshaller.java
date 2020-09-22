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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListLibraryStatusResponse;
import com.aliyuncs.emr.model.v20160408.ListLibraryStatusResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLibraryStatusResponseUnmarshaller {

	public static ListLibraryStatusResponse unmarshall(ListLibraryStatusResponse listLibraryStatusResponse, UnmarshallerContext _ctx) {
		
		listLibraryStatusResponse.setRequestId(_ctx.stringValue("ListLibraryStatusResponse.RequestId"));
		listLibraryStatusResponse.setPageNumber(_ctx.integerValue("ListLibraryStatusResponse.PageNumber"));
		listLibraryStatusResponse.setPageSize(_ctx.integerValue("ListLibraryStatusResponse.PageSize"));
		listLibraryStatusResponse.setTotalCount(_ctx.integerValue("ListLibraryStatusResponse.TotalCount"));
		listLibraryStatusResponse.setNextToken(_ctx.stringValue("ListLibraryStatusResponse.NextToken"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListLibraryStatusResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setLibraryBizId(_ctx.stringValue("ListLibraryStatusResponse.Items["+ i +"].LibraryBizId"));
			item.setLibraryName(_ctx.stringValue("ListLibraryStatusResponse.Items["+ i +"].LibraryName"));
			item.setClusterBizId(_ctx.stringValue("ListLibraryStatusResponse.Items["+ i +"].ClusterBizId"));
			item.setClusterName(_ctx.stringValue("ListLibraryStatusResponse.Items["+ i +"].ClusterName"));
			item.setStatus(_ctx.stringValue("ListLibraryStatusResponse.Items["+ i +"].Status"));

			items.add(item);
		}
		listLibraryStatusResponse.setItems(items);
	 
	 	return listLibraryStatusResponse;
	}
}