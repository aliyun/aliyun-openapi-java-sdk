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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.DescribeCenRouteMapsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCenRouteMapsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<RouteMap> routeMaps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<RouteMap> getRouteMaps() {
		return this.routeMaps;
	}

	public void setRouteMaps(List<RouteMap> routeMaps) {
		this.routeMaps = routeMaps;
	}

	public static class RouteMap {

		private String status;

		private String routeMapId;

		private String cenId;

		private String cenRegionId;

		private String description;

		private String mapResult;

		private Integer priority;

		private Integer nextPriority;

		private String cidrMatchMode;

		private String asPathMatchMode;

		private String communityMatchMode;

		private String communityOperateMode;

		private Integer preference;

		private String transmitDirection;

		private Boolean sourceInstanceIdsReverseMatch;

		private Boolean destinationInstanceIdsReverseMatch;

		private List<String> sourceInstanceIds;

		private List<String> destinationInstanceIds;

		private List<String> sourceRouteTableIds;

		private List<String> destinationRouteTableIds;

		private List<String> sourceRegionIds;

		private List<String> sourceChildInstanceTypes;

		private List<String> destinationChildInstanceTypes;

		private List<String> destinationCidrBlocks;

		private List<String> routeTypes;

		private List<String> matchAsns;

		private List<String> matchCommunitySet;

		private List<String> operateCommunitySet;

		private List<String> prependAsPath;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRouteMapId() {
			return this.routeMapId;
		}

		public void setRouteMapId(String routeMapId) {
			this.routeMapId = routeMapId;
		}

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public String getCenRegionId() {
			return this.cenRegionId;
		}

		public void setCenRegionId(String cenRegionId) {
			this.cenRegionId = cenRegionId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMapResult() {
			return this.mapResult;
		}

		public void setMapResult(String mapResult) {
			this.mapResult = mapResult;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Integer getNextPriority() {
			return this.nextPriority;
		}

		public void setNextPriority(Integer nextPriority) {
			this.nextPriority = nextPriority;
		}

		public String getCidrMatchMode() {
			return this.cidrMatchMode;
		}

		public void setCidrMatchMode(String cidrMatchMode) {
			this.cidrMatchMode = cidrMatchMode;
		}

		public String getAsPathMatchMode() {
			return this.asPathMatchMode;
		}

		public void setAsPathMatchMode(String asPathMatchMode) {
			this.asPathMatchMode = asPathMatchMode;
		}

		public String getCommunityMatchMode() {
			return this.communityMatchMode;
		}

		public void setCommunityMatchMode(String communityMatchMode) {
			this.communityMatchMode = communityMatchMode;
		}

		public String getCommunityOperateMode() {
			return this.communityOperateMode;
		}

		public void setCommunityOperateMode(String communityOperateMode) {
			this.communityOperateMode = communityOperateMode;
		}

		public Integer getPreference() {
			return this.preference;
		}

		public void setPreference(Integer preference) {
			this.preference = preference;
		}

		public String getTransmitDirection() {
			return this.transmitDirection;
		}

		public void setTransmitDirection(String transmitDirection) {
			this.transmitDirection = transmitDirection;
		}

		public Boolean getSourceInstanceIdsReverseMatch() {
			return this.sourceInstanceIdsReverseMatch;
		}

		public void setSourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
			this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
		}

		public Boolean getDestinationInstanceIdsReverseMatch() {
			return this.destinationInstanceIdsReverseMatch;
		}

		public void setDestinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
			this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
		}

		public List<String> getSourceInstanceIds() {
			return this.sourceInstanceIds;
		}

		public void setSourceInstanceIds(List<String> sourceInstanceIds) {
			this.sourceInstanceIds = sourceInstanceIds;
		}

		public List<String> getDestinationInstanceIds() {
			return this.destinationInstanceIds;
		}

		public void setDestinationInstanceIds(List<String> destinationInstanceIds) {
			this.destinationInstanceIds = destinationInstanceIds;
		}

		public List<String> getSourceRouteTableIds() {
			return this.sourceRouteTableIds;
		}

		public void setSourceRouteTableIds(List<String> sourceRouteTableIds) {
			this.sourceRouteTableIds = sourceRouteTableIds;
		}

		public List<String> getDestinationRouteTableIds() {
			return this.destinationRouteTableIds;
		}

		public void setDestinationRouteTableIds(List<String> destinationRouteTableIds) {
			this.destinationRouteTableIds = destinationRouteTableIds;
		}

		public List<String> getSourceRegionIds() {
			return this.sourceRegionIds;
		}

		public void setSourceRegionIds(List<String> sourceRegionIds) {
			this.sourceRegionIds = sourceRegionIds;
		}

		public List<String> getSourceChildInstanceTypes() {
			return this.sourceChildInstanceTypes;
		}

		public void setSourceChildInstanceTypes(List<String> sourceChildInstanceTypes) {
			this.sourceChildInstanceTypes = sourceChildInstanceTypes;
		}

		public List<String> getDestinationChildInstanceTypes() {
			return this.destinationChildInstanceTypes;
		}

		public void setDestinationChildInstanceTypes(List<String> destinationChildInstanceTypes) {
			this.destinationChildInstanceTypes = destinationChildInstanceTypes;
		}

		public List<String> getDestinationCidrBlocks() {
			return this.destinationCidrBlocks;
		}

		public void setDestinationCidrBlocks(List<String> destinationCidrBlocks) {
			this.destinationCidrBlocks = destinationCidrBlocks;
		}

		public List<String> getRouteTypes() {
			return this.routeTypes;
		}

		public void setRouteTypes(List<String> routeTypes) {
			this.routeTypes = routeTypes;
		}

		public List<String> getMatchAsns() {
			return this.matchAsns;
		}

		public void setMatchAsns(List<String> matchAsns) {
			this.matchAsns = matchAsns;
		}

		public List<String> getMatchCommunitySet() {
			return this.matchCommunitySet;
		}

		public void setMatchCommunitySet(List<String> matchCommunitySet) {
			this.matchCommunitySet = matchCommunitySet;
		}

		public List<String> getOperateCommunitySet() {
			return this.operateCommunitySet;
		}

		public void setOperateCommunitySet(List<String> operateCommunitySet) {
			this.operateCommunitySet = operateCommunitySet;
		}

		public List<String> getPrependAsPath() {
			return this.prependAsPath;
		}

		public void setPrependAsPath(List<String> prependAsPath) {
			this.prependAsPath = prependAsPath;
		}
	}

	@Override
	public DescribeCenRouteMapsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCenRouteMapsResponseUnmarshaller.unmarshall(this, context);
	}
}
