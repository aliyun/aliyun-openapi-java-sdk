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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.QuerySyncReportAggregationResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySyncReportAggregationResponseUnmarshaller {

	public static QuerySyncReportAggregationResponse unmarshall(QuerySyncReportAggregationResponse querySyncReportAggregationResponse, UnmarshallerContext _ctx) {
		
		querySyncReportAggregationResponse.setCode(_ctx.stringValue("QuerySyncReportAggregationResponse.code"));
		querySyncReportAggregationResponse.setMessage(_ctx.stringValue("QuerySyncReportAggregationResponse.message"));
		querySyncReportAggregationResponse.setRequestId(_ctx.stringValue("QuerySyncReportAggregationResponse.requestId"));
		querySyncReportAggregationResponse.setResult(_ctx.mapValue("QuerySyncReportAggregationResponse.result"));
	 
	 	return querySyncReportAggregationResponse;
	}
}