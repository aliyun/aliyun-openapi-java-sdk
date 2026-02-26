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

package com.aliyuncs.cloudauth.transform.v20190307;

import com.aliyuncs.cloudauth.model.v20190307.DescribeFaceGuardRiskResponse;
import com.aliyuncs.cloudauth.model.v20190307.DescribeFaceGuardRiskResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFaceGuardRiskResponseUnmarshaller {

	public static DescribeFaceGuardRiskResponse unmarshall(DescribeFaceGuardRiskResponse describeFaceGuardRiskResponse, UnmarshallerContext _ctx) {
		
		describeFaceGuardRiskResponse.setRequestId(_ctx.stringValue("DescribeFaceGuardRiskResponse.RequestId"));
		describeFaceGuardRiskResponse.setCode(_ctx.stringValue("DescribeFaceGuardRiskResponse.Code"));
		describeFaceGuardRiskResponse.setMessage(_ctx.stringValue("DescribeFaceGuardRiskResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setRiakTags(_ctx.stringValue("DescribeFaceGuardRiskResponse.ResultObject.RiakTags"));
		resultObject.setRiskExtends(_ctx.stringValue("DescribeFaceGuardRiskResponse.ResultObject.RiskExtends"));
		resultObject.setRiskTags(_ctx.stringValue("DescribeFaceGuardRiskResponse.ResultObject.RiskTags"));
		resultObject.setCertifyId(_ctx.stringValue("DescribeFaceGuardRiskResponse.ResultObject.CertifyId"));
		describeFaceGuardRiskResponse.setResultObject(resultObject);
	 
	 	return describeFaceGuardRiskResponse;
	}
}