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

package com.aliyuncs.cds.model.v20170925;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cds.transform.v20170925.GetBuildResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBuildResponse extends AcsResponse {

	private String buildEnv;

	private Integer buildNumber;

	private Integer duration;

	private String log;

	private Long startTime;

	private String requestId;

	public String getBuildEnv() {
		return this.buildEnv;
	}

	public void setBuildEnv(String buildEnv) {
		this.buildEnv = buildEnv;
	}

	public Integer getBuildNumber() {
		return this.buildNumber;
	}

	public void setBuildNumber(Integer buildNumber) {
		this.buildNumber = buildNumber;
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getLog() {
		return this.log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public GetBuildResponse getInstance(UnmarshallerContext context) {
		return	GetBuildResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
