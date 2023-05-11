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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.QueryProductCertInfoResponse;
import com.aliyuncs.iot.model.v20180120.QueryProductCertInfoResponse.ProductCertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductCertInfoResponseUnmarshaller {

	public static QueryProductCertInfoResponse unmarshall(QueryProductCertInfoResponse queryProductCertInfoResponse, UnmarshallerContext _ctx) {
		
		queryProductCertInfoResponse.setRequestId(_ctx.stringValue("QueryProductCertInfoResponse.RequestId"));
		queryProductCertInfoResponse.setSuccess(_ctx.booleanValue("QueryProductCertInfoResponse.Success"));
		queryProductCertInfoResponse.setCode(_ctx.stringValue("QueryProductCertInfoResponse.Code"));
		queryProductCertInfoResponse.setErrorMessage(_ctx.stringValue("QueryProductCertInfoResponse.ErrorMessage"));

		ProductCertInfo productCertInfo = new ProductCertInfo();
		productCertInfo.setIssueModel(_ctx.integerValue("QueryProductCertInfoResponse.ProductCertInfo.IssueModel"));
		queryProductCertInfoResponse.setProductCertInfo(productCertInfo);
	 
	 	return queryProductCertInfoResponse;
	}
}