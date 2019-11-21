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

	public static DescribeGroupedVulResponse unmarshall(DescribeGroupedVulResponse describeGroupedVulResponse, UnmarshallerContext _ctx) {
		
		describeGroupedVulResponse.setRequestId(_ctx.stringValue("DescribeGroupedVulResponse.RequestId"));
		describeGroupedVulResponse.setPageSize(_ctx.integerValue("DescribeGroupedVulResponse.PageSize"));
		describeGroupedVulResponse.setCurrentPage(_ctx.integerValue("DescribeGroupedVulResponse.CurrentPage"));
		describeGroupedVulResponse.setTotalCount(_ctx.integerValue("DescribeGroupedVulResponse.TotalCount"));

		List<GroupedVulItem> groupedVulItems = new ArrayList<GroupedVulItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupedVulResponse.GroupedVulItems.Length"); i++) {
			GroupedVulItem groupedVulItem = new GroupedVulItem();
			groupedVulItem.setName(_ctx.stringValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].Name"));
			groupedVulItem.setAliasName(_ctx.stringValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].AliasName"));
			groupedVulItem.setType(_ctx.stringValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].Type"));
			groupedVulItem.setGmtLast(_ctx.longValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].GmtLast"));
			groupedVulItem.setAsapCount(_ctx.integerValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].AsapCount"));
			groupedVulItem.setLaterCount(_ctx.integerValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].LaterCount"));
			groupedVulItem.setNntfCount(_ctx.integerValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].NntfCount"));
			groupedVulItem.setHandledCount(_ctx.integerValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].HandledCount"));
			groupedVulItem.setTags(_ctx.stringValue("DescribeGroupedVulResponse.GroupedVulItems["+ i +"].Tags"));

			groupedVulItems.add(groupedVulItem);
		}
		describeGroupedVulResponse.setGroupedVulItems(groupedVulItems);
	 
	 	return describeGroupedVulResponse;
	}
}