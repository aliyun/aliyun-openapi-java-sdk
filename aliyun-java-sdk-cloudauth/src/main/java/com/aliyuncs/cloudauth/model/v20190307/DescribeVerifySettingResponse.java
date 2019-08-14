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

package com.aliyuncs.cloudauth.model.v20190307;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20190307.DescribeVerifySettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVerifySettingResponse extends AcsResponse {

	private String requestId;

	private List<VerifySetting> verifySettingList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VerifySetting> getVerifySettingList() {
		return this.verifySettingList;
	}

	public void setVerifySettingList(List<VerifySetting> verifySettingList) {
		this.verifySettingList = verifySettingList;
	}

	public static class VerifySetting {

		private String bizType;

		private String bizName;

		private String solution;

		private List<String> stepList;

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getBizName() {
			return this.bizName;
		}

		public void setBizName(String bizName) {
			this.bizName = bizName;
		}

		public String getSolution() {
			return this.solution;
		}

		public void setSolution(String solution) {
			this.solution = solution;
		}

		public List<String> getStepList() {
			return this.stepList;
		}

		public void setStepList(List<String> stepList) {
			this.stepList = stepList;
		}
	}

	@Override
	public DescribeVerifySettingResponse getInstance(UnmarshallerContext context) {
		return	DescribeVerifySettingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
