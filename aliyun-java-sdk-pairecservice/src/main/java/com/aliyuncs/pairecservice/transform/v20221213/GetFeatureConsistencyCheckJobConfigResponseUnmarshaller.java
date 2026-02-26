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

package com.aliyuncs.pairecservice.transform.v20221213;

import com.aliyuncs.pairecservice.model.v20221213.GetFeatureConsistencyCheckJobConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFeatureConsistencyCheckJobConfigResponseUnmarshaller {

	public static GetFeatureConsistencyCheckJobConfigResponse unmarshall(GetFeatureConsistencyCheckJobConfigResponse getFeatureConsistencyCheckJobConfigResponse, UnmarshallerContext _ctx) {
		
		getFeatureConsistencyCheckJobConfigResponse.setRequestId(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.RequestId"));
		getFeatureConsistencyCheckJobConfigResponse.setName(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.Name"));
		getFeatureConsistencyCheckJobConfigResponse.setSceneId(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.SceneId"));
		getFeatureConsistencyCheckJobConfigResponse.setSceneName(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.SceneName"));
		getFeatureConsistencyCheckJobConfigResponse.setStatus(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.Status"));
		getFeatureConsistencyCheckJobConfigResponse.setCompareFeature(_ctx.booleanValue("GetFeatureConsistencyCheckJobConfigResponse.CompareFeature"));
		getFeatureConsistencyCheckJobConfigResponse.setLatestJobId(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.LatestJobId"));
		getFeatureConsistencyCheckJobConfigResponse.setLatestJobGmtSamplingStartTime(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.LatestJobGmtSamplingStartTime"));
		getFeatureConsistencyCheckJobConfigResponse.setLatestJobGmtSamplingEndTime(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.LatestJobGmtSamplingEndTime"));
		getFeatureConsistencyCheckJobConfigResponse.setSampleRate(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.SampleRate"));
		getFeatureConsistencyCheckJobConfigResponse.setFeatureLandingResourceId(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.FeatureLandingResourceId"));
		getFeatureConsistencyCheckJobConfigResponse.setFeatureLandingResourceUri(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.FeatureLandingResourceUri"));
		getFeatureConsistencyCheckJobConfigResponse.setEasServiceName(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.EasServiceName"));
		getFeatureConsistencyCheckJobConfigResponse.setFgJsonFileName(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.FgJsonFileName"));
		getFeatureConsistencyCheckJobConfigResponse.setUserTable(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.UserTable"));
		getFeatureConsistencyCheckJobConfigResponse.setUserIdField(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.UserIdField"));
		getFeatureConsistencyCheckJobConfigResponse.setUserTablePartitionField(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.UserTablePartitionField"));
		getFeatureConsistencyCheckJobConfigResponse.setUserTablePartitionFieldFormat(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.UserTablePartitionFieldFormat"));
		getFeatureConsistencyCheckJobConfigResponse.setItemTable(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.ItemTable"));
		getFeatureConsistencyCheckJobConfigResponse.setItemIdField(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.ItemIdField"));
		getFeatureConsistencyCheckJobConfigResponse.setItemTablePartitionField(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.ItemTablePartitionField"));
		getFeatureConsistencyCheckJobConfigResponse.setItemTablePartitionFieldFormat(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.ItemTablePartitionFieldFormat"));
		getFeatureConsistencyCheckJobConfigResponse.setGenerateZip(_ctx.booleanValue("GetFeatureConsistencyCheckJobConfigResponse.GenerateZip"));
		getFeatureConsistencyCheckJobConfigResponse.setServiceId(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.ServiceId"));
		getFeatureConsistencyCheckJobConfigResponse.setServiceName(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.ServiceName"));
		getFeatureConsistencyCheckJobConfigResponse.setWorkflowName(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.WorkflowName"));
		getFeatureConsistencyCheckJobConfigResponse.setOssResourceId(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.OssResourceId"));
		getFeatureConsistencyCheckJobConfigResponse.setOssBucket(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.OssBucket"));
		getFeatureConsistencyCheckJobConfigResponse.setEasyRecVersion(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.EasyRecVersion"));
		getFeatureConsistencyCheckJobConfigResponse.setEasyRecPackagePath(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.EasyRecPackagePath"));
		getFeatureConsistencyCheckJobConfigResponse.setFgJarVersion(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.FgJarVersion"));
		getFeatureConsistencyCheckJobConfigResponse.setFeaturePriority(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.FeaturePriority"));
		getFeatureConsistencyCheckJobConfigResponse.setFeatureDisplayExclude(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.FeatureDisplayExclude"));
		getFeatureConsistencyCheckJobConfigResponse.setGmtCreateTime(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.GmtCreateTime"));
		getFeatureConsistencyCheckJobConfigResponse.setGmtModifiedTime(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.GmtModifiedTime"));
		getFeatureConsistencyCheckJobConfigResponse.setUseFeatureStore(_ctx.booleanValue("GetFeatureConsistencyCheckJobConfigResponse.UseFeatureStore"));
		getFeatureConsistencyCheckJobConfigResponse.setFeatureStoreProjectName(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.FeatureStoreProjectName"));
		getFeatureConsistencyCheckJobConfigResponse.setFeatureStoreModelId(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.FeatureStoreModelId"));
		getFeatureConsistencyCheckJobConfigResponse.setFeatureStoreUserId(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.FeatureStoreUserId"));
		getFeatureConsistencyCheckJobConfigResponse.setFeatureStoreItemId(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.FeatureStoreItemId"));
		getFeatureConsistencyCheckJobConfigResponse.setFeatureStoreSeqFeatureView(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.FeatureStoreSeqFeatureView"));
		getFeatureConsistencyCheckJobConfigResponse.setFeatureStoreProjectId(_ctx.stringValue("GetFeatureConsistencyCheckJobConfigResponse.FeatureStoreProjectId"));
	 
	 	return getFeatureConsistencyCheckJobConfigResponse;
	}
}