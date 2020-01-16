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

package com.aliyuncs.hitsdb.transform.v20170601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20170601.ExploreHiTSDBInstanceDataMetricListResponse;
import com.aliyuncs.hitsdb.model.v20170601.ExploreHiTSDBInstanceDataMetricListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExploreHiTSDBInstanceDataMetricListResponseUnmarshaller {

	public static ExploreHiTSDBInstanceDataMetricListResponse unmarshall(ExploreHiTSDBInstanceDataMetricListResponse exploreHiTSDBInstanceDataMetricListResponse, UnmarshallerContext _ctx) {
		
		exploreHiTSDBInstanceDataMetricListResponse.setRequestId(_ctx.stringValue("ExploreHiTSDBInstanceDataMetricListResponse.RequestId"));
		exploreHiTSDBInstanceDataMetricListResponse.setInstanceId(_ctx.stringValue("ExploreHiTSDBInstanceDataMetricListResponse.InstanceId"));

		List<Data> metricList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ExploreHiTSDBInstanceDataMetricListResponse.MetricList.Length"); i++) {
			Data data = new Data();
			data.setMetric(_ctx.stringValue("ExploreHiTSDBInstanceDataMetricListResponse.MetricList["+ i +"].Metric"));

			metricList.add(data);
		}
		exploreHiTSDBInstanceDataMetricListResponse.setMetricList(metricList);
	 
	 	return exploreHiTSDBInstanceDataMetricListResponse;
	}
}