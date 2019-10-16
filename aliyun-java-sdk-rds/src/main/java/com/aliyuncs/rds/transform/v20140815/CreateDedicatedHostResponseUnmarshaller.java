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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.CreateDedicatedHostResponse;
import com.aliyuncs.rds.model.v20140815.CreateDedicatedHostResponse.DedicateHostListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDedicatedHostResponseUnmarshaller {

	public static CreateDedicatedHostResponse unmarshall(CreateDedicatedHostResponse createDedicatedHostResponse, UnmarshallerContext _ctx) {
		
		createDedicatedHostResponse.setRequestId(_ctx.stringValue("CreateDedicatedHostResponse.RequestId"));
		createDedicatedHostResponse.setOrderId(_ctx.longValue("CreateDedicatedHostResponse.OrderId"));

		List<DedicateHostListItem> dedicateHostList = new ArrayList<DedicateHostListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateDedicatedHostResponse.DedicateHostList.Length"); i++) {
			DedicateHostListItem dedicateHostListItem = new DedicateHostListItem();
			dedicateHostListItem.setDedicatedHostId(_ctx.stringValue("CreateDedicatedHostResponse.DedicateHostList["+ i +"].DedicatedHostId"));

			dedicateHostList.add(dedicateHostListItem);
		}
		createDedicatedHostResponse.setDedicateHostList(dedicateHostList);
	 
	 	return createDedicatedHostResponse;
	}
}