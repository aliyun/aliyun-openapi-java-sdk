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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutConfiglinkchostResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutConfiglinkchostResponse.Pager;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutConfiglinkchostResponseUnmarshaller {

	public static GetLinkeBahamutConfiglinkchostResponse unmarshall(GetLinkeBahamutConfiglinkchostResponse getLinkeBahamutConfiglinkchostResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutConfiglinkchostResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutConfiglinkchostResponse.RequestId"));
		getLinkeBahamutConfiglinkchostResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutConfiglinkchostResponse.ResultCode"));
		getLinkeBahamutConfiglinkchostResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutConfiglinkchostResponse.ResultMessage"));
		getLinkeBahamutConfiglinkchostResponse.setCode(_ctx.longValue("GetLinkeBahamutConfiglinkchostResponse.Code"));
		getLinkeBahamutConfiglinkchostResponse.setData(_ctx.stringValue("GetLinkeBahamutConfiglinkchostResponse.Data"));
		getLinkeBahamutConfiglinkchostResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutConfiglinkchostResponse.ErrorMessage"));
		getLinkeBahamutConfiglinkchostResponse.setMessage(_ctx.stringValue("GetLinkeBahamutConfiglinkchostResponse.Message"));
		getLinkeBahamutConfiglinkchostResponse.setNotSuccess(_ctx.booleanValue("GetLinkeBahamutConfiglinkchostResponse.NotSuccess"));
		getLinkeBahamutConfiglinkchostResponse.setNotValid(_ctx.booleanValue("GetLinkeBahamutConfiglinkchostResponse.NotValid"));
		getLinkeBahamutConfiglinkchostResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutConfiglinkchostResponse.ResponseStatusCode"));
		getLinkeBahamutConfiglinkchostResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutConfiglinkchostResponse.Success"));
		getLinkeBahamutConfiglinkchostResponse.setTotal(_ctx.longValue("GetLinkeBahamutConfiglinkchostResponse.Total"));
		getLinkeBahamutConfiglinkchostResponse.setValid(_ctx.booleanValue("GetLinkeBahamutConfiglinkchostResponse.Valid"));

		List<String> errorMessages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutConfiglinkchostResponse.ErrorMessages.Length"); i++) {
			errorMessages.add(_ctx.stringValue("GetLinkeBahamutConfiglinkchostResponse.ErrorMessages["+ i +"]"));
		}
		getLinkeBahamutConfiglinkchostResponse.setErrorMessages(errorMessages);

		Pager pager = new Pager();
		pager.setBegin(_ctx.longValue("GetLinkeBahamutConfiglinkchostResponse.Pager.Begin"));
		pager.setLength(_ctx.longValue("GetLinkeBahamutConfiglinkchostResponse.Pager.Length"));
		pager.setNotValid(_ctx.booleanValue("GetLinkeBahamutConfiglinkchostResponse.Pager.NotValid"));
		pager.setPage(_ctx.longValue("GetLinkeBahamutConfiglinkchostResponse.Pager.Page"));
		pager.setPageCount(_ctx.longValue("GetLinkeBahamutConfiglinkchostResponse.Pager.PageCount"));
		pager.setTotalCount(_ctx.longValue("GetLinkeBahamutConfiglinkchostResponse.Pager.TotalCount"));
		pager.setValid(_ctx.booleanValue("GetLinkeBahamutConfiglinkchostResponse.Pager.Valid"));
		getLinkeBahamutConfiglinkchostResponse.setPager(pager);
	 
	 	return getLinkeBahamutConfiglinkchostResponse;
	}
}