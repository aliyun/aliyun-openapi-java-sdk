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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeEmgVulItemResponse;
import com.aliyuncs.sas.model.v20181203.DescribeEmgVulItemResponse.GroupedVulItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEmgVulItemResponseUnmarshaller {

	public static DescribeEmgVulItemResponse unmarshall(DescribeEmgVulItemResponse describeEmgVulItemResponse, UnmarshallerContext _ctx) {
		
		describeEmgVulItemResponse.setRequestId(_ctx.stringValue("DescribeEmgVulItemResponse.RequestId"));
		describeEmgVulItemResponse.setPageSize(_ctx.integerValue("DescribeEmgVulItemResponse.PageSize"));
		describeEmgVulItemResponse.setCurrentPage(_ctx.integerValue("DescribeEmgVulItemResponse.CurrentPage"));
		describeEmgVulItemResponse.setTotalCount(_ctx.integerValue("DescribeEmgVulItemResponse.TotalCount"));

		List<GroupedVulItem> groupedVulItems = new ArrayList<GroupedVulItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEmgVulItemResponse.GroupedVulItems.Length"); i++) {
			GroupedVulItem groupedVulItem = new GroupedVulItem();
			groupedVulItem.setAliasName(_ctx.stringValue("DescribeEmgVulItemResponse.GroupedVulItems["+ i +"].AliasName"));
			groupedVulItem.setPendingCount(_ctx.integerValue("DescribeEmgVulItemResponse.GroupedVulItems["+ i +"].PendingCount"));
			groupedVulItem.setName(_ctx.stringValue("DescribeEmgVulItemResponse.GroupedVulItems["+ i +"].Name"));
			groupedVulItem.setGmtPublish(_ctx.longValue("DescribeEmgVulItemResponse.GroupedVulItems["+ i +"].GmtPublish"));
			groupedVulItem.setDescription(_ctx.stringValue("DescribeEmgVulItemResponse.GroupedVulItems["+ i +"].Description"));
			groupedVulItem.setType(_ctx.stringValue("DescribeEmgVulItemResponse.GroupedVulItems["+ i +"].Type"));
			groupedVulItem.setStatus(_ctx.integerValue("DescribeEmgVulItemResponse.GroupedVulItems["+ i +"].Status"));
			groupedVulItem.setProgress(_ctx.integerValue("DescribeEmgVulItemResponse.GroupedVulItems["+ i +"].Progress"));
			groupedVulItem.setGmtLastCheck(_ctx.longValue("DescribeEmgVulItemResponse.GroupedVulItems["+ i +"].GmtLastCheck"));

			groupedVulItems.add(groupedVulItem);
		}
		describeEmgVulItemResponse.setGroupedVulItems(groupedVulItems);
	 
	 	return describeEmgVulItemResponse;
	}
}