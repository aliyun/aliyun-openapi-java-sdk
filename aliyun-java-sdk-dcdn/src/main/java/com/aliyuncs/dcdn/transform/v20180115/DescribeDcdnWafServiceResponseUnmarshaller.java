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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafServiceResponseUnmarshaller {

	public static DescribeDcdnWafServiceResponse unmarshall(DescribeDcdnWafServiceResponse describeDcdnWafServiceResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafServiceResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafServiceResponse.RequestId"));
		describeDcdnWafServiceResponse.setStatus(_ctx.stringValue("DescribeDcdnWafServiceResponse.Status"));
		describeDcdnWafServiceResponse.setRequestBillingType(_ctx.stringValue("DescribeDcdnWafServiceResponse.RequestBillingType"));
		describeDcdnWafServiceResponse.setEdition(_ctx.stringValue("DescribeDcdnWafServiceResponse.Edition"));
		describeDcdnWafServiceResponse.setOpeningTime(_ctx.stringValue("DescribeDcdnWafServiceResponse.OpeningTime"));
		describeDcdnWafServiceResponse.setEnabled(_ctx.stringValue("DescribeDcdnWafServiceResponse.Enabled"));
		describeDcdnWafServiceResponse.setRuleBillingType(_ctx.stringValue("DescribeDcdnWafServiceResponse.RuleBillingType"));
	 
	 	return describeDcdnWafServiceResponse;
	}
}