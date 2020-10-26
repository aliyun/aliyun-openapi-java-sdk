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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.GetSpeechModelPushJobStatisticsResponse;
import com.aliyuncs.iot.model.v20180120.GetSpeechModelPushJobStatisticsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSpeechModelPushJobStatisticsResponseUnmarshaller {

	public static GetSpeechModelPushJobStatisticsResponse unmarshall(GetSpeechModelPushJobStatisticsResponse getSpeechModelPushJobStatisticsResponse, UnmarshallerContext _ctx) {
		
		getSpeechModelPushJobStatisticsResponse.setRequestId(_ctx.stringValue("GetSpeechModelPushJobStatisticsResponse.RequestId"));
		getSpeechModelPushJobStatisticsResponse.setSuccess(_ctx.booleanValue("GetSpeechModelPushJobStatisticsResponse.Success"));
		getSpeechModelPushJobStatisticsResponse.setCode(_ctx.stringValue("GetSpeechModelPushJobStatisticsResponse.Code"));
		getSpeechModelPushJobStatisticsResponse.setErrorMessage(_ctx.stringValue("GetSpeechModelPushJobStatisticsResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotalNum(_ctx.integerValue("GetSpeechModelPushJobStatisticsResponse.Data.TotalNum"));
		data.setSuccessNum(_ctx.integerValue("GetSpeechModelPushJobStatisticsResponse.Data.SuccessNum"));
		data.setTimeoutNum(_ctx.integerValue("GetSpeechModelPushJobStatisticsResponse.Data.TimeoutNum"));
		data.setCancelNum(_ctx.integerValue("GetSpeechModelPushJobStatisticsResponse.Data.CancelNum"));
		data.setRunningNum(_ctx.integerValue("GetSpeechModelPushJobStatisticsResponse.Data.RunningNum"));
		getSpeechModelPushJobStatisticsResponse.setData(data);
	 
	 	return getSpeechModelPushJobStatisticsResponse;
	}
}