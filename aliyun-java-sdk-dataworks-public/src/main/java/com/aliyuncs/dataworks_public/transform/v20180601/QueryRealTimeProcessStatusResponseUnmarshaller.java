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

package com.aliyuncs.dataworks_public.transform.v20180601;

import com.aliyuncs.dataworks_public.model.v20180601.QueryRealTimeProcessStatusResponse;
import com.aliyuncs.dataworks_public.model.v20180601.QueryRealTimeProcessStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRealTimeProcessStatusResponseUnmarshaller {

	public static QueryRealTimeProcessStatusResponse unmarshall(QueryRealTimeProcessStatusResponse queryRealTimeProcessStatusResponse, UnmarshallerContext _ctx) {
		
		queryRealTimeProcessStatusResponse.setRequestId(_ctx.stringValue("QueryRealTimeProcessStatusResponse.RequestId"));
		queryRealTimeProcessStatusResponse.setMessage(_ctx.stringValue("QueryRealTimeProcessStatusResponse.Message"));
		queryRealTimeProcessStatusResponse.setCode(_ctx.integerValue("QueryRealTimeProcessStatusResponse.Code"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("QueryRealTimeProcessStatusResponse.Data.Status"));
		data.setTaskId(_ctx.stringValue("QueryRealTimeProcessStatusResponse.Data.TaskId"));
		data.setTaskUrl(_ctx.stringValue("QueryRealTimeProcessStatusResponse.Data.TaskUrl"));
		data.setMessage(_ctx.stringValue("QueryRealTimeProcessStatusResponse.Data.Message"));
		queryRealTimeProcessStatusResponse.setData(data);
	 
	 	return queryRealTimeProcessStatusResponse;
	}
}