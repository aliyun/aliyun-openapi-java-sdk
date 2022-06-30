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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDefenseRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDefenseRecordsResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private List<DefenseRecord> defenseRecords;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DefenseRecord> getDefenseRecords() {
		return this.defenseRecords;
	}

	public void setDefenseRecords(List<DefenseRecord> defenseRecords) {
		this.defenseRecords = defenseRecords;
	}

	public static class DefenseRecord {

		private Long endTime;

		private Integer status;

		private Long startTime;

		private Integer eventCount;

		private String instanceId;

		private Long attackPeak;

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Integer getEventCount() {
			return this.eventCount;
		}

		public void setEventCount(Integer eventCount) {
			this.eventCount = eventCount;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getAttackPeak() {
			return this.attackPeak;
		}

		public void setAttackPeak(Long attackPeak) {
			this.attackPeak = attackPeak;
		}
	}

	@Override
	public DescribeDefenseRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDefenseRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
