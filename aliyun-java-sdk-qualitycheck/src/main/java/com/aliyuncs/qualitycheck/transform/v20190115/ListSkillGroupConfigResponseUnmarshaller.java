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

import com.aliyuncs.qualitycheck.model.v20190115.ListSkillGroupConfigResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListSkillGroupConfigResponse.SkillGroupConfig;
import com.aliyuncs.qualitycheck.model.v20190115.ListSkillGroupConfigResponse.SkillGroupConfig.RuleNameInfo;
import com.aliyuncs.qualitycheck.model.v20190115.ListSkillGroupConfigResponse.SkillGroupConfig.SkillGroupScreen;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupConfigResponseUnmarshaller {

	public static ListSkillGroupConfigResponse unmarshall(ListSkillGroupConfigResponse listSkillGroupConfigResponse, UnmarshallerContext _ctx) {
		
		listSkillGroupConfigResponse.setRequestId(_ctx.stringValue("ListSkillGroupConfigResponse.RequestId"));
		listSkillGroupConfigResponse.setCode(_ctx.stringValue("ListSkillGroupConfigResponse.Code"));
		listSkillGroupConfigResponse.setMessage(_ctx.stringValue("ListSkillGroupConfigResponse.Message"));
		listSkillGroupConfigResponse.setSuccess(_ctx.booleanValue("ListSkillGroupConfigResponse.Success"));

		List<SkillGroupConfig> data = new ArrayList<SkillGroupConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListSkillGroupConfigResponse.Data.Length"); i++) {
			SkillGroupConfig skillGroupConfig = new SkillGroupConfig();
			skillGroupConfig.setType(_ctx.integerValue("ListSkillGroupConfigResponse.Data["+ i +"].Type"));
			skillGroupConfig.setStatus(_ctx.integerValue("ListSkillGroupConfigResponse.Data["+ i +"].Status"));
			skillGroupConfig.setUpdateTime(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].UpdateTime"));
			skillGroupConfig.setAllContentQualityCheck(_ctx.integerValue("ListSkillGroupConfigResponse.Data["+ i +"].AllContentQualityCheck"));
			skillGroupConfig.setCreateTime(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].CreateTime"));
			skillGroupConfig.setSkillGroupId(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupId"));
			skillGroupConfig.setScreenSwitch(_ctx.booleanValue("ListSkillGroupConfigResponse.Data["+ i +"].ScreenSwitch"));
			skillGroupConfig.setInstanceId(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].InstanceId"));
			skillGroupConfig.setVocabId(_ctx.longValue("ListSkillGroupConfigResponse.Data["+ i +"].VocabId"));
			skillGroupConfig.setSkillGroupFrom(_ctx.integerValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupFrom"));
			skillGroupConfig.setRid(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].Rid"));
			skillGroupConfig.setSkillGroupName(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupName"));
			skillGroupConfig.setModelName(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].ModelName"));
			skillGroupConfig.setAllRids(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].AllRids"));
			skillGroupConfig.setName(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].Name"));
			skillGroupConfig.setModelId(_ctx.longValue("ListSkillGroupConfigResponse.Data["+ i +"].ModelId"));
			skillGroupConfig.setId(_ctx.longValue("ListSkillGroupConfigResponse.Data["+ i +"].Id"));
			skillGroupConfig.setQualityCheckType(_ctx.integerValue("ListSkillGroupConfigResponse.Data["+ i +"].QualityCheckType"));
			skillGroupConfig.setVocabName(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].VocabName"));

			List<RuleNameInfo> ruleList = new ArrayList<RuleNameInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListSkillGroupConfigResponse.Data["+ i +"].RuleList.Length"); j++) {
				RuleNameInfo ruleNameInfo = new RuleNameInfo();
				ruleNameInfo.setRuleName(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].RuleList["+ j +"].RuleName"));
				ruleNameInfo.setRid(_ctx.longValue("ListSkillGroupConfigResponse.Data["+ i +"].RuleList["+ j +"].Rid"));

				ruleList.add(ruleNameInfo);
			}
			skillGroupConfig.setRuleList(ruleList);

			List<RuleNameInfo> allRuleList = new ArrayList<RuleNameInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListSkillGroupConfigResponse.Data["+ i +"].AllRuleList.Length"); j++) {
				RuleNameInfo ruleNameInfo1 = new RuleNameInfo();
				ruleNameInfo1.setRuleName(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].AllRuleList["+ j +"].RuleName"));
				ruleNameInfo1.setRid(_ctx.longValue("ListSkillGroupConfigResponse.Data["+ i +"].AllRuleList["+ j +"].Rid"));

				allRuleList.add(ruleNameInfo1);
			}
			skillGroupConfig.setAllRuleList(allRuleList);

			List<SkillGroupScreen> skillGroupScreens = new ArrayList<SkillGroupScreen>();
			for (int j = 0; j < _ctx.lengthValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupScreens.Length"); j++) {
				SkillGroupScreen skillGroupScreen = new SkillGroupScreen();
				skillGroupScreen.setValue(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupScreens["+ j +"].Value"));
				skillGroupScreen.setDataType(_ctx.integerValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupScreens["+ j +"].DataType"));
				skillGroupScreen.setSymbol(_ctx.integerValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupScreens["+ j +"].Symbol"));
				skillGroupScreen.setName(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupScreens["+ j +"].Name"));

				skillGroupScreens.add(skillGroupScreen);
			}
			skillGroupConfig.setSkillGroupScreens(skillGroupScreens);

			data.add(skillGroupConfig);
		}
		listSkillGroupConfigResponse.setData(data);
	 
	 	return listSkillGroupConfigResponse;
	}
}