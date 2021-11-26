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
		getRuleDimensionResponse.setCurrentPage(_ctx.integerValue("GetRuleDimensionResponse.CurrentPage"));
		getRuleDimensionResponse.setDataSize(_ctx.integerValue("GetRuleDimensionResponse.DataSize"));
		getRuleDimensionResponse.setSuccess(_ctx.booleanValue("GetRuleDimensionResponse.Success"));
		getRuleDimensionResponse.setReviewStatus(_ctx.integerValue("GetRuleDimensionResponse.ReviewStatus"));
		getRuleDimensionResponse.setCompSubTaskCount(_ctx.integerValue("GetRuleDimensionResponse.CompSubTaskCount"));
		getRuleDimensionResponse.setCode(_ctx.stringValue("GetRuleDimensionResponse.Code"));
		getRuleDimensionResponse.setTotalSubTaskCount(_ctx.integerValue("GetRuleDimensionResponse.TotalSubTaskCount"));
		getRuleDimensionResponse.setMessage(_ctx.stringValue("GetRuleDimensionResponse.Message"));
		getRuleDimensionResponse.setPageSize(_ctx.integerValue("GetRuleDimensionResponse.PageSize"));
		getRuleDimensionResponse.setTotalCount(_ctx.integerValue("GetRuleDimensionResponse.TotalCount"));

		List<RuleCountInfo> data = new ArrayList<RuleCountInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetRuleDimensionResponse.Data.Length"); i++) {
			RuleCountInfo ruleCountInfo = new RuleCountInfo();
			ruleCountInfo.setType(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].Type"));
			ruleCountInfo.setStatus(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].Status"));
			ruleCountInfo.setPreReviewNumber(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].PreReviewNumber"));
			ruleCountInfo.setHitNumber(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].HitNumber"));
			ruleCountInfo.setSelect(_ctx.booleanValue("GetRuleDimensionResponse.Data["+ i +"].Select"));
			ruleCountInfo.setCreateTime(_ctx.stringValue("GetRuleDimensionResponse.Data["+ i +"].CreateTime"));
			ruleCountInfo.setCreateEmpid(_ctx.stringValue("GetRuleDimensionResponse.Data["+ i +"].CreateEmpid"));
			ruleCountInfo.setRealViolationNumber(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].RealViolationNumber"));
			ruleCountInfo.setLastUpdateEmpid(_ctx.stringValue("GetRuleDimensionResponse.Data["+ i +"].LastUpdateEmpid"));
			ruleCountInfo.setIsDelete(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].IsDelete"));
			ruleCountInfo.setHitRate(_ctx.floatValue("GetRuleDimensionResponse.Data["+ i +"].HitRate"));
			ruleCountInfo.setRid(_ctx.stringValue("GetRuleDimensionResponse.Data["+ i +"].Rid"));
			ruleCountInfo.setCheckNumber(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].CheckNumber"));
			ruleCountInfo.setTypeName(_ctx.stringValue("GetRuleDimensionResponse.Data["+ i +"].TypeName"));
			ruleCountInfo.setLastUpdateTime(_ctx.stringValue("GetRuleDimensionResponse.Data["+ i +"].LastUpdateTime"));
			ruleCountInfo.setName(_ctx.stringValue("GetRuleDimensionResponse.Data["+ i +"].Name"));
			ruleCountInfo.setHitRealViolationRate(_ctx.floatValue("GetRuleDimensionResponse.Data["+ i +"].HitRealViolationRate"));
			ruleCountInfo.setReviewNumber(_ctx.integerValue("GetRuleDimensionResponse.Data["+ i +"].ReviewNumber"));

			data.add(ruleCountInfo);
		}
		getRuleDimensionResponse.setData(data);
	 
	 	return getRuleDimensionResponse;
	}
}