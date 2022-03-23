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

package com.aliyuncs.copyright.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.GetAllPatentListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAllPatentListResponse extends AcsResponse {

	private Integer pageNum;

	private String requestId;

	private Boolean success;

	private Integer totalItemNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private List<DataItem> data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String type;

		private String owner;

		private Float discountPrice;

		private String applyNumber;

		private Integer soldStatus;

		private String bizId;

		private String payEndDate;

		private Integer year;

		private Integer payStatus;

		private String patentStatus;

		private String agency;

		private String name;

		private Boolean patentDiscard;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Float getDiscountPrice() {
			return this.discountPrice;
		}

		public void setDiscountPrice(Float discountPrice) {
			this.discountPrice = discountPrice;
		}

		public String getApplyNumber() {
			return this.applyNumber;
		}

		public void setApplyNumber(String applyNumber) {
			this.applyNumber = applyNumber;
		}

		public Integer getSoldStatus() {
			return this.soldStatus;
		}

		public void setSoldStatus(Integer soldStatus) {
			this.soldStatus = soldStatus;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getPayEndDate() {
			return this.payEndDate;
		}

		public void setPayEndDate(String payEndDate) {
			this.payEndDate = payEndDate;
		}

		public Integer getYear() {
			return this.year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public Integer getPayStatus() {
			return this.payStatus;
		}

		public void setPayStatus(Integer payStatus) {
			this.payStatus = payStatus;
		}

		public String getPatentStatus() {
			return this.patentStatus;
		}

		public void setPatentStatus(String patentStatus) {
			this.patentStatus = patentStatus;
		}

		public String getAgency() {
			return this.agency;
		}

		public void setAgency(String agency) {
			this.agency = agency;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getPatentDiscard() {
			return this.patentDiscard;
		}

		public void setPatentDiscard(Boolean patentDiscard) {
			this.patentDiscard = patentDiscard;
		}
	}

	@Override
	public GetAllPatentListResponse getInstance(UnmarshallerContext context) {
		return	GetAllPatentListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
