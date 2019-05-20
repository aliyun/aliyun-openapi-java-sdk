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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.QueryAliyunCorpNumberResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryAliyunCorpNumberResponse.Number;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryAliyunCorpNumberResponse.Number.PrivacyNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAliyunCorpNumberResponseUnmarshaller {

	public static QueryAliyunCorpNumberResponse unmarshall(QueryAliyunCorpNumberResponse queryAliyunCorpNumberResponse, UnmarshallerContext context) {
		
		queryAliyunCorpNumberResponse.setRequestId(context.stringValue("QueryAliyunCorpNumberResponse.RequestId"));
		queryAliyunCorpNumberResponse.setSuccess(context.booleanValue("QueryAliyunCorpNumberResponse.Success"));
		queryAliyunCorpNumberResponse.setCode(context.stringValue("QueryAliyunCorpNumberResponse.Code"));
		queryAliyunCorpNumberResponse.setMessage(context.stringValue("QueryAliyunCorpNumberResponse.Message"));
		queryAliyunCorpNumberResponse.setHttpStatusCode(context.integerValue("QueryAliyunCorpNumberResponse.HttpStatusCode"));

		List<Number> numbers = new ArrayList<Number>();
		for (int i = 0; i < context.lengthValue("QueryAliyunCorpNumberResponse.Numbers.Length"); i++) {
			Number number = new Number();
			number.setTaobaoUid(context.longValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].taobaoUid"));
			number.setRamId(context.longValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].RamId"));
			number.setRealNameInsId(context.longValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].RealNameInsId"));
			number.setNumber(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].Number"));
			number.setRegionNameProvince(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].RegionNameProvince"));
			number.setRegionNameCity(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].RegionNameCity"));
			number.setCorpName(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].CorpName"));
			number.setMonthlyPrice(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].MonthlyPrice"));
			number.setSpecName(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].SpecName"));
			number.setCommodityInstanceId(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].CommodityInstanceId"));
			number.setNumberCommodityStatus(context.integerValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].NumberCommodityStatus"));
			number.setGmtCreate(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].GmtCreate"));

			PrivacyNumber privacyNumber = new PrivacyNumber();
			privacyNumber.setPoolId(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].PrivacyNumber.PoolId"));
			privacyNumber.setType(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].PrivacyNumber.Type"));
			privacyNumber.setTelX(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].PrivacyNumber.TelX"));
			privacyNumber.setPoolName(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].PrivacyNumber.PoolName"));
			privacyNumber.setExtra(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].PrivacyNumber.Extra"));
			privacyNumber.setBizId(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].PrivacyNumber.BizId"));
			privacyNumber.setSubId(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].PrivacyNumber.SubId"));
			privacyNumber.setProviderId(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].PrivacyNumber.ProviderId"));
			privacyNumber.setRegionNameCity(context.stringValue("QueryAliyunCorpNumberResponse.Numbers["+ i +"].PrivacyNumber.RegionNameCity"));
			number.setPrivacyNumber(privacyNumber);

			numbers.add(number);
		}
		queryAliyunCorpNumberResponse.setNumbers(numbers);
	 
	 	return queryAliyunCorpNumberResponse;
	}
}