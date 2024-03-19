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

package com.aliyuncs.expressconnectrouter.model.v20230901;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.expressconnectrouter.transform.v20230901.CheckAddRegionToExpressConnectRouterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckAddRegionToExpressConnectRouterResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private String accessDeniedDetail;

	private Boolean anyInterRegionLink;

	private Boolean anyCrossBorderLink;

	private Boolean isCdtInterRegionEnabled;

	private Boolean isCdtCrossBorderEnabled;

	private Boolean isUserAllowedToCreateCrossBorderLink;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public Boolean getAnyInterRegionLink() {
		return this.anyInterRegionLink;
	}

	public void setAnyInterRegionLink(Boolean anyInterRegionLink) {
		this.anyInterRegionLink = anyInterRegionLink;
	}

	public Boolean getAnyCrossBorderLink() {
		return this.anyCrossBorderLink;
	}

	public void setAnyCrossBorderLink(Boolean anyCrossBorderLink) {
		this.anyCrossBorderLink = anyCrossBorderLink;
	}

	public Boolean getIsCdtInterRegionEnabled() {
		return this.isCdtInterRegionEnabled;
	}

	public void setIsCdtInterRegionEnabled(Boolean isCdtInterRegionEnabled) {
		this.isCdtInterRegionEnabled = isCdtInterRegionEnabled;
	}

	public Boolean getIsCdtCrossBorderEnabled() {
		return this.isCdtCrossBorderEnabled;
	}

	public void setIsCdtCrossBorderEnabled(Boolean isCdtCrossBorderEnabled) {
		this.isCdtCrossBorderEnabled = isCdtCrossBorderEnabled;
	}

	public Boolean getIsUserAllowedToCreateCrossBorderLink() {
		return this.isUserAllowedToCreateCrossBorderLink;
	}

	public void setIsUserAllowedToCreateCrossBorderLink(Boolean isUserAllowedToCreateCrossBorderLink) {
		this.isUserAllowedToCreateCrossBorderLink = isUserAllowedToCreateCrossBorderLink;
	}

	@Override
	public CheckAddRegionToExpressConnectRouterResponse getInstance(UnmarshallerContext context) {
		return	CheckAddRegionToExpressConnectRouterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
