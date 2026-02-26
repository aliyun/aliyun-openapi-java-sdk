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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveDelayConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDelayConfigResponse extends AcsResponse {

	private String app;

	private String delayTime;

	private String domain;

	private String requestId;

	private String stream;

	private String taskTriggerMode;

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getDelayTime() {
		return this.delayTime;
	}

	public void setDelayTime(String delayTime) {
		this.delayTime = delayTime;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStream() {
		return this.stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getTaskTriggerMode() {
		return this.taskTriggerMode;
	}

	public void setTaskTriggerMode(String taskTriggerMode) {
		this.taskTriggerMode = taskTriggerMode;
	}

	@Override
	public DescribeLiveDelayConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDelayConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
