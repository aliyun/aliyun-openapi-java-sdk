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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.GetCatalogListResponse;
import com.aliyuncs.vcs.model.v20200515.GetCatalogListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCatalogListResponseUnmarshaller {

	public static GetCatalogListResponse unmarshall(GetCatalogListResponse getCatalogListResponse, UnmarshallerContext _ctx) {
		
		getCatalogListResponse.setRequestId(_ctx.stringValue("GetCatalogListResponse.RequestId"));
		getCatalogListResponse.setMessage(_ctx.stringValue("GetCatalogListResponse.Message"));
		getCatalogListResponse.setCode(_ctx.stringValue("GetCatalogListResponse.Code"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCatalogListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setParentCatalogId(_ctx.longValue("GetCatalogListResponse.Data["+ i +"].ParentCatalogId"));
			dataItem.setProfileCount(_ctx.longValue("GetCatalogListResponse.Data["+ i +"].ProfileCount"));
			dataItem.setIsvSubId(_ctx.stringValue("GetCatalogListResponse.Data["+ i +"].IsvSubId"));
			dataItem.setCatalogName(_ctx.stringValue("GetCatalogListResponse.Data["+ i +"].CatalogName"));
			dataItem.setCatalogId(_ctx.longValue("GetCatalogListResponse.Data["+ i +"].CatalogId"));

			data.add(dataItem);
		}
		getCatalogListResponse.setData(data);
	 
	 	return getCatalogListResponse;
	}
}