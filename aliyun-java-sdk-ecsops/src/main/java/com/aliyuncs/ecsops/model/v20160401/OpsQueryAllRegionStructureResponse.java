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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryAllRegionStructureResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryAllRegionStructureResponse extends AcsResponse {

	private String requestId;

	private List<Region> regions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Region> getRegions() {
		return this.regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public static class Region {

		private String region;

		private String alias;

		private String chineseName;

		private String englishName;

		private String description;

		private List<AvailableZone> availableZones;

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public String getChineseName() {
			return this.chineseName;
		}

		public void setChineseName(String chineseName) {
			this.chineseName = chineseName;
		}

		public String getEnglishName() {
			return this.englishName;
		}

		public void setEnglishName(String englishName) {
			this.englishName = englishName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<AvailableZone> getAvailableZones() {
			return this.availableZones;
		}

		public void setAvailableZones(List<AvailableZone> availableZones) {
			this.availableZones = availableZones;
		}

		public static class AvailableZone {

			private String availableZone;

			private List<Cluster> clusters;

			public String getAvailableZone() {
				return this.availableZone;
			}

			public void setAvailableZone(String availableZone) {
				this.availableZone = availableZone;
			}

			public List<Cluster> getClusters() {
				return this.clusters;
			}

			public void setClusters(List<Cluster> clusters) {
				this.clusters = clusters;
			}

			public static class Cluster {

				private String cluster;

				private List<String> zones;

				public String getCluster() {
					return this.cluster;
				}

				public void setCluster(String cluster) {
					this.cluster = cluster;
				}

				public List<String> getZones() {
					return this.zones;
				}

				public void setZones(List<String> zones) {
					this.zones = zones;
				}
			}
		}
	}

	@Override
	public OpsQueryAllRegionStructureResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryAllRegionStructureResponseUnmarshaller.unmarshall(this, context);
	}
}
