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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeEnsRegionIdResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnsRegionIdResourceResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private List<EnsRegionIdResource> ensRegionIdResources;

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

	public List<EnsRegionIdResource> getEnsRegionIdResources() {
		return this.ensRegionIdResources;
	}

	public void setEnsRegionIdResources(List<EnsRegionIdResource> ensRegionIdResources) {
		this.ensRegionIdResources = ensRegionIdResources;
	}

	public static class EnsRegionIdResource {

		private String area;

		private String areaCode;

		private String bizDate;

		private String ensRegionId;

		private String ensRegionIdName;

		private Integer instanceCount;

		private Long internetBandwidth;

		private String isp;

		private Integer vCpu;

		public String getArea() {
			return this.area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getAreaCode() {
			return this.areaCode;
		}

		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}

		public String getBizDate() {
			return this.bizDate;
		}

		public void setBizDate(String bizDate) {
			this.bizDate = bizDate;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getEnsRegionIdName() {
			return this.ensRegionIdName;
		}

		public void setEnsRegionIdName(String ensRegionIdName) {
			this.ensRegionIdName = ensRegionIdName;
		}

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public Long getInternetBandwidth() {
			return this.internetBandwidth;
		}

		public void setInternetBandwidth(Long internetBandwidth) {
			this.internetBandwidth = internetBandwidth;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public Integer getVCpu() {
			return this.vCpu;
		}

		public void setVCpu(Integer vCpu) {
			this.vCpu = vCpu;
		}
	}

	@Override
	public DescribeEnsRegionIdResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnsRegionIdResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
