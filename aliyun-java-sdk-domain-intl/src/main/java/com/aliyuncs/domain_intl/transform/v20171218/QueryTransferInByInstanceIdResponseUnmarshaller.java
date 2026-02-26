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

package com.aliyuncs.domain_intl.transform.v20171218;

import com.aliyuncs.domain_intl.model.v20171218.QueryTransferInByInstanceIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTransferInByInstanceIdResponseUnmarshaller {

	public static QueryTransferInByInstanceIdResponse unmarshall(QueryTransferInByInstanceIdResponse queryTransferInByInstanceIdResponse, UnmarshallerContext _ctx) {
		
		queryTransferInByInstanceIdResponse.setRequestId(_ctx.stringValue("QueryTransferInByInstanceIdResponse.RequestId"));
		queryTransferInByInstanceIdResponse.setStatus(_ctx.integerValue("QueryTransferInByInstanceIdResponse.Status"));
		queryTransferInByInstanceIdResponse.setTransferAuthorizationCodeSubmissionDate(_ctx.stringValue("QueryTransferInByInstanceIdResponse.TransferAuthorizationCodeSubmissionDate"));
		queryTransferInByInstanceIdResponse.setEmail(_ctx.stringValue("QueryTransferInByInstanceIdResponse.Email"));
		queryTransferInByInstanceIdResponse.setProgressBarType(_ctx.integerValue("QueryTransferInByInstanceIdResponse.ProgressBarType"));
		queryTransferInByInstanceIdResponse.setInstanceId(_ctx.stringValue("QueryTransferInByInstanceIdResponse.InstanceId"));
		queryTransferInByInstanceIdResponse.setDomainName(_ctx.stringValue("QueryTransferInByInstanceIdResponse.DomainName"));
		queryTransferInByInstanceIdResponse.setSubmissionDateLong(_ctx.longValue("QueryTransferInByInstanceIdResponse.SubmissionDateLong"));
		queryTransferInByInstanceIdResponse.setSubmissionDate(_ctx.stringValue("QueryTransferInByInstanceIdResponse.SubmissionDate"));
		queryTransferInByInstanceIdResponse.setSimpleTransferInStatus(_ctx.stringValue("QueryTransferInByInstanceIdResponse.SimpleTransferInStatus"));
		queryTransferInByInstanceIdResponse.setTransferAuthorizationCodeSubmissionDateLong(_ctx.longValue("QueryTransferInByInstanceIdResponse.TransferAuthorizationCodeSubmissionDateLong"));
		queryTransferInByInstanceIdResponse.setExpirationDateLong(_ctx.longValue("QueryTransferInByInstanceIdResponse.ExpirationDateLong"));
		queryTransferInByInstanceIdResponse.setExpirationDate(_ctx.stringValue("QueryTransferInByInstanceIdResponse.ExpirationDate"));
		queryTransferInByInstanceIdResponse.setNeedMailCheck(_ctx.booleanValue("QueryTransferInByInstanceIdResponse.NeedMailCheck"));
		queryTransferInByInstanceIdResponse.setUserId(_ctx.stringValue("QueryTransferInByInstanceIdResponse.UserId"));
		queryTransferInByInstanceIdResponse.setModificationDate(_ctx.stringValue("QueryTransferInByInstanceIdResponse.ModificationDate"));
		queryTransferInByInstanceIdResponse.setResultDateLong(_ctx.longValue("QueryTransferInByInstanceIdResponse.ResultDateLong"));
		queryTransferInByInstanceIdResponse.setResultMsg(_ctx.stringValue("QueryTransferInByInstanceIdResponse.ResultMsg"));
		queryTransferInByInstanceIdResponse.setWhoisMailStatus(_ctx.booleanValue("QueryTransferInByInstanceIdResponse.WhoisMailStatus"));
		queryTransferInByInstanceIdResponse.setModificationDateLong(_ctx.longValue("QueryTransferInByInstanceIdResponse.ModificationDateLong"));
		queryTransferInByInstanceIdResponse.setResultCode(_ctx.stringValue("QueryTransferInByInstanceIdResponse.ResultCode"));
		queryTransferInByInstanceIdResponse.setResultDate(_ctx.stringValue("QueryTransferInByInstanceIdResponse.ResultDate"));
	 
	 	return queryTransferInByInstanceIdResponse;
	}
}