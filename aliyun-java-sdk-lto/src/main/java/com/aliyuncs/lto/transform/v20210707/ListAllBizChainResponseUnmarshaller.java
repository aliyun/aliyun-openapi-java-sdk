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

import com.aliyuncs.lto.model.v20210707.ListAllBizChainResponse;
import com.aliyuncs.lto.model.v20210707.ListAllBizChainResponse.BizChainInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllBizChainResponseUnmarshaller {

	public static ListAllBizChainResponse unmarshall(ListAllBizChainResponse listAllBizChainResponse, UnmarshallerContext _ctx) {
		
		listAllBizChainResponse.setRequestId(_ctx.stringValue("ListAllBizChainResponse.RequestId"));
		listAllBizChainResponse.setCode(_ctx.stringValue("ListAllBizChainResponse.Code"));
		listAllBizChainResponse.setHttpStatusCode(_ctx.integerValue("ListAllBizChainResponse.HttpStatusCode"));
		listAllBizChainResponse.setMessage(_ctx.stringValue("ListAllBizChainResponse.Message"));
		listAllBizChainResponse.setSuccess(_ctx.booleanValue("ListAllBizChainResponse.Success"));

		List<BizChainInfo> data = new ArrayList<BizChainInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAllBizChainResponse.Data.Length"); i++) {
			BizChainInfo bizChainInfo = new BizChainInfo();
			bizChainInfo.setUsedOnchainCount(_ctx.longValue("ListAllBizChainResponse.Data["+ i +"].UsedOnchainCount"));
			bizChainInfo.setName(_ctx.stringValue("ListAllBizChainResponse.Data["+ i +"].Name"));
			bizChainInfo.setBizChainId(_ctx.stringValue("ListAllBizChainResponse.Data["+ i +"].BizChainId"));

			data.add(bizChainInfo);
		}
		listAllBizChainResponse.setData(data);
	 
	 	return listAllBizChainResponse;
	}
}