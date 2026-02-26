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

import com.aliyuncs.lto.model.v20210707.ListBaaSAntChainPeerResponse;
import com.aliyuncs.lto.model.v20210707.ListBaaSAntChainPeerResponse.BaaSAntChainPeerInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBaaSAntChainPeerResponseUnmarshaller {

	public static ListBaaSAntChainPeerResponse unmarshall(ListBaaSAntChainPeerResponse listBaaSAntChainPeerResponse, UnmarshallerContext _ctx) {
		
		listBaaSAntChainPeerResponse.setRequestId(_ctx.stringValue("ListBaaSAntChainPeerResponse.RequestId"));
		listBaaSAntChainPeerResponse.setCode(_ctx.stringValue("ListBaaSAntChainPeerResponse.Code"));
		listBaaSAntChainPeerResponse.setHttpStatusCode(_ctx.integerValue("ListBaaSAntChainPeerResponse.HttpStatusCode"));
		listBaaSAntChainPeerResponse.setMessage(_ctx.stringValue("ListBaaSAntChainPeerResponse.Message"));
		listBaaSAntChainPeerResponse.setSuccess(_ctx.booleanValue("ListBaaSAntChainPeerResponse.Success"));

		List<BaaSAntChainPeerInfo> data = new ArrayList<BaaSAntChainPeerInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListBaaSAntChainPeerResponse.Data.Length"); i++) {
			BaaSAntChainPeerInfo baaSAntChainPeerInfo = new BaaSAntChainPeerInfo();
			baaSAntChainPeerInfo.setNodeName(_ctx.stringValue("ListBaaSAntChainPeerResponse.Data["+ i +"].NodeName"));

			data.add(baaSAntChainPeerInfo);
		}
		listBaaSAntChainPeerResponse.setData(data);
	 
	 	return listBaaSAntChainPeerResponse;
	}
}