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
		statistics.setBytesRead(_ctx.integerValue("DescribeProcessListResponse.ProcessList.Statistics.BytesRead"));
		statistics.setElapsedTime(_ctx.floatValue("DescribeProcessListResponse.ProcessList.Statistics.ElapsedTime"));
		statistics.setRowsRead(_ctx.integerValue("DescribeProcessListResponse.ProcessList.Statistics.RowsRead"));
		processList.setStatistics(statistics);

		List<ResultSet> data = new ArrayList<ResultSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProcessListResponse.ProcessList.Data.Length"); i++) {
			ResultSet resultSet = new ResultSet();
			resultSet.setInitialQueryId(_ctx.stringValue("DescribeProcessListResponse.ProcessList.Data["+ i +"].InitialQueryId"));
			resultSet.setInitialUser(_ctx.stringValue("DescribeProcessListResponse.ProcessList.Data["+ i +"].InitialUser"));
			resultSet.setInitialAddress(_ctx.stringValue("DescribeProcessListResponse.ProcessList.Data["+ i +"].InitialAddress"));
			resultSet.setQueryDurationMs(_ctx.stringValue("DescribeProcessListResponse.ProcessList.Data["+ i +"].QueryDurationMs"));
			resultSet.setQueryStartTime(_ctx.stringValue("DescribeProcessListResponse.ProcessList.Data["+ i +"].QueryStartTime"));
			resultSet.setQuery(_ctx.stringValue("DescribeProcessListResponse.ProcessList.Data["+ i +"].Query"));

			data.add(resultSet);
		}
		processList.setData(data);

		List<ResultSet1> tableSchema = new ArrayList<ResultSet1>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProcessListResponse.ProcessList.TableSchema.Length"); i++) {
			ResultSet1 resultSet1 = new ResultSet1();
			resultSet1.setName(_ctx.stringValue("DescribeProcessListResponse.ProcessList.TableSchema["+ i +"].Name"));
			resultSet1.setType(_ctx.stringValue("DescribeProcessListResponse.ProcessList.TableSchema["+ i +"].Type"));

			tableSchema.add(resultSet1);
		}
		processList.setTableSchema(tableSchema);
		describeProcessListResponse.setProcessList(processList);
	 
	 	return describeProcessListResponse;
	}
}