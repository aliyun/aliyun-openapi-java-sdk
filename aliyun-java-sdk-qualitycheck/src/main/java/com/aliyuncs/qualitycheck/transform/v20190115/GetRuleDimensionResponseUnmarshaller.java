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

	public static GetRuleDimensionResponse unmarshall(GetRuleDimensionResponse getRuleDimensionResponse, UnmarshallerContext _ctx) {
		
		getRuleDimensionResponse.setRequestId(_ctx.stringValue("GetRuleDimensionResponse.RequestId"));
		getRuleDimensionResponse.setSuccess(_ctx.booleanValue("GetRuleDimensionResponse.Success"));
		getRuleDimensionResponse.setCode(_ctx.stringValue("GetRuleDimensionResponse.Code"));
		getRuleDimensionResponse.setMessage(_ctx.stringValue("GetRuleDimensionResponse.Message"));
		getRuleDimensionResponse.setPageSize(_ctx.integerValue("GetRuleDimensionResponse.PageSize"));
		getRuleDimensionResponse.setDataSize(_ctx.integerValue("GetRuleDimensionResponse.DataSize"));
		getRuleDimensionResponse.setTotalCount(_ctx.integerValue("GetRuleDimensionResponse.TotalCount"));
		getRuleDimensionResponse.setReviewStatus(_ctx.integerValue("GetRuleDimensionResponse.ReviewStatus"));
		getRuleDimensionResponse.setTotalSubTaskCount(_ctx.integerValue("GetRuleDimensionResponse.TotalSubTaskCount"));
		getRuleDimensionResponse.setCompSubTaskCount(_ctx.integerValue("GetRuleDimensionResponse.CompSubTaskCount"));
		getRuleDimensionResponse.setCurrentPage(_ctx.integerValue("GetRuleDimensionResponse.CurrentPage"));

		List<RuleCountInfo> data = new ArrayList<RuleCountInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetRuleDimensionResponse.Data.Length"); i++) {
			RuleCountInfo ruleCountInfo = new RuleCountInfo();
			ruleCountInfo.setCheckNumber(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].CheckNumber"));
			ruleCountInfo.setCreateEmpid(_ctx.stringValue("GetRuleDimensionResponse.Data["+ i +"].CreateEmpid"));
			ruleCountInfo.setCreateTime(_ctx.stringValue("GetRuleDimensionResponse.Data["+ i +"].CreateTime"));
			ruleCountInfo.setHitNumber(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].HitNumber"));
			ruleCountInfo.setHitRate(_ctx.floatValue("GetRuleDimensionResponse.Data["+ i +"].HitRate"));
			ruleCountInfo.setHitRealViolationRate(_ctx.floatValue("GetRuleDimensionResponse.Data["+ i +"].HitRealViolationRate"));
			ruleCountInfo.setIsDelete(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].IsDelete"));
			ruleCountInfo.setLastUpdateEmpid(_ctx.stringValue("GetRuleDimensionResponse.Data["+ i +"].LastUpdateEmpid"));
			ruleCountInfo.setLastUpdateTime(_ctx.stringValue("GetRuleDimensionResponse.Data["+ i +"].LastUpdateTime"));
			ruleCountInfo.setName(_ctx.stringValue("GetRuleDimensionResponse.Data["+ i +"].Name"));
			ruleCountInfo.setPreReviewNumber(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].PreReviewNumber"));
			ruleCountInfo.setRealViolationNumber(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].RealViolationNumber"));
			ruleCountInfo.setReviewNumber(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].ReviewNumber"));
			ruleCountInfo.setRid(_ctx.stringValue("GetRuleDimensionResponse.Data["+ i +"].Rid"));
			ruleCountInfo.setSelect(_ctx.booleanValue("GetRuleDimensionResponse.Data["+ i +"].Select"));
			ruleCountInfo.setStatus(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].Status"));
			ruleCountInfo.setType(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].Type"));
			ruleCountInfo.setTypeName(_ctx.stringValue("GetRuleDimensionResponse.Data["+ i +"].TypeName"));

			data.add(ruleCountInfo);
		}
		getRuleDimensionResponse.setData(data);
	 
	 	return getRuleDimensionResponse;
	}
}