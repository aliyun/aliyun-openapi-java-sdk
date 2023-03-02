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

import com.aliyuncs.lto.model.v20210707.ListBaaSAntChainResponse;
import com.aliyuncs.lto.model.v20210707.ListBaaSAntChainResponse.BaaSAntChainChainInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBaaSAntChainResponseUnmarshaller {

	public static ListBaaSAntChainResponse unmarshall(ListBaaSAntChainResponse listBaaSAntChainResponse, UnmarshallerContext _ctx) {
		
		listBaaSAntChainResponse.setRequestId(_ctx.stringValue("ListBaaSAntChainResponse.RequestId"));
		listBaaSAntChainResponse.setCode(_ctx.stringValue("ListBaaSAntChainResponse.Code"));
		listBaaSAntChainResponse.setHttpStatusCode(_ctx.integerValue("ListBaaSAntChainResponse.HttpStatusCode"));
		listBaaSAntChainResponse.setMessage(_ctx.stringValue("ListBaaSAntChainResponse.Message"));
		listBaaSAntChainResponse.setSuccess(_ctx.booleanValue("ListBaaSAntChainResponse.Success"));

		List<BaaSAntChainChainInfo> data = new ArrayList<BaaSAntChainChainInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListBaaSAntChainResponse.Data.Length"); i++) {
			BaaSAntChainChainInfo baaSAntChainChainInfo = new BaaSAntChainChainInfo();
			baaSAntChainChainInfo.setBaaSAntChainChainName(_ctx.stringValue("ListBaaSAntChainResponse.Data["+ i +"].BaaSAntChainChainName"));
			baaSAntChainChainInfo.setBaaSAntChainChainId(_ctx.stringValue("ListBaaSAntChainResponse.Data["+ i +"].BaaSAntChainChainId"));

			data.add(baaSAntChainChainInfo);
		}
		listBaaSAntChainResponse.setData(data);
	 
	 	return listBaaSAntChainResponse;
	}
}