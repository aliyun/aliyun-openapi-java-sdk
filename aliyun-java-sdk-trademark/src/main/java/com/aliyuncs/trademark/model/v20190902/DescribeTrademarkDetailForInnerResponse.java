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

package com.aliyuncs.trademark.model.v20190902;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20190902.DescribeTrademarkDetailForInnerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTrademarkDetailForInnerResponse extends AcsResponse {

	private String status;

	private String ownerAddress;

	private String preAnnDate;

	private String intlRegDate;

	private String preAnnNum;

	private String share;

	private String imageElement;

	private String ownerEnName;

	private String subsequentDesignationDate;

	private String registrationNumber;

	private String requestId;

	private String agency;

	private String ownerEnAddress;

	private String name;

	private String classification;

	private String applyDate;

	private String uid;

	private String productDescription;

	private String priorityDate;

	private String image;

	private String product;

	private String registrationType;

	private String ownerName;

	private String regAnnDate;

	private String similarGroup;

	private String exclusiveDateLimit;

	private String lastProcedureStatus;

	private Integer regAnnNum;

	private List<NoticeDTO> noticeList;

	private List<Flow> flowList;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOwnerAddress() {
		return this.ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getPreAnnDate() {
		return this.preAnnDate;
	}

	public void setPreAnnDate(String preAnnDate) {
		this.preAnnDate = preAnnDate;
	}

	public String getIntlRegDate() {
		return this.intlRegDate;
	}

	public void setIntlRegDate(String intlRegDate) {
		this.intlRegDate = intlRegDate;
	}

	public String getPreAnnNum() {
		return this.preAnnNum;
	}

	public void setPreAnnNum(String preAnnNum) {
		this.preAnnNum = preAnnNum;
	}

	public String getShare() {
		return this.share;
	}

	public void setShare(String share) {
		this.share = share;
	}

	public String getImageElement() {
		return this.imageElement;
	}

	public void setImageElement(String imageElement) {
		this.imageElement = imageElement;
	}

	public String getOwnerEnName() {
		return this.ownerEnName;
	}

	public void setOwnerEnName(String ownerEnName) {
		this.ownerEnName = ownerEnName;
	}

	public String getSubsequentDesignationDate() {
		return this.subsequentDesignationDate;
	}

	public void setSubsequentDesignationDate(String subsequentDesignationDate) {
		this.subsequentDesignationDate = subsequentDesignationDate;
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAgency() {
		return this.agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getOwnerEnAddress() {
		return this.ownerEnAddress;
	}

	public void setOwnerEnAddress(String ownerEnAddress) {
		this.ownerEnAddress = ownerEnAddress;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getProductDescription() {
		return this.productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getPriorityDate() {
		return this.priorityDate;
	}

	public void setPriorityDate(String priorityDate) {
		this.priorityDate = priorityDate;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getRegistrationType() {
		return this.registrationType;
	}

	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getRegAnnDate() {
		return this.regAnnDate;
	}

	public void setRegAnnDate(String regAnnDate) {
		this.regAnnDate = regAnnDate;
	}

	public String getSimilarGroup() {
		return this.similarGroup;
	}

	public void setSimilarGroup(String similarGroup) {
		this.similarGroup = similarGroup;
	}

	public String getExclusiveDateLimit() {
		return this.exclusiveDateLimit;
	}

	public void setExclusiveDateLimit(String exclusiveDateLimit) {
		this.exclusiveDateLimit = exclusiveDateLimit;
	}

	public String getLastProcedureStatus() {
		return this.lastProcedureStatus;
	}

	public void setLastProcedureStatus(String lastProcedureStatus) {
		this.lastProcedureStatus = lastProcedureStatus;
	}

	public Integer getRegAnnNum() {
		return this.regAnnNum;
	}

	public void setRegAnnNum(Integer regAnnNum) {
		this.regAnnNum = regAnnNum;
	}

	public List<NoticeDTO> getNoticeList() {
		return this.noticeList;
	}

	public void setNoticeList(List<NoticeDTO> noticeList) {
		this.noticeList = noticeList;
	}

	public List<Flow> getFlowList() {
		return this.flowList;
	}

	public void setFlowList(List<Flow> flowList) {
		this.flowList = flowList;
	}

	public static class NoticeDTO {

		private String trademarkName;

		private String imageUrl;

		private String originalImageUrl;

		private String date;

		private String annTypeName;

		private String applicant;

		private String annNum;

		private String reactNum;

		private String registrationNumber;

		private String annId;

		private String annDate;

		private String pageNo;

		private String annTypeCode;

		public String getTrademarkName() {
			return this.trademarkName;
		}

		public void setTrademarkName(String trademarkName) {
			this.trademarkName = trademarkName;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getOriginalImageUrl() {
			return this.originalImageUrl;
		}

		public void setOriginalImageUrl(String originalImageUrl) {
			this.originalImageUrl = originalImageUrl;
		}

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getAnnTypeName() {
			return this.annTypeName;
		}

		public void setAnnTypeName(String annTypeName) {
			this.annTypeName = annTypeName;
		}

		public String getApplicant() {
			return this.applicant;
		}

		public void setApplicant(String applicant) {
			this.applicant = applicant;
		}

		public String getAnnNum() {
			return this.annNum;
		}

		public void setAnnNum(String annNum) {
			this.annNum = annNum;
		}

		public String getReactNum() {
			return this.reactNum;
		}

		public void setReactNum(String reactNum) {
			this.reactNum = reactNum;
		}

		public String getRegistrationNumber() {
			return this.registrationNumber;
		}

		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}

		public String getAnnId() {
			return this.annId;
		}

		public void setAnnId(String annId) {
			this.annId = annId;
		}

		public String getAnnDate() {
			return this.annDate;
		}

		public void setAnnDate(String annDate) {
			this.annDate = annDate;
		}

		public String getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(String pageNo) {
			this.pageNo = pageNo;
		}

		public String getAnnTypeCode() {
			return this.annTypeCode;
		}

		public void setAnnTypeCode(String annTypeCode) {
			this.annTypeCode = annTypeCode;
		}
	}

	public static class Flow {

		private String procedureCode;

		private String registrationNumber;

		private String procedureName;

		private String date;

		private String procedureStep;

		private String procedureResult;

		private String procedureDate;

		public String getProcedureCode() {
			return this.procedureCode;
		}

		public void setProcedureCode(String procedureCode) {
			this.procedureCode = procedureCode;
		}

		public String getRegistrationNumber() {
			return this.registrationNumber;
		}

		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}

		public String getProcedureName() {
			return this.procedureName;
		}

		public void setProcedureName(String procedureName) {
			this.procedureName = procedureName;
		}

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
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
	public DescribeTrademarkDetailForInnerResponse getInstance(UnmarshallerContext context) {
		return	DescribeTrademarkDetailForInnerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
