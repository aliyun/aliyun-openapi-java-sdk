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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListIdpConfigsResponse;
import com.aliyuncs.csas.model.v20230120.ListIdpConfigsResponse.Data;
import com.aliyuncs.csas.model.v20230120.ListIdpConfigsResponse.Data.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIdpConfigsResponseUnmarshaller {

	public static ListIdpConfigsResponse unmarshall(ListIdpConfigsResponse listIdpConfigsResponse, UnmarshallerContext _ctx) {
		
		listIdpConfigsResponse.setRequestId(_ctx.stringValue("ListIdpConfigsResponse.RequestId"));

		Data data = new Data();
		data.setTotalNum(_ctx.longValue("ListIdpConfigsResponse.Data.TotalNum"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIdpConfigsResponse.Data.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setId(_ctx.stringValue("ListIdpConfigsResponse.Data.DataList["+ i +"].Id"));
			dataListItem.setName(_ctx.stringValue("ListIdpConfigsResponse.Data.DataList["+ i +"].Name"));
			dataListItem.setType(_ctx.stringValue("ListIdpConfigsResponse.Data.DataList["+ i +"].Type"));
			dataListItem.setDescription(_ctx.stringValue("ListIdpConfigsResponse.Data.DataList["+ i +"].Description"));
			dataListItem.setMfa(_ctx.stringValue("ListIdpConfigsResponse.Data.DataList["+ i +"].Mfa"));
			dataListItem.setMobileLoginType(_ctx.stringValue("ListIdpConfigsResponse.Data.DataList["+ i +"].MobileLoginType"));
			dataListItem.setMobileMfaConfigType(_ctx.stringValue("ListIdpConfigsResponse.Data.DataList["+ i +"].MobileMfaConfigType"));
			dataListItem.setMultiIdpInfo(_ctx.stringValue("ListIdpConfigsResponse.Data.DataList["+ i +"].MultiIdpInfo"));
			dataListItem.setPcLoginType(_ctx.stringValue("ListIdpConfigsResponse.Data.DataList["+ i +"].PcLoginType"));
			dataListItem.setStatus(_ctx.stringValue("ListIdpConfigsResponse.Data.DataList["+ i +"].Status"));
			dataListItem.setUpdateTime(_ctx.stringValue("ListIdpConfigsResponse.Data.DataList["+ i +"].UpdateTime"));

			dataList.add(dataListItem);
		}
		data.setDataList(dataList);
		listIdpConfigsResponse.setData(data);
	 
	 	return listIdpConfigsResponse;
	}
}