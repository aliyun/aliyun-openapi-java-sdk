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

import com.aliyuncs.unimkt.model.v20181212.QueryFlowResponse;
import com.aliyuncs.unimkt.model.v20181212.QueryFlowResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFlowResponseUnmarshaller {

	public static QueryFlowResponse unmarshall(QueryFlowResponse queryFlowResponse, UnmarshallerContext _ctx) {
		
		queryFlowResponse.setRequestId(_ctx.stringValue("QueryFlowResponse.RequestId"));
		queryFlowResponse.setCode(_ctx.stringValue("QueryFlowResponse.Code"));
		queryFlowResponse.setSuccess(_ctx.booleanValue("QueryFlowResponse.Success"));
		queryFlowResponse.setMessage(_ctx.stringValue("QueryFlowResponse.Message"));

		Model model = new Model();
		model.setFlowId(_ctx.stringValue("QueryFlowResponse.Model.FlowId"));
		model.setGmtCreateTime(_ctx.longValue("QueryFlowResponse.Model.GmtCreateTime"));
		model.setGmtModifiedTime(_ctx.longValue("QueryFlowResponse.Model.GmtModifiedTime"));
		model.setTenantId(_ctx.stringValue("QueryFlowResponse.Model.TenantId"));
		model.setExtInfo(_ctx.stringValue("QueryFlowResponse.Model.ExtInfo"));
		model.setType(_ctx.stringValue("QueryFlowResponse.Model.Type"));
		model.setBusinessKey(_ctx.stringValue("QueryFlowResponse.Model.BusinessKey"));
		model.setReasonType(_ctx.stringValue("QueryFlowResponse.Model.ReasonType"));
		model.setOldData(_ctx.stringValue("QueryFlowResponse.Model.OldData"));
		model.setNewData(_ctx.stringValue("QueryFlowResponse.Model.NewData"));
		model.setStatus(_ctx.stringValue("QueryFlowResponse.Model.Status"));
		model.setChildStatus(_ctx.stringValue("QueryFlowResponse.Model.ChildStatus"));
		model.setApplyUserId(_ctx.stringValue("QueryFlowResponse.Model.ApplyUserId"));
		model.setApproveUserId(_ctx.stringValue("QueryFlowResponse.Model.ApproveUserId"));
		model.setApproveTime(_ctx.longValue("QueryFlowResponse.Model.ApproveTime"));
		queryFlowResponse.setModel(model);
	 
	 	return queryFlowResponse;
	}
}