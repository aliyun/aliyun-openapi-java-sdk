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
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupResponse.JobGroup.Progress;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupResponse.JobGroup.Progress.KeyValuePair;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupResponse.JobGroup.Strategy;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupResponse.JobGroup.Strategy.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobGroupResponseUnmarshaller {

	public static DescribeJobGroupResponse unmarshall(DescribeJobGroupResponse describeJobGroupResponse, UnmarshallerContext _ctx) {
		
		describeJobGroupResponse.setRequestId(_ctx.stringValue("DescribeJobGroupResponse.RequestId"));
		describeJobGroupResponse.setSuccess(_ctx.booleanValue("DescribeJobGroupResponse.Success"));
		describeJobGroupResponse.setCode(_ctx.stringValue("DescribeJobGroupResponse.Code"));
		describeJobGroupResponse.setMessage(_ctx.stringValue("DescribeJobGroupResponse.Message"));
		describeJobGroupResponse.setHttpStatusCode(_ctx.integerValue("DescribeJobGroupResponse.HttpStatusCode"));

		JobGroup jobGroup = new JobGroup();
		jobGroup.setJobGroupId(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.JobGroupId"));
		jobGroup.setJobGroupName(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.JobGroupName"));
		jobGroup.setJobGroupDescription(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.JobGroupDescription"));
		jobGroup.setScenarioId(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.ScenarioId"));
		jobGroup.setScriptId(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.ScriptId"));
		jobGroup.setScriptName(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.ScriptName"));
		jobGroup.setJobFilePath(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.JobFilePath"));
		jobGroup.setCreationTime(_ctx.longValue("DescribeJobGroupResponse.JobGroup.CreationTime"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobGroupResponse.JobGroup.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.CallingNumbers["+ i +"]"));
		}
		jobGroup.setCallingNumbers(callingNumbers);

		Strategy strategy = new Strategy();
		strategy.setStrategyId(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.StrategyId"));
		strategy.setStrategyName(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.StrategyName"));
		strategy.setStrategyDescription(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.StrategyDescription"));
		strategy.setType(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.Type"));
		strategy.setStartTime(_ctx.longValue("DescribeJobGroupResponse.JobGroup.Strategy.StartTime"));
		strategy.setEndTime(_ctx.longValue("DescribeJobGroupResponse.JobGroup.Strategy.EndTime"));
		strategy.setRepeatBy(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.RepeatBy"));
		strategy.setMaxAttemptsPerDay(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Strategy.MaxAttemptsPerDay"));
		strategy.setMinAttemptInterval(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Strategy.MinAttemptInterval"));
		strategy.setCustomized(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.Customized"));
		strategy.setRoutingStrategy(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.RoutingStrategy"));
		strategy.setFollowUpStrategy(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.FollowUpStrategy"));
		strategy.setIsTemplate(_ctx.booleanValue("DescribeJobGroupResponse.JobGroup.Strategy.IsTemplate"));

		List<String> repeatDays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobGroupResponse.JobGroup.Strategy.RepeatDays.Length"); i++) {
			repeatDays.add(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.RepeatDays["+ i +"]"));
		}
		strategy.setRepeatDays(repeatDays);

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobGroupResponse.JobGroup.Strategy.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTime(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTime(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Strategy.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		strategy.setWorkingTime(workingTime);
		jobGroup.setStrategy(strategy);

		Progress progress = new Progress();
		progress.setTotalJobs(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.TotalJobs"));
		progress.setStatus(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Progress.Status"));
		progress.setTotalNotAnswered(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.TotalNotAnswered"));
		progress.setTotalCompleted(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.TotalCompleted"));
		progress.setStartTime(_ctx.longValue("DescribeJobGroupResponse.JobGroup.Progress.StartTime"));
		progress.setDuration(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.Duration"));
		progress.setScheduling(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.Scheduling"));
		progress.setExecuting(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.Executing"));
		progress.setPaused(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.Paused"));
		progress.setFailed(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.Failed"));
		progress.setCancelled(_ctx.integerValue("DescribeJobGroupResponse.JobGroup.Progress.Cancelled"));

		List<KeyValuePair> categories = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobGroupResponse.JobGroup.Progress.Categories.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Progress.Categories["+ i +"].Key"));
			keyValuePair.setValue(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Progress.Categories["+ i +"].Value"));

			categories.add(keyValuePair);
		}
		progress.setCategories(categories);

		List<KeyValuePair> briefs = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobGroupResponse.JobGroup.Progress.Briefs.Length"); i++) {
			KeyValuePair keyValuePair_ = new KeyValuePair();
			keyValuePair_.setKey(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Progress.Briefs["+ i +"].Key"));
			keyValuePair_.setValue(_ctx.stringValue("DescribeJobGroupResponse.JobGroup.Progress.Briefs["+ i +"].Value"));

			briefs.add(keyValuePair_);
		}
		progress.setBriefs(briefs);
		jobGroup.setProgress(progress);
		describeJobGroupResponse.setJobGroup(jobGroup);
	 
	 	return describeJobGroupResponse;
	}
}