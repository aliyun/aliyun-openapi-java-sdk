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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.SetWorkflowExtraInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetWorkflowExtraInfoResponseUnmarshaller {

	public static SetWorkflowExtraInfoResponse unmarshall(SetWorkflowExtraInfoResponse setWorkflowExtraInfoResponse, UnmarshallerContext _ctx) {
		
		setWorkflowExtraInfoResponse.setRequestId(_ctx.stringValue("SetWorkflowExtraInfoResponse.RequestId"));
		setWorkflowExtraInfoResponse.setErrorCode(_ctx.stringValue("SetWorkflowExtraInfoResponse.ErrorCode"));
		setWorkflowExtraInfoResponse.setErrorMessage(_ctx.stringValue("SetWorkflowExtraInfoResponse.ErrorMessage"));
		setWorkflowExtraInfoResponse.setData(_ctx.booleanValue("SetWorkflowExtraInfoResponse.Data"));
		setWorkflowExtraInfoResponse.setSuccess(_ctx.booleanValue("SetWorkflowExtraInfoResponse.Success"));
	 
	 	return setWorkflowExtraInfoResponse;
	}
}