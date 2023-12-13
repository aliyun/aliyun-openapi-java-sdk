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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.ListUsersByProdResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListUsersByProdResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersByProdResponseUnmarshaller {

	public static ListUsersByProdResponse unmarshall(ListUsersByProdResponse listUsersByProdResponse, UnmarshallerContext _ctx) {
		
		listUsersByProdResponse.setRequestId(_ctx.stringValue("ListUsersByProdResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersByProdResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSourceProdCode(_ctx.stringValue("ListUsersByProdResponse.Data["+ i +"].SourceProdCode"));
			dataItem.setSourceLogCode(_ctx.stringValue("ListUsersByProdResponse.Data["+ i +"].SourceLogCode"));
			dataItem.setSourceLogName(_ctx.stringValue("ListUsersByProdResponse.Data["+ i +"].SourceLogName"));
			dataItem.setCloudCode(_ctx.stringValue("ListUsersByProdResponse.Data["+ i +"].CloudCode"));
			dataItem.setImported(_ctx.booleanValue("ListUsersByProdResponse.Data["+ i +"].Imported"));
			dataItem.setLogMdsCode(_ctx.stringValue("ListUsersByProdResponse.Data["+ i +"].LogMdsCode"));
			dataItem.setMainUserId(_ctx.longValue("ListUsersByProdResponse.Data["+ i +"].MainUserId"));
			dataItem.setSubUserId(_ctx.longValue("ListUsersByProdResponse.Data["+ i +"].SubUserId"));
			dataItem.setSubUserName(_ctx.stringValue("ListUsersByProdResponse.Data["+ i +"].SubUserName"));

			data.add(dataItem);
		}
		listUsersByProdResponse.setData(data);
	 
	 	return listUsersByProdResponse;
	}
}