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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.QueryAgreementResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryAgreementResponse.QueryAgreementResponse1;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAgreementResponseUnmarshaller {

	public static QueryAgreementResponse unmarshall(QueryAgreementResponse queryAgreementResponse, UnmarshallerContext _ctx) {
		
		queryAgreementResponse.setRequestId(_ctx.stringValue("QueryAgreementResponse.RequestId"));
		queryAgreementResponse.setCode(_ctx.stringValue("QueryAgreementResponse.Code"));
		queryAgreementResponse.setMessage(_ctx.stringValue("QueryAgreementResponse.Message"));

		QueryAgreementResponse1 queryAgreementResponse1 = new QueryAgreementResponse1();
		queryAgreementResponse1.setValidTime(_ctx.stringValue("QueryAgreementResponse.QueryAgreementResponse.ValidTime"));
		queryAgreementResponse1.setInvalidTime(_ctx.stringValue("QueryAgreementResponse.QueryAgreementResponse.InvalidTime"));
		queryAgreementResponse1.setAgreementNo(_ctx.stringValue("QueryAgreementResponse.QueryAgreementResponse.AgreementNo"));
		queryAgreementResponse1.setStatus(_ctx.stringValue("QueryAgreementResponse.QueryAgreementResponse.Status"));
		queryAgreementResponse1.setSignTime(_ctx.stringValue("QueryAgreementResponse.QueryAgreementResponse.SignTime"));
		queryAgreementResponse1.setExternalAgreementNo(_ctx.stringValue("QueryAgreementResponse.QueryAgreementResponse.ExternalAgreementNo"));
		queryAgreementResponse.setQueryAgreementResponse1(queryAgreementResponse1);
	 
	 	return queryAgreementResponse;
	}
}