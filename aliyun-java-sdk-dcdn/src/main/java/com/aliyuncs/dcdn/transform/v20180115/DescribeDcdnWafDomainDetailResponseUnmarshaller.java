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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafDomainDetailResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafDomainDetailResponse.Domain;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafDomainDetailResponse.Domain.DefenseSceneItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafDomainDetailResponseUnmarshaller {

	public static DescribeDcdnWafDomainDetailResponse unmarshall(DescribeDcdnWafDomainDetailResponse describeDcdnWafDomainDetailResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafDomainDetailResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafDomainDetailResponse.RequestId"));

		Domain domain = new Domain();
		domain.setDomainName(_ctx.stringValue("DescribeDcdnWafDomainDetailResponse.Domain.DomainName"));

		List<DefenseSceneItem> defenseScenes = new ArrayList<DefenseSceneItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnWafDomainDetailResponse.Domain.DefenseScenes.Length"); i++) {
			DefenseSceneItem defenseSceneItem = new DefenseSceneItem();
			defenseSceneItem.setDefenseScene(_ctx.stringValue("DescribeDcdnWafDomainDetailResponse.Domain.DefenseScenes["+ i +"].DefenseScene"));
			defenseSceneItem.setPolicyId(_ctx.longValue("DescribeDcdnWafDomainDetailResponse.Domain.DefenseScenes["+ i +"].PolicyId"));

			defenseScenes.add(defenseSceneItem);
		}
		domain.setDefenseScenes(defenseScenes);
		describeDcdnWafDomainDetailResponse.setDomain(domain);
	 
	 	return describeDcdnWafDomainDetailResponse;
	}
}