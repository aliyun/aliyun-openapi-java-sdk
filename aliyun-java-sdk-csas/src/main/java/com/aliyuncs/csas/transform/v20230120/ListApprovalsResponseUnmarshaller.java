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

import com.aliyuncs.csas.model.v20230120.ListApprovalsResponse;
import com.aliyuncs.csas.model.v20230120.ListApprovalsResponse.DataList;
import com.aliyuncs.csas.model.v20230120.ListApprovalsResponse.DataList.ApprovalProgressesItem;
import com.aliyuncs.csas.model.v20230120.ListApprovalsResponse.DataList.ApprovalProgressesItem.OperatorsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApprovalsResponseUnmarshaller {

	public static ListApprovalsResponse unmarshall(ListApprovalsResponse listApprovalsResponse, UnmarshallerContext _ctx) {
		
		listApprovalsResponse.setRequestId(_ctx.stringValue("ListApprovalsResponse.RequestId"));
		listApprovalsResponse.setTotalNum(_ctx.stringValue("ListApprovalsResponse.TotalNum"));

		List<DataList> approvals = new ArrayList<DataList>();
		for (int i = 0; i < _ctx.lengthValue("ListApprovalsResponse.Approvals.Length"); i++) {
			DataList dataList = new DataList();
			dataList.setApprovalId(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].ApprovalId"));
			dataList.setEndTimestamp(_ctx.longValue("ListApprovalsResponse.Approvals["+ i +"].EndTimestamp"));
			dataList.setApprovalDetail(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].ApprovalDetail"));
			dataList.setStatus(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].Status"));
			dataList.setProcessId(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].ProcessId"));
			dataList.setProcessName(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].ProcessName"));
			dataList.setPolicyType(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].PolicyType"));
			dataList.setSchemaId(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].SchemaId"));
			dataList.setSchemaName(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].SchemaName"));
			dataList.setSchemaContent(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].SchemaContent"));
			dataList.setCreatorUserId(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].CreatorUserId"));
			dataList.setCreatorDevTag(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].CreatorDevTag"));
			dataList.setCreateTime(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].CreateTime"));
			dataList.setReason(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].Reason"));
			dataList.setCreatorUsername(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].CreatorUsername"));
			dataList.setCreatorDepartment(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].CreatorDepartment"));

			List<ApprovalProgressesItem> approvalProgresses = new ArrayList<ApprovalProgressesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListApprovalsResponse.Approvals["+ i +"].ApprovalProgresses.Length"); j++) {
				ApprovalProgressesItem approvalProgressesItem = new ApprovalProgressesItem();
				approvalProgressesItem.setStatus(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].ApprovalProgresses["+ j +"].Status"));
				approvalProgressesItem.setExecutor(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].ApprovalProgresses["+ j +"].Executor"));
				approvalProgressesItem.setAction(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].ApprovalProgresses["+ j +"].Action"));
				approvalProgressesItem.setComment(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].ApprovalProgresses["+ j +"].Comment"));
				approvalProgressesItem.setTimestamp(_ctx.longValue("ListApprovalsResponse.Approvals["+ i +"].ApprovalProgresses["+ j +"].Timestamp"));

				List<OperatorsItem> operators = new ArrayList<OperatorsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListApprovalsResponse.Approvals["+ i +"].ApprovalProgresses["+ j +"].Operators.Length"); k++) {
					OperatorsItem operatorsItem = new OperatorsItem();
					operatorsItem.setSaseUserId(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].ApprovalProgresses["+ j +"].Operators["+ k +"].SaseUserId"));
					operatorsItem.setUsername(_ctx.stringValue("ListApprovalsResponse.Approvals["+ i +"].ApprovalProgresses["+ j +"].Operators["+ k +"].Username"));

					operators.add(operatorsItem);
				}
				approvalProgressesItem.setOperators(operators);

				approvalProgresses.add(approvalProgressesItem);
			}
			dataList.setApprovalProgresses(approvalProgresses);

			approvals.add(dataList);
		}
		listApprovalsResponse.setApprovals(approvals);
	 
	 	return listApprovalsResponse;
	}
}