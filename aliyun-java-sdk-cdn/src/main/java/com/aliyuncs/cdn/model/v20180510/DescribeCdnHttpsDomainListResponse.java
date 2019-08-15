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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeCdnHttpsDomainListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCdnHttpsDomainListResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<CertInfo> certInfos;

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

	public List<CertInfo> getCertInfos() {
		return this.certInfos;
	}

	public void setCertInfos(List<CertInfo> certInfos) {
		this.certInfos = certInfos;
	}

	public static class CertInfo {

		private String certCommonName;

		private String certName;

		private String certStartTime;

		private String certExpireTime;

		private String certStatus;

		private String certType;

		private String domainName;

		private String certUpdateTime;

		public String getCertCommonName() {
			return this.certCommonName;
		}

		public void setCertCommonName(String certCommonName) {
			this.certCommonName = certCommonName;
		}

		public String getCertName() {
			return this.certName;
		}

		public void setCertName(String certName) {
			this.certName = certName;
		}

		public String getCertStartTime() {
			return this.certStartTime;
		}

		public void setCertStartTime(String certStartTime) {
			this.certStartTime = certStartTime;
		}

		public String getCertExpireTime() {
			return this.certExpireTime;
		}

		public void setCertExpireTime(String certExpireTime) {
			this.certExpireTime = certExpireTime;
		}

		public String getCertStatus() {
			return this.certStatus;
		}

		public void setCertStatus(String certStatus) {
			this.certStatus = certStatus;
		}

		public String getCertType() {
			return this.certType;
		}

		public void setCertType(String certType) {
			this.certType = certType;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getCertUpdateTime() {
			return this.certUpdateTime;
		}

		public void setCertUpdateTime(String certUpdateTime) {
			this.certUpdateTime = certUpdateTime;
		}
	}

	@Override
	public DescribeCdnHttpsDomainListResponse getInstance(UnmarshallerContext context) {
		return	DescribeCdnHttpsDomainListResponseUnmarshaller.unmarshall(this, context);
	}
}
