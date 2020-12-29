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
import com.aliyuncs.vpc.transform.v20160428.ListVpnCertificateAssociationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpnCertificateAssociationsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private Integer totalCount;

	private List<VpnCertificateRelation> vpnCertificateRelations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<VpnCertificateRelation> getVpnCertificateRelations() {
		return this.vpnCertificateRelations;
	}

	public void setVpnCertificateRelations(List<VpnCertificateRelation> vpnCertificateRelations) {
		this.vpnCertificateRelations = vpnCertificateRelations;
	}

	public static class VpnCertificateRelation {

		private String regionId;

		private String vpnGatewayId;

		private String certificateId;

		private String certificateType;

		private String associationTime;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVpnGatewayId() {
			return this.vpnGatewayId;
		}

		public void setVpnGatewayId(String vpnGatewayId) {
			this.vpnGatewayId = vpnGatewayId;
		}

		public String getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(String certificateId) {
			this.certificateId = certificateId;
		}

		public String getCertificateType() {
			return this.certificateType;
		}

		public void setCertificateType(String certificateType) {
			this.certificateType = certificateType;
		}

		public String getAssociationTime() {
			return this.associationTime;
		}

		public void setAssociationTime(String associationTime) {
			this.associationTime = associationTime;
		}
	}

	@Override
	public ListVpnCertificateAssociationsResponse getInstance(UnmarshallerContext context) {
		return	ListVpnCertificateAssociationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
