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

import com.aliyuncs.linkwan.model.v20190301.ListNodeTransferPacketsResponse;
import com.aliyuncs.linkwan.model.v20190301.ListNodeTransferPacketsResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListNodeTransferPacketsResponse.Data.Packet;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeTransferPacketsResponseUnmarshaller {

	public static ListNodeTransferPacketsResponse unmarshall(ListNodeTransferPacketsResponse listNodeTransferPacketsResponse, UnmarshallerContext _ctx) {
		
		listNodeTransferPacketsResponse.setRequestId(_ctx.stringValue("ListNodeTransferPacketsResponse.RequestId"));
		listNodeTransferPacketsResponse.setSuccess(_ctx.booleanValue("ListNodeTransferPacketsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListNodeTransferPacketsResponse.Data.TotalCount"));

		List<Packet> list = new ArrayList<Packet>();
		for (int i = 0; i < _ctx.lengthValue("ListNodeTransferPacketsResponse.Data.List.Length"); i++) {
			Packet packet = new Packet();
			packet.setGwEui(_ctx.stringValue("ListNodeTransferPacketsResponse.Data.List["+ i +"].GwEui"));
			packet.setDevEui(_ctx.stringValue("ListNodeTransferPacketsResponse.Data.List["+ i +"].DevEui"));
			packet.setFreq(_ctx.floatValue("ListNodeTransferPacketsResponse.Data.List["+ i +"].Freq"));
			packet.setDatr(_ctx.stringValue("ListNodeTransferPacketsResponse.Data.List["+ i +"].Datr"));
			packet.setClassMode(_ctx.stringValue("ListNodeTransferPacketsResponse.Data.List["+ i +"].ClassMode"));
			packet.setRssi(_ctx.integerValue("ListNodeTransferPacketsResponse.Data.List["+ i +"].Rssi"));
			packet.setSnr(_ctx.floatValue("ListNodeTransferPacketsResponse.Data.List["+ i +"].Snr"));
			packet.setLogMillis(_ctx.longValue("ListNodeTransferPacketsResponse.Data.List["+ i +"].LogMillis"));

			list.add(packet);
		}
		data.setList(list);
		listNodeTransferPacketsResponse.setData(data);
	 
	 	return listNodeTransferPacketsResponse;
	}
}