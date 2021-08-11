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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import com.aliyuncs.dyvmsapi.model.v20170525.QueryRtcNumberAuthStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRtcNumberAuthStatusResponseUnmarshaller {

	public static QueryRtcNumberAuthStatusResponse unmarshall(QueryRtcNumberAuthStatusResponse queryRtcNumberAuthStatusResponse, UnmarshallerContext _ctx) {
		
		queryRtcNumberAuthStatusResponse.setRequestId(_ctx.stringValue("QueryRtcNumberAuthStatusResponse.RequestId"));
		queryRtcNumberAuthStatusResponse.setModule(_ctx.stringValue("QueryRtcNumberAuthStatusResponse.Module"));
		queryRtcNumberAuthStatusResponse.setCode(_ctx.stringValue("QueryRtcNumberAuthStatusResponse.Code"));
		queryRtcNumberAuthStatusResponse.setMessage(_ctx.stringValue("QueryRtcNumberAuthStatusResponse.Message"));
	 
	 	return queryRtcNumberAuthStatusResponse;
	}
}