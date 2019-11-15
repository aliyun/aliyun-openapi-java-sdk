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

	public static DescribeScdnServiceResponse unmarshall(DescribeScdnServiceResponse describeScdnServiceResponse, UnmarshallerContext _ctx) {
		
		describeScdnServiceResponse.setRequestId(_ctx.stringValue("DescribeScdnServiceResponse.RequestId"));
		describeScdnServiceResponse.setChangingAffectTime(_ctx.stringValue("DescribeScdnServiceResponse.ChangingAffectTime"));
		describeScdnServiceResponse.setInternetChargeType(_ctx.stringValue("DescribeScdnServiceResponse.InternetChargeType"));
		describeScdnServiceResponse.setChangingChargeType(_ctx.stringValue("DescribeScdnServiceResponse.ChangingChargeType"));
		describeScdnServiceResponse.setInstanceId(_ctx.stringValue("DescribeScdnServiceResponse.InstanceId"));
		describeScdnServiceResponse.setOpenTime(_ctx.stringValue("DescribeScdnServiceResponse.OpenTime"));
		describeScdnServiceResponse.setEndTime(_ctx.stringValue("DescribeScdnServiceResponse.EndTime"));
		describeScdnServiceResponse.setProtectType(_ctx.stringValue("DescribeScdnServiceResponse.ProtectType"));
		describeScdnServiceResponse.setProtectTypeValue(_ctx.stringValue("DescribeScdnServiceResponse.ProtectTypeValue"));
		describeScdnServiceResponse.setBandwidth(_ctx.stringValue("DescribeScdnServiceResponse.Bandwidth"));
		describeScdnServiceResponse.setCcProtection(_ctx.stringValue("DescribeScdnServiceResponse.CcProtection"));
		describeScdnServiceResponse.setDDoSBasic(_ctx.stringValue("DescribeScdnServiceResponse.DDoSBasic"));
		describeScdnServiceResponse.setDomainCount(_ctx.stringValue("DescribeScdnServiceResponse.DomainCount"));
		describeScdnServiceResponse.setElasticProtection(_ctx.stringValue("DescribeScdnServiceResponse.ElasticProtection"));
		describeScdnServiceResponse.setBandwidthValue(_ctx.stringValue("DescribeScdnServiceResponse.BandwidthValue"));
		describeScdnServiceResponse.setCcProtectionValue(_ctx.stringValue("DescribeScdnServiceResponse.CcProtectionValue"));
		describeScdnServiceResponse.setDDoSBasicValue(_ctx.stringValue("DescribeScdnServiceResponse.DDoSBasicValue"));
		describeScdnServiceResponse.setDomainCountValue(_ctx.stringValue("DescribeScdnServiceResponse.DomainCountValue"));
		describeScdnServiceResponse.setElasticProtectionValue(_ctx.stringValue("DescribeScdnServiceResponse.ElasticProtectionValue"));
		describeScdnServiceResponse.setCurrentProtectType(_ctx.stringValue("DescribeScdnServiceResponse.CurrentProtectType"));
		describeScdnServiceResponse.setCurrentProtectTypeValue(_ctx.stringValue("DescribeScdnServiceResponse.CurrentProtectTypeValue"));
		describeScdnServiceResponse.setCurrentBandwidth(_ctx.stringValue("DescribeScdnServiceResponse.CurrentBandwidth"));
		describeScdnServiceResponse.setCurrentCcProtection(_ctx.stringValue("DescribeScdnServiceResponse.CurrentCcProtection"));
		describeScdnServiceResponse.setCurrentDDoSBasic(_ctx.stringValue("DescribeScdnServiceResponse.CurrentDDoSBasic"));
		describeScdnServiceResponse.setCurrentDomainCount(_ctx.stringValue("DescribeScdnServiceResponse.CurrentDomainCount"));
		describeScdnServiceResponse.setCurrentElasticProtection(_ctx.stringValue("DescribeScdnServiceResponse.CurrentElasticProtection"));
		describeScdnServiceResponse.setCurrentBandwidthValue(_ctx.stringValue("DescribeScdnServiceResponse.CurrentBandwidthValue"));
		describeScdnServiceResponse.setCurrentCcProtectionValue(_ctx.stringValue("DescribeScdnServiceResponse.CurrentCcProtectionValue"));
		describeScdnServiceResponse.setCurrentDDoSBasicValue(_ctx.stringValue("DescribeScdnServiceResponse.CurrentDDoSBasicValue"));
		describeScdnServiceResponse.setCurrentDomainCountValue(_ctx.stringValue("DescribeScdnServiceResponse.CurrentDomainCountValue"));
		describeScdnServiceResponse.setCurrentElasticProtectionValue(_ctx.stringValue("DescribeScdnServiceResponse.CurrentElasticProtectionValue"));
		describeScdnServiceResponse.setPriceType(_ctx.stringValue("DescribeScdnServiceResponse.PriceType"));
		describeScdnServiceResponse.setPricingCycle(_ctx.stringValue("DescribeScdnServiceResponse.PricingCycle"));
		describeScdnServiceResponse.setChangingChargeType1(_ctx.stringValue("DescribeScdnServiceResponse.ChangingChargeType"));

		List<LockReason> operationLocks = new ArrayList<LockReason>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnServiceResponse.OperationLocks.Length"); i++) {
			LockReason lockReason = new LockReason();
			lockReason.setLockReason(_ctx.stringValue("DescribeScdnServiceResponse.OperationLocks["+ i +"].LockReason"));

			operationLocks.add(lockReason);
		}
		describeScdnServiceResponse.setOperationLocks(operationLocks);
	 
	 	return describeScdnServiceResponse;
	}
}