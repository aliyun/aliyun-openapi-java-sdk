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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.DescribeDtsJobLogsResponse;
import com.aliyuncs.dts.model.v20200101.DescribeDtsJobLogsResponse.JobRunningLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDtsJobLogsResponseUnmarshaller {

	public static DescribeDtsJobLogsResponse unmarshall(DescribeDtsJobLogsResponse describeDtsJobLogsResponse, UnmarshallerContext _ctx) {
		
		describeDtsJobLogsResponse.setRequestId(_ctx.stringValue("DescribeDtsJobLogsResponse.RequestId"));
		describeDtsJobLogsResponse.setDynamicCode(_ctx.stringValue("DescribeDtsJobLogsResponse.DynamicCode"));
		describeDtsJobLogsResponse.setDynamicMessage(_ctx.stringValue("DescribeDtsJobLogsResponse.DynamicMessage"));
		describeDtsJobLogsResponse.setErrCode(_ctx.stringValue("DescribeDtsJobLogsResponse.ErrCode"));
		describeDtsJobLogsResponse.setErrMessage(_ctx.stringValue("DescribeDtsJobLogsResponse.ErrMessage"));
		describeDtsJobLogsResponse.setHttpStatusCode(_ctx.integerValue("DescribeDtsJobLogsResponse.HttpStatusCode"));
		describeDtsJobLogsResponse.setSuccess(_ctx.booleanValue("DescribeDtsJobLogsResponse.Success"));
		describeDtsJobLogsResponse.setPageNumber(_ctx.integerValue("DescribeDtsJobLogsResponse.PageNumber"));
		describeDtsJobLogsResponse.setPageRecordCount(_ctx.integerValue("DescribeDtsJobLogsResponse.PageRecordCount"));
		describeDtsJobLogsResponse.setTotalRecordCount(_ctx.longValue("DescribeDtsJobLogsResponse.TotalRecordCount"));

		List<JobRunningLog> jobRunningLogs = new ArrayList<JobRunningLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDtsJobLogsResponse.JobRunningLogs.Length"); i++) {
			JobRunningLog jobRunningLog = new JobRunningLog();
			jobRunningLog.setId(_ctx.longValue("DescribeDtsJobLogsResponse.JobRunningLogs["+ i +"].Id"));
			jobRunningLog.setJobId(_ctx.stringValue("DescribeDtsJobLogsResponse.JobRunningLogs["+ i +"].JobId"));
			jobRunningLog.setLogDatetime(_ctx.longValue("DescribeDtsJobLogsResponse.JobRunningLogs["+ i +"].LogDatetime"));
			jobRunningLog.setContentKey(_ctx.stringValue("DescribeDtsJobLogsResponse.JobRunningLogs["+ i +"].ContentKey"));
			jobRunningLog.setStatus(_ctx.stringValue("DescribeDtsJobLogsResponse.JobRunningLogs["+ i +"].Status"));

			List<String> params = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDtsJobLogsResponse.JobRunningLogs["+ i +"].Params.Length"); j++) {
				params.add(_ctx.stringValue("DescribeDtsJobLogsResponse.JobRunningLogs["+ i +"].Params["+ j +"]"));
			}
			jobRunningLog.setParams(params);

			jobRunningLogs.add(jobRunningLog);
		}
		describeDtsJobLogsResponse.setJobRunningLogs(jobRunningLogs);
	 
	 	return describeDtsJobLogsResponse;
	}
}