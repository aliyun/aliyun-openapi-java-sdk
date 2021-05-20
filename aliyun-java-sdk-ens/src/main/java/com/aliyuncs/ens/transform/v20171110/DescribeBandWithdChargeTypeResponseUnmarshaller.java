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

package com.aliyuncs.ens.transform.v20171110;

import com.aliyuncs.ens.model.v20171110.DescribeBandWithdChargeTypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBandWithdChargeTypeResponseUnmarshaller {

	public static DescribeBandWithdChargeTypeResponse unmarshall(DescribeBandWithdChargeTypeResponse describeBandWithdChargeTypeResponse, UnmarshallerContext _ctx) {
		
		describeBandWithdChargeTypeResponse.setRequestId(_ctx.stringValue("DescribeBandWithdChargeTypeResponse.RequestId"));
		describeBandWithdChargeTypeResponse.setBandWithTypeInfo(_ctx.stringValue("DescribeBandWithdChargeTypeResponse.BandWithTypeInfo"));
		describeBandWithdChargeTypeResponse.setChargeContractType(_ctx.stringValue("DescribeBandWithdChargeTypeResponse.ChargeContractType"));
		describeBandWithdChargeTypeResponse.setChargeCycleInfo(_ctx.stringValue("DescribeBandWithdChargeTypeResponse.ChargeCycleInfo"));
		describeBandWithdChargeTypeResponse.setCode(_ctx.integerValue("DescribeBandWithdChargeTypeResponse.Code"));
	 
	 	return describeBandWithdChargeTypeResponse;
	}
}