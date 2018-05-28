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

import com.aliyuncs.jarvis.model.v20180206.DescribeAccessWhiteListGroupResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeAccessWhiteListGroupResponse.Data;
import com.aliyuncs.jarvis.model.v20180206.DescribeAccessWhiteListGroupResponse.Data.Item;
import com.aliyuncs.jarvis.model.v20180206.DescribeAccessWhiteListGroupResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessWhiteListGroupResponseUnmarshaller {

	public static DescribeAccessWhiteListGroupResponse unmarshall(DescribeAccessWhiteListGroupResponse describeAccessWhiteListGroupResponse, UnmarshallerContext context) {
		
		describeAccessWhiteListGroupResponse.setRequestId(context.stringValue("DescribeAccessWhiteListGroupResponse.RequestId"));
		describeAccessWhiteListGroupResponse.setModule(context.stringValue("DescribeAccessWhiteListGroupResponse.module"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotal(context.integerValue("DescribeAccessWhiteListGroupResponse.PageInfo.total"));
		pageInfo.setPageSize(context.integerValue("DescribeAccessWhiteListGroupResponse.PageInfo.pageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribeAccessWhiteListGroupResponse.PageInfo.currentPage"));
		describeAccessWhiteListGroupResponse.setPageInfo(pageInfo);

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeAccessWhiteListGroupResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setStatus(context.stringValue("DescribeAccessWhiteListGroupResponse.DataList["+ i +"].Status"));
			data.setGmtCreate(context.stringValue("DescribeAccessWhiteListGroupResponse.DataList["+ i +"].GmtCreate"));
			data.setGmtRealExpire(context.stringValue("DescribeAccessWhiteListGroupResponse.DataList["+ i +"].GmtRealExpire"));
			data.setSrcIP(context.stringValue("DescribeAccessWhiteListGroupResponse.DataList["+ i +"].SrcIP"));
			data.setAutoConfig(context.integerValue("DescribeAccessWhiteListGroupResponse.DataList["+ i +"].AutoConfig"));
			data.setGroupId(context.integerValue("DescribeAccessWhiteListGroupResponse.DataList["+ i +"].GroupId"));

			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < context.lengthValue("DescribeAccessWhiteListGroupResponse.DataList["+ i +"].Items.Length"); j++) {
				Item item = new Item();
				item.setIP(context.stringValue("DescribeAccessWhiteListGroupResponse.DataList["+ i +"].Items["+ j +"].IP"));
				item.setRegionId(context.stringValue("DescribeAccessWhiteListGroupResponse.DataList["+ i +"].Items["+ j +"].RegionId"));

				items.add(item);
			}
			data.setItems(items);

			dataList.add(data);
		}
		describeAccessWhiteListGroupResponse.setDataList(dataList);
	 
	 	return describeAccessWhiteListGroupResponse;
	}
}