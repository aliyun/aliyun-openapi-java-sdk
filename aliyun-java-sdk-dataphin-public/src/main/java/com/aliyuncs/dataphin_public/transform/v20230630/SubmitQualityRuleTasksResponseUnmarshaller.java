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

import com.aliyuncs.dataphin_public.model.v20230630.SubmitQualityRuleTasksResponse;
import com.aliyuncs.dataphin_public.model.v20230630.SubmitQualityRuleTasksResponse.SubmitResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitQualityRuleTasksResponseUnmarshaller {

	public static SubmitQualityRuleTasksResponse unmarshall(SubmitQualityRuleTasksResponse submitQualityRuleTasksResponse, UnmarshallerContext _ctx) {
		
		submitQualityRuleTasksResponse.setRequestId(_ctx.stringValue("SubmitQualityRuleTasksResponse.RequestId"));
		submitQualityRuleTasksResponse.setSuccess(_ctx.booleanValue("SubmitQualityRuleTasksResponse.Success"));
		submitQualityRuleTasksResponse.setHttpStatusCode(_ctx.integerValue("SubmitQualityRuleTasksResponse.HttpStatusCode"));
		submitQualityRuleTasksResponse.setCode(_ctx.stringValue("SubmitQualityRuleTasksResponse.Code"));
		submitQualityRuleTasksResponse.setMessage(_ctx.stringValue("SubmitQualityRuleTasksResponse.Message"));

		SubmitResult submitResult = new SubmitResult();

		List<Long> ruleTaskIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("SubmitQualityRuleTasksResponse.SubmitResult.RuleTaskIdList.Length"); i++) {
			ruleTaskIdList.add(_ctx.longValue("SubmitQualityRuleTasksResponse.SubmitResult.RuleTaskIdList["+ i +"]"));
		}
		submitResult.setRuleTaskIdList(ruleTaskIdList);

		List<Long> watchTaskIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("SubmitQualityRuleTasksResponse.SubmitResult.WatchTaskIdList.Length"); i++) {
			watchTaskIdList.add(_ctx.longValue("SubmitQualityRuleTasksResponse.SubmitResult.WatchTaskIdList["+ i +"]"));
		}
		submitResult.setWatchTaskIdList(watchTaskIdList);
		submitQualityRuleTasksResponse.setSubmitResult(submitResult);
	 
	 	return submitQualityRuleTasksResponse;
	}
}