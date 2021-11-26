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
		getTaskRuleListResponse.setCurrentPage(_ctx.integerValue("GetTaskRuleListResponse.CurrentPage"));
		getTaskRuleListResponse.setDataSize(_ctx.integerValue("GetTaskRuleListResponse.DataSize"));
		getTaskRuleListResponse.setSuccess(_ctx.booleanValue("GetTaskRuleListResponse.Success"));
		getTaskRuleListResponse.setReviewStatus(_ctx.integerValue("GetTaskRuleListResponse.ReviewStatus"));
		getTaskRuleListResponse.setCompSubTaskCount(_ctx.integerValue("GetTaskRuleListResponse.CompSubTaskCount"));
		getTaskRuleListResponse.setCode(_ctx.stringValue("GetTaskRuleListResponse.Code"));
		getTaskRuleListResponse.setTotalSubTaskCount(_ctx.integerValue("GetTaskRuleListResponse.TotalSubTaskCount"));
		getTaskRuleListResponse.setMessage(_ctx.stringValue("GetTaskRuleListResponse.Message"));
		getTaskRuleListResponse.setPageSize(_ctx.integerValue("GetTaskRuleListResponse.PageSize"));
		getTaskRuleListResponse.setTotalCount(_ctx.integerValue("GetTaskRuleListResponse.TotalCount"));

		List<RuleCountInfo> data = new ArrayList<RuleCountInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskRuleListResponse.Data.Length"); i++) {
			RuleCountInfo ruleCountInfo = new RuleCountInfo();
			ruleCountInfo.setType(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].Type"));
			ruleCountInfo.setStatus(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].Status"));
			ruleCountInfo.setPreReviewNumber(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].PreReviewNumber"));
			ruleCountInfo.setHitNumber(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].HitNumber"));
			ruleCountInfo.setSelect(_ctx.booleanValue("GetTaskRuleListResponse.Data["+ i +"].Select"));
			ruleCountInfo.setCreateTime(_ctx.longValue("GetTaskRuleListResponse.Data["+ i +"].CreateTime"));
			ruleCountInfo.setCreateEmpid(_ctx.stringValue("GetTaskRuleListResponse.Data["+ i +"].CreateEmpid"));
			ruleCountInfo.setRealViolationNumber(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].RealViolationNumber"));
			ruleCountInfo.setLastUpdateEmpid(_ctx.stringValue("GetTaskRuleListResponse.Data["+ i +"].LastUpdateEmpid"));
			ruleCountInfo.setIsDelete(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].IsDelete"));
			ruleCountInfo.setHitRate(_ctx.floatValue("GetTaskRuleListResponse.Data["+ i +"].HitRate"));
			ruleCountInfo.setRid(_ctx.stringValue("GetTaskRuleListResponse.Data["+ i +"].Rid"));
			ruleCountInfo.setCheckNumber(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].CheckNumber"));
			ruleCountInfo.setTypeName(_ctx.stringValue("GetTaskRuleListResponse.Data["+ i +"].TypeName"));
			ruleCountInfo.setLastUpdateTime(_ctx.longValue("GetTaskRuleListResponse.Data["+ i +"].LastUpdateTime"));
			ruleCountInfo.setName(_ctx.stringValue("GetTaskRuleListResponse.Data["+ i +"].Name"));
			ruleCountInfo.setHitRealViolationRate(_ctx.floatValue("GetTaskRuleListResponse.Data["+ i +"].HitRealViolationRate"));
			ruleCountInfo.setReviewNumber(_ctx.integerValue("GetTaskRuleListResponse.Data["+ i +"].ReviewNumber"));

			data.add(ruleCountInfo);
		}
		getTaskRuleListResponse.setData(data);
	 
	 	return getTaskRuleListResponse;
	}
}