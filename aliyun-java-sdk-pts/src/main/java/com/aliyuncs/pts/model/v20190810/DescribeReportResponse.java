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

package com.aliyuncs.pts.model.v20190810;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20190810.DescribeReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReportResponse extends AcsResponse {

	private Integer averageConcurrency;

	private Long averageBandWidth;

	private Float succeedRequestRatio;

	private Long endTime;

	private Long beginTime;

	private Integer totalAgents;

	private Long requestCount;

	private Integer rpsLimit;

	private Integer aliveAgents;

	private Integer maxTps;

	private Integer concurrencyLimit;

	private Integer maxConcurrency;

	private Boolean sceneDeleted;

	private String duration;

	private Long maxBandWidth;

	private Long vum;

	private Long failedBusinessCount;

	private Long failedRequestCount;

	private Float businessRequestRatio;

	private String requestId;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Boolean success;

	private List<AgentLocation> agentsLocation;

	private List<Relation> relations;

	public Integer getAverageConcurrency() {
		return this.averageConcurrency;
	}

	public void setAverageConcurrency(Integer averageConcurrency) {
		this.averageConcurrency = averageConcurrency;
	}

	public Long getAverageBandWidth() {
		return this.averageBandWidth;
	}

	public void setAverageBandWidth(Long averageBandWidth) {
		this.averageBandWidth = averageBandWidth;
	}

	public Float getSucceedRequestRatio() {
		return this.succeedRequestRatio;
	}

	public void setSucceedRequestRatio(Float succeedRequestRatio) {
		this.succeedRequestRatio = succeedRequestRatio;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
	}

	public Integer getTotalAgents() {
		return this.totalAgents;
	}

	public void setTotalAgents(Integer totalAgents) {
		this.totalAgents = totalAgents;
	}

	public Long getRequestCount() {
		return this.requestCount;
	}

	public void setRequestCount(Long requestCount) {
		this.requestCount = requestCount;
	}

	public Integer getRpsLimit() {
		return this.rpsLimit;
	}

	public void setRpsLimit(Integer rpsLimit) {
		this.rpsLimit = rpsLimit;
	}

	public Integer getAliveAgents() {
		return this.aliveAgents;
	}

	public void setAliveAgents(Integer aliveAgents) {
		this.aliveAgents = aliveAgents;
	}

	public Integer getMaxTps() {
		return this.maxTps;
	}

	public void setMaxTps(Integer maxTps) {
		this.maxTps = maxTps;
	}

	public Integer getConcurrencyLimit() {
		return this.concurrencyLimit;
	}

	public void setConcurrencyLimit(Integer concurrencyLimit) {
		this.concurrencyLimit = concurrencyLimit;
	}

	public Integer getMaxConcurrency() {
		return this.maxConcurrency;
	}

	public void setMaxConcurrency(Integer maxConcurrency) {
		this.maxConcurrency = maxConcurrency;
	}

	public Boolean getSceneDeleted() {
		return this.sceneDeleted;
	}

	public void setSceneDeleted(Boolean sceneDeleted) {
		this.sceneDeleted = sceneDeleted;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Long getMaxBandWidth() {
		return this.maxBandWidth;
	}

	public void setMaxBandWidth(Long maxBandWidth) {
		this.maxBandWidth = maxBandWidth;
	}

	public Long getVum() {
		return this.vum;
	}

	public void setVum(Long vum) {
		this.vum = vum;
	}

	public Long getFailedBusinessCount() {
		return this.failedBusinessCount;
	}

	public void setFailedBusinessCount(Long failedBusinessCount) {
		this.failedBusinessCount = failedBusinessCount;
	}

	public Long getFailedRequestCount() {
		return this.failedRequestCount;
	}

	public void setFailedRequestCount(Long failedRequestCount) {
		this.failedRequestCount = failedRequestCount;
	}

	public Float getBusinessRequestRatio() {
		return this.businessRequestRatio;
	}

	public void setBusinessRequestRatio(Float businessRequestRatio) {
		this.businessRequestRatio = businessRequestRatio;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<AgentLocation> getAgentsLocation() {
		return this.agentsLocation;
	}

	public void setAgentsLocation(List<AgentLocation> agentsLocation) {
		this.agentsLocation = agentsLocation;
	}

	public List<Relation> getRelations() {
		return this.relations;
	}

	public void setRelations(List<Relation> relations) {
		this.relations = relations;
	}

	public static class AgentLocation {

		private String region;

		private String province;

		private String isp;

		private Integer count;

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	public static class Relation {

		private String name;

		private Long id;

		private Boolean disabled;

		private Map<Object,Object> headers;

		private Map<Object,Object> relationTestConfig;

		private List<Node> nodes;

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

		public Boolean getDisabled() {
			return this.disabled;
		}

		public void setDisabled(Boolean disabled) {
			this.disabled = disabled;
		}

		public Map<Object,Object> getHeaders() {
			return this.headers;
		}

		public void setHeaders(Map<Object,Object> headers) {
			this.headers = headers;
		}

		public Map<Object,Object> getRelationTestConfig() {
			return this.relationTestConfig;
		}

		public void setRelationTestConfig(Map<Object,Object> relationTestConfig) {
			this.relationTestConfig = relationTestConfig;
		}

		public List<Node> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<Node> nodes) {
			this.nodes = nodes;
		}

		public static class Node {

			private String type;

			private Long id;

			private String name;

			private Map<Object,Object> config;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Map<Object,Object> getConfig() {
				return this.config;
			}

			public void setConfig(Map<Object,Object> config) {
				this.config = config;
			}
		}
	}

	@Override
	public DescribeReportResponse getInstance(UnmarshallerContext context) {
		return	DescribeReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
