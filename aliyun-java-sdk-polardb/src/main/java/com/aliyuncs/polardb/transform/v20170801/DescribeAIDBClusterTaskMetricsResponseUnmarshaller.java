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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterTaskMetricsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterTaskMetricsResponse.Items;
import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterTaskMetricsResponse.Items.SlsMetricsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAIDBClusterTaskMetricsResponseUnmarshaller {

	public static DescribeAIDBClusterTaskMetricsResponse unmarshall(DescribeAIDBClusterTaskMetricsResponse describeAIDBClusterTaskMetricsResponse, UnmarshallerContext _ctx) {
		
		describeAIDBClusterTaskMetricsResponse.setRequestId(_ctx.stringValue("DescribeAIDBClusterTaskMetricsResponse.RequestId"));
		describeAIDBClusterTaskMetricsResponse.setPageRecordCount(_ctx.integerValue("DescribeAIDBClusterTaskMetricsResponse.PageRecordCount"));
		describeAIDBClusterTaskMetricsResponse.setPageSize(_ctx.longValue("DescribeAIDBClusterTaskMetricsResponse.PageSize"));
		describeAIDBClusterTaskMetricsResponse.setPageNumber(_ctx.longValue("DescribeAIDBClusterTaskMetricsResponse.PageNumber"));
		describeAIDBClusterTaskMetricsResponse.setStartTime(_ctx.stringValue("DescribeAIDBClusterTaskMetricsResponse.StartTime"));
		describeAIDBClusterTaskMetricsResponse.setEndTime(_ctx.stringValue("DescribeAIDBClusterTaskMetricsResponse.EndTime"));
		describeAIDBClusterTaskMetricsResponse.setMetricType(_ctx.stringValue("DescribeAIDBClusterTaskMetricsResponse.MetricType"));
		describeAIDBClusterTaskMetricsResponse.setDBClusterId(_ctx.stringValue("DescribeAIDBClusterTaskMetricsResponse.DBClusterId"));
		describeAIDBClusterTaskMetricsResponse.setRelativeDbClusterId(_ctx.stringValue("DescribeAIDBClusterTaskMetricsResponse.RelativeDbClusterId"));

		Items items = new Items();

		List<SlsMetricsItem> slsMetricsItems = new ArrayList<SlsMetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAIDBClusterTaskMetricsResponse.Items.SlsMetricsItems.Length"); i++) {
			SlsMetricsItem slsMetricsItem = new SlsMetricsItem();
			slsMetricsItem.setTimestamp(_ctx.stringValue("DescribeAIDBClusterTaskMetricsResponse.Items.SlsMetricsItems["+ i +"].Timestamp"));
			slsMetricsItem.setLogTime(_ctx.stringValue("DescribeAIDBClusterTaskMetricsResponse.Items.SlsMetricsItems["+ i +"].LogTime"));
			slsMetricsItem.setCurrentStep(_ctx.integerValue("DescribeAIDBClusterTaskMetricsResponse.Items.SlsMetricsItems["+ i +"].CurrentStep"));
			slsMetricsItem.setGlobalStep(_ctx.integerValue("DescribeAIDBClusterTaskMetricsResponse.Items.SlsMetricsItems["+ i +"].GlobalStep"));
			slsMetricsItem.setEpoch(_ctx.doubleValue("DescribeAIDBClusterTaskMetricsResponse.Items.SlsMetricsItems["+ i +"].Epoch"));
			slsMetricsItem.setMetricType(_ctx.stringValue("DescribeAIDBClusterTaskMetricsResponse.Items.SlsMetricsItems["+ i +"].MetricType"));
			slsMetricsItem.setMetric(_ctx.mapValue("DescribeAIDBClusterTaskMetricsResponse.Items.SlsMetricsItems["+ i +"].Metric"));

			slsMetricsItems.add(slsMetricsItem);
		}
		items.setSlsMetricsItems(slsMetricsItems);
		describeAIDBClusterTaskMetricsResponse.setItems(items);
	 
	 	return describeAIDBClusterTaskMetricsResponse;
	}
}