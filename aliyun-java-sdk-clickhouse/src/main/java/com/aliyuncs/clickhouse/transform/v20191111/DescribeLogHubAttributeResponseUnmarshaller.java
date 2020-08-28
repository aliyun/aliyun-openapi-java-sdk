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

package com.aliyuncs.clickhouse.transform.v20191111;

import com.aliyuncs.clickhouse.model.v20191111.DescribeLogHubAttributeResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeLogHubAttributeResponse.TaskDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogHubAttributeResponseUnmarshaller {

	public static DescribeLogHubAttributeResponse unmarshall(DescribeLogHubAttributeResponse describeLogHubAttributeResponse, UnmarshallerContext _ctx) {
		
		describeLogHubAttributeResponse.setRequestId(_ctx.stringValue("DescribeLogHubAttributeResponse.RequestId"));

		TaskDetail taskDetail = new TaskDetail();
		taskDetail.setId(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.Id"));
		taskDetail.setName(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.Name"));
		taskDetail.setDescription(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.Description"));
		taskDetail.setSourceType(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.SourceType"));
		taskDetail.setSourceProject(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.SourceProject"));
		taskDetail.setSourceTopic(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.SourceTopic"));
		taskDetail.setSourceRegion(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.SourceRegion"));
		taskDetail.setSinkType(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.SinkType"));
		taskDetail.setSinkInstance(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.SinkInstance"));
		taskDetail.setSinkSchema(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.SinkSchema"));
		taskDetail.setSinkTable(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.SinkTable"));
		taskDetail.setSinkUser(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.SinkUser"));
		taskDetail.setSinkRegion(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.SinkRegion"));
		taskDetail.setSinkVpcId(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.SinkVpcId"));
		taskDetail.setState(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.State"));
		taskDetail.setStrict(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.Strict"));
		taskDetail.setColumnMapper(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.ColumnMapper"));
		taskDetail.setCheckpoint(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.Checkpoint"));
		taskDetail.setCreateTime(_ctx.stringValue("DescribeLogHubAttributeResponse.TaskDetail.CreateTime"));
		describeLogHubAttributeResponse.setTaskDetail(taskDetail);
	 
	 	return describeLogHubAttributeResponse;
	}
}