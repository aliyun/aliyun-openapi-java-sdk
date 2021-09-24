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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.ListAnsInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAnsInstancesResponse extends AcsResponse {

	private String httpCode;

	private Integer totalCount;

	private String requestId;

	private String message;

	private Integer pageSize;

	private Integer pageNumber;

	private String errorCode;

	private Boolean success;

	private List<NacosAnsInstance> data;

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<NacosAnsInstance> getData() {
		return this.data;
	}

	public void setData(List<NacosAnsInstance> data) {
		this.data = data;
	}

	public static class NacosAnsInstance {

		private String defaultKey;

		private Boolean ephemeral;

		private Boolean marked;

		private String ip;

		private String instanceId;

		private Integer port;

		private Long lastBeat;

		private Integer okCount;

		private Integer weight;

		private Integer instanceHeartBeatInterval;

		private Integer ipDeleteTimeout;

		private String app;

		private Integer failCount;

		private Boolean healthy;

		private Boolean enabled;

		private String datumKey;

		private String clusterName;

		private Integer instanceHeartBeatTimeOut;

		private String serviceName;

		private Map<Object,Object> metadata;

		public String getDefaultKey() {
			return this.defaultKey;
		}

		public void setDefaultKey(String defaultKey) {
			this.defaultKey = defaultKey;
		}

		public Boolean getEphemeral() {
			return this.ephemeral;
		}

		public void setEphemeral(Boolean ephemeral) {
			this.ephemeral = ephemeral;
		}

		public Boolean getMarked() {
			return this.marked;
		}

		public void setMarked(Boolean marked) {
			this.marked = marked;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public Long getLastBeat() {
			return this.lastBeat;
		}

		public void setLastBeat(Long lastBeat) {
			this.lastBeat = lastBeat;
		}

		public Integer getOkCount() {
			return this.okCount;
		}

		public void setOkCount(Integer okCount) {
			this.okCount = okCount;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public Integer getInstanceHeartBeatInterval() {
			return this.instanceHeartBeatInterval;
		}

		public void setInstanceHeartBeatInterval(Integer instanceHeartBeatInterval) {
			this.instanceHeartBeatInterval = instanceHeartBeatInterval;
		}

		public Integer getIpDeleteTimeout() {
			return this.ipDeleteTimeout;
		}

		public void setIpDeleteTimeout(Integer ipDeleteTimeout) {
			this.ipDeleteTimeout = ipDeleteTimeout;
		}

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public Integer getFailCount() {
			return this.failCount;
		}

		public void setFailCount(Integer failCount) {
			this.failCount = failCount;
		}

		public Boolean getHealthy() {
			return this.healthy;
		}

		public void setHealthy(Boolean healthy) {
			this.healthy = healthy;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getDatumKey() {
			return this.datumKey;
		}

		public void setDatumKey(String datumKey) {
			this.datumKey = datumKey;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Integer getInstanceHeartBeatTimeOut() {
			return this.instanceHeartBeatTimeOut;
		}

		public void setInstanceHeartBeatTimeOut(Integer instanceHeartBeatTimeOut) {
			this.instanceHeartBeatTimeOut = instanceHeartBeatTimeOut;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public Map<Object,Object> getMetadata() {
			return this.metadata;
		}

		public void setMetadata(Map<Object,Object> metadata) {
			this.metadata = metadata;
		}
	}

	@Override
	public ListAnsInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListAnsInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
