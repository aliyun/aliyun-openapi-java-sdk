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
import com.aliyuncs.trademark.transform.v20180724.QueryTradeMarkApplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTradeMarkApplicationsResponse extends AcsResponse {

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private List<TmProduces> data;

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

	public List<TmProduces> getData() {
		return this.data;
	}

	public void setData(List<TmProduces> data) {
		this.data = data;
	}

	public static class TmProduces {

		private String bizId;

		private String orderId;

		private String materialName;

		private String tmIcon;

		private String tmName;

		private String tmNumber;

		private Long createTime;

		private Integer type;

		private Integer status;

		private String userId;

		private Float orderPrice;

		private Long materialId;

		private String loaUrl;

		private String note;

		private Long updateTime;

		private Integer supplementStatus;

		private Long supplementId;

		private Float totalPrice;

		private Float servicePrice;

		private List<ThirdClassifications> thirdClassification;

		private List<String> flags;

		private FirstClassification firstClassification;

		private RenewResponse renewResponse;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getMaterialName() {
			return this.materialName;
		}

		public void setMaterialName(String materialName) {
			this.materialName = materialName;
		}

		public String getTmIcon() {
			return this.tmIcon;
		}

		public void setTmIcon(String tmIcon) {
			this.tmIcon = tmIcon;
		}

		public String getTmName() {
			return this.tmName;
		}

		public void setTmName(String tmName) {
			this.tmName = tmName;
		}

		public String getTmNumber() {
			return this.tmNumber;
		}

		public void setTmNumber(String tmNumber) {
			this.tmNumber = tmNumber;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Float getOrderPrice() {
			return this.orderPrice;
		}

		public void setOrderPrice(Float orderPrice) {
			this.orderPrice = orderPrice;
		}

		public Long getMaterialId() {
			return this.materialId;
		}

		public void setMaterialId(Long materialId) {
			this.materialId = materialId;
		}

		public String getLoaUrl() {
			return this.loaUrl;
		}

		public void setLoaUrl(String loaUrl) {
			this.loaUrl = loaUrl;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getSupplementStatus() {
			return this.supplementStatus;
		}

		public void setSupplementStatus(Integer supplementStatus) {
			this.supplementStatus = supplementStatus;
		}

		public Long getSupplementId() {
			return this.supplementId;
		}

		public void setSupplementId(Long supplementId) {
			this.supplementId = supplementId;
		}

		public Float getTotalPrice() {
			return this.totalPrice;
		}

		public void setTotalPrice(Float totalPrice) {
			this.totalPrice = totalPrice;
		}

		public Float getServicePrice() {
			return this.servicePrice;
		}

		public void setServicePrice(Float servicePrice) {
			this.servicePrice = servicePrice;
		}

		public List<ThirdClassifications> getThirdClassification() {
			return this.thirdClassification;
		}

		public void setThirdClassification(List<ThirdClassifications> thirdClassification) {
			this.thirdClassification = thirdClassification;
		}

		public List<String> getFlags() {
			return this.flags;
		}

		public void setFlags(List<String> flags) {
			this.flags = flags;
		}

		public FirstClassification getFirstClassification() {
			return this.firstClassification;
		}

		public void setFirstClassification(FirstClassification firstClassification) {
			this.firstClassification = firstClassification;
		}

		public RenewResponse getRenewResponse() {
			return this.renewResponse;
		}

		public void setRenewResponse(RenewResponse renewResponse) {
			this.renewResponse = renewResponse;
		}

		public static class ThirdClassifications {

			private String classificationCode;

			private String classificationName;

			public String getClassificationCode() {
				return this.classificationCode;
			}

			public void setClassificationCode(String classificationCode) {
				this.classificationCode = classificationCode;
			}

			public String getClassificationName() {
				return this.classificationName;
			}

			public void setClassificationName(String classificationName) {
				this.classificationName = classificationName;
			}
		}

		public static class FirstClassification {

			private String classificationCode;

			private String classificationName;

			public String getClassificationCode() {
				return this.classificationCode;
			}

			public void setClassificationCode(String classificationCode) {
				this.classificationCode = classificationCode;
			}

			public String getClassificationName() {
				return this.classificationName;
			}

			public void setClassificationName(String classificationName) {
				this.classificationName = classificationName;
			}
		}

		public static class RenewResponse {

			private String name;

			private String engName;

			private String address;

			private String engAddress;

			private Long registerTime;

			private Long submitSbjtime;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getEngName() {
				return this.engName;
			}

			public void setEngName(String engName) {
				this.engName = engName;
			}

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getEngAddress() {
				return this.engAddress;
			}

			public void setEngAddress(String engAddress) {
				this.engAddress = engAddress;
			}

			public Long getRegisterTime() {
				return this.registerTime;
			}

			public void setRegisterTime(Long registerTime) {
				this.registerTime = registerTime;
			}

			public Long getSubmitSbjtime() {
				return this.submitSbjtime;
			}

			public void setSubmitSbjtime(Long submitSbjtime) {
				this.submitSbjtime = submitSbjtime;
			}
		}
	}

	@Override
	public QueryTradeMarkApplicationsResponse getInstance(UnmarshallerContext context) {
		return	QueryTradeMarkApplicationsResponseUnmarshaller.unmarshall(this, context);
	}
}
