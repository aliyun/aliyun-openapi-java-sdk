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

package com.aliyuncs.cro.transform.v20200102;

import com.aliyuncs.cro.model.v20200102.QueryJobStatusResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryJobStatusResponseUnmarshaller {

	public static QueryJobStatusResponse unmarshall(QueryJobStatusResponse queryJobStatusResponse, UnmarshallerContext _ctx) {
		
		queryJobStatusResponse.setRequestId(_ctx.stringValue("QueryJobStatusResponse.RequestId"));
		queryJobStatusResponse.setCode(_ctx.integerValue("QueryJobStatusResponse.Code"));
		queryJobStatusResponse.setMessage(_ctx.stringValue("QueryJobStatusResponse.Message"));
		queryJobStatusResponse.setStatus(_ctx.integerValue("QueryJobStatusResponse.Status"));
		queryJobStatusResponse.setData(_ctx.mapValue("QueryJobStatusResponse.Data"));
	 
	 	return queryJobStatusResponse;
	}
}