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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeSuspEventOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspEventOverviewResponse extends AcsResponse {

	private Integer suspiciousCount;

	private Integer remindCount;

	private Integer seriousCount;

	private String requestId;

	public Integer getSuspiciousCount() {
		return this.suspiciousCount;
	}

	public void setSuspiciousCount(Integer suspiciousCount) {
		this.suspiciousCount = suspiciousCount;
	}

	public Integer getRemindCount() {
		return this.remindCount;
	}

	public void setRemindCount(Integer remindCount) {
		this.remindCount = remindCount;
	}

	public Integer getSeriousCount() {
		return this.seriousCount;
	}

	public void setSeriousCount(Integer seriousCount) {
		this.seriousCount = seriousCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public DescribeSuspEventOverviewResponse getInstance(UnmarshallerContext context) {
		return	DescribeSuspEventOverviewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
