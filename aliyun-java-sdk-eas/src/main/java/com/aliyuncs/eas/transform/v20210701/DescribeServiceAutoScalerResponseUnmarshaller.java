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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.DescribeServiceAutoScalerResponse;
import com.aliyuncs.eas.model.v20210701.DescribeServiceAutoScalerResponse.CurrentMetric;
import com.aliyuncs.eas.model.v20210701.DescribeServiceAutoScalerResponse.ScaleStrategy;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServiceAutoScalerResponseUnmarshaller {

	public static DescribeServiceAutoScalerResponse unmarshall(DescribeServiceAutoScalerResponse describeServiceAutoScalerResponse, UnmarshallerContext _ctx) {
		
		describeServiceAutoScalerResponse.setRequestId(_ctx.stringValue("DescribeServiceAutoScalerResponse.RequestId"));
		describeServiceAutoScalerResponse.setServiceName(_ctx.stringValue("DescribeServiceAutoScalerResponse.ServiceName"));
		describeServiceAutoScalerResponse.setMinReplica(_ctx.integerValue("DescribeServiceAutoScalerResponse.MinReplica"));
		describeServiceAutoScalerResponse.setMaxReplica(_ctx.integerValue("DescribeServiceAutoScalerResponse.MaxReplica"));
		describeServiceAutoScalerResponse.setBehavior(_ctx.mapValue("DescribeServiceAutoScalerResponse.Behavior"));

		List<ScaleStrategy> scaleStrategies = new ArrayList<ScaleStrategy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceAutoScalerResponse.ScaleStrategies.Length"); i++) {
			ScaleStrategy scaleStrategy = new ScaleStrategy();
			scaleStrategy.setMetricName(_ctx.stringValue("DescribeServiceAutoScalerResponse.ScaleStrategies["+ i +"].metricName"));
			scaleStrategy.setThreshold(_ctx.floatValue("DescribeServiceAutoScalerResponse.ScaleStrategies["+ i +"].threshold"));
			scaleStrategy.setService(_ctx.stringValue("DescribeServiceAutoScalerResponse.ScaleStrategies["+ i +"].service"));

			scaleStrategies.add(scaleStrategy);
		}
		describeServiceAutoScalerResponse.setScaleStrategies(scaleStrategies);

		List<CurrentMetric> currentMetrics = new ArrayList<CurrentMetric>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceAutoScalerResponse.CurrentMetrics.Length"); i++) {
			CurrentMetric currentMetric = new CurrentMetric();
			currentMetric.setMetricName(_ctx.stringValue("DescribeServiceAutoScalerResponse.CurrentMetrics["+ i +"].metricName"));
			currentMetric.setValue(_ctx.floatValue("DescribeServiceAutoScalerResponse.CurrentMetrics["+ i +"].value"));
			currentMetric.setService(_ctx.stringValue("DescribeServiceAutoScalerResponse.CurrentMetrics["+ i +"].service"));

			currentMetrics.add(currentMetric);
		}
		describeServiceAutoScalerResponse.setCurrentMetrics(currentMetrics);
	 
	 	return describeServiceAutoScalerResponse;
	}
}