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

package com.aliyuncs.retailadvqa.model.v20230417;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa.transform.v20230417.MemberPointChangeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MemberPointChangeResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String httpStatusCode;

	private String errorCode;

	private String errorMessage;

	private String currentQuantity;

	private String levelName;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCurrentQuantity() {
		return this.currentQuantity;
	}

	public void setCurrentQuantity(String currentQuantity) {
		this.currentQuantity = currentQuantity;
	}

	public String getLevelName() {
		return this.levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	@Override
	public MemberPointChangeResponse getInstance(UnmarshallerContext context) {
		return	MemberPointChangeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
