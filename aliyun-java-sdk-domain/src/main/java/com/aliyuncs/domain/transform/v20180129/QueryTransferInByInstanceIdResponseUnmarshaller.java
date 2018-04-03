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

	public static QueryTransferInByInstanceIdResponse unmarshall(QueryTransferInByInstanceIdResponse queryTransferInByInstanceIdResponse, UnmarshallerContext context) {
		
		queryTransferInByInstanceIdResponse.setRequestId(context.stringValue("QueryTransferInByInstanceIdResponse.RequestId"));
		queryTransferInByInstanceIdResponse.setSubmissionDate(context.stringValue("QueryTransferInByInstanceIdResponse.SubmissionDate"));
		queryTransferInByInstanceIdResponse.setModificationDate(context.stringValue("QueryTransferInByInstanceIdResponse.ModificationDate"));
		queryTransferInByInstanceIdResponse.setUserId(context.stringValue("QueryTransferInByInstanceIdResponse.UserId"));
		queryTransferInByInstanceIdResponse.setInstanceId(context.stringValue("QueryTransferInByInstanceIdResponse.InstanceId"));
		queryTransferInByInstanceIdResponse.setDomainName(context.stringValue("QueryTransferInByInstanceIdResponse.DomainName"));
		queryTransferInByInstanceIdResponse.setStatus(context.integerValue("QueryTransferInByInstanceIdResponse.Status"));
		queryTransferInByInstanceIdResponse.setSimpleTransferInStatus(context.stringValue("QueryTransferInByInstanceIdResponse.SimpleTransferInStatus"));
		queryTransferInByInstanceIdResponse.setResultCode(context.stringValue("QueryTransferInByInstanceIdResponse.ResultCode"));
		queryTransferInByInstanceIdResponse.setResultDate(context.stringValue("QueryTransferInByInstanceIdResponse.ResultDate"));
		queryTransferInByInstanceIdResponse.setResultMsg(context.stringValue("QueryTransferInByInstanceIdResponse.ResultMsg"));
		queryTransferInByInstanceIdResponse.setTransferAuthorizationCodeSubmissionDate(context.stringValue("QueryTransferInByInstanceIdResponse.TransferAuthorizationCodeSubmissionDate"));
		queryTransferInByInstanceIdResponse.setNeedMailCheck(context.booleanValue("QueryTransferInByInstanceIdResponse.NeedMailCheck"));
		queryTransferInByInstanceIdResponse.setEmail(context.stringValue("QueryTransferInByInstanceIdResponse.Email"));
		queryTransferInByInstanceIdResponse.setWhoisMailStatus(context.booleanValue("QueryTransferInByInstanceIdResponse.WhoisMailStatus"));
		queryTransferInByInstanceIdResponse.setExpirationDate(context.stringValue("QueryTransferInByInstanceIdResponse.ExpirationDate"));
		queryTransferInByInstanceIdResponse.setProgressBarType(context.integerValue("QueryTransferInByInstanceIdResponse.ProgressBarType"));
		queryTransferInByInstanceIdResponse.setSubmissionDateLong(context.longValue("QueryTransferInByInstanceIdResponse.SubmissionDateLong"));
		queryTransferInByInstanceIdResponse.setModificationDateLong(context.longValue("QueryTransferInByInstanceIdResponse.ModificationDateLong"));
		queryTransferInByInstanceIdResponse.setResultDateLong(context.longValue("QueryTransferInByInstanceIdResponse.ResultDateLong"));
		queryTransferInByInstanceIdResponse.setExpirationDateLong(context.longValue("QueryTransferInByInstanceIdResponse.ExpirationDateLong"));
		queryTransferInByInstanceIdResponse.setTransferAuthorizationCodeSubmissionDateLong(context.longValue("QueryTransferInByInstanceIdResponse.TransferAuthorizationCodeSubmissionDateLong"));
	 
	 	return queryTransferInByInstanceIdResponse;
	}
}