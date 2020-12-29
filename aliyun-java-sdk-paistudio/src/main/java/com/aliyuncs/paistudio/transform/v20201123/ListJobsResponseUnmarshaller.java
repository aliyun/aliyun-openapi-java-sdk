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

package com.aliyuncs.paistudio.transform.v20201123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paistudio.model.v20201123.ListJobsResponse;
import com.aliyuncs.paistudio.model.v20201123.ListJobsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobsResponseUnmarshaller {

	public static ListJobsResponse unmarshall(ListJobsResponse listJobsResponse, UnmarshallerContext _ctx) {
		
		listJobsResponse.setRequestId(_ctx.stringValue("ListJobsResponse.RequestId"));
		listJobsResponse.setMessage(_ctx.stringValue("ListJobsResponse.Message"));
		listJobsResponse.setCode(_ctx.stringValue("ListJobsResponse.Code"));
		listJobsResponse.setTotalCount(_ctx.integerValue("ListJobsResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListJobsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setJobId(_ctx.stringValue("ListJobsResponse.Data["+ i +"].JobId"));
			dataItem.setExperimentId(_ctx.stringValue("ListJobsResponse.Data["+ i +"].ExperimentId"));
			dataItem.setCreator(_ctx.stringValue("ListJobsResponse.Data["+ i +"].Creator"));
			dataItem.setCreateTime(_ctx.stringValue("ListJobsResponse.Data["+ i +"].CreateTime"));
			dataItem.setStatus(_ctx.stringValue("ListJobsResponse.Data["+ i +"].Status"));
			dataItem.setRunId(_ctx.stringValue("ListJobsResponse.Data["+ i +"].RunId"));
			dataItem.setPaiflowNodeId(_ctx.stringValue("ListJobsResponse.Data["+ i +"].PaiflowNodeId"));

			data.add(dataItem);
		}
		listJobsResponse.setData(data);
	 
	 	return listJobsResponse;
	}
}