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
import com.aliyuncs.outboundbot.model.v20191226.ModifyJobGroupResponse.JobGroup.Strategy;
import com.aliyuncs.outboundbot.model.v20191226.ModifyJobGroupResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyJobGroupResponseUnmarshaller {

	public static ModifyJobGroupResponse unmarshall(ModifyJobGroupResponse modifyJobGroupResponse, UnmarshallerContext _ctx) {
		
		modifyJobGroupResponse.setRequestId(_ctx.stringValue("ModifyJobGroupResponse.RequestId"));
		modifyJobGroupResponse.setCode(_ctx.stringValue("ModifyJobGroupResponse.Code"));
		modifyJobGroupResponse.setHttpStatusCode(_ctx.integerValue("ModifyJobGroupResponse.HttpStatusCode"));
		modifyJobGroupResponse.setMessage(_ctx.stringValue("ModifyJobGroupResponse.Message"));
		modifyJobGroupResponse.setSuccess(_ctx.booleanValue("ModifyJobGroupResponse.Success"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setCreationTime(_ctx.longValue("ModifyJobGroupResponse.JobGroup.CreationTime"));
		jobGroup.setJobDataParsingTaskId(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.JobDataParsingTaskId"));
		jobGroup.setJobFilePath(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.JobFilePath"));
		jobGroup.setJobGroupDescription(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.JobGroupDescription"));
		jobGroup.setJobGroupId(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.JobGroupId"));
		jobGroup.setJobGroupName(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.JobGroupName"));
		jobGroup.setModifyTime(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ModifyTime"));
		jobGroup.setScenarioId(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ScenarioId"));
		jobGroup.setScriptName(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ScriptName"));
		jobGroup.setScriptVersion(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ScriptVersion"));
		jobGroup.setStatus(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Status"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyJobGroupResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		ExportProgress exportProgress = new ExportProgress();
		exportProgress.setFileHttpUrl(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ExportProgress.FileHttpUrl"));
		exportProgress.setProgress(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ExportProgress.Progress"));
		exportProgress.setStatus(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.ExportProgress.Status"));
		jobGroup.setExportProgress(exportProgress);

		Strategy strategy = new Strategy();
		strategy.setCustomized(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.Customized"));
		strategy.setEndTime(_ctx.longValue("ModifyJobGroupResponse.JobGroup.Strategy.EndTime"));
		strategy.setFollowUpStrategy(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(_ctx.booleanValue("ModifyJobGroupResponse.JobGroup.Strategy.IsTemplate"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("ModifyJobGroupResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(_ctx.integerValue("ModifyJobGroupResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setRepeatBy(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.RepeatBy"));
		strategy.setRoutingStrategy(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setStartTime(_ctx.longValue("ModifyJobGroupResponse.JobGroup.Strategy.StartTime"));
		strategy.setStrategyDescription(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.StrategyDescription"));
		strategy.setStrategyId(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.StrategyId"));
		strategy.setStrategyName(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.StrategyName"));
		strategy.setType(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.Type"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyJobGroupResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("ModifyJobGroupResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(_ctx.stringValue("ModifyJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);
		modifyJobGroupResponse.setJobGroup(jobGroup);
	 
	 	return modifyJobGroupResponse;
	}
}