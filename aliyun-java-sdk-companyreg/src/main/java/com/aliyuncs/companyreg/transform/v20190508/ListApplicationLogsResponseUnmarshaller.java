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

package com.aliyuncs.companyreg.transform.v20190508;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20190508.ListApplicationLogsResponse;
import com.aliyuncs.companyreg.model.v20190508.ListApplicationLogsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationLogsResponseUnmarshaller {

	public static ListApplicationLogsResponse unmarshall(ListApplicationLogsResponse listApplicationLogsResponse, UnmarshallerContext _ctx) {
		
		listApplicationLogsResponse.setRequestId(_ctx.stringValue("ListApplicationLogsResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationLogsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBizId(_ctx.stringValue("ListApplicationLogsResponse.Data["+ i +"].BizId"));
			dataItem.setNote(_ctx.stringValue("ListApplicationLogsResponse.Data["+ i +"].Note"));
			dataItem.setOperateType(_ctx.integerValue("ListApplicationLogsResponse.Data["+ i +"].OperateType"));
			dataItem.setOperateTime(_ctx.longValue("ListApplicationLogsResponse.Data["+ i +"].OperateTime"));
			dataItem.setBizStatus(_ctx.integerValue("ListApplicationLogsResponse.Data["+ i +"].BizStatus"));
			dataItem.setExtendContent(_ctx.stringValue("ListApplicationLogsResponse.Data["+ i +"].ExtendContent"));

			data.add(dataItem);
		}
		listApplicationLogsResponse.setData(data);
	 
	 	return listApplicationLogsResponse;
	}
}