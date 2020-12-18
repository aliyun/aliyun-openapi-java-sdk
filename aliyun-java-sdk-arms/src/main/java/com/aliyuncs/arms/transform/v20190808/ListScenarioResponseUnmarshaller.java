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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListScenarioResponse;
import com.aliyuncs.arms.model.v20190808.ListScenarioResponse.ArmsScenariosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScenarioResponseUnmarshaller {

	public static ListScenarioResponse unmarshall(ListScenarioResponse listScenarioResponse, UnmarshallerContext _ctx) {
		
		listScenarioResponse.setRequestId(_ctx.stringValue("ListScenarioResponse.RequestId"));

		List<ArmsScenariosItem> armsScenarios = new ArrayList<ArmsScenariosItem>();
		for (int i = 0; i < _ctx.lengthValue("ListScenarioResponse.ArmsScenarios.Length"); i++) {
			ArmsScenariosItem armsScenariosItem = new ArmsScenariosItem();
			armsScenariosItem.setId(_ctx.longValue("ListScenarioResponse.ArmsScenarios["+ i +"].Id"));
			armsScenariosItem.setCreateTime(_ctx.stringValue("ListScenarioResponse.ArmsScenarios["+ i +"].CreateTime"));
			armsScenariosItem.setUpdateTime(_ctx.stringValue("ListScenarioResponse.ArmsScenarios["+ i +"].UpdateTime"));
			armsScenariosItem.setName(_ctx.stringValue("ListScenarioResponse.ArmsScenarios["+ i +"].Name"));
			armsScenariosItem.setSign(_ctx.stringValue("ListScenarioResponse.ArmsScenarios["+ i +"].Sign"));
			armsScenariosItem.setUserId(_ctx.stringValue("ListScenarioResponse.ArmsScenarios["+ i +"].UserId"));
			armsScenariosItem.setRegionId(_ctx.stringValue("ListScenarioResponse.ArmsScenarios["+ i +"].RegionId"));
			armsScenariosItem.setAppId(_ctx.stringValue("ListScenarioResponse.ArmsScenarios["+ i +"].AppId"));
			armsScenariosItem.setExtensions(_ctx.stringValue("ListScenarioResponse.ArmsScenarios["+ i +"].Extensions"));

			armsScenarios.add(armsScenariosItem);
		}
		listScenarioResponse.setArmsScenarios(armsScenarios);
	 
	 	return listScenarioResponse;
	}
}