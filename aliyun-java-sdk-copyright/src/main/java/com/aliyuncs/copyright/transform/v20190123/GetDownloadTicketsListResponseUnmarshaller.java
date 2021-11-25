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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.GetDownloadTicketsListResponse;
import com.aliyuncs.copyright.model.v20190123.GetDownloadTicketsListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDownloadTicketsListResponseUnmarshaller {

	public static GetDownloadTicketsListResponse unmarshall(GetDownloadTicketsListResponse getDownloadTicketsListResponse, UnmarshallerContext _ctx) {
		
		getDownloadTicketsListResponse.setRequestId(_ctx.stringValue("GetDownloadTicketsListResponse.RequestId"));
		getDownloadTicketsListResponse.setPageNum(_ctx.integerValue("GetDownloadTicketsListResponse.PageNum"));
		getDownloadTicketsListResponse.setPageSize(_ctx.integerValue("GetDownloadTicketsListResponse.PageSize"));
		getDownloadTicketsListResponse.setSuccess(_ctx.booleanValue("GetDownloadTicketsListResponse.Success"));
		getDownloadTicketsListResponse.setTotalItemNum(_ctx.integerValue("GetDownloadTicketsListResponse.TotalItemNum"));
		getDownloadTicketsListResponse.setTotalPageNum(_ctx.integerValue("GetDownloadTicketsListResponse.TotalPageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDownloadTicketsListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("GetDownloadTicketsListResponse.Data["+ i +"].Name"));
			dataItem.setDownloadId(_ctx.longValue("GetDownloadTicketsListResponse.Data["+ i +"].DownloadId"));
			dataItem.setDate(_ctx.longValue("GetDownloadTicketsListResponse.Data["+ i +"].Date"));
			dataItem.setStatus(_ctx.stringValue("GetDownloadTicketsListResponse.Data["+ i +"].Status"));
			dataItem.setUrl(_ctx.stringValue("GetDownloadTicketsListResponse.Data["+ i +"].Url"));

			data.add(dataItem);
		}
		getDownloadTicketsListResponse.setData(data);
	 
	 	return getDownloadTicketsListResponse;
	}
}