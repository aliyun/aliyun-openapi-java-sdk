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

package com.aliyuncs.jarvis.model.v20180206;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.jarvis.transform.v20180206.DescribeDdosDefenseInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDdosDefenseInfoResponse extends AcsResponse {

	private String requestId;

	private String module;

	private Integer blackTimes;

	private Integer duration;

	private String bgpPkgState;

	private List<DdosDefenseThresholdItem> ddosDefenseThreshold;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Integer getBlackTimes() {
		return this.blackTimes;
	}

	public void setBlackTimes(Integer blackTimes) {
		this.blackTimes = blackTimes;
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getBgpPkgState() {
		return this.bgpPkgState;
	}

	public void setBgpPkgState(String bgpPkgState) {
		this.bgpPkgState = bgpPkgState;
	}

	public List<DdosDefenseThresholdItem> getDdosDefenseThreshold() {
		return this.ddosDefenseThreshold;
	}

	public void setDdosDefenseThreshold(List<DdosDefenseThresholdItem> ddosDefenseThreshold) {
		this.ddosDefenseThreshold = ddosDefenseThreshold;
	}

	public static class DdosDefenseThresholdItem {

		private String regionId;

		private Integer currThreshold;

		private Integer recommendThreshold;

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getCurrThreshold() {
			return this.currThreshold;
		}

		public void setCurrThreshold(Integer currThreshold) {
			this.currThreshold = currThreshold;
		}

		public Integer getRecommendThreshold() {
			return this.recommendThreshold;
		}

		public void setRecommendThreshold(Integer recommendThreshold) {
			this.recommendThreshold = recommendThreshold;
		}
	}

	@Override
	public DescribeDdosDefenseInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDdosDefenseInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
