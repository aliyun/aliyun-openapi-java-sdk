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

import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowProcessvariablesResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowProcessvariablesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkelinkflowLinkflowProcessvariablesResponseUnmarshaller {

	public static GetLinkelinkflowLinkflowProcessvariablesResponse unmarshall(GetLinkelinkflowLinkflowProcessvariablesResponse getLinkelinkflowLinkflowProcessvariablesResponse, UnmarshallerContext _ctx) {
		
		getLinkelinkflowLinkflowProcessvariablesResponse.setRequestId(_ctx.stringValue("GetLinkelinkflowLinkflowProcessvariablesResponse.RequestId"));
		getLinkelinkflowLinkflowProcessvariablesResponse.setResultCode(_ctx.stringValue("GetLinkelinkflowLinkflowProcessvariablesResponse.ResultCode"));
		getLinkelinkflowLinkflowProcessvariablesResponse.setResultMessage(_ctx.stringValue("GetLinkelinkflowLinkflowProcessvariablesResponse.ResultMessage"));
		getLinkelinkflowLinkflowProcessvariablesResponse.setCurrent(_ctx.longValue("GetLinkelinkflowLinkflowProcessvariablesResponse.Current"));
		getLinkelinkflowLinkflowProcessvariablesResponse.setErrorCode(_ctx.stringValue("GetLinkelinkflowLinkflowProcessvariablesResponse.ErrorCode"));
		getLinkelinkflowLinkflowProcessvariablesResponse.setErrorMsg(_ctx.stringValue("GetLinkelinkflowLinkflowProcessvariablesResponse.ErrorMsg"));
		getLinkelinkflowLinkflowProcessvariablesResponse.setPageSize(_ctx.longValue("GetLinkelinkflowLinkflowProcessvariablesResponse.PageSize"));
		getLinkelinkflowLinkflowProcessvariablesResponse.setResponseStatusCode(_ctx.longValue("GetLinkelinkflowLinkflowProcessvariablesResponse.ResponseStatusCode"));
		getLinkelinkflowLinkflowProcessvariablesResponse.setSuccess(_ctx.booleanValue("GetLinkelinkflowLinkflowProcessvariablesResponse.Success"));
		getLinkelinkflowLinkflowProcessvariablesResponse.setTotal(_ctx.longValue("GetLinkelinkflowLinkflowProcessvariablesResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkelinkflowLinkflowProcessvariablesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDescription(_ctx.stringValue("GetLinkelinkflowLinkflowProcessvariablesResponse.Data["+ i +"].Description"));
			dataItem.setKey(_ctx.stringValue("GetLinkelinkflowLinkflowProcessvariablesResponse.Data["+ i +"].Key"));
			dataItem.setName(_ctx.stringValue("GetLinkelinkflowLinkflowProcessvariablesResponse.Data["+ i +"].Name"));
			dataItem.setValue(_ctx.stringValue("GetLinkelinkflowLinkflowProcessvariablesResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		getLinkelinkflowLinkflowProcessvariablesResponse.setData(data);
	 
	 	return getLinkelinkflowLinkflowProcessvariablesResponse;
	}
}