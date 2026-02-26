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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.ListFeatureConsistencyCheckJobConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFeatureConsistencyCheckJobConfigsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<FeatureConsistencyCheckConfigsItem> featureConsistencyCheckConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<FeatureConsistencyCheckConfigsItem> getFeatureConsistencyCheckConfigs() {
		return this.featureConsistencyCheckConfigs;
	}

	public void setFeatureConsistencyCheckConfigs(List<FeatureConsistencyCheckConfigsItem> featureConsistencyCheckConfigs) {
		this.featureConsistencyCheckConfigs = featureConsistencyCheckConfigs;
	}

	public static class FeatureConsistencyCheckConfigsItem {

		private String featureConsistencyCheckJobConfigId;

		private String name;

		private String sceneId;

		private String sceneName;

		private String status;

		private Boolean compareFeature;

		private String latestJobId;

		private String latestJobGmtSamplingStartTime;

		private String latestJobGmtSamplingEndTime;

		private String sampleRate;

		private String featureLandingResourceId;

		private String featureLandingResourceUri;

		private String easServiceName;

		private String fgJsonFileName;

		private String userTable;

		private String userIdField;

		private String userTablePartitionField;

		private String userTablePartitionFieldFormat;

		private String itemTable;

		private String itemIdField;

		private String itemTablePartitionField;

		private String itemTablePartitionFieldFormat;

		private Boolean generateZip;

		private String serviceId;

		private String serviceName;

		private String workflowName;

		private String ossResourceId;

		private String ossBucket;

		private String easyRecVersion;

		private String easyRecPackagePath;

		private String fgJarVersion;

		private String featurePriority;

		private String featureDisplayExclude;

		private String gmtCreateTime;

		private String gmtModifiedTime;

		private String useFeatureStore;

		private String featureStoreProjectName;

		private String featureStoreModelId;

		private String featureStoreUserId;

		private String featureStoreItemId;

		private String featureStoreSeqFeatureView;

		private String featureStoreProjectId;

		public String getFeatureConsistencyCheckJobConfigId() {
			return this.featureConsistencyCheckJobConfigId;
		}

		public void setFeatureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
			this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSceneId() {
			return this.sceneId;
		}

		public void setSceneId(String sceneId) {
			this.sceneId = sceneId;
		}

		public String getSceneName() {
			return this.sceneName;
		}

		public void setSceneName(String sceneName) {
			this.sceneName = sceneName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getCompareFeature() {
			return this.compareFeature;
		}

		public void setCompareFeature(Boolean compareFeature) {
			this.compareFeature = compareFeature;
		}

		public String getLatestJobId() {
			return this.latestJobId;
		}

		public void setLatestJobId(String latestJobId) {
			this.latestJobId = latestJobId;
		}

		public String getLatestJobGmtSamplingStartTime() {
			return this.latestJobGmtSamplingStartTime;
		}

		public void setLatestJobGmtSamplingStartTime(String latestJobGmtSamplingStartTime) {
			this.latestJobGmtSamplingStartTime = latestJobGmtSamplingStartTime;
		}

		public String getLatestJobGmtSamplingEndTime() {
			return this.latestJobGmtSamplingEndTime;
		}

		public void setLatestJobGmtSamplingEndTime(String latestJobGmtSamplingEndTime) {
			this.latestJobGmtSamplingEndTime = latestJobGmtSamplingEndTime;
		}

		public String getSampleRate() {
			return this.sampleRate;
		}

		public void setSampleRate(String sampleRate) {
			this.sampleRate = sampleRate;
		}

		public String getFeatureLandingResourceId() {
			return this.featureLandingResourceId;
		}

		public void setFeatureLandingResourceId(String featureLandingResourceId) {
			this.featureLandingResourceId = featureLandingResourceId;
		}

		public String getFeatureLandingResourceUri() {
			return this.featureLandingResourceUri;
		}

		public void setFeatureLandingResourceUri(String featureLandingResourceUri) {
			this.featureLandingResourceUri = featureLandingResourceUri;
		}

		public String getEasServiceName() {
			return this.easServiceName;
		}

		public void setEasServiceName(String easServiceName) {
			this.easServiceName = easServiceName;
		}

		public String getFgJsonFileName() {
			return this.fgJsonFileName;
		}

		public void setFgJsonFileName(String fgJsonFileName) {
			this.fgJsonFileName = fgJsonFileName;
		}

		public String getUserTable() {
			return this.userTable;
		}

		public void setUserTable(String userTable) {
			this.userTable = userTable;
		}

		public String getUserIdField() {
			return this.userIdField;
		}

		public void setUserIdField(String userIdField) {
			this.userIdField = userIdField;
		}

		public String getUserTablePartitionField() {
			return this.userTablePartitionField;
		}

		public void setUserTablePartitionField(String userTablePartitionField) {
			this.userTablePartitionField = userTablePartitionField;
		}

		public String getUserTablePartitionFieldFormat() {
			return this.userTablePartitionFieldFormat;
		}

		public void setUserTablePartitionFieldFormat(String userTablePartitionFieldFormat) {
			this.userTablePartitionFieldFormat = userTablePartitionFieldFormat;
		}

		public String getItemTable() {
			return this.itemTable;
		}

		public void setItemTable(String itemTable) {
			this.itemTable = itemTable;
		}

		public String getItemIdField() {
			return this.itemIdField;
		}

		public void setItemIdField(String itemIdField) {
			this.itemIdField = itemIdField;
		}

		public String getItemTablePartitionField() {
			return this.itemTablePartitionField;
		}

		public void setItemTablePartitionField(String itemTablePartitionField) {
			this.itemTablePartitionField = itemTablePartitionField;
		}

		public String getItemTablePartitionFieldFormat() {
			return this.itemTablePartitionFieldFormat;
		}

		public void setItemTablePartitionFieldFormat(String itemTablePartitionFieldFormat) {
			this.itemTablePartitionFieldFormat = itemTablePartitionFieldFormat;
		}

		public Boolean getGenerateZip() {
			return this.generateZip;
		}

		public void setGenerateZip(Boolean generateZip) {
			this.generateZip = generateZip;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getWorkflowName() {
			return this.workflowName;
		}

		public void setWorkflowName(String workflowName) {
			this.workflowName = workflowName;
		}

		public String getOssResourceId() {
			return this.ossResourceId;
		}

		public void setOssResourceId(String ossResourceId) {
			this.ossResourceId = ossResourceId;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public String getEasyRecVersion() {
			return this.easyRecVersion;
		}

		public void setEasyRecVersion(String easyRecVersion) {
			this.easyRecVersion = easyRecVersion;
		}

		public String getEasyRecPackagePath() {
			return this.easyRecPackagePath;
		}

		public void setEasyRecPackagePath(String easyRecPackagePath) {
			this.easyRecPackagePath = easyRecPackagePath;
		}

		public String getFgJarVersion() {
			return this.fgJarVersion;
		}

		public void setFgJarVersion(String fgJarVersion) {
			this.fgJarVersion = fgJarVersion;
		}

		public String getFeaturePriority() {
			return this.featurePriority;
		}

		public void setFeaturePriority(String featurePriority) {
			this.featurePriority = featurePriority;
		}

		public String getFeatureDisplayExclude() {
			return this.featureDisplayExclude;
		}

		public void setFeatureDisplayExclude(String featureDisplayExclude) {
			this.featureDisplayExclude = featureDisplayExclude;
		}

		public String getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(String gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}

		public String getGmtModifiedTime() {
			return this.gmtModifiedTime;
		}

		public void setGmtModifiedTime(String gmtModifiedTime) {
			this.gmtModifiedTime = gmtModifiedTime;
		}

		public String getUseFeatureStore() {
			return this.useFeatureStore;
		}

		public void setUseFeatureStore(String useFeatureStore) {
			this.useFeatureStore = useFeatureStore;
		}

		public String getFeatureStoreProjectName() {
			return this.featureStoreProjectName;
		}

		public void setFeatureStoreProjectName(String featureStoreProjectName) {
			this.featureStoreProjectName = featureStoreProjectName;
		}

		public String getFeatureStoreModelId() {
			return this.featureStoreModelId;
		}

		public void setFeatureStoreModelId(String featureStoreModelId) {
			this.featureStoreModelId = featureStoreModelId;
		}

		public String getFeatureStoreUserId() {
			return this.featureStoreUserId;
		}

		public void setFeatureStoreUserId(String featureStoreUserId) {
			this.featureStoreUserId = featureStoreUserId;
		}

		public String getFeatureStoreItemId() {
			return this.featureStoreItemId;
		}

		public void setFeatureStoreItemId(String featureStoreItemId) {
			this.featureStoreItemId = featureStoreItemId;
		}

		public String getFeatureStoreSeqFeatureView() {
			return this.featureStoreSeqFeatureView;
		}

		public void setFeatureStoreSeqFeatureView(String featureStoreSeqFeatureView) {
			this.featureStoreSeqFeatureView = featureStoreSeqFeatureView;
		}

		public String getFeatureStoreProjectId() {
			return this.featureStoreProjectId;
		}

		public void setFeatureStoreProjectId(String featureStoreProjectId) {
			this.featureStoreProjectId = featureStoreProjectId;
		}
	}

	@Override
	public ListFeatureConsistencyCheckJobConfigsResponse getInstance(UnmarshallerContext context) {
		return	ListFeatureConsistencyCheckJobConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
