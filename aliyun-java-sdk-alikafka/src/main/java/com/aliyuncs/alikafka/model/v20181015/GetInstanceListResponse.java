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

package com.aliyuncs.alikafka.model.v20181015;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alikafka.transform.v20181015.GetInstanceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceListResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Integer code;

	private String message;

	private List<InstanceVO> instanceList;

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

	public List<InstanceVO> getInstanceList() {
		return this.instanceList;
	}

	public void setInstanceList(List<InstanceVO> instanceList) {
		this.instanceList = instanceList;
	}

	public static class InstanceVO {

		private String instanceId;

		private String regionId;

		private Integer serviceStatus;

		private String vpcId;

		private String vSwitchId;

		private String endPoint;

		private Long createTime;

		private Long expiredTime;

		private Integer deployType;

		private String sslEndPoint;

		private String name;

		private List<UpgradeServiceDetailInfoVO> upgradeServiceDetailInfo;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getServiceStatus() {
			return this.serviceStatus;
		}

		public void setServiceStatus(Integer serviceStatus) {
			this.serviceStatus = serviceStatus;
		}

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

		public String getEndPoint() {
			return this.endPoint;
		}

		public void setEndPoint(String endPoint) {
			this.endPoint = endPoint;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(Long expiredTime) {
			this.expiredTime = expiredTime;
		}

		public Integer getDeployType() {
			return this.deployType;
		}

		public void setDeployType(Integer deployType) {
			this.deployType = deployType;
		}

		public String getSslEndPoint() {
			return this.sslEndPoint;
		}

		public void setSslEndPoint(String sslEndPoint) {
			this.sslEndPoint = sslEndPoint;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<UpgradeServiceDetailInfoVO> getUpgradeServiceDetailInfo() {
			return this.upgradeServiceDetailInfo;
		}

		public void setUpgradeServiceDetailInfo(List<UpgradeServiceDetailInfoVO> upgradeServiceDetailInfo) {
			this.upgradeServiceDetailInfo = upgradeServiceDetailInfo;
		}

		public static class UpgradeServiceDetailInfoVO {

			private String current2OpenSourceVersion;

			public String getCurrent2OpenSourceVersion() {
				return this.current2OpenSourceVersion;
			}

			public void setCurrent2OpenSourceVersion(String current2OpenSourceVersion) {
				this.current2OpenSourceVersion = current2OpenSourceVersion;
			}
		}
	}

	@Override
	public GetInstanceListResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceListResponseUnmarshaller.unmarshall(this, context);
	}
}
