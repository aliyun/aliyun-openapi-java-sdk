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

import com.aliyuncs.clickhouse.model.v20191111.DescribeSlowLogRecordsResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeSlowLogRecordsResponse.SlowLogRecords;
import com.aliyuncs.clickhouse.model.v20191111.DescribeSlowLogRecordsResponse.SlowLogRecords.ResultSet;
import com.aliyuncs.clickhouse.model.v20191111.DescribeSlowLogRecordsResponse.SlowLogRecords.ResultSet1;
import com.aliyuncs.clickhouse.model.v20191111.DescribeSlowLogRecordsResponse.SlowLogRecords.Statistics;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogRecordsResponseUnmarshaller {

	public static DescribeSlowLogRecordsResponse unmarshall(DescribeSlowLogRecordsResponse describeSlowLogRecordsResponse, UnmarshallerContext _ctx) {
		
		describeSlowLogRecordsResponse.setRequestId(_ctx.stringValue("DescribeSlowLogRecordsResponse.RequestId"));

		SlowLogRecords slowLogRecords = new SlowLogRecords();
		slowLogRecords.setRows(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Rows"));
		slowLogRecords.setRowsBeforeLimitAtLeast(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.RowsBeforeLimitAtLeast"));

		Statistics statistics = new Statistics();
		statistics.setBytesRead(_ctx.integerValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Statistics.BytesRead"));
		statistics.setElapsedTime(_ctx.floatValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Statistics.ElapsedTime"));
		statistics.setRowsRead(_ctx.integerValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Statistics.RowsRead"));
		slowLogRecords.setStatistics(statistics);

		List<ResultSet> data = new ArrayList<ResultSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data.Length"); i++) {
			ResultSet resultSet = new ResultSet();
			resultSet.setInitialQueryId(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].InitialQueryId"));
			resultSet.setInitialUser(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].InitialUser"));
			resultSet.setInitialAddress(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].InitialAddress"));
			resultSet.setQueryDurationMs(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].QueryDurationMs"));
			resultSet.setQueryStartTime(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].QueryStartTime"));
			resultSet.setQuery(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].Query"));
			resultSet.setReadRows(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].ReadRows"));
			resultSet.setReadBytes(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].ReadBytes"));
			resultSet.setResultBytes(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].ResultBytes"));
			resultSet.setMemoryUsage(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].MemoryUsage"));
			resultSet.setType(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].Type"));

			data.add(resultSet);
		}
		slowLogRecords.setData(data);

		List<ResultSet1> tableSchema = new ArrayList<ResultSet1>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogRecordsResponse.SlowLogRecords.TableSchema.Length"); i++) {
			ResultSet1 resultSet1 = new ResultSet1();
			resultSet1.setName(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.TableSchema["+ i +"].Name"));
			resultSet1.setType(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.TableSchema["+ i +"].Type"));

			tableSchema.add(resultSet1);
		}
		slowLogRecords.setTableSchema(tableSchema);
		describeSlowLogRecordsResponse.setSlowLogRecords(slowLogRecords);
	 
	 	return describeSlowLogRecordsResponse;
	}
}