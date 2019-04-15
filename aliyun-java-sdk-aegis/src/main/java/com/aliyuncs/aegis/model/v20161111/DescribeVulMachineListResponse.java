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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeVulMachineListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulMachineListResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<MachineStatistic> machineStatistics;

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

	public List<MachineStatistic> getMachineStatistics() {
		return this.machineStatistics;
	}

	public void setMachineStatistics(List<MachineStatistic> machineStatistics) {
		this.machineStatistics = machineStatistics;
	}

	public static class MachineStatistic {

		private String uuid;

		private Integer cveNum;

		private Integer emgNum;

		private Integer sysNum;

		private Integer cmsNum;

		private Integer cmsDealedTotalNum;

		private Integer vulDealedTotalNum;

		private Integer vulAsapSum;

		private Integer vulLaterSum;

		private Integer vulNntfSum;

		private Integer vulSeriousTotal;

		private Integer vulHighTotal;

		private Integer vulMediumTotal;

		private Integer vulLowTotal;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public Integer getCveNum() {
			return this.cveNum;
		}

		public void setCveNum(Integer cveNum) {
			this.cveNum = cveNum;
		}

		public Integer getEmgNum() {
			return this.emgNum;
		}

		public void setEmgNum(Integer emgNum) {
			this.emgNum = emgNum;
		}

		public Integer getSysNum() {
			return this.sysNum;
		}

		public void setSysNum(Integer sysNum) {
			this.sysNum = sysNum;
		}

		public Integer getCmsNum() {
			return this.cmsNum;
		}

		public void setCmsNum(Integer cmsNum) {
			this.cmsNum = cmsNum;
		}

		public Integer getCmsDealedTotalNum() {
			return this.cmsDealedTotalNum;
		}

		public void setCmsDealedTotalNum(Integer cmsDealedTotalNum) {
			this.cmsDealedTotalNum = cmsDealedTotalNum;
		}

		public Integer getVulDealedTotalNum() {
			return this.vulDealedTotalNum;
		}

		public void setVulDealedTotalNum(Integer vulDealedTotalNum) {
			this.vulDealedTotalNum = vulDealedTotalNum;
		}

		public Integer getVulAsapSum() {
			return this.vulAsapSum;
		}

		public void setVulAsapSum(Integer vulAsapSum) {
			this.vulAsapSum = vulAsapSum;
		}

		public Integer getVulLaterSum() {
			return this.vulLaterSum;
		}

		public void setVulLaterSum(Integer vulLaterSum) {
			this.vulLaterSum = vulLaterSum;
		}

		public Integer getVulNntfSum() {
			return this.vulNntfSum;
		}

		public void setVulNntfSum(Integer vulNntfSum) {
			this.vulNntfSum = vulNntfSum;
		}

		public Integer getVulSeriousTotal() {
			return this.vulSeriousTotal;
		}

		public void setVulSeriousTotal(Integer vulSeriousTotal) {
			this.vulSeriousTotal = vulSeriousTotal;
		}

		public Integer getVulHighTotal() {
			return this.vulHighTotal;
		}

		public void setVulHighTotal(Integer vulHighTotal) {
			this.vulHighTotal = vulHighTotal;
		}

		public Integer getVulMediumTotal() {
			return this.vulMediumTotal;
		}

		public void setVulMediumTotal(Integer vulMediumTotal) {
			this.vulMediumTotal = vulMediumTotal;
		}

		public Integer getVulLowTotal() {
			return this.vulLowTotal;
		}

		public void setVulLowTotal(Integer vulLowTotal) {
			this.vulLowTotal = vulLowTotal;
		}
	}

	@Override
	public DescribeVulMachineListResponse getInstance(UnmarshallerContext context) {
		return	DescribeVulMachineListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
