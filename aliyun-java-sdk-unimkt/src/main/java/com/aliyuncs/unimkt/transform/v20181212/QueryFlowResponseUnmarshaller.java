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
		queryFlowResponse.setMessage(_ctx.stringValue("QueryFlowResponse.Message"));
		queryFlowResponse.setSuccess(_ctx.booleanValue("QueryFlowResponse.Success"));

		Model model = new Model();
		model.setType(_ctx.stringValue("QueryFlowResponse.Model.Type"));
		model.setStatus(_ctx.stringValue("QueryFlowResponse.Model.Status"));
		model.setChildStatus(_ctx.stringValue("QueryFlowResponse.Model.ChildStatus"));
		model.setApplyUserId(_ctx.stringValue("QueryFlowResponse.Model.ApplyUserId"));
		model.setApproveTime(_ctx.longValue("QueryFlowResponse.Model.ApproveTime"));
		model.setFlowId(_ctx.stringValue("QueryFlowResponse.Model.FlowId"));
		model.setExtInfo(_ctx.stringValue("QueryFlowResponse.Model.ExtInfo"));
		model.setGmtModifiedTime(_ctx.longValue("QueryFlowResponse.Model.GmtModifiedTime"));
		model.setOldData(_ctx.stringValue("QueryFlowResponse.Model.OldData"));
		model.setGmtCreateTime(_ctx.longValue("QueryFlowResponse.Model.GmtCreateTime"));
		model.setApproveUserId(_ctx.stringValue("QueryFlowResponse.Model.ApproveUserId"));
		model.setNewData(_ctx.stringValue("QueryFlowResponse.Model.NewData"));
		model.setBusinessKey(_ctx.stringValue("QueryFlowResponse.Model.BusinessKey"));
		model.setReasonType(_ctx.stringValue("QueryFlowResponse.Model.ReasonType"));
		model.setTenantId(_ctx.stringValue("QueryFlowResponse.Model.TenantId"));
		queryFlowResponse.setModel(model);
	 
	 	return queryFlowResponse;
	}
}