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

package com.aliyuncs.amqp_open.transform.v20191212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.amqp_open.model.v20191212.ListVirtualHostsResponse;
import com.aliyuncs.amqp_open.model.v20191212.ListVirtualHostsResponse.Data;
import com.aliyuncs.amqp_open.model.v20191212.ListVirtualHostsResponse.Data.VhostVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVirtualHostsResponseUnmarshaller {

	public static ListVirtualHostsResponse unmarshall(ListVirtualHostsResponse listVirtualHostsResponse, UnmarshallerContext _ctx) {
		
		listVirtualHostsResponse.setRequestId(_ctx.stringValue("ListVirtualHostsResponse.RequestId"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListVirtualHostsResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("ListVirtualHostsResponse.Data.MaxResults"));

		List<VhostVO> virtualHosts = new ArrayList<VhostVO>();
		for (int i = 0; i < _ctx.lengthValue("ListVirtualHostsResponse.Data.VirtualHosts.Length"); i++) {
			VhostVO vhostVO = new VhostVO();
			vhostVO.setName(_ctx.stringValue("ListVirtualHostsResponse.Data.VirtualHosts["+ i +"].Name"));

			virtualHosts.add(vhostVO);
		}
		data.setVirtualHosts(virtualHosts);
		listVirtualHostsResponse.setData(data);
	 
	 	return listVirtualHostsResponse;
	}
}