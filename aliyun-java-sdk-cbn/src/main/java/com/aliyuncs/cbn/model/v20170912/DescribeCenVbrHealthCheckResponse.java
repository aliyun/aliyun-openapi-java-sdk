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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.DescribeCenVbrHealthCheckResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCenVbrHealthCheckResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<VbrHealthCheck> vbrHealthChecks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<VbrHealthCheck> getVbrHealthChecks() {
		return this.vbrHealthChecks;
	}

	public void setVbrHealthChecks(List<VbrHealthCheck> vbrHealthChecks) {
		this.vbrHealthChecks = vbrHealthChecks;
	}

	public static class VbrHealthCheck {

		private String cenId;

		private String vbrInstanceId;

		private String linkStatus;

		private Long packetLoss;

		private String healthCheckSourceIp;

		private String healthCheckTargetIp;

		private Long delay;

		private Integer healthCheckInterval;

		private Integer healthyThreshold;

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public String getVbrInstanceId() {
			return this.vbrInstanceId;
		}

		public void setVbrInstanceId(String vbrInstanceId) {
			this.vbrInstanceId = vbrInstanceId;
		}

		public String getLinkStatus() {
			return this.linkStatus;
		}

		public void setLinkStatus(String linkStatus) {
			this.linkStatus = linkStatus;
		}

		public Long getPacketLoss() {
			return this.packetLoss;
		}

		public void setPacketLoss(Long packetLoss) {
			this.packetLoss = packetLoss;
		}

		public String getHealthCheckSourceIp() {
			return this.healthCheckSourceIp;
		}

		public void setHealthCheckSourceIp(String healthCheckSourceIp) {
			this.healthCheckSourceIp = healthCheckSourceIp;
		}

		public String getHealthCheckTargetIp() {
			return this.healthCheckTargetIp;
		}

		public void setHealthCheckTargetIp(String healthCheckTargetIp) {
			this.healthCheckTargetIp = healthCheckTargetIp;
		}

		public Long getDelay() {
			return this.delay;
		}

		public void setDelay(Long delay) {
			this.delay = delay;
		}

		public Integer getHealthCheckInterval() {
			return this.healthCheckInterval;
		}

		public void setHealthCheckInterval(Integer healthCheckInterval) {
			this.healthCheckInterval = healthCheckInterval;
		}

		public Integer getHealthyThreshold() {
			return this.healthyThreshold;
		}

		public void setHealthyThreshold(Integer healthyThreshold) {
			this.healthyThreshold = healthyThreshold;
		}
	}

	@Override
	public DescribeCenVbrHealthCheckResponse getInstance(UnmarshallerContext context) {
		return	DescribeCenVbrHealthCheckResponseUnmarshaller.unmarshall(this, context);
	}
}
