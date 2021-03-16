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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeOsTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeOsTypesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<OsType> osTypes;

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

	public List<OsType> getOsTypes() {
		return this.osTypes;
	}

	public void setOsTypes(List<OsType> osTypes) {
		this.osTypes = osTypes;
	}

	public static class OsType {

		private Long osTypeId;

		private String kind;

		private String platform;

		private String osName;

		private String osNameEn;

		private Integer osBit;

		private Integer maxCpu;

		private Integer minCpu;

		private Integer maxMemory;

		private Integer minMemory;

		private String osLicense;

		public Long getOsTypeId() {
			return this.osTypeId;
		}

		public void setOsTypeId(Long osTypeId) {
			this.osTypeId = osTypeId;
		}

		public String getKind() {
			return this.kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
		}

		public String getOsNameEn() {
			return this.osNameEn;
		}

		public void setOsNameEn(String osNameEn) {
			this.osNameEn = osNameEn;
		}

		public Integer getOsBit() {
			return this.osBit;
		}

		public void setOsBit(Integer osBit) {
			this.osBit = osBit;
		}

		public Integer getMaxCpu() {
			return this.maxCpu;
		}

		public void setMaxCpu(Integer maxCpu) {
			this.maxCpu = maxCpu;
		}

		public Integer getMinCpu() {
			return this.minCpu;
		}

		public void setMinCpu(Integer minCpu) {
			this.minCpu = minCpu;
		}

		public Integer getMaxMemory() {
			return this.maxMemory;
		}

		public void setMaxMemory(Integer maxMemory) {
			this.maxMemory = maxMemory;
		}

		public Integer getMinMemory() {
			return this.minMemory;
		}

		public void setMinMemory(Integer minMemory) {
			this.minMemory = minMemory;
		}

		public String getOsLicense() {
			return this.osLicense;
		}

		public void setOsLicense(String osLicense) {
			this.osLicense = osLicense;
		}
	}

	@Override
	public OpsDescribeOsTypesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeOsTypesResponseUnmarshaller.unmarshall(this, context);
	}
}
