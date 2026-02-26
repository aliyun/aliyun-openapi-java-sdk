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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.GetMailTaskListResponse;
import com.aliyuncs.quickbi_public.model.v20220101.GetMailTaskListResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.GetMailTaskListResponse.Result.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMailTaskListResponseUnmarshaller {

	public static GetMailTaskListResponse unmarshall(GetMailTaskListResponse getMailTaskListResponse, UnmarshallerContext _ctx) {
		
		getMailTaskListResponse.setRequestId(_ctx.stringValue("GetMailTaskListResponse.RequestId"));
		getMailTaskListResponse.setSuccess(_ctx.booleanValue("GetMailTaskListResponse.Success"));

		Result result = new Result();
		result.setPageNum(_ctx.integerValue("GetMailTaskListResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("GetMailTaskListResponse.Result.PageSize"));
		result.setTotalNum(_ctx.integerValue("GetMailTaskListResponse.Result.TotalNum"));
		result.setTotalPages(_ctx.integerValue("GetMailTaskListResponse.Result.TotalPages"));
		result.setPre(_ctx.integerValue("GetMailTaskListResponse.Result.Pre"));
		result.setNext(_ctx.integerValue("GetMailTaskListResponse.Result.Next"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMailTaskListResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setMailId(_ctx.stringValue("GetMailTaskListResponse.Result.Data["+ i +"].MailId"));
			dataItem.setPaused(_ctx.booleanValue("GetMailTaskListResponse.Result.Data["+ i +"].Paused"));
			dataItem.setBizOwnerUserId(_ctx.stringValue("GetMailTaskListResponse.Result.Data["+ i +"].BizOwnerUserId"));
			dataItem.setBizOwnerName(_ctx.stringValue("GetMailTaskListResponse.Result.Data["+ i +"].BizOwnerName"));
			dataItem.setSubscribeName(_ctx.stringValue("GetMailTaskListResponse.Result.Data["+ i +"].SubscribeName"));

			data.add(dataItem);
		}
		result.setData(data);
		getMailTaskListResponse.setResult(result);
	 
	 	return getMailTaskListResponse;
	}
}