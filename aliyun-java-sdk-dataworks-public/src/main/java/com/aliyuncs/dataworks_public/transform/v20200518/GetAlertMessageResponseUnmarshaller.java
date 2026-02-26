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

import com.aliyuncs.dataworks_public.model.v20200518.GetAlertMessageResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetAlertMessageResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetAlertMessageResponse.Data.Instance;
import com.aliyuncs.dataworks_public.model.v20200518.GetAlertMessageResponse.Data.Node;
import com.aliyuncs.dataworks_public.model.v20200518.GetAlertMessageResponse.Data.SlaAlert;
import com.aliyuncs.dataworks_public.model.v20200518.GetAlertMessageResponse.Data.Topic;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAlertMessageResponseUnmarshaller {

	public static GetAlertMessageResponse unmarshall(GetAlertMessageResponse getAlertMessageResponse, UnmarshallerContext _ctx) {
		
		getAlertMessageResponse.setRequestId(_ctx.stringValue("GetAlertMessageResponse.RequestId"));
		getAlertMessageResponse.setHttpStatusCode(_ctx.integerValue("GetAlertMessageResponse.HttpStatusCode"));
		getAlertMessageResponse.setErrorMessage(_ctx.stringValue("GetAlertMessageResponse.ErrorMessage"));
		getAlertMessageResponse.setErrorCode(_ctx.stringValue("GetAlertMessageResponse.ErrorCode"));
		getAlertMessageResponse.setSuccess(_ctx.booleanValue("GetAlertMessageResponse.Success"));

		Data data = new Data();
		data.setRemindId(_ctx.longValue("GetAlertMessageResponse.Data.RemindId"));
		data.setAlertMessageStatus(_ctx.stringValue("GetAlertMessageResponse.Data.AlertMessageStatus"));
		data.setAlertUser(_ctx.stringValue("GetAlertMessageResponse.Data.AlertUser"));
		data.setAlertTime(_ctx.longValue("GetAlertMessageResponse.Data.AlertTime"));
		data.setAlertMethod(_ctx.stringValue("GetAlertMessageResponse.Data.AlertMethod"));
		data.setSource(_ctx.stringValue("GetAlertMessageResponse.Data.Source"));
		data.setContent(_ctx.stringValue("GetAlertMessageResponse.Data.Content"));
		data.setRemindName(_ctx.stringValue("GetAlertMessageResponse.Data.RemindName"));
		data.setAlertId(_ctx.longValue("GetAlertMessageResponse.Data.AlertId"));

		SlaAlert slaAlert = new SlaAlert();
		slaAlert.setStatus(_ctx.stringValue("GetAlertMessageResponse.Data.SlaAlert.Status"));
		slaAlert.setBaselineOwner(_ctx.stringValue("GetAlertMessageResponse.Data.SlaAlert.BaselineOwner"));
		slaAlert.setBaselineId(_ctx.longValue("GetAlertMessageResponse.Data.SlaAlert.BaselineId"));
		slaAlert.setBaselineName(_ctx.stringValue("GetAlertMessageResponse.Data.SlaAlert.BaselineName"));
		slaAlert.setBizdate(_ctx.longValue("GetAlertMessageResponse.Data.SlaAlert.Bizdate"));
		slaAlert.setProjectId(_ctx.longValue("GetAlertMessageResponse.Data.SlaAlert.ProjectId"));
		slaAlert.setInGroupId(_ctx.integerValue("GetAlertMessageResponse.Data.SlaAlert.InGroupId"));
		data.setSlaAlert(slaAlert);

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("GetAlertMessageResponse.Data.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setStatus(_ctx.stringValue("GetAlertMessageResponse.Data.Instances["+ i +"].Status"));
			instance.setInstanceId(_ctx.longValue("GetAlertMessageResponse.Data.Instances["+ i +"].InstanceId"));
			instance.setNodeName(_ctx.stringValue("GetAlertMessageResponse.Data.Instances["+ i +"].NodeName"));
			instance.setNodeId(_ctx.longValue("GetAlertMessageResponse.Data.Instances["+ i +"].NodeId"));
			instance.setProjectId(_ctx.longValue("GetAlertMessageResponse.Data.Instances["+ i +"].ProjectId"));

			instances.add(instance);
		}
		data.setInstances(instances);

		List<Topic> topics = new ArrayList<Topic>();
		for (int i = 0; i < _ctx.lengthValue("GetAlertMessageResponse.Data.Topics.Length"); i++) {
			Topic topic = new Topic();
			topic.setTopicName(_ctx.stringValue("GetAlertMessageResponse.Data.Topics["+ i +"].TopicName"));
			topic.setInstanceId(_ctx.longValue("GetAlertMessageResponse.Data.Topics["+ i +"].InstanceId"));
			topic.setTopicId(_ctx.longValue("GetAlertMessageResponse.Data.Topics["+ i +"].TopicId"));
			topic.setTopicOwner(_ctx.stringValue("GetAlertMessageResponse.Data.Topics["+ i +"].TopicOwner"));
			topic.setNodeId(_ctx.longValue("GetAlertMessageResponse.Data.Topics["+ i +"].NodeId"));
			topic.setTopicStatus(_ctx.stringValue("GetAlertMessageResponse.Data.Topics["+ i +"].TopicStatus"));

			topics.add(topic);
		}
		data.setTopics(topics);

		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("GetAlertMessageResponse.Data.Nodes.Length"); i++) {
			Node node = new Node();
			node.setOwner(_ctx.stringValue("GetAlertMessageResponse.Data.Nodes["+ i +"].Owner"));
			node.setNodeName(_ctx.stringValue("GetAlertMessageResponse.Data.Nodes["+ i +"].NodeName"));
			node.setNodeId(_ctx.longValue("GetAlertMessageResponse.Data.Nodes["+ i +"].NodeId"));
			node.setProjectId(_ctx.longValue("GetAlertMessageResponse.Data.Nodes["+ i +"].ProjectId"));

			nodes.add(node);
		}
		data.setNodes(nodes);
		getAlertMessageResponse.setData(data);
	 
	 	return getAlertMessageResponse;
	}
}