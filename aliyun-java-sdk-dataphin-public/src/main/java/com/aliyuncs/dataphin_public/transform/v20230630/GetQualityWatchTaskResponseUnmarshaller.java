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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchTaskResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchTaskResponse.WatchTaskInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.StrongRuleCount;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.ValidateRuleCount;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.WeakRuleCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityWatchTaskResponseUnmarshaller {

	public static GetQualityWatchTaskResponse unmarshall(GetQualityWatchTaskResponse getQualityWatchTaskResponse, UnmarshallerContext _ctx) {
		
		getQualityWatchTaskResponse.setRequestId(_ctx.stringValue("GetQualityWatchTaskResponse.RequestId"));
		getQualityWatchTaskResponse.setSuccess(_ctx.booleanValue("GetQualityWatchTaskResponse.Success"));
		getQualityWatchTaskResponse.setHttpStatusCode(_ctx.integerValue("GetQualityWatchTaskResponse.HttpStatusCode"));
		getQualityWatchTaskResponse.setCode(_ctx.stringValue("GetQualityWatchTaskResponse.Code"));
		getQualityWatchTaskResponse.setMessage(_ctx.stringValue("GetQualityWatchTaskResponse.Message"));

		WatchTaskInfo watchTaskInfo = new WatchTaskInfo();
		watchTaskInfo.setId(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.Id"));
		watchTaskInfo.setWatchId(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.WatchId"));
		watchTaskInfo.setStartTime(_ctx.stringValue("GetQualityWatchTaskResponse.WatchTaskInfo.StartTime"));
		watchTaskInfo.setEndTime(_ctx.stringValue("GetQualityWatchTaskResponse.WatchTaskInfo.EndTime"));
		watchTaskInfo.setQualityOwner(_ctx.stringValue("GetQualityWatchTaskResponse.WatchTaskInfo.QualityOwner"));
		watchTaskInfo.setQualityOwnerName(_ctx.stringValue("GetQualityWatchTaskResponse.WatchTaskInfo.QualityOwnerName"));
		watchTaskInfo.setStatus(_ctx.stringValue("GetQualityWatchTaskResponse.WatchTaskInfo.Status"));
		watchTaskInfo.setBizDate(_ctx.stringValue("GetQualityWatchTaskResponse.WatchTaskInfo.BizDate"));
		watchTaskInfo.setBizDateFormat(_ctx.stringValue("GetQualityWatchTaskResponse.WatchTaskInfo.BizDateFormat"));
		watchTaskInfo.setCreator(_ctx.stringValue("GetQualityWatchTaskResponse.WatchTaskInfo.Creator"));
		watchTaskInfo.setCreateTime(_ctx.stringValue("GetQualityWatchTaskResponse.WatchTaskInfo.CreateTime"));
		watchTaskInfo.setModifyTime(_ctx.stringValue("GetQualityWatchTaskResponse.WatchTaskInfo.ModifyTime"));
		watchTaskInfo.setModifier(_ctx.stringValue("GetQualityWatchTaskResponse.WatchTaskInfo.Modifier"));

		List<Long> ruleIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityWatchTaskResponse.WatchTaskInfo.RuleIdList.Length"); i++) {
			ruleIdList.add(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.RuleIdList["+ i +"]"));
		}
		watchTaskInfo.setRuleIdList(ruleIdList);

		RuleCountInfo ruleCountInfo = new RuleCountInfo();

		ValidateRuleCount validateRuleCount = new ValidateRuleCount();
		validateRuleCount.setTotalRuleCount(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.ValidateRuleCount.TotalRuleCount"));
		validateRuleCount.setFinishedRuleCount(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.ValidateRuleCount.FinishedRuleCount"));
		validateRuleCount.setErrorRuleCount(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.ValidateRuleCount.ErrorRuleCount"));
		validateRuleCount.setSuccessRuleCount(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.ValidateRuleCount.SuccessRuleCount"));
		ruleCountInfo.setValidateRuleCount(validateRuleCount);

		StrongRuleCount strongRuleCount = new StrongRuleCount();
		strongRuleCount.setTotalRuleCount(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.StrongRuleCount.TotalRuleCount"));
		strongRuleCount.setFinishedRuleCount(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.StrongRuleCount.FinishedRuleCount"));
		strongRuleCount.setErrorRuleCount(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.StrongRuleCount.ErrorRuleCount"));
		strongRuleCount.setSuccessRuleCount(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.StrongRuleCount.SuccessRuleCount"));
		ruleCountInfo.setStrongRuleCount(strongRuleCount);

		WeakRuleCount weakRuleCount = new WeakRuleCount();
		weakRuleCount.setTotalRuleCount(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.WeakRuleCount.TotalRuleCount"));
		weakRuleCount.setFinishedRuleCount(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.WeakRuleCount.FinishedRuleCount"));
		weakRuleCount.setErrorRuleCount(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.WeakRuleCount.ErrorRuleCount"));
		weakRuleCount.setSuccessRuleCount(_ctx.longValue("GetQualityWatchTaskResponse.WatchTaskInfo.RuleCountInfo.WeakRuleCount.SuccessRuleCount"));
		ruleCountInfo.setWeakRuleCount(weakRuleCount);
		watchTaskInfo.setRuleCountInfo(ruleCountInfo);
		getQualityWatchTaskResponse.setWatchTaskInfo(watchTaskInfo);
	 
	 	return getQualityWatchTaskResponse;
	}
}