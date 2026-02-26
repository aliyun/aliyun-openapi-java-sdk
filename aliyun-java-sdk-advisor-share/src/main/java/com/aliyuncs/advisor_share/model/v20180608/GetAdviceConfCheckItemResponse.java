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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.GetAdviceConfCheckItemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAdviceConfCheckItemResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String success;

	private List<DataItem> data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String product;

		private String operateColumn;

		private String gmtModified;

		private String viewCondition;

		private Boolean valid;

		private String viewColumn;

		private String gmtCreated;

		private Integer ttl;

		private String description;

		private String tips;

		private String confStatus;

		private String code;

		private String category;

		private String name;

		private Long id;

		private String type;

		private String isNew;

		private String thresholdParam;

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getOperateColumn() {
			return this.operateColumn;
		}

		public void setOperateColumn(String operateColumn) {
			this.operateColumn = operateColumn;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getViewCondition() {
			return this.viewCondition;
		}

		public void setViewCondition(String viewCondition) {
			this.viewCondition = viewCondition;
		}

		public Boolean getValid() {
			return this.valid;
		}

		public void setValid(Boolean valid) {
			this.valid = valid;
		}

		public String getViewColumn() {
			return this.viewColumn;
		}

		public void setViewColumn(String viewColumn) {
			this.viewColumn = viewColumn;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public Integer getTtl() {
			return this.ttl;
		}

		public void setTtl(Integer ttl) {
			this.ttl = ttl;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTips() {
			return this.tips;
		}

		public void setTips(String tips) {
			this.tips = tips;
		}

		public String getConfStatus() {
			return this.confStatus;
		}

		public void setConfStatus(String confStatus) {
			this.confStatus = confStatus;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getIsNew() {
			return this.isNew;
		}

		public void setIsNew(String isNew) {
			this.isNew = isNew;
		}

		public String getThresholdParam() {
			return this.thresholdParam;
		}

		public void setThresholdParam(String thresholdParam) {
			this.thresholdParam = thresholdParam;
		}
	}

	@Override
	public GetAdviceConfCheckItemResponse getInstance(UnmarshallerContext context) {
		return	GetAdviceConfCheckItemResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
