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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeMasterSlaveServerGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMasterSlaveServerGroupsResponse extends AcsResponse {

	private String requestId;

	private List<MasterSlaveServerGroup> masterSlaveServerGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MasterSlaveServerGroup> getMasterSlaveServerGroups() {
		return this.masterSlaveServerGroups;
	}

	public void setMasterSlaveServerGroups(List<MasterSlaveServerGroup> masterSlaveServerGroups) {
		this.masterSlaveServerGroups = masterSlaveServerGroups;
	}

	public static class MasterSlaveServerGroup {

		private String masterSlaveServerGroupId;

		private String masterSlaveServerGroupName;

		private AssociatedObjects associatedObjects;

		public String getMasterSlaveServerGroupId() {
			return this.masterSlaveServerGroupId;
		}

		public void setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
			this.masterSlaveServerGroupId = masterSlaveServerGroupId;
		}

		public String getMasterSlaveServerGroupName() {
			return this.masterSlaveServerGroupName;
		}

		public void setMasterSlaveServerGroupName(String masterSlaveServerGroupName) {
			this.masterSlaveServerGroupName = masterSlaveServerGroupName;
		}

		public AssociatedObjects getAssociatedObjects() {
			return this.associatedObjects;
		}

		public void setAssociatedObjects(AssociatedObjects associatedObjects) {
			this.associatedObjects = associatedObjects;
		}

		public static class AssociatedObjects {

			private List<Listener> listeners;

			public List<Listener> getListeners() {
				return this.listeners;
			}

			public void setListeners(List<Listener> listeners) {
				this.listeners = listeners;
			}

			public static class Listener {

				private String protocol;

				private Integer port;

				public String getBizProtocol() {
					return this.protocol;
				}

				public void setBizProtocol(String protocol) {
					this.protocol = protocol;
				}

				/**
				 * @deprecated use getBizProtocol instead of this.
				 */
				@Deprecated
				public String getProtocol() {
					return this.protocol;
				}

				/**
				 * @deprecated use setBizProtocol instead of this.
				 */
				@Deprecated
				public void setProtocol(String protocol) {
					this.protocol = protocol;
				}

				public Integer getPort() {
					return this.port;
				}

				public void setPort(Integer port) {
					this.port = port;
				}
			}
		}
	}

	@Override
	public DescribeMasterSlaveServerGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeMasterSlaveServerGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
