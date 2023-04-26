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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeTransitionVSwitchesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTransitionVSwitchesResponse extends AcsResponse {

	private String code;

	private String requestId;

	private Boolean success;

	private List<Model> vSwitchModels;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Model> getVSwitchModels() {
		return this.vSwitchModels;
	}

	public void setVSwitchModels(List<Model> vSwitchModels) {
		this.vSwitchModels = vSwitchModels;
	}

	public static class Model {

		private String vpcId;

		private String vSwitchId;

		private String description;

		private String cIDR;

		private String name;

		private String izNo;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCIDR() {
			return this.cIDR;
		}

		public void setCIDR(String cIDR) {
			this.cIDR = cIDR;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}
	}

	@Override
	public DescribeTransitionVSwitchesResponse getInstance(UnmarshallerContext context) {
		return	DescribeTransitionVSwitchesResponseUnmarshaller.unmarshall(this, context);
	}
}
