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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeDiagnosticMetricSetsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDiagnosticMetricSetsResponse.MetricSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosticMetricSetsResponseUnmarshaller {

	public static DescribeDiagnosticMetricSetsResponse unmarshall(DescribeDiagnosticMetricSetsResponse describeDiagnosticMetricSetsResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosticMetricSetsResponse.setRequestId(_ctx.stringValue("DescribeDiagnosticMetricSetsResponse.RequestId"));
		describeDiagnosticMetricSetsResponse.setNextToken(_ctx.stringValue("DescribeDiagnosticMetricSetsResponse.NextToken"));

		List<MetricSet> metricSets = new ArrayList<MetricSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosticMetricSetsResponse.MetricSets.Length"); i++) {
			MetricSet metricSet = new MetricSet();
			metricSet.setMetricSetId(_ctx.stringValue("DescribeDiagnosticMetricSetsResponse.MetricSets["+ i +"].MetricSetId"));
			metricSet.setMetricSetName(_ctx.stringValue("DescribeDiagnosticMetricSetsResponse.MetricSets["+ i +"].MetricSetName"));
			metricSet.setDescription(_ctx.stringValue("DescribeDiagnosticMetricSetsResponse.MetricSets["+ i +"].Description"));
			metricSet.setType(_ctx.stringValue("DescribeDiagnosticMetricSetsResponse.MetricSets["+ i +"].Type"));
			metricSet.setResourceType(_ctx.stringValue("DescribeDiagnosticMetricSetsResponse.MetricSets["+ i +"].ResourceType"));

			List<String> metricIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDiagnosticMetricSetsResponse.MetricSets["+ i +"].MetricIds.Length"); j++) {
				metricIds.add(_ctx.stringValue("DescribeDiagnosticMetricSetsResponse.MetricSets["+ i +"].MetricIds["+ j +"]"));
			}
			metricSet.setMetricIds(metricIds);

			metricSets.add(metricSet);
		}
		describeDiagnosticMetricSetsResponse.setMetricSets(metricSets);
	 
	 	return describeDiagnosticMetricSetsResponse;
	}
}