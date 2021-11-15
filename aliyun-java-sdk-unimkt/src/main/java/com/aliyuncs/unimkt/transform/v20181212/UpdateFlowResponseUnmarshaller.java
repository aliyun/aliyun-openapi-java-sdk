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

import com.aliyuncs.unimkt.model.v20181212.UpdateFlowResponse;
import com.aliyuncs.unimkt.model.v20181212.UpdateFlowResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFlowResponseUnmarshaller {

	public static UpdateFlowResponse unmarshall(UpdateFlowResponse updateFlowResponse, UnmarshallerContext _ctx) {
		
		updateFlowResponse.setRequestId(_ctx.stringValue("UpdateFlowResponse.RequestId"));
		updateFlowResponse.setCode(_ctx.stringValue("UpdateFlowResponse.Code"));
		updateFlowResponse.setSuccess(_ctx.booleanValue("UpdateFlowResponse.Success"));
		updateFlowResponse.setMessage(_ctx.stringValue("UpdateFlowResponse.Message"));

		Model model = new Model();
		model.setFlowId(_ctx.stringValue("UpdateFlowResponse.Model.FlowId"));
		model.setGmtCreateTime(_ctx.longValue("UpdateFlowResponse.Model.GmtCreateTime"));
		model.setGmtModifiedTime(_ctx.longValue("UpdateFlowResponse.Model.GmtModifiedTime"));
		model.setTenantId(_ctx.stringValue("UpdateFlowResponse.Model.TenantId"));
		model.setExtInfo(_ctx.stringValue("UpdateFlowResponse.Model.ExtInfo"));
		model.setType(_ctx.stringValue("UpdateFlowResponse.Model.Type"));
		model.setBusinessKey(_ctx.stringValue("UpdateFlowResponse.Model.BusinessKey"));
		model.setReasonType(_ctx.stringValue("UpdateFlowResponse.Model.ReasonType"));
		model.setOldData(_ctx.stringValue("UpdateFlowResponse.Model.OldData"));
		model.setNewData(_ctx.stringValue("UpdateFlowResponse.Model.NewData"));
		model.setStatus(_ctx.stringValue("UpdateFlowResponse.Model.Status"));
		model.setChildStatus(_ctx.stringValue("UpdateFlowResponse.Model.ChildStatus"));
		model.setApplyUserId(_ctx.stringValue("UpdateFlowResponse.Model.ApplyUserId"));
		model.setApproveUserId(_ctx.stringValue("UpdateFlowResponse.Model.ApproveUserId"));
		model.setApproveTime(_ctx.longValue("UpdateFlowResponse.Model.ApproveTime"));
		updateFlowResponse.setModel(model);
	 
	 	return updateFlowResponse;
	}
}