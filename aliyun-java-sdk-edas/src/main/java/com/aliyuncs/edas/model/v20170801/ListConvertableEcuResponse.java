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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListConvertableEcuResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListConvertableEcuResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<Instance> instanceList;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Instance> getInstanceList() {
		return this.instanceList;
	}

	public void setInstanceList(List<Instance> instanceList) {
		this.instanceList = instanceList;
	}

	public static class Instance {

		private String vpcId;

		private String status;

		private String privateIp;

		private Boolean expired;

		private String instanceId;

		private Integer mem;

		private String regionId;

		private String vpcName;

		private String ecuId;

		private Integer cpu;

		private String innerIp;

		private String eip;

		private String instanceName;

		private String publicIp;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPrivateIp() {
			return this.privateIp;
		}

		public void setPrivateIp(String privateIp) {
			this.privateIp = privateIp;
		}

		public Boolean getExpired() {
			return this.expired;
		}

		public void setExpired(Boolean expired) {
			this.expired = expired;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getMem() {
			return this.mem;
		}

		public void setMem(Integer mem) {
			this.mem = mem;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVpcName() {
			return this.vpcName;
		}

		public void setVpcName(String vpcName) {
			this.vpcName = vpcName;
		}

		public String getEcuId() {
			return this.ecuId;
		}

		public void setEcuId(String ecuId) {
			this.ecuId = ecuId;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public String getInnerIp() {
			return this.innerIp;
		}

		public void setInnerIp(String innerIp) {
			this.innerIp = innerIp;
		}

		public String getEip() {
			return this.eip;
		}

		public void setEip(String eip) {
			this.eip = eip;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getPublicIp() {
			return this.publicIp;
		}

		public void setPublicIp(String publicIp) {
			this.publicIp = publicIp;
		}
	}

	@Override
	public ListConvertableEcuResponse getInstance(UnmarshallerContext context) {
		return	ListConvertableEcuResponseUnmarshaller.unmarshall(this, context);
	}
}
