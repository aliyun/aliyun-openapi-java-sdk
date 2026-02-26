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

import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupResponse.JobGroup;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupResponse.JobGroup.ExportProgress;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupResponse.JobGroup.FlashSmsExtras;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupResponse.JobGroup.Progress;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupResponse.JobGroup.Progress.KeyValuePair;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupResponse.JobGroup.RecallStrategy;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupResponse.JobGroup.Result;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupResponse.JobGroup.Strategy;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobGroupResponseUnmarshaller {

	public static DescribeJobGroupResponse unmarshall(DescribeJobGroupResponse describeJobGroupResponse, UnmarshallerContext _ctx) {
		
		describeJobGroupResponse.setRequestId(_ctx.stringValue("DescribeJobGroupResponse.RequestId"));
		describeJobGroupResponse.setHttpStatusCode(_ctx.integerValue("DescribeJobGroupResponse.HttpStatusCode"));
		describeJobGroupResponse.setCode(_ctx.stringValue("DescribeJobGroupResponse.Code"));
		describeJobGroupResponse.setMessage(_ctx.stringValue("DescribeJobGroupResponse.Message"));
		describeJobGroupResponse.setSuccess(_ctx.booleanValue("DescribeJobGroupResponse.Success"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setCreationTime(_ctx.longValue("DescribeJobGroupResponse.JobGroup.CreationTime"));
		jobGroup.setStatus(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Status"));
		jobGroup.setJobGroupName(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.JobGroupName"));
		jobGroup.setScriptId(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.ScriptId"));
		jobGroup.setJobGroupId(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.JobGroupId"));
		jobGroup.setScenarioId(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.ScenarioId"));
		jobGroup.setJobFilePath(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.JobFilePath"));
		jobGroup.setJobGroupDescription(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.JobGroupDescription"));
		jobGroup.setJobDataParsingTaskId(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.JobDataParsingTaskId"));
		jobGroup.setScriptName(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.ScriptName"));
		jobGroup.setModifyTime(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.ModifyTime"));
		jobGroup.setScriptVersion(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.ScriptVersion"));
		jobGroup.setRingingDuration(_ctx.longValue("DescribeJobGroupResponse.JobGroup.RingingDuration"));
		jobGroup.setPriority(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Priority"));
		jobGroup.setMinConcurrency(_ctx.longValue("DescribeJobGroupResponse.JobGroup.MinConcurrency"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobGroupResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		List<String> recallCallingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobGroupResponse.JobGroup.RecallCallingNumbers.Length"); i++) {
			recallCallingNumbers.add(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.RecallCallingNumbers["+ i +"]"));
		}
		jobGroup.setRecallCallingNumbers(recallCallingNumbers);

		ExportProgress exportProgress = new ExportProgress();
		exportProgress.setStatus(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.ExportProgress.Status"));
		exportProgress.setFileHttpUrl(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.ExportProgress.FileHttpUrl"));
		exportProgress.setProgress(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.ExportProgress.Progress"));
		jobGroup.setExportProgress(exportProgress);

		Progress progress = new Progress();
		progress.setTotalNotAnswered(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.TotalNotAnswered"));
		progress.setStatus(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Progress.Status"));
		progress.setStartTime(_ctx.longValue("DescribeJobGroupResponse.JobGroup.Progress.StartTime"));
		progress.setFailed(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.Failed"));
		progress.setExecuting(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.Executing"));
		progress.setTotalJobs(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.TotalJobs"));
		progress.setTotalCompleted(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.TotalCompleted"));
		progress.setDuration(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.Duration"));
		progress.setScheduling(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.Scheduling"));
		progress.setPaused(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.Paused"));
		progress.setCancelled(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.Cancelled"));

		List<KeyValuePair> briefs = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobGroupResponse.JobGroup.Progress.Briefs.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Progress.Briefs["+ i +"].Key"));
			keyValuePair.setValue(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Progress.Briefs["+ i +"].Value"));

			briefs.add(keyValuePair);
		}
		progress.setBriefs(briefs);

		List<KeyValuePair> categories = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobGroupResponse.JobGroup.Progress.Categories.Length"); i++) {
			KeyValuePair keyValuePair1 = new KeyValuePair();
			keyValuePair1.setKey(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Progress.Categories["+ i +"].Key"));
			keyValuePair1.setValue(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Progress.Categories["+ i +"].Value"));

			categories.add(keyValuePair1);
		}
		progress.setCategories(categories);
		jobGroup.setProgress(progress);

		Strategy strategy = new Strategy();
		strategy.setType(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.Type"));
		strategy.setStrategyName(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.StrategyName"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setFollowUpStrategy(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setEndTime(_ctx.longValue("DescribeJobGroupResponse.JobGroup.Strategy.EndTime"));
		strategy.setCustomized(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.Customized"));
		strategy.setIsTemplate(_ctx.booleanValue("DescribeJobGroupResponse.JobGroup.Strategy.IsTemplate"));
		strategy.setStartTime(_ctx.longValue("DescribeJobGroupResponse.JobGroup.Strategy.StartTime"));
		strategy.setStrategyId(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.StrategyId"));
		strategy.setRoutingStrategy(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setMinAttemptInterval(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setStrategyDescription(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.StrategyDescription"));
		strategy.setRepeatBy(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.RepeatBy"));
		strategy.setRepeatable(_ctx.booleanValue("DescribeJobGroupResponse.JobGroup.Strategy.Repeatable"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobGroupResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobGroupResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setEndTime(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));
			timeFrame.setBeginTime(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);

		RecallStrategy recallStrategy = new RecallStrategy();
		recallStrategy.setEmptyNumberIgnore(_ctx.booleanValue("DescribeJobGroupResponse.JobGroup.RecallStrategy.EmptyNumberIgnore"));
		recallStrategy.setInArrearsIgnore(_ctx.booleanValue("DescribeJobGroupResponse.JobGroup.RecallStrategy.InArrearsIgnore"));
		recallStrategy.setOutOfServiceIgnore(_ctx.booleanValue("DescribeJobGroupResponse.JobGroup.RecallStrategy.OutOfServiceIgnore"));
		jobGroup.setRecallStrategy(recallStrategy);

		Result result = new Result();
		result.setTimeoutHangupNum(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Result.TimeoutHangupNum"));
		result.setFinishedNum(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Result.FinishedNum"));
		result.setNoInteractNum(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Result.NoInteractNum"));
		result.setClientHangupNum(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Result.ClientHangupNum"));
		result.setUnrecognizedNum(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Result.UnrecognizedNum"));
		jobGroup.setResult(result);

		FlashSmsExtras flashSmsExtras = new FlashSmsExtras();
		flashSmsExtras.setConfigId(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.FlashSmsExtras.ConfigId"));
		flashSmsExtras.setTemplateId(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.FlashSmsExtras.TemplateId"));
		jobGroup.setFlashSmsExtras(flashSmsExtras);
		describeJobGroupResponse.setJobGroup(jobGroup);
	 
	 	return describeJobGroupResponse;
	}
}