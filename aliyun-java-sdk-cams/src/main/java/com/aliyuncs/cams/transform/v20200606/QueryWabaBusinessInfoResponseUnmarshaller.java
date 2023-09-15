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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.QueryWabaBusinessInfoResponse;
import com.aliyuncs.cams.model.v20200606.QueryWabaBusinessInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryWabaBusinessInfoResponseUnmarshaller {

	public static QueryWabaBusinessInfoResponse unmarshall(QueryWabaBusinessInfoResponse queryWabaBusinessInfoResponse, UnmarshallerContext _ctx) {
		
		queryWabaBusinessInfoResponse.setRequestId(_ctx.stringValue("QueryWabaBusinessInfoResponse.RequestId"));
		queryWabaBusinessInfoResponse.setCode(_ctx.stringValue("QueryWabaBusinessInfoResponse.Code"));
		queryWabaBusinessInfoResponse.setMessage(_ctx.stringValue("QueryWabaBusinessInfoResponse.Message"));
		queryWabaBusinessInfoResponse.setAccessDeniedDetail(_ctx.stringValue("QueryWabaBusinessInfoResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setBusinessId(_ctx.stringValue("QueryWabaBusinessInfoResponse.Data.BusinessId"));
		data.setBusinessName(_ctx.stringValue("QueryWabaBusinessInfoResponse.Data.BusinessName"));
		data.setVerificationStatus(_ctx.stringValue("QueryWabaBusinessInfoResponse.Data.VerificationStatus"));
		data.setVertical(_ctx.stringValue("QueryWabaBusinessInfoResponse.Data.Vertical"));
		queryWabaBusinessInfoResponse.setData(data);
	 
	 	return queryWabaBusinessInfoResponse;
	}
}