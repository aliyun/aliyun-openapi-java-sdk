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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ListVpcPublishedRouteEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpcPublishedRouteEntriesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<RouteEntry> routeEntries;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<RouteEntry> getRouteEntries() {
		return this.routeEntries;
	}

	public void setRouteEntries(List<RouteEntry> routeEntries) {
		this.routeEntries = routeEntries;
	}

	public static class RouteEntry {

		private String routeEntryId;

		private String destinationCidrBlock;

		private String routeTableId;

		private List<RoutePublishTarget> routePublishTargets;

		public String getRouteEntryId() {
			return this.routeEntryId;
		}

		public void setRouteEntryId(String routeEntryId) {
			this.routeEntryId = routeEntryId;
		}

		public String getDestinationCidrBlock() {
			return this.destinationCidrBlock;
		}

		public void setDestinationCidrBlock(String destinationCidrBlock) {
			this.destinationCidrBlock = destinationCidrBlock;
		}

		public String getRouteTableId() {
			return this.routeTableId;
		}

		public void setRouteTableId(String routeTableId) {
			this.routeTableId = routeTableId;
		}

		public List<RoutePublishTarget> getRoutePublishTargets() {
			return this.routePublishTargets;
		}

		public void setRoutePublishTargets(List<RoutePublishTarget> routePublishTargets) {
			this.routePublishTargets = routePublishTargets;
		}

		public static class RoutePublishTarget {

			private String publishStatus;

			private String publishTargetType;

			private String publishTargetInstanceId;

			public String getPublishStatus() {
				return this.publishStatus;
			}

			public void setPublishStatus(String publishStatus) {
				this.publishStatus = publishStatus;
			}

			public String getPublishTargetType() {
				return this.publishTargetType;
			}

			public void setPublishTargetType(String publishTargetType) {
				this.publishTargetType = publishTargetType;
			}

			public String getPublishTargetInstanceId() {
				return this.publishTargetInstanceId;
			}

			public void setPublishTargetInstanceId(String publishTargetInstanceId) {
				this.publishTargetInstanceId = publishTargetInstanceId;
			}
		}
	}

	@Override
	public ListVpcPublishedRouteEntriesResponse getInstance(UnmarshallerContext context) {
		return	ListVpcPublishedRouteEntriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
