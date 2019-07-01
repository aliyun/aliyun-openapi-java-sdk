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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeNotificationSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNotificationSettingResponse extends AcsResponse {

	private String requestId;

	private String email;

	private String phone;

	private Integer scheduleMessageTime;

	private Integer scheduleMessageTimeZone;

	private List<String> realtimeMessageList;

	private List<String> reminderModeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getScheduleMessageTime() {
		return this.scheduleMessageTime;
	}

	public void setScheduleMessageTime(Integer scheduleMessageTime) {
		this.scheduleMessageTime = scheduleMessageTime;
	}

	public Integer getScheduleMessageTimeZone() {
		return this.scheduleMessageTimeZone;
	}

	public void setScheduleMessageTimeZone(Integer scheduleMessageTimeZone) {
		this.scheduleMessageTimeZone = scheduleMessageTimeZone;
	}

	public List<String> getRealtimeMessageList() {
		return this.realtimeMessageList;
	}

	public void setRealtimeMessageList(List<String> realtimeMessageList) {
		this.realtimeMessageList = realtimeMessageList;
	}

	public List<String> getReminderModeList() {
		return this.reminderModeList;
	}

	public void setReminderModeList(List<String> reminderModeList) {
		this.reminderModeList = reminderModeList;
	}

	@Override
	public DescribeNotificationSettingResponse getInstance(UnmarshallerContext context) {
		return	DescribeNotificationSettingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
