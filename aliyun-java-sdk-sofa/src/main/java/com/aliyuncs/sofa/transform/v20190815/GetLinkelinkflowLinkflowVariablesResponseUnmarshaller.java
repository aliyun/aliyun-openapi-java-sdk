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

import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowVariablesResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowVariablesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkelinkflowLinkflowVariablesResponseUnmarshaller {

	public static GetLinkelinkflowLinkflowVariablesResponse unmarshall(GetLinkelinkflowLinkflowVariablesResponse getLinkelinkflowLinkflowVariablesResponse, UnmarshallerContext _ctx) {
		
		getLinkelinkflowLinkflowVariablesResponse.setRequestId(_ctx.stringValue("GetLinkelinkflowLinkflowVariablesResponse.RequestId"));
		getLinkelinkflowLinkflowVariablesResponse.setResultCode(_ctx.stringValue("GetLinkelinkflowLinkflowVariablesResponse.ResultCode"));
		getLinkelinkflowLinkflowVariablesResponse.setResultMessage(_ctx.stringValue("GetLinkelinkflowLinkflowVariablesResponse.ResultMessage"));
		getLinkelinkflowLinkflowVariablesResponse.setCurrent(_ctx.longValue("GetLinkelinkflowLinkflowVariablesResponse.Current"));
		getLinkelinkflowLinkflowVariablesResponse.setErrorCode(_ctx.stringValue("GetLinkelinkflowLinkflowVariablesResponse.ErrorCode"));
		getLinkelinkflowLinkflowVariablesResponse.setErrorMsg(_ctx.stringValue("GetLinkelinkflowLinkflowVariablesResponse.ErrorMsg"));
		getLinkelinkflowLinkflowVariablesResponse.setPageSize(_ctx.longValue("GetLinkelinkflowLinkflowVariablesResponse.PageSize"));
		getLinkelinkflowLinkflowVariablesResponse.setResponseStatusCode(_ctx.longValue("GetLinkelinkflowLinkflowVariablesResponse.ResponseStatusCode"));
		getLinkelinkflowLinkflowVariablesResponse.setSuccess(_ctx.booleanValue("GetLinkelinkflowLinkflowVariablesResponse.Success"));
		getLinkelinkflowLinkflowVariablesResponse.setTotal(_ctx.longValue("GetLinkelinkflowLinkflowVariablesResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkelinkflowLinkflowVariablesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDescription(_ctx.stringValue("GetLinkelinkflowLinkflowVariablesResponse.Data["+ i +"].Description"));
			dataItem.setKey(_ctx.stringValue("GetLinkelinkflowLinkflowVariablesResponse.Data["+ i +"].Key"));
			dataItem.setName(_ctx.stringValue("GetLinkelinkflowLinkflowVariablesResponse.Data["+ i +"].Name"));
			dataItem.setValue(_ctx.stringValue("GetLinkelinkflowLinkflowVariablesResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		getLinkelinkflowLinkflowVariablesResponse.setData(data);
	 
	 	return getLinkelinkflowLinkflowVariablesResponse;
	}
}