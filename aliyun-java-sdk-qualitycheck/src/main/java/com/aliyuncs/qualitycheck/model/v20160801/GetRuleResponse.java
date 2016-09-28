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
package com.aliyuncs.qualitycheck.model.v20160801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20160801.GetRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRuleResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<RuleInfo> rules;

		public List<RuleInfo> getRules() {
			return this.rules;
		}

		public void setRules(List<RuleInfo> rules) {
			this.rules = rules;
		}

		public static class RuleInfo {

			private String rid;

			private String ruleLambda;

			private String name;

			private Integer type;

			private Integer status;

			private Integer isDelete;

			private String startTime;

			private String endTime;

			private String weight;

			private Integer isOnline;

			private String createEmpid;

			private String createTime;

			private String lastUpdateTime;

			private String lastUpdateEmpid;

			private String comments;

			public String getRid() {
				return this.rid;
			}

			public void setRid(String rid) {
				this.rid = rid;
			}

			public String getRuleLambda() {
				return this.ruleLambda;
			}

			public void setRuleLambda(String ruleLambda) {
				this.ruleLambda = ruleLambda;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
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

			public Integer getIsDelete() {
				return this.isDelete;
			}

			public void setIsDelete(Integer isDelete) {
				this.isDelete = isDelete;
			}

			public String getstartTime() {
				return this.startTime;
			}

			public void setstartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getendTime() {
				return this.endTime;
			}

			public void setendTime(String endTime) {
				this.endTime = endTime;
			}

			public String getWeight() {
				return this.weight;
			}

			public void setWeight(String weight) {
				this.weight = weight;
			}

			public Integer getIsOnline() {
				return this.isOnline;
			}

			public void setIsOnline(Integer isOnline) {
				this.isOnline = isOnline;
			}

			public String getCreateEmpid() {
				return this.createEmpid;
			}

			public void setCreateEmpid(String createEmpid) {
				this.createEmpid = createEmpid;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getLastUpdateTime() {
				return this.lastUpdateTime;
			}

			public void setLastUpdateTime(String lastUpdateTime) {
				this.lastUpdateTime = lastUpdateTime;
			}

			public String getLastUpdateEmpid() {
				return this.lastUpdateEmpid;
			}

			public void setLastUpdateEmpid(String lastUpdateEmpid) {
				this.lastUpdateEmpid = lastUpdateEmpid;
			}

			public String getComments() {
				return this.comments;
			}

			public void setComments(String comments) {
				this.comments = comments;
			}
		}
	}

	@Override
	public GetRuleResponse getInstance(UnmarshallerContext context) {
		return	GetRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
