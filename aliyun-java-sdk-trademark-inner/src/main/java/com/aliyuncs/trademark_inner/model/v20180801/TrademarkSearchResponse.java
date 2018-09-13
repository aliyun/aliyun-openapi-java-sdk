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
import com.aliyuncs.trademark_inner.transform.v20180801.TrademarkSearchResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TrademarkSearchResponse extends AcsResponse {

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private Boolean prePage;

	private Boolean nextPage;

	private List<Trademark> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
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

	public List<Trademark> getData() {
		return this.data;
	}

	public void setData(List<Trademark> data) {
		this.data = data;
	}

	public static class Trademark {

		private Long id;

		private String uid;

		private String name;

		private String registrationNumber;

		private String classification;

		private String applyDate;

		private String ownerName;

		private String ownerEnName;

		private String image;

		private String product;

		private String preAnnNum;

		private String regAnnNum;

		private String preAnnDate;

		private String regAnnDate;

		private Integer status;

		private String lastProcedureStatus;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
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

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getLastProcedureStatus() {
			return this.lastProcedureStatus;
		}

		public void setLastProcedureStatus(String lastProcedureStatus) {
			this.lastProcedureStatus = lastProcedureStatus;
		}
	}

	@Override
	public TrademarkSearchResponse getInstance(UnmarshallerContext context) {
		return	TrademarkSearchResponseUnmarshaller.unmarshall(this, context);
	}
}
