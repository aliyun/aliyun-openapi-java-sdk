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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.QueryApprovalInfoResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryApprovalInfoResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.QueryApprovalInfoResponse.Result.ApprovalsResultModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryApprovalInfoResponseUnmarshaller {

	public static QueryApprovalInfoResponse unmarshall(QueryApprovalInfoResponse queryApprovalInfoResponse, UnmarshallerContext _ctx) {
		
		queryApprovalInfoResponse.setRequestId(_ctx.stringValue("QueryApprovalInfoResponse.RequestId"));
		queryApprovalInfoResponse.setSuccess(_ctx.booleanValue("QueryApprovalInfoResponse.Success"));

		Result result = new Result();
		result.setTotal(_ctx.integerValue("QueryApprovalInfoResponse.Result.Total"));
		result.setTotalPages(_ctx.integerValue("QueryApprovalInfoResponse.Result.TotalPages"));
		result.setStart(_ctx.integerValue("QueryApprovalInfoResponse.Result.Start"));
		result.setPageSize(_ctx.integerValue("QueryApprovalInfoResponse.Result.PageSize"));
		result.setPage(_ctx.integerValue("QueryApprovalInfoResponse.Result.Page"));

		List<ApprovalsResultModel> data = new ArrayList<ApprovalsResultModel>();
		for (int i = 0; i < _ctx.lengthValue("QueryApprovalInfoResponse.Result.Data.Length"); i++) {
			ApprovalsResultModel approvalsResultModel = new ApprovalsResultModel();
			approvalsResultModel.setWorkspaceName(_ctx.stringValue("QueryApprovalInfoResponse.Result.Data["+ i +"].WorkspaceName"));
			approvalsResultModel.setApplicationId(_ctx.stringValue("QueryApprovalInfoResponse.Result.Data["+ i +"].ApplicationId"));
			approvalsResultModel.setApplicantId(_ctx.stringValue("QueryApprovalInfoResponse.Result.Data["+ i +"].ApplicantId"));
			approvalsResultModel.setApplicantName(_ctx.stringValue("QueryApprovalInfoResponse.Result.Data["+ i +"].ApplicantName"));
			approvalsResultModel.setApproverId(_ctx.stringValue("QueryApprovalInfoResponse.Result.Data["+ i +"].ApproverId"));
			approvalsResultModel.setApproverName(_ctx.stringValue("QueryApprovalInfoResponse.Result.Data["+ i +"].ApproverName"));
			approvalsResultModel.setResourceId(_ctx.stringValue("QueryApprovalInfoResponse.Result.Data["+ i +"].ResourceId"));
			approvalsResultModel.setResourceName(_ctx.stringValue("QueryApprovalInfoResponse.Result.Data["+ i +"].ResourceName"));
			approvalsResultModel.setResourceType(_ctx.stringValue("QueryApprovalInfoResponse.Result.Data["+ i +"].ResourceType"));
			approvalsResultModel.setApplyReason(_ctx.stringValue("QueryApprovalInfoResponse.Result.Data["+ i +"].ApplyReason"));
			approvalsResultModel.setHandleReason(_ctx.stringValue("QueryApprovalInfoResponse.Result.Data["+ i +"].HandleReason"));
			approvalsResultModel.setExpireDate(_ctx.longValue("QueryApprovalInfoResponse.Result.Data["+ i +"].ExpireDate"));
			approvalsResultModel.setGmtCreate(_ctx.longValue("QueryApprovalInfoResponse.Result.Data["+ i +"].GmtCreate"));
			approvalsResultModel.setGmtModified(_ctx.longValue("QueryApprovalInfoResponse.Result.Data["+ i +"].GmtModified"));
			approvalsResultModel.setFlagStatus(_ctx.integerValue("QueryApprovalInfoResponse.Result.Data["+ i +"].FlagStatus"));
			approvalsResultModel.setDeleteFlag(_ctx.booleanValue("QueryApprovalInfoResponse.Result.Data["+ i +"].DeleteFlag"));

			data.add(approvalsResultModel);
		}
		result.setData(data);
		queryApprovalInfoResponse.setResult(result);
	 
	 	return queryApprovalInfoResponse;
	}
}