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

package com.aliyuncs.airec.model.v20201126;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.CreateRankingModelTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateRankingModelTemplateResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String status;

		private Long versionNum;

		private String templateId;

		private Meta meta;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getVersionNum() {
			return this.versionNum;
		}

		public void setVersionNum(Long versionNum) {
			this.versionNum = versionNum;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public Meta getMeta() {
			return this.meta;
		}

		public void setMeta(Meta meta) {
			this.meta = meta;
		}

		public static class Meta {

			private Boolean authorized;

			private Boolean autoRun;

			private Long autoRunTime;

			private String autoRunType;

			private String conf;

			private String lastEditTime;

			private String ossArn;

			private String ossBucket;

			private String ossEndpoint;

			private String sampleId;

			private String sampleName;

			private Long sampleTimeWindow;

			private String sampleTimeWindowType;

			private String type;

			private String name;

			private String deployStatus;

			private Boolean canDeploy;

			public Boolean getAuthorized() {
				return this.authorized;
			}

			public void setAuthorized(Boolean authorized) {
				this.authorized = authorized;
			}

			public Boolean getAutoRun() {
				return this.autoRun;
			}

			public void setAutoRun(Boolean autoRun) {
				this.autoRun = autoRun;
			}

			public Long getAutoRunTime() {
				return this.autoRunTime;
			}

			public void setAutoRunTime(Long autoRunTime) {
				this.autoRunTime = autoRunTime;
			}

			public String getAutoRunType() {
				return this.autoRunType;
			}

			public void setAutoRunType(String autoRunType) {
				this.autoRunType = autoRunType;
			}

			public String getConf() {
				return this.conf;
			}

			public void setConf(String conf) {
				this.conf = conf;
			}

			public String getLastEditTime() {
				return this.lastEditTime;
			}

			public void setLastEditTime(String lastEditTime) {
				this.lastEditTime = lastEditTime;
			}

			public String getOssArn() {
				return this.ossArn;
			}

			public void setOssArn(String ossArn) {
				this.ossArn = ossArn;
			}

			public String getOssBucket() {
				return this.ossBucket;
			}

			public void setOssBucket(String ossBucket) {
				this.ossBucket = ossBucket;
			}

			public String getOssEndpoint() {
				return this.ossEndpoint;
			}

			public void setOssEndpoint(String ossEndpoint) {
				this.ossEndpoint = ossEndpoint;
			}

			public String getSampleId() {
				return this.sampleId;
			}

			public void setSampleId(String sampleId) {
				this.sampleId = sampleId;
			}

			public String getSampleName() {
				return this.sampleName;
			}

			public void setSampleName(String sampleName) {
				this.sampleName = sampleName;
			}

			public Long getSampleTimeWindow() {
				return this.sampleTimeWindow;
			}

			public void setSampleTimeWindow(Long sampleTimeWindow) {
				this.sampleTimeWindow = sampleTimeWindow;
			}

			public String getSampleTimeWindowType() {
				return this.sampleTimeWindowType;
			}

			public void setSampleTimeWindowType(String sampleTimeWindowType) {
				this.sampleTimeWindowType = sampleTimeWindowType;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDeployStatus() {
				return this.deployStatus;
			}

			public void setDeployStatus(String deployStatus) {
				this.deployStatus = deployStatus;
			}

			public Boolean getCanDeploy() {
				return this.canDeploy;
			}

			public void setCanDeploy(Boolean canDeploy) {
				this.canDeploy = canDeploy;
			}
		}
	}

	@Override
	public CreateRankingModelTemplateResponse getInstance(UnmarshallerContext context) {
		return	CreateRankingModelTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
