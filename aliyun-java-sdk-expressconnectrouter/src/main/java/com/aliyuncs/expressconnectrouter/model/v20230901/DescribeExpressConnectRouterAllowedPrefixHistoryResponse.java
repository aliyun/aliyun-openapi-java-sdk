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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.expressconnectrouter.transform.v20230901.DescribeExpressConnectRouterAllowedPrefixHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExpressConnectRouterAllowedPrefixHistoryResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private String accessDeniedDetail;

	private List<AllowedPrefixHistoryListItem> allowedPrefixHistoryList;

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

	public List<AllowedPrefixHistoryListItem> getAllowedPrefixHistoryList() {
		return this.allowedPrefixHistoryList;
	}

	public void setAllowedPrefixHistoryList(List<AllowedPrefixHistoryListItem> allowedPrefixHistoryList) {
		this.allowedPrefixHistoryList = allowedPrefixHistoryList;
	}

	public static class AllowedPrefixHistoryListItem {

		private String gmtCreate;

		private List<String> allowedPrefix;

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public List<String> getAllowedPrefix() {
			return this.allowedPrefix;
		}

		public void setAllowedPrefix(List<String> allowedPrefix) {
			this.allowedPrefix = allowedPrefix;
		}
	}

	@Override
	public DescribeExpressConnectRouterAllowedPrefixHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeExpressConnectRouterAllowedPrefixHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
