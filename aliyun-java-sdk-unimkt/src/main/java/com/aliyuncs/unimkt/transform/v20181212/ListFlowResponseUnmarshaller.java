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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.ListFlowResponse;
import com.aliyuncs.unimkt.model.v20181212.ListFlowResponse.FlowDTOModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowResponseUnmarshaller {

	public static ListFlowResponse unmarshall(ListFlowResponse listFlowResponse, UnmarshallerContext _ctx) {
		
		listFlowResponse.setRequestId(_ctx.stringValue("ListFlowResponse.RequestId"));
		listFlowResponse.setCode(_ctx.stringValue("ListFlowResponse.Code"));
		listFlowResponse.setSuccess(_ctx.booleanValue("ListFlowResponse.Success"));
		listFlowResponse.setMessage(_ctx.stringValue("ListFlowResponse.Message"));
		listFlowResponse.setTotal(_ctx.longValue("ListFlowResponse.Total"));
		listFlowResponse.setPageNumber(_ctx.integerValue("ListFlowResponse.PageNumber"));
		listFlowResponse.setPageSize(_ctx.integerValue("ListFlowResponse.PageSize"));

		List<FlowDTOModel> model = new ArrayList<FlowDTOModel>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowResponse.Model.Length"); i++) {
			FlowDTOModel flowDTOModel = new FlowDTOModel();
			flowDTOModel.setFlowId(_ctx.stringValue("ListFlowResponse.Model["+ i +"].FlowId"));
			flowDTOModel.setGmtCreateTime(_ctx.longValue("ListFlowResponse.Model["+ i +"].GmtCreateTime"));
			flowDTOModel.setGmtModifiedTime(_ctx.longValue("ListFlowResponse.Model["+ i +"].GmtModifiedTime"));
			flowDTOModel.setTenantId(_ctx.stringValue("ListFlowResponse.Model["+ i +"].TenantId"));
			flowDTOModel.setExtInfo(_ctx.stringValue("ListFlowResponse.Model["+ i +"].ExtInfo"));
			flowDTOModel.setType(_ctx.stringValue("ListFlowResponse.Model["+ i +"].Type"));
			flowDTOModel.setBusinessKey(_ctx.stringValue("ListFlowResponse.Model["+ i +"].BusinessKey"));
			flowDTOModel.setReasonType(_ctx.stringValue("ListFlowResponse.Model["+ i +"].ReasonType"));
			flowDTOModel.setOldData(_ctx.stringValue("ListFlowResponse.Model["+ i +"].OldData"));
			flowDTOModel.setNewData(_ctx.stringValue("ListFlowResponse.Model["+ i +"].NewData"));
			flowDTOModel.setStatus(_ctx.stringValue("ListFlowResponse.Model["+ i +"].Status"));
			flowDTOModel.setChildStatus(_ctx.stringValue("ListFlowResponse.Model["+ i +"].ChildStatus"));
			flowDTOModel.setApplyUserId(_ctx.stringValue("ListFlowResponse.Model["+ i +"].ApplyUserId"));
			flowDTOModel.setApproveUserId(_ctx.stringValue("ListFlowResponse.Model["+ i +"].ApproveUserId"));
			flowDTOModel.setApproveTime(_ctx.longValue("ListFlowResponse.Model["+ i +"].ApproveTime"));

			model.add(flowDTOModel);
		}
		listFlowResponse.setModel(model);
	 
	 	return listFlowResponse;
	}
}