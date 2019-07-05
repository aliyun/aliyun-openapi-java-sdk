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

package com.aliyuncs.domain.transform.v20180129;

import com.aliyuncs.domain.model.v20180129.QueryTransferInByInstanceIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTransferInByInstanceIdResponseUnmarshaller {

	public static QueryTransferInByInstanceIdResponse unmarshall(QueryTransferInByInstanceIdResponse queryTransferInByInstanceIdResponse, UnmarshallerContext _ctx) {
		
		queryTransferInByInstanceIdResponse.setRequestId(_ctx.stringValue("QueryTransferInByInstanceIdResponse.RequestId"));
		queryTransferInByInstanceIdResponse.setSubmissionDate(_ctx.stringValue("QueryTransferInByInstanceIdResponse.SubmissionDate"));
		queryTransferInByInstanceIdResponse.setModificationDate(_ctx.stringValue("QueryTransferInByInstanceIdResponse.ModificationDate"));
		queryTransferInByInstanceIdResponse.setUserId(_ctx.stringValue("QueryTransferInByInstanceIdResponse.UserId"));
		queryTransferInByInstanceIdResponse.setInstanceId(_ctx.stringValue("QueryTransferInByInstanceIdResponse.InstanceId"));
		queryTransferInByInstanceIdResponse.setDomainName(_ctx.stringValue("QueryTransferInByInstanceIdResponse.DomainName"));
		queryTransferInByInstanceIdResponse.setStatus(_ctx.integerValue("QueryTransferInByInstanceIdResponse.Status"));
		queryTransferInByInstanceIdResponse.setSimpleTransferInStatus(_ctx.stringValue("QueryTransferInByInstanceIdResponse.SimpleTransferInStatus"));
		queryTransferInByInstanceIdResponse.setResultCode(_ctx.stringValue("QueryTransferInByInstanceIdResponse.ResultCode"));
		queryTransferInByInstanceIdResponse.setResultDate(_ctx.stringValue("QueryTransferInByInstanceIdResponse.ResultDate"));
		queryTransferInByInstanceIdResponse.setResultMsg(_ctx.stringValue("QueryTransferInByInstanceIdResponse.ResultMsg"));
		queryTransferInByInstanceIdResponse.setTransferAuthorizationCodeSubmissionDate(_ctx.stringValue("QueryTransferInByInstanceIdResponse.TransferAuthorizationCodeSubmissionDate"));
		queryTransferInByInstanceIdResponse.setNeedMailCheck(_ctx.booleanValue("QueryTransferInByInstanceIdResponse.NeedMailCheck"));
		queryTransferInByInstanceIdResponse.setEmail(_ctx.stringValue("QueryTransferInByInstanceIdResponse.Email"));
		queryTransferInByInstanceIdResponse.setWhoisMailStatus(_ctx.booleanValue("QueryTransferInByInstanceIdResponse.WhoisMailStatus"));
		queryTransferInByInstanceIdResponse.setExpirationDate(_ctx.stringValue("QueryTransferInByInstanceIdResponse.ExpirationDate"));
		queryTransferInByInstanceIdResponse.setProgressBarType(_ctx.integerValue("QueryTransferInByInstanceIdResponse.ProgressBarType"));
		queryTransferInByInstanceIdResponse.setSubmissionDateLong(_ctx.longValue("QueryTransferInByInstanceIdResponse.SubmissionDateLong"));
		queryTransferInByInstanceIdResponse.setModificationDateLong(_ctx.longValue("QueryTransferInByInstanceIdResponse.ModificationDateLong"));
		queryTransferInByInstanceIdResponse.setResultDateLong(_ctx.longValue("QueryTransferInByInstanceIdResponse.ResultDateLong"));
		queryTransferInByInstanceIdResponse.setExpirationDateLong(_ctx.longValue("QueryTransferInByInstanceIdResponse.ExpirationDateLong"));
		queryTransferInByInstanceIdResponse.setTransferAuthorizationCodeSubmissionDateLong(_ctx.longValue("QueryTransferInByInstanceIdResponse.TransferAuthorizationCodeSubmissionDateLong"));
	 
	 	return queryTransferInByInstanceIdResponse;
	}
}