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

package com.aliyuncs.jarvis.transform.v20180206;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.jarvis.model.v20180206.DescribeUidWhiteListGroupResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeUidWhiteListGroupResponse.Data;
import com.aliyuncs.jarvis.model.v20180206.DescribeUidWhiteListGroupResponse.Data.Item;
import com.aliyuncs.jarvis.model.v20180206.DescribeUidWhiteListGroupResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUidWhiteListGroupResponseUnmarshaller {

	public static DescribeUidWhiteListGroupResponse unmarshall(DescribeUidWhiteListGroupResponse describeUidWhiteListGroupResponse, UnmarshallerContext context) {
		
		describeUidWhiteListGroupResponse.setRequestId(context.stringValue("DescribeUidWhiteListGroupResponse.RequestId"));
		describeUidWhiteListGroupResponse.setModule(context.stringValue("DescribeUidWhiteListGroupResponse.module"));

		List<String> productList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeUidWhiteListGroupResponse.ProductList.Length"); i++) {
			productList.add(context.stringValue("DescribeUidWhiteListGroupResponse.ProductList["+ i +"]"));
		}
		describeUidWhiteListGroupResponse.setProductList(productList);

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotal(context.integerValue("DescribeUidWhiteListGroupResponse.PageInfo.total"));
		pageInfo.setPageSize(context.integerValue("DescribeUidWhiteListGroupResponse.PageInfo.pageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribeUidWhiteListGroupResponse.PageInfo.currentPage"));
		describeUidWhiteListGroupResponse.setPageInfo(pageInfo);

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeUidWhiteListGroupResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setStatus(context.stringValue("DescribeUidWhiteListGroupResponse.DataList["+ i +"].Status"));
			data.setGmtCreate(context.stringValue("DescribeUidWhiteListGroupResponse.DataList["+ i +"].GmtCreate"));
			data.setGmtRealExpire(context.stringValue("DescribeUidWhiteListGroupResponse.DataList["+ i +"].GmtRealExpire"));
			data.setSrcUid(context.stringValue("DescribeUidWhiteListGroupResponse.DataList["+ i +"].SrcUid"));
			data.setAutoConfig(context.integerValue("DescribeUidWhiteListGroupResponse.DataList["+ i +"].AutoConfig"));
			data.setGroupId(context.integerValue("DescribeUidWhiteListGroupResponse.DataList["+ i +"].GroupId"));

			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < context.lengthValue("DescribeUidWhiteListGroupResponse.DataList["+ i +"].Items.Length"); j++) {
				Item item = new Item();
				item.setIP(context.stringValue("DescribeUidWhiteListGroupResponse.DataList["+ i +"].Items["+ j +"].IP"));
				item.setRegionId(context.stringValue("DescribeUidWhiteListGroupResponse.DataList["+ i +"].Items["+ j +"].RegionId"));

				items.add(item);
			}
			data.setItems(items);

			dataList.add(data);
		}
		describeUidWhiteListGroupResponse.setDataList(dataList);
	 
	 	return describeUidWhiteListGroupResponse;
	}
}