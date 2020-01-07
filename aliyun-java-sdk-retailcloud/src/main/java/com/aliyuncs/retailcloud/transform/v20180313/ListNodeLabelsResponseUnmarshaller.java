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

import com.aliyuncs.retailcloud.model.v20180313.ListNodeLabelsResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListNodeLabelsResponse.ListNodeLabelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeLabelsResponseUnmarshaller {

	public static ListNodeLabelsResponse unmarshall(ListNodeLabelsResponse listNodeLabelsResponse, UnmarshallerContext _ctx) {
		
		listNodeLabelsResponse.setRequestId(_ctx.stringValue("ListNodeLabelsResponse.RequestId"));
		listNodeLabelsResponse.setCode(_ctx.integerValue("ListNodeLabelsResponse.Code"));
		listNodeLabelsResponse.setErrorMsg(_ctx.stringValue("ListNodeLabelsResponse.ErrorMsg"));
		listNodeLabelsResponse.setPageNumber(_ctx.integerValue("ListNodeLabelsResponse.PageNumber"));
		listNodeLabelsResponse.setPageSize(_ctx.integerValue("ListNodeLabelsResponse.PageSize"));
		listNodeLabelsResponse.setTotalCount(_ctx.longValue("ListNodeLabelsResponse.TotalCount"));

		List<ListNodeLabelResponse> data = new ArrayList<ListNodeLabelResponse>();
		for (int i = 0; i < _ctx.lengthValue("ListNodeLabelsResponse.Data.Length"); i++) {
			ListNodeLabelResponse listNodeLabelResponse = new ListNodeLabelResponse();
			listNodeLabelResponse.setClusterId(_ctx.stringValue("ListNodeLabelsResponse.Data["+ i +"].ClusterId"));
			listNodeLabelResponse.setId(_ctx.longValue("ListNodeLabelsResponse.Data["+ i +"].Id"));
			listNodeLabelResponse.setLabelKey(_ctx.stringValue("ListNodeLabelsResponse.Data["+ i +"].LabelKey"));
			listNodeLabelResponse.setLabelValue(_ctx.stringValue("ListNodeLabelsResponse.Data["+ i +"].LabelValue"));

			data.add(listNodeLabelResponse);
		}
		listNodeLabelsResponse.setData(data);
	 
	 	return listNodeLabelsResponse;
	}
}