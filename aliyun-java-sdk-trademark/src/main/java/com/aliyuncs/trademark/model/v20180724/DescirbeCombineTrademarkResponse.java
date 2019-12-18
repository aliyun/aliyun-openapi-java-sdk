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

package com.aliyuncs.trademark.model.v20180724;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.DescirbeCombineTrademarkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescirbeCombineTrademarkResponse extends AcsResponse {

	private String requestId;

	private Integer totalItemNumber;

	private Integer currentPageNumber;

	private Integer pageSize;

	private Integer totalPageNumber;

	private Boolean prePage;

	private Boolean nextPage;

	private String productDescription;

	private String exclusiveDateLimit;

	private String agency;

	private List<Trademark> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalItemNumber() {
		return this.totalItemNumber;
	}

	public void setTotalItemNumber(Integer totalItemNumber) {
		this.totalItemNumber = totalItemNumber;
	}

	public Integer getCurrentPageNumber() {
		return this.currentPageNumber;
	}

	public void setCurrentPageNumber(Integer currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPageNumber() {
		return this.totalPageNumber;
	}

	public void setTotalPageNumber(Integer totalPageNumber) {
		this.totalPageNumber = totalPageNumber;
	}

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
	}

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

	public String getProductDescription() {
		return this.productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getExclusiveDateLimit() {
		return this.exclusiveDateLimit;
	}

	public void setExclusiveDateLimit(String exclusiveDateLimit) {
		this.exclusiveDateLimit = exclusiveDateLimit;
	}

	public String getAgency() {
		return this.agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public List<Trademark> getData() {
		return this.data;
	}

	public void setData(List<Trademark> data) {
		this.data = data;
	}

	public static class Trademark {

		private String indexId;

		private String name;

		private String registrationNumber;

		private String classification;

		private String applyDate;

		private String ownerName;

		private String ownerEnName;

		private String image;

		private String product;

		private String preAnnNumber;

		private String regAnnNumber;

		private String preAnnDate;

		private String regAnnDate;

		private String lawFinalStatus;

		private String lastProcedureStatus;

		private String share;

		private String ownerAddress;

		private String ownerEnAddress;

		private List<String> announcementList;

		public String getIndexId() {
			return this.indexId;
		}

		public void setIndexId(String indexId) {
			this.indexId = indexId;
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

		public String getOwnerEnName() {
			return this.ownerEnName;
		}

		public void setOwnerEnName(String ownerEnName) {
			this.ownerEnName = ownerEnName;
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

		public String getPreAnnNumber() {
			return this.preAnnNumber;
		}

		public void setPreAnnNumber(String preAnnNumber) {
			this.preAnnNumber = preAnnNumber;
		}

		public String getRegAnnNumber() {
			return this.regAnnNumber;
		}

		public void setRegAnnNumber(String regAnnNumber) {
			this.regAnnNumber = regAnnNumber;
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

		public String getLawFinalStatus() {
			return this.lawFinalStatus;
		}

		public void setLawFinalStatus(String lawFinalStatus) {
			this.lawFinalStatus = lawFinalStatus;
		}

		public String getLastProcedureStatus() {
			return this.lastProcedureStatus;
		}

		public void setLastProcedureStatus(String lastProcedureStatus) {
			this.lastProcedureStatus = lastProcedureStatus;
		}

		public String getShare() {
			return this.share;
		}

		public void setShare(String share) {
			this.share = share;
		}

		public String getOwnerAddress() {
			return this.ownerAddress;
		}

		public void setOwnerAddress(String ownerAddress) {
			this.ownerAddress = ownerAddress;
		}

		public String getOwnerEnAddress() {
			return this.ownerEnAddress;
		}

		public void setOwnerEnAddress(String ownerEnAddress) {
			this.ownerEnAddress = ownerEnAddress;
		}

		public List<String> getAnnouncementList() {
			return this.announcementList;
		}

		public void setAnnouncementList(List<String> announcementList) {
			this.announcementList = announcementList;
		}
	}

	@Override
	public DescirbeCombineTrademarkResponse getInstance(UnmarshallerContext context) {
		return	DescirbeCombineTrademarkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
