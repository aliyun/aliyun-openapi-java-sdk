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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeCloudOpsNcDownsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeCloudOpsNcDownsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private String bizMessage;

	private Integer page;

	private Integer count;

	private String bizCode;

	private List<NcDownInfo> data;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getBizMessage() {
		return this.bizMessage;
	}

	public void setBizMessage(String bizMessage) {
		this.bizMessage = bizMessage;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public List<NcDownInfo> getData() {
		return this.data;
	}

	public void setData(List<NcDownInfo> data) {
		this.data = data;
	}

	public static class NcDownInfo {

		private String kelude;

		private String type;

		private String vmInfo;

		private Integer hitch;

		private String create;

		private String cluster;

		private String ip;

		private String hostname;

		private String ncType;

		private String manufacturer;

		private String aggrDownType;

		private String rip;

		private String ncId;

		private String opsType;

		private String clusterUsage;

		private String downId;

		private String header;

		private String reason;

		private Long id;

		public String getKelude() {
			return this.kelude;
		}

		public void setKelude(String kelude) {
			this.kelude = kelude;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getVmInfo() {
			return this.vmInfo;
		}

		public void setVmInfo(String vmInfo) {
			this.vmInfo = vmInfo;
		}

		public Integer getHitch() {
			return this.hitch;
		}

		public void setHitch(Integer hitch) {
			this.hitch = hitch;
		}

		public String getCreate() {
			return this.create;
		}

		public void setCreate(String create) {
			this.create = create;
		}

		public String getCluster() {
			return this.cluster;
		}

		public void setCluster(String cluster) {
			this.cluster = cluster;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getNcType() {
			return this.ncType;
		}

		public void setNcType(String ncType) {
			this.ncType = ncType;
		}

		public String getManufacturer() {
			return this.manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public String getAggrDownType() {
			return this.aggrDownType;
		}

		public void setAggrDownType(String aggrDownType) {
			this.aggrDownType = aggrDownType;
		}

		public String getRip() {
			return this.rip;
		}

		public void setRip(String rip) {
			this.rip = rip;
		}

		public String getNcId() {
			return this.ncId;
		}

		public void setNcId(String ncId) {
			this.ncId = ncId;
		}

		public String getOpsType() {
			return this.opsType;
		}

		public void setOpsType(String opsType) {
			this.opsType = opsType;
		}

		public String getClusterUsage() {
			return this.clusterUsage;
		}

		public void setClusterUsage(String clusterUsage) {
			this.clusterUsage = clusterUsage;
		}

		public String getDownId() {
			return this.downId;
		}

		public void setDownId(String downId) {
			this.downId = downId;
		}

		public String getHeader() {
			return this.header;
		}

		public void setHeader(String header) {
			this.header = header;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public OpsDescribeCloudOpsNcDownsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeCloudOpsNcDownsResponseUnmarshaller.unmarshall(this, context);
	}
}
