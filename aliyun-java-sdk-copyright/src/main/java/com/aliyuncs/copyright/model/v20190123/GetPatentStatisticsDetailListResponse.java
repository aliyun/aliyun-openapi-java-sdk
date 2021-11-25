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
import com.aliyuncs.copyright.transform.v20190123.GetPatentStatisticsDetailListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPatentStatisticsDetailListResponse extends AcsResponse {

	private Integer pageNum;

	private Integer pageSize;

	private String requestId;

	private Boolean success;

	private Integer totalItemNum;

	private Integer totalPageNum;

	private List<DataItem> data;

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
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

		private String age;

		private String agency;

		private String applyNumber;

		private String discount;

		private Float discountPrice;

		private String name;

		private String owner;

		private String payEndDate;

		private Float salePrice;

		private String type;

		private Integer year;

		private String status;

		public String getAge() {
			return this.age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getAgency() {
			return this.agency;
		}

		public void setAgency(String agency) {
			this.agency = agency;
		}

		public String getApplyNumber() {
			return this.applyNumber;
		}

		public void setApplyNumber(String applyNumber) {
			this.applyNumber = applyNumber;
		}

		public String getDiscount() {
			return this.discount;
		}

		public void setDiscount(String discount) {
			this.discount = discount;
		}

		public Float getDiscountPrice() {
			return this.discountPrice;
		}

		public void setDiscountPrice(Float discountPrice) {
			this.discountPrice = discountPrice;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getPayEndDate() {
			return this.payEndDate;
		}

		public void setPayEndDate(String payEndDate) {
			this.payEndDate = payEndDate;
		}

		public Float getSalePrice() {
			return this.salePrice;
		}

		public void setSalePrice(Float salePrice) {
			this.salePrice = salePrice;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getYear() {
			return this.year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public GetPatentStatisticsDetailListResponse getInstance(UnmarshallerContext context) {
		return	GetPatentStatisticsDetailListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
