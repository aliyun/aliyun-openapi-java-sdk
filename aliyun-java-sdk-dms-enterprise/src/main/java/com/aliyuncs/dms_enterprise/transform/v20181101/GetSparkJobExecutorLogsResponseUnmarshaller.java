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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetSparkJobExecutorLogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSparkJobExecutorLogsResponseUnmarshaller {

	public static GetSparkJobExecutorLogsResponse unmarshall(GetSparkJobExecutorLogsResponse getSparkJobExecutorLogsResponse, UnmarshallerContext _ctx) {
		
		getSparkJobExecutorLogsResponse.setRequestId(_ctx.stringValue("GetSparkJobExecutorLogsResponse.RequestId"));
		getSparkJobExecutorLogsResponse.setSuccess(_ctx.booleanValue("GetSparkJobExecutorLogsResponse.Success"));
		getSparkJobExecutorLogsResponse.setErrorMessage(_ctx.stringValue("GetSparkJobExecutorLogsResponse.ErrorMessage"));
		getSparkJobExecutorLogsResponse.setErrorCode(_ctx.stringValue("GetSparkJobExecutorLogsResponse.ErrorCode"));

		List<String> executorLogs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSparkJobExecutorLogsResponse.ExecutorLogs.Length"); i++) {
			executorLogs.add(_ctx.stringValue("GetSparkJobExecutorLogsResponse.ExecutorLogs["+ i +"]"));
		}
		getSparkJobExecutorLogsResponse.setExecutorLogs(executorLogs);
	 
	 	return getSparkJobExecutorLogsResponse;
	}
}