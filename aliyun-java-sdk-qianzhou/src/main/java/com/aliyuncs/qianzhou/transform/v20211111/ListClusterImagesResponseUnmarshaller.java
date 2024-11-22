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

package com.aliyuncs.qianzhou.transform.v20211111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qianzhou.model.v20211111.ListClusterImagesResponse;
import com.aliyuncs.qianzhou.model.v20211111.ListClusterImagesResponse.Datas;
import com.aliyuncs.qianzhou.model.v20211111.ListClusterImagesResponse.Datas.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterImagesResponseUnmarshaller {

	public static ListClusterImagesResponse unmarshall(ListClusterImagesResponse listClusterImagesResponse, UnmarshallerContext _ctx) {
		
		listClusterImagesResponse.setRequestId(_ctx.stringValue("ListClusterImagesResponse.requestId"));
		listClusterImagesResponse.setCode(_ctx.integerValue("ListClusterImagesResponse.code"));
		listClusterImagesResponse.setMsg(_ctx.stringValue("ListClusterImagesResponse.msg"));

		Datas datas = new Datas();
		datas.setTotal(_ctx.integerValue("ListClusterImagesResponse.datas.total"));
		datas.setPageSize(_ctx.integerValue("ListClusterImagesResponse.datas.pageSize"));
		datas.setCurrent(_ctx.integerValue("ListClusterImagesResponse.datas.current"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterImagesResponse.datas.data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCluster_id(_ctx.stringValue("ListClusterImagesResponse.datas.data["+ i +"].cluster_id"));
			dataItem.setNamespace(_ctx.stringValue("ListClusterImagesResponse.datas.data["+ i +"].namespace"));
			dataItem.setImage_name(_ctx.stringValue("ListClusterImagesResponse.datas.data["+ i +"].image_name"));
			dataItem.setImage_hash(_ctx.stringValue("ListClusterImagesResponse.datas.data["+ i +"].image_hash"));
			dataItem.setController_type(_ctx.stringValue("ListClusterImagesResponse.datas.data["+ i +"].controller_type"));
			dataItem.setController_name(_ctx.stringValue("ListClusterImagesResponse.datas.data["+ i +"].controller_name"));
			dataItem.setCreated(_ctx.stringValue("ListClusterImagesResponse.datas.data["+ i +"].created"));
			dataItem.setUpdated(_ctx.stringValue("ListClusterImagesResponse.datas.data["+ i +"].updated"));
			dataItem.setUid(_ctx.stringValue("ListClusterImagesResponse.datas.data["+ i +"].uid"));

			data.add(dataItem);
		}
		datas.setData(data);
		listClusterImagesResponse.setDatas(datas);
	 
	 	return listClusterImagesResponse;
	}
}