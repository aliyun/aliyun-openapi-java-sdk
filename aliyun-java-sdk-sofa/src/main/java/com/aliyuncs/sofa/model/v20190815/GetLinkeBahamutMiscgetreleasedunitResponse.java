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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetLinkeBahamutMiscgetreleasedunitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutMiscgetreleasedunitResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMsgParamsMap() {
		return this.errorMsgParamsMap;
	}

	public void setErrorMsgParamsMap(String errorMsgParamsMap) {
		this.errorMsgParamsMap = errorMsgParamsMap;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String appMeta;

		private Long batchIndex;

		private Boolean beforeSit;

		private Boolean compatible;

		private Long created;

		private Boolean createAfterUseLinkQ;

		private String creatorSysName;

		private String currentStage;

		private String currentStageStep;

		private Boolean deleted;

		private Boolean deletedByIteration;

		private Boolean finished;

		private String from;

		private String fromCommitId;

		private String id;

		private String iteration;

		private Long lastModified;

		private String lastStage;

		private String nextStage;

		private Boolean _private;

		private String prodCode;

		private String prodVersion;

		private Boolean skipReleaseCheck;

		private String tagName;

		private String tenant;

		private String version;

		private Boolean yunyDaily;

		private List<String> createdBy;

		private List<String> jars;

		private List<String> jarHistrories;

		private List<String> members;

		private List<String> stages;

		public String getAppMeta() {
			return this.appMeta;
		}

		public void setAppMeta(String appMeta) {
			this.appMeta = appMeta;
		}

		public Long getBatchIndex() {
			return this.batchIndex;
		}

		public void setBatchIndex(Long batchIndex) {
			this.batchIndex = batchIndex;
		}

		public Boolean getBeforeSit() {
			return this.beforeSit;
		}

		public void setBeforeSit(Boolean beforeSit) {
			this.beforeSit = beforeSit;
		}

		public Boolean getCompatible() {
			return this.compatible;
		}

		public void setCompatible(Boolean compatible) {
			this.compatible = compatible;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public Boolean getCreateAfterUseLinkQ() {
			return this.createAfterUseLinkQ;
		}

		public void setCreateAfterUseLinkQ(Boolean createAfterUseLinkQ) {
			this.createAfterUseLinkQ = createAfterUseLinkQ;
		}

		public String getCreatorSysName() {
			return this.creatorSysName;
		}

		public void setCreatorSysName(String creatorSysName) {
			this.creatorSysName = creatorSysName;
		}

		public String getCurrentStage() {
			return this.currentStage;
		}

		public void setCurrentStage(String currentStage) {
			this.currentStage = currentStage;
		}

		public String getCurrentStageStep() {
			return this.currentStageStep;
		}

		public void setCurrentStageStep(String currentStageStep) {
			this.currentStageStep = currentStageStep;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public Boolean getDeletedByIteration() {
			return this.deletedByIteration;
		}

		public void setDeletedByIteration(Boolean deletedByIteration) {
			this.deletedByIteration = deletedByIteration;
		}

		public Boolean getFinished() {
			return this.finished;
		}

		public void setFinished(Boolean finished) {
			this.finished = finished;
		}

		public String getFrom() {
			return this.from;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public String getFromCommitId() {
			return this.fromCommitId;
		}

		public void setFromCommitId(String fromCommitId) {
			this.fromCommitId = fromCommitId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getIteration() {
			return this.iteration;
		}

		public void setIteration(String iteration) {
			this.iteration = iteration;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public String getLastStage() {
			return this.lastStage;
		}

		public void setLastStage(String lastStage) {
			this.lastStage = lastStage;
		}

		public String getNextStage() {
			return this.nextStage;
		}

		public void setNextStage(String nextStage) {
			this.nextStage = nextStage;
		}

		public Boolean get_Private() {
			return this._private;
		}

		public void set_Private(Boolean _private) {
			this._private = _private;
		}

		public String getProdCode() {
			return this.prodCode;
		}

		public void setProdCode(String prodCode) {
			this.prodCode = prodCode;
		}

		public String getProdVersion() {
			return this.prodVersion;
		}

		public void setProdVersion(String prodVersion) {
			this.prodVersion = prodVersion;
		}

		public Boolean getSkipReleaseCheck() {
			return this.skipReleaseCheck;
		}

		public void setSkipReleaseCheck(Boolean skipReleaseCheck) {
			this.skipReleaseCheck = skipReleaseCheck;
		}

		public String getTagName() {
			return this.tagName;
		}

		public void setTagName(String tagName) {
			this.tagName = tagName;
		}

		public String getTenant() {
			return this.tenant;
		}

		public void setTenant(String tenant) {
			this.tenant = tenant;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Boolean getYunyDaily() {
			return this.yunyDaily;
		}

		public void setYunyDaily(Boolean yunyDaily) {
			this.yunyDaily = yunyDaily;
		}

		public List<String> getCreatedBy() {
			return this.createdBy;
		}

		public void setCreatedBy(List<String> createdBy) {
			this.createdBy = createdBy;
		}

		public List<String> getJars() {
			return this.jars;
		}

		public void setJars(List<String> jars) {
			this.jars = jars;
		}

		public List<String> getJarHistrories() {
			return this.jarHistrories;
		}

		public void setJarHistrories(List<String> jarHistrories) {
			this.jarHistrories = jarHistrories;
		}

		public List<String> getMembers() {
			return this.members;
		}

		public void setMembers(List<String> members) {
			this.members = members;
		}

		public List<String> getStages() {
			return this.stages;
		}

		public void setStages(List<String> stages) {
			this.stages = stages;
		}
	}

	@Override
	public GetLinkeBahamutMiscgetreleasedunitResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeBahamutMiscgetreleasedunitResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
