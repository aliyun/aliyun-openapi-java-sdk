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

package com.aliyuncs.schedulerx2.transform.v20190430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx2.model.v20190430.ListJobsResponse;
import com.aliyuncs.schedulerx2.model.v20190430.ListJobsResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.ListJobsResponse.Data.Job;
import com.aliyuncs.schedulerx2.model.v20190430.ListJobsResponse.Data.Job.JobMonitorInfo;
import com.aliyuncs.schedulerx2.model.v20190430.ListJobsResponse.Data.Job.JobMonitorInfo.ContactInfoItem;
import com.aliyuncs.schedulerx2.model.v20190430.ListJobsResponse.Data.Job.JobMonitorInfo.MonitorConfig;
import com.aliyuncs.schedulerx2.model.v20190430.ListJobsResponse.Data.Job.MapTaskXAttrs;
import com.aliyuncs.schedulerx2.model.v20190430.ListJobsResponse.Data.Job.TimeConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobsResponseUnmarshaller {

	public static ListJobsResponse unmarshall(ListJobsResponse listJobsResponse, UnmarshallerContext _ctx) {
		
		listJobsResponse.setRequestId(_ctx.stringValue("ListJobsResponse.RequestId"));
		listJobsResponse.setCode(_ctx.integerValue("ListJobsResponse.Code"));
		listJobsResponse.setMessage(_ctx.stringValue("ListJobsResponse.Message"));
		listJobsResponse.setSuccess(_ctx.booleanValue("ListJobsResponse.Success"));

		Data data = new Data();

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("ListJobsResponse.Data.Jobs.Length"); i++) {
			Job job = new Job();
			job.setClassName(_ctx.stringValue("ListJobsResponse.Data.Jobs["+ i +"].ClassName"));
			job.setJarUrl(_ctx.stringValue("ListJobsResponse.Data.Jobs["+ i +"].JarUrl"));
			job.setContent(_ctx.stringValue("ListJobsResponse.Data.Jobs["+ i +"].Content"));
			job.setName(_ctx.stringValue("ListJobsResponse.Data.Jobs["+ i +"].Name"));
			job.setDescription(_ctx.stringValue("ListJobsResponse.Data.Jobs["+ i +"].Description"));
			job.setStatus(_ctx.integerValue("ListJobsResponse.Data.Jobs["+ i +"].Status"));
			job.setExecuteMode(_ctx.stringValue("ListJobsResponse.Data.Jobs["+ i +"].ExecuteMode"));
			job.setParameters(_ctx.stringValue("ListJobsResponse.Data.Jobs["+ i +"].Parameters"));
			job.setMaxConcurrency(_ctx.stringValue("ListJobsResponse.Data.Jobs["+ i +"].MaxConcurrency"));
			job.setMaxAttempt(_ctx.integerValue("ListJobsResponse.Data.Jobs["+ i +"].MaxAttempt"));
			job.setAttemptInterval(_ctx.integerValue("ListJobsResponse.Data.Jobs["+ i +"].AttemptInterval"));
			job.setJobId(_ctx.longValue("ListJobsResponse.Data.Jobs["+ i +"].JobId"));

			MapTaskXAttrs mapTaskXAttrs = new MapTaskXAttrs();
			mapTaskXAttrs.setPageSize(_ctx.integerValue("ListJobsResponse.Data.Jobs["+ i +"].MapTaskXAttrs.PageSize"));
			mapTaskXAttrs.setConsumerSize(_ctx.integerValue("ListJobsResponse.Data.Jobs["+ i +"].MapTaskXAttrs.ConsumerSize"));
			mapTaskXAttrs.setQueueSize(_ctx.integerValue("ListJobsResponse.Data.Jobs["+ i +"].MapTaskXAttrs.QueueSize"));
			mapTaskXAttrs.setDispatcherSize(_ctx.integerValue("ListJobsResponse.Data.Jobs["+ i +"].MapTaskXAttrs.DispatcherSize"));
			mapTaskXAttrs.setTaskMaxAttempt(_ctx.integerValue("ListJobsResponse.Data.Jobs["+ i +"].MapTaskXAttrs.TaskMaxAttempt"));
			mapTaskXAttrs.setTaskAttemptInterval(_ctx.integerValue("ListJobsResponse.Data.Jobs["+ i +"].MapTaskXAttrs.TaskAttemptInterval"));
			job.setMapTaskXAttrs(mapTaskXAttrs);

			TimeConfig timeConfig = new TimeConfig();
			timeConfig.setTimeType(_ctx.integerValue("ListJobsResponse.Data.Jobs["+ i +"].TimeConfig.TimeType"));
			timeConfig.setTimeExpression(_ctx.stringValue("ListJobsResponse.Data.Jobs["+ i +"].TimeConfig.TimeExpression"));
			timeConfig.setCalendar(_ctx.stringValue("ListJobsResponse.Data.Jobs["+ i +"].TimeConfig.Calendar"));
			timeConfig.setDataOffset(_ctx.integerValue("ListJobsResponse.Data.Jobs["+ i +"].TimeConfig.DataOffset"));
			job.setTimeConfig(timeConfig);

			JobMonitorInfo jobMonitorInfo = new JobMonitorInfo();

			MonitorConfig monitorConfig = new MonitorConfig();
			monitorConfig.setTimeoutEnable(_ctx.booleanValue("ListJobsResponse.Data.Jobs["+ i +"].JobMonitorInfo.MonitorConfig.TimeoutEnable"));
			monitorConfig.setTimeout(_ctx.longValue("ListJobsResponse.Data.Jobs["+ i +"].JobMonitorInfo.MonitorConfig.Timeout"));
			monitorConfig.setTimeoutKillEnable(_ctx.booleanValue("ListJobsResponse.Data.Jobs["+ i +"].JobMonitorInfo.MonitorConfig.TimeoutKillEnable"));
			monitorConfig.setFailEnable(_ctx.booleanValue("ListJobsResponse.Data.Jobs["+ i +"].JobMonitorInfo.MonitorConfig.FailEnable"));
			monitorConfig.setSendChannel(_ctx.stringValue("ListJobsResponse.Data.Jobs["+ i +"].JobMonitorInfo.MonitorConfig.SendChannel"));
			jobMonitorInfo.setMonitorConfig(monitorConfig);

			List<ContactInfoItem> contactInfo = new ArrayList<ContactInfoItem>();
			for (int j = 0; j < _ctx.lengthValue("ListJobsResponse.Data.Jobs["+ i +"].JobMonitorInfo.ContactInfo.Length"); j++) {
				ContactInfoItem contactInfoItem = new ContactInfoItem();
				contactInfoItem.setUserName(_ctx.stringValue("ListJobsResponse.Data.Jobs["+ i +"].JobMonitorInfo.ContactInfo["+ j +"].UserName"));
				contactInfoItem.setUserPhone(_ctx.stringValue("ListJobsResponse.Data.Jobs["+ i +"].JobMonitorInfo.ContactInfo["+ j +"].UserPhone"));

				contactInfo.add(contactInfoItem);
			}
			jobMonitorInfo.setContactInfo(contactInfo);
			job.setJobMonitorInfo(jobMonitorInfo);

			jobs.add(job);
		}
		data.setJobs(jobs);
		listJobsResponse.setData(data);
	 
	 	return listJobsResponse;
	}
}