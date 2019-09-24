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

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.hdr.transform.v20170925.DescribeSitePairInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSitePairInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private PrimarySiteInfo primarySiteInfo;

	private SecondarySiteInfo secondarySiteInfo;

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

	public PrimarySiteInfo getPrimarySiteInfo() {
		return this.primarySiteInfo;
	}

	public void setPrimarySiteInfo(PrimarySiteInfo primarySiteInfo) {
		this.primarySiteInfo = primarySiteInfo;
	}

	public SecondarySiteInfo getSecondarySiteInfo() {
		return this.secondarySiteInfo;
	}

	public void setSecondarySiteInfo(SecondarySiteInfo secondarySiteInfo) {
		this.secondarySiteInfo = secondarySiteInfo;
	}

	public static class PrimarySiteInfo {

		private Integer numberOfProtectedServers;

		private Integer numberOfUnProtectedServers;

		private Long diskSizeOfProtectedServers;

		private Integer numberOfShadowServers;

		private Long diskSizeOfShadowServers;

		private Integer numberOfRecoveryPoints;

		public Integer getNumberOfProtectedServers() {
			return this.numberOfProtectedServers;
		}

		public void setNumberOfProtectedServers(Integer numberOfProtectedServers) {
			this.numberOfProtectedServers = numberOfProtectedServers;
		}

		public Integer getNumberOfUnProtectedServers() {
			return this.numberOfUnProtectedServers;
		}

		public void setNumberOfUnProtectedServers(Integer numberOfUnProtectedServers) {
			this.numberOfUnProtectedServers = numberOfUnProtectedServers;
		}

		public Long getDiskSizeOfProtectedServers() {
			return this.diskSizeOfProtectedServers;
		}

		public void setDiskSizeOfProtectedServers(Long diskSizeOfProtectedServers) {
			this.diskSizeOfProtectedServers = diskSizeOfProtectedServers;
		}

		public Integer getNumberOfShadowServers() {
			return this.numberOfShadowServers;
		}

		public void setNumberOfShadowServers(Integer numberOfShadowServers) {
			this.numberOfShadowServers = numberOfShadowServers;
		}

		public Long getDiskSizeOfShadowServers() {
			return this.diskSizeOfShadowServers;
		}

		public void setDiskSizeOfShadowServers(Long diskSizeOfShadowServers) {
			this.diskSizeOfShadowServers = diskSizeOfShadowServers;
		}

		public Integer getNumberOfRecoveryPoints() {
			return this.numberOfRecoveryPoints;
		}

		public void setNumberOfRecoveryPoints(Integer numberOfRecoveryPoints) {
			this.numberOfRecoveryPoints = numberOfRecoveryPoints;
		}
	}

	public static class SecondarySiteInfo {

		private Integer numberOfProtectedServers;

		private Integer numberOfUnProtectedServers;

		private Long diskSizeOfProtectedServers;

		private Integer numberOfShadowServers;

		private Long diskSizeOfShadowServers;

		private Integer numberOfRecoveryPoints;

		public Integer getNumberOfProtectedServers() {
			return this.numberOfProtectedServers;
		}

		public void setNumberOfProtectedServers(Integer numberOfProtectedServers) {
			this.numberOfProtectedServers = numberOfProtectedServers;
		}

		public Integer getNumberOfUnProtectedServers() {
			return this.numberOfUnProtectedServers;
		}

		public void setNumberOfUnProtectedServers(Integer numberOfUnProtectedServers) {
			this.numberOfUnProtectedServers = numberOfUnProtectedServers;
		}

		public Long getDiskSizeOfProtectedServers() {
			return this.diskSizeOfProtectedServers;
		}

		public void setDiskSizeOfProtectedServers(Long diskSizeOfProtectedServers) {
			this.diskSizeOfProtectedServers = diskSizeOfProtectedServers;
		}

		public Integer getNumberOfShadowServers() {
			return this.numberOfShadowServers;
		}

		public void setNumberOfShadowServers(Integer numberOfShadowServers) {
			this.numberOfShadowServers = numberOfShadowServers;
		}

		public Long getDiskSizeOfShadowServers() {
			return this.diskSizeOfShadowServers;
		}

		public void setDiskSizeOfShadowServers(Long diskSizeOfShadowServers) {
			this.diskSizeOfShadowServers = diskSizeOfShadowServers;
		}

		public Integer getNumberOfRecoveryPoints() {
			return this.numberOfRecoveryPoints;
		}

		public void setNumberOfRecoveryPoints(Integer numberOfRecoveryPoints) {
			this.numberOfRecoveryPoints = numberOfRecoveryPoints;
		}
	}

	@Override
	public DescribeSitePairInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeSitePairInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
