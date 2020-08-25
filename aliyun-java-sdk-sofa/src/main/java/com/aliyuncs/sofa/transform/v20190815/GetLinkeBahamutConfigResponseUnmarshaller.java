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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutConfigResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutConfigResponse.Pager;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutConfigResponseUnmarshaller {

	public static GetLinkeBahamutConfigResponse unmarshall(GetLinkeBahamutConfigResponse getLinkeBahamutConfigResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutConfigResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutConfigResponse.RequestId"));
		getLinkeBahamutConfigResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutConfigResponse.ResultCode"));
		getLinkeBahamutConfigResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutConfigResponse.ResultMessage"));
		getLinkeBahamutConfigResponse.setCode(_ctx.longValue("GetLinkeBahamutConfigResponse.Code"));
		getLinkeBahamutConfigResponse.setData(_ctx.stringValue("GetLinkeBahamutConfigResponse.Data"));
		getLinkeBahamutConfigResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutConfigResponse.ErrorMessage"));
		getLinkeBahamutConfigResponse.setMessage(_ctx.stringValue("GetLinkeBahamutConfigResponse.Message"));
		getLinkeBahamutConfigResponse.setNotSuccess(_ctx.booleanValue("GetLinkeBahamutConfigResponse.NotSuccess"));
		getLinkeBahamutConfigResponse.setNotValid(_ctx.booleanValue("GetLinkeBahamutConfigResponse.NotValid"));
		getLinkeBahamutConfigResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutConfigResponse.ResponseStatusCode"));
		getLinkeBahamutConfigResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutConfigResponse.Success"));
		getLinkeBahamutConfigResponse.setTotal(_ctx.longValue("GetLinkeBahamutConfigResponse.Total"));
		getLinkeBahamutConfigResponse.setValid(_ctx.booleanValue("GetLinkeBahamutConfigResponse.Valid"));

		List<String> errorMessages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutConfigResponse.ErrorMessages.Length"); i++) {
			errorMessages.add(_ctx.stringValue("GetLinkeBahamutConfigResponse.ErrorMessages["+ i +"]"));
		}
		getLinkeBahamutConfigResponse.setErrorMessages(errorMessages);

		Pager pager = new Pager();
		pager.setBegin(_ctx.longValue("GetLinkeBahamutConfigResponse.Pager.Begin"));
		pager.setLength(_ctx.longValue("GetLinkeBahamutConfigResponse.Pager.Length"));
		pager.setNotValid(_ctx.booleanValue("GetLinkeBahamutConfigResponse.Pager.NotValid"));
		pager.setPage(_ctx.longValue("GetLinkeBahamutConfigResponse.Pager.Page"));
		pager.setPageCount(_ctx.longValue("GetLinkeBahamutConfigResponse.Pager.PageCount"));
		pager.setTotalCount(_ctx.longValue("GetLinkeBahamutConfigResponse.Pager.TotalCount"));
		pager.setValid(_ctx.booleanValue("GetLinkeBahamutConfigResponse.Pager.Valid"));
		getLinkeBahamutConfigResponse.setPager(pager);
	 
	 	return getLinkeBahamutConfigResponse;
	}
}