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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeDnsGtmAccessStrategiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnsGtmAccessStrategiesResponse extends AcsResponse {

	private String requestId;

	private Integer totalItems;

	private Integer totalPages;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Strategy> strategies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Strategy> getStrategies() {
		return this.strategies;
	}

	public void setStrategies(List<Strategy> strategies) {
		this.strategies = strategies;
	}

	public static class Strategy {

		private String strategyId;

		private String strategyName;

		private String createTime;

		private Long createTimestamp;

		private String effectiveAddrPoolGroupType;

		private String effectiveAddrPoolType;

		private String effectiveLbaStrategy;

		private List<Line> lines;

		private List<EffectiveAddrPool> effectiveAddrPools;

		public String getStrategyId() {
			return this.strategyId;
		}

		public void setStrategyId(String strategyId) {
			this.strategyId = strategyId;
		}

		public String getStrategyName() {
			return this.strategyName;
		}

		public void setStrategyName(String strategyName) {
			this.strategyName = strategyName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getEffectiveAddrPoolGroupType() {
			return this.effectiveAddrPoolGroupType;
		}

		public void setEffectiveAddrPoolGroupType(String effectiveAddrPoolGroupType) {
			this.effectiveAddrPoolGroupType = effectiveAddrPoolGroupType;
		}

		public String getEffectiveAddrPoolType() {
			return this.effectiveAddrPoolType;
		}

		public void setEffectiveAddrPoolType(String effectiveAddrPoolType) {
			this.effectiveAddrPoolType = effectiveAddrPoolType;
		}

		public String getEffectiveLbaStrategy() {
			return this.effectiveLbaStrategy;
		}

		public void setEffectiveLbaStrategy(String effectiveLbaStrategy) {
			this.effectiveLbaStrategy = effectiveLbaStrategy;
		}

		public List<Line> getLines() {
			return this.lines;
		}

		public void setLines(List<Line> lines) {
			this.lines = lines;
		}

		public List<EffectiveAddrPool> getEffectiveAddrPools() {
			return this.effectiveAddrPools;
		}

		public void setEffectiveAddrPools(List<EffectiveAddrPool> effectiveAddrPools) {
			this.effectiveAddrPools = effectiveAddrPools;
		}

		public static class Line {

			private String lineCode;

			private String lineName;

			private String groupCode;

			private String groupName;

			public String getLineCode() {
				return this.lineCode;
			}

			public void setLineCode(String lineCode) {
				this.lineCode = lineCode;
			}

			public String getLineName() {
				return this.lineName;
			}

			public void setLineName(String lineName) {
				this.lineName = lineName;
			}

			public String getGroupCode() {
				return this.groupCode;
			}

			public void setGroupCode(String groupCode) {
				this.groupCode = groupCode;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}
		}

		public static class EffectiveAddrPool {

			private String id;

			private String name;

			private Integer addrCount;

			private Integer lbaWeight;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getAddrCount() {
				return this.addrCount;
			}

			public void setAddrCount(Integer addrCount) {
				this.addrCount = addrCount;
			}

			public Integer getLbaWeight() {
				return this.lbaWeight;
			}

			public void setLbaWeight(Integer lbaWeight) {
				this.lbaWeight = lbaWeight;
			}
		}
	}

	@Override
	public DescribeDnsGtmAccessStrategiesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsGtmAccessStrategiesResponseUnmarshaller.unmarshall(this, context);
	}
}
