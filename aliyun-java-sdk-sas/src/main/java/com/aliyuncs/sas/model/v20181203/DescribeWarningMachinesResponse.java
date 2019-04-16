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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeWarningMachinesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWarningMachinesResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private Integer pageSize;

	private Integer totalCount;

	private Integer currentPage;

	private List<WarningMachine> warningMachines;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<WarningMachine> getWarningMachines() {
		return this.warningMachines;
	}

	public void setWarningMachines(List<WarningMachine> warningMachines) {
		this.warningMachines = warningMachines;
	}

	public static class WarningMachine {

		private String uuid;

		private String machineName;

		private String internetIp;

		private String intranetIp;

		private Integer passCount;

		private Integer highWarningCount;

		private Integer mediumWarningCount;

		private Integer lowWarningCount;

		private Integer status;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getMachineName() {
			return this.machineName;
		}

		public void setMachineName(String machineName) {
			this.machineName = machineName;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public Integer getPassCount() {
			return this.passCount;
		}

		public void setPassCount(Integer passCount) {
			this.passCount = passCount;
		}

		public Integer getHighWarningCount() {
			return this.highWarningCount;
		}

		public void setHighWarningCount(Integer highWarningCount) {
			this.highWarningCount = highWarningCount;
		}

		public Integer getMediumWarningCount() {
			return this.mediumWarningCount;
		}

		public void setMediumWarningCount(Integer mediumWarningCount) {
			this.mediumWarningCount = mediumWarningCount;
		}

		public Integer getLowWarningCount() {
			return this.lowWarningCount;
		}

		public void setLowWarningCount(Integer lowWarningCount) {
			this.lowWarningCount = lowWarningCount;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public DescribeWarningMachinesResponse getInstance(UnmarshallerContext context) {
		return	DescribeWarningMachinesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
