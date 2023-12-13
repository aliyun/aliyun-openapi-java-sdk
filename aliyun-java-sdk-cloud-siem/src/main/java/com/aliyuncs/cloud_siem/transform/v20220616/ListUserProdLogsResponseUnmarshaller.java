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

import com.aliyuncs.cloud_siem.model.v20220616.ListUserProdLogsResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListUserProdLogsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserProdLogsResponseUnmarshaller {

	public static ListUserProdLogsResponse unmarshall(ListUserProdLogsResponse listUserProdLogsResponse, UnmarshallerContext _ctx) {
		
		listUserProdLogsResponse.setRequestId(_ctx.stringValue("ListUserProdLogsResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUserProdLogsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSourceLogCode(_ctx.stringValue("ListUserProdLogsResponse.Data["+ i +"].SourceLogCode"));
			dataItem.setSourceLogInfo(_ctx.stringValue("ListUserProdLogsResponse.Data["+ i +"].SourceLogInfo"));
			dataItem.setDisplayLine(_ctx.stringValue("ListUserProdLogsResponse.Data["+ i +"].DisplayLine"));
			dataItem.setSourceProdCode(_ctx.stringValue("ListUserProdLogsResponse.Data["+ i +"].SourceProdCode"));
			dataItem.setIsDeleted(_ctx.integerValue("ListUserProdLogsResponse.Data["+ i +"].IsDeleted"));
			dataItem.setImported(_ctx.booleanValue("ListUserProdLogsResponse.Data["+ i +"].Imported"));
			dataItem.setDisplayed(_ctx.booleanValue("ListUserProdLogsResponse.Data["+ i +"].Displayed"));
			dataItem.setMainUserId(_ctx.longValue("ListUserProdLogsResponse.Data["+ i +"].MainUserId"));
			dataItem.setSubUserId(_ctx.longValue("ListUserProdLogsResponse.Data["+ i +"].SubUserId"));
			dataItem.setSubUserName(_ctx.stringValue("ListUserProdLogsResponse.Data["+ i +"].SubUserName"));

			data.add(dataItem);
		}
		listUserProdLogsResponse.setData(data);
	 
	 	return listUserProdLogsResponse;
	}
}