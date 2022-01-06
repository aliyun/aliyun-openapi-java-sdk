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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveDomainStreamWaterLevelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainStreamWaterLevelResponse extends AcsResponse {

	private String requestId;

	private List<LiveDomainWaterLevel> liveDomainWaterLevelList;

	private LiveUidWaterLevel liveUidWaterLevel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveDomainWaterLevel> getLiveDomainWaterLevelList() {
		return this.liveDomainWaterLevelList;
	}

	public void setLiveDomainWaterLevelList(List<LiveDomainWaterLevel> liveDomainWaterLevelList) {
		this.liveDomainWaterLevelList = liveDomainWaterLevelList;
	}

	public LiveUidWaterLevel getLiveUidWaterLevel() {
		return this.liveUidWaterLevel;
	}

	public void setLiveUidWaterLevel(LiveUidWaterLevel liveUidWaterLevel) {
		this.liveUidWaterLevel = liveUidWaterLevel;
	}

	public static class LiveDomainWaterLevel {

		private String domainName;

		private Integer domainRawCount;

		private Integer domainTranscodeCount;

		private Integer domainRawLimit;

		private Integer domainTranscodeLimit;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Integer getDomainRawCount() {
			return this.domainRawCount;
		}

		public void setDomainRawCount(Integer domainRawCount) {
			this.domainRawCount = domainRawCount;
		}

		public Integer getDomainTranscodeCount() {
			return this.domainTranscodeCount;
		}

		public void setDomainTranscodeCount(Integer domainTranscodeCount) {
			this.domainTranscodeCount = domainTranscodeCount;
		}

		public Integer getDomainRawLimit() {
			return this.domainRawLimit;
		}

		public void setDomainRawLimit(Integer domainRawLimit) {
			this.domainRawLimit = domainRawLimit;
		}

		public Integer getDomainTranscodeLimit() {
			return this.domainTranscodeLimit;
		}

		public void setDomainTranscodeLimit(Integer domainTranscodeLimit) {
			this.domainTranscodeLimit = domainTranscodeLimit;
		}
	}

	public static class LiveUidWaterLevel {

		private String aliUid;

		private Integer uidRawCount;

		private Integer uidTranscodeCount;

		private Integer uidRawLimit;

		private Integer uidTranscodeLimit;

		public String getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(String aliUid) {
			this.aliUid = aliUid;
		}

		public Integer getUidRawCount() {
			return this.uidRawCount;
		}

		public void setUidRawCount(Integer uidRawCount) {
			this.uidRawCount = uidRawCount;
		}

		public Integer getUidTranscodeCount() {
			return this.uidTranscodeCount;
		}

		public void setUidTranscodeCount(Integer uidTranscodeCount) {
			this.uidTranscodeCount = uidTranscodeCount;
		}

		public Integer getUidRawLimit() {
			return this.uidRawLimit;
		}

		public void setUidRawLimit(Integer uidRawLimit) {
			this.uidRawLimit = uidRawLimit;
		}

		public Integer getUidTranscodeLimit() {
			return this.uidTranscodeLimit;
		}

		public void setUidTranscodeLimit(Integer uidTranscodeLimit) {
			this.uidTranscodeLimit = uidTranscodeLimit;
		}
	}

	@Override
	public DescribeLiveDomainStreamWaterLevelResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDomainStreamWaterLevelResponseUnmarshaller.unmarshall(this, context);
	}
}
