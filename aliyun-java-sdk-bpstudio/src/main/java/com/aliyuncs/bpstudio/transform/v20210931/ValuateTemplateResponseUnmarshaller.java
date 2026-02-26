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

import com.aliyuncs.bpstudio.model.v20210931.ValuateTemplateResponse;
import com.aliyuncs.bpstudio.model.v20210931.ValuateTemplateResponse.Data;
import com.aliyuncs.bpstudio.model.v20210931.ValuateTemplateResponse.Data.Item;
import com.aliyuncs.bpstudio.model.v20210931.ValuateTemplateResponse.Data.Item.Item1;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValuateTemplateResponseUnmarshaller {

	public static ValuateTemplateResponse unmarshall(ValuateTemplateResponse valuateTemplateResponse, UnmarshallerContext _ctx) {
		
		valuateTemplateResponse.setRequestId(_ctx.stringValue("ValuateTemplateResponse.RequestId"));
		valuateTemplateResponse.setMessage(_ctx.stringValue("ValuateTemplateResponse.Message"));
		valuateTemplateResponse.setCode(_ctx.stringValue("ValuateTemplateResponse.Code"));

		Data data = new Data();

		List<Item> resourceList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ValuateTemplateResponse.Data.ResourceList.Length"); i++) {
			Item item = new Item();
			item.setNodeType(_ctx.stringValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].NodeType"));
			item.setError(_ctx.stringValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].Error"));
			item.setTradePrice(_ctx.doubleValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].TradePrice"));
			item.setDiscountAmount(_ctx.doubleValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].DiscountAmount"));
			item.setOriginalPrice(_ctx.doubleValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].OriginalPrice"));
			item.setPromotionName(_ctx.stringValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].PromotionName"));
			item.setPriceUnit(_ctx.stringValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].PriceUnit"));

			List<Item1> priceList = new ArrayList<Item1>();
			for (int j = 0; j < _ctx.lengthValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].PriceList.Length"); j++) {
				Item1 item1 = new Item1();
				item1.setNodeType(_ctx.stringValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].PriceList["+ j +"].NodeType"));
				item1.setResourceId(_ctx.stringValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].PriceList["+ j +"].ResourceId"));
				item1.setError(_ctx.stringValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].PriceList["+ j +"].Error"));
				item1.setTradePrice(_ctx.floatValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].PriceList["+ j +"].TradePrice"));
				item1.setDiscountAmount(_ctx.floatValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].PriceList["+ j +"].DiscountAmount"));
				item1.setOriginalPrice(_ctx.floatValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].PriceList["+ j +"].OriginalPrice"));
				item1.setPromotionName(_ctx.stringValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].PriceList["+ j +"].PromotionName"));
				item1.setPriceUnit(_ctx.stringValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].PriceList["+ j +"].PriceUnit"));
				item1.setType(_ctx.stringValue("ValuateTemplateResponse.Data.ResourceList["+ i +"].PriceList["+ j +"].Type"));

				priceList.add(item1);
			}
			item.setPriceList(priceList);

			resourceList.add(item);
		}
		data.setResourceList(resourceList);
		valuateTemplateResponse.setData(data);
	 
	 	return valuateTemplateResponse;
	}
}