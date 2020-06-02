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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.GetRepoTagScanSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRepoTagScanSummaryResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private Integer lowSeverity;

	private Integer mediumSeverity;

	private Integer highSeverity;

	private Integer unknownSeverity;

	private Integer totalSeverity;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getLowSeverity() {
		return this.lowSeverity;
	}

	public void setLowSeverity(Integer lowSeverity) {
		this.lowSeverity = lowSeverity;
	}

	public Integer getMediumSeverity() {
		return this.mediumSeverity;
	}

	public void setMediumSeverity(Integer mediumSeverity) {
		this.mediumSeverity = mediumSeverity;
	}

	public Integer getHighSeverity() {
		return this.highSeverity;
	}

	public void setHighSeverity(Integer highSeverity) {
		this.highSeverity = highSeverity;
	}

	public Integer getUnknownSeverity() {
		return this.unknownSeverity;
	}

	public void setUnknownSeverity(Integer unknownSeverity) {
		this.unknownSeverity = unknownSeverity;
	}

	public Integer getTotalSeverity() {
		return this.totalSeverity;
	}

	public void setTotalSeverity(Integer totalSeverity) {
		this.totalSeverity = totalSeverity;
	}

	@Override
	public GetRepoTagScanSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetRepoTagScanSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
