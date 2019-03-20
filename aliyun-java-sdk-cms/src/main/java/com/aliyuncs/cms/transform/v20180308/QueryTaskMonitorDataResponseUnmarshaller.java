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

package com.aliyuncs.cms.transform.v20180308;

import com.aliyuncs.cms.model.v20180308.QueryTaskMonitorDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskMonitorDataResponseUnmarshaller {

	public static QueryTaskMonitorDataResponse unmarshall(QueryTaskMonitorDataResponse queryTaskMonitorDataResponse, UnmarshallerContext context) {
		
		queryTaskMonitorDataResponse.setRequestId(context.stringValue("QueryTaskMonitorDataResponse.RequestId"));
		queryTaskMonitorDataResponse.setCode(context.stringValue("QueryTaskMonitorDataResponse.Code"));
		queryTaskMonitorDataResponse.setMessage(context.stringValue("QueryTaskMonitorDataResponse.Message"));
		queryTaskMonitorDataResponse.setSuccess(context.stringValue("QueryTaskMonitorDataResponse.Success"));
		queryTaskMonitorDataResponse.setTraceId(context.stringValue("QueryTaskMonitorDataResponse.TraceId"));
		queryTaskMonitorDataResponse.setData(context.stringValue("QueryTaskMonitorDataResponse.Data"));
		queryTaskMonitorDataResponse.setCursor(context.stringValue("QueryTaskMonitorDataResponse.Cursor"));
	 
	 	return queryTaskMonitorDataResponse;
	}
}