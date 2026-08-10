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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListPipelinesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListPipelinesResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.ListPipelinesResponse.Data.Pipeline;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPipelinesResponseUnmarshaller {

	public static ListPipelinesResponse unmarshall(ListPipelinesResponse listPipelinesResponse, UnmarshallerContext _ctx) {
		
		listPipelinesResponse.setRequestId(_ctx.stringValue("ListPipelinesResponse.RequestId"));
		listPipelinesResponse.setMessage(_ctx.stringValue("ListPipelinesResponse.Message"));
		listPipelinesResponse.setHttpStatusCode(_ctx.integerValue("ListPipelinesResponse.HttpStatusCode"));
		listPipelinesResponse.setCode(_ctx.stringValue("ListPipelinesResponse.Code"));
		listPipelinesResponse.setSuccess(_ctx.booleanValue("ListPipelinesResponse.Success"));

		Data data = new Data();
		data.setNextCursor(_ctx.longValue("ListPipelinesResponse.Data.NextCursor"));
		data.setPageNum(_ctx.integerValue("ListPipelinesResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("ListPipelinesResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("ListPipelinesResponse.Data.Total"));

		List<Pipeline> list = new ArrayList<Pipeline>();
		for (int i = 0; i < _ctx.lengthValue("ListPipelinesResponse.Data.List.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setScheduleType(_ctx.integerValue("ListPipelinesResponse.Data.List["+ i +"].ScheduleType"));
			pipeline.setNodeName(_ctx.stringValue("ListPipelinesResponse.Data.List["+ i +"].NodeName"));
			pipeline.setTaskType(_ctx.integerValue("ListPipelinesResponse.Data.List["+ i +"].TaskType"));
			pipeline.setNodeId(_ctx.stringValue("ListPipelinesResponse.Data.List["+ i +"].NodeId"));
			pipeline.setPipelineId(_ctx.longValue("ListPipelinesResponse.Data.List["+ i +"].PipelineId"));
			pipeline.setFileId(_ctx.longValue("ListPipelinesResponse.Data.List["+ i +"].FileId"));
			pipeline.setTaskStatus(_ctx.stringValue("ListPipelinesResponse.Data.List["+ i +"].TaskStatus"));
			pipeline.setDirectory(_ctx.stringValue("ListPipelinesResponse.Data.List["+ i +"].Directory"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPipelinesResponse.Data.List["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("ListPipelinesResponse.Data.List["+ i +"].Tags["+ j +"]"));
			}
			pipeline.setTags(tags);

			List<String> developOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPipelinesResponse.Data.List["+ i +"].DevelopOwners.Length"); j++) {
				developOwners.add(_ctx.stringValue("ListPipelinesResponse.Data.List["+ i +"].DevelopOwners["+ j +"]"));
			}
			pipeline.setDevelopOwners(developOwners);

			List<String> opsOwners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPipelinesResponse.Data.List["+ i +"].OpsOwners.Length"); j++) {
				opsOwners.add(_ctx.stringValue("ListPipelinesResponse.Data.List["+ i +"].OpsOwners["+ j +"]"));
			}
			pipeline.setOpsOwners(opsOwners);

			list.add(pipeline);
		}
		data.setList(list);
		listPipelinesResponse.setData(data);
	 
	 	return listPipelinesResponse;
	}
}