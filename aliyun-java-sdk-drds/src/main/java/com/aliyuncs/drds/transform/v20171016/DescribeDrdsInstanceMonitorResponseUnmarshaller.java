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

import com.aliyuncs.drds.model.v20171016.DescribeDrdsInstanceMonitorResponse;
import com.aliyuncs.drds.model.v20171016.DescribeDrdsInstanceMonitorResponse.PartialPerformanceData;
import com.aliyuncs.drds.model.v20171016.DescribeDrdsInstanceMonitorResponse.PartialPerformanceData.PerformanceValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsInstanceMonitorResponseUnmarshaller {

	public static DescribeDrdsInstanceMonitorResponse unmarshall(DescribeDrdsInstanceMonitorResponse describeDrdsInstanceMonitorResponse, UnmarshallerContext _ctx) {
		
		describeDrdsInstanceMonitorResponse.setRequestId(_ctx.stringValue("DescribeDrdsInstanceMonitorResponse.RequestId"));
		describeDrdsInstanceMonitorResponse.setSuccess(_ctx.booleanValue("DescribeDrdsInstanceMonitorResponse.Success"));

		List<PartialPerformanceData> data = new ArrayList<PartialPerformanceData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsInstanceMonitorResponse.Data.Length"); i++) {
			PartialPerformanceData partialPerformanceData = new PartialPerformanceData();
			partialPerformanceData.setKey(_ctx.stringValue("DescribeDrdsInstanceMonitorResponse.Data["+ i +"].Key"));
			partialPerformanceData.setUnit(_ctx.stringValue("DescribeDrdsInstanceMonitorResponse.Data["+ i +"].Unit"));

			List<PerformanceValue> values = new ArrayList<PerformanceValue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDrdsInstanceMonitorResponse.Data["+ i +"].Values.Length"); j++) {
				PerformanceValue performanceValue = new PerformanceValue();
				performanceValue.setDate(_ctx.longValue("DescribeDrdsInstanceMonitorResponse.Data["+ i +"].Values["+ j +"].Date"));
				performanceValue.setValue(_ctx.stringValue("DescribeDrdsInstanceMonitorResponse.Data["+ i +"].Values["+ j +"].Value"));

				values.add(performanceValue);
			}
			partialPerformanceData.setValues(values);

			data.add(partialPerformanceData);
		}
		describeDrdsInstanceMonitorResponse.setData(data);
	 
	 	return describeDrdsInstanceMonitorResponse;
	}
}