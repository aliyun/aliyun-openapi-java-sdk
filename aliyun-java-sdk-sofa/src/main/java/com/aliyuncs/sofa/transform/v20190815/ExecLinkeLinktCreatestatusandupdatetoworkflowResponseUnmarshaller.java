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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktCreatestatusandupdatetoworkflowResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktCreatestatusandupdatetoworkflowResponseUnmarshaller {

	public static ExecLinkeLinktCreatestatusandupdatetoworkflowResponse unmarshall(ExecLinkeLinktCreatestatusandupdatetoworkflowResponse execLinkeLinktCreatestatusandupdatetoworkflowResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktCreatestatusandupdatetoworkflowResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.RequestId"));
		execLinkeLinktCreatestatusandupdatetoworkflowResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.ResultCode"));
		execLinkeLinktCreatestatusandupdatetoworkflowResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.ResultMessage"));
		execLinkeLinktCreatestatusandupdatetoworkflowResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.ErrorCode"));
		execLinkeLinktCreatestatusandupdatetoworkflowResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.ErrorMessage"));
		execLinkeLinktCreatestatusandupdatetoworkflowResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Success"));

		Data data = new Data();
		data.setAsDefault(_ctx.booleanValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.AsDefault"));
		data.setCreatedAt(_ctx.longValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.Deleted"));
		data.setId(_ctx.longValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.Id"));
		data.setPosition(_ctx.longValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.Position"));
		data.setRegion(_ctx.stringValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.Region"));
		data.setStatusId(_ctx.longValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.StatusId"));
		data.setUpdatedAt(_ctx.longValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.UpdatedAt"));
		data.setWorkflowId(_ctx.longValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.WorkflowId"));

		Status status = new Status();
		status.setCreatedAt(_ctx.longValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.Status.CreatedAt"));
		status.setDeleted(_ctx.booleanValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.Status.Deleted"));
		status.setId(_ctx.longValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.Status.Id"));
		status.setName(_ctx.stringValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.Status.Name"));
		status.setProjectSign(_ctx.stringValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.Status.ProjectSign"));
		status.setRegion(_ctx.stringValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.Status.Region"));
		status.setStage(_ctx.longValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.Status.Stage"));
		status.setStageName(_ctx.stringValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.Status.StageName"));
		status.setUpdatedAt(_ctx.longValue("ExecLinkeLinktCreatestatusandupdatetoworkflowResponse.Data.Status.UpdatedAt"));
		data.setStatus(status);
		execLinkeLinktCreatestatusandupdatetoworkflowResponse.setData(data);
	 
	 	return execLinkeLinktCreatestatusandupdatetoworkflowResponse;
	}
}