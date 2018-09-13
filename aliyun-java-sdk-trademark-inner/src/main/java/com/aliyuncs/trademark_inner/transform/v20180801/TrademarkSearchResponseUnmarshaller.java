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

package com.aliyuncs.trademark_inner.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark_inner.model.v20180801.TrademarkSearchResponse;
import com.aliyuncs.trademark_inner.model.v20180801.TrademarkSearchResponse.Trademark;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class TrademarkSearchResponseUnmarshaller {

	public static TrademarkSearchResponse unmarshall(TrademarkSearchResponse trademarkSearchResponse, UnmarshallerContext context) {
		
		trademarkSearchResponse.setRequestId(context.stringValue("TrademarkSearchResponse.RequestId"));
		trademarkSearchResponse.setTotalItemNum(context.integerValue("TrademarkSearchResponse.TotalItemNum"));
		trademarkSearchResponse.setCurrentPageNum(context.integerValue("TrademarkSearchResponse.CurrentPageNum"));
		trademarkSearchResponse.setPageSize(context.integerValue("TrademarkSearchResponse.PageSize"));
		trademarkSearchResponse.setTotalPageNum(context.integerValue("TrademarkSearchResponse.TotalPageNum"));
		trademarkSearchResponse.setPrePage(context.booleanValue("TrademarkSearchResponse.PrePage"));
		trademarkSearchResponse.setNextPage(context.booleanValue("TrademarkSearchResponse.NextPage"));

		List<Trademark> data = new ArrayList<Trademark>();
		for (int i = 0; i < context.lengthValue("TrademarkSearchResponse.Data.Length"); i++) {
			Trademark trademark = new Trademark();
			trademark.setId(context.longValue("TrademarkSearchResponse.Data["+ i +"].Id"));
			trademark.setUid(context.stringValue("TrademarkSearchResponse.Data["+ i +"].Uid"));
			trademark.setName(context.stringValue("TrademarkSearchResponse.Data["+ i +"].Name"));
			trademark.setRegistrationNumber(context.stringValue("TrademarkSearchResponse.Data["+ i +"].RegistrationNumber"));
			trademark.setClassification(context.stringValue("TrademarkSearchResponse.Data["+ i +"].Classification"));
			trademark.setApplyDate(context.stringValue("TrademarkSearchResponse.Data["+ i +"].ApplyDate"));
			trademark.setOwnerName(context.stringValue("TrademarkSearchResponse.Data["+ i +"].OwnerName"));
			trademark.setOwnerEnName(context.stringValue("TrademarkSearchResponse.Data["+ i +"].OwnerEnName"));
			trademark.setImage(context.stringValue("TrademarkSearchResponse.Data["+ i +"].Image"));
			trademark.setProduct(context.stringValue("TrademarkSearchResponse.Data["+ i +"].Product"));
			trademark.setPreAnnNum(context.stringValue("TrademarkSearchResponse.Data["+ i +"].PreAnnNum"));
			trademark.setRegAnnNum(context.stringValue("TrademarkSearchResponse.Data["+ i +"].RegAnnNum"));
			trademark.setPreAnnDate(context.stringValue("TrademarkSearchResponse.Data["+ i +"].PreAnnDate"));
			trademark.setRegAnnDate(context.stringValue("TrademarkSearchResponse.Data["+ i +"].RegAnnDate"));
			trademark.setStatus(context.integerValue("TrademarkSearchResponse.Data["+ i +"].Status"));
			trademark.setLastProcedureStatus(context.stringValue("TrademarkSearchResponse.Data["+ i +"].LastProcedureStatus"));

			data.add(trademark);
		}
		trademarkSearchResponse.setData(data);
	 
	 	return trademarkSearchResponse;
	}
}