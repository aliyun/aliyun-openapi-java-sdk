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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeMetaListResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeMetaListResponse.MetaItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetaListResponseUnmarshaller {

	public static DescribeMetaListResponse unmarshall(DescribeMetaListResponse describeMetaListResponse, UnmarshallerContext _ctx) {
		
		describeMetaListResponse.setRequestId(_ctx.stringValue("DescribeMetaListResponse.RequestId"));
		describeMetaListResponse.setTotalRecordCount(_ctx.stringValue("DescribeMetaListResponse.TotalRecordCount"));
		describeMetaListResponse.setTotalPageCount(_ctx.stringValue("DescribeMetaListResponse.TotalPageCount"));
		describeMetaListResponse.setPageSize(_ctx.stringValue("DescribeMetaListResponse.PageSize"));
		describeMetaListResponse.setPageNumber(_ctx.stringValue("DescribeMetaListResponse.PageNumber"));

		List<MetaItem> items = new ArrayList<MetaItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMetaListResponse.Items.Length"); i++) {
			MetaItem metaItem = new MetaItem();
			metaItem.setDatabase(_ctx.stringValue("DescribeMetaListResponse.Items["+ i +"].Database"));

			List<String> tables = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMetaListResponse.Items["+ i +"].Tables.Length"); j++) {
				tables.add(_ctx.stringValue("DescribeMetaListResponse.Items["+ i +"].Tables["+ j +"]"));
			}
			metaItem.setTables(tables);

			items.add(metaItem);
		}
		describeMetaListResponse.setItems(items);
	 
	 	return describeMetaListResponse;
	}
}