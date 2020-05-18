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

package com.aliyuncs.iotsoc.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotsoc.model.v20190815.GetOperationTrendResponse;
import com.aliyuncs.iotsoc.model.v20190815.GetOperationTrendResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOperationTrendResponseUnmarshaller {

	public static GetOperationTrendResponse unmarshall(GetOperationTrendResponse getOperationTrendResponse, UnmarshallerContext _ctx) {
		
		getOperationTrendResponse.setRequestId(_ctx.stringValue("GetOperationTrendResponse.RequestId"));
		getOperationTrendResponse.setSuccess(_ctx.booleanValue("GetOperationTrendResponse.Success"));
		getOperationTrendResponse.setCode(_ctx.stringValue("GetOperationTrendResponse.Code"));
		getOperationTrendResponse.setMessage(_ctx.stringValue("GetOperationTrendResponse.Message"));

		Data data = new Data();

		List<String> handledAnomalyTrend = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOperationTrendResponse.Data.HandledAnomalyTrend.Length"); i++) {
			handledAnomalyTrend.add(_ctx.stringValue("GetOperationTrendResponse.Data.HandledAnomalyTrend["+ i +"]"));
		}
		data.setHandledAnomalyTrend(handledAnomalyTrend);

		List<String> handledAlarmTrend = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOperationTrendResponse.Data.HandledAlarmTrend.Length"); i++) {
			handledAlarmTrend.add(_ctx.stringValue("GetOperationTrendResponse.Data.HandledAlarmTrend["+ i +"]"));
		}
		data.setHandledAlarmTrend(handledAlarmTrend);

		List<String> fixedVulnerabilityTrend = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOperationTrendResponse.Data.FixedVulnerabilityTrend.Length"); i++) {
			fixedVulnerabilityTrend.add(_ctx.stringValue("GetOperationTrendResponse.Data.FixedVulnerabilityTrend["+ i +"]"));
		}
		data.setFixedVulnerabilityTrend(fixedVulnerabilityTrend);
		getOperationTrendResponse.setData(data);
	 
	 	return getOperationTrendResponse;
	}
}