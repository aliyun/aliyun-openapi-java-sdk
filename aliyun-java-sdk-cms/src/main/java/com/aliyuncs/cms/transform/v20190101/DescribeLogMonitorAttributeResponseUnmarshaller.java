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

import com.aliyuncs.cms.model.v20190101.DescribeLogMonitorAttributeResponse;
import com.aliyuncs.cms.model.v20190101.DescribeLogMonitorAttributeResponse.LogMonitor;
import com.aliyuncs.cms.model.v20190101.DescribeLogMonitorAttributeResponse.LogMonitor.Aggregate;
import com.aliyuncs.cms.model.v20190101.DescribeLogMonitorAttributeResponse.LogMonitor.ValueFilterObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogMonitorAttributeResponseUnmarshaller {

	public static DescribeLogMonitorAttributeResponse unmarshall(DescribeLogMonitorAttributeResponse describeLogMonitorAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLogMonitorAttributeResponse.setRequestId(_ctx.stringValue("DescribeLogMonitorAttributeResponse.RequestId"));
		describeLogMonitorAttributeResponse.setCode(_ctx.stringValue("DescribeLogMonitorAttributeResponse.Code"));
		describeLogMonitorAttributeResponse.setSuccess(_ctx.booleanValue("DescribeLogMonitorAttributeResponse.Success"));
		describeLogMonitorAttributeResponse.setMessage(_ctx.stringValue("DescribeLogMonitorAttributeResponse.Message"));

		LogMonitor logMonitor = new LogMonitor();
		logMonitor.setLogId(_ctx.longValue("DescribeLogMonitorAttributeResponse.LogMonitor.LogId"));
		logMonitor.setSlsRegionId(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.SlsRegionId"));
		logMonitor.setSlsProject(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.SlsProject"));
		logMonitor.setSlsLogstore(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.SlsLogstore"));
		logMonitor.setMetricName(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.MetricName"));
		logMonitor.setMetricExpress(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.MetricExpress"));
		logMonitor.setGmtCreate(_ctx.longValue("DescribeLogMonitorAttributeResponse.LogMonitor.GmtCreate"));
		logMonitor.setValueFilterRelation(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.ValueFilterRelation"));
		logMonitor.setGroupId(_ctx.longValue("DescribeLogMonitorAttributeResponse.LogMonitor.GroupId"));

		List<String> tumblingwindows = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogMonitorAttributeResponse.LogMonitor.Tumblingwindows.Length"); i++) {
			tumblingwindows.add(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.Tumblingwindows["+ i +"]"));
		}
		logMonitor.setTumblingwindows(tumblingwindows);

		List<String> groupbys = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogMonitorAttributeResponse.LogMonitor.Groupbys.Length"); i++) {
			groupbys.add(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.Groupbys["+ i +"]"));
		}
		logMonitor.setGroupbys(groupbys);

		List<Aggregate> aggregates = new ArrayList<Aggregate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogMonitorAttributeResponse.LogMonitor.Aggregates.Length"); i++) {
			Aggregate aggregate = new Aggregate();
			aggregate.setAlias(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.Aggregates["+ i +"].Alias"));
			aggregate.setFieldName(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.Aggregates["+ i +"].FieldName"));
			aggregate.setFunction(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.Aggregates["+ i +"].Function"));
			aggregate.setMin(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.Aggregates["+ i +"].Min"));
			aggregate.setMax(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.Aggregates["+ i +"].Max"));

			aggregates.add(aggregate);
		}
		logMonitor.setAggregates(aggregates);

		List<ValueFilterObject> valueFilter = new ArrayList<ValueFilterObject>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogMonitorAttributeResponse.LogMonitor.ValueFilter.Length"); i++) {
			ValueFilterObject valueFilterObject = new ValueFilterObject();
			valueFilterObject.setKey(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.ValueFilter["+ i +"].Key"));
			valueFilterObject.setOperator(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.ValueFilter["+ i +"].Operator"));
			valueFilterObject.setValue(_ctx.stringValue("DescribeLogMonitorAttributeResponse.LogMonitor.ValueFilter["+ i +"].Value"));

			valueFilter.add(valueFilterObject);
		}
		logMonitor.setValueFilter(valueFilter);
		describeLogMonitorAttributeResponse.setLogMonitor(logMonitor);
	 
	 	return describeLogMonitorAttributeResponse;
	}
}