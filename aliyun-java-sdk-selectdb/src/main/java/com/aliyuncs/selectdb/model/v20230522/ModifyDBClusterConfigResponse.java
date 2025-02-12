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

package com.aliyuncs.selectdb.model.v20230522;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.selectdb.transform.v20230522.ModifyDBClusterConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBClusterConfigResponse extends AcsResponse {

	private String dynamicCode;

	private String dynamicMessage;

	private String accessDeniedDetail;

	private String requestId;

	private Data data;

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String dbInstanceName;

		private String dbInstanceId;

		private String dbClusterId;

		private Integer taskId;

		public String getDbInstanceName() {
			return this.dbInstanceName;
		}

		public void setDbInstanceName(String dbInstanceName) {
			this.dbInstanceName = dbInstanceName;
		}

		public String getDbInstanceId() {
			return this.dbInstanceId;
		}

		public void setDbInstanceId(String dbInstanceId) {
			this.dbInstanceId = dbInstanceId;
		}

		public String getDbClusterId() {
			return this.dbClusterId;
		}

		public void setDbClusterId(String dbClusterId) {
			this.dbClusterId = dbClusterId;
		}

		public Integer getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Integer taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public ModifyDBClusterConfigResponse getInstance(UnmarshallerContext context) {
		return	ModifyDBClusterConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
