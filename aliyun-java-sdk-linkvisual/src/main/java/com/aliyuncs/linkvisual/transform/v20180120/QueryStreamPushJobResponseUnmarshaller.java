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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.QueryStreamPushJobResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryStreamPushJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryStreamPushJobResponseUnmarshaller {

	public static QueryStreamPushJobResponse unmarshall(QueryStreamPushJobResponse queryStreamPushJobResponse, UnmarshallerContext _ctx) {
		
		queryStreamPushJobResponse.setRequestId(_ctx.stringValue("QueryStreamPushJobResponse.RequestId"));
		queryStreamPushJobResponse.setCode(_ctx.stringValue("QueryStreamPushJobResponse.Code"));
		queryStreamPushJobResponse.setErrorMessage(_ctx.stringValue("QueryStreamPushJobResponse.ErrorMessage"));
		queryStreamPushJobResponse.setSuccess(_ctx.booleanValue("QueryStreamPushJobResponse.Success"));

		Data data = new Data();
		data.setJobType(_ctx.integerValue("QueryStreamPushJobResponse.Data.JobType"));
		data.setPushUrl(_ctx.stringValue("QueryStreamPushJobResponse.Data.PushUrl"));
		data.setStreamType(_ctx.integerValue("QueryStreamPushJobResponse.Data.StreamType"));
		data.setCreateTime(_ctx.integerValue("QueryStreamPushJobResponse.Data.CreateTime"));
		data.setPushStatus(_ctx.integerValue("QueryStreamPushJobResponse.Data.PushStatus"));
		queryStreamPushJobResponse.setData(data);
	 
	 	return queryStreamPushJobResponse;
	}
}