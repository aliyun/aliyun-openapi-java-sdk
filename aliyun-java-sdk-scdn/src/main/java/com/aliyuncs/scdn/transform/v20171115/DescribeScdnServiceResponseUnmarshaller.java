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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnServiceResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnServiceResponse.LockReason;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnServiceResponseUnmarshaller {

	public static DescribeScdnServiceResponse unmarshall(DescribeScdnServiceResponse describeScdnServiceResponse, UnmarshallerContext context) {
		
		describeScdnServiceResponse.setRequestId(context.stringValue("DescribeScdnServiceResponse.RequestId"));
		describeScdnServiceResponse.setInstanceId(context.stringValue("DescribeScdnServiceResponse.InstanceId"));
		describeScdnServiceResponse.setOpenTime(context.stringValue("DescribeScdnServiceResponse.OpenTime"));
		describeScdnServiceResponse.setEndTime(context.stringValue("DescribeScdnServiceResponse.EndTime"));
		describeScdnServiceResponse.setProtectType(context.stringValue("DescribeScdnServiceResponse.ProtectType"));
		describeScdnServiceResponse.setProtectTypeValue(context.stringValue("DescribeScdnServiceResponse.ProtectTypeValue"));
		describeScdnServiceResponse.setBandwidth(context.stringValue("DescribeScdnServiceResponse.Bandwidth"));
		describeScdnServiceResponse.setCcProtection(context.stringValue("DescribeScdnServiceResponse.CcProtection"));
		describeScdnServiceResponse.setDDoSBasic(context.stringValue("DescribeScdnServiceResponse.DDoSBasic"));
		describeScdnServiceResponse.setDomainCount(context.stringValue("DescribeScdnServiceResponse.DomainCount"));
		describeScdnServiceResponse.setElasticProtection(context.stringValue("DescribeScdnServiceResponse.ElasticProtection"));
		describeScdnServiceResponse.setBandwidthValue(context.stringValue("DescribeScdnServiceResponse.BandwidthValue"));
		describeScdnServiceResponse.setCcProtectionValue(context.stringValue("DescribeScdnServiceResponse.CcProtectionValue"));
		describeScdnServiceResponse.setDDoSBasicValue(context.stringValue("DescribeScdnServiceResponse.DDoSBasicValue"));
		describeScdnServiceResponse.setDomainCountValue(context.stringValue("DescribeScdnServiceResponse.DomainCountValue"));
		describeScdnServiceResponse.setElasticProtectionValue(context.stringValue("DescribeScdnServiceResponse.ElasticProtectionValue"));
		describeScdnServiceResponse.setPriceType(context.stringValue("DescribeScdnServiceResponse.PriceType"));
		describeScdnServiceResponse.setPricingCycle(context.stringValue("DescribeScdnServiceResponse.PricingCycle"));

		List<LockReason> operationLocks = new ArrayList<LockReason>();
		for (int i = 0; i < context.lengthValue("DescribeScdnServiceResponse.OperationLocks.Length"); i++) {
			LockReason lockReason = new LockReason();
			lockReason.setLockReason(context.stringValue("DescribeScdnServiceResponse.OperationLocks["+ i +"].LockReason"));

			operationLocks.add(lockReason);
		}
		describeScdnServiceResponse.setOperationLocks(operationLocks);
	 
	 	return describeScdnServiceResponse;
	}
}