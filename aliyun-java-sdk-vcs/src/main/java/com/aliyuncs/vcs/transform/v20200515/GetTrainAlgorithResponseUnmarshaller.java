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

import com.aliyuncs.vcs.model.v20200515.GetTrainAlgorithResponse;
import com.aliyuncs.vcs.model.v20200515.GetTrainAlgorithResponse.Data;
import com.aliyuncs.vcs.model.v20200515.GetTrainAlgorithResponse.Data.InstanceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTrainAlgorithResponseUnmarshaller {

	public static GetTrainAlgorithResponse unmarshall(GetTrainAlgorithResponse getTrainAlgorithResponse, UnmarshallerContext _ctx) {
		
		getTrainAlgorithResponse.setRequestId(_ctx.stringValue("GetTrainAlgorithResponse.RequestId"));
		getTrainAlgorithResponse.setMessage(_ctx.stringValue("GetTrainAlgorithResponse.Message"));
		getTrainAlgorithResponse.setCode(_ctx.stringValue("GetTrainAlgorithResponse.Code"));

		Data data = new Data();
		data.setTrainProgress(_ctx.longValue("GetTrainAlgorithResponse.Data.TrainProgress"));
		data.setDeployVersion(_ctx.stringValue("GetTrainAlgorithResponse.Data.DeployVersion"));
		data.setTrainQueueSize(_ctx.longValue("GetTrainAlgorithResponse.Data.TrainQueueSize"));
		data.setDeployStatus(_ctx.stringValue("GetTrainAlgorithResponse.Data.DeployStatus"));
		data.setTrainEstimateTime(_ctx.longValue("GetTrainAlgorithResponse.Data.TrainEstimateTime"));
		data.setGmtModified(_ctx.stringValue("GetTrainAlgorithResponse.Data.GmtModified"));
		data.setTestSampleCount(_ctx.longValue("GetTrainAlgorithResponse.Data.TestSampleCount"));
		data.setNoReadyReason(_ctx.stringValue("GetTrainAlgorithResponse.Data.NoReadyReason"));
		data.setAlgorithmName(_ctx.stringValue("GetTrainAlgorithResponse.Data.AlgorithmName"));
		data.setTrainSampleCount(_ctx.longValue("GetTrainAlgorithResponse.Data.TrainSampleCount"));
		data.setTrainStatus(_ctx.stringValue("GetTrainAlgorithResponse.Data.TrainStatus"));
		data.setGmtCreate(_ctx.stringValue("GetTrainAlgorithResponse.Data.GmtCreate"));
		data.setReadyTrain(_ctx.stringValue("GetTrainAlgorithResponse.Data.ReadyTrain"));
		data.setAlgorithmType(_ctx.stringValue("GetTrainAlgorithResponse.Data.AlgorithmType"));
		data.setPrecision(_ctx.floatValue("GetTrainAlgorithResponse.Data.Precision"));
		data.setUserId(_ctx.stringValue("GetTrainAlgorithResponse.Data.UserId"));
		data.setRecall(_ctx.floatValue("GetTrainAlgorithResponse.Data.Recall"));
		data.setDeleted(_ctx.stringValue("GetTrainAlgorithResponse.Data.Deleted"));
		data.setId(_ctx.stringValue("GetTrainAlgorithResponse.Data.Id"));

		List<InstanceListItem> instanceList = new ArrayList<InstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTrainAlgorithResponse.Data.InstanceList.Length"); i++) {
			InstanceListItem instanceListItem = new InstanceListItem();
			instanceListItem.setInstanceName(_ctx.stringValue("GetTrainAlgorithResponse.Data.InstanceList["+ i +"].InstanceName"));
			instanceListItem.setInstaceId(_ctx.stringValue("GetTrainAlgorithResponse.Data.InstanceList["+ i +"].InstaceId"));
			instanceListItem.setProjectId(_ctx.stringValue("GetTrainAlgorithResponse.Data.InstanceList["+ i +"].ProjectId"));

			instanceList.add(instanceListItem);
		}
		data.setInstanceList(instanceList);
		getTrainAlgorithResponse.setData(data);
	 
	 	return getTrainAlgorithResponse;
	}
}