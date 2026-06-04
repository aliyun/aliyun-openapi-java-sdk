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

package com.aliyuncs.websitebuild.model.v20250429;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.websitebuild.transform.v20250429.GetAppPublishStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAppPublishStatusResponse extends AcsResponse {

	private String requestId;

	private String dynamicCode;

	private String dynamicMessage;

	private Boolean synchro;

	private String accessDeniedDetail;

	private String rootErrorMsg;

	private String rootErrorCode;

	private Boolean allowRetry;

	private String appName;

	private List<String> errorArgs;

	private Module module;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Boolean getSynchro() {
		return this.synchro;
	}

	public void setSynchro(Boolean synchro) {
		this.synchro = synchro;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getRootErrorMsg() {
		return this.rootErrorMsg;
	}

	public void setRootErrorMsg(String rootErrorMsg) {
		this.rootErrorMsg = rootErrorMsg;
	}

	public String getRootErrorCode() {
		return this.rootErrorCode;
	}

	public void setRootErrorCode(String rootErrorCode) {
		this.rootErrorCode = rootErrorCode;
	}

	public Boolean getAllowRetry() {
		return this.allowRetry;
	}

	public void setAllowRetry(Boolean allowRetry) {
		this.allowRetry = allowRetry;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public List<String> getErrorArgs() {
		return this.errorArgs;
	}

	public void setErrorArgs(List<String> errorArgs) {
		this.errorArgs = errorArgs;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private Boolean isFinish;

		private Boolean isSuccess;

		private String msg;

		private Integer percent;

		private Long publishOrderId;

		private String currentStep;

		private String orderType;

		private String publishNumber;

		private String publishTime;

		private String description;

		private String errorStep;

		private String siteId;

		private String deployChannel;

		private String canQuickRevert;

		private List<String> steps;

		public Boolean getIsFinish() {
			return this.isFinish;
		}

		public void setIsFinish(Boolean isFinish) {
			this.isFinish = isFinish;
		}

		public Boolean getIsSuccess() {
			return this.isSuccess;
		}

		public void setIsSuccess(Boolean isSuccess) {
			this.isSuccess = isSuccess;
		}

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public Integer getPercent() {
			return this.percent;
		}

		public void setPercent(Integer percent) {
			this.percent = percent;
		}

		public Long getPublishOrderId() {
			return this.publishOrderId;
		}

		public void setPublishOrderId(Long publishOrderId) {
			this.publishOrderId = publishOrderId;
		}

		public String getCurrentStep() {
			return this.currentStep;
		}

		public void setCurrentStep(String currentStep) {
			this.currentStep = currentStep;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public String getPublishNumber() {
			return this.publishNumber;
		}

		public void setPublishNumber(String publishNumber) {
			this.publishNumber = publishNumber;
		}

		public String getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(String publishTime) {
			this.publishTime = publishTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getErrorStep() {
			return this.errorStep;
		}

		public void setErrorStep(String errorStep) {
			this.errorStep = errorStep;
		}

		public String getSiteId() {
			return this.siteId;
		}

		public void setSiteId(String siteId) {
			this.siteId = siteId;
		}

		public String getDeployChannel() {
			return this.deployChannel;
		}

		public void setDeployChannel(String deployChannel) {
			this.deployChannel = deployChannel;
		}

		public String getCanQuickRevert() {
			return this.canQuickRevert;
		}

		public void setCanQuickRevert(String canQuickRevert) {
			this.canQuickRevert = canQuickRevert;
		}

		public List<String> getSteps() {
			return this.steps;
		}

		public void setSteps(List<String> steps) {
			this.steps = steps;
		}
	}

	@Override
	public GetAppPublishStatusResponse getInstance(UnmarshallerContext context) {
		return	GetAppPublishStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
