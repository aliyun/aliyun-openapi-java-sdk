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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryCasDatabaseSpecResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCasDatabaseSpecResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long cpu;

		private Boolean customStorage;

		private String engine;

		private String iaasId;

		private String id;

		private Long maxConnections;

		private Long maxIops;

		private Long maxStorage;

		private Long memory;

		private Long minStorage;

		private String name;

		private String type;

		private List<String> engineVersion;

		private List<String> supportedStorages;

		public Long getCpu() {
			return this.cpu;
		}

		public void setCpu(Long cpu) {
			this.cpu = cpu;
		}

		public Boolean getCustomStorage() {
			return this.customStorage;
		}

		public void setCustomStorage(Boolean customStorage) {
			this.customStorage = customStorage;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getIaasId() {
			return this.iaasId;
		}

		public void setIaasId(String iaasId) {
			this.iaasId = iaasId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Long getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(Long maxConnections) {
			this.maxConnections = maxConnections;
		}

		public Long getMaxIops() {
			return this.maxIops;
		}

		public void setMaxIops(Long maxIops) {
			this.maxIops = maxIops;
		}

		public Long getMaxStorage() {
			return this.maxStorage;
		}

		public void setMaxStorage(Long maxStorage) {
			this.maxStorage = maxStorage;
		}

		public Long getMemory() {
			return this.memory;
		}

		public void setMemory(Long memory) {
			this.memory = memory;
		}

		public Long getMinStorage() {
			return this.minStorage;
		}

		public void setMinStorage(Long minStorage) {
			this.minStorage = minStorage;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<String> getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(List<String> engineVersion) {
			this.engineVersion = engineVersion;
		}

		public List<String> getSupportedStorages() {
			return this.supportedStorages;
		}

		public void setSupportedStorages(List<String> supportedStorages) {
			this.supportedStorages = supportedStorages;
		}
	}

	@Override
	public QueryCasDatabaseSpecResponse getInstance(UnmarshallerContext context) {
		return	QueryCasDatabaseSpecResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
