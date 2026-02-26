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

import com.aliyuncs.iot.model.v20180120.QuerySharePromotionActivityAuditResultResponse;
import com.aliyuncs.iot.model.v20180120.QuerySharePromotionActivityAuditResultResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySharePromotionActivityAuditResultResponseUnmarshaller {

	public static QuerySharePromotionActivityAuditResultResponse unmarshall(QuerySharePromotionActivityAuditResultResponse querySharePromotionActivityAuditResultResponse, UnmarshallerContext _ctx) {
		
		querySharePromotionActivityAuditResultResponse.setRequestId(_ctx.stringValue("QuerySharePromotionActivityAuditResultResponse.RequestId"));
		querySharePromotionActivityAuditResultResponse.setSuccess(_ctx.booleanValue("QuerySharePromotionActivityAuditResultResponse.Success"));
		querySharePromotionActivityAuditResultResponse.setCode(_ctx.stringValue("QuerySharePromotionActivityAuditResultResponse.Code"));
		querySharePromotionActivityAuditResultResponse.setErrorMessage(_ctx.stringValue("QuerySharePromotionActivityAuditResultResponse.ErrorMessage"));

		Data data = new Data();
		data.setAuditResult(_ctx.integerValue("QuerySharePromotionActivityAuditResultResponse.Data.AuditResult"));
		querySharePromotionActivityAuditResultResponse.setData(data);
	 
	 	return querySharePromotionActivityAuditResultResponse;
	}
}