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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.QueryOperationAuditInfoListResponse;
import com.aliyuncs.domain.model.v20180129.QueryOperationAuditInfoListResponse.OperationAuditRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOperationAuditInfoListResponseUnmarshaller {

	public static QueryOperationAuditInfoListResponse unmarshall(QueryOperationAuditInfoListResponse queryOperationAuditInfoListResponse, UnmarshallerContext _ctx) {
		
		queryOperationAuditInfoListResponse.setRequestId(_ctx.stringValue("QueryOperationAuditInfoListResponse.RequestId"));
		queryOperationAuditInfoListResponse.setPrePage(_ctx.booleanValue("QueryOperationAuditInfoListResponse.PrePage"));
		queryOperationAuditInfoListResponse.setCurrentPageNum(_ctx.integerValue("QueryOperationAuditInfoListResponse.CurrentPageNum"));
		queryOperationAuditInfoListResponse.setPageSize(_ctx.integerValue("QueryOperationAuditInfoListResponse.PageSize"));
		queryOperationAuditInfoListResponse.setTotalPageNum(_ctx.integerValue("QueryOperationAuditInfoListResponse.TotalPageNum"));
		queryOperationAuditInfoListResponse.setTotalItemNum(_ctx.integerValue("QueryOperationAuditInfoListResponse.TotalItemNum"));
		queryOperationAuditInfoListResponse.setNextPage(_ctx.booleanValue("QueryOperationAuditInfoListResponse.NextPage"));

		List<OperationAuditRecord> data = new ArrayList<OperationAuditRecord>();
		for (int i = 0; i < _ctx.lengthValue("QueryOperationAuditInfoListResponse.Data.Length"); i++) {
			OperationAuditRecord operationAuditRecord = new OperationAuditRecord();
			operationAuditRecord.setUpdateTime(_ctx.longValue("QueryOperationAuditInfoListResponse.Data["+ i +"].UpdateTime"));
			operationAuditRecord.setRemark(_ctx.stringValue("QueryOperationAuditInfoListResponse.Data["+ i +"].Remark"));
			operationAuditRecord.setCreateTime(_ctx.longValue("QueryOperationAuditInfoListResponse.Data["+ i +"].CreateTime"));
			operationAuditRecord.setAuditType(_ctx.integerValue("QueryOperationAuditInfoListResponse.Data["+ i +"].AuditType"));
			operationAuditRecord.setBusinessName(_ctx.stringValue("QueryOperationAuditInfoListResponse.Data["+ i +"].BusinessName"));
			operationAuditRecord.setAuditInfo(_ctx.stringValue("QueryOperationAuditInfoListResponse.Data["+ i +"].AuditInfo"));
			operationAuditRecord.setDomainName(_ctx.stringValue("QueryOperationAuditInfoListResponse.Data["+ i +"].DomainName"));
			operationAuditRecord.setAuditStatus(_ctx.integerValue("QueryOperationAuditInfoListResponse.Data["+ i +"].AuditStatus"));
			operationAuditRecord.setId(_ctx.longValue("QueryOperationAuditInfoListResponse.Data["+ i +"].Id"));

			data.add(operationAuditRecord);
		}
		queryOperationAuditInfoListResponse.setData(data);
	 
	 	return queryOperationAuditInfoListResponse;
	}
}