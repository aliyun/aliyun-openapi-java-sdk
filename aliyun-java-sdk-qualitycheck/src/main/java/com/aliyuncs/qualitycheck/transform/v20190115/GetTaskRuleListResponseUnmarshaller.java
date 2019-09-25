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

	public static GetTaskRuleListResponse unmarshall(GetTaskRuleListResponse getTaskRuleListResponse, UnmarshallerContext _ctx) {
		
		getTaskRuleListResponse.setRequestId(_ctx.stringValue("GetTaskRuleListResponse.RequestId"));
		getTaskRuleListResponse.setSuccess(_ctx.booleanValue("GetTaskRuleListResponse.Success"));
		getTaskRuleListResponse.setCode(_ctx.stringValue("GetTaskRuleListResponse.Code"));
		getTaskRuleListResponse.setMessage(_ctx.stringValue("GetTaskRuleListResponse.Message"));
		getTaskRuleListResponse.setPageSize(_ctx.integerValue("GetTaskRuleListResponse.PageSize"));
		getTaskRuleListResponse.setDataSize(_ctx.integerValue("GetTaskRuleListResponse.DataSize"));
		getTaskRuleListResponse.setTotalCount(_ctx.integerValue("GetTaskRuleListResponse.TotalCount"));
		getTaskRuleListResponse.setReviewStatus(_ctx.integerValue("GetTaskRuleListResponse.ReviewStatus"));
		getTaskRuleListResponse.setTotalSubTaskCount(_ctx.integerValue("GetTaskRuleListResponse.TotalSubTaskCount"));
		getTaskRuleListResponse.setCompSubTaskCount(_ctx.integerValue("GetTaskRuleListResponse.CompSubTaskCount"));
		getTaskRuleListResponse.setCurrentPage(_ctx.integerValue("GetTaskRuleListResponse.CurrentPage"));

		List<RuleCountInfo> data = new ArrayList<RuleCountInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskRuleListResponse.Data.Length"); i++) {
			RuleCountInfo ruleCountInfo = new RuleCountInfo();
			ruleCountInfo.setCheckNumber(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].CheckNumber"));
			ruleCountInfo.setCreateEmpid(_ctx.stringValue("GetTaskRuleListResponse.Data["+ i +"].CreateEmpid"));
			ruleCountInfo.setCreateTime(_ctx.longValue("GetTaskRuleListResponse.Data["+ i +"].CreateTime"));
			ruleCountInfo.setHitNumber(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].HitNumber"));
			ruleCountInfo.setHitRate(_ctx.floatValue("GetTaskRuleListResponse.Data["+ i +"].HitRate"));
			ruleCountInfo.setHitRealViolationRate(_ctx.floatValue("GetTaskRuleListResponse.Data["+ i +"].HitRealViolationRate"));
			ruleCountInfo.setIsDelete(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].IsDelete"));
			ruleCountInfo.setLastUpdateEmpid(_ctx.stringValue("GetTaskRuleListResponse.Data["+ i +"].LastUpdateEmpid"));
			ruleCountInfo.setLastUpdateTime(_ctx.longValue("GetTaskRuleListResponse.Data["+ i +"].LastUpdateTime"));
			ruleCountInfo.setName(_ctx.stringValue("GetTaskRuleListResponse.Data["+ i +"].Name"));
			ruleCountInfo.setPreReviewNumber(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].PreReviewNumber"));
			ruleCountInfo.setRealViolationNumber(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].RealViolationNumber"));
			ruleCountInfo.setReviewNumber(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].ReviewNumber"));
			ruleCountInfo.setRid(_ctx.stringValue("GetTaskRuleListResponse.Data["+ i +"].Rid"));
			ruleCountInfo.setSelect(_ctx.booleanValue("GetTaskRuleListResponse.Data["+ i +"].Select"));
			ruleCountInfo.setStatus(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].Status"));
			ruleCountInfo.setType(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].Type"));
			ruleCountInfo.setTypeName(_ctx.stringValue("GetTaskRuleListResponse.Data["+ i +"].TypeName"));

			data.add(ruleCountInfo);
		}
		getTaskRuleListResponse.setData(data);
	 
	 	return getTaskRuleListResponse;
	}
}