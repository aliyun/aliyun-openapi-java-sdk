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

import com.aliyuncs.clickhouse.model.v20191111.DescribeSlowLogTrendResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeSlowLogTrendResponse.SlowLogTrend;
import com.aliyuncs.clickhouse.model.v20191111.DescribeSlowLogTrendResponse.SlowLogTrend.ResultSet;
import com.aliyuncs.clickhouse.model.v20191111.DescribeSlowLogTrendResponse.SlowLogTrend.ResultSet1;
import com.aliyuncs.clickhouse.model.v20191111.DescribeSlowLogTrendResponse.SlowLogTrend.Statistics;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogTrendResponseUnmarshaller {

	public static DescribeSlowLogTrendResponse unmarshall(DescribeSlowLogTrendResponse describeSlowLogTrendResponse, UnmarshallerContext _ctx) {
		
		describeSlowLogTrendResponse.setRequestId(_ctx.stringValue("DescribeSlowLogTrendResponse.RequestId"));

		SlowLogTrend slowLogTrend = new SlowLogTrend();
		slowLogTrend.setRows(_ctx.stringValue("DescribeSlowLogTrendResponse.SlowLogTrend.Rows"));
		slowLogTrend.setRowsBeforeLimitAtLeast(_ctx.stringValue("DescribeSlowLogTrendResponse.SlowLogTrend.RowsBeforeLimitAtLeast"));

		Statistics statistics = new Statistics();
		statistics.setBytesRead(_ctx.integerValue("DescribeSlowLogTrendResponse.SlowLogTrend.Statistics.BytesRead"));
		statistics.setElapsedTime(_ctx.floatValue("DescribeSlowLogTrendResponse.SlowLogTrend.Statistics.ElapsedTime"));
		statistics.setRowsRead(_ctx.integerValue("DescribeSlowLogTrendResponse.SlowLogTrend.Statistics.RowsRead"));
		slowLogTrend.setStatistics(statistics);

		List<ResultSet> data = new ArrayList<ResultSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogTrendResponse.SlowLogTrend.Data.Length"); i++) {
			ResultSet resultSet = new ResultSet();
			resultSet.setMaxQueryDurationMs(_ctx.stringValue("DescribeSlowLogTrendResponse.SlowLogTrend.Data["+ i +"].MaxQueryDurationMs"));
			resultSet.setCount(_ctx.stringValue("DescribeSlowLogTrendResponse.SlowLogTrend.Data["+ i +"].Count"));
			resultSet.setMinQueryDurationMs(_ctx.stringValue("DescribeSlowLogTrendResponse.SlowLogTrend.Data["+ i +"].MinQueryDurationMs"));
			resultSet.setAvgQueryDurationMs(_ctx.stringValue("DescribeSlowLogTrendResponse.SlowLogTrend.Data["+ i +"].AvgQueryDurationMs"));
			resultSet.setQueryStartTime(_ctx.stringValue("DescribeSlowLogTrendResponse.SlowLogTrend.Data["+ i +"].QueryStartTime"));

			data.add(resultSet);
		}
		slowLogTrend.setData(data);

		List<ResultSet1> tableSchema = new ArrayList<ResultSet1>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogTrendResponse.SlowLogTrend.TableSchema.Length"); i++) {
			ResultSet1 resultSet1 = new ResultSet1();
			resultSet1.setName(_ctx.stringValue("DescribeSlowLogTrendResponse.SlowLogTrend.TableSchema["+ i +"].Name"));
			resultSet1.setType(_ctx.stringValue("DescribeSlowLogTrendResponse.SlowLogTrend.TableSchema["+ i +"].Type"));

			tableSchema.add(resultSet1);
		}
		slowLogTrend.setTableSchema(tableSchema);
		describeSlowLogTrendResponse.setSlowLogTrend(slowLogTrend);
	 
	 	return describeSlowLogTrendResponse;
	}
}