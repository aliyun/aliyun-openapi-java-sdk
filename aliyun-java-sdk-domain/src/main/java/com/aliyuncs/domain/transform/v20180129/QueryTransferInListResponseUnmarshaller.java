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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.QueryTransferInListResponse;
import com.aliyuncs.domain.model.v20180129.QueryTransferInListResponse.TransferInInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTransferInListResponseUnmarshaller {

	public static QueryTransferInListResponse unmarshall(QueryTransferInListResponse queryTransferInListResponse, UnmarshallerContext context) {
		
		queryTransferInListResponse.setRequestId(context.stringValue("QueryTransferInListResponse.RequestId"));
		queryTransferInListResponse.setTotalItemNum(context.integerValue("QueryTransferInListResponse.TotalItemNum"));
		queryTransferInListResponse.setCurrentPageNum(context.integerValue("QueryTransferInListResponse.CurrentPageNum"));
		queryTransferInListResponse.setTotalPageNum(context.integerValue("QueryTransferInListResponse.TotalPageNum"));
		queryTransferInListResponse.setPageSize(context.integerValue("QueryTransferInListResponse.PageSize"));
		queryTransferInListResponse.setPrePage(context.booleanValue("QueryTransferInListResponse.PrePage"));
		queryTransferInListResponse.setNextPage(context.booleanValue("QueryTransferInListResponse.NextPage"));

		List<TransferInInfo> data = new ArrayList<TransferInInfo>();
		for (int i = 0; i < context.lengthValue("QueryTransferInListResponse.Data.Length"); i++) {
			TransferInInfo transferInInfo = new TransferInInfo();
			transferInInfo.setSubmissionDate(context.stringValue("QueryTransferInListResponse.Data["+ i +"].SubmissionDate"));
			transferInInfo.setModificationDate(context.stringValue("QueryTransferInListResponse.Data["+ i +"].ModificationDate"));
			transferInInfo.setUserId(context.stringValue("QueryTransferInListResponse.Data["+ i +"].UserId"));
			transferInInfo.setInstanceId(context.stringValue("QueryTransferInListResponse.Data["+ i +"].InstanceId"));
			transferInInfo.setDomainName(context.stringValue("QueryTransferInListResponse.Data["+ i +"].DomainName"));
			transferInInfo.setStatus(context.integerValue("QueryTransferInListResponse.Data["+ i +"].Status"));
			transferInInfo.setSimpleTransferInStatus(context.stringValue("QueryTransferInListResponse.Data["+ i +"].SimpleTransferInStatus"));
			transferInInfo.setResultCode(context.stringValue("QueryTransferInListResponse.Data["+ i +"].ResultCode"));
			transferInInfo.setResultDate(context.stringValue("QueryTransferInListResponse.Data["+ i +"].ResultDate"));
			transferInInfo.setResultMsg(context.stringValue("QueryTransferInListResponse.Data["+ i +"].ResultMsg"));
			transferInInfo.setTransferAuthorizationCodeSubmissionDate(context.stringValue("QueryTransferInListResponse.Data["+ i +"].TransferAuthorizationCodeSubmissionDate"));
			transferInInfo.setNeedMailCheck(context.booleanValue("QueryTransferInListResponse.Data["+ i +"].NeedMailCheck"));
			transferInInfo.setEmail(context.stringValue("QueryTransferInListResponse.Data["+ i +"].Email"));
			transferInInfo.setWhoisMailStatus(context.booleanValue("QueryTransferInListResponse.Data["+ i +"].WhoisMailStatus"));
			transferInInfo.setExpirationDate(context.stringValue("QueryTransferInListResponse.Data["+ i +"].ExpirationDate"));
			transferInInfo.setProgressBarType(context.integerValue("QueryTransferInListResponse.Data["+ i +"].ProgressBarType"));
			transferInInfo.setSubmissionDateLong(context.longValue("QueryTransferInListResponse.Data["+ i +"].SubmissionDateLong"));
			transferInInfo.setModificationDateLong(context.longValue("QueryTransferInListResponse.Data["+ i +"].ModificationDateLong"));
			transferInInfo.setResultDateLong(context.longValue("QueryTransferInListResponse.Data["+ i +"].ResultDateLong"));
			transferInInfo.setExpirationDateLong(context.longValue("QueryTransferInListResponse.Data["+ i +"].ExpirationDateLong"));
			transferInInfo.setTransferAuthorizationCodeSubmissionDateLong(context.longValue("QueryTransferInListResponse.Data["+ i +"].TransferAuthorizationCodeSubmissionDateLong"));

			data.add(transferInInfo);
		}
		queryTransferInListResponse.setData(data);
	 
	 	return queryTransferInListResponse;
	}
}