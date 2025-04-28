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

import com.aliyuncs.adb.model.v20190315.DescribeTableStatisticsResponse;
import com.aliyuncs.adb.model.v20190315.DescribeTableStatisticsResponse.TableStatisticRecords;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTableStatisticsResponseUnmarshaller {

	public static DescribeTableStatisticsResponse unmarshall(DescribeTableStatisticsResponse describeTableStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeTableStatisticsResponse.setRequestId(_ctx.stringValue("DescribeTableStatisticsResponse.RequestId"));
		describeTableStatisticsResponse.setTotalCount(_ctx.stringValue("DescribeTableStatisticsResponse.TotalCount"));
		describeTableStatisticsResponse.setPageSize(_ctx.stringValue("DescribeTableStatisticsResponse.PageSize"));
		describeTableStatisticsResponse.setPageNumber(_ctx.stringValue("DescribeTableStatisticsResponse.PageNumber"));
		describeTableStatisticsResponse.setDBClusterId(_ctx.stringValue("DescribeTableStatisticsResponse.DBClusterId"));
		describeTableStatisticsResponse.setSchemaNames(_ctx.stringValue("DescribeTableStatisticsResponse.SchemaNames"));

		List<TableStatisticRecords> items = new ArrayList<TableStatisticRecords>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTableStatisticsResponse.Items.Length"); i++) {
			TableStatisticRecords tableStatisticRecords = new TableStatisticRecords();
			tableStatisticRecords.setSchemaName(_ctx.stringValue("DescribeTableStatisticsResponse.Items["+ i +"].SchemaName"));
			tableStatisticRecords.setTableName(_ctx.stringValue("DescribeTableStatisticsResponse.Items["+ i +"].TableName"));
			tableStatisticRecords.setRowCount(_ctx.longValue("DescribeTableStatisticsResponse.Items["+ i +"].RowCount"));
			tableStatisticRecords.setDataSize(_ctx.longValue("DescribeTableStatisticsResponse.Items["+ i +"].DataSize"));
			tableStatisticRecords.setIndexSize(_ctx.longValue("DescribeTableStatisticsResponse.Items["+ i +"].IndexSize"));
			tableStatisticRecords.setPrimaryKeyIndexSize(_ctx.longValue("DescribeTableStatisticsResponse.Items["+ i +"].PrimaryKeyIndexSize"));
			tableStatisticRecords.setPartitionCount(_ctx.longValue("DescribeTableStatisticsResponse.Items["+ i +"].PartitionCount"));
			tableStatisticRecords.setColdDataSize(_ctx.longValue("DescribeTableStatisticsResponse.Items["+ i +"].ColdDataSize"));
			tableStatisticRecords.setSpaceRatio(_ctx.doubleValue("DescribeTableStatisticsResponse.Items["+ i +"].SpaceRatio"));
			tableStatisticRecords.setTotalSize(_ctx.longValue("DescribeTableStatisticsResponse.Items["+ i +"].TotalSize"));
			tableStatisticRecords.setHotDataSize(_ctx.longValue("DescribeTableStatisticsResponse.Items["+ i +"].HotDataSize"));
			tableStatisticRecords.setOtherSize(_ctx.longValue("DescribeTableStatisticsResponse.Items["+ i +"].OtherSize"));

			items.add(tableStatisticRecords);
		}
		describeTableStatisticsResponse.setItems(items);
	 
	 	return describeTableStatisticsResponse;
	}
}