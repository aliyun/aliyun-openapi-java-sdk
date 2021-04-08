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

import com.aliyuncs.dts.model.v20200101.DescribePreCheckStatusResponse;
import com.aliyuncs.dts.model.v20200101.DescribePreCheckStatusResponse.ProgressInfo;
import com.aliyuncs.dts.model.v20200101.DescribePreCheckStatusResponse.ProgressInfo.JobLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePreCheckStatusResponseUnmarshaller {

	public static DescribePreCheckStatusResponse unmarshall(DescribePreCheckStatusResponse describePreCheckStatusResponse, UnmarshallerContext _ctx) {
		
		describePreCheckStatusResponse.setRequestId(_ctx.stringValue("DescribePreCheckStatusResponse.RequestId"));
		describePreCheckStatusResponse.setCode(_ctx.stringValue("DescribePreCheckStatusResponse.Code"));
		describePreCheckStatusResponse.setErrorItem(_ctx.integerValue("DescribePreCheckStatusResponse.ErrorItem"));
		describePreCheckStatusResponse.setHttpStatusCode(_ctx.integerValue("DescribePreCheckStatusResponse.HttpStatusCode"));
		describePreCheckStatusResponse.setJobName(_ctx.stringValue("DescribePreCheckStatusResponse.JobName"));
		describePreCheckStatusResponse.setState(_ctx.stringValue("DescribePreCheckStatusResponse.State"));
		describePreCheckStatusResponse.setSuccess(_ctx.booleanValue("DescribePreCheckStatusResponse.Success"));
		describePreCheckStatusResponse.setTotal(_ctx.integerValue("DescribePreCheckStatusResponse.Total"));

		List<ProgressInfo> jobProgress = new ArrayList<ProgressInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribePreCheckStatusResponse.JobProgress.Length"); i++) {
			ProgressInfo progressInfo = new ProgressInfo();
			progressInfo.setBootTime(_ctx.longValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].BootTime"));
			progressInfo.setCanSkip(_ctx.booleanValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].CanSkip"));
			progressInfo.setDelaySeconds(_ctx.integerValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].DelaySeconds"));
			progressInfo.setFinishTime(_ctx.longValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].FinishTime"));
			progressInfo.setIgnoreFlag(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].IgnoreFlag"));
			progressInfo.setItem(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].Item"));
			progressInfo.setJobId(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].JobId"));
			progressInfo.setNames(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].Names"));
			progressInfo.setOrderNum(_ctx.integerValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].OrderNum"));
			progressInfo.setSkip(_ctx.booleanValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].Skip"));
			progressInfo.setState(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].State"));
			progressInfo.setSub(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].Sub"));
			progressInfo.setRepairMethod(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].RepairMethod"));
			progressInfo.setTargetNames(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].TargetNames"));
			progressInfo.setTotal(_ctx.integerValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].Total"));
			progressInfo.setSourceSchema(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].SourceSchema"));
			progressInfo.setParentObj(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].ParentObj"));
			progressInfo.setDiffRow(_ctx.longValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].DiffRow"));
			progressInfo.setDestSchema(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].DestSchema"));
			progressInfo.setErrDetail(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].ErrDetail"));
			progressInfo.setErrMsg(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].ErrMsg"));
			progressInfo.setDdlSql(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].DdlSql"));

			List<JobLog> logs = new ArrayList<JobLog>();
			for (int j = 0; j < _ctx.lengthValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].Logs.Length"); j++) {
				JobLog jobLog = new JobLog();
				jobLog.setErrData(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].Logs["+ j +"].ErrData"));
				jobLog.setErrMsg(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].Logs["+ j +"].ErrMsg"));
				jobLog.setErrType(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].Logs["+ j +"].ErrType"));
				jobLog.setLogLevel(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].Logs["+ j +"].LogLevel"));

				logs.add(jobLog);
			}
			progressInfo.setLogs(logs);

			jobProgress.add(progressInfo);
		}
		describePreCheckStatusResponse.setJobProgress(jobProgress);
	 
	 	return describePreCheckStatusResponse;
	}
}