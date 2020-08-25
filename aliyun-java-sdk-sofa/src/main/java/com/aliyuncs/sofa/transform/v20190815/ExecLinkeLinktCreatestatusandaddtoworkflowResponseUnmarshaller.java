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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktCreatestatusandaddtoworkflowResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinktCreatestatusandaddtoworkflowResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinktCreatestatusandaddtoworkflowResponseUnmarshaller {

	public static ExecLinkeLinktCreatestatusandaddtoworkflowResponse unmarshall(ExecLinkeLinktCreatestatusandaddtoworkflowResponse execLinkeLinktCreatestatusandaddtoworkflowResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinktCreatestatusandaddtoworkflowResponse.setRequestId(_ctx.stringValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.RequestId"));
		execLinkeLinktCreatestatusandaddtoworkflowResponse.setResultCode(_ctx.stringValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.ResultCode"));
		execLinkeLinktCreatestatusandaddtoworkflowResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.ResultMessage"));
		execLinkeLinktCreatestatusandaddtoworkflowResponse.setErrorCode(_ctx.longValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.ErrorCode"));
		execLinkeLinktCreatestatusandaddtoworkflowResponse.setErrorMessage(_ctx.stringValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.ErrorMessage"));
		execLinkeLinktCreatestatusandaddtoworkflowResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.ResponseStatusCode"));
		execLinkeLinktCreatestatusandaddtoworkflowResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.Success"));

		Data data = new Data();
		data.setAsDefault(_ctx.booleanValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.Data.AsDefault"));
		data.setCreatedAt(_ctx.longValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.Data.CreatedAt"));
		data.setDeleted(_ctx.booleanValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.Data.Deleted"));
		data.setId(_ctx.longValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.Data.Id"));
		data.setPosition(_ctx.longValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.Data.Position"));
		data.setRegion(_ctx.stringValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.Data.Region"));
		data.setStatus(_ctx.stringValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.Data.Status"));
		data.setStatusId(_ctx.longValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.Data.StatusId"));
		data.setUpdatedAt(_ctx.longValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.Data.UpdatedAt"));
		data.setWorkflowId(_ctx.longValue("ExecLinkeLinktCreatestatusandaddtoworkflowResponse.Data.WorkflowId"));
		execLinkeLinktCreatestatusandaddtoworkflowResponse.setData(data);
	 
	 	return execLinkeLinktCreatestatusandaddtoworkflowResponse;
	}
}