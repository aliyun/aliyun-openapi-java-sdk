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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.GetSnapshotSettingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSnapshotSettingsResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private Integer beginHour;

	private Integer endHour;

	private Integer retentionDay;

	private Integer maxAutoSnapshots;

	private Integer maxManualSnapshots;

	private Integer dayList;

	private String nextTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Integer getBeginHour() {
		return this.beginHour;
	}

	public void setBeginHour(Integer beginHour) {
		this.beginHour = beginHour;
	}

	public Integer getEndHour() {
		return this.endHour;
	}

	public void setEndHour(Integer endHour) {
		this.endHour = endHour;
	}

	public Integer getRetentionDay() {
		return this.retentionDay;
	}

	public void setRetentionDay(Integer retentionDay) {
		this.retentionDay = retentionDay;
	}

	public Integer getMaxAutoSnapshots() {
		return this.maxAutoSnapshots;
	}

	public void setMaxAutoSnapshots(Integer maxAutoSnapshots) {
		this.maxAutoSnapshots = maxAutoSnapshots;
	}

	public Integer getMaxManualSnapshots() {
		return this.maxManualSnapshots;
	}

	public void setMaxManualSnapshots(Integer maxManualSnapshots) {
		this.maxManualSnapshots = maxManualSnapshots;
	}

	public Integer getDayList() {
		return this.dayList;
	}

	public void setDayList(Integer dayList) {
		this.dayList = dayList;
	}

	public String getNextTime() {
		return this.nextTime;
	}

	public void setNextTime(String nextTime) {
		this.nextTime = nextTime;
	}

	@Override
	public GetSnapshotSettingsResponse getInstance(UnmarshallerContext context) {
		return	GetSnapshotSettingsResponseUnmarshaller.unmarshall(this, context);
	}
}
