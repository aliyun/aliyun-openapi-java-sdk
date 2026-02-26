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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.DescribeMetricLastResponse;
import com.aliyuncs.eds_aic.model.v20230930.DescribeMetricLastResponse.Data;
import com.aliyuncs.eds_aic.model.v20230930.DescribeMetricLastResponse.Data.MetricModelListItem;
import com.aliyuncs.eds_aic.model.v20230930.DescribeMetricLastResponse.Data.MetricModelListItem.DataPointsItem;
import com.aliyuncs.eds_aic.model.v20230930.DescribeMetricLastResponse.Data.MetricModelListItem.ProcessLastInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetricLastResponseUnmarshaller {

	public static DescribeMetricLastResponse unmarshall(DescribeMetricLastResponse describeMetricLastResponse, UnmarshallerContext _ctx) {
		
		describeMetricLastResponse.setRequestId(_ctx.stringValue("DescribeMetricLastResponse.RequestId"));
		describeMetricLastResponse.setCount(_ctx.integerValue("DescribeMetricLastResponse.Count"));
		describeMetricLastResponse.setNextToken(_ctx.stringValue("DescribeMetricLastResponse.NextToken"));

		List<Data> metricTotalModel = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMetricLastResponse.MetricTotalModel.Length"); i++) {
			Data data = new Data();
			data.setAndroidInstanceId(_ctx.stringValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].AndroidInstanceId"));

			List<MetricModelListItem> metricModelList = new ArrayList<MetricModelListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].MetricModelList.Length"); j++) {
				MetricModelListItem metricModelListItem = new MetricModelListItem();
				metricModelListItem.setMetricName(_ctx.stringValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].MetricModelList["+ j +"].MetricName"));

				List<DataPointsItem> dataPoints = new ArrayList<DataPointsItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].MetricModelList["+ j +"].DataPoints.Length"); k++) {
					DataPointsItem dataPointsItem = new DataPointsItem();
					dataPointsItem.setTimestamp(_ctx.longValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].MetricModelList["+ j +"].DataPoints["+ k +"].Timestamp"));
					dataPointsItem.setMinimum(_ctx.doubleValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].MetricModelList["+ j +"].DataPoints["+ k +"].Minimum"));
					dataPointsItem.setAverage(_ctx.doubleValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].MetricModelList["+ j +"].DataPoints["+ k +"].Average"));
					dataPointsItem.setMaximum(_ctx.doubleValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].MetricModelList["+ j +"].DataPoints["+ k +"].Maximum"));

					dataPoints.add(dataPointsItem);
				}
				metricModelListItem.setDataPoints(dataPoints);

				List<ProcessLastInfosItem> processLastInfos = new ArrayList<ProcessLastInfosItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].MetricModelList["+ j +"].ProcessLastInfos.Length"); k++) {
					ProcessLastInfosItem processLastInfosItem = new ProcessLastInfosItem();
					processLastInfosItem.setTimestamp(_ctx.longValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].MetricModelList["+ j +"].ProcessLastInfos["+ k +"].Timestamp"));
					processLastInfosItem.setName(_ctx.stringValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].MetricModelList["+ j +"].ProcessLastInfos["+ k +"].Name"));
					processLastInfosItem.setMemoryUsage(_ctx.doubleValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].MetricModelList["+ j +"].ProcessLastInfos["+ k +"].MemoryUsage"));
					processLastInfosItem.setCpuUsage(_ctx.doubleValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].MetricModelList["+ j +"].ProcessLastInfos["+ k +"].CpuUsage"));

					List<Integer> processIds = new ArrayList<Integer>();
					for (int l = 0; l < _ctx.lengthValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].MetricModelList["+ j +"].ProcessLastInfos["+ k +"].ProcessIds.Length"); l++) {
						processIds.add(_ctx.integerValue("DescribeMetricLastResponse.MetricTotalModel["+ i +"].MetricModelList["+ j +"].ProcessLastInfos["+ k +"].ProcessIds["+ l +"]"));
					}
					processLastInfosItem.setProcessIds(processIds);

					processLastInfos.add(processLastInfosItem);
				}
				metricModelListItem.setProcessLastInfos(processLastInfos);

				metricModelList.add(metricModelListItem);
			}
			data.setMetricModelList(metricModelList);

			metricTotalModel.add(data);
		}
		describeMetricLastResponse.setMetricTotalModel(metricTotalModel);
	 
	 	return describeMetricLastResponse;
	}
}