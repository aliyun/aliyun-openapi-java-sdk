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
import com.aliyuncs.trademark.transform.v20190902.SearchSimilarityListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchSimilarityListResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private List<Trademarks> data;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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

	public List<Trademarks> getData() {
		return this.data;
	}

	public void setData(List<Trademarks> data) {
		this.data = data;
	}

	public static class Trademarks {

		private String status;

		private String preAnnDate;

		private String ownerAddress;

		private String image;

		private String share;

		private String product;

		private String preAnnNum;

		private String ownerEnName;

		private String ownerName;

		private String regAnnDate;

		private String productDesc;

		private Integer onSale;

		private String registrationNumber;

		private String exclusiveDateLimit;

		private String lastProcedureStatus;

		private String regAnnNum;

		private String ownerEnAddress;

		private String name;

		private String classification;

		private Long id;

		private String applyDate;

		private String uid;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPreAnnDate() {
			return this.preAnnDate;
		}

		public void setPreAnnDate(String preAnnDate) {
			this.preAnnDate = preAnnDate;
		}

		public String getOwnerAddress() {
			return this.ownerAddress;
		}

		public void setOwnerAddress(String ownerAddress) {
			this.ownerAddress = ownerAddress;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getShare() {
			return this.share;
		}

		public void setShare(String share) {
			this.share = share;
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

		public String getOwnerEnName() {
			return this.ownerEnName;
		}

		public void setOwnerEnName(String ownerEnName) {
			this.ownerEnName = ownerEnName;
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

		public String getProductDesc() {
			return this.productDesc;
		}

		public void setProductDesc(String productDesc) {
			this.productDesc = productDesc;
		}

		public Integer getOnSale() {
			return this.onSale;
		}

		public void setOnSale(Integer onSale) {
			this.onSale = onSale;
		}

		public String getRegistrationNumber() {
			return this.registrationNumber;
		}

		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
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

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
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
	}

	@Override
	public SearchSimilarityListResponse getInstance(UnmarshallerContext context) {
		return	SearchSimilarityListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
