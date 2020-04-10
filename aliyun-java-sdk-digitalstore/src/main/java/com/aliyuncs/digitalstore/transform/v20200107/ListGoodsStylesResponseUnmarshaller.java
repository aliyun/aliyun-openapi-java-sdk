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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.ListGoodsStylesResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListGoodsStylesResponse.GoodsStyleModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGoodsStylesResponseUnmarshaller {

	public static ListGoodsStylesResponse unmarshall(ListGoodsStylesResponse listGoodsStylesResponse, UnmarshallerContext _ctx) {
		
		listGoodsStylesResponse.setRequestId(_ctx.stringValue("ListGoodsStylesResponse.RequestId"));
		listGoodsStylesResponse.setPageSize(_ctx.integerValue("ListGoodsStylesResponse.PageSize"));
		listGoodsStylesResponse.setPageNumber(_ctx.integerValue("ListGoodsStylesResponse.PageNumber"));
		listGoodsStylesResponse.setSuccess(_ctx.booleanValue("ListGoodsStylesResponse.Success"));
		listGoodsStylesResponse.setTotalCount(_ctx.integerValue("ListGoodsStylesResponse.TotalCount"));

		List<GoodsStyleModel> goodsStyles = new ArrayList<GoodsStyleModel>();
		for (int i = 0; i < _ctx.lengthValue("ListGoodsStylesResponse.GoodsStyles.Length"); i++) {
			GoodsStyleModel goodsStyleModel = new GoodsStyleModel();
			goodsStyleModel.setSizeGroupName(_ctx.stringValue("ListGoodsStylesResponse.GoodsStyles["+ i +"].SizeGroupName"));
			goodsStyleModel.setDisable(_ctx.integerValue("ListGoodsStylesResponse.GoodsStyles["+ i +"].Disable"));
			goodsStyleModel.setName(_ctx.stringValue("ListGoodsStylesResponse.GoodsStyles["+ i +"].Name"));
			goodsStyleModel.setSizeGroupCode(_ctx.stringValue("ListGoodsStylesResponse.GoodsStyles["+ i +"].SizeGroupCode"));
			goodsStyleModel.setRetailPrice(_ctx.floatValue("ListGoodsStylesResponse.GoodsStyles["+ i +"].RetailPrice"));
			goodsStyleModel.setSizeGroupId(_ctx.stringValue("ListGoodsStylesResponse.GoodsStyles["+ i +"].SizeGroupId"));
			goodsStyleModel.setCode(_ctx.stringValue("ListGoodsStylesResponse.GoodsStyles["+ i +"].Code"));
			goodsStyleModel.setUpdateDate(_ctx.stringValue("ListGoodsStylesResponse.GoodsStyles["+ i +"].UpdateDate"));
			goodsStyleModel.setUseSkuColor(_ctx.integerValue("ListGoodsStylesResponse.GoodsStyles["+ i +"].UseSkuColor"));
			goodsStyleModel.setDescription(_ctx.stringValue("ListGoodsStylesResponse.GoodsStyles["+ i +"].Description"));
			goodsStyleModel.setCurrentPrice(_ctx.floatValue("ListGoodsStylesResponse.GoodsStyles["+ i +"].CurrentPrice"));
			goodsStyleModel.setUseSkuSize(_ctx.integerValue("ListGoodsStylesResponse.GoodsStyles["+ i +"].UseSkuSize"));
			goodsStyleModel.setCreateDate(_ctx.stringValue("ListGoodsStylesResponse.GoodsStyles["+ i +"].CreateDate"));
			goodsStyleModel.setStyleId(_ctx.stringValue("ListGoodsStylesResponse.GoodsStyles["+ i +"].StyleId"));

			goodsStyles.add(goodsStyleModel);
		}
		listGoodsStylesResponse.setGoodsStyles(goodsStyles);
	 
	 	return listGoodsStylesResponse;
	}
}