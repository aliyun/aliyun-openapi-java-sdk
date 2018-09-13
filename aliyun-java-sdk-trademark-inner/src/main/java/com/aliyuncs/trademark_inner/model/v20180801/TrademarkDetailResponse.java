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

package com.aliyuncs.trademark_inner.model.v20180801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark_inner.transform.v20180801.TrademarkDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TrademarkDetailResponse extends AcsResponse {

	private String requestId;

	private String name;

	private String registrationNumber;

	private String classification;

	private String applyDate;

	private String ownerName;

	private String ownerAddress;

	private String ownerEnName;

	private String ownerEnAddress;

	private String image;

	private String imageElement;

	private String similarGroup;

	private String product;

	private String preAnnNum;

	private String regAnnNum;

	private String preAnnDate;

	private String regAnnDate;

	private String exclusiveDateLimit;

	private Integer share;

	private String subsequentDesignationDate;

	private String intlRegDate;

	private String priorityDate;

	private String agency;

	private String status;

	private String productDesc;

	private String lastProcedureStatus;

	private String registrationType;

	private List<AnnounceDetail> announces;

	private List<Procedure> procedures;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerAddress() {
		return this.ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getOwnerEnName() {
		return this.ownerEnName;
	}

	public void setOwnerEnName(String ownerEnName) {
		this.ownerEnName = ownerEnName;
	}

	public String getOwnerEnAddress() {
		return this.ownerEnAddress;
	}

	public void setOwnerEnAddress(String ownerEnAddress) {
		this.ownerEnAddress = ownerEnAddress;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImageElement() {
		return this.imageElement;
	}

	public void setImageElement(String imageElement) {
		this.imageElement = imageElement;
	}

	public String getSimilarGroup() {
		return this.similarGroup;
	}

	public void setSimilarGroup(String similarGroup) {
		this.similarGroup = similarGroup;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getPreAnnNum() {
		return this.preAnnNum;
	}

	public void setPreAnnNum(String preAnnNum) {
		this.preAnnNum = preAnnNum;
	}

	public String getRegAnnNum() {
		return this.regAnnNum;
	}

	public void setRegAnnNum(String regAnnNum) {
		this.regAnnNum = regAnnNum;
	}

	public String getPreAnnDate() {
		return this.preAnnDate;
	}

	public void setPreAnnDate(String preAnnDate) {
		this.preAnnDate = preAnnDate;
	}

	public String getRegAnnDate() {
		return this.regAnnDate;
	}

	public void setRegAnnDate(String regAnnDate) {
		this.regAnnDate = regAnnDate;
	}

	public String getExclusiveDateLimit() {
		return this.exclusiveDateLimit;
	}

	public void setExclusiveDateLimit(String exclusiveDateLimit) {
		this.exclusiveDateLimit = exclusiveDateLimit;
	}

	public Integer getShare() {
		return this.share;
	}

	public void setShare(Integer share) {
		this.share = share;
	}

	public String getSubsequentDesignationDate() {
		return this.subsequentDesignationDate;
	}

	public void setSubsequentDesignationDate(String subsequentDesignationDate) {
		this.subsequentDesignationDate = subsequentDesignationDate;
	}

	public String getIntlRegDate() {
		return this.intlRegDate;
	}

	public void setIntlRegDate(String intlRegDate) {
		this.intlRegDate = intlRegDate;
	}

	public String getPriorityDate() {
		return this.priorityDate;
	}

	public void setPriorityDate(String priorityDate) {
		this.priorityDate = priorityDate;
	}

	public String getAgency() {
		return this.agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProductDesc() {
		return this.productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getLastProcedureStatus() {
		return this.lastProcedureStatus;
	}

	public void setLastProcedureStatus(String lastProcedureStatus) {
		this.lastProcedureStatus = lastProcedureStatus;
	}

	public String getRegistrationType() {
		return this.registrationType;
	}

	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}

	public List<AnnounceDetail> getAnnounces() {
		return this.announces;
	}

	public void setAnnounces(List<AnnounceDetail> announces) {
		this.announces = announces;
	}

	public List<Procedure> getProcedures() {
		return this.procedures;
	}

	public void setProcedures(List<Procedure> procedures) {
		this.procedures = procedures;
	}

	public static class AnnounceDetail {

		private String annNum;

		private String annTypeCode;

		private String annTypeName;

		private String annDate;

		private String imageUrl;

		private Integer pageNo;

		public String getAnnNum() {
			return this.annNum;
		}

		public void setAnnNum(String annNum) {
			this.annNum = annNum;
		}

		public String getAnnTypeCode() {
			return this.annTypeCode;
		}

		public void setAnnTypeCode(String annTypeCode) {
			this.annTypeCode = annTypeCode;
		}

		public String getAnnTypeName() {
			return this.annTypeName;
		}

		public void setAnnTypeName(String annTypeName) {
			this.annTypeName = annTypeName;
		}

		public String getAnnDate() {
			return this.annDate;
		}

		public void setAnnDate(String annDate) {
			this.annDate = annDate;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}
	}

	public static class Procedure {

		private String procedureCode;

		private String procedureName;

		private String procedureStep;

		private String procedureResult;

		private String procedureDate;

		public String getProcedureCode() {
			return this.procedureCode;
		}

		public void setProcedureCode(String procedureCode) {
			this.procedureCode = procedureCode;
		}

		public String getProcedureName() {
			return this.procedureName;
		}

		public void setProcedureName(String procedureName) {
			this.procedureName = procedureName;
		}

		public String getProcedureStep() {
			return this.procedureStep;
		}

		public void setProcedureStep(String procedureStep) {
			this.procedureStep = procedureStep;
		}

		public String getProcedureResult() {
			return this.procedureResult;
		}

		public void setProcedureResult(String procedureResult) {
			this.procedureResult = procedureResult;
		}

		public String getProcedureDate() {
			return this.procedureDate;
		}

		public void setProcedureDate(String procedureDate) {
			this.procedureDate = procedureDate;
		}
	}

	@Override
	public TrademarkDetailResponse getInstance(UnmarshallerContext context) {
		return	TrademarkDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
