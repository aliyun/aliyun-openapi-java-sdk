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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnCcTopIpResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnCcTopIpResponse.AttackIpDatas;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnCcTopIpResponseUnmarshaller {

	public static DescribeScdnCcTopIpResponse unmarshall(DescribeScdnCcTopIpResponse describeScdnCcTopIpResponse, UnmarshallerContext _ctx) {
		
		describeScdnCcTopIpResponse.setRequestId(_ctx.stringValue("DescribeScdnCcTopIpResponse.RequestId"));
		describeScdnCcTopIpResponse.setTotal(_ctx.stringValue("DescribeScdnCcTopIpResponse.Total"));
		describeScdnCcTopIpResponse.setDomainName(_ctx.stringValue("DescribeScdnCcTopIpResponse.DomainName"));

		List<AttackIpDatas> attackIpDataList = new ArrayList<AttackIpDatas>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnCcTopIpResponse.AttackIpDataList.Length"); i++) {
			AttackIpDatas attackIpDatas = new AttackIpDatas();
			attackIpDatas.setIp(_ctx.stringValue("DescribeScdnCcTopIpResponse.AttackIpDataList["+ i +"].Ip"));
			attackIpDatas.setAttackCount(_ctx.stringValue("DescribeScdnCcTopIpResponse.AttackIpDataList["+ i +"].AttackCount"));

			attackIpDataList.add(attackIpDatas);
		}
		describeScdnCcTopIpResponse.setAttackIpDataList(attackIpDataList);
	 
	 	return describeScdnCcTopIpResponse;
	}
}