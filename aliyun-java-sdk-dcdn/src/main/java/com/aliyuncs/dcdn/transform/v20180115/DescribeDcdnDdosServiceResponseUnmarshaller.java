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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDdosServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDdosServiceResponseUnmarshaller {

	public static DescribeDcdnDdosServiceResponse unmarshall(DescribeDcdnDdosServiceResponse describeDcdnDdosServiceResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDdosServiceResponse.setRequestId(_ctx.stringValue("DescribeDcdnDdosServiceResponse.RequestId"));
		describeDcdnDdosServiceResponse.setStatus(_ctx.stringValue("DescribeDcdnDdosServiceResponse.Status"));
		describeDcdnDdosServiceResponse.setChangingAffectTime(_ctx.stringValue("DescribeDcdnDdosServiceResponse.ChangingAffectTime"));
		describeDcdnDdosServiceResponse.setOpeningTime(_ctx.stringValue("DescribeDcdnDdosServiceResponse.OpeningTime"));
		describeDcdnDdosServiceResponse.setChangingEdition(_ctx.stringValue("DescribeDcdnDdosServiceResponse.ChangingEdition"));
		describeDcdnDdosServiceResponse.setChargeType(_ctx.stringValue("DescribeDcdnDdosServiceResponse.ChargeType"));
		describeDcdnDdosServiceResponse.setDomianNum(_ctx.integerValue("DescribeDcdnDdosServiceResponse.DomianNum"));
		describeDcdnDdosServiceResponse.setChangingProtectNum(_ctx.integerValue("DescribeDcdnDdosServiceResponse.ChangingProtectNum"));
		describeDcdnDdosServiceResponse.setChangingDomianNum(_ctx.integerValue("DescribeDcdnDdosServiceResponse.ChangingDomianNum"));
		describeDcdnDdosServiceResponse.setInstanceId(_ctx.stringValue("DescribeDcdnDdosServiceResponse.InstanceId"));
		describeDcdnDdosServiceResponse.setEdition(_ctx.stringValue("DescribeDcdnDdosServiceResponse.Edition"));
		describeDcdnDdosServiceResponse.setChangingChargeType(_ctx.stringValue("DescribeDcdnDdosServiceResponse.ChangingChargeType"));
		describeDcdnDdosServiceResponse.setProtectNum(_ctx.integerValue("DescribeDcdnDdosServiceResponse.ProtectNum"));
		describeDcdnDdosServiceResponse.setEnabled(_ctx.stringValue("DescribeDcdnDdosServiceResponse.Enabled"));
		describeDcdnDdosServiceResponse.setEndingTime(_ctx.stringValue("DescribeDcdnDdosServiceResponse.EndingTime"));
	 
	 	return describeDcdnDdosServiceResponse;
	}
}