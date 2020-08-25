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

import com.aliyuncs.sofa.model.v20190815.ListLinkelinkflowLinkflowProcessdefinitionResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkelinkflowLinkflowProcessdefinitionResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkelinkflowLinkflowProcessdefinitionResponseUnmarshaller {

	public static ListLinkelinkflowLinkflowProcessdefinitionResponse unmarshall(ListLinkelinkflowLinkflowProcessdefinitionResponse listLinkelinkflowLinkflowProcessdefinitionResponse, UnmarshallerContext _ctx) {
		
		listLinkelinkflowLinkflowProcessdefinitionResponse.setRequestId(_ctx.stringValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.RequestId"));
		listLinkelinkflowLinkflowProcessdefinitionResponse.setResultCode(_ctx.stringValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.ResultCode"));
		listLinkelinkflowLinkflowProcessdefinitionResponse.setResultMessage(_ctx.stringValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.ResultMessage"));
		listLinkelinkflowLinkflowProcessdefinitionResponse.setCurrent(_ctx.longValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.Current"));
		listLinkelinkflowLinkflowProcessdefinitionResponse.setErrorCode(_ctx.stringValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.ErrorCode"));
		listLinkelinkflowLinkflowProcessdefinitionResponse.setErrorMsg(_ctx.stringValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.ErrorMsg"));
		listLinkelinkflowLinkflowProcessdefinitionResponse.setPageSize(_ctx.longValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.PageSize"));
		listLinkelinkflowLinkflowProcessdefinitionResponse.setResponseStatusCode(_ctx.longValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.ResponseStatusCode"));
		listLinkelinkflowLinkflowProcessdefinitionResponse.setSuccess(_ctx.booleanValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.Success"));
		listLinkelinkflowLinkflowProcessdefinitionResponse.setTotal(_ctx.longValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDescription(_ctx.stringValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.Data["+ i +"].Description"));
			dataItem.setId(_ctx.stringValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.Data["+ i +"].Id"));
			dataItem.setKey(_ctx.stringValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.Data["+ i +"].Key"));
			dataItem.setName(_ctx.stringValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.Data["+ i +"].Name"));
			dataItem.setStartFormKey(_ctx.booleanValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.Data["+ i +"].StartFormKey"));
			dataItem.setTenantId(_ctx.stringValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.Data["+ i +"].TenantId"));
			dataItem.setVersion(_ctx.longValue("ListLinkelinkflowLinkflowProcessdefinitionResponse.Data["+ i +"].Version"));

			data.add(dataItem);
		}
		listLinkelinkflowLinkflowProcessdefinitionResponse.setData(data);
	 
	 	return listLinkelinkflowLinkflowProcessdefinitionResponse;
	}
}