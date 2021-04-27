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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetSuspiciousStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSuspiciousStatisticsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer temindCount;

	private Integer suspiciousCount;

	private Integer seriousCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTemindCount() {
		return this.temindCount;
	}

	public void setTemindCount(Integer temindCount) {
		this.temindCount = temindCount;
	}

	public Integer getSuspiciousCount() {
		return this.suspiciousCount;
	}

	public void setSuspiciousCount(Integer suspiciousCount) {
		this.suspiciousCount = suspiciousCount;
	}

	public Integer getSeriousCount() {
		return this.seriousCount;
	}

	public void setSeriousCount(Integer seriousCount) {
		this.seriousCount = seriousCount;
	}

	@Override
	public GetSuspiciousStatisticsResponse getInstance(UnmarshallerContext context) {
		return	GetSuspiciousStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
