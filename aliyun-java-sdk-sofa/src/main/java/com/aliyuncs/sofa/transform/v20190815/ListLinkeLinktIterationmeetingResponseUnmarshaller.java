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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktIterationmeetingResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktIterationmeetingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinktIterationmeetingResponseUnmarshaller {

	public static ListLinkeLinktIterationmeetingResponse unmarshall(ListLinkeLinktIterationmeetingResponse listLinkeLinktIterationmeetingResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinktIterationmeetingResponse.setRequestId(_ctx.stringValue("ListLinkeLinktIterationmeetingResponse.RequestId"));
		listLinkeLinktIterationmeetingResponse.setResultCode(_ctx.stringValue("ListLinkeLinktIterationmeetingResponse.ResultCode"));
		listLinkeLinktIterationmeetingResponse.setResultMessage(_ctx.stringValue("ListLinkeLinktIterationmeetingResponse.ResultMessage"));
		listLinkeLinktIterationmeetingResponse.setErrorCode(_ctx.longValue("ListLinkeLinktIterationmeetingResponse.ErrorCode"));
		listLinkeLinktIterationmeetingResponse.setErrorMessage(_ctx.stringValue("ListLinkeLinktIterationmeetingResponse.ErrorMessage"));
		listLinkeLinktIterationmeetingResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinktIterationmeetingResponse.ResponseStatusCode"));
		listLinkeLinktIterationmeetingResponse.setSuccess(_ctx.booleanValue("ListLinkeLinktIterationmeetingResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("ListLinkeLinktIterationmeetingResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("ListLinkeLinktIterationmeetingResponse.Data.PageSize"));
		data.setPageTotal(_ctx.longValue("ListLinkeLinktIterationmeetingResponse.Data.PageTotal"));
		data.setTotal(_ctx.longValue("ListLinkeLinktIterationmeetingResponse.Data.Total"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinktIterationmeetingResponse.Data.Items.Length"); i++) {
			items.add(_ctx.stringValue("ListLinkeLinktIterationmeetingResponse.Data.Items["+ i +"]"));
		}
		data.setItems(items);
		listLinkeLinktIterationmeetingResponse.setData(data);
	 
	 	return listLinkeLinktIterationmeetingResponse;
	}
}