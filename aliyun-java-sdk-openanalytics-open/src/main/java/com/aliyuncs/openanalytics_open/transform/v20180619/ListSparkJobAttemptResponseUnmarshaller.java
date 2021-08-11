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

import com.aliyuncs.openanalytics_open.model.v20180619.ListSparkJobAttemptResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.ListSparkJobAttemptResponse.DataResult;
import com.aliyuncs.openanalytics_open.model.v20180619.ListSparkJobAttemptResponse.DataResult.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSparkJobAttemptResponseUnmarshaller {

	public static ListSparkJobAttemptResponse unmarshall(ListSparkJobAttemptResponse listSparkJobAttemptResponse, UnmarshallerContext _ctx) {
		
		listSparkJobAttemptResponse.setRequestId(_ctx.stringValue("ListSparkJobAttemptResponse.RequestId"));

		DataResult dataResult = new DataResult();
		dataResult.setPageNumber(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.PageNumber"));
		dataResult.setPageSize(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.PageSize"));
		dataResult.setTotalCount(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.TotalCount"));

		List<Data> jobAttemptList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListSparkJobAttemptResponse.DataResult.JobAttemptList.Length"); i++) {
			Data data = new Data();
			data.setCreateTime(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.JobAttemptList["+ i +"].CreateTime"));
			data.setCreateTimeValue(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.JobAttemptList["+ i +"].CreateTimeValue"));
			data.setDetail(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.JobAttemptList["+ i +"].Detail"));
			data.setJobId(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.JobAttemptList["+ i +"].JobId"));
			data.setJobName(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.JobAttemptList["+ i +"].JobName"));
			data.setSparkUI(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.JobAttemptList["+ i +"].SparkUI"));
			data.setStatus(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.JobAttemptList["+ i +"].Status"));
			data.setTerminatedTime(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.JobAttemptList["+ i +"].TerminatedTime"));
			data.setTerminatedTimeValue(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.JobAttemptList["+ i +"].TerminatedTimeValue"));
			data.setVcName(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.JobAttemptList["+ i +"].VcName"));
			data.setJobAttemptId(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.JobAttemptList["+ i +"].JobAttemptId"));
			data.setDurationTime(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.JobAttemptList["+ i +"].DurationTime"));
			data.setDurationTimeValue(_ctx.stringValue("ListSparkJobAttemptResponse.DataResult.JobAttemptList["+ i +"].DurationTimeValue"));

			jobAttemptList.add(data);
		}
		dataResult.setJobAttemptList(jobAttemptList);
		listSparkJobAttemptResponse.setDataResult(dataResult);
	 
	 	return listSparkJobAttemptResponse;
	}
}