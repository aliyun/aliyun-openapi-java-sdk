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
import com.aliyuncs.dts.model.v20200101.DescribePreCheckStatusResponse.SubDistributedJobStatusItem;
import com.aliyuncs.dts.model.v20200101.DescribePreCheckStatusResponse.SubDistributedJobStatusItem.ProgressInfo2;
import com.aliyuncs.dts.model.v20200101.DescribePreCheckStatusResponse.SubDistributedJobStatusItem.ProgressInfo2.JobLog4;
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
		describePreCheckStatusResponse.setJobId(_ctx.stringValue("DescribePreCheckStatusResponse.JobId"));

		List<ProgressInfo> jobProgress = new ArrayList<ProgressInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribePreCheckStatusResponse.JobProgress.Length"); i++) {
			ProgressInfo progressInfo = new ProgressInfo();
			progressInfo.setSkip(_ctx.booleanValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].Skip"));
			progressInfo.setCanSkip(_ctx.booleanValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].CanSkip"));
			progressInfo.setErrMsg(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].ErrMsg"));
			progressInfo.setBootTime(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].BootTime"));
			progressInfo.setDelaySeconds(_ctx.integerValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].DelaySeconds"));
			progressInfo.setFinishTime(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].FinishTime"));
			progressInfo.setIgnoreFlag(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].IgnoreFlag"));
			progressInfo.setItem(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].Item"));
			progressInfo.setJobId(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].JobId"));
			progressInfo.setNames(_ctx.stringValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].Names"));
			progressInfo.setOrderNum(_ctx.integerValue("DescribePreCheckStatusResponse.JobProgress["+ i +"].OrderNum"));
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

		List<SubDistributedJobStatusItem> subDistributedJobStatus = new ArrayList<SubDistributedJobStatusItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePreCheckStatusResponse.SubDistributedJobStatus.Length"); i++) {
			SubDistributedJobStatusItem subDistributedJobStatusItem = new SubDistributedJobStatusItem();
			subDistributedJobStatusItem.setState(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].State"));
			subDistributedJobStatusItem.setErrorItem(_ctx.integerValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].ErrorItem"));
			subDistributedJobStatusItem.setJobName(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobName"));
			subDistributedJobStatusItem.setJobId(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobId"));
			subDistributedJobStatusItem.setCode(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].Code"));
			subDistributedJobStatusItem.setTotal(_ctx.integerValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].Total"));

			List<ProgressInfo2> jobProgress1 = new ArrayList<ProgressInfo2>();
			for (int j = 0; j < _ctx.lengthValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress.Length"); j++) {
				ProgressInfo2 progressInfo2 = new ProgressInfo2();
				progressInfo2.setSkip(_ctx.booleanValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].Skip"));
				progressInfo2.setCanSkip(_ctx.booleanValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].CanSkip"));
				progressInfo2.setErrMsg(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].ErrMsg"));
				progressInfo2.setBootTime(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].BootTime"));
				progressInfo2.setDelaySeconds(_ctx.integerValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].DelaySeconds"));
				progressInfo2.setFinishTime(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].FinishTime"));
				progressInfo2.setIgnoreFlag(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].IgnoreFlag"));
				progressInfo2.setItem(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].Item"));
				progressInfo2.setJobId(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].JobId"));
				progressInfo2.setNames(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].Names"));
				progressInfo2.setOrderNum(_ctx.integerValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].OrderNum"));
				progressInfo2.setState(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].State"));
				progressInfo2.setSub(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].Sub"));
				progressInfo2.setRepairMethod(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].RepairMethod"));
				progressInfo2.setTargetNames(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].TargetNames"));
				progressInfo2.setTotal(_ctx.integerValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].Total"));
				progressInfo2.setSourceSchema(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].SourceSchema"));
				progressInfo2.setParentObj(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].ParentObj"));
				progressInfo2.setDiffRow(_ctx.longValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].DiffRow"));
				progressInfo2.setDestSchema(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].DestSchema"));
				progressInfo2.setErrDetail(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].ErrDetail"));
				progressInfo2.setDdlSql(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].DdlSql"));

				List<JobLog4> logs3 = new ArrayList<JobLog4>();
				for (int k = 0; k < _ctx.lengthValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].Logs.Length"); k++) {
					JobLog4 jobLog4 = new JobLog4();
					jobLog4.setErrData(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].Logs["+ k +"].ErrData"));
					jobLog4.setErrMsg(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].Logs["+ k +"].ErrMsg"));
					jobLog4.setErrType(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].Logs["+ k +"].ErrType"));
					jobLog4.setLogLevel(_ctx.stringValue("DescribePreCheckStatusResponse.SubDistributedJobStatus["+ i +"].JobProgress["+ j +"].Logs["+ k +"].LogLevel"));

					logs3.add(jobLog4);
				}
				progressInfo2.setLogs3(logs3);

				jobProgress1.add(progressInfo2);
			}
			subDistributedJobStatusItem.setJobProgress1(jobProgress1);

			subDistributedJobStatus.add(subDistributedJobStatusItem);
		}
		describePreCheckStatusResponse.setSubDistributedJobStatus(subDistributedJobStatus);
	 
	 	return describePreCheckStatusResponse;
	}
}