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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDBInstanceDiagnosisSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceDiagnosisSummaryResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private String pageNumber;

	private List<ItemsItem> items;

	private MasterStatusInfo masterStatusInfo;

	private SegmentStatusInfo segmentStatusInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public MasterStatusInfo getMasterStatusInfo() {
		return this.masterStatusInfo;
	}

	public void setMasterStatusInfo(MasterStatusInfo masterStatusInfo) {
		this.masterStatusInfo = masterStatusInfo;
	}

	public SegmentStatusInfo getSegmentStatusInfo() {
		return this.segmentStatusInfo;
	}

	public void setSegmentStatusInfo(SegmentStatusInfo segmentStatusInfo) {
		this.segmentStatusInfo = segmentStatusInfo;
	}

	public static class ItemsItem {

		private String hostname;

		private String nodeAddress;

		private String nodeType;

		private String nodeName;

		private String nodePort;

		private String nodeID;

		private String nodeStatus;

		private String nodeRole;

		private String nodePreferredRole;

		private String nodeReplicationMode;

		private String nodeCID;

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getNodeAddress() {
			return this.nodeAddress;
		}

		public void setNodeAddress(String nodeAddress) {
			this.nodeAddress = nodeAddress;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getNodePort() {
			return this.nodePort;
		}

		public void setNodePort(String nodePort) {
			this.nodePort = nodePort;
		}

		public String getNodeID() {
			return this.nodeID;
		}

		public void setNodeID(String nodeID) {
			this.nodeID = nodeID;
		}

		public String getNodeStatus() {
			return this.nodeStatus;
		}

		public void setNodeStatus(String nodeStatus) {
			this.nodeStatus = nodeStatus;
		}

		public String getNodeRole() {
			return this.nodeRole;
		}

		public void setNodeRole(String nodeRole) {
			this.nodeRole = nodeRole;
		}

		public String getNodePreferredRole() {
			return this.nodePreferredRole;
		}

		public void setNodePreferredRole(String nodePreferredRole) {
			this.nodePreferredRole = nodePreferredRole;
		}

		public String getNodeReplicationMode() {
			return this.nodeReplicationMode;
		}

		public void setNodeReplicationMode(String nodeReplicationMode) {
			this.nodeReplicationMode = nodeReplicationMode;
		}

		public String getNodeCID() {
			return this.nodeCID;
		}

		public void setNodeCID(String nodeCID) {
			this.nodeCID = nodeCID;
		}
	}

	public static class MasterStatusInfo {

		private Integer normalNodeNum;

		private Integer exceptionNodeNum;

		private Integer notSyncingNodeNum;

		private Integer syncedNodeNum;

		private Integer preferredNodeNum;

		private Integer notPreferredNodeNum;

		public Integer getNormalNodeNum() {
			return this.normalNodeNum;
		}

		public void setNormalNodeNum(Integer normalNodeNum) {
			this.normalNodeNum = normalNodeNum;
		}

		public Integer getExceptionNodeNum() {
			return this.exceptionNodeNum;
		}

		public void setExceptionNodeNum(Integer exceptionNodeNum) {
			this.exceptionNodeNum = exceptionNodeNum;
		}

		public Integer getNotSyncingNodeNum() {
			return this.notSyncingNodeNum;
		}

		public void setNotSyncingNodeNum(Integer notSyncingNodeNum) {
			this.notSyncingNodeNum = notSyncingNodeNum;
		}

		public Integer getSyncedNodeNum() {
			return this.syncedNodeNum;
		}

		public void setSyncedNodeNum(Integer syncedNodeNum) {
			this.syncedNodeNum = syncedNodeNum;
		}

		public Integer getPreferredNodeNum() {
			return this.preferredNodeNum;
		}

		public void setPreferredNodeNum(Integer preferredNodeNum) {
			this.preferredNodeNum = preferredNodeNum;
		}

		public Integer getNotPreferredNodeNum() {
			return this.notPreferredNodeNum;
		}

		public void setNotPreferredNodeNum(Integer notPreferredNodeNum) {
			this.notPreferredNodeNum = notPreferredNodeNum;
		}
	}

	public static class SegmentStatusInfo {

		private Integer normalNodeNum;

		private Integer exceptionNodeNum;

		private Integer notSyncingNodeNum;

		private Integer syncedNodeNum;

		private Integer preferredNodeNum;

		private Integer notPreferredNodeNum;

		public Integer getNormalNodeNum() {
			return this.normalNodeNum;
		}

		public void setNormalNodeNum(Integer normalNodeNum) {
			this.normalNodeNum = normalNodeNum;
		}

		public Integer getExceptionNodeNum() {
			return this.exceptionNodeNum;
		}

		public void setExceptionNodeNum(Integer exceptionNodeNum) {
			this.exceptionNodeNum = exceptionNodeNum;
		}

		public Integer getNotSyncingNodeNum() {
			return this.notSyncingNodeNum;
		}

		public void setNotSyncingNodeNum(Integer notSyncingNodeNum) {
			this.notSyncingNodeNum = notSyncingNodeNum;
		}

		public Integer getSyncedNodeNum() {
			return this.syncedNodeNum;
		}

		public void setSyncedNodeNum(Integer syncedNodeNum) {
			this.syncedNodeNum = syncedNodeNum;
		}

		public Integer getPreferredNodeNum() {
			return this.preferredNodeNum;
		}

		public void setPreferredNodeNum(Integer preferredNodeNum) {
			this.preferredNodeNum = preferredNodeNum;
		}

		public Integer getNotPreferredNodeNum() {
			return this.notPreferredNodeNum;
		}

		public void setNotPreferredNodeNum(Integer notPreferredNodeNum) {
			this.notPreferredNodeNum = notPreferredNodeNum;
		}
	}

	@Override
	public DescribeDBInstanceDiagnosisSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceDiagnosisSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
