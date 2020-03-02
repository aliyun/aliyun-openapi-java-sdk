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

package com.aliyuncs.alikafka.model.v20190916;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alikafka.transform.v20190916.GetAllowedIpListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAllowedIpListResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Integer code;

	private String message;

	private AllowedList allowedList;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AllowedList getAllowedList() {
		return this.allowedList;
	}

	public void setAllowedList(AllowedList allowedList) {
		this.allowedList = allowedList;
	}

	public static class AllowedList {

		private Integer deployType;

		private List<IPListVO> vpcList;

		private List<IPListVO> internetList;

		public Integer getDeployType() {
			return this.deployType;
		}

		public void setDeployType(Integer deployType) {
			this.deployType = deployType;
		}

		public List<IPListVO> getVpcList() {
			return this.vpcList;
		}

		public void setVpcList(List<IPListVO> vpcList) {
			this.vpcList = vpcList;
		}

		public List<IPListVO> getInternetList() {
			return this.internetList;
		}

		public void setInternetList(List<IPListVO> internetList) {
			this.internetList = internetList;
		}

		public static class IPListVO {

			private String portRange;

			private List<String> allowedIpList;

			public String getPortRange() {
				return this.portRange;
			}

			public void setPortRange(String portRange) {
				this.portRange = portRange;
			}

			public List<String> getAllowedIpList() {
				return this.allowedIpList;
			}

			public void setAllowedIpList(List<String> allowedIpList) {
				this.allowedIpList = allowedIpList;
			}
		}
	}

	@Override
	public GetAllowedIpListResponse getInstance(UnmarshallerContext context) {
		return	GetAllowedIpListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
