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

package com.aliyuncs.pts.transform.v20201020;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20201020.GetJMeterSampleMetricsResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJMeterSampleMetricsResponseUnmarshaller {

	public static GetJMeterSampleMetricsResponse unmarshall(GetJMeterSampleMetricsResponse getJMeterSampleMetricsResponse, UnmarshallerContext _ctx) {
		
		getJMeterSampleMetricsResponse.setRequestId(_ctx.stringValue("GetJMeterSampleMetricsResponse.RequestId"));
		getJMeterSampleMetricsResponse.setMessage(_ctx.stringValue("GetJMeterSampleMetricsResponse.Message"));
		getJMeterSampleMetricsResponse.setSamplerMap(_ctx.mapValue("GetJMeterSampleMetricsResponse.SamplerMap"));
		getJMeterSampleMetricsResponse.setCode(_ctx.stringValue("GetJMeterSampleMetricsResponse.Code"));
		getJMeterSampleMetricsResponse.setSuccess(_ctx.booleanValue("GetJMeterSampleMetricsResponse.Success"));

		List<String> sampleMetricList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetJMeterSampleMetricsResponse.SampleMetricList.Length"); i++) {
			sampleMetricList.add(_ctx.stringValue("GetJMeterSampleMetricsResponse.SampleMetricList["+ i +"]"));
		}
		getJMeterSampleMetricsResponse.setSampleMetricList(sampleMetricList);
	 
	 	return getJMeterSampleMetricsResponse;
	}
}