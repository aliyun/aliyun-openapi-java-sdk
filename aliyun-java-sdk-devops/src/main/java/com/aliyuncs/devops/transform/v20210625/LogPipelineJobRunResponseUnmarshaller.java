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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.LogPipelineJobRunResponse;
import com.aliyuncs.devops.model.v20210625.LogPipelineJobRunResponse.Log;
import com.aliyuncs.transform.UnmarshallerContext;


public class LogPipelineJobRunResponseUnmarshaller {

	public static LogPipelineJobRunResponse unmarshall(LogPipelineJobRunResponse logPipelineJobRunResponse, UnmarshallerContext _ctx) {
		
		logPipelineJobRunResponse.setRequestId(_ctx.stringValue("LogPipelineJobRunResponse.requestId"));
		logPipelineJobRunResponse.setErrorMessage(_ctx.stringValue("LogPipelineJobRunResponse.errorMessage"));
		logPipelineJobRunResponse.setSuccess(_ctx.booleanValue("LogPipelineJobRunResponse.success"));
		logPipelineJobRunResponse.setErrorCode(_ctx.stringValue("LogPipelineJobRunResponse.errorCode"));

		Log log = new Log();
		log.setMore(_ctx.booleanValue("LogPipelineJobRunResponse.log.more"));
		log.setContent(_ctx.stringValue("LogPipelineJobRunResponse.log.content"));
		logPipelineJobRunResponse.setLog(log);
	 
	 	return logPipelineJobRunResponse;
	}
}