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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClustersResponse extends AcsResponse {

	private String requestId;

	private Long total;

	private List<Cluster> clusters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<Cluster> getClusters() {
		return this.clusters;
	}

	public void setClusters(List<Cluster> clusters) {
		this.clusters = clusters;
	}

	public static class Cluster {

		private String clusterId;

		private String name;

		private String description;

		private String maintainTime;

		private String status;

		private List<InternalPort> internalPorts;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMaintainTime() {
			return this.maintainTime;
		}

		public void setMaintainTime(String maintainTime) {
			this.maintainTime = maintainTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<InternalPort> getInternalPorts() {
			return this.internalPorts;
		}

		public void setInternalPorts(List<InternalPort> internalPorts) {
			this.internalPorts = internalPorts;
		}

		public static class InternalPort {

			private String platform;

			private String ipProtocol;

			private List<String> port;

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public String getIpProtocol() {
				return this.ipProtocol;
			}

			public void setIpProtocol(String ipProtocol) {
				this.ipProtocol = ipProtocol;
			}

			public List<String> getPort() {
				return this.port;
			}

			public void setPort(List<String> port) {
				this.port = port;
			}
		}
	}

	@Override
	public DescribeClustersResponse getInstance(UnmarshallerContext context) {
		return	DescribeClustersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
