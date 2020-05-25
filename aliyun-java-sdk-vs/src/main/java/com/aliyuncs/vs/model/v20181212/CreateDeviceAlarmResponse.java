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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.CreateDeviceAlarmResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateDeviceAlarmResponse extends AcsResponse {

	private String requestId;

	private String url;

	private Long expire;

	private String alarmId;

	private Long alarmDelay;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getExpire() {
		return this.expire;
	}

	public void setExpire(Long expire) {
		this.expire = expire;
	}

	public String getAlarmId() {
		return this.alarmId;
	}

	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
	}

	public Long getAlarmDelay() {
		return this.alarmDelay;
	}

	public void setAlarmDelay(Long alarmDelay) {
		this.alarmDelay = alarmDelay;
	}

	@Override
	public CreateDeviceAlarmResponse getInstance(UnmarshallerContext context) {
		return	CreateDeviceAlarmResponseUnmarshaller.unmarshall(this, context);
	}
}
