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

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<EnsRegionIdResource> ensRegionIdResources;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<EnsRegionIdResource> getEnsRegionIdResources() {
		return this.ensRegionIdResources;
	}

	public void setEnsRegionIdResources(List<EnsRegionIdResource> ensRegionIdResources) {
		this.ensRegionIdResources = ensRegionIdResources;
	}

	public static class EnsRegionIdResource {

		private Integer internetBandwidth;

		private Integer instanceCount;

		private String area;

		private String isp;

		private String ensRegionIdName;

		private String areaCode;

		private Integer vCpu;

		private String ensRegionId;

		private String bizDate;

		public Integer getInternetBandwidth() {
			return this.internetBandwidth;
		}

		public void setInternetBandwidth(Integer internetBandwidth) {
			this.internetBandwidth = internetBandwidth;
		}

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public String getArea() {
			return this.area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public String getEnsRegionIdName() {
			return this.ensRegionIdName;
		}

		public void setEnsRegionIdName(String ensRegionIdName) {
			this.ensRegionIdName = ensRegionIdName;
		}

		public String getAreaCode() {
			return this.areaCode;
		}

		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}

		public Integer getVCpu() {
			return this.vCpu;
		}

		public void setVCpu(Integer vCpu) {
			this.vCpu = vCpu;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getBizDate() {
			return this.bizDate;
		}

		public void setBizDate(String bizDate) {
			this.bizDate = bizDate;
		}
	}

	@Override
	public DescribeEnsRegionIdResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnsRegionIdResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
