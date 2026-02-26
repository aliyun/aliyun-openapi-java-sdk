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

package com.aliyuncs.adcp.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adcp.transform.v20220101.DescribeManagedClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeManagedClustersResponse extends AcsResponse {

	private String requestId;

	private List<Cluster> clusters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Cluster> getClusters() {
		return this.clusters;
	}

	public void setClusters(List<Cluster> clusters) {
		this.clusters = clusters;
	}

	public static class Cluster {

		private Cluster1 cluster1;

		private Status status;

		private MeshStatus meshStatus;

		public Cluster1 getCluster1() {
			return this.cluster1;
		}

		public void setCluster1(Cluster1 cluster1) {
			this.cluster1 = cluster1;
		}

		public Status getStatus() {
			return this.status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public MeshStatus getMeshStatus() {
			return this.meshStatus;
		}

		public void setMeshStatus(MeshStatus meshStatus) {
			this.meshStatus = meshStatus;
		}

		public static class Cluster1 {

			private String name;

			private String clusterID;

			private String region;

			private String state;

			private String clusterType;

			private String created;

			private String updated;

			private String initVersion;

			private String currentVersion;

			private String resourceGroupId;

			private String vpcID;

			private String vSwitchID;

			private String profile;

			private String clusterSpec;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getClusterID() {
				return this.clusterID;
			}

			public void setClusterID(String clusterID) {
				this.clusterID = clusterID;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getClusterType() {
				return this.clusterType;
			}

			public void setClusterType(String clusterType) {
				this.clusterType = clusterType;
			}

			public String getCreated() {
				return this.created;
			}

			public void setCreated(String created) {
				this.created = created;
			}

			public String getUpdated() {
				return this.updated;
			}

			public void setUpdated(String updated) {
				this.updated = updated;
			}

			public String getInitVersion() {
				return this.initVersion;
			}

			public void setInitVersion(String initVersion) {
				this.initVersion = initVersion;
			}

			public String getCurrentVersion() {
				return this.currentVersion;
			}

			public void setCurrentVersion(String currentVersion) {
				this.currentVersion = currentVersion;
			}

			public String getResourceGroupId() {
				return this.resourceGroupId;
			}

			public void setResourceGroupId(String resourceGroupId) {
				this.resourceGroupId = resourceGroupId;
			}

			public String getVpcID() {
				return this.vpcID;
			}

			public void setVpcID(String vpcID) {
				this.vpcID = vpcID;
			}

			public String getVSwitchID() {
				return this.vSwitchID;
			}

			public void setVSwitchID(String vSwitchID) {
				this.vSwitchID = vSwitchID;
			}

			public String getProfile() {
				return this.profile;
			}

			public void setProfile(String profile) {
				this.profile = profile;
			}

			public String getClusterSpec() {
				return this.clusterSpec;
			}

			public void setClusterSpec(String clusterSpec) {
				this.clusterSpec = clusterSpec;
			}
		}

		public static class Status {

			private String state;

			private String message;

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}
		}

		public static class MeshStatus {

			private Boolean inMesh;

			public Boolean getInMesh() {
				return this.inMesh;
			}

			public void setInMesh(Boolean inMesh) {
				this.inMesh = inMesh;
			}
		}
	}

	@Override
	public DescribeManagedClustersResponse getInstance(UnmarshallerContext context) {
		return	DescribeManagedClustersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
