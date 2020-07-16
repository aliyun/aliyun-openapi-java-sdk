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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics_open.model.v20180619.ListSparkJobResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.ListSparkJobResponse.DataResult;
import com.aliyuncs.openanalytics_open.model.v20180619.ListSparkJobResponse.DataResult.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSparkJobResponseUnmarshaller {

	public static ListSparkJobResponse unmarshall(ListSparkJobResponse listSparkJobResponse, UnmarshallerContext _ctx) {
		
		listSparkJobResponse.setRequestId(_ctx.stringValue("ListSparkJobResponse.RequestId"));

		DataResult dataResult = new DataResult();
		dataResult.setPageNumber(_ctx.stringValue("ListSparkJobResponse.DataResult.PageNumber"));
		dataResult.setPageSize(_ctx.stringValue("ListSparkJobResponse.DataResult.PageSize"));
		dataResult.setTotalCount(_ctx.stringValue("ListSparkJobResponse.DataResult.TotalCount"));

		List<Data> jobList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListSparkJobResponse.DataResult.JobList.Length"); i++) {
			Data data = new Data();
			data.setCreateTime(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].CreateTime"));
			data.setCreateTimeValue(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].CreateTimeValue"));
			data.setDetail(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].Detail"));
			data.setDriverResourceSpec(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].DriverResourceSpec"));
			data.setExecutorInstances(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].ExecutorInstances"));
			data.setExecutorResourceSpec(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].ExecutorResourceSpec"));
			data.setJobId(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].JobId"));
			data.setJobName(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].JobName"));
			data.setSparkUI(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].SparkUI"));
			data.setStatus(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].Status"));
			data.setSubmitTime(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].SubmitTime"));
			data.setSubmitTimeValue(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].SubmitTimeValue"));
			data.setUpdateTime(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].UpdateTime"));
			data.setUpdateTimeValue(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].UpdateTimeValue"));
			data.setVcName(_ctx.stringValue("ListSparkJobResponse.DataResult.JobList["+ i +"].VcName"));

			jobList.add(data);
		}
		dataResult.setJobList(jobList);
		listSparkJobResponse.setDataResult(dataResult);
	 
	 	return listSparkJobResponse;
	}
}