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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorDataListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorDataListResponse.TimeSeriesItem;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorDataListResponse.TimeSeriesItem.Label;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorDataListResponse.TimeSeriesItem.Value;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHybridMonitorDataListResponseUnmarshaller {

	public static DescribeHybridMonitorDataListResponse unmarshall(DescribeHybridMonitorDataListResponse describeHybridMonitorDataListResponse, UnmarshallerContext _ctx) {
		
		describeHybridMonitorDataListResponse.setRequestId(_ctx.stringValue("DescribeHybridMonitorDataListResponse.RequestId"));
		describeHybridMonitorDataListResponse.setCode(_ctx.stringValue("DescribeHybridMonitorDataListResponse.Code"));
		describeHybridMonitorDataListResponse.setMessage(_ctx.stringValue("DescribeHybridMonitorDataListResponse.Message"));
		describeHybridMonitorDataListResponse.setSuccess(_ctx.stringValue("DescribeHybridMonitorDataListResponse.Success"));

		List<TimeSeriesItem> timeSeries = new ArrayList<TimeSeriesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHybridMonitorDataListResponse.TimeSeries.Length"); i++) {
			TimeSeriesItem timeSeriesItem = new TimeSeriesItem();
			timeSeriesItem.setMetricName(_ctx.stringValue("DescribeHybridMonitorDataListResponse.TimeSeries["+ i +"].MetricName"));

			List<Label> labels = new ArrayList<Label>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHybridMonitorDataListResponse.TimeSeries["+ i +"].Labels.Length"); j++) {
				Label label = new Label();
				label.setK(_ctx.stringValue("DescribeHybridMonitorDataListResponse.TimeSeries["+ i +"].Labels["+ j +"].K"));
				label.setV(_ctx.stringValue("DescribeHybridMonitorDataListResponse.TimeSeries["+ i +"].Labels["+ j +"].V"));

				labels.add(label);
			}
			timeSeriesItem.setLabels(labels);

			List<Value> values = new ArrayList<Value>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHybridMonitorDataListResponse.TimeSeries["+ i +"].Values.Length"); j++) {
				Value value = new Value();
				value.setV(_ctx.stringValue("DescribeHybridMonitorDataListResponse.TimeSeries["+ i +"].Values["+ j +"].V"));
				value.setTs(_ctx.stringValue("DescribeHybridMonitorDataListResponse.TimeSeries["+ i +"].Values["+ j +"].Ts"));

				values.add(value);
			}
			timeSeriesItem.setValues(values);

			timeSeries.add(timeSeriesItem);
		}
		describeHybridMonitorDataListResponse.setTimeSeries(timeSeries);
	 
	 	return describeHybridMonitorDataListResponse;
	}
}