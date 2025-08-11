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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDBProxyPerformanceResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBProxyPerformanceResponse.PerformanceKey;
import com.aliyuncs.rds.model.v20140815.DescribeDBProxyPerformanceResponse.PerformanceKey.PerformanceValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBProxyPerformanceResponseUnmarshaller {

	public static DescribeDBProxyPerformanceResponse unmarshall(DescribeDBProxyPerformanceResponse describeDBProxyPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeDBProxyPerformanceResponse.setRequestId(_ctx.stringValue("DescribeDBProxyPerformanceResponse.RequestId"));
		describeDBProxyPerformanceResponse.setEndTime(_ctx.stringValue("DescribeDBProxyPerformanceResponse.EndTime"));
		describeDBProxyPerformanceResponse.setStartTime(_ctx.stringValue("DescribeDBProxyPerformanceResponse.StartTime"));
		describeDBProxyPerformanceResponse.setDBInstanceId(_ctx.stringValue("DescribeDBProxyPerformanceResponse.DBInstanceId"));
		describeDBProxyPerformanceResponse.setDBProxyEngineType(_ctx.stringValue("DescribeDBProxyPerformanceResponse.DBProxyEngineType"));

		List<PerformanceKey> performanceKeys = new ArrayList<PerformanceKey>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBProxyPerformanceResponse.PerformanceKeys.Length"); i++) {
			PerformanceKey performanceKey = new PerformanceKey();
			performanceKey.setValueFormat(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].ValueFormat"));
			performanceKey.setKey(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Key"));
			performanceKey.setService(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Service"));
			performanceKey.setNode(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Node"));
			performanceKey.setServer(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Server"));

			List<PerformanceValue> values = new ArrayList<PerformanceValue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Values.Length"); j++) {
				PerformanceValue performanceValue = new PerformanceValue();
				performanceValue.setDate(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Values["+ j +"].Date"));
				performanceValue.setValue(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Values["+ j +"].Value"));

				values.add(performanceValue);
			}
			performanceKey.setValues(values);

			performanceKeys.add(performanceKey);
		}
		describeDBProxyPerformanceResponse.setPerformanceKeys(performanceKeys);
	 
	 	return describeDBProxyPerformanceResponse;
	}
}