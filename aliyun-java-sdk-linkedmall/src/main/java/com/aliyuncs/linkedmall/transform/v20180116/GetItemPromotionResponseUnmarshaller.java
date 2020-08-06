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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.GetItemPromotionResponse;
import com.aliyuncs.linkedmall.model.v20180116.GetItemPromotionResponse.ItemPromotionModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetItemPromotionResponseUnmarshaller {

	public static GetItemPromotionResponse unmarshall(GetItemPromotionResponse getItemPromotionResponse, UnmarshallerContext _ctx) {
		
		getItemPromotionResponse.setRequestId(_ctx.stringValue("GetItemPromotionResponse.RequestId"));
		getItemPromotionResponse.setCode(_ctx.stringValue("GetItemPromotionResponse.Code"));
		getItemPromotionResponse.setMessage(_ctx.stringValue("GetItemPromotionResponse.Message"));
		getItemPromotionResponse.setSubCode(_ctx.stringValue("GetItemPromotionResponse.SubCode"));
		getItemPromotionResponse.setSubMessage(_ctx.stringValue("GetItemPromotionResponse.SubMessage"));
		getItemPromotionResponse.setSuccess(_ctx.booleanValue("GetItemPromotionResponse.Success"));

		ItemPromotionModel itemPromotionModel = new ItemPromotionModel();
		itemPromotionModel.setLmItemId(_ctx.stringValue("GetItemPromotionResponse.ItemPromotionModel.LmItemId"));
		itemPromotionModel.setItemId(_ctx.longValue("GetItemPromotionResponse.ItemPromotionModel.ItemId"));
		itemPromotionModel.setPromotionFlag(_ctx.booleanValue("GetItemPromotionResponse.ItemPromotionModel.PromotionFlag"));
		itemPromotionModel.setPromotionId(_ctx.stringValue("GetItemPromotionResponse.ItemPromotionModel.PromotionId"));
		itemPromotionModel.setPromotionName(_ctx.stringValue("GetItemPromotionResponse.ItemPromotionModel.PromotionName"));
		itemPromotionModel.setPromotionDesc(_ctx.stringValue("GetItemPromotionResponse.ItemPromotionModel.PromotionDesc"));
		itemPromotionModel.setStartTime(_ctx.stringValue("GetItemPromotionResponse.ItemPromotionModel.StartTime"));
		itemPromotionModel.setEndTime(_ctx.stringValue("GetItemPromotionResponse.ItemPromotionModel.EndTime"));
		itemPromotionModel.setSkuPromotion(_ctx.mapValue("GetItemPromotionResponse.ItemPromotionModel.SkuPromotion"));
		itemPromotionModel.setExtInfo(_ctx.mapValue("GetItemPromotionResponse.ItemPromotionModel.ExtInfo"));
		getItemPromotionResponse.setItemPromotionModel(itemPromotionModel);
	 
	 	return getItemPromotionResponse;
	}
}