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

package com.aliyuncs.beian.transform.v20160810;

import com.aliyuncs.beian.model.v20160810.QueryAccessorDomainStatusResponse;
import com.aliyuncs.beian.model.v20160810.QueryAccessorDomainStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccessorDomainStatusResponseUnmarshaller {

	public static QueryAccessorDomainStatusResponse unmarshall(QueryAccessorDomainStatusResponse queryAccessorDomainStatusResponse, UnmarshallerContext _ctx) {
		
		queryAccessorDomainStatusResponse.setRequestId(_ctx.stringValue("QueryAccessorDomainStatusResponse.RequestId"));
		queryAccessorDomainStatusResponse.setCode(_ctx.integerValue("QueryAccessorDomainStatusResponse.Code"));
		queryAccessorDomainStatusResponse.setMessage(_ctx.stringValue("QueryAccessorDomainStatusResponse.Message"));

		Data data = new Data();
		data.setDomain(_ctx.stringValue("QueryAccessorDomainStatusResponse.Data.Domain"));
		data.setStatus(_ctx.stringValue("QueryAccessorDomainStatusResponse.Data.Status"));
		data.setReasonCode(_ctx.integerValue("QueryAccessorDomainStatusResponse.Data.ReasonCode"));
		data.setReason(_ctx.stringValue("QueryAccessorDomainStatusResponse.Data.Reason"));
		queryAccessorDomainStatusResponse.setData(data);
	 
	 	return queryAccessorDomainStatusResponse;
	}
}