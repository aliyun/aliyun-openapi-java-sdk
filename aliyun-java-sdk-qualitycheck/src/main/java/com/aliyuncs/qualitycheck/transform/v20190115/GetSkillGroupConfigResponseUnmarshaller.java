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

import com.aliyuncs.qualitycheck.model.v20190115.GetSkillGroupConfigResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetSkillGroupConfigResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.GetSkillGroupConfigResponse.Data.RuleNameInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSkillGroupConfigResponseUnmarshaller {

	public static GetSkillGroupConfigResponse unmarshall(GetSkillGroupConfigResponse getSkillGroupConfigResponse, UnmarshallerContext _ctx) {
		
		getSkillGroupConfigResponse.setRequestId(_ctx.stringValue("GetSkillGroupConfigResponse.RequestId"));
		getSkillGroupConfigResponse.setSuccess(_ctx.booleanValue("GetSkillGroupConfigResponse.Success"));
		getSkillGroupConfigResponse.setCode(_ctx.stringValue("GetSkillGroupConfigResponse.Code"));
		getSkillGroupConfigResponse.setMessage(_ctx.stringValue("GetSkillGroupConfigResponse.Message"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetSkillGroupConfigResponse.Data.Id"));
		data.setInstanceId(_ctx.stringValue("GetSkillGroupConfigResponse.Data.InstanceId"));
		data.setModelId(_ctx.longValue("GetSkillGroupConfigResponse.Data.ModelId"));
		data.setModelName(_ctx.stringValue("GetSkillGroupConfigResponse.Data.ModelName"));
		data.setName(_ctx.stringValue("GetSkillGroupConfigResponse.Data.Name"));
		data.setRid(_ctx.stringValue("GetSkillGroupConfigResponse.Data.Rid"));
		data.setSkillGroupId(_ctx.stringValue("GetSkillGroupConfigResponse.Data.SkillGroupId"));
		data.setSkillGroupName(_ctx.stringValue("GetSkillGroupConfigResponse.Data.SkillGroupName"));
		data.setStatus(_ctx.integerValue("GetSkillGroupConfigResponse.Data.Status"));
		data.setType(_ctx.integerValue("GetSkillGroupConfigResponse.Data.Type"));
		data.setVocabId(_ctx.longValue("GetSkillGroupConfigResponse.Data.VocabId"));
		data.setVocabName(_ctx.stringValue("GetSkillGroupConfigResponse.Data.VocabName"));
		data.setCreateTime(_ctx.stringValue("GetSkillGroupConfigResponse.Data.CreateTime"));
		data.setUpdateTime(_ctx.stringValue("GetSkillGroupConfigResponse.Data.UpdateTime"));
		data.setQualityCheckType(_ctx.integerValue("GetSkillGroupConfigResponse.Data.QualityCheckType"));
		data.setAllContentQualityCheck(_ctx.integerValue("GetSkillGroupConfigResponse.Data.AllContentQualityCheck"));
		data.setAllRids(_ctx.stringValue("GetSkillGroupConfigResponse.Data.AllRids"));
		data.setSkillGroupFrom(_ctx.integerValue("GetSkillGroupConfigResponse.Data.SkillGroupFrom"));

		List<RuleNameInfo> ruleList = new ArrayList<RuleNameInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetSkillGroupConfigResponse.Data.RuleList.Length"); i++) {
			RuleNameInfo ruleNameInfo = new RuleNameInfo();
			ruleNameInfo.setRid(_ctx.longValue("GetSkillGroupConfigResponse.Data.RuleList["+ i +"].Rid"));
			ruleNameInfo.setRuleName(_ctx.stringValue("GetSkillGroupConfigResponse.Data.RuleList["+ i +"].RuleName"));

			ruleList.add(ruleNameInfo);
		}
		data.setRuleList(ruleList);

		List<RuleNameInfo> allRuleList = new ArrayList<RuleNameInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetSkillGroupConfigResponse.Data.AllRuleList.Length"); i++) {
			RuleNameInfo ruleNameInfo_ = new RuleNameInfo();
			ruleNameInfo_.setRid(_ctx.longValue("GetSkillGroupConfigResponse.Data.AllRuleList["+ i +"].Rid"));
			ruleNameInfo_.setRuleName(_ctx.stringValue("GetSkillGroupConfigResponse.Data.AllRuleList["+ i +"].RuleName"));

			allRuleList.add(ruleNameInfo_);
		}
		data.setAllRuleList(allRuleList);
		getSkillGroupConfigResponse.setData(data);
	 
	 	return getSkillGroupConfigResponse;
	}
}