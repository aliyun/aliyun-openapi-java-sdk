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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeUserStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean buyed;

	private Boolean inDept;

	private Boolean openApiUsed;

	private String openApiBeginTime;

	private String ossCheckStatus;

	private Integer ossVideoSizeLimit;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getBuyed() {
		return this.buyed;
	}

	public void setBuyed(Boolean buyed) {
		this.buyed = buyed;
	}

	public Boolean getInDept() {
		return this.inDept;
	}

	public void setInDept(Boolean inDept) {
		this.inDept = inDept;
	}

	public Boolean getOpenApiUsed() {
		return this.openApiUsed;
	}

	public void setOpenApiUsed(Boolean openApiUsed) {
		this.openApiUsed = openApiUsed;
	}

	public String getOpenApiBeginTime() {
		return this.openApiBeginTime;
	}

	public void setOpenApiBeginTime(String openApiBeginTime) {
		this.openApiBeginTime = openApiBeginTime;
	}

	public String getOssCheckStatus() {
		return this.ossCheckStatus;
	}

	public void setOssCheckStatus(String ossCheckStatus) {
		this.ossCheckStatus = ossCheckStatus;
	}

	public Integer getOssVideoSizeLimit() {
		return this.ossVideoSizeLimit;
	}

	public void setOssVideoSizeLimit(Integer ossVideoSizeLimit) {
		this.ossVideoSizeLimit = ossVideoSizeLimit;
	}

	@Override
	public DescribeUserStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
