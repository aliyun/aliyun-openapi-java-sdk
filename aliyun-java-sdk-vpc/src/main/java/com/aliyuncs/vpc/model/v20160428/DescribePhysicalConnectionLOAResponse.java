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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribePhysicalConnectionLOAResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePhysicalConnectionLOAResponse extends AcsResponse {

	private String requestId;

	private PhysicalConnectionLOAType physicalConnectionLOAType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PhysicalConnectionLOAType getPhysicalConnectionLOAType() {
		return this.physicalConnectionLOAType;
	}

	public void setPhysicalConnectionLOAType(PhysicalConnectionLOAType physicalConnectionLOAType) {
		this.physicalConnectionLOAType = physicalConnectionLOAType;
	}

	public static class PhysicalConnectionLOAType {

		private String status;

		private String lineLabel;

		private String lineCode;

		private String constructionTime;

		private String sI;

		private String loaUrl;

		private String companyLocalizedName;

		private String instanceId;

		private String lineType;

		private String companyName;

		private String lineServiceProvider;

		private String lineSPContactInfo;

		private List<PMInfoItem> pMInfo;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getLineLabel() {
			return this.lineLabel;
		}

		public void setLineLabel(String lineLabel) {
			this.lineLabel = lineLabel;
		}

		public String getLineCode() {
			return this.lineCode;
		}

		public void setLineCode(String lineCode) {
			this.lineCode = lineCode;
		}

		public String getConstructionTime() {
			return this.constructionTime;
		}

		public void setConstructionTime(String constructionTime) {
			this.constructionTime = constructionTime;
		}

		public String getSI() {
			return this.sI;
		}

		public void setSI(String sI) {
			this.sI = sI;
		}

		public String getLoaUrl() {
			return this.loaUrl;
		}

		public void setLoaUrl(String loaUrl) {
			this.loaUrl = loaUrl;
		}

		public String getCompanyLocalizedName() {
			return this.companyLocalizedName;
		}

		public void setCompanyLocalizedName(String companyLocalizedName) {
			this.companyLocalizedName = companyLocalizedName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getLineType() {
			return this.lineType;
		}

		public void setLineType(String lineType) {
			this.lineType = lineType;
		}

		public String getCompanyName() {
			return this.companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getLineServiceProvider() {
			return this.lineServiceProvider;
		}

		public void setLineServiceProvider(String lineServiceProvider) {
			this.lineServiceProvider = lineServiceProvider;
		}

		public String getLineSPContactInfo() {
			return this.lineSPContactInfo;
		}

		public void setLineSPContactInfo(String lineSPContactInfo) {
			this.lineSPContactInfo = lineSPContactInfo;
		}

		public List<PMInfoItem> getPMInfo() {
			return this.pMInfo;
		}

		public void setPMInfo(List<PMInfoItem> pMInfo) {
			this.pMInfo = pMInfo;
		}

		public static class PMInfoItem {

			private String pMGender;

			private String pMCertificateNo;

			private String pMName;

			private String pMCertificateType;

			private String pMContactInfo;

			public String getPMGender() {
				return this.pMGender;
			}

			public void setPMGender(String pMGender) {
				this.pMGender = pMGender;
			}

			public String getPMCertificateNo() {
				return this.pMCertificateNo;
			}

			public void setPMCertificateNo(String pMCertificateNo) {
				this.pMCertificateNo = pMCertificateNo;
			}

			public String getPMName() {
				return this.pMName;
			}

			public void setPMName(String pMName) {
				this.pMName = pMName;
			}

			public String getPMCertificateType() {
				return this.pMCertificateType;
			}

			public void setPMCertificateType(String pMCertificateType) {
				this.pMCertificateType = pMCertificateType;
			}

			public String getPMContactInfo() {
				return this.pMContactInfo;
			}

			public void setPMContactInfo(String pMContactInfo) {
				this.pMContactInfo = pMContactInfo;
			}
		}
	}

	@Override
	public DescribePhysicalConnectionLOAResponse getInstance(UnmarshallerContext context) {
		return	DescribePhysicalConnectionLOAResponseUnmarshaller.unmarshall(this, context);
	}
}
