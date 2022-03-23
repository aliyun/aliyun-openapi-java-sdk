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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeRoleZoneInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRoleZoneInfoResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<NodeInfo> node;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<NodeInfo> getNode() {
		return this.node;
	}

	public void setNode(List<NodeInfo> node) {
		this.node = node;
	}

	public static class NodeInfo {

		private String cPUUsage;

		private Long defaultBandWidth;

		private String currentMinorVersion;

		private Long currentBandWidth;

		private Integer insType;

		private Float intranetOut;

		private Integer isLatestVersion;

		private Float connection;

		private String insName;

		private String nodeType;

		private Float intranetIn;

		private Float avgRt;

		private String zoneId;

		private Boolean isOpenBandWidthService;

		private String custinsId;

		private String role;

		private String nodeId;

		public String getCPUUsage() {
			return this.cPUUsage;
		}

		public void setCPUUsage(String cPUUsage) {
			this.cPUUsage = cPUUsage;
		}

		public Long getDefaultBandWidth() {
			return this.defaultBandWidth;
		}

		public void setDefaultBandWidth(Long defaultBandWidth) {
			this.defaultBandWidth = defaultBandWidth;
		}

		public String getCurrentMinorVersion() {
			return this.currentMinorVersion;
		}

		public void setCurrentMinorVersion(String currentMinorVersion) {
			this.currentMinorVersion = currentMinorVersion;
		}

		public Long getCurrentBandWidth() {
			return this.currentBandWidth;
		}

		public void setCurrentBandWidth(Long currentBandWidth) {
			this.currentBandWidth = currentBandWidth;
		}

		public Integer getInsType() {
			return this.insType;
		}

		public void setInsType(Integer insType) {
			this.insType = insType;
		}

		public Float getIntranetOut() {
			return this.intranetOut;
		}

		public void setIntranetOut(Float intranetOut) {
			this.intranetOut = intranetOut;
		}

		public Integer getIsLatestVersion() {
			return this.isLatestVersion;
		}

		public void setIsLatestVersion(Integer isLatestVersion) {
			this.isLatestVersion = isLatestVersion;
		}

		public Float getConnection() {
			return this.connection;
		}

		public void setConnection(Float connection) {
			this.connection = connection;
		}

		public String getInsName() {
			return this.insName;
		}

		public void setInsName(String insName) {
			this.insName = insName;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public Float getIntranetIn() {
			return this.intranetIn;
		}

		public void setIntranetIn(Float intranetIn) {
			this.intranetIn = intranetIn;
		}

		public Float getAvgRt() {
			return this.avgRt;
		}

		public void setAvgRt(Float avgRt) {
			this.avgRt = avgRt;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Boolean getIsOpenBandWidthService() {
			return this.isOpenBandWidthService;
		}

		public void setIsOpenBandWidthService(Boolean isOpenBandWidthService) {
			this.isOpenBandWidthService = isOpenBandWidthService;
		}

		public String getCustinsId() {
			return this.custinsId;
		}

		public void setCustinsId(String custinsId) {
			this.custinsId = custinsId;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}
	}

	@Override
	public DescribeRoleZoneInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeRoleZoneInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
