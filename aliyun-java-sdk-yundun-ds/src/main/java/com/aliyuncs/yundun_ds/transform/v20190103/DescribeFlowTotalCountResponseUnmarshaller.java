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

package com.aliyuncs.yundun_ds.transform.v20190103;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeFlowTotalCountResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeFlowTotalCountResponse.FlowCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeFlowTotalCountResponse.FlowCount.CDP;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeFlowTotalCountResponse.FlowCount.CDP.InputInstanceCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeFlowTotalCountResponse.FlowCount.CDP.InputRecordCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeFlowTotalCountResponse.FlowCount.CDP.OutputInstanceCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeFlowTotalCountResponse.FlowCount.CDP.OutputRecordCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeFlowTotalCountResponse.FlowCount.DataHub;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeFlowTotalCountResponse.FlowCount.DataHub.Connector;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeFlowTotalCountResponse.FlowCount.DataHub.Project;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeFlowTotalCountResponse.FlowCount.DataHub.Subscription;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeFlowTotalCountResponse.FlowCount.DataHub.Topic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowTotalCountResponseUnmarshaller {

	public static DescribeFlowTotalCountResponse unmarshall(DescribeFlowTotalCountResponse describeFlowTotalCountResponse, UnmarshallerContext context) {
		
		describeFlowTotalCountResponse.setRequestId(context.stringValue("DescribeFlowTotalCountResponse.RequestId"));

		FlowCount flowCount = new FlowCount();

		DataHub dataHub = new DataHub();

		Project project = new Project();
		project.setTotalCount(context.longValue("DescribeFlowTotalCountResponse.FlowCount.DataHub.Project.TotalCount"));
		project.setLastCount(context.longValue("DescribeFlowTotalCountResponse.FlowCount.DataHub.Project.LastCount"));
		dataHub.setProject(project);

		Topic topic = new Topic();
		topic.setTotalCount(context.longValue("DescribeFlowTotalCountResponse.FlowCount.DataHub.Topic.TotalCount"));
		topic.setLastCount(context.longValue("DescribeFlowTotalCountResponse.FlowCount.DataHub.Topic.LastCount"));
		dataHub.setTopic(topic);

		Subscription subscription = new Subscription();
		subscription.setTotalCount(context.longValue("DescribeFlowTotalCountResponse.FlowCount.DataHub.Subscription.TotalCount"));
		subscription.setLastCount(context.longValue("DescribeFlowTotalCountResponse.FlowCount.DataHub.Subscription.LastCount"));
		dataHub.setSubscription(subscription);

		Connector connector = new Connector();
		connector.setTotalCount(context.longValue("DescribeFlowTotalCountResponse.FlowCount.DataHub.Connector.TotalCount"));
		connector.setLastCount(context.longValue("DescribeFlowTotalCountResponse.FlowCount.DataHub.Connector.LastCount"));
		dataHub.setConnector(connector);
		flowCount.setDataHub(dataHub);

		CDP cDP = new CDP();

		InputInstanceCount inputInstanceCount = new InputInstanceCount();
		inputInstanceCount.setTotalCount(context.longValue("DescribeFlowTotalCountResponse.FlowCount.CDP.InputInstanceCount.TotalCount"));
		cDP.setInputInstanceCount(inputInstanceCount);

		InputRecordCount inputRecordCount = new InputRecordCount();
		inputRecordCount.setTotalCount(context.longValue("DescribeFlowTotalCountResponse.FlowCount.CDP.InputRecordCount.TotalCount"));
		cDP.setInputRecordCount(inputRecordCount);

		OutputInstanceCount outputInstanceCount = new OutputInstanceCount();
		outputInstanceCount.setTotalCount(context.longValue("DescribeFlowTotalCountResponse.FlowCount.CDP.OutputInstanceCount.TotalCount"));
		cDP.setOutputInstanceCount(outputInstanceCount);

		OutputRecordCount outputRecordCount = new OutputRecordCount();
		outputRecordCount.setTotalCount(context.longValue("DescribeFlowTotalCountResponse.FlowCount.CDP.OutputRecordCount.TotalCount"));
		cDP.setOutputRecordCount(outputRecordCount);
		flowCount.setCDP(cDP);
		describeFlowTotalCountResponse.setFlowCount(flowCount);
	 
	 	return describeFlowTotalCountResponse;
	}
}