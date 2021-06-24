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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryRebootInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryRebootInfoResponse extends AcsResponse {

	private String requestId;

	private List<CheckPoint> checkPoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CheckPoint> getCheckPoints() {
		return this.checkPoints;
	}

	public void setCheckPoints(List<CheckPoint> checkPoints) {
		this.checkPoints = checkPoints;
	}

	public static class CheckPoint {

		private Boolean systemPerform;

		private Boolean userPerform;

		private String scriptionId;

		private String restartDate;

		private String aliUid;

		private String instanceId;

		private String gmtModified;

		private String gmtCreated;

		private String requestId;

		private String expectedTime;

		private String isDeleted;

		private String mark;

		private String upgradeDate;

		private String id;

		private String orderId;

		private String productCode;

		public Boolean getSystemPerform() {
			return this.systemPerform;
		}

		public void setSystemPerform(Boolean systemPerform) {
			this.systemPerform = systemPerform;
		}

		public Boolean getUserPerform() {
			return this.userPerform;
		}

		public void setUserPerform(Boolean userPerform) {
			this.userPerform = userPerform;
		}

		public String getScriptionId() {
			return this.scriptionId;
		}

		public void setScriptionId(String scriptionId) {
			this.scriptionId = scriptionId;
		}

		public String getRestartDate() {
			return this.restartDate;
		}

		public void setRestartDate(String restartDate) {
			this.restartDate = restartDate;
		}

		public String getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(String aliUid) {
			this.aliUid = aliUid;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getExpectedTime() {
			return this.expectedTime;
		}

		public void setExpectedTime(String expectedTime) {
			this.expectedTime = expectedTime;
		}

		public String getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(String isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String getMark() {
			return this.mark;
		}

		public void setMark(String mark) {
			this.mark = mark;
		}

		public String getUpgradeDate() {
			return this.upgradeDate;
		}

		public void setUpgradeDate(String upgradeDate) {
			this.upgradeDate = upgradeDate;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
	}

	@Override
	public OpsQueryRebootInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryRebootInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
