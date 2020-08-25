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

import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowAppnamelistResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkelinkflowLinkflowAppnamelistResponseUnmarshaller {

	public static GetLinkelinkflowLinkflowAppnamelistResponse unmarshall(GetLinkelinkflowLinkflowAppnamelistResponse getLinkelinkflowLinkflowAppnamelistResponse, UnmarshallerContext _ctx) {
		
		getLinkelinkflowLinkflowAppnamelistResponse.setRequestId(_ctx.stringValue("GetLinkelinkflowLinkflowAppnamelistResponse.RequestId"));
		getLinkelinkflowLinkflowAppnamelistResponse.setResultCode(_ctx.stringValue("GetLinkelinkflowLinkflowAppnamelistResponse.ResultCode"));
		getLinkelinkflowLinkflowAppnamelistResponse.setResultMessage(_ctx.stringValue("GetLinkelinkflowLinkflowAppnamelistResponse.ResultMessage"));
		getLinkelinkflowLinkflowAppnamelistResponse.setCurrent(_ctx.longValue("GetLinkelinkflowLinkflowAppnamelistResponse.Current"));
		getLinkelinkflowLinkflowAppnamelistResponse.setErrorCode(_ctx.stringValue("GetLinkelinkflowLinkflowAppnamelistResponse.ErrorCode"));
		getLinkelinkflowLinkflowAppnamelistResponse.setErrorMsg(_ctx.stringValue("GetLinkelinkflowLinkflowAppnamelistResponse.ErrorMsg"));
		getLinkelinkflowLinkflowAppnamelistResponse.setPageSize(_ctx.longValue("GetLinkelinkflowLinkflowAppnamelistResponse.PageSize"));
		getLinkelinkflowLinkflowAppnamelistResponse.setResponseStatusCode(_ctx.longValue("GetLinkelinkflowLinkflowAppnamelistResponse.ResponseStatusCode"));
		getLinkelinkflowLinkflowAppnamelistResponse.setSuccess(_ctx.booleanValue("GetLinkelinkflowLinkflowAppnamelistResponse.Success"));
		getLinkelinkflowLinkflowAppnamelistResponse.setTotal(_ctx.longValue("GetLinkelinkflowLinkflowAppnamelistResponse.Total"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkelinkflowLinkflowAppnamelistResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetLinkelinkflowLinkflowAppnamelistResponse.Data["+ i +"]"));
		}
		getLinkelinkflowLinkflowAppnamelistResponse.setData(data);
	 
	 	return getLinkelinkflowLinkflowAppnamelistResponse;
	}
}