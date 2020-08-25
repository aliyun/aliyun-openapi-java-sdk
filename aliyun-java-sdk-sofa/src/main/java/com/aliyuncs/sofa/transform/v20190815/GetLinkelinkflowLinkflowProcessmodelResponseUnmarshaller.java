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

import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowProcessmodelResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowProcessmodelResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkelinkflowLinkflowProcessmodelResponseUnmarshaller {

	public static GetLinkelinkflowLinkflowProcessmodelResponse unmarshall(GetLinkelinkflowLinkflowProcessmodelResponse getLinkelinkflowLinkflowProcessmodelResponse, UnmarshallerContext _ctx) {
		
		getLinkelinkflowLinkflowProcessmodelResponse.setRequestId(_ctx.stringValue("GetLinkelinkflowLinkflowProcessmodelResponse.RequestId"));
		getLinkelinkflowLinkflowProcessmodelResponse.setResultCode(_ctx.stringValue("GetLinkelinkflowLinkflowProcessmodelResponse.ResultCode"));
		getLinkelinkflowLinkflowProcessmodelResponse.setResultMessage(_ctx.stringValue("GetLinkelinkflowLinkflowProcessmodelResponse.ResultMessage"));
		getLinkelinkflowLinkflowProcessmodelResponse.setCurrent(_ctx.longValue("GetLinkelinkflowLinkflowProcessmodelResponse.Current"));
		getLinkelinkflowLinkflowProcessmodelResponse.setErrorCode(_ctx.stringValue("GetLinkelinkflowLinkflowProcessmodelResponse.ErrorCode"));
		getLinkelinkflowLinkflowProcessmodelResponse.setErrorMsg(_ctx.stringValue("GetLinkelinkflowLinkflowProcessmodelResponse.ErrorMsg"));
		getLinkelinkflowLinkflowProcessmodelResponse.setPageSize(_ctx.longValue("GetLinkelinkflowLinkflowProcessmodelResponse.PageSize"));
		getLinkelinkflowLinkflowProcessmodelResponse.setResponseStatusCode(_ctx.longValue("GetLinkelinkflowLinkflowProcessmodelResponse.ResponseStatusCode"));
		getLinkelinkflowLinkflowProcessmodelResponse.setSuccess(_ctx.booleanValue("GetLinkelinkflowLinkflowProcessmodelResponse.Success"));
		getLinkelinkflowLinkflowProcessmodelResponse.setTotal(_ctx.longValue("GetLinkelinkflowLinkflowProcessmodelResponse.Total"));

		Data data = new Data();
		data.setCurrentElementKey(_ctx.stringValue("GetLinkelinkflowLinkflowProcessmodelResponse.Data.CurrentElementKey"));
		data.setStatus(_ctx.stringValue("GetLinkelinkflowLinkflowProcessmodelResponse.Data.Status"));

		List<String> elements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkelinkflowLinkflowProcessmodelResponse.Data.Elements.Length"); i++) {
			elements.add(_ctx.stringValue("GetLinkelinkflowLinkflowProcessmodelResponse.Data.Elements["+ i +"]"));
		}
		data.setElements(elements);
		getLinkelinkflowLinkflowProcessmodelResponse.setData(data);
	 
	 	return getLinkelinkflowLinkflowProcessmodelResponse;
	}
}