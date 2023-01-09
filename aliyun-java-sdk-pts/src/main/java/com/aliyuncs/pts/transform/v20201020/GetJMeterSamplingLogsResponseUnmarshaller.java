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

import com.aliyuncs.pts.model.v20201020.GetJMeterSamplingLogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJMeterSamplingLogsResponseUnmarshaller {

	public static GetJMeterSamplingLogsResponse unmarshall(GetJMeterSamplingLogsResponse getJMeterSamplingLogsResponse, UnmarshallerContext _ctx) {
		
		getJMeterSamplingLogsResponse.setRequestId(_ctx.stringValue("GetJMeterSamplingLogsResponse.RequestId"));
		getJMeterSamplingLogsResponse.setTotalCount(_ctx.longValue("GetJMeterSamplingLogsResponse.TotalCount"));
		getJMeterSamplingLogsResponse.setMessage(_ctx.stringValue("GetJMeterSamplingLogsResponse.Message"));
		getJMeterSamplingLogsResponse.setPageSize(_ctx.integerValue("GetJMeterSamplingLogsResponse.PageSize"));
		getJMeterSamplingLogsResponse.setPageNumber(_ctx.integerValue("GetJMeterSamplingLogsResponse.PageNumber"));
		getJMeterSamplingLogsResponse.setHttpStatusCode(_ctx.integerValue("GetJMeterSamplingLogsResponse.HttpStatusCode"));
		getJMeterSamplingLogsResponse.setCode(_ctx.stringValue("GetJMeterSamplingLogsResponse.Code"));
		getJMeterSamplingLogsResponse.setSuccess(_ctx.booleanValue("GetJMeterSamplingLogsResponse.Success"));

		List<String> sampleResults = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetJMeterSamplingLogsResponse.SampleResults.Length"); i++) {
			sampleResults.add(_ctx.stringValue("GetJMeterSamplingLogsResponse.SampleResults["+ i +"]"));
		}
		getJMeterSamplingLogsResponse.setSampleResults(sampleResults);
	 
	 	return getJMeterSamplingLogsResponse;
	}
}