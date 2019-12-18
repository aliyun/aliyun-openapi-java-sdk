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

	public static ListNotaryInfosResponse unmarshall(ListNotaryInfosResponse listNotaryInfosResponse, UnmarshallerContext _ctx) {
		
		listNotaryInfosResponse.setRequestId(_ctx.stringValue("ListNotaryInfosResponse.RequestId"));
		listNotaryInfosResponse.setTotalItemNum(_ctx.integerValue("ListNotaryInfosResponse.TotalItemNum"));
		listNotaryInfosResponse.setCurrentPageNum(_ctx.integerValue("ListNotaryInfosResponse.CurrentPageNum"));
		listNotaryInfosResponse.setPageSize(_ctx.integerValue("ListNotaryInfosResponse.PageSize"));
		listNotaryInfosResponse.setTotalPageNum(_ctx.integerValue("ListNotaryInfosResponse.TotalPageNum"));
		listNotaryInfosResponse.setPrePage(_ctx.booleanValue("ListNotaryInfosResponse.PrePage"));
		listNotaryInfosResponse.setNextPage(_ctx.booleanValue("ListNotaryInfosResponse.NextPage"));
		listNotaryInfosResponse.setSuccess(_ctx.booleanValue("ListNotaryInfosResponse.Success"));
		listNotaryInfosResponse.setErrorMsg(_ctx.stringValue("ListNotaryInfosResponse.ErrorMsg"));
		listNotaryInfosResponse.setErrorCode(_ctx.stringValue("ListNotaryInfosResponse.ErrorCode"));

		List<NotaryInfo> data = new ArrayList<NotaryInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListNotaryInfosResponse.Data.Length"); i++) {
			NotaryInfo notaryInfo = new NotaryInfo();
			notaryInfo.setBizOrderNo(_ctx.stringValue("ListNotaryInfosResponse.Data["+ i +"].BizOrderNo"));
			notaryInfo.setToken(_ctx.stringValue("ListNotaryInfosResponse.Data["+ i +"].Token"));
			notaryInfo.setNotaryStatus(_ctx.integerValue("ListNotaryInfosResponse.Data["+ i +"].NotaryStatus"));
			notaryInfo.setTmRegisterNo(_ctx.stringValue("ListNotaryInfosResponse.Data["+ i +"].TmRegisterNo"));
			notaryInfo.setTmClassification(_ctx.stringValue("ListNotaryInfosResponse.Data["+ i +"].TmClassification"));
			notaryInfo.setGmtModified(_ctx.longValue("ListNotaryInfosResponse.Data["+ i +"].GmtModified"));
			notaryInfo.setNotaryFailedReason(_ctx.stringValue("ListNotaryInfosResponse.Data["+ i +"].NotaryFailedReason"));

			data.add(notaryInfo);
		}
		listNotaryInfosResponse.setData(data);
	 
	 	return listNotaryInfosResponse;
	}
}