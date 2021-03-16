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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryDetailMetricConfigResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryDetailMetricConfigResponse.MetricConfig;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryDetailMetricConfigResponse.MetricConfig.AggregationDimension;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryDetailMetricConfigResponseUnmarshaller {

	public static OpsQueryDetailMetricConfigResponse unmarshall(OpsQueryDetailMetricConfigResponse opsQueryDetailMetricConfigResponse, UnmarshallerContext _ctx) {
		
		opsQueryDetailMetricConfigResponse.setRequestId(_ctx.stringValue("OpsQueryDetailMetricConfigResponse.RequestId"));

		List<MetricConfig> metricConfigs = new ArrayList<MetricConfig>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryDetailMetricConfigResponse.MetricConfigs.Length"); i++) {
			MetricConfig metricConfig = new MetricConfig();
			metricConfig.setMetricName(_ctx.stringValue("OpsQueryDetailMetricConfigResponse.MetricConfigs["+ i +"].MetricName"));
			metricConfig.setMetricTarget(_ctx.stringValue("OpsQueryDetailMetricConfigResponse.MetricConfigs["+ i +"].MetricTarget"));
			metricConfig.setMetricDescription(_ctx.stringValue("OpsQueryDetailMetricConfigResponse.MetricConfigs["+ i +"].MetricDescription"));
			metricConfig.setMetricLogStore(_ctx.stringValue("OpsQueryDetailMetricConfigResponse.MetricConfigs["+ i +"].MetricLogStore"));
			metricConfig.setMetricSlsConfigName(_ctx.stringValue("OpsQueryDetailMetricConfigResponse.MetricConfigs["+ i +"].MetricSlsConfigName"));
			metricConfig.setMetricInterval(_ctx.integerValue("OpsQueryDetailMetricConfigResponse.MetricConfigs["+ i +"].MetricInterval"));
			metricConfig.setMetricAnalyse(_ctx.stringValue("OpsQueryDetailMetricConfigResponse.MetricConfigs["+ i +"].MetricAnalyse"));
			metricConfig.setMetricQuery(_ctx.stringValue("OpsQueryDetailMetricConfigResponse.MetricConfigs["+ i +"].MetricQuery"));

			List<String> metricRegions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryDetailMetricConfigResponse.MetricConfigs["+ i +"].MetricRegions.Length"); j++) {
				metricRegions.add(_ctx.stringValue("OpsQueryDetailMetricConfigResponse.MetricConfigs["+ i +"].MetricRegions["+ j +"]"));
			}
			metricConfig.setMetricRegions(metricRegions);

			List<AggregationDimension> aggregationDimensions = new ArrayList<AggregationDimension>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryDetailMetricConfigResponse.MetricConfigs["+ i +"].AggregationDimensions.Length"); j++) {
				AggregationDimension aggregationDimension = new AggregationDimension();
				aggregationDimension.setAggregationMaxCnt(_ctx.integerValue("OpsQueryDetailMetricConfigResponse.MetricConfigs["+ i +"].AggregationDimensions["+ j +"].AggregationMaxCnt"));
				aggregationDimension.setAggregationIndex(_ctx.stringValue("OpsQueryDetailMetricConfigResponse.MetricConfigs["+ i +"].AggregationDimensions["+ j +"].AggregationIndex"));
				aggregationDimension.setAggregationType(_ctx.stringValue("OpsQueryDetailMetricConfigResponse.MetricConfigs["+ i +"].AggregationDimensions["+ j +"].AggregationType"));

				aggregationDimensions.add(aggregationDimension);
			}
			metricConfig.setAggregationDimensions(aggregationDimensions);

			metricConfigs.add(metricConfig);
		}
		opsQueryDetailMetricConfigResponse.setMetricConfigs(metricConfigs);
	 
	 	return opsQueryDetailMetricConfigResponse;
	}
}