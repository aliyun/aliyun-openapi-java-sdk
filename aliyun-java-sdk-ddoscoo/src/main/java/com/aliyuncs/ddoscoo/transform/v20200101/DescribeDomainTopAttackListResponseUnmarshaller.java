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

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainTopAttackListResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainTopAttackListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainTopAttackListResponseUnmarshaller {

	public static DescribeDomainTopAttackListResponse unmarshall(DescribeDomainTopAttackListResponse describeDomainTopAttackListResponse, UnmarshallerContext _ctx) {
		
		describeDomainTopAttackListResponse.setRequestId(_ctx.stringValue("DescribeDomainTopAttackListResponse.RequestId"));

		List<Data> attackList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainTopAttackListResponse.AttackList.Length"); i++) {
			Data data = new Data();
			data.setCount(_ctx.longValue("DescribeDomainTopAttackListResponse.AttackList["+ i +"].Count"));
			data.setAttack(_ctx.longValue("DescribeDomainTopAttackListResponse.AttackList["+ i +"].Attack"));
			data.setDomain(_ctx.stringValue("DescribeDomainTopAttackListResponse.AttackList["+ i +"].Domain"));

			attackList.add(data);
		}
		describeDomainTopAttackListResponse.setAttackList(attackList);
	 
	 	return describeDomainTopAttackListResponse;
	}
}