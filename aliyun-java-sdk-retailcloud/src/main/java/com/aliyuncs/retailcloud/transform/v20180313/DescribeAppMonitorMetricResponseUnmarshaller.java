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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.DescribeAppMonitorMetricResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribeAppMonitorMetricResponse.MetricItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppMonitorMetricResponseUnmarshaller {

	public static DescribeAppMonitorMetricResponse unmarshall(DescribeAppMonitorMetricResponse describeAppMonitorMetricResponse, UnmarshallerContext _ctx) {
		
		describeAppMonitorMetricResponse.setRequestId(_ctx.stringValue("DescribeAppMonitorMetricResponse.RequestId"));
		describeAppMonitorMetricResponse.setCode(_ctx.integerValue("DescribeAppMonitorMetricResponse.Code"));
		describeAppMonitorMetricResponse.setErrMsg(_ctx.stringValue("DescribeAppMonitorMetricResponse.ErrMsg"));
		describeAppMonitorMetricResponse.setSuccess(_ctx.booleanValue("DescribeAppMonitorMetricResponse.Success"));

		List<MetricItem> result = new ArrayList<MetricItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppMonitorMetricResponse.Result.Length"); i++) {
			MetricItem metricItem = new MetricItem();
			metricItem.setName(_ctx.stringValue("DescribeAppMonitorMetricResponse.Result["+ i +"].Name"));

			List<Float> data = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAppMonitorMetricResponse.Result["+ i +"].Data.Length"); j++) {
				data.add(_ctx.floatValue("DescribeAppMonitorMetricResponse.Result["+ i +"].Data["+ j +"]"));
			}
			metricItem.setData(data);

			List<String> categories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAppMonitorMetricResponse.Result["+ i +"].Categories.Length"); j++) {
				categories.add(_ctx.stringValue("DescribeAppMonitorMetricResponse.Result["+ i +"].Categories["+ j +"]"));
			}
			metricItem.setCategories(categories);

			result.add(metricItem);
		}
		describeAppMonitorMetricResponse.setResult(result);
	 
	 	return describeAppMonitorMetricResponse;
	}
}