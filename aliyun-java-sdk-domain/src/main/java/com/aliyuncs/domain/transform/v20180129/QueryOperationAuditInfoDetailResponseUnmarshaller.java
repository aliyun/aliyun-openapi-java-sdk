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

package com.aliyuncs.domain.transform.v20180129;

import com.aliyuncs.domain.model.v20180129.QueryOperationAuditInfoDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOperationAuditInfoDetailResponseUnmarshaller {

	public static QueryOperationAuditInfoDetailResponse unmarshall(QueryOperationAuditInfoDetailResponse queryOperationAuditInfoDetailResponse, UnmarshallerContext _ctx) {
		
		queryOperationAuditInfoDetailResponse.setRequestId(_ctx.stringValue("QueryOperationAuditInfoDetailResponse.RequestId"));
		queryOperationAuditInfoDetailResponse.setId(_ctx.stringValue("QueryOperationAuditInfoDetailResponse.Id"));
		queryOperationAuditInfoDetailResponse.setCreateTime(_ctx.longValue("QueryOperationAuditInfoDetailResponse.CreateTime"));
		queryOperationAuditInfoDetailResponse.setUpdateTime(_ctx.longValue("QueryOperationAuditInfoDetailResponse.UpdateTime"));
		queryOperationAuditInfoDetailResponse.setBusinessName(_ctx.stringValue("QueryOperationAuditInfoDetailResponse.BusinessName"));
		queryOperationAuditInfoDetailResponse.setDomainName(_ctx.stringValue("QueryOperationAuditInfoDetailResponse.DomainName"));
		queryOperationAuditInfoDetailResponse.setAuditType(_ctx.integerValue("QueryOperationAuditInfoDetailResponse.AuditType"));
		queryOperationAuditInfoDetailResponse.setAuditStatus(_ctx.integerValue("QueryOperationAuditInfoDetailResponse.AuditStatus"));
		queryOperationAuditInfoDetailResponse.setAuditInfo(_ctx.stringValue("QueryOperationAuditInfoDetailResponse.AuditInfo"));
		queryOperationAuditInfoDetailResponse.setRemark(_ctx.stringValue("QueryOperationAuditInfoDetailResponse.Remark"));
	 
	 	return queryOperationAuditInfoDetailResponse;
	}
}