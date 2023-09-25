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

import com.aliyuncs.dataworks_public.model.v20200518.ListAlertMessagesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListAlertMessagesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListAlertMessagesResponse.Data.AlertMessagesItem;
import com.aliyuncs.dataworks_public.model.v20200518.ListAlertMessagesResponse.Data.AlertMessagesItem.InstancesItem;
import com.aliyuncs.dataworks_public.model.v20200518.ListAlertMessagesResponse.Data.AlertMessagesItem.NodesItem;
import com.aliyuncs.dataworks_public.model.v20200518.ListAlertMessagesResponse.Data.AlertMessagesItem.SlaAlert;
import com.aliyuncs.dataworks_public.model.v20200518.ListAlertMessagesResponse.Data.AlertMessagesItem.TopicsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlertMessagesResponseUnmarshaller {

	public static ListAlertMessagesResponse unmarshall(ListAlertMessagesResponse listAlertMessagesResponse, UnmarshallerContext _ctx) {
		
		listAlertMessagesResponse.setRequestId(_ctx.stringValue("ListAlertMessagesResponse.RequestId"));
		listAlertMessagesResponse.setHttpStatusCode(_ctx.integerValue("ListAlertMessagesResponse.HttpStatusCode"));
		listAlertMessagesResponse.setErrorMessage(_ctx.stringValue("ListAlertMessagesResponse.ErrorMessage"));
		listAlertMessagesResponse.setErrorCode(_ctx.stringValue("ListAlertMessagesResponse.ErrorCode"));
		listAlertMessagesResponse.setSuccess(_ctx.booleanValue("ListAlertMessagesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.stringValue("ListAlertMessagesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.stringValue("ListAlertMessagesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.stringValue("ListAlertMessagesResponse.Data.TotalCount"));

		List<AlertMessagesItem> alertMessages = new ArrayList<AlertMessagesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAlertMessagesResponse.Data.AlertMessages.Length"); i++) {
			AlertMessagesItem alertMessagesItem = new AlertMessagesItem();
			alertMessagesItem.setRemindId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].RemindId"));
			alertMessagesItem.setAlertMessageStatus(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].AlertMessageStatus"));
			alertMessagesItem.setAlertUser(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].AlertUser"));
			alertMessagesItem.setAlertTime(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].AlertTime"));
			alertMessagesItem.setAlertMethod(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].AlertMethod"));
			alertMessagesItem.setSource(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Source"));
			alertMessagesItem.setContent(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Content"));
			alertMessagesItem.setRemindName(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].RemindName"));
			alertMessagesItem.setAlertId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].AlertId"));

			SlaAlert slaAlert = new SlaAlert();
			slaAlert.setStatus(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].SlaAlert.Status"));
			slaAlert.setBaselineOwner(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].SlaAlert.BaselineOwner"));
			slaAlert.setBaselineId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].SlaAlert.BaselineId"));
			slaAlert.setBaselineName(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].SlaAlert.BaselineName"));
			slaAlert.setBizdate(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].SlaAlert.Bizdate"));
			slaAlert.setProjectId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].SlaAlert.ProjectId"));
			slaAlert.setInGroupId(_ctx.integerValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].SlaAlert.InGroupId"));
			alertMessagesItem.setSlaAlert(slaAlert);

			List<InstancesItem> instances = new ArrayList<InstancesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Instances.Length"); j++) {
				InstancesItem instancesItem = new InstancesItem();
				instancesItem.setStatus(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Instances["+ j +"].Status"));
				instancesItem.setInstanceId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Instances["+ j +"].InstanceId"));
				instancesItem.setNodeName(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Instances["+ j +"].NodeName"));
				instancesItem.setNodeId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Instances["+ j +"].NodeId"));
				instancesItem.setProjectId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Instances["+ j +"].ProjectId"));

				instances.add(instancesItem);
			}
			alertMessagesItem.setInstances(instances);

			List<TopicsItem> topics = new ArrayList<TopicsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Topics.Length"); j++) {
				TopicsItem topicsItem = new TopicsItem();
				topicsItem.setTopicName(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Topics["+ j +"].TopicName"));
				topicsItem.setInstanceId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Topics["+ j +"].InstanceId"));
				topicsItem.setTopicId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Topics["+ j +"].TopicId"));
				topicsItem.setTopicOwner(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Topics["+ j +"].TopicOwner"));
				topicsItem.setNodeId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Topics["+ j +"].NodeId"));
				topicsItem.setTopicStatus(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Topics["+ j +"].TopicStatus"));

				topics.add(topicsItem);
			}
			alertMessagesItem.setTopics(topics);

			List<NodesItem> nodes = new ArrayList<NodesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Nodes.Length"); j++) {
				NodesItem nodesItem = new NodesItem();
				nodesItem.setOwner(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Nodes["+ j +"].Owner"));
				nodesItem.setNodeName(_ctx.stringValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Nodes["+ j +"].NodeName"));
				nodesItem.setNodeId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Nodes["+ j +"].NodeId"));
				nodesItem.setProjectId(_ctx.longValue("ListAlertMessagesResponse.Data.AlertMessages["+ i +"].Nodes["+ j +"].ProjectId"));

				nodes.add(nodesItem);
			}
			alertMessagesItem.setNodes(nodes);

			alertMessages.add(alertMessagesItem);
		}
		data.setAlertMessages(alertMessages);
		listAlertMessagesResponse.setData(data);
	 
	 	return listAlertMessagesResponse;
	}
}