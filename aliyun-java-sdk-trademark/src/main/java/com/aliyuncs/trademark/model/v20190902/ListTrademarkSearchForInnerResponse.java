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
import com.aliyuncs.trademark.transform.v20190902.ListTrademarkSearchForInnerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTrademarkSearchForInnerResponse extends AcsResponse {

	private String requestId;

	private String pageSize;

	private String pageNumber;

	private String totalCount;

	private List<TrademarkSearchContent> trademarkSearchContents;

	private List<String> products;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<TrademarkSearchContent> getTrademarkSearchContents() {
		return this.trademarkSearchContents;
	}

	public void setTrademarkSearchContents(List<TrademarkSearchContent> trademarkSearchContents) {
		this.trademarkSearchContents = trademarkSearchContents;
	}

	public List<String> getProducts() {
		return this.products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}

	public static class TrademarkSearchContent {

		private String ownerAddress;

		private String preAnnDate;

		private String nameSort;

		private String preAnnNum;

		private String share;

		private String ownerEnName;

		private String nameCharSection;

		private String registrationNumber;

		private String ownerEnAddress;

		private String nameSimplifiedChinese;

		private String name;

		private String classification;

		private String nameOrigin;

		private String applyDate;

		private String uid;

		private String productDescription;

		private String wellKnow;

		private String image;

		private String product;

		private String ownerName;

		private String onSale;

		private String exclusiveDateLimit;

		private String lastProcedureStatus;

		private String regAnnNum;

		private Long id;

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

		public String getNameSort() {
			return this.nameSort;
		}

		public void setNameSort(String nameSort) {
			this.nameSort = nameSort;
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

		public String getOwnerEnName() {
			return this.ownerEnName;
		}

		public void setOwnerEnName(String ownerEnName) {
			this.ownerEnName = ownerEnName;
		}

		public String getNameCharSection() {
			return this.nameCharSection;
		}

		public void setNameCharSection(String nameCharSection) {
			this.nameCharSection = nameCharSection;
		}

		public String getRegistrationNumber() {
			return this.registrationNumber;
		}

		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}

		public String getOwnerEnAddress() {
			return this.ownerEnAddress;
		}

		public void setOwnerEnAddress(String ownerEnAddress) {
			this.ownerEnAddress = ownerEnAddress;
		}

		public String getNameSimplifiedChinese() {
			return this.nameSimplifiedChinese;
		}

		public void setNameSimplifiedChinese(String nameSimplifiedChinese) {
			this.nameSimplifiedChinese = nameSimplifiedChinese;
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

		public String getNameOrigin() {
			return this.nameOrigin;
		}

		public void setNameOrigin(String nameOrigin) {
			this.nameOrigin = nameOrigin;
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

		public String getWellKnow() {
			return this.wellKnow;
		}

		public void setWellKnow(String wellKnow) {
			this.wellKnow = wellKnow;
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

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public String getOnSale() {
			return this.onSale;
		}

		public void setOnSale(String onSale) {
			this.onSale = onSale;
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

		public String getRegAnnNum() {
			return this.regAnnNum;
		}

		public void setRegAnnNum(String regAnnNum) {
			this.regAnnNum = regAnnNum;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public ListTrademarkSearchForInnerResponse getInstance(UnmarshallerContext context) {
		return	ListTrademarkSearchForInnerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
