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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListMetaClusterResponse;
import com.aliyuncs.emr.model.v20160408.ListMetaClusterResponse.Item;
import com.aliyuncs.emr.model.v20160408.ListMetaClusterResponse.Item.SoftwareInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMetaClusterResponseUnmarshaller {

	public static ListMetaClusterResponse unmarshall(ListMetaClusterResponse listMetaClusterResponse, UnmarshallerContext _ctx) {
		
		listMetaClusterResponse.setRequestId(_ctx.stringValue("ListMetaClusterResponse.RequestId"));
		listMetaClusterResponse.setPageNumber(_ctx.integerValue("ListMetaClusterResponse.PageNumber"));
		listMetaClusterResponse.setPageSize(_ctx.integerValue("ListMetaClusterResponse.PageSize"));
		listMetaClusterResponse.setTotalCount(_ctx.integerValue("ListMetaClusterResponse.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListMetaClusterResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setId(_ctx.stringValue("ListMetaClusterResponse.Items["+ i +"].Id"));
			item.setName(_ctx.stringValue("ListMetaClusterResponse.Items["+ i +"].Name"));

			SoftwareInfo softwareInfo = new SoftwareInfo();
			softwareInfo.setEmrVer(_ctx.stringValue("ListMetaClusterResponse.Items["+ i +"].SoftwareInfo.EmrVer"));
			softwareInfo.setClusterType(_ctx.stringValue("ListMetaClusterResponse.Items["+ i +"].SoftwareInfo.ClusterType"));
			item.setSoftwareInfo(softwareInfo);

			items.add(item);
		}
		listMetaClusterResponse.setItems(items);
	 
	 	return listMetaClusterResponse;
	}
}