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

package com.aliyuncs.cloudesl.model.v20200201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20200201.DescribeCompanyTemplateAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCompanyTemplateAttributeResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private String code;

	private String message;

	private String dynamicMessage;

	private String dynamicCode;

	private List<SelectItemInfo> categoryField;

	private List<SelectItemInfo> fontType;

	private List<SelectItemInfo> deviceType;

	private List<SelectItemInfo> templateType;

	private List<SelectItemInfo> sizeType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public List<SelectItemInfo> getCategoryField() {
		return this.categoryField;
	}

	public void setCategoryField(List<SelectItemInfo> categoryField) {
		this.categoryField = categoryField;
	}

	public List<SelectItemInfo> getFontType() {
		return this.fontType;
	}

	public void setFontType(List<SelectItemInfo> fontType) {
		this.fontType = fontType;
	}

	public List<SelectItemInfo> getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(List<SelectItemInfo> deviceType) {
		this.deviceType = deviceType;
	}

	public List<SelectItemInfo> getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(List<SelectItemInfo> templateType) {
		this.templateType = templateType;
	}

	public List<SelectItemInfo> getSizeType() {
		return this.sizeType;
	}

	public void setSizeType(List<SelectItemInfo> sizeType) {
		this.sizeType = sizeType;
	}

	public static class SelectItemInfo {

		private String label;

		private String value;

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public DescribeCompanyTemplateAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeCompanyTemplateAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
