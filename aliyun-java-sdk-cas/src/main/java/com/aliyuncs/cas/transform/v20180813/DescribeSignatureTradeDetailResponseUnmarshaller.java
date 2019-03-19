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

import com.aliyuncs.cas.model.v20180813.DescribeSignatureTradeDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSignatureTradeDetailResponseUnmarshaller {

	public static DescribeSignatureTradeDetailResponse unmarshall(DescribeSignatureTradeDetailResponse describeSignatureTradeDetailResponse, UnmarshallerContext context) {
		
		describeSignatureTradeDetailResponse.setRequestId(context.stringValue("DescribeSignatureTradeDetailResponse.RequestId"));
		describeSignatureTradeDetailResponse.setId(context.longValue("DescribeSignatureTradeDetailResponse.Id"));
		describeSignatureTradeDetailResponse.setDocTitle(context.stringValue("DescribeSignatureTradeDetailResponse.DocTitle"));
		describeSignatureTradeDetailResponse.setTransactionId(context.stringValue("DescribeSignatureTradeDetailResponse.TransactionId"));
		describeSignatureTradeDetailResponse.setPeopleName(context.stringValue("DescribeSignatureTradeDetailResponse.PeopleName"));
		describeSignatureTradeDetailResponse.setCreateTime(context.longValue("DescribeSignatureTradeDetailResponse.CreateTime"));
		describeSignatureTradeDetailResponse.setSignStatus(context.integerValue("DescribeSignatureTradeDetailResponse.SignStatus"));
		describeSignatureTradeDetailResponse.setSignMode(context.integerValue("DescribeSignatureTradeDetailResponse.SignMode"));
		describeSignatureTradeDetailResponse.setDocId(context.stringValue("DescribeSignatureTradeDetailResponse.DocId"));
		describeSignatureTradeDetailResponse.setPeopleId(context.stringValue("DescribeSignatureTradeDetailResponse.PeopleId"));
		describeSignatureTradeDetailResponse.setPeopleIdentity(context.stringValue("DescribeSignatureTradeDetailResponse.PeopleIdentity"));
		describeSignatureTradeDetailResponse.setPeopleMobile(context.stringValue("DescribeSignatureTradeDetailResponse.PeopleMobile"));
		describeSignatureTradeDetailResponse.setPeopleEmail(context.stringValue("DescribeSignatureTradeDetailResponse.PeopleEmail"));
		describeSignatureTradeDetailResponse.setSignCompany(context.stringValue("DescribeSignatureTradeDetailResponse.SignCompany"));
	 
	 	return describeSignatureTradeDetailResponse;
	}
}