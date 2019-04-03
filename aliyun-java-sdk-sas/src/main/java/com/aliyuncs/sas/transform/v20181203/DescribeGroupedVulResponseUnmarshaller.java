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

import com.aliyuncs.sas.model.v20181203.DescribeGroupedVulResponse;
import com.aliyuncs.sas.model.v20181203.DescribeGroupedVulResponse.GroupedVulItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupedVulResponseUnmarshaller {

	public static DescribeGroupedVulResponse unmarshall(DescribeGroupedVulResponse describeGroupedVulResponse, UnmarshallerContext context) {
		
		describeGroupedVulResponse.setRequestId(context.stringValue("DescribeGroupedVulResponse.RequestId"));
		describeGroupedVulResponse.setPageSize(context.integerValue("DescribeGroupedVulResponse.PageSize"));
		describeGroupedVulResponse.setCurrentPage(context.integerValue("DescribeGroupedVulResponse.CurrentPage"));
		describeGroupedVulResponse.setTotalCount(context.integerValue("DescribeGroupedVulResponse.TotalCount"));

		List<GroupedVulItem> groupedVulItems = new ArrayList<GroupedVulItem>();
		for (int i = 0; i < context.lengthValue("DescribeGroupedVulResponse.GroupedVulItems.Length"); i++) {
			GroupedVulItem groupedVulItem = new GroupedVulItem();
			groupedVulItem.setAliasName(context.stringValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].AliasName"));
			groupedVulItem.setType(context.stringValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].Type"));
			groupedVulItem.setGmtLast(context.longValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].GmtLast"));
			groupedVulItem.setAsapCount(context.integerValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].AsapCount"));
			groupedVulItem.setLaterCount(context.integerValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].LaterCount"));
			groupedVulItem.setNntfCount(context.integerValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].NntfCount"));
			groupedVulItem.setHandledCount(context.integerValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].HandledCount"));
			groupedVulItem.setTags(context.stringValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].Tags"));

			groupedVulItems.add(groupedVulItem);
		}
		describeGroupedVulResponse.setGroupedVulItems(groupedVulItems);
	 
	 	return describeGroupedVulResponse;
	}
}