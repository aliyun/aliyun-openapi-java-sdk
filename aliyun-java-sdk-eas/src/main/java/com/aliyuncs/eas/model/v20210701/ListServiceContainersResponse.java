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

package com.aliyuncs.eas.model.v20210701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20210701.ListServiceContainersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServiceContainersResponse extends AcsResponse {

	private String requestId;

	private String serviceName;

	private List<Container> containers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public List<Container> getContainers() {
		return this.containers;
	}

	public void setContainers(List<Container> containers) {
		this.containers = containers;
	}

	public static class Container {

		private String name;

		private String image;

		private Integer port;

		private Integer restartCount;

		private Boolean ready;

		private String currentStatus;

		private String currentReaon;

		private String currentTimestamp;

		private String lastStatus;

		private String lastReason;

		private String lastTimestamp;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public Integer getRestartCount() {
			return this.restartCount;
		}

		public void setRestartCount(Integer restartCount) {
			this.restartCount = restartCount;
		}

		public Boolean getReady() {
			return this.ready;
		}

		public void setReady(Boolean ready) {
			this.ready = ready;
		}

		public String getCurrentStatus() {
			return this.currentStatus;
		}

		public void setCurrentStatus(String currentStatus) {
			this.currentStatus = currentStatus;
		}

		public String getCurrentReaon() {
			return this.currentReaon;
		}

		public void setCurrentReaon(String currentReaon) {
			this.currentReaon = currentReaon;
		}

		public String getCurrentTimestamp() {
			return this.currentTimestamp;
		}

		public void setCurrentTimestamp(String currentTimestamp) {
			this.currentTimestamp = currentTimestamp;
		}

		public String getLastStatus() {
			return this.lastStatus;
		}

		public void setLastStatus(String lastStatus) {
			this.lastStatus = lastStatus;
		}

		public String getLastReason() {
			return this.lastReason;
		}

		public void setLastReason(String lastReason) {
			this.lastReason = lastReason;
		}

		public String getLastTimestamp() {
			return this.lastTimestamp;
		}

		public void setLastTimestamp(String lastTimestamp) {
			this.lastTimestamp = lastTimestamp;
		}
	}

	@Override
	public ListServiceContainersResponse getInstance(UnmarshallerContext context) {
		return	ListServiceContainersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
