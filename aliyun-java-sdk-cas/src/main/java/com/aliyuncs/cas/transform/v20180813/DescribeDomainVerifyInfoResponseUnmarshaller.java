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

package com.aliyuncs.cas.transform.v20180813;

import com.aliyuncs.cas.model.v20180813.DescribeDomainVerifyInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainVerifyInfoResponseUnmarshaller {

	public static DescribeDomainVerifyInfoResponse unmarshall(DescribeDomainVerifyInfoResponse describeDomainVerifyInfoResponse, UnmarshallerContext context) {
		
		describeDomainVerifyInfoResponse.setRequestId(context.stringValue("DescribeDomainVerifyInfoResponse.RequestId"));
		describeDomainVerifyInfoResponse.setType(context.stringValue("DescribeDomainVerifyInfoResponse.Type"));
		describeDomainVerifyInfoResponse.setCheckName(context.stringValue("DescribeDomainVerifyInfoResponse.CheckName"));
		describeDomainVerifyInfoResponse.setCheckValue(context.stringValue("DescribeDomainVerifyInfoResponse.CheckValue"));
		describeDomainVerifyInfoResponse.setModifiedTime(context.stringValue("DescribeDomainVerifyInfoResponse.ModifiedTime"));
		describeDomainVerifyInfoResponse.setCheckType(context.stringValue("DescribeDomainVerifyInfoResponse.CheckType"));
		describeDomainVerifyInfoResponse.setCheckName1(context.stringValue("DescribeDomainVerifyInfoResponse.CheckName1"));
		describeDomainVerifyInfoResponse.setCheckName2(context.stringValue("DescribeDomainVerifyInfoResponse.CheckName2"));
	 
	 	return describeDomainVerifyInfoResponse;
	}
}