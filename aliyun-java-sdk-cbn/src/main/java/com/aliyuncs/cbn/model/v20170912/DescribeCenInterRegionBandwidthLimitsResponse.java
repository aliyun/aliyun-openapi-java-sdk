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
import com.aliyuncs.cbn.transform.v20170912.DescribeCenInterRegionBandwidthLimitsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCenInterRegionBandwidthLimitsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<CenInterRegionBandwidthLimit> cenInterRegionBandwidthLimits;

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

	public List<CenInterRegionBandwidthLimit> getCenInterRegionBandwidthLimits() {
		return this.cenInterRegionBandwidthLimits;
	}

	public void setCenInterRegionBandwidthLimits(List<CenInterRegionBandwidthLimit> cenInterRegionBandwidthLimits) {
		this.cenInterRegionBandwidthLimits = cenInterRegionBandwidthLimits;
	}

	public static class CenInterRegionBandwidthLimit {

		private String cenId;

		private String localRegionId;

		private String oppositeRegionId;

		private String geographicSpanId;

		private Long bandwidthLimit;

		private String status;

		private String transitRouterAttachmentId;

		private String bandwidthPackageId;

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public String getLocalRegionId() {
			return this.localRegionId;
		}

		public void setLocalRegionId(String localRegionId) {
			this.localRegionId = localRegionId;
		}

		public String getOppositeRegionId() {
			return this.oppositeRegionId;
		}

		public void setOppositeRegionId(String oppositeRegionId) {
			this.oppositeRegionId = oppositeRegionId;
		}

		public String getGeographicSpanId() {
			return this.geographicSpanId;
		}

		public void setGeographicSpanId(String geographicSpanId) {
			this.geographicSpanId = geographicSpanId;
		}

		public Long getBandwidthLimit() {
			return this.bandwidthLimit;
		}

		public void setBandwidthLimit(Long bandwidthLimit) {
			this.bandwidthLimit = bandwidthLimit;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTransitRouterAttachmentId() {
			return this.transitRouterAttachmentId;
		}

		public void setTransitRouterAttachmentId(String transitRouterAttachmentId) {
			this.transitRouterAttachmentId = transitRouterAttachmentId;
		}

		public String getBandwidthPackageId() {
			return this.bandwidthPackageId;
		}

		public void setBandwidthPackageId(String bandwidthPackageId) {
			this.bandwidthPackageId = bandwidthPackageId;
		}
	}

	@Override
	public DescribeCenInterRegionBandwidthLimitsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCenInterRegionBandwidthLimitsResponseUnmarshaller.unmarshall(this, context);
	}
}
