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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.ListFeatureConsistencyCheckJobConfigsResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFeatureConsistencyCheckJobConfigsResponseUnmarshaller {

	public static ListFeatureConsistencyCheckJobConfigsResponse unmarshall(ListFeatureConsistencyCheckJobConfigsResponse listFeatureConsistencyCheckJobConfigsResponse, UnmarshallerContext _ctx) {
		
		listFeatureConsistencyCheckJobConfigsResponse.setRequestId(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.RequestId"));
		listFeatureConsistencyCheckJobConfigsResponse.setTotalCount(_ctx.longValue("ListFeatureConsistencyCheckJobConfigsResponse.TotalCount"));

		List<FeatureConsistencyCheckConfigsItem> featureConsistencyCheckConfigs = new ArrayList<FeatureConsistencyCheckConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs.Length"); i++) {
			FeatureConsistencyCheckConfigsItem featureConsistencyCheckConfigsItem = new FeatureConsistencyCheckConfigsItem();
			featureConsistencyCheckConfigsItem.setFeatureConsistencyCheckJobConfigId(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].FeatureConsistencyCheckJobConfigId"));
			featureConsistencyCheckConfigsItem.setName(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].Name"));
			featureConsistencyCheckConfigsItem.setSceneId(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].SceneId"));
			featureConsistencyCheckConfigsItem.setSceneName(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].SceneName"));
			featureConsistencyCheckConfigsItem.setStatus(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].Status"));
			featureConsistencyCheckConfigsItem.setCompareFeature(_ctx.booleanValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].CompareFeature"));
			featureConsistencyCheckConfigsItem.setLatestJobId(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].LatestJobId"));
			featureConsistencyCheckConfigsItem.setLatestJobGmtSamplingStartTime(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].LatestJobGmtSamplingStartTime"));
			featureConsistencyCheckConfigsItem.setLatestJobGmtSamplingEndTime(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].LatestJobGmtSamplingEndTime"));
			featureConsistencyCheckConfigsItem.setSampleRate(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].SampleRate"));
			featureConsistencyCheckConfigsItem.setFeatureLandingResourceId(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].FeatureLandingResourceId"));
			featureConsistencyCheckConfigsItem.setFeatureLandingResourceUri(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].FeatureLandingResourceUri"));
			featureConsistencyCheckConfigsItem.setEasServiceName(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].EasServiceName"));
			featureConsistencyCheckConfigsItem.setFgJsonFileName(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].FgJsonFileName"));
			featureConsistencyCheckConfigsItem.setUserTable(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].UserTable"));
			featureConsistencyCheckConfigsItem.setUserIdField(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].UserIdField"));
			featureConsistencyCheckConfigsItem.setUserTablePartitionField(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].UserTablePartitionField"));
			featureConsistencyCheckConfigsItem.setUserTablePartitionFieldFormat(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].UserTablePartitionFieldFormat"));
			featureConsistencyCheckConfigsItem.setItemTable(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].ItemTable"));
			featureConsistencyCheckConfigsItem.setItemIdField(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].ItemIdField"));
			featureConsistencyCheckConfigsItem.setItemTablePartitionField(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].ItemTablePartitionField"));
			featureConsistencyCheckConfigsItem.setItemTablePartitionFieldFormat(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].ItemTablePartitionFieldFormat"));
			featureConsistencyCheckConfigsItem.setGenerateZip(_ctx.booleanValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].GenerateZip"));
			featureConsistencyCheckConfigsItem.setServiceId(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].ServiceId"));
			featureConsistencyCheckConfigsItem.setServiceName(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].ServiceName"));
			featureConsistencyCheckConfigsItem.setWorkflowName(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].WorkflowName"));
			featureConsistencyCheckConfigsItem.setOssResourceId(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].OssResourceId"));
			featureConsistencyCheckConfigsItem.setOssBucket(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].OssBucket"));
			featureConsistencyCheckConfigsItem.setEasyRecVersion(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].EasyRecVersion"));
			featureConsistencyCheckConfigsItem.setEasyRecPackagePath(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].EasyRecPackagePath"));
			featureConsistencyCheckConfigsItem.setFgJarVersion(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].FgJarVersion"));
			featureConsistencyCheckConfigsItem.setFeaturePriority(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].FeaturePriority"));
			featureConsistencyCheckConfigsItem.setFeatureDisplayExclude(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].FeatureDisplayExclude"));
			featureConsistencyCheckConfigsItem.setGmtCreateTime(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].GmtCreateTime"));
			featureConsistencyCheckConfigsItem.setGmtModifiedTime(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].GmtModifiedTime"));
			featureConsistencyCheckConfigsItem.setUseFeatureStore(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].UseFeatureStore"));
			featureConsistencyCheckConfigsItem.setFeatureStoreProjectName(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].FeatureStoreProjectName"));
			featureConsistencyCheckConfigsItem.setFeatureStoreModelId(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].FeatureStoreModelId"));
			featureConsistencyCheckConfigsItem.setFeatureStoreUserId(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].FeatureStoreUserId"));
			featureConsistencyCheckConfigsItem.setFeatureStoreItemId(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].FeatureStoreItemId"));
			featureConsistencyCheckConfigsItem.setFeatureStoreSeqFeatureView(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].FeatureStoreSeqFeatureView"));
			featureConsistencyCheckConfigsItem.setFeatureStoreProjectId(_ctx.stringValue("ListFeatureConsistencyCheckJobConfigsResponse.FeatureConsistencyCheckConfigs["+ i +"].FeatureStoreProjectId"));

			featureConsistencyCheckConfigs.add(featureConsistencyCheckConfigsItem);
		}
		listFeatureConsistencyCheckJobConfigsResponse.setFeatureConsistencyCheckConfigs(featureConsistencyCheckConfigs);
	 
	 	return listFeatureConsistencyCheckJobConfigsResponse;
	}
}