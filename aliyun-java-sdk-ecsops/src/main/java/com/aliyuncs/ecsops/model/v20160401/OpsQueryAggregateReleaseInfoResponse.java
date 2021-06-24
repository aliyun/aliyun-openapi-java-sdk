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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryAggregateReleaseInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryAggregateReleaseInfoResponse extends AcsResponse {

	private String status;

	private Boolean finished;

	private String requestId;

	private String token;

	private List<AggregateReleaseItem> aggregateReleaseResults;

	private List<DetailInfoItem> detailInfos;

	private List<AggregateTimeResultItem> aggregateTimeResults;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getFinished() {
		return this.finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<AggregateReleaseItem> getAggregateReleaseResults() {
		return this.aggregateReleaseResults;
	}

	public void setAggregateReleaseResults(List<AggregateReleaseItem> aggregateReleaseResults) {
		this.aggregateReleaseResults = aggregateReleaseResults;
	}

	public List<DetailInfoItem> getDetailInfos() {
		return this.detailInfos;
	}

	public void setDetailInfos(List<DetailInfoItem> detailInfos) {
		this.detailInfos = detailInfos;
	}

	public List<AggregateTimeResultItem> getAggregateTimeResults() {
		return this.aggregateTimeResults;
	}

	public void setAggregateTimeResults(List<AggregateTimeResultItem> aggregateTimeResults) {
		this.aggregateTimeResults = aggregateTimeResults;
	}

	public static class AggregateReleaseItem {

		private String releaseComponent;

		private List<String> impactNcIps;

		public String getReleaseComponent() {
			return this.releaseComponent;
		}

		public void setReleaseComponent(String releaseComponent) {
			this.releaseComponent = releaseComponent;
		}

		public List<String> getImpactNcIps() {
			return this.impactNcIps;
		}

		public void setImpactNcIps(List<String> impactNcIps) {
			this.impactNcIps = impactNcIps;
		}
	}

	public static class DetailInfoItem {

		private String endTime;

		private String startTime;

		private String ncIp;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}
	}

	public static class AggregateTimeResultItem {

		private Integer impactNcIpCnt;

		private String timestamp;

		public Integer getImpactNcIpCnt() {
			return this.impactNcIpCnt;
		}

		public void setImpactNcIpCnt(Integer impactNcIpCnt) {
			this.impactNcIpCnt = impactNcIpCnt;
		}

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
	}

	@Override
	public OpsQueryAggregateReleaseInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryAggregateReleaseInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
