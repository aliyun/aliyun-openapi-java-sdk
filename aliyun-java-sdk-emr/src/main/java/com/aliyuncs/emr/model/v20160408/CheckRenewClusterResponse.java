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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.CheckRenewClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckRenewClusterResponse extends AcsResponse {

	private String requestId;

	private String clusterId;

	private List<RenewEcsDO> renewEcsDOList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public List<RenewEcsDO> getRenewEcsDOList() {
		return this.renewEcsDOList;
	}

	public void setRenewEcsDOList(List<RenewEcsDO> renewEcsDOList) {
		this.renewEcsDOList = renewEcsDOList;
	}

	public static class RenewEcsDO {

		private String ecsId;

		private String ecsExpiredTime;

		private String emrExpiredTime;

		private String ecsAutoRenew;

		private String emrAutoRenew;

		private Integer ecsAutoRenewDuration;

		private Integer emrAutoRenewDuration;

		private String hostGroupId;

		private String hostGroupType;

		public String getEcsId() {
			return this.ecsId;
		}

		public void setEcsId(String ecsId) {
			this.ecsId = ecsId;
		}

		public String getEcsExpiredTime() {
			return this.ecsExpiredTime;
		}

		public void setEcsExpiredTime(String ecsExpiredTime) {
			this.ecsExpiredTime = ecsExpiredTime;
		}

		public String getEmrExpiredTime() {
			return this.emrExpiredTime;
		}

		public void setEmrExpiredTime(String emrExpiredTime) {
			this.emrExpiredTime = emrExpiredTime;
		}

		public String getEcsAutoRenew() {
			return this.ecsAutoRenew;
		}

		public void setEcsAutoRenew(String ecsAutoRenew) {
			this.ecsAutoRenew = ecsAutoRenew;
		}

		public String getEmrAutoRenew() {
			return this.emrAutoRenew;
		}

		public void setEmrAutoRenew(String emrAutoRenew) {
			this.emrAutoRenew = emrAutoRenew;
		}

		public Integer getEcsAutoRenewDuration() {
			return this.ecsAutoRenewDuration;
		}

		public void setEcsAutoRenewDuration(Integer ecsAutoRenewDuration) {
			this.ecsAutoRenewDuration = ecsAutoRenewDuration;
		}

		public Integer getEmrAutoRenewDuration() {
			return this.emrAutoRenewDuration;
		}

		public void setEmrAutoRenewDuration(Integer emrAutoRenewDuration) {
			this.emrAutoRenewDuration = emrAutoRenewDuration;
		}

		public String getHostGroupId() {
			return this.hostGroupId;
		}

		public void setHostGroupId(String hostGroupId) {
			this.hostGroupId = hostGroupId;
		}

		public String getHostGroupType() {
			return this.hostGroupType;
		}

		public void setHostGroupType(String hostGroupType) {
			this.hostGroupType = hostGroupType;
		}
	}

	@Override
	public CheckRenewClusterResponse getInstance(UnmarshallerContext context) {
		return	CheckRenewClusterResponseUnmarshaller.unmarshall(this, context);
	}
}
