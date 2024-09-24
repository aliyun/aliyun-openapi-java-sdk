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

package com.aliyuncs.bpstudio.transform.v20210931;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bpstudio.model.v20210931.GetResult4QueryInstancePrice4ModifyResponse;
import com.aliyuncs.bpstudio.model.v20210931.GetResult4QueryInstancePrice4ModifyResponse.Data;
import com.aliyuncs.bpstudio.model.v20210931.GetResult4QueryInstancePrice4ModifyResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResult4QueryInstancePrice4ModifyResponseUnmarshaller {

	public static GetResult4QueryInstancePrice4ModifyResponse unmarshall(GetResult4QueryInstancePrice4ModifyResponse getResult4QueryInstancePrice4ModifyResponse, UnmarshallerContext _ctx) {
		
		getResult4QueryInstancePrice4ModifyResponse.setRequestId(_ctx.stringValue("GetResult4QueryInstancePrice4ModifyResponse.RequestId"));
		getResult4QueryInstancePrice4ModifyResponse.setMessage(_ctx.stringValue("GetResult4QueryInstancePrice4ModifyResponse.Message"));
		getResult4QueryInstancePrice4ModifyResponse.setCode(_ctx.stringValue("GetResult4QueryInstancePrice4ModifyResponse.Code"));
		getResult4QueryInstancePrice4ModifyResponse.setAccessDeniedDetail(_ctx.stringValue("GetResult4QueryInstancePrice4ModifyResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("GetResult4QueryInstancePrice4ModifyResponse.Data.TaskId"));
		data.setStatus(_ctx.stringValue("GetResult4QueryInstancePrice4ModifyResponse.Data.Status"));

		List<Item> priceList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("GetResult4QueryInstancePrice4ModifyResponse.Data.PriceList.Length"); i++) {
			Item item = new Item();
			item.setNodeType(_ctx.stringValue("GetResult4QueryInstancePrice4ModifyResponse.Data.PriceList["+ i +"].NodeType"));
			item.setTradeAmount(_ctx.doubleValue("GetResult4QueryInstancePrice4ModifyResponse.Data.PriceList["+ i +"].TradeAmount"));
			item.setDiscountAmount(_ctx.doubleValue("GetResult4QueryInstancePrice4ModifyResponse.Data.PriceList["+ i +"].DiscountAmount"));
			item.setOriginalAmount(_ctx.doubleValue("GetResult4QueryInstancePrice4ModifyResponse.Data.PriceList["+ i +"].OriginalAmount"));
			item.setPriceUnit(_ctx.stringValue("GetResult4QueryInstancePrice4ModifyResponse.Data.PriceList["+ i +"].PriceUnit"));
			item.setPromotionName(_ctx.stringValue("GetResult4QueryInstancePrice4ModifyResponse.Data.PriceList["+ i +"].PromotionName"));
			item.setERROR(_ctx.stringValue("GetResult4QueryInstancePrice4ModifyResponse.Data.PriceList["+ i +"].ERROR"));

			priceList.add(item);
		}
		data.setPriceList(priceList);
		getResult4QueryInstancePrice4ModifyResponse.setData(data);
	 
	 	return getResult4QueryInstancePrice4ModifyResponse;
	}
}