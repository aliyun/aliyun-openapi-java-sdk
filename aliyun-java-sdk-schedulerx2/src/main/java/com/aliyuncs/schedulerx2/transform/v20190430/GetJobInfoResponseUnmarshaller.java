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

import com.aliyuncs.schedulerx2.model.v20190430.GetJobInfoResponse;
import com.aliyuncs.schedulerx2.model.v20190430.GetJobInfoResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.GetJobInfoResponse.Data.JobConfigInfo;
import com.aliyuncs.schedulerx2.model.v20190430.GetJobInfoResponse.Data.JobConfigInfo.JobMonitorInfo;
import com.aliyuncs.schedulerx2.model.v20190430.GetJobInfoResponse.Data.JobConfigInfo.JobMonitorInfo.ContactInfoItem;
import com.aliyuncs.schedulerx2.model.v20190430.GetJobInfoResponse.Data.JobConfigInfo.JobMonitorInfo.MonitorConfig;
import com.aliyuncs.schedulerx2.model.v20190430.GetJobInfoResponse.Data.JobConfigInfo.MapTaskXAttrs;
import com.aliyuncs.schedulerx2.model.v20190430.GetJobInfoResponse.Data.JobConfigInfo.TimeConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobInfoResponseUnmarshaller {

	public static GetJobInfoResponse unmarshall(GetJobInfoResponse getJobInfoResponse, UnmarshallerContext _ctx) {
		
		getJobInfoResponse.setRequestId(_ctx.stringValue("GetJobInfoResponse.RequestId"));
		getJobInfoResponse.setMessage(_ctx.stringValue("GetJobInfoResponse.Message"));
		getJobInfoResponse.setCode(_ctx.integerValue("GetJobInfoResponse.Code"));
		getJobInfoResponse.setSuccess(_ctx.booleanValue("GetJobInfoResponse.Success"));

		Data data = new Data();

		JobConfigInfo jobConfigInfo = new JobConfigInfo();
		jobConfigInfo.setStatus(_ctx.integerValue("GetJobInfoResponse.Data.JobConfigInfo.Status"));
		jobConfigInfo.setMaxAttempt(_ctx.integerValue("GetJobInfoResponse.Data.JobConfigInfo.MaxAttempt"));
		jobConfigInfo.setParameters(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.Parameters"));
		jobConfigInfo.setDescription(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.Description"));
		jobConfigInfo.setJarUrl(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.JarUrl"));
		jobConfigInfo.setMaxConcurrency(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.MaxConcurrency"));
		jobConfigInfo.setName(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.Name"));
		jobConfigInfo.setJobType(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.JobType"));
		jobConfigInfo.setContent(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.Content"));
		jobConfigInfo.setClassName(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.ClassName"));
		jobConfigInfo.setAttemptInterval(_ctx.integerValue("GetJobInfoResponse.Data.JobConfigInfo.AttemptInterval"));
		jobConfigInfo.setExecuteMode(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.ExecuteMode"));
		jobConfigInfo.setJobId(_ctx.longValue("GetJobInfoResponse.Data.JobConfigInfo.JobId"));
		jobConfigInfo.setXAttrs(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.XAttrs"));

		TimeConfig timeConfig = new TimeConfig();
		timeConfig.setCalendar(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.TimeConfig.Calendar"));
		timeConfig.setTimeExpression(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.TimeConfig.TimeExpression"));
		timeConfig.setDataOffset(_ctx.integerValue("GetJobInfoResponse.Data.JobConfigInfo.TimeConfig.DataOffset"));
		timeConfig.setTimeType(_ctx.integerValue("GetJobInfoResponse.Data.JobConfigInfo.TimeConfig.TimeType"));
		jobConfigInfo.setTimeConfig(timeConfig);

		MapTaskXAttrs mapTaskXAttrs = new MapTaskXAttrs();
		mapTaskXAttrs.setTaskAttemptInterval(_ctx.integerValue("GetJobInfoResponse.Data.JobConfigInfo.MapTaskXAttrs.TaskAttemptInterval"));
		mapTaskXAttrs.setQueueSize(_ctx.integerValue("GetJobInfoResponse.Data.JobConfigInfo.MapTaskXAttrs.QueueSize"));
		mapTaskXAttrs.setDispatcherSize(_ctx.integerValue("GetJobInfoResponse.Data.JobConfigInfo.MapTaskXAttrs.DispatcherSize"));
		mapTaskXAttrs.setPageSize(_ctx.integerValue("GetJobInfoResponse.Data.JobConfigInfo.MapTaskXAttrs.PageSize"));
		mapTaskXAttrs.setTaskMaxAttempt(_ctx.integerValue("GetJobInfoResponse.Data.JobConfigInfo.MapTaskXAttrs.TaskMaxAttempt"));
		mapTaskXAttrs.setConsumerSize(_ctx.integerValue("GetJobInfoResponse.Data.JobConfigInfo.MapTaskXAttrs.ConsumerSize"));
		jobConfigInfo.setMapTaskXAttrs(mapTaskXAttrs);

		JobMonitorInfo jobMonitorInfo = new JobMonitorInfo();

		MonitorConfig monitorConfig = new MonitorConfig();
		monitorConfig.setTimeoutEnable(_ctx.booleanValue("GetJobInfoResponse.Data.JobConfigInfo.JobMonitorInfo.MonitorConfig.TimeoutEnable"));
		monitorConfig.setTimeout(_ctx.longValue("GetJobInfoResponse.Data.JobConfigInfo.JobMonitorInfo.MonitorConfig.Timeout"));
		monitorConfig.setMissWorkerEnable(_ctx.booleanValue("GetJobInfoResponse.Data.JobConfigInfo.JobMonitorInfo.MonitorConfig.MissWorkerEnable"));
		monitorConfig.setFailEnable(_ctx.booleanValue("GetJobInfoResponse.Data.JobConfigInfo.JobMonitorInfo.MonitorConfig.FailEnable"));
		monitorConfig.setSendChannel(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.JobMonitorInfo.MonitorConfig.SendChannel"));
		monitorConfig.setTimeoutKillEnable(_ctx.booleanValue("GetJobInfoResponse.Data.JobConfigInfo.JobMonitorInfo.MonitorConfig.TimeoutKillEnable"));
		jobMonitorInfo.setMonitorConfig(monitorConfig);

		List<ContactInfoItem> contactInfo = new ArrayList<ContactInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("GetJobInfoResponse.Data.JobConfigInfo.JobMonitorInfo.ContactInfo.Length"); i++) {
			ContactInfoItem contactInfoItem = new ContactInfoItem();
			contactInfoItem.setUserName(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.JobMonitorInfo.ContactInfo["+ i +"].UserName"));
			contactInfoItem.setUserPhone(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.JobMonitorInfo.ContactInfo["+ i +"].UserPhone"));
			contactInfoItem.setUserMail(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.JobMonitorInfo.ContactInfo["+ i +"].UserMail"));
			contactInfoItem.setDing(_ctx.stringValue("GetJobInfoResponse.Data.JobConfigInfo.JobMonitorInfo.ContactInfo["+ i +"].Ding"));

			contactInfo.add(contactInfoItem);
		}
		jobMonitorInfo.setContactInfo(contactInfo);
		jobConfigInfo.setJobMonitorInfo(jobMonitorInfo);
		data.setJobConfigInfo(jobConfigInfo);
		getJobInfoResponse.setData(data);
	 
	 	return getJobInfoResponse;
	}
}