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
import com.aliyuncs.outboundbot.model.v20191226.CreateJobGroupResponse.JobGroup.RecallStrategy;
import com.aliyuncs.outboundbot.model.v20191226.CreateJobGroupResponse.JobGroup.Strategy;
import com.aliyuncs.outboundbot.model.v20191226.CreateJobGroupResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateJobGroupResponseUnmarshaller {

	public static CreateJobGroupResponse unmarshall(CreateJobGroupResponse createJobGroupResponse, UnmarshallerContext _ctx) {
		
		createJobGroupResponse.setRequestId(_ctx.stringValue("CreateJobGroupResponse.RequestId"));
		createJobGroupResponse.setHttpStatusCode(_ctx.integerValue("CreateJobGroupResponse.HttpStatusCode"));
		createJobGroupResponse.setCode(_ctx.stringValue("CreateJobGroupResponse.Code"));
		createJobGroupResponse.setMessage(_ctx.stringValue("CreateJobGroupResponse.Message"));
		createJobGroupResponse.setSuccess(_ctx.booleanValue("CreateJobGroupResponse.Success"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setStatus(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Status"));
		jobGroup.setScenarioId(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ScenarioId"));
		jobGroup.setJobGroupId(_ctx.stringValue("CreateJobGroupResponse.JobGroup.JobGroupId"));
		jobGroup.setCreationTime(_ctx.longValue("CreateJobGroupResponse.JobGroup.CreationTime"));
		jobGroup.setJobGroupName(_ctx.stringValue("CreateJobGroupResponse.JobGroup.JobGroupName"));
		jobGroup.setJobFilePath(_ctx.stringValue("CreateJobGroupResponse.JobGroup.JobFilePath"));
		jobGroup.setJobGroupDescription(_ctx.stringValue("CreateJobGroupResponse.JobGroup.JobGroupDescription"));
		jobGroup.setJobDataParsingTaskId(_ctx.stringValue("CreateJobGroupResponse.JobGroup.JobDataParsingTaskId"));
		jobGroup.setScriptName(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ScriptName"));
		jobGroup.setScriptVersion(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ScriptVersion"));
		jobGroup.setModifyTime(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ModifyTime"));
		jobGroup.setRingingDuration(_ctx.longValue("CreateJobGroupResponse.JobGroup.RingingDuration"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateJobGroupResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("CreateJobGroupResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		ExportProgress exportProgress = new ExportProgress();
		exportProgress.setStatus(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ExportProgress.Status"));
		exportProgress.setFileHttpUrl(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ExportProgress.FileHttpUrl"));
		exportProgress.setProgress(_ctx.stringValue("CreateJobGroupResponse.JobGroup.ExportProgress.Progress"));
		jobGroup.setExportProgress(exportProgress);

		Strategy strategy = new Strategy();
		strategy.setType(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.Type"));
		strategy.setStrategyName(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.StrategyName"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("CreateJobGroupResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setFollowUpStrategy(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setEndTime(_ctx.longValue("CreateJobGroupResponse.JobGroup.Strategy.EndTime"));
		strategy.setCustomized(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.Customized"));
		strategy.setIsTemplate(_ctx.booleanValue("CreateJobGroupResponse.JobGroup.Strategy.IsTemplate"));
		strategy.setStartTime(_ctx.longValue("CreateJobGroupResponse.JobGroup.Strategy.StartTime"));
		strategy.setStrategyId(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.StrategyId"));
		strategy.setRoutingStrategy(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setMinAttemptInterval(_ctx.integerValue("CreateJobGroupResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setStrategyDescription(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.StrategyDescription"));
		strategy.setRepeatBy(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.RepeatBy"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateJobGroupResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("CreateJobGroupResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setEndTime(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));
			timeFrame.setBeginTime(_ctx.stringValue("CreateJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);

		RecallStrategy recallStrategy = new RecallStrategy();
		recallStrategy.setEmptyNumberIgnore(_ctx.booleanValue("CreateJobGroupResponse.JobGroup.RecallStrategy.EmptyNumberIgnore"));
		recallStrategy.setInArrearsIgnore(_ctx.booleanValue("CreateJobGroupResponse.JobGroup.RecallStrategy.InArrearsIgnore"));
		recallStrategy.setOutOfServiceIgnore(_ctx.booleanValue("CreateJobGroupResponse.JobGroup.RecallStrategy.OutOfServiceIgnore"));
		jobGroup.setRecallStrategy(recallStrategy);
		createJobGroupResponse.setJobGroup(jobGroup);
	 
	 	return createJobGroupResponse;
	}
}