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
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTransferInListResponseUnmarshaller {

	public static QueryTransferInListResponse unmarshall(QueryTransferInListResponse queryTransferInListResponse, UnmarshallerContext _ctx) {
		
		queryTransferInListResponse.setRequestId(_ctx.stringValue("QueryTransferInListResponse.RequestId"));
		queryTransferInListResponse.setTotalItemNum(_ctx.integerValue("QueryTransferInListResponse.TotalItemNum"));
		queryTransferInListResponse.setCurrentPageNum(_ctx.integerValue("QueryTransferInListResponse.CurrentPageNum"));
		queryTransferInListResponse.setTotalPageNum(_ctx.integerValue("QueryTransferInListResponse.TotalPageNum"));
		queryTransferInListResponse.setPageSize(_ctx.integerValue("QueryTransferInListResponse.PageSize"));
		queryTransferInListResponse.setPrePage(_ctx.booleanValue("QueryTransferInListResponse.PrePage"));
		queryTransferInListResponse.setNextPage(_ctx.booleanValue("QueryTransferInListResponse.NextPage"));

		List<TransferInInfo> data = new ArrayList<TransferInInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryTransferInListResponse.Data.Length"); i++) {
			TransferInInfo transferInInfo = new TransferInInfo();
			transferInInfo.setSubmissionDate(_ctx.stringValue("QueryTransferInListResponse.Data["+ i +"].SubmissionDate"));
			transferInInfo.setModificationDate(_ctx.stringValue("QueryTransferInListResponse.Data["+ i +"].ModificationDate"));
			transferInInfo.setUserId(_ctx.stringValue("QueryTransferInListResponse.Data["+ i +"].UserId"));
			transferInInfo.setInstanceId(_ctx.stringValue("QueryTransferInListResponse.Data["+ i +"].InstanceId"));
			transferInInfo.setDomainName(_ctx.stringValue("QueryTransferInListResponse.Data["+ i +"].DomainName"));
			transferInInfo.setStatus(_ctx.integerValue("QueryTransferInListResponse.Data["+ i +"].Status"));
			transferInInfo.setSimpleTransferInStatus(_ctx.stringValue("QueryTransferInListResponse.Data["+ i +"].SimpleTransferInStatus"));
			transferInInfo.setResultCode(_ctx.stringValue("QueryTransferInListResponse.Data["+ i +"].ResultCode"));
			transferInInfo.setResultDate(_ctx.stringValue("QueryTransferInListResponse.Data["+ i +"].ResultDate"));
			transferInInfo.setResultMsg(_ctx.stringValue("QueryTransferInListResponse.Data["+ i +"].ResultMsg"));
			transferInInfo.setTransferAuthorizationCodeSubmissionDate(_ctx.stringValue("QueryTransferInListResponse.Data["+ i +"].TransferAuthorizationCodeSubmissionDate"));
			transferInInfo.setNeedMailCheck(_ctx.booleanValue("QueryTransferInListResponse.Data["+ i +"].NeedMailCheck"));
			transferInInfo.setEmail(_ctx.stringValue("QueryTransferInListResponse.Data["+ i +"].Email"));
			transferInInfo.setWhoisMailStatus(_ctx.booleanValue("QueryTransferInListResponse.Data["+ i +"].WhoisMailStatus"));
			transferInInfo.setExpirationDate(_ctx.stringValue("QueryTransferInListResponse.Data["+ i +"].ExpirationDate"));
			transferInInfo.setProgressBarType(_ctx.integerValue("QueryTransferInListResponse.Data["+ i +"].ProgressBarType"));
			transferInInfo.setSubmissionDateLong(_ctx.longValue("QueryTransferInListResponse.Data["+ i +"].SubmissionDateLong"));
			transferInInfo.setModificationDateLong(_ctx.longValue("QueryTransferInListResponse.Data["+ i +"].ModificationDateLong"));
			transferInInfo.setResultDateLong(_ctx.longValue("QueryTransferInListResponse.Data["+ i +"].ResultDateLong"));
			transferInInfo.setExpirationDateLong(_ctx.longValue("QueryTransferInListResponse.Data["+ i +"].ExpirationDateLong"));
			transferInInfo.setTransferAuthorizationCodeSubmissionDateLong(_ctx.longValue("QueryTransferInListResponse.Data["+ i +"].TransferAuthorizationCodeSubmissionDateLong"));

			data.add(transferInInfo);
		}
		queryTransferInListResponse.setData(data);
	 
	 	return queryTransferInListResponse;
	}
}