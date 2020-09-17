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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ListMsSgServiceRateLimitRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMsSgServiceRateLimitRulesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long currentPage;

	private Long pageSize;

	private String serviceRateLimitRules;

	private Long startIndex;

	private Long totalSize;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getServiceRateLimitRules() {
		return this.serviceRateLimitRules;
	}

	public void setServiceRateLimitRules(String serviceRateLimitRules) {
		this.serviceRateLimitRules = serviceRateLimitRules;
	}

	public Long getStartIndex() {
		return this.startIndex;
	}

	public void setStartIndex(Long startIndex) {
		this.startIndex = startIndex;
	}

	public Long getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	@Override
	public ListMsSgServiceRateLimitRulesResponse getInstance(UnmarshallerContext context) {
		return	ListMsSgServiceRateLimitRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
