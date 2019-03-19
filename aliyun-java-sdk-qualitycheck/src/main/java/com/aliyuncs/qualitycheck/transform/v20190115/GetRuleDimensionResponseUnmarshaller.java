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

import com.aliyuncs.qualitycheck.model.v20190115.GetRuleDimensionResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetRuleDimensionResponse.RuleCountInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleDimensionResponseUnmarshaller {

	public static GetRuleDimensionResponse unmarshall(GetRuleDimensionResponse getRuleDimensionResponse, UnmarshallerContext context) {
		
		getRuleDimensionResponse.setRequestId(context.stringValue("GetRuleDimensionResponse.RequestId"));
		getRuleDimensionResponse.setSuccess(context.booleanValue("GetRuleDimensionResponse.Success"));
		getRuleDimensionResponse.setCode(context.stringValue("GetRuleDimensionResponse.Code"));
		getRuleDimensionResponse.setMessage(context.stringValue("GetRuleDimensionResponse.Message"));
		getRuleDimensionResponse.setPageSize(context.integerValue("GetRuleDimensionResponse.PageSize"));
		getRuleDimensionResponse.setDataSize(context.integerValue("GetRuleDimensionResponse.DataSize"));
		getRuleDimensionResponse.setTotalCount(context.integerValue("GetRuleDimensionResponse.TotalCount"));
		getRuleDimensionResponse.setReviewStatus(context.integerValue("GetRuleDimensionResponse.ReviewStatus"));
		getRuleDimensionResponse.setTotalSubTaskCount(context.integerValue("GetRuleDimensionResponse.TotalSubTaskCount"));
		getRuleDimensionResponse.setCompSubTaskCount(context.integerValue("GetRuleDimensionResponse.CompSubTaskCount"));
		getRuleDimensionResponse.setCurrentPage(context.integerValue("GetRuleDimensionResponse.CurrentPage"));

		List<RuleCountInfo> data = new ArrayList<RuleCountInfo>();
		for (int i = 0; i < context.lengthValue("GetRuleDimensionResponse.Data.Length"); i++) {
			RuleCountInfo ruleCountInfo = new RuleCountInfo();
			ruleCountInfo.setCheckNumber(context.integerValue("GetRuleDimensionResponse.Data["+ i +"].CheckNumber"));
			ruleCountInfo.setCreateEmpid(context.stringValue("GetRuleDimensionResponse.Data["+ i +"].CreateEmpid"));
			ruleCountInfo.setCreateTime(context.stringValue("GetRuleDimensionResponse.Data["+ i +"].CreateTime"));
			ruleCountInfo.setHitNumber(context.integerValue("GetRuleDimensionResponse.Data["+ i +"].HitNumber"));
			ruleCountInfo.setHitRate(context.floatValue("GetRuleDimensionResponse.Data["+ i +"].HitRate"));
			ruleCountInfo.setHitRealViolationRate(context.floatValue("GetRuleDimensionResponse.Data["+ i +"].HitRealViolationRate"));
			ruleCountInfo.setIsDelete(context.integerValue("GetRuleDimensionResponse.Data["+ i +"].IsDelete"));
			ruleCountInfo.setLastUpdateEmpid(context.stringValue("GetRuleDimensionResponse.Data["+ i +"].LastUpdateEmpid"));
			ruleCountInfo.setLastUpdateTime(context.stringValue("GetRuleDimensionResponse.Data["+ i +"].LastUpdateTime"));
			ruleCountInfo.setName(context.stringValue("GetRuleDimensionResponse.Data["+ i +"].Name"));
			ruleCountInfo.setPreReviewNumber(context.integerValue("GetRuleDimensionResponse.Data["+ i +"].PreReviewNumber"));
			ruleCountInfo.setRealViolationNumber(context.integerValue("GetRuleDimensionResponse.Data["+ i +"].RealViolationNumber"));
			ruleCountInfo.setReviewNumber(context.integerValue("GetRuleDimensionResponse.Data["+ i +"].ReviewNumber"));
			ruleCountInfo.setRid(context.stringValue("GetRuleDimensionResponse.Data["+ i +"].Rid"));
			ruleCountInfo.setSelect(context.booleanValue("GetRuleDimensionResponse.Data["+ i +"].Select"));
			ruleCountInfo.setStatus(context.integerValue("GetRuleDimensionResponse.Data["+ i +"].Status"));
			ruleCountInfo.setType(context.integerValue("GetRuleDimensionResponse.Data["+ i +"].Type"));
			ruleCountInfo.setTypeName(context.stringValue("GetRuleDimensionResponse.Data["+ i +"].TypeName"));

			data.add(ruleCountInfo);
		}
		getRuleDimensionResponse.setData(data);
	 
	 	return getRuleDimensionResponse;
	}
}