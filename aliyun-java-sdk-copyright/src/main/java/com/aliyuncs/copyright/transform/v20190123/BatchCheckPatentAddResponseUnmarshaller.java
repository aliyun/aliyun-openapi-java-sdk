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

import com.aliyuncs.copyright.model.v20190123.BatchCheckPatentAddResponse;
import com.aliyuncs.copyright.model.v20190123.BatchCheckPatentAddResponse.ErrorDetailItem;
import com.aliyuncs.copyright.model.v20190123.BatchCheckPatentAddResponse.TradeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCheckPatentAddResponseUnmarshaller {

	public static BatchCheckPatentAddResponse unmarshall(BatchCheckPatentAddResponse batchCheckPatentAddResponse, UnmarshallerContext _ctx) {
		
		batchCheckPatentAddResponse.setRequestId(_ctx.stringValue("BatchCheckPatentAddResponse.RequestId"));
		batchCheckPatentAddResponse.setCacheKey(_ctx.stringValue("BatchCheckPatentAddResponse.CacheKey"));
		batchCheckPatentAddResponse.setCanAddCount(_ctx.integerValue("BatchCheckPatentAddResponse.CanAddCount"));
		batchCheckPatentAddResponse.setExistCount(_ctx.integerValue("BatchCheckPatentAddResponse.ExistCount"));
		batchCheckPatentAddResponse.setSuccess(_ctx.booleanValue("BatchCheckPatentAddResponse.Success"));
		batchCheckPatentAddResponse.setTotalCount(_ctx.integerValue("BatchCheckPatentAddResponse.TotalCount"));

		List<ErrorDetailItem> errorDetail = new ArrayList<ErrorDetailItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckPatentAddResponse.ErrorDetail.Length"); i++) {
			ErrorDetailItem errorDetailItem = new ErrorDetailItem();
			errorDetailItem.setApplyNumber(_ctx.stringValue("BatchCheckPatentAddResponse.ErrorDetail["+ i +"].ApplyNumber"));
			errorDetailItem.setMessage(_ctx.stringValue("BatchCheckPatentAddResponse.ErrorDetail["+ i +"].Message"));
			errorDetailItem.setSuccess(_ctx.booleanValue("BatchCheckPatentAddResponse.ErrorDetail["+ i +"].Success"));

			errorDetail.add(errorDetailItem);
		}
		batchCheckPatentAddResponse.setErrorDetail(errorDetail);

		List<TradeListItem> tradeList = new ArrayList<TradeListItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckPatentAddResponse.TradeList.Length"); i++) {
			TradeListItem tradeListItem = new TradeListItem();
			tradeListItem.setAge(_ctx.stringValue("BatchCheckPatentAddResponse.TradeList["+ i +"].Age"));
			tradeListItem.setDiscount(_ctx.stringValue("BatchCheckPatentAddResponse.TradeList["+ i +"].Discount"));
			tradeListItem.setExistCount(_ctx.longValue("BatchCheckPatentAddResponse.TradeList["+ i +"].ExistCount"));
			tradeListItem.setNeedCount(_ctx.integerValue("BatchCheckPatentAddResponse.TradeList["+ i +"].NeedCount"));
			tradeListItem.setNeedFee(_ctx.floatValue("BatchCheckPatentAddResponse.TradeList["+ i +"].NeedFee"));
			tradeListItem.setTotalCount(_ctx.longValue("BatchCheckPatentAddResponse.TradeList["+ i +"].TotalCount"));
			tradeListItem.setType(_ctx.stringValue("BatchCheckPatentAddResponse.TradeList["+ i +"].Type"));
			tradeListItem.setOverduePenalty(_ctx.stringValue("BatchCheckPatentAddResponse.TradeList["+ i +"].OverduePenalty"));

			tradeList.add(tradeListItem);
		}
		batchCheckPatentAddResponse.setTradeList(tradeList);
	 
	 	return batchCheckPatentAddResponse;
	}
}