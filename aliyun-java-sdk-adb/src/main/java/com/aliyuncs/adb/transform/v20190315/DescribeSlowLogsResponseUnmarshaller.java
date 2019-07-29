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

import com.aliyuncs.adb.model.v20190315.DescribeSlowLogsResponse;
import com.aliyuncs.adb.model.v20190315.DescribeSlowLogsResponse.SlowLogItem;
import com.aliyuncs.adb.model.v20190315.DescribeSlowLogsResponse.SlowLogItem.SeriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogsResponseUnmarshaller {

	public static DescribeSlowLogsResponse unmarshall(DescribeSlowLogsResponse describeSlowLogsResponse, UnmarshallerContext _ctx) {
		
		describeSlowLogsResponse.setRequestId(_ctx.stringValue("DescribeSlowLogsResponse.RequestId"));
		describeSlowLogsResponse.setDBClusterId(_ctx.stringValue("DescribeSlowLogsResponse.DBClusterId"));
		describeSlowLogsResponse.setStartTime(_ctx.stringValue("DescribeSlowLogsResponse.StartTime"));
		describeSlowLogsResponse.setEndTime(_ctx.stringValue("DescribeSlowLogsResponse.EndTime"));

		List<SlowLogItem> slowLogs = new ArrayList<SlowLogItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogsResponse.SlowLogs.Length"); i++) {
			SlowLogItem slowLogItem = new SlowLogItem();
			slowLogItem.setKey(_ctx.stringValue("DescribeSlowLogsResponse.SlowLogs["+ i +"].Key"));
			slowLogItem.setUnit(_ctx.stringValue("DescribeSlowLogsResponse.SlowLogs["+ i +"].Unit"));

			List<SeriesItem> series = new ArrayList<SeriesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSlowLogsResponse.SlowLogs["+ i +"].Series.Length"); j++) {
				SeriesItem seriesItem = new SeriesItem();
				seriesItem.setName(_ctx.stringValue("DescribeSlowLogsResponse.SlowLogs["+ i +"].Series["+ j +"].Name"));
				seriesItem.setValues(_ctx.stringValue("DescribeSlowLogsResponse.SlowLogs["+ i +"].Series["+ j +"].Values"));

				series.add(seriesItem);
			}
			slowLogItem.setSeries(series);

			slowLogs.add(slowLogItem);
		}
		describeSlowLogsResponse.setSlowLogs(slowLogs);
	 
	 	return describeSlowLogsResponse;
	}
}