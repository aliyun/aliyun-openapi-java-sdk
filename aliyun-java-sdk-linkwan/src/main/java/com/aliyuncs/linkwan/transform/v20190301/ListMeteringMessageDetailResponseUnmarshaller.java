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

import com.aliyuncs.linkwan.model.v20190301.ListMeteringMessageDetailResponse;
import com.aliyuncs.linkwan.model.v20190301.ListMeteringMessageDetailResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListMeteringMessageDetailResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMeteringMessageDetailResponseUnmarshaller {

	public static ListMeteringMessageDetailResponse unmarshall(ListMeteringMessageDetailResponse listMeteringMessageDetailResponse, UnmarshallerContext _ctx) {
		
		listMeteringMessageDetailResponse.setRequestId(_ctx.stringValue("ListMeteringMessageDetailResponse.RequestId"));
		listMeteringMessageDetailResponse.setSuccess(_ctx.booleanValue("ListMeteringMessageDetailResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListMeteringMessageDetailResponse.Data.TotalCount"));

		List<Item> list = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListMeteringMessageDetailResponse.Data.List.Length"); i++) {
			Item item = new Item();
			item.setTime(_ctx.longValue("ListMeteringMessageDetailResponse.Data.List["+ i +"].Time"));
			item.setDevEui(_ctx.stringValue("ListMeteringMessageDetailResponse.Data.List["+ i +"].DevEui"));
			item.setJoinPermissionId(_ctx.stringValue("ListMeteringMessageDetailResponse.Data.List["+ i +"].JoinPermissionId"));
			item.setGwEui(_ctx.stringValue("ListMeteringMessageDetailResponse.Data.List["+ i +"].GwEui"));
			item.setDirection(_ctx.stringValue("ListMeteringMessageDetailResponse.Data.List["+ i +"].Direction"));

			list.add(item);
		}
		data.setList(list);
		listMeteringMessageDetailResponse.setData(data);
	 
	 	return listMeteringMessageDetailResponse;
	}
}