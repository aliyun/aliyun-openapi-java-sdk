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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeDeploymentSetTopologyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeploymentSetTopologyResponse extends AcsResponse {

	private String requestId;

	private List<_Switch> switchs;

	private List<Rack> racks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<_Switch> getSwitchs() {
		return this.switchs;
	}

	public void setSwitchs(List<_Switch> switchs) {
		this.switchs = switchs;
	}

	public List<Rack> getRacks() {
		return this.racks;
	}

	public void setRacks(List<Rack> racks) {
		this.racks = racks;
	}

	public static class _Switch {

		private String switchId;

		private List<Host> hosts;

		public String getSwitchId() {
			return this.switchId;
		}

		public void setSwitchId(String switchId) {
			this.switchId = switchId;
		}

		public List<Host> getHosts() {
			return this.hosts;
		}

		public void setHosts(List<Host> hosts) {
			this.hosts = hosts;
		}

		public static class Host {

			private String hostId;

			private List<String> instanceIds;

			public String getHostId() {
				return this.hostId;
			}

			public void setHostId(String hostId) {
				this.hostId = hostId;
			}

			public List<String> getInstanceIds() {
				return this.instanceIds;
			}

			public void setInstanceIds(List<String> instanceIds) {
				this.instanceIds = instanceIds;
			}
		}
	}

	public static class Rack {

		private String rackId;

		private List<Host2> hosts1;

		public String getRackId() {
			return this.rackId;
		}

		public void setRackId(String rackId) {
			this.rackId = rackId;
		}

		public List<Host2> getHosts1() {
			return this.hosts1;
		}

		public void setHosts1(List<Host2> hosts1) {
			this.hosts1 = hosts1;
		}

		public static class Host2 {

			private String hostId;

			private List<String> instanceIds3;

			public String getHostId() {
				return this.hostId;
			}

			public void setHostId(String hostId) {
				this.hostId = hostId;
			}

			public List<String> getInstanceIds3() {
				return this.instanceIds3;
			}

			public void setInstanceIds3(List<String> instanceIds3) {
				this.instanceIds3 = instanceIds3;
			}
		}
	}

	@Override
	public DescribeDeploymentSetTopologyResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeploymentSetTopologyResponseUnmarshaller.unmarshall(this, context);
	}
}
