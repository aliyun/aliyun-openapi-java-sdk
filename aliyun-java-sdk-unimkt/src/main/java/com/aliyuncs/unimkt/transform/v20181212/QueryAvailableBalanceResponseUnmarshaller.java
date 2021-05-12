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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.QueryAvailableBalanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAvailableBalanceResponseUnmarshaller {

	public static QueryAvailableBalanceResponse unmarshall(QueryAvailableBalanceResponse queryAvailableBalanceResponse, UnmarshallerContext _ctx) {
		
		queryAvailableBalanceResponse.setRequestId(_ctx.stringValue("QueryAvailableBalanceResponse.RequestId"));
		queryAvailableBalanceResponse.setCode(_ctx.integerValue("QueryAvailableBalanceResponse.Code"));
		queryAvailableBalanceResponse.setSuccess(_ctx.booleanValue("QueryAvailableBalanceResponse.Success"));
		queryAvailableBalanceResponse.setErrorMsg(_ctx.stringValue("QueryAvailableBalanceResponse.ErrorMsg"));
		queryAvailableBalanceResponse.setData(_ctx.longValue("QueryAvailableBalanceResponse.Data"));
	 
	 	return queryAvailableBalanceResponse;
	}
}