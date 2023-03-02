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

import com.aliyuncs.lto.model.v20210707.ListBaaSAntChainConsortiumResponse;
import com.aliyuncs.lto.model.v20210707.ListBaaSAntChainConsortiumResponse.BaaSAntChainConsortiumInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBaaSAntChainConsortiumResponseUnmarshaller {

	public static ListBaaSAntChainConsortiumResponse unmarshall(ListBaaSAntChainConsortiumResponse listBaaSAntChainConsortiumResponse, UnmarshallerContext _ctx) {
		
		listBaaSAntChainConsortiumResponse.setRequestId(_ctx.stringValue("ListBaaSAntChainConsortiumResponse.RequestId"));
		listBaaSAntChainConsortiumResponse.setCode(_ctx.stringValue("ListBaaSAntChainConsortiumResponse.Code"));
		listBaaSAntChainConsortiumResponse.setHttpStatusCode(_ctx.integerValue("ListBaaSAntChainConsortiumResponse.HttpStatusCode"));
		listBaaSAntChainConsortiumResponse.setMessage(_ctx.stringValue("ListBaaSAntChainConsortiumResponse.Message"));
		listBaaSAntChainConsortiumResponse.setSuccess(_ctx.booleanValue("ListBaaSAntChainConsortiumResponse.Success"));

		List<BaaSAntChainConsortiumInfo> data = new ArrayList<BaaSAntChainConsortiumInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListBaaSAntChainConsortiumResponse.Data.Length"); i++) {
			BaaSAntChainConsortiumInfo baaSAntChainConsortiumInfo = new BaaSAntChainConsortiumInfo();
			baaSAntChainConsortiumInfo.setBaaSAntChainConsortiumName(_ctx.stringValue("ListBaaSAntChainConsortiumResponse.Data["+ i +"].BaaSAntChainConsortiumName"));
			baaSAntChainConsortiumInfo.setBaaSAntChainConsortiumId(_ctx.stringValue("ListBaaSAntChainConsortiumResponse.Data["+ i +"].BaaSAntChainConsortiumId"));

			data.add(baaSAntChainConsortiumInfo);
		}
		listBaaSAntChainConsortiumResponse.setData(data);
	 
	 	return listBaaSAntChainConsortiumResponse;
	}
}