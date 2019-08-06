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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeRDSPerformanceResponse;
import com.aliyuncs.drds.model.v20190123.DescribeRDSPerformanceResponse.PartialPerformanceData;
import com.aliyuncs.drds.model.v20190123.DescribeRDSPerformanceResponse.PartialPerformanceData.PerformanceValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRDSPerformanceResponseUnmarshaller {

	public static DescribeRDSPerformanceResponse unmarshall(DescribeRDSPerformanceResponse describeRDSPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeRDSPerformanceResponse.setRequestId(_ctx.stringValue("DescribeRDSPerformanceResponse.RequestId"));
		describeRDSPerformanceResponse.setSuccess(_ctx.booleanValue("DescribeRDSPerformanceResponse.Success"));

		List<PartialPerformanceData> data = new ArrayList<PartialPerformanceData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRDSPerformanceResponse.Data.Length"); i++) {
			PartialPerformanceData partialPerformanceData = new PartialPerformanceData();
			partialPerformanceData.setKey(_ctx.stringValue("DescribeRDSPerformanceResponse.Data["+ i +"].Key"));
			partialPerformanceData.setUnit(_ctx.stringValue("DescribeRDSPerformanceResponse.Data["+ i +"].Unit"));
			partialPerformanceData.setNodeNum(_ctx.integerValue("DescribeRDSPerformanceResponse.Data["+ i +"].NodeNum"));
			partialPerformanceData.setNodeName(_ctx.stringValue("DescribeRDSPerformanceResponse.Data["+ i +"].NodeName"));

			List<PerformanceValue> values = new ArrayList<PerformanceValue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRDSPerformanceResponse.Data["+ i +"].Values.Length"); j++) {
				PerformanceValue performanceValue = new PerformanceValue();
				performanceValue.setValue(_ctx.stringValue("DescribeRDSPerformanceResponse.Data["+ i +"].Values["+ j +"].Value"));
				performanceValue.setDate(_ctx.longValue("DescribeRDSPerformanceResponse.Data["+ i +"].Values["+ j +"].Date"));

				values.add(performanceValue);
			}
			partialPerformanceData.setValues(values);

			data.add(partialPerformanceData);
		}
		describeRDSPerformanceResponse.setData(data);
	 
	 	return describeRDSPerformanceResponse;
	}
}