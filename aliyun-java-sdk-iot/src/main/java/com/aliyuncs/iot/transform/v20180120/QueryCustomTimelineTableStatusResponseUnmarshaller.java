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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.QueryCustomTimelineTableStatusResponse;
import com.aliyuncs.iot.model.v20180120.QueryCustomTimelineTableStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCustomTimelineTableStatusResponseUnmarshaller {

	public static QueryCustomTimelineTableStatusResponse unmarshall(QueryCustomTimelineTableStatusResponse queryCustomTimelineTableStatusResponse, UnmarshallerContext _ctx) {
		
		queryCustomTimelineTableStatusResponse.setRequestId(_ctx.stringValue("QueryCustomTimelineTableStatusResponse.RequestId"));
		queryCustomTimelineTableStatusResponse.setSuccess(_ctx.booleanValue("QueryCustomTimelineTableStatusResponse.Success"));
		queryCustomTimelineTableStatusResponse.setCode(_ctx.stringValue("QueryCustomTimelineTableStatusResponse.Code"));
		queryCustomTimelineTableStatusResponse.setErrorMessage(_ctx.stringValue("QueryCustomTimelineTableStatusResponse.ErrorMessage"));

		Data data = new Data();
		data.setHasNext(_ctx.booleanValue("QueryCustomTimelineTableStatusResponse.Data.HasNext"));
		data.setResultJson(_ctx.stringValue("QueryCustomTimelineTableStatusResponse.Data.ResultJson"));
		data.setCount(_ctx.longValue("QueryCustomTimelineTableStatusResponse.Data.Count"));
		data.setPageNum(_ctx.integerValue("QueryCustomTimelineTableStatusResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QueryCustomTimelineTableStatusResponse.Data.PageSize"));
		queryCustomTimelineTableStatusResponse.setData(data);
	 
	 	return queryCustomTimelineTableStatusResponse;
	}
}