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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.ListNotaryInfosResponse;
import com.aliyuncs.trademark.model.v20180724.ListNotaryInfosResponse.NotaryInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNotaryInfosResponseUnmarshaller {

	public static ListNotaryInfosResponse unmarshall(ListNotaryInfosResponse listNotaryInfosResponse, UnmarshallerContext context) {
		
		listNotaryInfosResponse.setRequestId(context.stringValue("ListNotaryInfosResponse.RequestId"));
		listNotaryInfosResponse.setTotalItemNum(context.integerValue("ListNotaryInfosResponse.TotalItemNum"));
		listNotaryInfosResponse.setCurrentPageNum(context.integerValue("ListNotaryInfosResponse.CurrentPageNum"));
		listNotaryInfosResponse.setPageSize(context.integerValue("ListNotaryInfosResponse.PageSize"));
		listNotaryInfosResponse.setTotalPageNum(context.integerValue("ListNotaryInfosResponse.TotalPageNum"));
		listNotaryInfosResponse.setPrePage(context.booleanValue("ListNotaryInfosResponse.PrePage"));
		listNotaryInfosResponse.setNextPage(context.booleanValue("ListNotaryInfosResponse.NextPage"));
		listNotaryInfosResponse.setSuccess(context.booleanValue("ListNotaryInfosResponse.Success"));
		listNotaryInfosResponse.setErrorMsg(context.stringValue("ListNotaryInfosResponse.ErrorMsg"));
		listNotaryInfosResponse.setErrorCode(context.stringValue("ListNotaryInfosResponse.ErrorCode"));

		List<NotaryInfo> data = new ArrayList<NotaryInfo>();
		for (int i = 0; i < context.lengthValue("ListNotaryInfosResponse.Data.Length"); i++) {
			NotaryInfo notaryInfo = new NotaryInfo();
			notaryInfo.setBizOrderNo(context.stringValue("ListNotaryInfosResponse.Data["+ i +"].BizOrderNo"));
			notaryInfo.setToken(context.stringValue("ListNotaryInfosResponse.Data["+ i +"].Token"));
			notaryInfo.setNotaryStatus(context.integerValue("ListNotaryInfosResponse.Data["+ i +"].NotaryStatus"));
			notaryInfo.setTmRegisterNo(context.stringValue("ListNotaryInfosResponse.Data["+ i +"].TmRegisterNo"));
			notaryInfo.setTmClassification(context.stringValue("ListNotaryInfosResponse.Data["+ i +"].TmClassification"));
			notaryInfo.setGmtModified(context.longValue("ListNotaryInfosResponse.Data["+ i +"].GmtModified"));
			notaryInfo.setNotaryFailedReason(context.stringValue("ListNotaryInfosResponse.Data["+ i +"].NotaryFailedReason"));

			data.add(notaryInfo);
		}
		listNotaryInfosResponse.setData(data);
	 
	 	return listNotaryInfosResponse;
	}
}