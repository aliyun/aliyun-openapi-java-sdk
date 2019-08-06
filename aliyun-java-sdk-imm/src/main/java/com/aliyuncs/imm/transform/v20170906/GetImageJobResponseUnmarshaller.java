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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.GetImageJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageJobResponseUnmarshaller {

	public static GetImageJobResponse unmarshall(GetImageJobResponse getImageJobResponse, UnmarshallerContext _ctx) {
		
		getImageJobResponse.setRequestId(_ctx.stringValue("GetImageJobResponse.RequestId"));
		getImageJobResponse.setJobId(_ctx.stringValue("GetImageJobResponse.JobId"));
		getImageJobResponse.setJobType(_ctx.stringValue("GetImageJobResponse.JobType"));
		getImageJobResponse.setParameters(_ctx.stringValue("GetImageJobResponse.Parameters"));
		getImageJobResponse.setResult(_ctx.stringValue("GetImageJobResponse.Result"));
		getImageJobResponse.setStatus(_ctx.stringValue("GetImageJobResponse.Status"));
		getImageJobResponse.setStartTime(_ctx.stringValue("GetImageJobResponse.StartTime"));
		getImageJobResponse.setEndTime(_ctx.stringValue("GetImageJobResponse.EndTime"));
		getImageJobResponse.setErrorMessage(_ctx.stringValue("GetImageJobResponse.ErrorMessage"));
		getImageJobResponse.setNotifyEndpoint(_ctx.stringValue("GetImageJobResponse.NotifyEndpoint"));
		getImageJobResponse.setNotifyTopicName(_ctx.stringValue("GetImageJobResponse.NotifyTopicName"));
		getImageJobResponse.setProgress(_ctx.integerValue("GetImageJobResponse.Progress"));
	 
	 	return getImageJobResponse;
	}
}