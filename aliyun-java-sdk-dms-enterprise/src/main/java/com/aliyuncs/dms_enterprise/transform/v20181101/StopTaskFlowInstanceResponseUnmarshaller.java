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

import com.aliyuncs.dms_enterprise.model.v20181101.StopTaskFlowInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopTaskFlowInstanceResponseUnmarshaller {

	public static StopTaskFlowInstanceResponse unmarshall(StopTaskFlowInstanceResponse stopTaskFlowInstanceResponse, UnmarshallerContext _ctx) {
		
		stopTaskFlowInstanceResponse.setRequestId(_ctx.stringValue("StopTaskFlowInstanceResponse.RequestId"));
		stopTaskFlowInstanceResponse.setErrorCode(_ctx.stringValue("StopTaskFlowInstanceResponse.ErrorCode"));
		stopTaskFlowInstanceResponse.setErrorMessage(_ctx.stringValue("StopTaskFlowInstanceResponse.ErrorMessage"));
		stopTaskFlowInstanceResponse.setSuccess(_ctx.booleanValue("StopTaskFlowInstanceResponse.Success"));
	 
	 	return stopTaskFlowInstanceResponse;
	}
}