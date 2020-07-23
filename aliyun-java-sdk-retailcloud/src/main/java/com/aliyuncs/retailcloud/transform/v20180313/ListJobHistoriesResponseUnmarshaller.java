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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListJobHistoriesResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListJobHistoriesResponse.JobDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobHistoriesResponseUnmarshaller {

	public static ListJobHistoriesResponse unmarshall(ListJobHistoriesResponse listJobHistoriesResponse, UnmarshallerContext _ctx) {
		
		listJobHistoriesResponse.setRequestId(_ctx.stringValue("ListJobHistoriesResponse.RequestId"));
		listJobHistoriesResponse.setCode(_ctx.integerValue("ListJobHistoriesResponse.Code"));
		listJobHistoriesResponse.setPageNumber(_ctx.integerValue("ListJobHistoriesResponse.PageNumber"));
		listJobHistoriesResponse.setPageSize(_ctx.integerValue("ListJobHistoriesResponse.PageSize"));
		listJobHistoriesResponse.setTotalCount(_ctx.longValue("ListJobHistoriesResponse.TotalCount"));
		listJobHistoriesResponse.setErrorMsg(_ctx.stringValue("ListJobHistoriesResponse.ErrorMsg"));

		List<JobDetail> data = new ArrayList<JobDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListJobHistoriesResponse.Data.Length"); i++) {
			JobDetail jobDetail = new JobDetail();
			jobDetail.setName(_ctx.stringValue("ListJobHistoriesResponse.Data["+ i +"].Name"));
			jobDetail.setCompletionTime(_ctx.stringValue("ListJobHistoriesResponse.Data["+ i +"].CompletionTime"));
			jobDetail.setStartTime(_ctx.stringValue("ListJobHistoriesResponse.Data["+ i +"].StartTime"));
			jobDetail.setSucceeded(_ctx.integerValue("ListJobHistoriesResponse.Data["+ i +"].Succeeded"));
			jobDetail.setFailed(_ctx.integerValue("ListJobHistoriesResponse.Data["+ i +"].Failed"));
			jobDetail.setMessage(_ctx.stringValue("ListJobHistoriesResponse.Data["+ i +"].Message"));
			jobDetail.setActiveDeadlineSeconds(_ctx.integerValue("ListJobHistoriesResponse.Data["+ i +"].ActiveDeadlineSeconds"));
			jobDetail.setBackoffLimit(_ctx.integerValue("ListJobHistoriesResponse.Data["+ i +"].BackoffLimit"));
			jobDetail.setCompletions(_ctx.integerValue("ListJobHistoriesResponse.Data["+ i +"].Completions"));
			jobDetail.setParallelism(_ctx.integerValue("ListJobHistoriesResponse.Data["+ i +"].Parallelism"));

			List<String> podList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListJobHistoriesResponse.Data["+ i +"].PodList.Length"); j++) {
				podList.add(_ctx.stringValue("ListJobHistoriesResponse.Data["+ i +"].PodList["+ j +"]"));
			}
			jobDetail.setPodList(podList);

			data.add(jobDetail);
		}
		listJobHistoriesResponse.setData(data);
	 
	 	return listJobHistoriesResponse;
	}
}