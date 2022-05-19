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

package com.aliyuncs.lmztest.model.v20100101;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RomeGetExecutionResultRequest extends RoaAcsRequest<RomeGetExecutionResultResponse> {
	   

	private String flowRequestId;
	public RomeGetExecutionResultRequest() {
		super("LmzTest", "2010-01-01", "RomeGetExecutionResult");
		setUriPattern("/executions/[FlowRequestId]/result");
		setMethod(MethodType.GET);
	}

	public String getFlowRequestId() {
		return this.flowRequestId;
	}

	public void setFlowRequestId(String flowRequestId) {
		this.flowRequestId = flowRequestId;
		if(flowRequestId != null){
			putPathParameter("FlowRequestId", flowRequestId);
		}
	}

	@Override
	public Class<RomeGetExecutionResultResponse> getResponseClass() {
		return RomeGetExecutionResultResponse.class;
	}

}
