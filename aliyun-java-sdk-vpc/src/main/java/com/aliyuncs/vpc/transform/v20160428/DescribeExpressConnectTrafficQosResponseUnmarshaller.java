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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeExpressConnectTrafficQosResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeExpressConnectTrafficQosResponse.QosListItem;
import com.aliyuncs.vpc.model.v20160428.DescribeExpressConnectTrafficQosResponse.QosListItem.AssociatedInstanceListItem;
import com.aliyuncs.vpc.model.v20160428.DescribeExpressConnectTrafficQosResponse.QosListItem.QueueListItem;
import com.aliyuncs.vpc.model.v20160428.DescribeExpressConnectTrafficQosResponse.QosListItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpressConnectTrafficQosResponseUnmarshaller {

	public static DescribeExpressConnectTrafficQosResponse unmarshall(DescribeExpressConnectTrafficQosResponse describeExpressConnectTrafficQosResponse, UnmarshallerContext _ctx) {
		
		describeExpressConnectTrafficQosResponse.setRequestId(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.RequestId"));
		describeExpressConnectTrafficQosResponse.setNextToken(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.NextToken"));
		describeExpressConnectTrafficQosResponse.setMaxResults(_ctx.integerValue("DescribeExpressConnectTrafficQosResponse.MaxResults"));
		describeExpressConnectTrafficQosResponse.setTotalCount(_ctx.integerValue("DescribeExpressConnectTrafficQosResponse.TotalCount"));
		describeExpressConnectTrafficQosResponse.setCount(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.Count"));

		List<QosListItem> qosList = new ArrayList<QosListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExpressConnectTrafficQosResponse.QosList.Length"); i++) {
			QosListItem qosListItem = new QosListItem();
			qosListItem.setQosId(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].QosId"));
			qosListItem.setQosName(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].QosName"));
			qosListItem.setQosDescription(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].QosDescription"));
			qosListItem.setStatus(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].Status"));
			qosListItem.setProgressing(_ctx.integerValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].Progressing"));
			qosListItem.setResourceGroupId(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].ResourceGroupId"));

			List<AssociatedInstanceListItem> associatedInstanceList = new ArrayList<AssociatedInstanceListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].AssociatedInstanceList.Length"); j++) {
				AssociatedInstanceListItem associatedInstanceListItem = new AssociatedInstanceListItem();
				associatedInstanceListItem.setInstanceId(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].AssociatedInstanceList["+ j +"].InstanceId"));
				associatedInstanceListItem.setInstanceType(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].AssociatedInstanceList["+ j +"].InstanceType"));
				associatedInstanceListItem.setInstanceStatus(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].AssociatedInstanceList["+ j +"].InstanceStatus"));
				associatedInstanceListItem.setInstanceProgressing(_ctx.integerValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].AssociatedInstanceList["+ j +"].InstanceProgressing"));

				associatedInstanceList.add(associatedInstanceListItem);
			}
			qosListItem.setAssociatedInstanceList(associatedInstanceList);

			List<QueueListItem> queueList = new ArrayList<QueueListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].QueueList.Length"); j++) {
				QueueListItem queueListItem = new QueueListItem();
				queueListItem.setQosId(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].QueueList["+ j +"].QosId"));
				queueListItem.setQueueId(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].QueueList["+ j +"].QueueId"));
				queueListItem.setQueueType(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].QueueList["+ j +"].QueueType"));
				queueListItem.setBandwidthPercent(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].QueueList["+ j +"].BandwidthPercent"));
				queueListItem.setQueueName(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].QueueList["+ j +"].QueueName"));
				queueListItem.setQueueDescription(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].QueueList["+ j +"].QueueDescription"));
				queueListItem.setStatus(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].QueueList["+ j +"].Status"));

				queueList.add(queueListItem);
			}
			qosListItem.setQueueList(queueList);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("DescribeExpressConnectTrafficQosResponse.QosList["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			qosListItem.setTags(tags);

			qosList.add(qosListItem);
		}
		describeExpressConnectTrafficQosResponse.setQosList(qosList);
	 
	 	return describeExpressConnectTrafficQosResponse;
	}
}