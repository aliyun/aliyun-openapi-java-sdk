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

package com.aliyuncs.quickbi_public.transform.v20210325;

import com.aliyuncs.quickbi_public.model.v20210325.QueryTicketInfoResponse;
import com.aliyuncs.quickbi_public.model.v20210325.QueryTicketInfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTicketInfoResponseUnmarshaller {

	public static QueryTicketInfoResponse unmarshall(QueryTicketInfoResponse queryTicketInfoResponse, UnmarshallerContext _ctx) {
		
		queryTicketInfoResponse.setRequestId(_ctx.stringValue("QueryTicketInfoResponse.RequestId"));
		queryTicketInfoResponse.setSuccess(_ctx.booleanValue("QueryTicketInfoResponse.Success"));

		Result result = new Result();
		result.setAccessTicket(_ctx.stringValue("QueryTicketInfoResponse.Result.AccessTicket"));
		result.setOrganizationId(_ctx.stringValue("QueryTicketInfoResponse.Result.OrganizationId"));
		result.setUserId(_ctx.stringValue("QueryTicketInfoResponse.Result.UserId"));
		result.setUsedTicketNum(_ctx.integerValue("QueryTicketInfoResponse.Result.UsedTicketNum"));
		result.setMaxTicketNum(_ctx.integerValue("QueryTicketInfoResponse.Result.MaxTicketNum"));
		result.setRegisterTime(_ctx.stringValue("QueryTicketInfoResponse.Result.RegisterTime"));
		result.setInvalidTime(_ctx.stringValue("QueryTicketInfoResponse.Result.InvalidTime"));
		result.setWorksId(_ctx.stringValue("QueryTicketInfoResponse.Result.WorksId"));
		result.setCmptId(_ctx.stringValue("QueryTicketInfoResponse.Result.CmptId"));
		result.setGlobalParam(_ctx.stringValue("QueryTicketInfoResponse.Result.GlobalParam"));
		result.setWatermarkParam(_ctx.stringValue("QueryTicketInfoResponse.Result.WatermarkParam"));
		queryTicketInfoResponse.setResult(result);
	 
	 	return queryTicketInfoResponse;
	}
}