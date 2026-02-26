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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafScenesResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafScenesResponse.DefenseSceneItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafScenesResponseUnmarshaller {

	public static DescribeDcdnWafScenesResponse unmarshall(DescribeDcdnWafScenesResponse describeDcdnWafScenesResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafScenesResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafScenesResponse.RequestId"));

		List<DefenseSceneItem> defenseScenes = new ArrayList<DefenseSceneItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnWafScenesResponse.DefenseScenes.Length"); i++) {
			DefenseSceneItem defenseSceneItem = new DefenseSceneItem();
			defenseSceneItem.setPolicyCount(_ctx.integerValue("DescribeDcdnWafScenesResponse.DefenseScenes["+ i +"].PolicyCount"));
			defenseSceneItem.setRuleCount(_ctx.integerValue("DescribeDcdnWafScenesResponse.DefenseScenes["+ i +"].RuleCount"));
			defenseSceneItem.setDefenseScene(_ctx.stringValue("DescribeDcdnWafScenesResponse.DefenseScenes["+ i +"].DefenseScene"));

			defenseScenes.add(defenseSceneItem);
		}
		describeDcdnWafScenesResponse.setDefenseScenes(defenseScenes);
	 
	 	return describeDcdnWafScenesResponse;
	}
}