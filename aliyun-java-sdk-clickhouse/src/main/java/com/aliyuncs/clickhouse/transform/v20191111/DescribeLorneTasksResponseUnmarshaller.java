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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeLorneTasksResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeLorneTasksResponse.TaskDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLorneTasksResponseUnmarshaller {

	public static DescribeLorneTasksResponse unmarshall(DescribeLorneTasksResponse describeLorneTasksResponse, UnmarshallerContext _ctx) {
		
		describeLorneTasksResponse.setRequestId(_ctx.stringValue("DescribeLorneTasksResponse.RequestId"));
		describeLorneTasksResponse.setPageNumber(_ctx.integerValue("DescribeLorneTasksResponse.PageNumber"));
		describeLorneTasksResponse.setTotalCount(_ctx.integerValue("DescribeLorneTasksResponse.TotalCount"));
		describeLorneTasksResponse.setPageSize(_ctx.integerValue("DescribeLorneTasksResponse.PageSize"));

		List<TaskDetail> taskDetails = new ArrayList<TaskDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLorneTasksResponse.TaskDetails.Length"); i++) {
			TaskDetail taskDetail = new TaskDetail();
			taskDetail.setId(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].Id"));
			taskDetail.setName(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].Name"));
			taskDetail.setDescription(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].Description"));
			taskDetail.setSourceType(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].SourceType"));
			taskDetail.setSourceProject(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].SourceProject"));
			taskDetail.setSourceTopic(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].SourceTopic"));
			taskDetail.setSourceRegion(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].SourceRegion"));
			taskDetail.setSinkType(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].SinkType"));
			taskDetail.setSinkInstance(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].SinkInstance"));
			taskDetail.setSinkSchema(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].SinkSchema"));
			taskDetail.setSinkTable(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].SinkTable"));
			taskDetail.setSinkUser(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].SinkUser"));
			taskDetail.setSinkRegion(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].SinkRegion"));
			taskDetail.setSinkVpcId(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].SinkVpcId"));
			taskDetail.setState(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].State"));
			taskDetail.setStrict(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].Strict"));
			taskDetail.setColumnMapper(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].ColumnMapper"));
			taskDetail.setCheckpoint(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].Checkpoint"));
			taskDetail.setCreateTime(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].CreateTime"));
			taskDetail.setMessage(_ctx.stringValue("DescribeLorneTasksResponse.TaskDetails["+ i +"].Message"));

			taskDetails.add(taskDetail);
		}
		describeLorneTasksResponse.setTaskDetails(taskDetails);
	 
	 	return describeLorneTasksResponse;
	}
}