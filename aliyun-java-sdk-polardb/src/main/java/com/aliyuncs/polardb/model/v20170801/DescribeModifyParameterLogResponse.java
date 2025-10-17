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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeModifyParameterLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeModifyParameterLogResponse extends AcsResponse {

	private String requestId;

	private String engine;

	private String engineVersion;

	private List<ParameterChangeLog> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}

	public List<ParameterChangeLog> getItems() {
		return this.items;
	}

	public void setItems(List<ParameterChangeLog> items) {
		this.items = items;
	}

	public static class ParameterChangeLog {

		private String status;

		private String oldParameterValue;

		private String parameterName;

		private String newParameterValue;

		private String modifyTime;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOldParameterValue() {
			return this.oldParameterValue;
		}

		public void setOldParameterValue(String oldParameterValue) {
			this.oldParameterValue = oldParameterValue;
		}

		public String getParameterName() {
			return this.parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		public String getNewParameterValue() {
			return this.newParameterValue;
		}

		public void setNewParameterValue(String newParameterValue) {
			this.newParameterValue = newParameterValue;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public DescribeModifyParameterLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeModifyParameterLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
