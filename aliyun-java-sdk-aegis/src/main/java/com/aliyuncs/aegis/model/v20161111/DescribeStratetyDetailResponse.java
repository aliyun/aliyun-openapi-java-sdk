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
package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeStratetyDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStratetyDetailResponse extends AcsResponse {

	private String requestId;

	private Strategy strategy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Strategy getStrategy() {
		return this.strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public static class Strategy {

		private Integer cycleDays;

		private String name;

		private Integer id;

		private Integer cycleStartTime;

		private Integer type;

		private List<RiskTypeWhiteListQueryResult> riskTypeWhiteListQueryResultList;

		public Integer getCycleDays() {
			return this.cycleDays;
		}

		public void setCycleDays(Integer cycleDays) {
			this.cycleDays = cycleDays;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getCycleStartTime() {
			return this.cycleStartTime;
		}

		public void setCycleStartTime(Integer cycleStartTime) {
			this.cycleStartTime = cycleStartTime;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public List<RiskTypeWhiteListQueryResult> getRiskTypeWhiteListQueryResultList() {
			return this.riskTypeWhiteListQueryResultList;
		}

		public void setRiskTypeWhiteListQueryResultList(List<RiskTypeWhiteListQueryResult> riskTypeWhiteListQueryResultList) {
			this.riskTypeWhiteListQueryResultList = riskTypeWhiteListQueryResultList;
		}

		public static class RiskTypeWhiteListQueryResult {

			private String typeName;

			private String alias;

			private Boolean on;

			private List<SubTyp> subTypes;

			public String getTypeName() {
				return this.typeName;
			}

			public void setTypeName(String typeName) {
				this.typeName = typeName;
			}

			public String getAlias() {
				return this.alias;
			}

			public void setAlias(String alias) {
				this.alias = alias;
			}

			public Boolean getOn() {
				return this.on;
			}

			public void setOn(Boolean on) {
				this.on = on;
			}

			public List<SubTyp> getSubTypes() {
				return this.subTypes;
			}

			public void setSubTypes(List<SubTyp> subTypes) {
				this.subTypes = subTypes;
			}

			public static class SubTyp {

				private String typeName;

				private String alias;

				private Boolean on;

				public String getTypeName() {
					return this.typeName;
				}

				public void setTypeName(String typeName) {
					this.typeName = typeName;
				}

				public String getAlias() {
					return this.alias;
				}

				public void setAlias(String alias) {
					this.alias = alias;
				}

				public Boolean getOn() {
					return this.on;
				}

				public void setOn(Boolean on) {
					this.on = on;
				}
			}
		}
	}

	@Override
	public DescribeStratetyDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeStratetyDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
