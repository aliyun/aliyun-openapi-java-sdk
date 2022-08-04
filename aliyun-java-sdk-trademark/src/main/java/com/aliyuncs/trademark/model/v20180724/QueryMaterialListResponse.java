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
import com.aliyuncs.trademark.transform.v20180724.QueryMaterialListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMaterialListResponse extends AcsResponse {

	private Integer currentPageNum;

	private Integer totalPageNum;

	private String requestId;

	private Integer pageSize;

	private Integer totalItemNum;

	private List<Trademark> data;

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public List<Trademark> getData() {
		return this.data;
	}

	public void setData(List<Trademark> data) {
		this.data = data;
	}

	public static class Trademark {

		private String principalDescription;

		private Integer status;

		private Integer type;

		private String contactName;

		private String cardNumber;

		private Long validDate;

		private Integer region;

		private Integer principalName;

		private Integer loaStatus;

		private String name;

		private String loaKey;

		private Long id;

		private String reason;

		private String materialVersion;

		public String getPrincipalDescription() {
			return this.principalDescription;
		}

		public void setPrincipalDescription(String principalDescription) {
			this.principalDescription = principalDescription;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getContactName() {
			return this.contactName;
		}

		public void setContactName(String contactName) {
			this.contactName = contactName;
		}

		public String getCardNumber() {
			return this.cardNumber;
		}

		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}

		public Long getValidDate() {
			return this.validDate;
		}

		public void setValidDate(Long validDate) {
			this.validDate = validDate;
		}

		public Integer getRegion() {
			return this.region;
		}

		public void setRegion(Integer region) {
			this.region = region;
		}

		public Integer getPrincipalName() {
			return this.principalName;
		}

		public void setPrincipalName(Integer principalName) {
			this.principalName = principalName;
		}

		public Integer getLoaStatus() {
			return this.loaStatus;
		}

		public void setLoaStatus(Integer loaStatus) {
			this.loaStatus = loaStatus;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLoaKey() {
			return this.loaKey;
		}

		public void setLoaKey(String loaKey) {
			this.loaKey = loaKey;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getMaterialVersion() {
			return this.materialVersion;
		}

		public void setMaterialVersion(String materialVersion) {
			this.materialVersion = materialVersion;
		}
	}

	@Override
	public QueryMaterialListResponse getInstance(UnmarshallerContext context) {
		return	QueryMaterialListResponseUnmarshaller.unmarshall(this, context);
	}
}
