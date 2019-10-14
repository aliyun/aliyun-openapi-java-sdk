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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.ListNodeTransferPacketPathsResponse;
import com.aliyuncs.linkwan.model.v20190301.ListNodeTransferPacketPathsResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListNodeTransferPacketPathsResponse.Data.Path;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeTransferPacketPathsResponseUnmarshaller {

	public static ListNodeTransferPacketPathsResponse unmarshall(ListNodeTransferPacketPathsResponse listNodeTransferPacketPathsResponse, UnmarshallerContext _ctx) {
		
		listNodeTransferPacketPathsResponse.setRequestId(_ctx.stringValue("ListNodeTransferPacketPathsResponse.RequestId"));
		listNodeTransferPacketPathsResponse.setSuccess(_ctx.booleanValue("ListNodeTransferPacketPathsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListNodeTransferPacketPathsResponse.Data.TotalCount"));

		List<Path> list = new ArrayList<Path>();
		for (int i = 0; i < _ctx.lengthValue("ListNodeTransferPacketPathsResponse.Data.List.Length"); i++) {
			Path path = new Path();
			path.setGwEui(_ctx.stringValue("ListNodeTransferPacketPathsResponse.Data.List["+ i +"].GwEui"));
			path.setDevEui(_ctx.stringValue("ListNodeTransferPacketPathsResponse.Data.List["+ i +"].DevEui"));
			path.setRssi(_ctx.integerValue("ListNodeTransferPacketPathsResponse.Data.List["+ i +"].Rssi"));
			path.setLsnr(_ctx.floatValue("ListNodeTransferPacketPathsResponse.Data.List["+ i +"].Lsnr"));
			path.setBestPath(_ctx.booleanValue("ListNodeTransferPacketPathsResponse.Data.List["+ i +"].BestPath"));

			list.add(path);
		}
		data.setList(list);
		listNodeTransferPacketPathsResponse.setData(data);
	 
	 	return listNodeTransferPacketPathsResponse;
	}
}