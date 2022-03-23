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
		statistics.setRowsRead(_ctx.integerValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Statistics.RowsRead"));
		statistics.setElapsedTime(_ctx.floatValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Statistics.ElapsedTime"));
		statistics.setBytesRead(_ctx.integerValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Statistics.BytesRead"));
		slowLogRecords.setStatistics(statistics);

		List<ResultSet> tableSchema = new ArrayList<ResultSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogRecordsResponse.SlowLogRecords.TableSchema.Length"); i++) {
			ResultSet resultSet = new ResultSet();
			resultSet.setType(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.TableSchema["+ i +"].Type"));
			resultSet.setName(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.TableSchema["+ i +"].Name"));

			tableSchema.add(resultSet);
		}
		slowLogRecords.setTableSchema(tableSchema);

		List<ResultSet1> data = new ArrayList<ResultSet1>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data.Length"); i++) {
			ResultSet1 resultSet1 = new ResultSet1();
			resultSet1.setType(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].Type"));
			resultSet1.setQueryStartTime(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].QueryStartTime"));
			resultSet1.setQuery(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].Query"));
			resultSet1.setReadRows(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].ReadRows"));
			resultSet1.setInitialAddress(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].InitialAddress"));
			resultSet1.setMemoryUsage(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].MemoryUsage"));
			resultSet1.setInitialUser(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].InitialUser"));
			resultSet1.setInitialQueryId(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].InitialQueryId"));
			resultSet1.setReadBytes(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].ReadBytes"));
			resultSet1.setQueryDurationMs(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].QueryDurationMs"));
			resultSet1.setResultBytes(_ctx.stringValue("DescribeSlowLogRecordsResponse.SlowLogRecords.Data["+ i +"].ResultBytes"));

			data.add(resultSet1);
		}
		slowLogRecords.setData(data);
		describeSlowLogRecordsResponse.setSlowLogRecords(slowLogRecords);
	 
	 	return describeSlowLogRecordsResponse;
	}
}