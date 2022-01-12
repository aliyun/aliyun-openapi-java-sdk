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

import com.aliyuncs.outboundbot.model.v20191226.ModifyJobGroupResponse;
import com.aliyuncs.outboundbot.model.v20191226.ModifyJobGroupResponse.JobGroup;
import com.aliyuncs.outboundbot.model.v20191226.ModifyJobGroupResponse.JobGroup.ExportProgress;
import com.aliyuncs.outboundbot.model.v20191226.ModifyJobGroupResponse.JobGroup.RecallStrategy;
import com.aliyuncs.outboundbot.model.v20191226.ModifyJobGroupResponse.JobGroup.Strategy;
import com.aliyuncs.outboundbot.model.v20191226.ModifyJobGroupResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyJobGroupResponseUnmarshaller {

	public static ModifyJobGroupResponse unmarshall(ModifyJobGroupResponse modifyJobGroupResponse, UnmarshallerContext _ctx) {
		
		modifyJobGroupResponse.setRequestId(_ctx.stringValue("ModifyJobGroupResponse.RequestId"));
		modifyJobGroupResponse.setHttpStatusCode(_ctx.integerValue("ModifyJobGroupResponse.HttpStatusCode"));
		modifyJobGroupResponse.setCode(_ctx.stringValue("ModifyJobGroupResponse.Code"));
		modifyJobGroupResponse.setMessage(_ctx.stringValue("ModifyJobGroupResponse.Message"));
		modifyJobGroupResponse.setSuccess(_ctx.booleanValue("ModifyJobGroupResponse.Success"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setStatus(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Status"));
		jobGroup.setScenarioId(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ScenarioId"));
		jobGroup.setJobGroupId(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.JobGroupId"));
		jobGroup.setCreationTime(_ctx.longValue("ModifyJobGroupResponse.JobGroup.CreationTime"));
		jobGroup.setJobGroupName(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.JobGroupName"));
		jobGroup.setJobFilePath(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.JobFilePath"));
		jobGroup.setJobGroupDescription(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.JobGroupDescription"));
		jobGroup.setJobDataParsingTaskId(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.JobDataParsingTaskId"));
		jobGroup.setScriptName(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ScriptName"));
		jobGroup.setScriptVersion(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ScriptVersion"));
		jobGroup.setModifyTime(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ModifyTime"));
		jobGroup.setRingingDuration(_ctx.longValue("ModifyJobGroupResponse.JobGroup.RingingDuration"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyJobGroupResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		ExportProgress exportProgress = new ExportProgress();
		exportProgress.setStatus(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ExportProgress.Status"));
		exportProgress.setFileHttpUrl(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ExportProgress.FileHttpUrl"));
		exportProgress.setProgress(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ExportProgress.Progress"));
		jobGroup.setExportProgress(exportProgress);

		Strategy strategy = new Strategy();
		strategy.setType(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.Type"));
		strategy.setStrategyName(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.StrategyName"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("ModifyJobGroupResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setFollowUpStrategy(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setEndTime(_ctx.longValue("ModifyJobGroupResponse.JobGroup.Strategy.EndTime"));
		strategy.setCustomized(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.Customized"));
		strategy.setIsTemplate(_ctx.booleanValue("ModifyJobGroupResponse.JobGroup.Strategy.IsTemplate"));
		strategy.setStartTime(_ctx.longValue("ModifyJobGroupResponse.JobGroup.Strategy.StartTime"));
		strategy.setStrategyId(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.StrategyId"));
		strategy.setRoutingStrategy(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setMinAttemptInterval(_ctx.integerValue("ModifyJobGroupResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setStrategyDescription(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.StrategyDescription"));
		strategy.setRepeatBy(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.RepeatBy"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyJobGroupResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("ModifyJobGroupResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setEndTime(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));
			timeFrame.setBeginTime(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);

		RecallStrategy recallStrategy = new RecallStrategy();
		recallStrategy.setEmptyNumberIgnore(_ctx.booleanValue("ModifyJobGroupResponse.JobGroup.RecallStrategy.EmptyNumberIgnore"));
		recallStrategy.setInArrearsIgnore(_ctx.booleanValue("ModifyJobGroupResponse.JobGroup.RecallStrategy.InArrearsIgnore"));
		recallStrategy.setOutOfServiceIgnore(_ctx.booleanValue("ModifyJobGroupResponse.JobGroup.RecallStrategy.OutOfServiceIgnore"));
		jobGroup.setRecallStrategy(recallStrategy);
		modifyJobGroupResponse.setJobGroup(jobGroup);
	 
	 	return modifyJobGroupResponse;
	}
}