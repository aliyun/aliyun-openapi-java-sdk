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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.GenerateCoordinationCodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateCoordinationCodeResponse extends AcsResponse {

	private String requestId;

	private String coordinatorCode;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCoordinatorCode() {
		return this.coordinatorCode;
	}

	public void setCoordinatorCode(String coordinatorCode) {
		this.coordinatorCode = coordinatorCode;
	}

	@Override
	public GenerateCoordinationCodeResponse getInstance(UnmarshallerContext context) {
		return	GenerateCoordinationCodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
