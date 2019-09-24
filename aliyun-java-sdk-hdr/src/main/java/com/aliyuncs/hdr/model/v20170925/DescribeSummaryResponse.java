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

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.hdr.transform.v20170925.DescribeSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSummaryResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Long serverCount;

	private Long dbServerCount;

	private Long siteCount;

	private Long totalSize;

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

	public Long getServerCount() {
		return this.serverCount;
	}

	public void setServerCount(Long serverCount) {
		this.serverCount = serverCount;
	}

	public Long getDbServerCount() {
		return this.dbServerCount;
	}

	public void setDbServerCount(Long dbServerCount) {
		this.dbServerCount = dbServerCount;
	}

	public Long getSiteCount() {
		return this.siteCount;
	}

	public void setSiteCount(Long siteCount) {
		this.siteCount = siteCount;
	}

	public Long getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	@Override
	public DescribeSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeSummaryResponseUnmarshaller.unmarshall(this, context);
	}
}
