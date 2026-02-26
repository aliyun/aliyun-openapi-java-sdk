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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeGlobalDataNetworkListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGlobalDataNetworkListResponse extends AcsResponse {

	private String requestId;

	private String totalRecordCount;

	private String pageRecordCount;

	private String pageNumber;

	private String nextToken;

	private Integer maxResults;

	private Items items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(String totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(String pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public Items getItems() {
		return this.items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public static class Items {

		private List<Network> networks;

		public List<Network> getNetworks() {
			return this.networks;
		}

		public void setNetworks(List<Network> networks) {
			this.networks = networks;
		}

		public static class Network {

			private String networkId;

			private String networkDescription;

			private String networkStatus;

			private String createTime;

			private List<Channel> channels;

			private NetworkTopology networkTopology;

			public String getNetworkId() {
				return this.networkId;
			}

			public void setNetworkId(String networkId) {
				this.networkId = networkId;
			}

			public String getNetworkDescription() {
				return this.networkDescription;
			}

			public void setNetworkDescription(String networkDescription) {
				this.networkDescription = networkDescription;
			}

			public String getNetworkStatus() {
				return this.networkStatus;
			}

			public void setNetworkStatus(String networkStatus) {
				this.networkStatus = networkStatus;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public List<Channel> getChannels() {
				return this.channels;
			}

			public void setChannels(List<Channel> channels) {
				this.channels = channels;
			}

			public NetworkTopology getNetworkTopology() {
				return this.networkTopology;
			}

			public void setNetworkTopology(NetworkTopology networkTopology) {
				this.networkTopology = networkTopology;
			}

			public static class Channel {

				private String channelId;

				private String channelStatus;

				private String progress;

				private Boolean freezeSourceDuringSync;

				public String getChannelId() {
					return this.channelId;
				}

				public void setChannelId(String channelId) {
					this.channelId = channelId;
				}

				public String getChannelStatus() {
					return this.channelStatus;
				}

				public void setChannelStatus(String channelStatus) {
					this.channelStatus = channelStatus;
				}

				public String getProgress() {
					return this.progress;
				}

				public void setProgress(String progress) {
					this.progress = progress;
				}

				public Boolean getFreezeSourceDuringSync() {
					return this.freezeSourceDuringSync;
				}

				public void setFreezeSourceDuringSync(Boolean freezeSourceDuringSync) {
					this.freezeSourceDuringSync = freezeSourceDuringSync;
				}
			}

			public static class NetworkTopology {

				private List<Source> sources;

				private List<Destination> destinations;

				public List<Source> getSources() {
					return this.sources;
				}

				public void setSources(List<Source> sources) {
					this.sources = sources;
				}

				public List<Destination> getDestinations() {
					return this.destinations;
				}

				public void setDestinations(List<Destination> destinations) {
					this.destinations = destinations;
				}

				public static class Source {

					private String sourceFileSystemPath;

					private String sourceType;

					private String sourceRegion;

					private String sourceId;

					public String getSourceFileSystemPath() {
						return this.sourceFileSystemPath;
					}

					public void setSourceFileSystemPath(String sourceFileSystemPath) {
						this.sourceFileSystemPath = sourceFileSystemPath;
					}

					public String getSourceType() {
						return this.sourceType;
					}

					public void setSourceType(String sourceType) {
						this.sourceType = sourceType;
					}

					public String getSourceRegion() {
						return this.sourceRegion;
					}

					public void setSourceRegion(String sourceRegion) {
						this.sourceRegion = sourceRegion;
					}

					public String getSourceId() {
						return this.sourceId;
					}

					public void setSourceId(String sourceId) {
						this.sourceId = sourceId;
					}
				}

				public static class Destination {

					private String destinationFileSystemPath;

					private String destinationRegion;

					private String destinationType;

					private String destinationId;

					public String getDestinationFileSystemPath() {
						return this.destinationFileSystemPath;
					}

					public void setDestinationFileSystemPath(String destinationFileSystemPath) {
						this.destinationFileSystemPath = destinationFileSystemPath;
					}

					public String getDestinationRegion() {
						return this.destinationRegion;
					}

					public void setDestinationRegion(String destinationRegion) {
						this.destinationRegion = destinationRegion;
					}

					public String getDestinationType() {
						return this.destinationType;
					}

					public void setDestinationType(String destinationType) {
						this.destinationType = destinationType;
					}

					public String getDestinationId() {
						return this.destinationId;
					}

					public void setDestinationId(String destinationId) {
						this.destinationId = destinationId;
					}
				}
			}
		}
	}

	@Override
	public DescribeGlobalDataNetworkListResponse getInstance(UnmarshallerContext context) {
		return	DescribeGlobalDataNetworkListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
