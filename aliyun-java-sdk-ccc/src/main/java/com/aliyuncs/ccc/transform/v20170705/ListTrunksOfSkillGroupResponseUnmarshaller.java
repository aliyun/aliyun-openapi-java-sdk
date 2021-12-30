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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListTrunksOfSkillGroupResponse;
import com.aliyuncs.ccc.model.v20170705.ListTrunksOfSkillGroupResponse.TrunkConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrunksOfSkillGroupResponseUnmarshaller {

	public static ListTrunksOfSkillGroupResponse unmarshall(ListTrunksOfSkillGroupResponse listTrunksOfSkillGroupResponse, UnmarshallerContext _ctx) {
		
		listTrunksOfSkillGroupResponse.setRequestId(_ctx.stringValue("ListTrunksOfSkillGroupResponse.RequestId"));
		listTrunksOfSkillGroupResponse.setSuccess(_ctx.booleanValue("ListTrunksOfSkillGroupResponse.Success"));
		listTrunksOfSkillGroupResponse.setCode(_ctx.stringValue("ListTrunksOfSkillGroupResponse.Code"));
		listTrunksOfSkillGroupResponse.setMessage(_ctx.stringValue("ListTrunksOfSkillGroupResponse.Message"));
		listTrunksOfSkillGroupResponse.setHttpStatusCode(_ctx.integerValue("ListTrunksOfSkillGroupResponse.HttpStatusCode"));

		List<TrunkConfig> trunkConfigs = new ArrayList<TrunkConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListTrunksOfSkillGroupResponse.TrunkConfigs.Length"); i++) {
			TrunkConfig trunkConfig = new TrunkConfig();
			trunkConfig.setProviderName(_ctx.stringValue("ListTrunksOfSkillGroupResponse.TrunkConfigs["+ i +"].ProviderName"));
			trunkConfig.setPrimary(_ctx.booleanValue("ListTrunksOfSkillGroupResponse.TrunkConfigs["+ i +"].Primary"));

			trunkConfigs.add(trunkConfig);
		}
		listTrunksOfSkillGroupResponse.setTrunkConfigs(trunkConfigs);
	 
	 	return listTrunksOfSkillGroupResponse;
	}
}