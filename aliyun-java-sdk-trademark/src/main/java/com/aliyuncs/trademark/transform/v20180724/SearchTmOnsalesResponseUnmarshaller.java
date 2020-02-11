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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.SearchTmOnsalesResponse;
import com.aliyuncs.trademark.model.v20180724.SearchTmOnsalesResponse.Trademark;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTmOnsalesResponseUnmarshaller {

	public static SearchTmOnsalesResponse unmarshall(SearchTmOnsalesResponse searchTmOnsalesResponse, UnmarshallerContext _ctx) {
		
		searchTmOnsalesResponse.setRequestId(_ctx.stringValue("SearchTmOnsalesResponse.RequestId"));
		searchTmOnsalesResponse.setTotalCount(_ctx.integerValue("SearchTmOnsalesResponse.TotalCount"));
		searchTmOnsalesResponse.setPageNumber(_ctx.integerValue("SearchTmOnsalesResponse.PageNumber"));
		searchTmOnsalesResponse.setPageSize(_ctx.integerValue("SearchTmOnsalesResponse.PageSize"));
		searchTmOnsalesResponse.setTotalPageNumber(_ctx.integerValue("SearchTmOnsalesResponse.TotalPageNumber"));

		List<Trademark> trademarks = new ArrayList<Trademark>();
		for (int i = 0; i < _ctx.lengthValue("SearchTmOnsalesResponse.Trademarks.Length"); i++) {
			Trademark trademark = new Trademark();
			trademark.setUid(_ctx.stringValue("SearchTmOnsalesResponse.Trademarks["+ i +"].Uid"));
			trademark.setTrademarkName(_ctx.stringValue("SearchTmOnsalesResponse.Trademarks["+ i +"].TrademarkName"));
			trademark.setRegistrationNumber(_ctx.stringValue("SearchTmOnsalesResponse.Trademarks["+ i +"].RegistrationNumber"));
			trademark.setClassification(_ctx.stringValue("SearchTmOnsalesResponse.Trademarks["+ i +"].Classification"));
			trademark.setIcon(_ctx.stringValue("SearchTmOnsalesResponse.Trademarks["+ i +"].Icon"));
			trademark.setProductCode(_ctx.stringValue("SearchTmOnsalesResponse.Trademarks["+ i +"].ProductCode"));
			trademark.setOrderPrice(_ctx.longValue("SearchTmOnsalesResponse.Trademarks["+ i +"].OrderPrice"));
			trademark.setProductDesc(_ctx.stringValue("SearchTmOnsalesResponse.Trademarks["+ i +"].ProductDesc"));
			trademark.setPartnerCode(_ctx.stringValue("SearchTmOnsalesResponse.Trademarks["+ i +"].PartnerCode"));
			trademark.setStatus(_ctx.longValue("SearchTmOnsalesResponse.Trademarks["+ i +"].Status"));

			trademarks.add(trademark);
		}
		searchTmOnsalesResponse.setTrademarks(trademarks);
	 
	 	return searchTmOnsalesResponse;
	}
}