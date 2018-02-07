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
import com.aliyuncs.aegis.transform.v20161111.DescribeStratetyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStratetyResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private List<Data> strategies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Data> getStrategies() {
		return this.strategies;
	}

	public void setStrategies(List<Data> strategies) {
		this.strategies = strategies;
	}

	public static class Data {

		private Integer cycleDays;

		private Integer id;

		private Integer cycleStartTime;

		private Integer type;

		private String name;

		private Integer riskCount;

		private Integer ecsCount;

		private List<ConfigTarget> configTargets;

		public Integer getCycleDays() {
			return this.cycleDays;
		}

		public void setCycleDays(Integer cycleDays) {
			this.cycleDays = cycleDays;
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

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getRiskCount() {
			return this.riskCount;
		}

		public void setRiskCount(Integer riskCount) {
			this.riskCount = riskCount;
		}

		public Integer getEcsCount() {
			return this.ecsCount;
		}

		public void setEcsCount(Integer ecsCount) {
			this.ecsCount = ecsCount;
		}

		public List<ConfigTarget> getConfigTargets() {
			return this.configTargets;
		}

		public void setConfigTargets(List<ConfigTarget> configTargets) {
			this.configTargets = configTargets;
		}

		public static class ConfigTarget {

			private String flag;

			private String targetType;

			private String target;

			public String getFlag() {
				return this.flag;
			}

			public void setFlag(String flag) {
				this.flag = flag;
			}

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}

			public String getTarget() {
				return this.target;
			}

			public void setTarget(String target) {
				this.target = target;
			}
		}
	}

	@Override
	public DescribeStratetyResponse getInstance(UnmarshallerContext context) {
		return	DescribeStratetyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
