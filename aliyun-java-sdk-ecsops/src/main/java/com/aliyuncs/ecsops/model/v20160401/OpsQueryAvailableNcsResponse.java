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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryAvailableNcsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryAvailableNcsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<NcModel> ncModels;

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

	public List<NcModel> getNcModels() {
		return this.ncModels;
	}

	public void setNcModels(List<NcModel> ncModels) {
		this.ncModels = ncModels;
	}

	public static class NcModel {

		private String ncId;

		private String ncIp;

		private String clusterId;

		private String rackId;

		private Integer totalCpu;

		private Integer totalMem;

		private Integer availableCpu;

		private Integer availableMem;

		public String getNcId() {
			return this.ncId;
		}

		public void setNcId(String ncId) {
			this.ncId = ncId;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getRackId() {
			return this.rackId;
		}

		public void setRackId(String rackId) {
			this.rackId = rackId;
		}

		public Integer getTotalCpu() {
			return this.totalCpu;
		}

		public void setTotalCpu(Integer totalCpu) {
			this.totalCpu = totalCpu;
		}

		public Integer getTotalMem() {
			return this.totalMem;
		}

		public void setTotalMem(Integer totalMem) {
			this.totalMem = totalMem;
		}

		public Integer getAvailableCpu() {
			return this.availableCpu;
		}

		public void setAvailableCpu(Integer availableCpu) {
			this.availableCpu = availableCpu;
		}

		public Integer getAvailableMem() {
			return this.availableMem;
		}

		public void setAvailableMem(Integer availableMem) {
			this.availableMem = availableMem;
		}
	}

	@Override
	public OpsQueryAvailableNcsResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryAvailableNcsResponseUnmarshaller.unmarshall(this, context);
	}
}
