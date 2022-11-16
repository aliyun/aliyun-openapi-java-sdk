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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.RegisterNumberCheckResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RegisterNumberCheckResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private Boolean r11Registered;

	private String r41RegisterNumber;

	private Long completeDate;

	private Long firstAppearDate;

	private String publishStatus;

	private String softwareFullName;

	private String softwareShortName;

	private String version;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getR11Registered() {
		return this.r11Registered;
	}

	public void setR11Registered(Boolean r11Registered) {
		this.r11Registered = r11Registered;
	}

	public String getR41RegisterNumber() {
		return this.r41RegisterNumber;
	}

	public void setR41RegisterNumber(String r41RegisterNumber) {
		this.r41RegisterNumber = r41RegisterNumber;
	}

	public Long getCompleteDate() {
		return this.completeDate;
	}

	public void setCompleteDate(Long completeDate) {
		this.completeDate = completeDate;
	}

	public Long getFirstAppearDate() {
		return this.firstAppearDate;
	}

	public void setFirstAppearDate(Long firstAppearDate) {
		this.firstAppearDate = firstAppearDate;
	}

	public String getPublishStatus() {
		return this.publishStatus;
	}

	public void setPublishStatus(String publishStatus) {
		this.publishStatus = publishStatus;
	}

	public String getSoftwareFullName() {
		return this.softwareFullName;
	}

	public void setSoftwareFullName(String softwareFullName) {
		this.softwareFullName = softwareFullName;
	}

	public String getSoftwareShortName() {
		return this.softwareShortName;
	}

	public void setSoftwareShortName(String softwareShortName) {
		this.softwareShortName = softwareShortName;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public RegisterNumberCheckResponse getInstance(UnmarshallerContext context) {
		return	RegisterNumberCheckResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
