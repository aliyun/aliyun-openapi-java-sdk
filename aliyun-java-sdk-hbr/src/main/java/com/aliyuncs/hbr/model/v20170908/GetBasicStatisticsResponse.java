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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.GetBasicStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBasicStatisticsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private String sourceType;

	private List<RegionStatistic> regionStatistics;

	private GlobalStatistics globalStatistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public List<RegionStatistic> getRegionStatistics() {
		return this.regionStatistics;
	}

	public void setRegionStatistics(List<RegionStatistic> regionStatistics) {
		this.regionStatistics = regionStatistics;
	}

	public GlobalStatistics getGlobalStatistics() {
		return this.globalStatistics;
	}

	public void setGlobalStatistics(GlobalStatistics globalStatistics) {
		this.globalStatistics = globalStatistics;
	}

	public static class RegionStatistic {

		private Long protectedDataSize;

		private Integer protectedResourceCount;

		private String regionId;

		public Long getProtectedDataSize() {
			return this.protectedDataSize;
		}

		public void setProtectedDataSize(Long protectedDataSize) {
			this.protectedDataSize = protectedDataSize;
		}

		public Integer getProtectedResourceCount() {
			return this.protectedResourceCount;
		}

		public void setProtectedResourceCount(Integer protectedResourceCount) {
			this.protectedResourceCount = protectedResourceCount;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	public static class GlobalStatistics {

		private Long protectedDataSize;

		private Integer protectedResourceCount;

		public Long getProtectedDataSize() {
			return this.protectedDataSize;
		}

		public void setProtectedDataSize(Long protectedDataSize) {
			this.protectedDataSize = protectedDataSize;
		}

		public Integer getProtectedResourceCount() {
			return this.protectedResourceCount;
		}

		public void setProtectedResourceCount(Integer protectedResourceCount) {
			this.protectedResourceCount = protectedResourceCount;
		}
	}

	@Override
	public GetBasicStatisticsResponse getInstance(UnmarshallerContext context) {
		return	GetBasicStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
