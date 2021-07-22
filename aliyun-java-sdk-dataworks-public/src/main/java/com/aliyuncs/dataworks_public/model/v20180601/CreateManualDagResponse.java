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

package com.aliyuncs.dataworks_public.model.v20180601;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20180601.CreateManualDagResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateManualDagResponse extends AcsResponse {

	private String requestId;

	private String returnCode;

	private String returnErrorSolution;

	private String returnMessage;

	private Long returnValue;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getReturnCode() {
		return this.returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnErrorSolution() {
		return this.returnErrorSolution;
	}

	public void setReturnErrorSolution(String returnErrorSolution) {
		this.returnErrorSolution = returnErrorSolution;
	}

	public String getReturnMessage() {
		return this.returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public Long getReturnValue() {
		return this.returnValue;
	}

	public void setReturnValue(Long returnValue) {
		this.returnValue = returnValue;
	}

	@Override
	public CreateManualDagResponse getInstance(UnmarshallerContext context) {
		return	CreateManualDagResponseUnmarshaller.unmarshall(this, context);
	}
}
