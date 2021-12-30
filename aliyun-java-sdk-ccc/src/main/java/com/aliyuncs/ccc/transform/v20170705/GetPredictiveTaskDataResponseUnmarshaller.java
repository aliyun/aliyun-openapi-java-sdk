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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.GetPredictiveTaskDataResponse;
import com.aliyuncs.ccc.model.v20170705.GetPredictiveTaskDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPredictiveTaskDataResponseUnmarshaller {

	public static GetPredictiveTaskDataResponse unmarshall(GetPredictiveTaskDataResponse getPredictiveTaskDataResponse, UnmarshallerContext _ctx) {
		
		getPredictiveTaskDataResponse.setRequestId(_ctx.stringValue("GetPredictiveTaskDataResponse.RequestId"));
		getPredictiveTaskDataResponse.setHttpStatusCode(_ctx.longValue("GetPredictiveTaskDataResponse.HttpStatusCode"));
		getPredictiveTaskDataResponse.setCode(_ctx.stringValue("GetPredictiveTaskDataResponse.Code"));
		getPredictiveTaskDataResponse.setMessage(_ctx.stringValue("GetPredictiveTaskDataResponse.Message"));
		getPredictiveTaskDataResponse.setSuccess(_ctx.stringValue("GetPredictiveTaskDataResponse.Success"));

		Data data = new Data();
		data.setAbandoned(_ctx.booleanValue("GetPredictiveTaskDataResponse.Data.Abandoned"));
		data.setContactId(_ctx.stringValue("GetPredictiveTaskDataResponse.Data.ContactId"));
		data.setAnswered(_ctx.booleanValue("GetPredictiveTaskDataResponse.Data.Answered"));
		data.setConnected(_ctx.booleanValue("GetPredictiveTaskDataResponse.Data.Connected"));
		data.setDialDuration(_ctx.longValue("GetPredictiveTaskDataResponse.Data.DialDuration"));
		data.setEndTime(_ctx.longValue("GetPredictiveTaskDataResponse.Data.EndTime"));
		data.setJobGroupId(_ctx.stringValue("GetPredictiveTaskDataResponse.Data.JobGroupId"));
		data.setQueueDuration(_ctx.longValue("GetPredictiveTaskDataResponse.Data.QueueDuration"));
		data.setStartTime(_ctx.longValue("GetPredictiveTaskDataResponse.Data.StartTime"));
		data.setTalkDuration(_ctx.longValue("GetPredictiveTaskDataResponse.Data.TalkDuration"));
		data.setTaskId(_ctx.stringValue("GetPredictiveTaskDataResponse.Data.TaskId"));
		getPredictiveTaskDataResponse.setData(data);
	 
	 	return getPredictiveTaskDataResponse;
	}
}