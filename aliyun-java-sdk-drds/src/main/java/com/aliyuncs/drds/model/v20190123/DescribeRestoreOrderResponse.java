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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeRestoreOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRestoreOrderResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private RestoreOrderDO restoreOrderDO;

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

	public RestoreOrderDO getRestoreOrderDO() {
		return this.restoreOrderDO;
	}

	public void setRestoreOrderDO(RestoreOrderDO restoreOrderDO) {
		this.restoreOrderDO = restoreOrderDO;
	}

	public static class RestoreOrderDO {

		private List<DrdsOrderDOListItem> drdsOrderDOList;

		private List<RdsOrderDOListItem> rdsOrderDOList;

		private List<PolarOrderDOListItem> polarOrderDOList;

		public List<DrdsOrderDOListItem> getDrdsOrderDOList() {
			return this.drdsOrderDOList;
		}

		public void setDrdsOrderDOList(List<DrdsOrderDOListItem> drdsOrderDOList) {
			this.drdsOrderDOList = drdsOrderDOList;
		}

		public List<RdsOrderDOListItem> getRdsOrderDOList() {
			return this.rdsOrderDOList;
		}

		public void setRdsOrderDOList(List<RdsOrderDOListItem> rdsOrderDOList) {
			this.rdsOrderDOList = rdsOrderDOList;
		}

		public List<PolarOrderDOListItem> getPolarOrderDOList() {
			return this.polarOrderDOList;
		}

		public void setPolarOrderDOList(List<PolarOrderDOListItem> polarOrderDOList) {
			this.polarOrderDOList = polarOrderDOList;
		}

		public static class DrdsOrderDOListItem {

			private String vpcId;

			private String network;

			private String vSwtichId;

			private String instSpec;

			private String azoneId;

			private String regionId;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getNetwork() {
				return this.network;
			}

			public void setNetwork(String network) {
				this.network = network;
			}

			public String getVSwtichId() {
				return this.vSwtichId;
			}

			public void setVSwtichId(String vSwtichId) {
				this.vSwtichId = vSwtichId;
			}

			public String getInstSpec() {
				return this.instSpec;
			}

			public void setInstSpec(String instSpec) {
				this.instSpec = instSpec;
			}

			public String getAzoneId() {
				return this.azoneId;
			}

			public void setAzoneId(String azoneId) {
				this.azoneId = azoneId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}

		public static class RdsOrderDOListItem {

			private String network;

			private String version;

			private String instanceClass;

			private String dbInstanceStorage;

			private Long num;

			private String engine;

			private String azoneId;

			private String regionId;

			public String getNetwork() {
				return this.network;
			}

			public void setNetwork(String network) {
				this.network = network;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getInstanceClass() {
				return this.instanceClass;
			}

			public void setInstanceClass(String instanceClass) {
				this.instanceClass = instanceClass;
			}

			public String getDbInstanceStorage() {
				return this.dbInstanceStorage;
			}

			public void setDbInstanceStorage(String dbInstanceStorage) {
				this.dbInstanceStorage = dbInstanceStorage;
			}

			public Long getNum() {
				return this.num;
			}

			public void setNum(Long num) {
				this.num = num;
			}

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public String getAzoneId() {
				return this.azoneId;
			}

			public void setAzoneId(String azoneId) {
				this.azoneId = azoneId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}

		public static class PolarOrderDOListItem {

			private String network;

			private String version;

			private String instanceClass;

			private String dbInstanceStorage;

			private Long num;

			private String engine;

			private String azoneId;

			private String regionId;

			public String getNetwork() {
				return this.network;
			}

			public void setNetwork(String network) {
				this.network = network;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getInstanceClass() {
				return this.instanceClass;
			}

			public void setInstanceClass(String instanceClass) {
				this.instanceClass = instanceClass;
			}

			public String getDbInstanceStorage() {
				return this.dbInstanceStorage;
			}

			public void setDbInstanceStorage(String dbInstanceStorage) {
				this.dbInstanceStorage = dbInstanceStorage;
			}

			public Long getNum() {
				return this.num;
			}

			public void setNum(Long num) {
				this.num = num;
			}

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public String getAzoneId() {
				return this.azoneId;
			}

			public void setAzoneId(String azoneId) {
				this.azoneId = azoneId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}
	}

	@Override
	public DescribeRestoreOrderResponse getInstance(UnmarshallerContext context) {
		return	DescribeRestoreOrderResponseUnmarshaller.unmarshall(this, context);
	}
}
