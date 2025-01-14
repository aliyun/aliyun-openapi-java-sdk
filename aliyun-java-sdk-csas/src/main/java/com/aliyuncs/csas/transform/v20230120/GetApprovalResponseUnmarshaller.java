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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.GetApprovalResponse;
import com.aliyuncs.csas.model.v20230120.GetApprovalResponse.Data;
import com.aliyuncs.csas.model.v20230120.GetApprovalResponse.Data.ApprovalProgressesItem;
import com.aliyuncs.csas.model.v20230120.GetApprovalResponse.Data.ApprovalProgressesItem.OperatorsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApprovalResponseUnmarshaller {

	public static GetApprovalResponse unmarshall(GetApprovalResponse getApprovalResponse, UnmarshallerContext _ctx) {
		
		getApprovalResponse.setRequestId(_ctx.stringValue("GetApprovalResponse.RequestId"));

		List<Data> approval = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("GetApprovalResponse.Approval.Length"); i++) {
			Data data = new Data();
			data.setApprovalId(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].ApprovalId"));
			data.setEndTimestamp(_ctx.longValue("GetApprovalResponse.Approval["+ i +"].EndTimestamp"));
			data.setApprovalDetail(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].ApprovalDetail"));
			data.setStatus(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].Status"));
			data.setProcessId(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].ProcessId"));
			data.setProcessName(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].ProcessName"));
			data.setPolicyType(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].PolicyType"));
			data.setSchemaId(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].SchemaId"));
			data.setSchemaName(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].SchemaName"));
			data.setSchemaContent(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].SchemaContent"));
			data.setCreatorUserId(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].CreatorUserId"));
			data.setCreatorDevTag(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].CreatorDevTag"));
			data.setCreateTime(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].CreateTime"));
			data.setReason(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].Reason"));
			data.setCreatorUsername(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].CreatorUsername"));
			data.setCreatorDepartment(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].CreatorDepartment"));

			List<ApprovalProgressesItem> approvalProgresses = new ArrayList<ApprovalProgressesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetApprovalResponse.Approval["+ i +"].ApprovalProgresses.Length"); j++) {
				ApprovalProgressesItem approvalProgressesItem = new ApprovalProgressesItem();
				approvalProgressesItem.setStatus(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Status"));
				approvalProgressesItem.setExecutor(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Executor"));
				approvalProgressesItem.setAction(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Action"));
				approvalProgressesItem.setComment(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Comment"));
				approvalProgressesItem.setTimestamp(_ctx.longValue("GetApprovalResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Timestamp"));

				List<OperatorsItem> operators = new ArrayList<OperatorsItem>();
				for (int k = 0; k < _ctx.lengthValue("GetApprovalResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Operators.Length"); k++) {
					OperatorsItem operatorsItem = new OperatorsItem();
					operatorsItem.setSaseUserId(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Operators["+ k +"].SaseUserId"));
					operatorsItem.setUsername(_ctx.stringValue("GetApprovalResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Operators["+ k +"].Username"));

					operators.add(operatorsItem);
				}
				approvalProgressesItem.setOperators(operators);

				approvalProgresses.add(approvalProgressesItem);
			}
			data.setApprovalProgresses(approvalProgresses);

			approval.add(data);
		}
		getApprovalResponse.setApproval(approval);
	 
	 	return getApprovalResponse;
	}
}