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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktRelatableworkitemsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktRelatableworkitemsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinktRelatableworkitemsResponseUnmarshaller {

	public static GetLinkeLinktRelatableworkitemsResponse unmarshall(GetLinkeLinktRelatableworkitemsResponse getLinkeLinktRelatableworkitemsResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinktRelatableworkitemsResponse.setRequestId(_ctx.stringValue("GetLinkeLinktRelatableworkitemsResponse.RequestId"));
		getLinkeLinktRelatableworkitemsResponse.setResultCode(_ctx.stringValue("GetLinkeLinktRelatableworkitemsResponse.ResultCode"));
		getLinkeLinktRelatableworkitemsResponse.setResultMessage(_ctx.stringValue("GetLinkeLinktRelatableworkitemsResponse.ResultMessage"));
		getLinkeLinktRelatableworkitemsResponse.setErrorCode(_ctx.longValue("GetLinkeLinktRelatableworkitemsResponse.ErrorCode"));
		getLinkeLinktRelatableworkitemsResponse.setErrorMessage(_ctx.stringValue("GetLinkeLinktRelatableworkitemsResponse.ErrorMessage"));
		getLinkeLinktRelatableworkitemsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinktRelatableworkitemsResponse.ResponseStatusCode"));
		getLinkeLinktRelatableworkitemsResponse.setSuccess(_ctx.booleanValue("GetLinkeLinktRelatableworkitemsResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("GetLinkeLinktRelatableworkitemsResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("GetLinkeLinktRelatableworkitemsResponse.Data.PageSize"));
		data.setPageTotal(_ctx.longValue("GetLinkeLinktRelatableworkitemsResponse.Data.PageTotal"));
		data.setTotal(_ctx.longValue("GetLinkeLinktRelatableworkitemsResponse.Data.Total"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinktRelatableworkitemsResponse.Data.Items.Length"); i++) {
			items.add(_ctx.stringValue("GetLinkeLinktRelatableworkitemsResponse.Data.Items["+ i +"]"));
		}
		data.setItems(items);
		getLinkeLinktRelatableworkitemsResponse.setData(data);
	 
	 	return getLinkeLinktRelatableworkitemsResponse;
	}
}