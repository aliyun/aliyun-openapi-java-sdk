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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.QueryServiceConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryServiceConfigResponseUnmarshaller {

	public static QueryServiceConfigResponse unmarshall(QueryServiceConfigResponse queryServiceConfigResponse, UnmarshallerContext _ctx) {
		
		queryServiceConfigResponse.setRequestId(_ctx.stringValue("QueryServiceConfigResponse.RequestId"));
		queryServiceConfigResponse.setMessage(_ctx.stringValue("QueryServiceConfigResponse.Message"));
		queryServiceConfigResponse.setData(_ctx.stringValue("QueryServiceConfigResponse.Data"));
		queryServiceConfigResponse.setCode(_ctx.stringValue("QueryServiceConfigResponse.Code"));
		queryServiceConfigResponse.setSuccess(_ctx.booleanValue("QueryServiceConfigResponse.Success"));
	 
	 	return queryServiceConfigResponse;
	}
}