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

package com.aliyuncs.pts.model.v20201020;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20201020.GetUserVpcVSwitchResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserVpcVSwitchResponse extends AcsResponse {

	private Integer vSwitchCount;

	private String requestId;

	private String message;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private List<VSwitch> vSwitchList;

	public Integer getVSwitchCount() {
		return this.vSwitchCount;
	}

	public void setVSwitchCount(Integer vSwitchCount) {
		this.vSwitchCount = vSwitchCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<VSwitch> getVSwitchList() {
		return this.vSwitchList;
	}

	public void setVSwitchList(List<VSwitch> vSwitchList) {
		this.vSwitchList = vSwitchList;
	}

	public static class VSwitch {

		private String vpcId;

		private Integer maxAgentCount;

		private Long availableIpAddressCount;

		private String vSwitchId;

		private String vSwitchName;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public Integer getMaxAgentCount() {
			return this.maxAgentCount;
		}

		public void setMaxAgentCount(Integer maxAgentCount) {
			this.maxAgentCount = maxAgentCount;
		}

		public Long getAvailableIpAddressCount() {
			return this.availableIpAddressCount;
		}

		public void setAvailableIpAddressCount(Long availableIpAddressCount) {
			this.availableIpAddressCount = availableIpAddressCount;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getVSwitchName() {
			return this.vSwitchName;
		}

		public void setVSwitchName(String vSwitchName) {
			this.vSwitchName = vSwitchName;
		}
	}

	@Override
	public GetUserVpcVSwitchResponse getInstance(UnmarshallerContext context) {
		return	GetUserVpcVSwitchResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
