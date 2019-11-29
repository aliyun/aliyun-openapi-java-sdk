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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.DescribeSamplingLogResponse;
import com.aliyuncs.pts.model.v20190810.DescribeSamplingLogResponse.SamplingLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSamplingLogResponseUnmarshaller {

	public static DescribeSamplingLogResponse unmarshall(DescribeSamplingLogResponse describeSamplingLogResponse, UnmarshallerContext _ctx) {
		
		describeSamplingLogResponse.setRequestId(_ctx.stringValue("DescribeSamplingLogResponse.RequestId"));
		describeSamplingLogResponse.setMessage(_ctx.stringValue("DescribeSamplingLogResponse.Message"));
		describeSamplingLogResponse.setHttpStatusCode(_ctx.integerValue("DescribeSamplingLogResponse.HttpStatusCode"));
		describeSamplingLogResponse.setSuccess(_ctx.booleanValue("DescribeSamplingLogResponse.Success"));
		describeSamplingLogResponse.setCode(_ctx.stringValue("DescribeSamplingLogResponse.Code"));

		List<SamplingLog> samplingLogs = new ArrayList<SamplingLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSamplingLogResponse.SamplingLogs.Length"); i++) {
			SamplingLog samplingLog = new SamplingLog();
			samplingLog.setChainId(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].ChainId"));
			samplingLog.setTimestamp(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].Timestamp"));
			samplingLog.setHttpRequestMethod(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].HttpRequestMethod"));
			samplingLog.setHttpRequestBody(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].HttpRequestBody"));
			samplingLog.setHttpRequestHeaders(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].HttpRequestHeaders"));
			samplingLog.setHttpRequestUrl(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].HttpRequestUrl"));
			samplingLog.setHttpStartTime(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].HttpStartTime"));
			samplingLog.setHttpResponseBody(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].HttpResponseBody"));
			samplingLog.setHttpResponseFailMsg(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].HttpResponseFailMsg"));
			samplingLog.setHttpResponseHeaders(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].HttpResponseHeaders"));
			samplingLog.setImportContent(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].ImportContent"));
			samplingLog.setExportConfig(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].ExportConfig"));
			samplingLog.setExportContent(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].ExportContent"));
			samplingLog.setCheckResult(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].CheckResult"));
			samplingLog.setHttpTiming(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].HttpTiming"));
			samplingLog.setRt(_ctx.stringValue("DescribeSamplingLogResponse.SamplingLogs["+ i +"].Rt"));

			samplingLogs.add(samplingLog);
		}
		describeSamplingLogResponse.setSamplingLogs(samplingLogs);
	 
	 	return describeSamplingLogResponse;
	}
}