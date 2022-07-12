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

package com.aliyuncs.antiddos_public.model.v20170518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.antiddos_public.transform.v20170518.DescribeDdosEventListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDdosEventListResponse extends AcsResponse {

	private Integer total;

	private String requestId;

	private List<DdosEvent> ddosEventList;

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DdosEvent> getDdosEventList() {
		return this.ddosEventList;
	}

	public void setDdosEventList(List<DdosEvent> ddosEventList) {
		this.ddosEventList = ddosEventList;
	}

	public static class DdosEvent {

		private String ddosType;

		private Long endTime;

		private Long startTime;

		private Long delayTime;

		private String ddosStatus;

		private Long unBlackholeTime;

		public String getDdosType() {
			return this.ddosType;
		}

		public void setDdosType(String ddosType) {
			this.ddosType = ddosType;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getDelayTime() {
			return this.delayTime;
		}

		public void setDelayTime(Long delayTime) {
			this.delayTime = delayTime;
		}

		public String getDdosStatus() {
			return this.ddosStatus;
		}

		public void setDdosStatus(String ddosStatus) {
			this.ddosStatus = ddosStatus;
		}

		public Long getUnBlackholeTime() {
			return this.unBlackholeTime;
		}

		public void setUnBlackholeTime(Long unBlackholeTime) {
			this.unBlackholeTime = unBlackholeTime;
		}
	}

	@Override
	public DescribeDdosEventListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDdosEventListResponseUnmarshaller.unmarshall(this, context);
	}
}
