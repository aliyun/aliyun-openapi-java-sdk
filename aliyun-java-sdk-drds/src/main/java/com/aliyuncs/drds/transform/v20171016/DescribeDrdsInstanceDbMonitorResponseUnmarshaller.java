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

package com.aliyuncs.drds.transform.v20171016;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20171016.DescribeDrdsInstanceDbMonitorResponse;
import com.aliyuncs.drds.model.v20171016.DescribeDrdsInstanceDbMonitorResponse.PartialPerformanceData;
import com.aliyuncs.drds.model.v20171016.DescribeDrdsInstanceDbMonitorResponse.PartialPerformanceData.PerformanceValue;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsInstanceDbMonitorResponseUnmarshaller {

	public static DescribeDrdsInstanceDbMonitorResponse unmarshall(DescribeDrdsInstanceDbMonitorResponse describeDrdsInstanceDbMonitorResponse, UnmarshallerContext context) {
		
		describeDrdsInstanceDbMonitorResponse.setRequestId(context.stringValue("DescribeDrdsInstanceDbMonitorResponse.RequestId"));
		describeDrdsInstanceDbMonitorResponse.setSuccess(context.booleanValue("DescribeDrdsInstanceDbMonitorResponse.Success"));

		List<PartialPerformanceData> data = new ArrayList<PartialPerformanceData>();
		for (int i = 0; i < context.lengthValue("DescribeDrdsInstanceDbMonitorResponse.Data.Length"); i++) {
			PartialPerformanceData partialPerformanceData = new PartialPerformanceData();
			partialPerformanceData.setKey(context.stringValue("DescribeDrdsInstanceDbMonitorResponse.Data["+ i +"].Key"));
			partialPerformanceData.setUnit(context.stringValue("DescribeDrdsInstanceDbMonitorResponse.Data["+ i +"].Unit"));

			List<PerformanceValue> values = new ArrayList<PerformanceValue>();
			for (int j = 0; j < context.lengthValue("DescribeDrdsInstanceDbMonitorResponse.Data["+ i +"].Values.Length"); j++) {
				PerformanceValue performanceValue = new PerformanceValue();
				performanceValue.setDate(context.longValue("DescribeDrdsInstanceDbMonitorResponse.Data["+ i +"].Values["+ j +"].Date"));
				performanceValue.setValue(context.stringValue("DescribeDrdsInstanceDbMonitorResponse.Data["+ i +"].Values["+ j +"].Value"));

				values.add(performanceValue);
			}
			partialPerformanceData.setValues(values);

			data.add(partialPerformanceData);
		}
		describeDrdsInstanceDbMonitorResponse.setData(data);
	 
	 	return describeDrdsInstanceDbMonitorResponse;
	}
}