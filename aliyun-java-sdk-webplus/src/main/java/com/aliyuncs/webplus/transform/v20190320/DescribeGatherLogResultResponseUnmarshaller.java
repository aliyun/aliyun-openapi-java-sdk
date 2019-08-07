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

import com.aliyuncs.webplus.model.v20190320.DescribeGatherLogResultResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeGatherLogResultResponse.GatherLogResult;
import com.aliyuncs.webplus.model.v20190320.DescribeGatherLogResultResponse.GatherLogResult.Change;
import com.aliyuncs.webplus.model.v20190320.DescribeGatherLogResultResponse.GatherLogResult.InstanceResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatherLogResultResponseUnmarshaller {

	public static DescribeGatherLogResultResponse unmarshall(DescribeGatherLogResultResponse describeGatherLogResultResponse, UnmarshallerContext _ctx) {
		
		describeGatherLogResultResponse.setRequestId(_ctx.stringValue("DescribeGatherLogResultResponse.RequestId"));
		describeGatherLogResultResponse.setCode(_ctx.stringValue("DescribeGatherLogResultResponse.Code"));
		describeGatherLogResultResponse.setMessage(_ctx.stringValue("DescribeGatherLogResultResponse.Message"));

		GatherLogResult gatherLogResult = new GatherLogResult();
		gatherLogResult.setLogPath(_ctx.stringValue("DescribeGatherLogResultResponse.GatherLogResult.LogPath"));

		Change change = new Change();
		change.setChangeId(_ctx.stringValue("DescribeGatherLogResultResponse.GatherLogResult.Change.ChangeId"));
		change.setEnvId(_ctx.stringValue("DescribeGatherLogResultResponse.GatherLogResult.Change.EnvId"));
		change.setChangeName(_ctx.stringValue("DescribeGatherLogResultResponse.GatherLogResult.Change.ChangeName"));
		change.setChangeDescription(_ctx.stringValue("DescribeGatherLogResultResponse.GatherLogResult.Change.ChangeDescription"));
		change.setChangeFinished(_ctx.booleanValue("DescribeGatherLogResultResponse.GatherLogResult.Change.ChangeFinished"));
		change.setChangeSucceeded(_ctx.booleanValue("DescribeGatherLogResultResponse.GatherLogResult.Change.ChangeSucceeded"));
		change.setChangeAborted(_ctx.booleanValue("DescribeGatherLogResultResponse.GatherLogResult.Change.ChangeAborted"));
		change.setChangePaused(_ctx.booleanValue("DescribeGatherLogResultResponse.GatherLogResult.Change.ChangePaused"));
		change.setChangeTimedout(_ctx.booleanValue("DescribeGatherLogResultResponse.GatherLogResult.Change.ChangeTimedout"));
		change.setCreateTime(_ctx.longValue("DescribeGatherLogResultResponse.GatherLogResult.Change.CreateTime"));
		change.setUpdateTime(_ctx.longValue("DescribeGatherLogResultResponse.GatherLogResult.Change.UpdateTime"));
		change.setFinishTime(_ctx.longValue("DescribeGatherLogResultResponse.GatherLogResult.Change.FinishTime"));
		change.setActionName(_ctx.stringValue("DescribeGatherLogResultResponse.GatherLogResult.Change.ActionName"));
		change.setCreateUsername(_ctx.stringValue("DescribeGatherLogResultResponse.GatherLogResult.Change.CreateUsername"));
		change.setChangeMessage(_ctx.stringValue("DescribeGatherLogResultResponse.GatherLogResult.Change.ChangeMessage"));
		gatherLogResult.setChange(change);

		List<InstanceResult> instanceResults = new ArrayList<InstanceResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatherLogResultResponse.GatherLogResult.InstanceResults.Length"); i++) {
			InstanceResult instanceResult = new InstanceResult();
			instanceResult.setInstanceId(_ctx.stringValue("DescribeGatherLogResultResponse.GatherLogResult.InstanceResults["+ i +"].InstanceId"));
			instanceResult.setStorageKey(_ctx.stringValue("DescribeGatherLogResultResponse.GatherLogResult.InstanceResults["+ i +"].StorageKey"));
			instanceResult.setTaskSucceeded(_ctx.booleanValue("DescribeGatherLogResultResponse.GatherLogResult.InstanceResults["+ i +"].TaskSucceeded"));
			instanceResult.setTaskMessage(_ctx.stringValue("DescribeGatherLogResultResponse.GatherLogResult.InstanceResults["+ i +"].TaskMessage"));

			instanceResults.add(instanceResult);
		}
		gatherLogResult.setInstanceResults(instanceResults);
		describeGatherLogResultResponse.setGatherLogResult(gatherLogResult);
	 
	 	return describeGatherLogResultResponse;
	}
}