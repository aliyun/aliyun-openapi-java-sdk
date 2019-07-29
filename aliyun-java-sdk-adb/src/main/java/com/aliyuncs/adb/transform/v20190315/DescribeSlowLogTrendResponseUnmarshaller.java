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

import com.aliyuncs.adb.model.v20190315.DescribeSlowLogTrendResponse;
import com.aliyuncs.adb.model.v20190315.DescribeSlowLogTrendResponse.SlowLogTrendItem;
import com.aliyuncs.adb.model.v20190315.DescribeSlowLogTrendResponse.SlowLogTrendItem.SeriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogTrendResponseUnmarshaller {

	public static DescribeSlowLogTrendResponse unmarshall(DescribeSlowLogTrendResponse describeSlowLogTrendResponse, UnmarshallerContext _ctx) {
		
		describeSlowLogTrendResponse.setRequestId(_ctx.stringValue("DescribeSlowLogTrendResponse.RequestId"));
		describeSlowLogTrendResponse.setDBClusterId(_ctx.stringValue("DescribeSlowLogTrendResponse.DBClusterId"));
		describeSlowLogTrendResponse.setStartTime(_ctx.stringValue("DescribeSlowLogTrendResponse.StartTime"));
		describeSlowLogTrendResponse.setEndTime(_ctx.stringValue("DescribeSlowLogTrendResponse.EndTime"));

		List<SlowLogTrendItem> items = new ArrayList<SlowLogTrendItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogTrendResponse.Items.Length"); i++) {
			SlowLogTrendItem slowLogTrendItem = new SlowLogTrendItem();
			slowLogTrendItem.setKey(_ctx.stringValue("DescribeSlowLogTrendResponse.Items["+ i +"].Key"));
			slowLogTrendItem.setUnit(_ctx.stringValue("DescribeSlowLogTrendResponse.Items["+ i +"].Unit"));

			List<SeriesItem> series = new ArrayList<SeriesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSlowLogTrendResponse.Items["+ i +"].Series.Length"); j++) {
				SeriesItem seriesItem = new SeriesItem();
				seriesItem.setName(_ctx.stringValue("DescribeSlowLogTrendResponse.Items["+ i +"].Series["+ j +"].Name"));
				seriesItem.setValues(_ctx.stringValue("DescribeSlowLogTrendResponse.Items["+ i +"].Series["+ j +"].Values"));

				series.add(seriesItem);
			}
			slowLogTrendItem.setSeries(series);

			items.add(slowLogTrendItem);
		}
		describeSlowLogTrendResponse.setItems(items);
	 
	 	return describeSlowLogTrendResponse;
	}
}