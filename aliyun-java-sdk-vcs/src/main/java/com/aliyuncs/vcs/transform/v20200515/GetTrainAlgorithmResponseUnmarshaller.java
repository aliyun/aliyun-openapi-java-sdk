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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.GetTrainAlgorithmResponse;
import com.aliyuncs.vcs.model.v20200515.GetTrainAlgorithmResponse.Data;
import com.aliyuncs.vcs.model.v20200515.GetTrainAlgorithmResponse.Data.InstanceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTrainAlgorithmResponseUnmarshaller {

	public static GetTrainAlgorithmResponse unmarshall(GetTrainAlgorithmResponse getTrainAlgorithmResponse, UnmarshallerContext _ctx) {
		
		getTrainAlgorithmResponse.setRequestId(_ctx.stringValue("GetTrainAlgorithmResponse.RequestId"));
		getTrainAlgorithmResponse.setMessage(_ctx.stringValue("GetTrainAlgorithmResponse.Message"));
		getTrainAlgorithmResponse.setCode(_ctx.stringValue("GetTrainAlgorithmResponse.Code"));

		Data data = new Data();
		data.setCanUnpublish(_ctx.stringValue("GetTrainAlgorithmResponse.Data.CanUnpublish"));
		data.setTrainProgress(_ctx.longValue("GetTrainAlgorithmResponse.Data.TrainProgress"));
		data.setDeployVersion(_ctx.stringValue("GetTrainAlgorithmResponse.Data.DeployVersion"));
		data.setTrainQueueSize(_ctx.longValue("GetTrainAlgorithmResponse.Data.TrainQueueSize"));
		data.setCurrentVersion(_ctx.stringValue("GetTrainAlgorithmResponse.Data.CurrentVersion"));
		data.setDeployStatus(_ctx.stringValue("GetTrainAlgorithmResponse.Data.DeployStatus"));
		data.setTrainEstimateTime(_ctx.longValue("GetTrainAlgorithmResponse.Data.TrainEstimateTime"));
		data.setGmtModified(_ctx.stringValue("GetTrainAlgorithmResponse.Data.GmtModified"));
		data.setTestSampleCount(_ctx.longValue("GetTrainAlgorithmResponse.Data.TestSampleCount"));
		data.setNoReadyReason(_ctx.stringValue("GetTrainAlgorithmResponse.Data.NoReadyReason"));
		data.setTrainTime(_ctx.stringValue("GetTrainAlgorithmResponse.Data.TrainTime"));
		data.setAlgorithmName(_ctx.stringValue("GetTrainAlgorithmResponse.Data.AlgorithmName"));
		data.setTrainSampleCount(_ctx.longValue("GetTrainAlgorithmResponse.Data.TrainSampleCount"));
		data.setTrainStatus(_ctx.stringValue("GetTrainAlgorithmResponse.Data.TrainStatus"));
		data.setGmtCreate(_ctx.stringValue("GetTrainAlgorithmResponse.Data.GmtCreate"));
		data.setReadyTrain(_ctx.stringValue("GetTrainAlgorithmResponse.Data.ReadyTrain"));
		data.setAlgorithmType(_ctx.stringValue("GetTrainAlgorithmResponse.Data.AlgorithmType"));
		data.setDeployTime(_ctx.stringValue("GetTrainAlgorithmResponse.Data.DeployTime"));
		data.setPrecision(_ctx.floatValue("GetTrainAlgorithmResponse.Data.Precision"));
		data.setUserId(_ctx.stringValue("GetTrainAlgorithmResponse.Data.UserId"));
		data.setRecall(_ctx.floatValue("GetTrainAlgorithmResponse.Data.Recall"));
		data.setDeleted(_ctx.stringValue("GetTrainAlgorithmResponse.Data.Deleted"));
		data.setId(_ctx.stringValue("GetTrainAlgorithmResponse.Data.Id"));

		List<InstanceListItem> instanceList = new ArrayList<InstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTrainAlgorithmResponse.Data.InstanceList.Length"); i++) {
			InstanceListItem instanceListItem = new InstanceListItem();
			instanceListItem.setInstanceName(_ctx.stringValue("GetTrainAlgorithmResponse.Data.InstanceList["+ i +"].InstanceName"));
			instanceListItem.setInstaceId(_ctx.stringValue("GetTrainAlgorithmResponse.Data.InstanceList["+ i +"].InstaceId"));
			instanceListItem.setProjectId(_ctx.stringValue("GetTrainAlgorithmResponse.Data.InstanceList["+ i +"].ProjectId"));

			instanceList.add(instanceListItem);
		}
		data.setInstanceList(instanceList);
		getTrainAlgorithmResponse.setData(data);
	 
	 	return getTrainAlgorithmResponse;
	}
}