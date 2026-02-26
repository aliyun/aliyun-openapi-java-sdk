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

package com.aliyuncs.dt_oc_info.model.v20220829;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcJusticeAuctionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcJusticeAuctionResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private Integer totalNum;

	private Integer pageIndex;

	private Integer pageNum;

	private String requestId;

	private List<DataItem> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String entName;

		private String auctionName;

		private String court;

		private String auctionDate;

		private String startPrice;

		private String estPrice;

		private String owner;

		private String restrict;

		private String certificate;

		private String document;

		private String basis;

		private String description;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getAuctionName() {
			return this.auctionName;
		}

		public void setAuctionName(String auctionName) {
			this.auctionName = auctionName;
		}

		public String getCourt() {
			return this.court;
		}

		public void setCourt(String court) {
			this.court = court;
		}

		public String getAuctionDate() {
			return this.auctionDate;
		}

		public void setAuctionDate(String auctionDate) {
			this.auctionDate = auctionDate;
		}

		public String getStartPrice() {
			return this.startPrice;
		}

		public void setStartPrice(String startPrice) {
			this.startPrice = startPrice;
		}

		public String getEstPrice() {
			return this.estPrice;
		}

		public void setEstPrice(String estPrice) {
			this.estPrice = estPrice;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getRestrict() {
			return this.restrict;
		}

		public void setRestrict(String restrict) {
			this.restrict = restrict;
		}

		public String getCertificate() {
			return this.certificate;
		}

		public void setCertificate(String certificate) {
			this.certificate = certificate;
		}

		public String getDocument() {
			return this.document;
		}

		public void setDocument(String document) {
			this.document = document;
		}

		public String getBasis() {
			return this.basis;
		}

		public void setBasis(String basis) {
			this.basis = basis;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public GetOcJusticeAuctionResponse getInstance(UnmarshallerContext context) {
		return	GetOcJusticeAuctionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
