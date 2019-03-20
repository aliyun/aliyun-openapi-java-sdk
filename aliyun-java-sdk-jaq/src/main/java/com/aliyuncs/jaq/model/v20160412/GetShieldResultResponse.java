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

package com.aliyuncs.jaq.model.v20160412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.jaq.transform.v20160412.GetShieldResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetShieldResultResponse extends AcsResponse {

	private Integer errorCode;

	private String errorMsg;

	private Data data;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer taskStatus;

		private List<String> appList;

		private ObfuscateResult obfuscateResult;

		public Integer getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(Integer taskStatus) {
			this.taskStatus = taskStatus;
		}

		public List<String> getAppList() {
			return this.appList;
		}

		public void setAppList(List<String> appList) {
			this.appList = appList;
		}

		public ObfuscateResult getObfuscateResult() {
			return this.obfuscateResult;
		}

		public void setObfuscateResult(ObfuscateResult obfuscateResult) {
			this.obfuscateResult = obfuscateResult;
		}

		public static class ObfuscateResult {

			private Integer obfuscatedClasses;

			private Integer obfuscatedFields;

			private Integer obfuscatedMethods;

			private Integer totalClasses;

			private Integer totalFields;

			private Integer totalMethods;

			private Float obfuscatedPercent;

			public Integer getObfuscatedClasses() {
				return this.obfuscatedClasses;
			}

			public void setObfuscatedClasses(Integer obfuscatedClasses) {
				this.obfuscatedClasses = obfuscatedClasses;
			}

			public Integer getObfuscatedFields() {
				return this.obfuscatedFields;
			}

			public void setObfuscatedFields(Integer obfuscatedFields) {
				this.obfuscatedFields = obfuscatedFields;
			}

			public Integer getObfuscatedMethods() {
				return this.obfuscatedMethods;
			}

			public void setObfuscatedMethods(Integer obfuscatedMethods) {
				this.obfuscatedMethods = obfuscatedMethods;
			}

			public Integer getTotalClasses() {
				return this.totalClasses;
			}

			public void setTotalClasses(Integer totalClasses) {
				this.totalClasses = totalClasses;
			}

			public Integer getTotalFields() {
				return this.totalFields;
			}

			public void setTotalFields(Integer totalFields) {
				this.totalFields = totalFields;
			}

			public Integer getTotalMethods() {
				return this.totalMethods;
			}

			public void setTotalMethods(Integer totalMethods) {
				this.totalMethods = totalMethods;
			}

			public Float getObfuscatedPercent() {
				return this.obfuscatedPercent;
			}

			public void setObfuscatedPercent(Float obfuscatedPercent) {
				this.obfuscatedPercent = obfuscatedPercent;
			}
		}
	}

	@Override
	public GetShieldResultResponse getInstance(UnmarshallerContext context) {
		return	GetShieldResultResponseUnmarshaller.unmarshall(this, context);
	}
}
