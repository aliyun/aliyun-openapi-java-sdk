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
package com.aliyuncs.sas_api.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas_api.transform.v20170705.GetCrackListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCrackListResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private Data data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long total;

		private List<Item> items;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private Long id;

			private String level;

			private String uuid;

			private String product;

			private String vmIp;

			private String url;

			private String method;

			private String sourceIp;

			private String sourceUuid;

			private String sourceDomain;

			private Integer sourcePort;

			private String sourceLocal;

			private String dstIp;

			private String dstUuid;

			private String dstDomain;

			private Integer dstPort;

			private String dstLocal;

			private Long attackCount;

			private String threatRate;

			private Long attackStartTime;

			private Long attackEndTime;

			private Integer attackCategory;

			private String attackCategoryName;

			private String attackType;

			private String attackTypeName;

			private Integer attackStatus;

			private String attackSource;

			private List<Detail> details;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}

			public String getProduct() {
				return this.product;
			}

			public void setProduct(String product) {
				this.product = product;
			}

			public String getVmIp() {
				return this.vmIp;
			}

			public void setVmIp(String vmIp) {
				this.vmIp = vmIp;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getMethod() {
				return this.method;
			}

			public void setMethod(String method) {
				this.method = method;
			}

			public String getSourceIp() {
				return this.sourceIp;
			}

			public void setSourceIp(String sourceIp) {
				this.sourceIp = sourceIp;
			}

			public String getSourceUuid() {
				return this.sourceUuid;
			}

			public void setSourceUuid(String sourceUuid) {
				this.sourceUuid = sourceUuid;
			}

			public String getSourceDomain() {
				return this.sourceDomain;
			}

			public void setSourceDomain(String sourceDomain) {
				this.sourceDomain = sourceDomain;
			}

			public Integer getSourcePort() {
				return this.sourcePort;
			}

			public void setSourcePort(Integer sourcePort) {
				this.sourcePort = sourcePort;
			}

			public String getSourceLocal() {
				return this.sourceLocal;
			}

			public void setSourceLocal(String sourceLocal) {
				this.sourceLocal = sourceLocal;
			}

			public String getDstIp() {
				return this.dstIp;
			}

			public void setDstIp(String dstIp) {
				this.dstIp = dstIp;
			}

			public String getDstUuid() {
				return this.dstUuid;
			}

			public void setDstUuid(String dstUuid) {
				this.dstUuid = dstUuid;
			}

			public String getDstDomain() {
				return this.dstDomain;
			}

			public void setDstDomain(String dstDomain) {
				this.dstDomain = dstDomain;
			}

			public Integer getDstPort() {
				return this.dstPort;
			}

			public void setDstPort(Integer dstPort) {
				this.dstPort = dstPort;
			}

			public String getDstLocal() {
				return this.dstLocal;
			}

			public void setDstLocal(String dstLocal) {
				this.dstLocal = dstLocal;
			}

			public Long getAttackCount() {
				return this.attackCount;
			}

			public void setAttackCount(Long attackCount) {
				this.attackCount = attackCount;
			}

			public String getThreatRate() {
				return this.threatRate;
			}

			public void setThreatRate(String threatRate) {
				this.threatRate = threatRate;
			}

			public Long getAttackStartTime() {
				return this.attackStartTime;
			}

			public void setAttackStartTime(Long attackStartTime) {
				this.attackStartTime = attackStartTime;
			}

			public Long getAttackEndTime() {
				return this.attackEndTime;
			}

			public void setAttackEndTime(Long attackEndTime) {
				this.attackEndTime = attackEndTime;
			}

			public Integer getAttackCategory() {
				return this.attackCategory;
			}

			public void setAttackCategory(Integer attackCategory) {
				this.attackCategory = attackCategory;
			}

			public String getAttackCategoryName() {
				return this.attackCategoryName;
			}

			public void setAttackCategoryName(String attackCategoryName) {
				this.attackCategoryName = attackCategoryName;
			}

			public String getAttackType() {
				return this.attackType;
			}

			public void setAttackType(String attackType) {
				this.attackType = attackType;
			}

			public String getAttackTypeName() {
				return this.attackTypeName;
			}

			public void setAttackTypeName(String attackTypeName) {
				this.attackTypeName = attackTypeName;
			}

			public Integer getAttackStatus() {
				return this.attackStatus;
			}

			public void setAttackStatus(Integer attackStatus) {
				this.attackStatus = attackStatus;
			}

			public String getAttackSource() {
				return this.attackSource;
			}

			public void setAttackSource(String attackSource) {
				this.attackSource = attackSource;
			}

			public List<Detail> getDetails() {
				return this.details;
			}

			public void setDetails(List<Detail> details) {
				this.details = details;
			}

			public static class Detail {

				private String value;

				private Integer type;

				private String label;

				private String linkText;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public Integer getType() {
					return this.type;
				}

				public void setType(Integer type) {
					this.type = type;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getLinkText() {
					return this.linkText;
				}

				public void setLinkText(String linkText) {
					this.linkText = linkText;
				}
			}
		}
	}

	@Override
	public GetCrackListResponse getInstance(UnmarshallerContext context) {
		return	GetCrackListResponseUnmarshaller.unmarshall(this, context);
	}
}
