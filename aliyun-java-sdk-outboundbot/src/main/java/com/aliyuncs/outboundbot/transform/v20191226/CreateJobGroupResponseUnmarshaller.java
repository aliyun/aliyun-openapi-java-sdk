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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.CreateJobGroupResponse;
import com.aliyuncs.outboundbot.model.v20191226.CreateJobGroupResponse.JobGroup;
import com.aliyuncs.outboundbot.model.v20191226.CreateJobGroupResponse.JobGroup.ExportProgress;
import com.aliyuncs.outboundbot.model.v20191226.CreateJobGroupResponse.JobGroup.Strategy;
import com.aliyuncs.outboundbot.model.v20191226.CreateJobGroupResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateJobGroupResponseUnmarshaller {

	public static CreateJobGroupResponse unmarshall(CreateJobGroupResponse createJobGroupResponse, UnmarshallerContext _ctx) {
		
		createJobGroupResponse.setRequestId(_ctx.stringValue("CreateJobGroupResponse.RequestId"));
		createJobGroupResponse.setCode(_ctx.stringValue("CreateJobGroupResponse.Code"));
		createJobGroupResponse.setHttpStatusCode(_ctx.integerValue("CreateJobGroupResponse.HttpStatusCode"));
		createJobGroupResponse.setMessage(_ctx.stringValue("CreateJobGroupResponse.Message"));
		createJobGroupResponse.setSuccess(_ctx.booleanValue("CreateJobGroupResponse.Success"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setCreationTime(_ctx.longValue("CreateJobGroupResponse.JobGroup.CreationTime"));
		jobGroup.setJobDataParsingTaskId(_ctx.stringValue("CreateJobGroupResponse.JobGroup.JobDataParsingTaskId"));
		jobGroup.setJobFilePath(_ctx.stringValue("CreateJobGroupResponse.JobGroup.JobFilePath"));
		jobGroup.setJobGroupDescription(_ctx.stringValue("CreateJobGroupResponse.JobGroup.JobGroupDescription"));
		jobGroup.setJobGroupId(_ctx.stringValue("CreateJobGroupResponse.JobGroup.JobGroupId"));
		jobGroup.setJobGroupName(_ctx.stringValue("CreateJobGroupResponse.JobGroup.JobGroupName"));
		jobGroup.setModifyTime(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ModifyTime"));
		jobGroup.setScenarioId(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ScenarioId"));
		jobGroup.setScriptName(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ScriptName"));
		jobGroup.setScriptVersion(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ScriptVersion"));
		jobGroup.setStatus(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Status"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateJobGroupResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("CreateJobGroupResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		ExportProgress exportProgress = new ExportProgress();
		exportProgress.setFileHttpUrl(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ExportProgress.FileHttpUrl"));
		exportProgress.setProgress(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ExportProgress.Progress"));
		exportProgress.setStatus(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ExportProgress.Status"));
		jobGroup.setExportProgress(exportProgress);

		Strategy strategy = new Strategy();
		strategy.setCustomized(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.Customized"));
		strategy.setEndTime(_ctx.longValue("CreateJobGroupResponse.JobGroup.Strategy.EndTime"));
		strategy.setFollowUpStrategy(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(_ctx.booleanValue("CreateJobGroupResponse.JobGroup.Strategy.IsTemplate"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("CreateJobGroupResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(_ctx.integerValue("CreateJobGroupResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setRepeatBy(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.RepeatBy"));
		strategy.setRoutingStrategy(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setStartTime(_ctx.longValue("CreateJobGroupResponse.JobGroup.Strategy.StartTime"));
		strategy.setStrategyDescription(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.StrategyDescription"));
		strategy.setStrategyId(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.StrategyId"));
		strategy.setStrategyName(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.StrategyName"));
		strategy.setType(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.Type"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateJobGroupResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("CreateJobGroupResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);
		createJobGroupResponse.setJobGroup(jobGroup);
	 
	 	return createJobGroupResponse;
	}
}