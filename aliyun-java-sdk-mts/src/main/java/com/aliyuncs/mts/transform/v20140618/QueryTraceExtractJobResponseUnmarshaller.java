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

package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.QueryTraceExtractJobResponse;
import com.aliyuncs.mts.model.v20140618.QueryTraceExtractJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTraceExtractJobResponseUnmarshaller {

	public static QueryTraceExtractJobResponse unmarshall(QueryTraceExtractJobResponse queryTraceExtractJobResponse, UnmarshallerContext _ctx) {
		
		queryTraceExtractJobResponse.setRequestId(_ctx.stringValue("QueryTraceExtractJobResponse.RequestId"));
		queryTraceExtractJobResponse.setMessage(_ctx.stringValue("QueryTraceExtractJobResponse.Message"));
		queryTraceExtractJobResponse.setStatusCode(_ctx.longValue("QueryTraceExtractJobResponse.StatusCode"));

		Data data = new Data();
		data.setTrace(_ctx.stringValue("QueryTraceExtractJobResponse.Data.Trace"));
		queryTraceExtractJobResponse.setData(data);
	 
	 	return queryTraceExtractJobResponse;
	}
}