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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAuthurlResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAuthurlResponse.Pager;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAuthurlResponseUnmarshaller {

	public static GetLinkeBahamutAuthurlResponse unmarshall(GetLinkeBahamutAuthurlResponse getLinkeBahamutAuthurlResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAuthurlResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAuthurlResponse.RequestId"));
		getLinkeBahamutAuthurlResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAuthurlResponse.ResultCode"));
		getLinkeBahamutAuthurlResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAuthurlResponse.ResultMessage"));
		getLinkeBahamutAuthurlResponse.setCode(_ctx.longValue("GetLinkeBahamutAuthurlResponse.Code"));
		getLinkeBahamutAuthurlResponse.setData(_ctx.stringValue("GetLinkeBahamutAuthurlResponse.Data"));
		getLinkeBahamutAuthurlResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAuthurlResponse.ErrorMessage"));
		getLinkeBahamutAuthurlResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAuthurlResponse.Message"));
		getLinkeBahamutAuthurlResponse.setNotSuccess(_ctx.booleanValue("GetLinkeBahamutAuthurlResponse.NotSuccess"));
		getLinkeBahamutAuthurlResponse.setNotValid(_ctx.booleanValue("GetLinkeBahamutAuthurlResponse.NotValid"));
		getLinkeBahamutAuthurlResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAuthurlResponse.ResponseStatusCode"));
		getLinkeBahamutAuthurlResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAuthurlResponse.Success"));
		getLinkeBahamutAuthurlResponse.setTotal(_ctx.longValue("GetLinkeBahamutAuthurlResponse.Total"));
		getLinkeBahamutAuthurlResponse.setValid(_ctx.booleanValue("GetLinkeBahamutAuthurlResponse.Valid"));

		List<String> errorMessages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAuthurlResponse.ErrorMessages.Length"); i++) {
			errorMessages.add(_ctx.stringValue("GetLinkeBahamutAuthurlResponse.ErrorMessages["+ i +"]"));
		}
		getLinkeBahamutAuthurlResponse.setErrorMessages(errorMessages);

		Pager pager = new Pager();
		pager.setBegin(_ctx.longValue("GetLinkeBahamutAuthurlResponse.Pager.Begin"));
		pager.setLength(_ctx.longValue("GetLinkeBahamutAuthurlResponse.Pager.Length"));
		pager.setNotValid(_ctx.booleanValue("GetLinkeBahamutAuthurlResponse.Pager.NotValid"));
		pager.setPage(_ctx.longValue("GetLinkeBahamutAuthurlResponse.Pager.Page"));
		pager.setPageCount(_ctx.longValue("GetLinkeBahamutAuthurlResponse.Pager.PageCount"));
		pager.setTotalCount(_ctx.longValue("GetLinkeBahamutAuthurlResponse.Pager.TotalCount"));
		pager.setValid(_ctx.booleanValue("GetLinkeBahamutAuthurlResponse.Pager.Valid"));
		getLinkeBahamutAuthurlResponse.setPager(pager);
	 
	 	return getLinkeBahamutAuthurlResponse;
	}
}