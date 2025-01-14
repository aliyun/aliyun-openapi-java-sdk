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

import com.aliyuncs.csas.model.v20230120.UpdateApprovalStatusResponse;
import com.aliyuncs.csas.model.v20230120.UpdateApprovalStatusResponse.Data;
import com.aliyuncs.csas.model.v20230120.UpdateApprovalStatusResponse.Data.ApprovalProgressesItem;
import com.aliyuncs.csas.model.v20230120.UpdateApprovalStatusResponse.Data.ApprovalProgressesItem.OperatorsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateApprovalStatusResponseUnmarshaller {

	public static UpdateApprovalStatusResponse unmarshall(UpdateApprovalStatusResponse updateApprovalStatusResponse, UnmarshallerContext _ctx) {
		
		updateApprovalStatusResponse.setRequestId(_ctx.stringValue("UpdateApprovalStatusResponse.RequestId"));

		List<Data> approval = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("UpdateApprovalStatusResponse.Approval.Length"); i++) {
			Data data = new Data();
			data.setApprovalId(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].ApprovalId"));
			data.setEndTimestamp(_ctx.longValue("UpdateApprovalStatusResponse.Approval["+ i +"].EndTimestamp"));
			data.setApprovalDetail(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].ApprovalDetail"));
			data.setStatus(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].Status"));
			data.setProcessId(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].ProcessId"));
			data.setProcessName(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].ProcessName"));
			data.setPolicyType(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].PolicyType"));
			data.setSchemaId(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].SchemaId"));
			data.setSchemaName(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].SchemaName"));
			data.setSchemaContent(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].SchemaContent"));
			data.setCreatorUserId(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].CreatorUserId"));
			data.setCreatorDevTag(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].CreatorDevTag"));
			data.setCreateTime(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].CreateTime"));
			data.setReason(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].Reason"));

			List<ApprovalProgressesItem> approvalProgresses = new ArrayList<ApprovalProgressesItem>();
			for (int j = 0; j < _ctx.lengthValue("UpdateApprovalStatusResponse.Approval["+ i +"].ApprovalProgresses.Length"); j++) {
				ApprovalProgressesItem approvalProgressesItem = new ApprovalProgressesItem();
				approvalProgressesItem.setStatus(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Status"));
				approvalProgressesItem.setExecutor(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Executor"));
				approvalProgressesItem.setAction(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Action"));
				approvalProgressesItem.setComment(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Comment"));
				approvalProgressesItem.setTimestamp(_ctx.longValue("UpdateApprovalStatusResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Timestamp"));

				List<OperatorsItem> operators = new ArrayList<OperatorsItem>();
				for (int k = 0; k < _ctx.lengthValue("UpdateApprovalStatusResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Operators.Length"); k++) {
					OperatorsItem operatorsItem = new OperatorsItem();
					operatorsItem.setSaseUserId(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Operators["+ k +"].SaseUserId"));
					operatorsItem.setUsername(_ctx.stringValue("UpdateApprovalStatusResponse.Approval["+ i +"].ApprovalProgresses["+ j +"].Operators["+ k +"].Username"));

					operators.add(operatorsItem);
				}
				approvalProgressesItem.setOperators(operators);

				approvalProgresses.add(approvalProgressesItem);
			}
			data.setApprovalProgresses(approvalProgresses);

			approval.add(data);
		}
		updateApprovalStatusResponse.setApproval(approval);
	 
	 	return updateApprovalStatusResponse;
	}
}