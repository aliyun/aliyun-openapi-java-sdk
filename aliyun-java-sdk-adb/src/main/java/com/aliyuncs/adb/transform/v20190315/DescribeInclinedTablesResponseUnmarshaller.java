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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeInclinedTablesResponse;
import com.aliyuncs.adb.model.v20190315.DescribeInclinedTablesResponse.Items;
import com.aliyuncs.adb.model.v20190315.DescribeInclinedTablesResponse.Items1;
import com.aliyuncs.adb.model.v20190315.DescribeInclinedTablesResponse.Items1.Items2;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInclinedTablesResponseUnmarshaller {

	public static DescribeInclinedTablesResponse unmarshall(DescribeInclinedTablesResponse describeInclinedTablesResponse, UnmarshallerContext _ctx) {
		
		describeInclinedTablesResponse.setRequestId(_ctx.stringValue("DescribeInclinedTablesResponse.RequestId"));
		describeInclinedTablesResponse.setTotalCount(_ctx.stringValue("DescribeInclinedTablesResponse.TotalCount"));
		describeInclinedTablesResponse.setPageSize(_ctx.stringValue("DescribeInclinedTablesResponse.PageSize"));
		describeInclinedTablesResponse.setPageNumber(_ctx.stringValue("DescribeInclinedTablesResponse.PageNumber"));

		Items1 items1 = new Items1();

		List<Items2> table = new ArrayList<Items2>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInclinedTablesResponse.Items.Table.Length"); i++) {
			Items2 items2 = new Items2();
			items2.setType(_ctx.stringValue("DescribeInclinedTablesResponse.Items.Table["+ i +"].Type"));
			items2.setSchema(_ctx.stringValue("DescribeInclinedTablesResponse.Items.Table["+ i +"].Schema"));
			items2.setSize(_ctx.stringValue("DescribeInclinedTablesResponse.Items.Table["+ i +"].Size"));
			items2.setName(_ctx.stringValue("DescribeInclinedTablesResponse.Items.Table["+ i +"].Name"));
			items2.setIsIncline(_ctx.stringValue("DescribeInclinedTablesResponse.Items.Table["+ i +"].IsIncline"));
			items2.setTotalSize(_ctx.longValue("DescribeInclinedTablesResponse.Items.Table["+ i +"].TotalSize"));
			items2.setSpaceRatio(_ctx.doubleValue("DescribeInclinedTablesResponse.Items.Table["+ i +"].SpaceRatio"));
			items2.setRowCount(_ctx.longValue("DescribeInclinedTablesResponse.Items.Table["+ i +"].RowCount"));

			table.add(items2);
		}
		items1.setTable(table);
		describeInclinedTablesResponse.setItems1(items1);

		List<Items> detectionItems = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInclinedTablesResponse.DetectionItems.Length"); i++) {
			Items items = new Items();
			items.setName(_ctx.stringValue("DescribeInclinedTablesResponse.DetectionItems["+ i +"].Name"));
			items.setMessage(_ctx.stringValue("DescribeInclinedTablesResponse.DetectionItems["+ i +"].Message"));
			items.setStatus(_ctx.stringValue("DescribeInclinedTablesResponse.DetectionItems["+ i +"].Status"));

			detectionItems.add(items);
		}
		describeInclinedTablesResponse.setDetectionItems(detectionItems);
	 
	 	return describeInclinedTablesResponse;
	}
}