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

package com.aliyuncs.webplus.transform.v20190320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.webplus.model.v20190320.DescribeGatherStatsResultResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeGatherStatsResultResponse.GatherStatsResult;
import com.aliyuncs.webplus.model.v20190320.DescribeGatherStatsResultResponse.GatherStatsResult.Change;
import com.aliyuncs.webplus.model.v20190320.DescribeGatherStatsResultResponse.GatherStatsResult.InstanceResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatherStatsResultResponseUnmarshaller {

	public static DescribeGatherStatsResultResponse unmarshall(DescribeGatherStatsResultResponse describeGatherStatsResultResponse, UnmarshallerContext _ctx) {
		
		describeGatherStatsResultResponse.setRequestId(_ctx.stringValue("DescribeGatherStatsResultResponse.RequestId"));
		describeGatherStatsResultResponse.setCode(_ctx.stringValue("DescribeGatherStatsResultResponse.Code"));
		describeGatherStatsResultResponse.setMessage(_ctx.stringValue("DescribeGatherStatsResultResponse.Message"));

		GatherStatsResult gatherStatsResult = new GatherStatsResult();

		Change change = new Change();
		change.setChangeId(_ctx.stringValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.ChangeId"));
		change.setEnvId(_ctx.stringValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.EnvId"));
		change.setChangeName(_ctx.stringValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.ChangeName"));
		change.setChangeDescription(_ctx.stringValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.ChangeDescription"));
		change.setChangeFinished(_ctx.booleanValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.ChangeFinished"));
		change.setChangeSucceeded(_ctx.booleanValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.ChangeSucceeded"));
		change.setChangeAborted(_ctx.booleanValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.ChangeAborted"));
		change.setChangePaused(_ctx.booleanValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.ChangePaused"));
		change.setChangeTimedout(_ctx.booleanValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.ChangeTimedout"));
		change.setCreateTime(_ctx.longValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.CreateTime"));
		change.setUpdateTime(_ctx.longValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.UpdateTime"));
		change.setFinishTime(_ctx.longValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.FinishTime"));
		change.setActionName(_ctx.stringValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.ActionName"));
		change.setCreateUsername(_ctx.stringValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.CreateUsername"));
		change.setChangeMessage(_ctx.stringValue("DescribeGatherStatsResultResponse.GatherStatsResult.Change.ChangeMessage"));
		gatherStatsResult.setChange(change);

		List<InstanceResult> instanceResults = new ArrayList<InstanceResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatherStatsResultResponse.GatherStatsResult.InstanceResults.Length"); i++) {
			InstanceResult instanceResult = new InstanceResult();
			instanceResult.setInstanceId(_ctx.stringValue("DescribeGatherStatsResultResponse.GatherStatsResult.InstanceResults["+ i +"].InstanceId"));
			instanceResult.setStorageKey(_ctx.stringValue("DescribeGatherStatsResultResponse.GatherStatsResult.InstanceResults["+ i +"].StorageKey"));
			instanceResult.setTaskSucceeded(_ctx.booleanValue("DescribeGatherStatsResultResponse.GatherStatsResult.InstanceResults["+ i +"].TaskSucceeded"));
			instanceResult.setTaskMessage(_ctx.stringValue("DescribeGatherStatsResultResponse.GatherStatsResult.InstanceResults["+ i +"].TaskMessage"));

			instanceResults.add(instanceResult);
		}
		gatherStatsResult.setInstanceResults(instanceResults);
		describeGatherStatsResultResponse.setGatherStatsResult(gatherStatsResult);
	 
	 	return describeGatherStatsResultResponse;
	}
}