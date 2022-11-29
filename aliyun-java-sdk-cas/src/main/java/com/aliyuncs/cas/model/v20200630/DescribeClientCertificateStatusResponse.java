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

package com.aliyuncs.cas.model.v20200630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20200630.DescribeClientCertificateStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClientCertificateStatusResponse extends AcsResponse {

	private String requestId;

	private List<CertificateStatusItem> certificateStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CertificateStatusItem> getCertificateStatus() {
		return this.certificateStatus;
	}

	public void setCertificateStatus(List<CertificateStatusItem> certificateStatus) {
		this.certificateStatus = certificateStatus;
	}

	public static class CertificateStatusItem {

		private String serialNumber;

		private String status;

		private Long revokeTime;

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getRevokeTime() {
			return this.revokeTime;
		}

		public void setRevokeTime(Long revokeTime) {
			this.revokeTime = revokeTime;
		}
	}

	@Override
	public DescribeClientCertificateStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeClientCertificateStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
