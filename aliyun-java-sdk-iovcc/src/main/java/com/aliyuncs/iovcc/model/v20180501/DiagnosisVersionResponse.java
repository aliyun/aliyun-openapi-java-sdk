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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.DiagnosisVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DiagnosisVersionResponse extends AcsResponse {

	private String requestId;

	private String diagnosisResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDiagnosisResult() {
		return this.diagnosisResult;
	}

	public void setDiagnosisResult(String diagnosisResult) {
		this.diagnosisResult = diagnosisResult;
	}

	@Override
	public DiagnosisVersionResponse getInstance(UnmarshallerContext context) {
		return	DiagnosisVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
