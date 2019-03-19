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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.GetTaskRuleListResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetTaskRuleListResponse.RuleCountInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskRuleListResponseUnmarshaller {

	public static GetTaskRuleListResponse unmarshall(GetTaskRuleListResponse getTaskRuleListResponse, UnmarshallerContext context) {
		
		getTaskRuleListResponse.setRequestId(context.stringValue("GetTaskRuleListResponse.RequestId"));
		getTaskRuleListResponse.setSuccess(context.booleanValue("GetTaskRuleListResponse.Success"));
		getTaskRuleListResponse.setCode(context.stringValue("GetTaskRuleListResponse.Code"));
		getTaskRuleListResponse.setMessage(context.stringValue("GetTaskRuleListResponse.Message"));
		getTaskRuleListResponse.setPageSize(context.integerValue("GetTaskRuleListResponse.PageSize"));
		getTaskRuleListResponse.setDataSize(context.integerValue("GetTaskRuleListResponse.DataSize"));
		getTaskRuleListResponse.setTotalCount(context.integerValue("GetTaskRuleListResponse.TotalCount"));
		getTaskRuleListResponse.setReviewStatus(context.integerValue("GetTaskRuleListResponse.ReviewStatus"));
		getTaskRuleListResponse.setTotalSubTaskCount(context.integerValue("GetTaskRuleListResponse.TotalSubTaskCount"));
		getTaskRuleListResponse.setCompSubTaskCount(context.integerValue("GetTaskRuleListResponse.CompSubTaskCount"));
		getTaskRuleListResponse.setCurrentPage(context.integerValue("GetTaskRuleListResponse.CurrentPage"));

		List<RuleCountInfo> data = new ArrayList<RuleCountInfo>();
		for (int i = 0; i < context.lengthValue("GetTaskRuleListResponse.Data.Length"); i++) {
			RuleCountInfo ruleCountInfo = new RuleCountInfo();
			ruleCountInfo.setCheckNumber(context.integerValue("GetTaskRuleListResponse.Data["+ i +"].CheckNumber"));
			ruleCountInfo.setCreateEmpid(context.stringValue("GetTaskRuleListResponse.Data["+ i +"].CreateEmpid"));
			ruleCountInfo.setCreateTime(context.longValue("GetTaskRuleListResponse.Data["+ i +"].CreateTime"));
			ruleCountInfo.setHitNumber(context.integerValue("GetTaskRuleListResponse.Data["+ i +"].HitNumber"));
			ruleCountInfo.setHitRate(context.floatValue("GetTaskRuleListResponse.Data["+ i +"].HitRate"));
			ruleCountInfo.setHitRealViolationRate(context.floatValue("GetTaskRuleListResponse.Data["+ i +"].HitRealViolationRate"));
			ruleCountInfo.setIsDelete(context.integerValue("GetTaskRuleListResponse.Data["+ i +"].IsDelete"));
			ruleCountInfo.setLastUpdateEmpid(context.stringValue("GetTaskRuleListResponse.Data["+ i +"].LastUpdateEmpid"));
			ruleCountInfo.setLastUpdateTime(context.longValue("GetTaskRuleListResponse.Data["+ i +"].LastUpdateTime"));
			ruleCountInfo.setName(context.stringValue("GetTaskRuleListResponse.Data["+ i +"].Name"));
			ruleCountInfo.setPreReviewNumber(context.integerValue("GetTaskRuleListResponse.Data["+ i +"].PreReviewNumber"));
			ruleCountInfo.setRealViolationNumber(context.integerValue("GetTaskRuleListResponse.Data["+ i +"].RealViolationNumber"));
			ruleCountInfo.setReviewNumber(context.integerValue("GetTaskRuleListResponse.Data["+ i +"].ReviewNumber"));
			ruleCountInfo.setRid(context.stringValue("GetTaskRuleListResponse.Data["+ i +"].Rid"));
			ruleCountInfo.setSelect(context.booleanValue("GetTaskRuleListResponse.Data["+ i +"].Select"));
			ruleCountInfo.setStatus(context.integerValue("GetTaskRuleListResponse.Data["+ i +"].Status"));
			ruleCountInfo.setType(context.integerValue("GetTaskRuleListResponse.Data["+ i +"].Type"));
			ruleCountInfo.setTypeName(context.stringValue("GetTaskRuleListResponse.Data["+ i +"].TypeName"));

			data.add(ruleCountInfo);
		}
		getTaskRuleListResponse.setData(data);
	 
	 	return getTaskRuleListResponse;
	}
}