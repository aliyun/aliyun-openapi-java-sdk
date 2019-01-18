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

package com.aliyuncs.linkwan.model.v20181230;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.GetFreqBandPlanGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFreqBandPlanGroupResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long groupId;

		private String frequencyRegionId;

		private String frequencyType;

		private Long beginFrequency;

		private Long endFrequency;

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getFrequencyRegionId() {
			return this.frequencyRegionId;
		}

		public void setFrequencyRegionId(String frequencyRegionId) {
			this.frequencyRegionId = frequencyRegionId;
		}

		public String getFrequencyType() {
			return this.frequencyType;
		}

		public void setFrequencyType(String frequencyType) {
			this.frequencyType = frequencyType;
		}

		public Long getBeginFrequency() {
			return this.beginFrequency;
		}

		public void setBeginFrequency(Long beginFrequency) {
			this.beginFrequency = beginFrequency;
		}

		public Long getEndFrequency() {
			return this.endFrequency;
		}

		public void setEndFrequency(Long endFrequency) {
			this.endFrequency = endFrequency;
		}
	}

	@Override
	public GetFreqBandPlanGroupResponse getInstance(UnmarshallerContext context) {
		return	GetFreqBandPlanGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
