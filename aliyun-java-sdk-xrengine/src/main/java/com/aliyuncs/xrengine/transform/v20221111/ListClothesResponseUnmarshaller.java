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

package com.aliyuncs.xrengine.transform.v20221111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xrengine.model.v20221111.ListClothesResponse;
import com.aliyuncs.xrengine.model.v20221111.ListClothesResponse.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClothesResponseUnmarshaller {

	public static ListClothesResponse unmarshall(ListClothesResponse listClothesResponse, UnmarshallerContext _ctx) {
		
		listClothesResponse.setRequestId(_ctx.stringValue("ListClothesResponse.RequestId"));
		listClothesResponse.setCurrent(_ctx.integerValue("ListClothesResponse.Current"));
		listClothesResponse.setSize(_ctx.integerValue("ListClothesResponse.Size"));
		listClothesResponse.setTotal(_ctx.integerValue("ListClothesResponse.Total"));
		listClothesResponse.setPages(_ctx.integerValue("ListClothesResponse.Pages"));
		listClothesResponse.setSuccess(_ctx.booleanValue("ListClothesResponse.Success"));
		listClothesResponse.setCode(_ctx.stringValue("ListClothesResponse.Code"));
		listClothesResponse.setMessage(_ctx.stringValue("ListClothesResponse.Message"));
		listClothesResponse.setErrorName(_ctx.stringValue("ListClothesResponse.ErrorName"));
		listClothesResponse.setHttpCode(_ctx.integerValue("ListClothesResponse.HttpCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClothesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setOssKey(_ctx.stringValue("ListClothesResponse.Data["+ i +"].OssKey"));
			dataItem.setType(_ctx.stringValue("ListClothesResponse.Data["+ i +"].Type"));
			dataItem.setName(_ctx.stringValue("ListClothesResponse.Data["+ i +"].Name"));
			dataItem.setCoverUrl(_ctx.stringValue("ListClothesResponse.Data["+ i +"].CoverUrl"));
			dataItem.setId(_ctx.stringValue("ListClothesResponse.Data["+ i +"].Id"));
			dataItem.setCreateTime(_ctx.stringValue("ListClothesResponse.Data["+ i +"].CreateTime"));
			dataItem.setModifiedTime(_ctx.stringValue("ListClothesResponse.Data["+ i +"].ModifiedTime"));
			dataItem.setSize(_ctx.stringValue("ListClothesResponse.Data["+ i +"].Size"));
			dataItem.setStatus(_ctx.mapValue("ListClothesResponse.Data["+ i +"].Status"));
			dataItem.setPart(_ctx.stringValue("ListClothesResponse.Data["+ i +"].Part"));

			data.add(dataItem);
		}
		listClothesResponse.setData(data);
	 
	 	return listClothesResponse;
	}
}