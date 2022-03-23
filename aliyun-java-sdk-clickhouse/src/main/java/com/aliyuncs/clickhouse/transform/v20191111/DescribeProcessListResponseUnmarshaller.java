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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeProcessListResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeProcessListResponse.ProcessList;
import com.aliyuncs.clickhouse.model.v20191111.DescribeProcessListResponse.ProcessList.ResultSet;
import com.aliyuncs.clickhouse.model.v20191111.DescribeProcessListResponse.ProcessList.ResultSet1;
import com.aliyuncs.clickhouse.model.v20191111.DescribeProcessListResponse.ProcessList.Statistics;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProcessListResponseUnmarshaller {

	public static DescribeProcessListResponse unmarshall(DescribeProcessListResponse describeProcessListResponse, UnmarshallerContext _ctx) {
		
		describeProcessListResponse.setRequestId(_ctx.stringValue("DescribeProcessListResponse.RequestId"));

		ProcessList processList = new ProcessList();
		processList.setRows(_ctx.stringValue("DescribeProcessListResponse.ProcessList.Rows"));
		processList.setRowsBeforeLimitAtLeast(_ctx.stringValue("DescribeProcessListResponse.ProcessList.RowsBeforeLimitAtLeast"));

		Statistics statistics = new Statistics();
		statistics.setRowsRead(_ctx.integerValue("DescribeProcessListResponse.ProcessList.Statistics.RowsRead"));
		statistics.setElapsedTime(_ctx.floatValue("DescribeProcessListResponse.ProcessList.Statistics.ElapsedTime"));
		statistics.setBytesRead(_ctx.integerValue("DescribeProcessListResponse.ProcessList.Statistics.BytesRead"));
		processList.setStatistics(statistics);

		List<ResultSet> tableSchema = new ArrayList<ResultSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProcessListResponse.ProcessList.TableSchema.Length"); i++) {
			ResultSet resultSet = new ResultSet();
			resultSet.setType(_ctx.stringValue("DescribeProcessListResponse.ProcessList.TableSchema["+ i +"].Type"));
			resultSet.setName(_ctx.stringValue("DescribeProcessListResponse.ProcessList.TableSchema["+ i +"].Name"));

			tableSchema.add(resultSet);
		}
		processList.setTableSchema(tableSchema);

		List<ResultSet1> data = new ArrayList<ResultSet1>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProcessListResponse.ProcessList.Data.Length"); i++) {
			ResultSet1 resultSet1 = new ResultSet1();
			resultSet1.setQueryStartTime(_ctx.stringValue("DescribeProcessListResponse.ProcessList.Data["+ i +"].QueryStartTime"));
			resultSet1.setQuery(_ctx.stringValue("DescribeProcessListResponse.ProcessList.Data["+ i +"].Query"));
			resultSet1.setInitialAddress(_ctx.stringValue("DescribeProcessListResponse.ProcessList.Data["+ i +"].InitialAddress"));
			resultSet1.setInitialQueryId(_ctx.stringValue("DescribeProcessListResponse.ProcessList.Data["+ i +"].InitialQueryId"));
			resultSet1.setInitialUser(_ctx.stringValue("DescribeProcessListResponse.ProcessList.Data["+ i +"].InitialUser"));
			resultSet1.setQueryDurationMs(_ctx.stringValue("DescribeProcessListResponse.ProcessList.Data["+ i +"].QueryDurationMs"));

			data.add(resultSet1);
		}
		processList.setData(data);
		describeProcessListResponse.setProcessList(processList);
	 
	 	return describeProcessListResponse;
	}
}