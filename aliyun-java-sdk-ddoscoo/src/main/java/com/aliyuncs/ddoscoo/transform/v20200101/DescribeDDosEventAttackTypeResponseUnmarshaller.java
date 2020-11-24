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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDDosEventAttackTypeResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDDosEventAttackTypeResponse.EventAttackType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDDosEventAttackTypeResponseUnmarshaller {

	public static DescribeDDosEventAttackTypeResponse unmarshall(DescribeDDosEventAttackTypeResponse describeDDosEventAttackTypeResponse, UnmarshallerContext _ctx) {
		
		describeDDosEventAttackTypeResponse.setRequestId(_ctx.stringValue("DescribeDDosEventAttackTypeResponse.RequestId"));

		List<EventAttackType> attackTypes = new ArrayList<EventAttackType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDDosEventAttackTypeResponse.AttackTypes.Length"); i++) {
			EventAttackType eventAttackType = new EventAttackType();
			eventAttackType.setAttackType(_ctx.stringValue("DescribeDDosEventAttackTypeResponse.AttackTypes["+ i +"].AttackType"));
			eventAttackType.setInPkts(_ctx.longValue("DescribeDDosEventAttackTypeResponse.AttackTypes["+ i +"].InPkts"));

			attackTypes.add(eventAttackType);
		}
		describeDDosEventAttackTypeResponse.setAttackTypes(attackTypes);
	 
	 	return describeDDosEventAttackTypeResponse;
	}
}