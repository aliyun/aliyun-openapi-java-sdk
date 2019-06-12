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

	public static GetImageJobResponse unmarshall(GetImageJobResponse getImageJobResponse, UnmarshallerContext context) {
		
		getImageJobResponse.setRequestId(context.stringValue("GetImageJobResponse.RequestId"));
		getImageJobResponse.setJobId(context.stringValue("GetImageJobResponse.JobId"));
		getImageJobResponse.setJobType(context.stringValue("GetImageJobResponse.JobType"));
		getImageJobResponse.setParameters(context.stringValue("GetImageJobResponse.Parameters"));
		getImageJobResponse.setResult(context.stringValue("GetImageJobResponse.Result"));
		getImageJobResponse.setStatus(context.stringValue("GetImageJobResponse.Status"));
		getImageJobResponse.setStartTime(context.stringValue("GetImageJobResponse.StartTime"));
		getImageJobResponse.setEndTime(context.stringValue("GetImageJobResponse.EndTime"));
		getImageJobResponse.setErrorMessage(context.stringValue("GetImageJobResponse.ErrorMessage"));
		getImageJobResponse.setNotifyEndpoint(context.stringValue("GetImageJobResponse.NotifyEndpoint"));
		getImageJobResponse.setNotifyTopicName(context.stringValue("GetImageJobResponse.NotifyTopicName"));
		getImageJobResponse.setProgress(context.integerValue("GetImageJobResponse.Progress"));
	 
	 	return getImageJobResponse;
	}
}