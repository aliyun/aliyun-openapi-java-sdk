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

	public static GetSkillGroupConfigResponse unmarshall(GetSkillGroupConfigResponse getSkillGroupConfigResponse, UnmarshallerContext context) {
		
		getSkillGroupConfigResponse.setRequestId(context.stringValue("GetSkillGroupConfigResponse.RequestId"));
		getSkillGroupConfigResponse.setSuccess(context.booleanValue("GetSkillGroupConfigResponse.Success"));
		getSkillGroupConfigResponse.setCode(context.stringValue("GetSkillGroupConfigResponse.Code"));
		getSkillGroupConfigResponse.setMessage(context.stringValue("GetSkillGroupConfigResponse.Message"));

		Data data = new Data();
		data.setId(context.longValue("GetSkillGroupConfigResponse.Data.Id"));
		data.setInstanceId(context.stringValue("GetSkillGroupConfigResponse.Data.InstanceId"));
		data.setModelId(context.longValue("GetSkillGroupConfigResponse.Data.ModelId"));
		data.setModelName(context.stringValue("GetSkillGroupConfigResponse.Data.ModelName"));
		data.setName(context.stringValue("GetSkillGroupConfigResponse.Data.Name"));
		data.setRid(context.stringValue("GetSkillGroupConfigResponse.Data.Rid"));
		data.setSkillGroupId(context.stringValue("GetSkillGroupConfigResponse.Data.SkillGroupId"));
		data.setSkillGroupName(context.stringValue("GetSkillGroupConfigResponse.Data.SkillGroupName"));
		data.setStatus(context.integerValue("GetSkillGroupConfigResponse.Data.Status"));
		data.setType(context.integerValue("GetSkillGroupConfigResponse.Data.Type"));
		data.setVocabId(context.longValue("GetSkillGroupConfigResponse.Data.VocabId"));
		data.setVocabName(context.stringValue("GetSkillGroupConfigResponse.Data.VocabName"));
		data.setCreateTime(context.stringValue("GetSkillGroupConfigResponse.Data.CreateTime"));
		data.setUpdateTime(context.stringValue("GetSkillGroupConfigResponse.Data.UpdateTime"));

		List<RuleNameInfo> ruleList = new ArrayList<RuleNameInfo>();
		for (int i = 0; i < context.lengthValue("GetSkillGroupConfigResponse.Data.RuleList.Length"); i++) {
			RuleNameInfo ruleNameInfo = new RuleNameInfo();
			ruleNameInfo.setRid(context.longValue("GetSkillGroupConfigResponse.Data.RuleList["+ i +"].Rid"));
			ruleNameInfo.setRuleName(context.stringValue("GetSkillGroupConfigResponse.Data.RuleList["+ i +"].RuleName"));

			ruleList.add(ruleNameInfo);
		}
		data.setRuleList(ruleList);
		getSkillGroupConfigResponse.setData(data);
	 
	 	return getSkillGroupConfigResponse;
	}
}