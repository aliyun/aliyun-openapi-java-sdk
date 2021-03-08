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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetBaselineKeyPathResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetBaselineKeyPathResponse.DataItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetBaselineKeyPathResponse.DataItem.RunsItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetBaselineKeyPathResponse.DataItem.TopicsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBaselineKeyPathResponseUnmarshaller {

	public static GetBaselineKeyPathResponse unmarshall(GetBaselineKeyPathResponse getBaselineKeyPathResponse, UnmarshallerContext _ctx) {
		
		getBaselineKeyPathResponse.setRequestId(_ctx.stringValue("GetBaselineKeyPathResponse.RequestId"));
		getBaselineKeyPathResponse.setSuccess(_ctx.booleanValue("GetBaselineKeyPathResponse.Success"));
		getBaselineKeyPathResponse.setErrorCode(_ctx.stringValue("GetBaselineKeyPathResponse.ErrorCode"));
		getBaselineKeyPathResponse.setErrorMessage(_ctx.stringValue("GetBaselineKeyPathResponse.ErrorMessage"));
		getBaselineKeyPathResponse.setHttpStatusCode(_ctx.integerValue("GetBaselineKeyPathResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetBaselineKeyPathResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setInstanceId(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].InstanceId"));
			dataItem.setProjectId(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].ProjectId"));
			dataItem.setNodeId(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].NodeId"));
			dataItem.setNodeName(_ctx.stringValue("GetBaselineKeyPathResponse.Data["+ i +"].NodeName"));
			dataItem.setBizdate(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Bizdate"));
			dataItem.setInGroupId(_ctx.integerValue("GetBaselineKeyPathResponse.Data["+ i +"].InGroupId"));
			dataItem.setOwner(_ctx.stringValue("GetBaselineKeyPathResponse.Data["+ i +"].Owner"));
			dataItem.setPrgType(_ctx.integerValue("GetBaselineKeyPathResponse.Data["+ i +"].PrgType"));

			List<RunsItem> runs = new ArrayList<RunsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs.Length"); j++) {
				RunsItem runsItem = new RunsItem();
				runsItem.setAbsTime(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].AbsTime"));
				runsItem.setBeginCast(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].BeginCast"));
				runsItem.setBeginRunningTime(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].BeginRunningTime"));
				runsItem.setBeginWaitResTime(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].BeginWaitResTime"));
				runsItem.setBeginWaitTimeTime(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].BeginWaitTimeTime"));
				runsItem.setBizdate(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].Bizdate"));
				runsItem.setCycTime(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].CycTime"));
				runsItem.setEndCast(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].EndCast"));
				runsItem.setFinishTime(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].FinishTime"));
				runsItem.setInGroupId(_ctx.integerValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].InGroupId"));
				runsItem.setInstanceId(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].InstanceId"));
				runsItem.setNodeId(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].NodeId"));
				runsItem.setNodeName(_ctx.stringValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].NodeName"));
				runsItem.setOwner(_ctx.stringValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].Owner"));
				runsItem.setProjectId(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].ProjectId"));
				runsItem.setStatus(_ctx.stringValue("GetBaselineKeyPathResponse.Data["+ i +"].Runs["+ j +"].Status"));

				runs.add(runsItem);
			}
			dataItem.setRuns(runs);

			List<TopicsItem> topics = new ArrayList<TopicsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetBaselineKeyPathResponse.Data["+ i +"].Topics.Length"); j++) {
				TopicsItem topicsItem = new TopicsItem();
				topicsItem.setInstanceId(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Topics["+ j +"].InstanceId"));
				topicsItem.setTopicId(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Topics["+ j +"].TopicId"));
				topicsItem.setTopicName(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Topics["+ j +"].TopicName"));
				topicsItem.setAddTime(_ctx.longValue("GetBaselineKeyPathResponse.Data["+ i +"].Topics["+ j +"].AddTime"));

				topics.add(topicsItem);
			}
			dataItem.setTopics(topics);

			data.add(dataItem);
		}
		getBaselineKeyPathResponse.setData(data);
	 
	 	return getBaselineKeyPathResponse;
	}
}