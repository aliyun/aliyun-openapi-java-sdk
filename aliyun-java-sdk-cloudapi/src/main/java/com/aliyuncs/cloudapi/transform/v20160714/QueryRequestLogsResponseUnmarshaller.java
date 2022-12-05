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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.QueryRequestLogsResponse;
import com.aliyuncs.cloudapi.model.v20160714.QueryRequestLogsResponse.RequestLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRequestLogsResponseUnmarshaller {

	public static QueryRequestLogsResponse unmarshall(QueryRequestLogsResponse queryRequestLogsResponse, UnmarshallerContext _ctx) {
		
		queryRequestLogsResponse.setRequestId(_ctx.stringValue("QueryRequestLogsResponse.RequestId"));

		List<RequestLog> requestLogs = new ArrayList<RequestLog>();
		for (int i = 0; i < _ctx.lengthValue("QueryRequestLogsResponse.RequestLogs.Length"); i++) {
			RequestLog requestLog = new RequestLog();
			requestLog.setApiId(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].ApiId"));
			requestLog.setApiName(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].ApiName"));
			requestLog.setConsumerAppKey(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].ConsumerAppKey"));
			requestLog.setTotalLatency(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].TotalLatency"));
			requestLog.setHttpMethod(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].HttpMethod"));
			requestLog.setDomain(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].Domain"));
			requestLog.setErrorMessage(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].ErrorMessage"));
			requestLog.setConsumerAppId(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].ConsumerAppId"));
			requestLog.setInstanceId(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].InstanceId"));
			requestLog.setClientNonce(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].ClientNonce"));
			requestLog.setRequestSize(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].RequestSize"));
			requestLog.setStageId(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].StageId"));
			requestLog.setStageName(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].StageName"));
			requestLog.setHttpPath(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].HttpPath"));
			requestLog.setRequestId(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].RequestId"));
			requestLog.setGroupId(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].GroupId"));
			requestLog.setGroupName(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].GroupName"));
			requestLog.setErrorCode(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].ErrorCode"));
			requestLog.setResponseSize(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].ResponseSize"));
			requestLog.setRegion(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].Region"));
			requestLog.setStatusCode(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].StatusCode"));
			requestLog.setClientIp(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].ClientIp"));
			requestLog.setServiceLatency(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].ServiceLatency"));
			requestLog.setRequestTime(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].RequestTime"));
			requestLog.setException(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].Exception"));
			requestLog.setCustomTraceId(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].CustomTraceId"));
			requestLog.setJwtClaims(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].JwtClaims"));
			requestLog.setRequestProtocol(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].RequestProtocol"));
			requestLog.setRequestHeaders(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].RequestHeaders"));
			requestLog.setRequestQueryString(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].RequestQueryString"));
			requestLog.setRequestBody(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].RequestBody"));
			requestLog.setResponseHeaders(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].ResponseHeaders"));
			requestLog.setResponseBody(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].ResponseBody"));
			requestLog.setPlugin(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].plugin"));
			requestLog.setInitialRequestId(_ctx.stringValue("QueryRequestLogsResponse.RequestLogs["+ i +"].InitialRequestId"));

			requestLogs.add(requestLog);
		}
		queryRequestLogsResponse.setRequestLogs(requestLogs);
	 
	 	return queryRequestLogsResponse;
	}
}