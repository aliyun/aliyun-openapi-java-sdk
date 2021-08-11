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
import com.aliyuncs.ecd.transform.v20200930.DescribeVulOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulOverviewResponse extends AcsResponse {

	private String requestId;

	private Integer asapCount;

	private Integer laterCount;

	private Integer nntfCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getAsapCount() {
		return this.asapCount;
	}

	public void setAsapCount(Integer asapCount) {
		this.asapCount = asapCount;
	}

	public Integer getLaterCount() {
		return this.laterCount;
	}

	public void setLaterCount(Integer laterCount) {
		this.laterCount = laterCount;
	}

	public Integer getNntfCount() {
		return this.nntfCount;
	}

	public void setNntfCount(Integer nntfCount) {
		this.nntfCount = nntfCount;
	}

	@Override
	public DescribeVulOverviewResponse getInstance(UnmarshallerContext context) {
		return	DescribeVulOverviewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
