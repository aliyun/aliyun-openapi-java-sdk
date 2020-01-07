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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListNodeLabelBindingsResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListNodeLabelBindingsResponse.ListNodeLabelBindingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeLabelBindingsResponseUnmarshaller {

	public static ListNodeLabelBindingsResponse unmarshall(ListNodeLabelBindingsResponse listNodeLabelBindingsResponse, UnmarshallerContext _ctx) {
		
		listNodeLabelBindingsResponse.setRequestId(_ctx.stringValue("ListNodeLabelBindingsResponse.RequestId"));
		listNodeLabelBindingsResponse.setCode(_ctx.integerValue("ListNodeLabelBindingsResponse.Code"));
		listNodeLabelBindingsResponse.setErrorMsg(_ctx.stringValue("ListNodeLabelBindingsResponse.ErrorMsg"));
		listNodeLabelBindingsResponse.setPageNumber(_ctx.integerValue("ListNodeLabelBindingsResponse.PageNumber"));
		listNodeLabelBindingsResponse.setPageSize(_ctx.integerValue("ListNodeLabelBindingsResponse.PageSize"));
		listNodeLabelBindingsResponse.setTotalCount(_ctx.longValue("ListNodeLabelBindingsResponse.TotalCount"));

		List<ListNodeLabelBindingResponse> data = new ArrayList<ListNodeLabelBindingResponse>();
		for (int i = 0; i < _ctx.lengthValue("ListNodeLabelBindingsResponse.Data.Length"); i++) {
			ListNodeLabelBindingResponse listNodeLabelBindingResponse = new ListNodeLabelBindingResponse();
			listNodeLabelBindingResponse.setId(_ctx.longValue("ListNodeLabelBindingsResponse.Data["+ i +"].Id"));
			listNodeLabelBindingResponse.setInstanceId(_ctx.stringValue("ListNodeLabelBindingsResponse.Data["+ i +"].InstanceId"));
			listNodeLabelBindingResponse.setInstanceType(_ctx.stringValue("ListNodeLabelBindingsResponse.Data["+ i +"].InstanceType"));
			listNodeLabelBindingResponse.setLabelKey(_ctx.stringValue("ListNodeLabelBindingsResponse.Data["+ i +"].LabelKey"));
			listNodeLabelBindingResponse.setLabelValue(_ctx.stringValue("ListNodeLabelBindingsResponse.Data["+ i +"].LabelValue"));

			data.add(listNodeLabelBindingResponse);
		}
		listNodeLabelBindingsResponse.setData(data);
	 
	 	return listNodeLabelBindingsResponse;
	}
}