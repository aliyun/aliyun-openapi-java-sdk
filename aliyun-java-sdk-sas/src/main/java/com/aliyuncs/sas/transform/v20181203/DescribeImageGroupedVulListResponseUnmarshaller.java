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

import com.aliyuncs.sas.model.v20181203.DescribeImageGroupedVulListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageGroupedVulListResponse.GroupedVulItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageGroupedVulListResponseUnmarshaller {

	public static DescribeImageGroupedVulListResponse unmarshall(DescribeImageGroupedVulListResponse describeImageGroupedVulListResponse, UnmarshallerContext _ctx) {
		
		describeImageGroupedVulListResponse.setRequestId(_ctx.stringValue("DescribeImageGroupedVulListResponse.RequestId"));
		describeImageGroupedVulListResponse.setCurrentPage(_ctx.integerValue("DescribeImageGroupedVulListResponse.CurrentPage"));
		describeImageGroupedVulListResponse.setPageSize(_ctx.integerValue("DescribeImageGroupedVulListResponse.PageSize"));
		describeImageGroupedVulListResponse.setTotalCount(_ctx.integerValue("DescribeImageGroupedVulListResponse.TotalCount"));

		List<GroupedVulItem> groupedVulItems = new ArrayList<GroupedVulItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageGroupedVulListResponse.GroupedVulItems.Length"); i++) {
			GroupedVulItem groupedVulItem = new GroupedVulItem();
			groupedVulItem.setStatus(_ctx.integerValue("DescribeImageGroupedVulListResponse.GroupedVulItems["+ i +"].Status"));
			groupedVulItem.setType(_ctx.stringValue("DescribeImageGroupedVulListResponse.GroupedVulItems["+ i +"].Type"));
			groupedVulItem.setNntfCount(_ctx.integerValue("DescribeImageGroupedVulListResponse.GroupedVulItems["+ i +"].NntfCount"));
			groupedVulItem.setGmtLast(_ctx.longValue("DescribeImageGroupedVulListResponse.GroupedVulItems["+ i +"].GmtLast"));
			groupedVulItem.setLastScanTime(_ctx.longValue("DescribeImageGroupedVulListResponse.GroupedVulItems["+ i +"].LastScanTime"));
			groupedVulItem.setTags(_ctx.stringValue("DescribeImageGroupedVulListResponse.GroupedVulItems["+ i +"].Tags"));
			groupedVulItem.setLaterCount(_ctx.integerValue("DescribeImageGroupedVulListResponse.GroupedVulItems["+ i +"].LaterCount"));
			groupedVulItem.setAliasName(_ctx.stringValue("DescribeImageGroupedVulListResponse.GroupedVulItems["+ i +"].AliasName"));
			groupedVulItem.setName(_ctx.stringValue("DescribeImageGroupedVulListResponse.GroupedVulItems["+ i +"].Name"));
			groupedVulItem.setAsapCount(_ctx.integerValue("DescribeImageGroupedVulListResponse.GroupedVulItems["+ i +"].AsapCount"));

			groupedVulItems.add(groupedVulItem);
		}
		describeImageGroupedVulListResponse.setGroupedVulItems(groupedVulItems);
	 
	 	return describeImageGroupedVulListResponse;
	}
}