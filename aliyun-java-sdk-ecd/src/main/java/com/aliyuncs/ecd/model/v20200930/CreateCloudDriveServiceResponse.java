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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.CreateCloudDriveServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateCloudDriveServiceResponse extends AcsResponse {

	private String requestId;

	private String cdsId;

	private String cdsName;

	private String maxSize;

	private String officeSiteType;

	private String cenId;

	private String domainName;

	private String orderId;

	private String errorCode;

	private ConflictCdsAndOrder conflictCdsAndOrder;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCdsId() {
		return this.cdsId;
	}

	public void setCdsId(String cdsId) {
		this.cdsId = cdsId;
	}

	public String getCdsName() {
		return this.cdsName;
	}

	public void setCdsName(String cdsName) {
		this.cdsName = cdsName;
	}

	public String getMaxSize() {
		return this.maxSize;
	}

	public void setMaxSize(String maxSize) {
		this.maxSize = maxSize;
	}

	public String getOfficeSiteType() {
		return this.officeSiteType;
	}

	public void setOfficeSiteType(String officeSiteType) {
		this.officeSiteType = officeSiteType;
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public ConflictCdsAndOrder getConflictCdsAndOrder() {
		return this.conflictCdsAndOrder;
	}

	public void setConflictCdsAndOrder(ConflictCdsAndOrder conflictCdsAndOrder) {
		this.conflictCdsAndOrder = conflictCdsAndOrder;
	}

	public static class ConflictCdsAndOrder {

		private List<ConflictCdsItem> conflictCds;

		private List<ConflictOrderItem> conflictOrder;

		public List<ConflictCdsItem> getConflictCds() {
			return this.conflictCds;
		}

		public void setConflictCds(List<ConflictCdsItem> conflictCds) {
			this.conflictCds = conflictCds;
		}

		public List<ConflictOrderItem> getConflictOrder() {
			return this.conflictOrder;
		}

		public void setConflictOrder(List<ConflictOrderItem> conflictOrder) {
			this.conflictOrder = conflictOrder;
		}

		public static class ConflictCdsItem {

			private String cdsId;

			private String regionId;

			public String getCdsId() {
				return this.cdsId;
			}

			public void setCdsId(String cdsId) {
				this.cdsId = cdsId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}

		public static class ConflictOrderItem {

			private String cdsId;

			private String orderId;

			private String regionId;

			public String getCdsId() {
				return this.cdsId;
			}

			public void setCdsId(String cdsId) {
				this.cdsId = cdsId;
			}

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}
	}

	@Override
	public CreateCloudDriveServiceResponse getInstance(UnmarshallerContext context) {
		return	CreateCloudDriveServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
