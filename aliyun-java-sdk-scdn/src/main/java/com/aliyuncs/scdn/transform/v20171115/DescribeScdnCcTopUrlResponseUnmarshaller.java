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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnCcTopUrlResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnCcTopUrlResponse.AttackUrlDatas;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnCcTopUrlResponseUnmarshaller {

	public static DescribeScdnCcTopUrlResponse unmarshall(DescribeScdnCcTopUrlResponse describeScdnCcTopUrlResponse, UnmarshallerContext _ctx) {
		
		describeScdnCcTopUrlResponse.setRequestId(_ctx.stringValue("DescribeScdnCcTopUrlResponse.RequestId"));
		describeScdnCcTopUrlResponse.setTotal(_ctx.stringValue("DescribeScdnCcTopUrlResponse.Total"));
		describeScdnCcTopUrlResponse.setDomainName(_ctx.stringValue("DescribeScdnCcTopUrlResponse.DomainName"));

		List<AttackUrlDatas> attackUrlDataList = new ArrayList<AttackUrlDatas>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnCcTopUrlResponse.AttackUrlDataList.Length"); i++) {
			AttackUrlDatas attackUrlDatas = new AttackUrlDatas();
			attackUrlDatas.setUrl(_ctx.stringValue("DescribeScdnCcTopUrlResponse.AttackUrlDataList["+ i +"].Url"));
			attackUrlDatas.setAttackCount(_ctx.stringValue("DescribeScdnCcTopUrlResponse.AttackUrlDataList["+ i +"].AttackCount"));

			attackUrlDataList.add(attackUrlDatas);
		}
		describeScdnCcTopUrlResponse.setAttackUrlDataList(attackUrlDataList);
	 
	 	return describeScdnCcTopUrlResponse;
	}
}