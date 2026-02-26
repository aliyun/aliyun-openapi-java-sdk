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

package com.aliyuncs.lto.transform.v20210707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lto.model.v20210707.ListBizChainResponse;
import com.aliyuncs.lto.model.v20210707.ListBizChainResponse.Data;
import com.aliyuncs.lto.model.v20210707.ListBizChainResponse.Data.BizChainInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBizChainResponseUnmarshaller {

	public static ListBizChainResponse unmarshall(ListBizChainResponse listBizChainResponse, UnmarshallerContext _ctx) {
		
		listBizChainResponse.setRequestId(_ctx.stringValue("ListBizChainResponse.RequestId"));
		listBizChainResponse.setCode(_ctx.stringValue("ListBizChainResponse.Code"));
		listBizChainResponse.setHttpStatusCode(_ctx.integerValue("ListBizChainResponse.HttpStatusCode"));
		listBizChainResponse.setMessage(_ctx.stringValue("ListBizChainResponse.Message"));
		listBizChainResponse.setSuccess(_ctx.booleanValue("ListBizChainResponse.Success"));

		Data data = new Data();
		data.setNum(_ctx.integerValue("ListBizChainResponse.Data.Num"));
		data.setTotal(_ctx.integerValue("ListBizChainResponse.Data.Total"));
		data.setSize(_ctx.integerValue("ListBizChainResponse.Data.Size"));

		List<BizChainInfo> pageData = new ArrayList<BizChainInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListBizChainResponse.Data.PageData.Length"); i++) {
			BizChainInfo bizChainInfo = new BizChainInfo();
			bizChainInfo.setType(_ctx.stringValue("ListBizChainResponse.Data.PageData["+ i +"].Type"));
			bizChainInfo.setRemark(_ctx.stringValue("ListBizChainResponse.Data.PageData["+ i +"].Remark"));
			bizChainInfo.setName(_ctx.stringValue("ListBizChainResponse.Data.PageData["+ i +"].Name"));
			bizChainInfo.setBizChainId(_ctx.stringValue("ListBizChainResponse.Data.PageData["+ i +"].BizChainId"));

			pageData.add(bizChainInfo);
		}
		data.setPageData(pageData);
		listBizChainResponse.setData(data);
	 
	 	return listBizChainResponse;
	}
}