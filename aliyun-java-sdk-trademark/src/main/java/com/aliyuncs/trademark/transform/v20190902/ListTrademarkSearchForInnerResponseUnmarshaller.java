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

package com.aliyuncs.trademark.transform.v20190902;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20190902.ListTrademarkSearchForInnerResponse;
import com.aliyuncs.trademark.model.v20190902.ListTrademarkSearchForInnerResponse.TrademarkSearchContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrademarkSearchForInnerResponseUnmarshaller {

	public static ListTrademarkSearchForInnerResponse unmarshall(ListTrademarkSearchForInnerResponse listTrademarkSearchForInnerResponse, UnmarshallerContext _ctx) {
		
		listTrademarkSearchForInnerResponse.setRequestId(_ctx.stringValue("ListTrademarkSearchForInnerResponse.RequestId"));
		listTrademarkSearchForInnerResponse.setPageSize(_ctx.stringValue("ListTrademarkSearchForInnerResponse.PageSize"));
		listTrademarkSearchForInnerResponse.setPageNumber(_ctx.stringValue("ListTrademarkSearchForInnerResponse.PageNumber"));
		listTrademarkSearchForInnerResponse.setTotalCount(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TotalCount"));

		List<String> products = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListTrademarkSearchForInnerResponse.Products.Length"); i++) {
			products.add(_ctx.stringValue("ListTrademarkSearchForInnerResponse.Products["+ i +"]"));
		}
		listTrademarkSearchForInnerResponse.setProducts(products);

		List<TrademarkSearchContent> trademarkSearchContents = new ArrayList<TrademarkSearchContent>();
		for (int i = 0; i < _ctx.lengthValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents.Length"); i++) {
			TrademarkSearchContent trademarkSearchContent = new TrademarkSearchContent();
			trademarkSearchContent.setOwnerAddress(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].OwnerAddress"));
			trademarkSearchContent.setPreAnnDate(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].PreAnnDate"));
			trademarkSearchContent.setNameSort(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].NameSort"));
			trademarkSearchContent.setPreAnnNum(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].PreAnnNum"));
			trademarkSearchContent.setShare(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].Share"));
			trademarkSearchContent.setOwnerEnName(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].OwnerEnName"));
			trademarkSearchContent.setNameCharSection(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].NameCharSection"));
			trademarkSearchContent.setRegistrationNumber(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].RegistrationNumber"));
			trademarkSearchContent.setOwnerEnAddress(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].OwnerEnAddress"));
			trademarkSearchContent.setNameSimplifiedChinese(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].NameSimplifiedChinese"));
			trademarkSearchContent.setName(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].Name"));
			trademarkSearchContent.setClassification(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].Classification"));
			trademarkSearchContent.setNameOrigin(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].NameOrigin"));
			trademarkSearchContent.setApplyDate(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].ApplyDate"));
			trademarkSearchContent.setUid(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].Uid"));
			trademarkSearchContent.setProductDescription(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].ProductDescription"));
			trademarkSearchContent.setWellKnow(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].WellKnow"));
			trademarkSearchContent.setImage(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].Image"));
			trademarkSearchContent.setProduct(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].Product"));
			trademarkSearchContent.setOwnerName(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].OwnerName"));
			trademarkSearchContent.setOnSale(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].OnSale"));
			trademarkSearchContent.setExclusiveDateLimit(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].ExclusiveDateLimit"));
			trademarkSearchContent.setLastProcedureStatus(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].LastProcedureStatus"));
			trademarkSearchContent.setRegAnnNum(_ctx.stringValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].RegAnnNum"));
			trademarkSearchContent.setId(_ctx.longValue("ListTrademarkSearchForInnerResponse.TrademarkSearchContents["+ i +"].Id"));

			trademarkSearchContents.add(trademarkSearchContent);
		}
		listTrademarkSearchForInnerResponse.setTrademarkSearchContents(trademarkSearchContents);
	 
	 	return listTrademarkSearchForInnerResponse;
	}
}