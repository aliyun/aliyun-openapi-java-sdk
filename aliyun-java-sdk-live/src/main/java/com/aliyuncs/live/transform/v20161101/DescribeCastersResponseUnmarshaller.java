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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeCastersResponse;
import com.aliyuncs.live.model.v20161101.DescribeCastersResponse.Caster;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCastersResponseUnmarshaller {

	public static DescribeCastersResponse unmarshall(DescribeCastersResponse describeCastersResponse, UnmarshallerContext context) {
		
		describeCastersResponse.setRequestId(context.stringValue("DescribeCastersResponse.RequestId"));
		describeCastersResponse.setTotal(context.integerValue("DescribeCastersResponse.Total"));

		List<Caster> casterList = new ArrayList<Caster>();
		for (int i = 0; i < context.lengthValue("DescribeCastersResponse.CasterList.Length"); i++) {
			Caster caster = new Caster();
			caster.setStatus(context.integerValue("DescribeCastersResponse.CasterList["+ i +"].Status"));
			caster.setNormType(context.integerValue("DescribeCastersResponse.CasterList["+ i +"].NormType"));
			caster.setCasterId(context.stringValue("DescribeCastersResponse.CasterList["+ i +"].CasterId"));
			caster.setCasterName(context.stringValue("DescribeCastersResponse.CasterList["+ i +"].CasterName"));
			caster.setCreateTime(context.stringValue("DescribeCastersResponse.CasterList["+ i +"].CreateTime"));
			caster.setStartTime(context.stringValue("DescribeCastersResponse.CasterList["+ i +"].StartTime"));
			caster.setPurchaseTime(context.stringValue("DescribeCastersResponse.CasterList["+ i +"].PurchaseTime"));
			caster.setExpireTime(context.stringValue("DescribeCastersResponse.CasterList["+ i +"].ExpireTime"));
			caster.setChargeType(context.stringValue("DescribeCastersResponse.CasterList["+ i +"].ChargeType"));
			caster.setCasterTemplate(context.stringValue("DescribeCastersResponse.CasterList["+ i +"].CasterTemplate"));
			caster.setChannelEnable(context.integerValue("DescribeCastersResponse.CasterList["+ i +"].ChannelEnable"));

			casterList.add(caster);
		}
		describeCastersResponse.setCasterList(casterList);
	 
	 	return describeCastersResponse;
	}
}