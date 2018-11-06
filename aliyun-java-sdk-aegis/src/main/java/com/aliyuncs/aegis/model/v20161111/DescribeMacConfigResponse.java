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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeMacConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMacConfigResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<Config> configs;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Config> getConfigs() {
		return this.configs;
	}

	public void setConfigs(List<Config> configs) {
		this.configs = configs;
	}

	public static class Config {

		private String startTime;

		private String endTime;

		private String ip;

		private Long strategyId;

		private String account;

		private String location;

		private String switcher;

		private String vulType;

		private Integer uuidCount;

		private Integer totalCount;

		private List<Target> targetList;

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Long getStrategyId() {
			return this.strategyId;
		}

		public void setStrategyId(Long strategyId) {
			this.strategyId = strategyId;
		}

		public String getAccount() {
			return this.account;
		}

		public void setAccount(String account) {
			this.account = account;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getSwitcher() {
			return this.switcher;
		}

		public void setSwitcher(String switcher) {
			this.switcher = switcher;
		}

		public String getVulType() {
			return this.vulType;
		}

		public void setVulType(String vulType) {
			this.vulType = vulType;
		}

		public Integer getUuidCount() {
			return this.uuidCount;
		}

		public void setUuidCount(Integer uuidCount) {
			this.uuidCount = uuidCount;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Target> getTargetList() {
			return this.targetList;
		}

		public void setTargetList(List<Target> targetList) {
			this.targetList = targetList;
		}

		public static class Target {

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
	public DescribeMacConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeMacConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
