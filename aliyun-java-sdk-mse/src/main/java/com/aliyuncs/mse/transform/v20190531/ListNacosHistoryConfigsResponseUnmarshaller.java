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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListNacosHistoryConfigsResponse;
import com.aliyuncs.mse.model.v20190531.ListNacosHistoryConfigsResponse.HistoryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNacosHistoryConfigsResponseUnmarshaller {

	public static ListNacosHistoryConfigsResponse unmarshall(ListNacosHistoryConfigsResponse listNacosHistoryConfigsResponse, UnmarshallerContext _ctx) {
		
		listNacosHistoryConfigsResponse.setRequestId(_ctx.stringValue("ListNacosHistoryConfigsResponse.RequestId"));
		listNacosHistoryConfigsResponse.setHttpCode(_ctx.stringValue("ListNacosHistoryConfigsResponse.HttpCode"));
		listNacosHistoryConfigsResponse.setTotalCount(_ctx.integerValue("ListNacosHistoryConfigsResponse.TotalCount"));
		listNacosHistoryConfigsResponse.setMessage(_ctx.stringValue("ListNacosHistoryConfigsResponse.Message"));
		listNacosHistoryConfigsResponse.setPageSize(_ctx.integerValue("ListNacosHistoryConfigsResponse.PageSize"));
		listNacosHistoryConfigsResponse.setPageNumber(_ctx.integerValue("ListNacosHistoryConfigsResponse.PageNumber"));
		listNacosHistoryConfigsResponse.setErrorCode(_ctx.stringValue("ListNacosHistoryConfigsResponse.ErrorCode"));
		listNacosHistoryConfigsResponse.setSuccess(_ctx.booleanValue("ListNacosHistoryConfigsResponse.Success"));

		List<HistoryItem> historyItems = new ArrayList<HistoryItem>();
		for (int i = 0; i < _ctx.lengthValue("ListNacosHistoryConfigsResponse.HistoryItems.Length"); i++) {
			HistoryItem historyItem = new HistoryItem();
			historyItem.setAppName(_ctx.stringValue("ListNacosHistoryConfigsResponse.HistoryItems["+ i +"].AppName"));
			historyItem.setDataId(_ctx.stringValue("ListNacosHistoryConfigsResponse.HistoryItems["+ i +"].DataId"));
			historyItem.setGroup(_ctx.stringValue("ListNacosHistoryConfigsResponse.HistoryItems["+ i +"].Group"));
			historyItem.setLastModifiedTime(_ctx.longValue("ListNacosHistoryConfigsResponse.HistoryItems["+ i +"].LastModifiedTime"));
			historyItem.setId(_ctx.longValue("ListNacosHistoryConfigsResponse.HistoryItems["+ i +"].Id"));
			historyItem.setOpType(_ctx.stringValue("ListNacosHistoryConfigsResponse.HistoryItems["+ i +"].OpType"));

			historyItems.add(historyItem);
		}
		listNacosHistoryConfigsResponse.setHistoryItems(historyItems);
	 
	 	return listNacosHistoryConfigsResponse;
	}
}