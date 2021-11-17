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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mindlive_biz.model.v20210214.QueryVirtualItemResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryVirtualItemResponse.NoviceGuideModeItemDTO;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryVirtualItemResponse.NoviceGuideModeItemDTO.LiveItem;
import com.aliyuncs.mindlive_biz.model.v20210214.QueryVirtualItemResponse.NoviceGuideModeItemDTO.LiveItem.ExtendVal;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVirtualItemResponseUnmarshaller {

	public static QueryVirtualItemResponse unmarshall(QueryVirtualItemResponse queryVirtualItemResponse, UnmarshallerContext _ctx) {
		
		queryVirtualItemResponse.setRequestId(_ctx.stringValue("QueryVirtualItemResponse.RequestId"));
		queryVirtualItemResponse.setErrorMessage(_ctx.stringValue("QueryVirtualItemResponse.ErrorMessage"));
		queryVirtualItemResponse.setSuccess(_ctx.booleanValue("QueryVirtualItemResponse.Success"));
		queryVirtualItemResponse.setErrorCode(_ctx.stringValue("QueryVirtualItemResponse.ErrorCode"));

		List<NoviceGuideModeItemDTO> data = new ArrayList<NoviceGuideModeItemDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryVirtualItemResponse.Data.Length"); i++) {
			NoviceGuideModeItemDTO noviceGuideModeItemDTO = new NoviceGuideModeItemDTO();
			noviceGuideModeItemDTO.setGoodsIndex(_ctx.integerValue("QueryVirtualItemResponse.Data["+ i +"].GoodsIndex"));

			LiveItem liveItem = new LiveItem();
			liveItem.setItemPic(_ctx.stringValue("QueryVirtualItemResponse.Data["+ i +"].LiveItem.ItemPic"));
			liveItem.setItemId(_ctx.longValue("QueryVirtualItemResponse.Data["+ i +"].LiveItem.ItemId"));
			liveItem.setItemName(_ctx.stringValue("QueryVirtualItemResponse.Data["+ i +"].LiveItem.ItemName"));
			liveItem.setItemPrice(_ctx.stringValue("QueryVirtualItemResponse.Data["+ i +"].LiveItem.ItemPrice"));

			ExtendVal extendVal = new ExtendVal();

			List<Map<Object, Object>> atmosphere = _ctx.listMapValue("QueryVirtualItemResponse.Data["+ i +"].LiveItem.ExtendVal.Atmosphere");
			extendVal.setAtmosphere(atmosphere);
			liveItem.setExtendVal(extendVal);
			noviceGuideModeItemDTO.setLiveItem(liveItem);

			data.add(noviceGuideModeItemDTO);
		}
		queryVirtualItemResponse.setData(data);
	 
	 	return queryVirtualItemResponse;
	}
}