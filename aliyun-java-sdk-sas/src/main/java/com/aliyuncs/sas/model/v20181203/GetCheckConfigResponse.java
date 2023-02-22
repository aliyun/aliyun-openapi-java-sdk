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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetCheckConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCheckConfigResponse extends AcsResponse {

	private Integer startTime;

	private Integer endTime;

	private Map<Object,Object> data;

	private String requestId;

	private List<StandardsItem> standards;

	private List<Integer> cycleDays;

	public Integer getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}

	public Integer getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

	public Map<Object,Object> getData() {
		return this.data;
	}

	public void setData(Map<Object,Object> data) {
		this.data = data;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StandardsItem> getStandards() {
		return this.standards;
	}

	public void setStandards(List<StandardsItem> standards) {
		this.standards = standards;
	}

	public List<Integer> getCycleDays() {
		return this.cycleDays;
	}

	public void setCycleDays(List<Integer> cycleDays) {
		this.cycleDays = cycleDays;
	}

	public static class StandardsItem {

		private Long id;

		private String showName;

		private String type;

		private String status;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getShowName() {
			return this.showName;
		}

		public void setShowName(String showName) {
			this.showName = showName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public GetCheckConfigResponse getInstance(UnmarshallerContext context) {
		return	GetCheckConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
