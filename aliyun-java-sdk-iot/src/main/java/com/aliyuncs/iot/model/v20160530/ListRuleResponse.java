/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.iot.model.v20160530;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20160530.ListRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRuleResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private Integer pageSize;

	private Integer page;

	private Integer total;

	private List<RuleInfo> data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<RuleInfo> getData() {
		return this.data;
	}

	public void setData(List<RuleInfo> data) {
		this.data = data;
	}

	public static class RuleInfo {

		private Long id;

		private String select;

		private String topic;

		private String shortTopic;

		private String where;

		private String status;

		private Long createUserId;

		private Long productKey;

		private String name;

		private String ruleDesc;

		private String created;

		private String modified;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSelect() {
			return this.select;
		}

		public void setSelect(String select) {
			this.select = select;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public String getShortTopic() {
			return this.shortTopic;
		}

		public void setShortTopic(String shortTopic) {
			this.shortTopic = shortTopic;
		}

		public String getWhere() {
			return this.where;
		}

		public void setWhere(String where) {
			this.where = where;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getCreateUserId() {
			return this.createUserId;
		}

		public void setCreateUserId(Long createUserId) {
			this.createUserId = createUserId;
		}

		public Long getProductKey() {
			return this.productKey;
		}

		public void setProductKey(Long productKey) {
			this.productKey = productKey;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRuleDesc() {
			return this.ruleDesc;
		}

		public void setRuleDesc(String ruleDesc) {
			this.ruleDesc = ruleDesc;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getModified() {
			return this.modified;
		}

		public void setModified(String modified) {
			this.modified = modified;
		}
	}

	@Override
	public ListRuleResponse getInstance(UnmarshallerContext context) {
		return	ListRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
