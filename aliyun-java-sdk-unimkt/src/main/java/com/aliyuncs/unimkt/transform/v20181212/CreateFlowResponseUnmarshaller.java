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

import com.aliyuncs.unimkt.model.v20181212.CreateFlowResponse;
import com.aliyuncs.unimkt.model.v20181212.CreateFlowResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFlowResponseUnmarshaller {

	public static CreateFlowResponse unmarshall(CreateFlowResponse createFlowResponse, UnmarshallerContext _ctx) {
		
		createFlowResponse.setRequestId(_ctx.stringValue("CreateFlowResponse.RequestId"));
		createFlowResponse.setCode(_ctx.stringValue("CreateFlowResponse.Code"));
		createFlowResponse.setSuccess(_ctx.booleanValue("CreateFlowResponse.Success"));
		createFlowResponse.setMessage(_ctx.stringValue("CreateFlowResponse.Message"));

		Model model = new Model();
		model.setFlowId(_ctx.stringValue("CreateFlowResponse.Model.FlowId"));
		model.setGmtCreateTime(_ctx.longValue("CreateFlowResponse.Model.GmtCreateTime"));
		model.setGmtModifiedTime(_ctx.longValue("CreateFlowResponse.Model.GmtModifiedTime"));
		model.setTenantId(_ctx.stringValue("CreateFlowResponse.Model.TenantId"));
		model.setExtInfo(_ctx.stringValue("CreateFlowResponse.Model.ExtInfo"));
		model.setType(_ctx.stringValue("CreateFlowResponse.Model.Type"));
		model.setBusinessKey(_ctx.stringValue("CreateFlowResponse.Model.BusinessKey"));
		model.setReasonType(_ctx.stringValue("CreateFlowResponse.Model.ReasonType"));
		model.setOldData(_ctx.stringValue("CreateFlowResponse.Model.OldData"));
		model.setNewData(_ctx.stringValue("CreateFlowResponse.Model.NewData"));
		model.setStatus(_ctx.stringValue("CreateFlowResponse.Model.Status"));
		model.setChildStatus(_ctx.stringValue("CreateFlowResponse.Model.ChildStatus"));
		model.setApplyUserId(_ctx.stringValue("CreateFlowResponse.Model.ApplyUserId"));
		model.setApproveUserId(_ctx.stringValue("CreateFlowResponse.Model.ApproveUserId"));
		model.setApproveTime(_ctx.longValue("CreateFlowResponse.Model.ApproveTime"));
		createFlowResponse.setModel(model);
	 
	 	return createFlowResponse;
	}
}