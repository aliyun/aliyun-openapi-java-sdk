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

import com.aliyuncs.trademark.model.v20180724.QueryTrademarkUploadAuditResultResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkUploadAuditResultResponse.Trademark;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTrademarkUploadAuditResultResponseUnmarshaller {

	public static QueryTrademarkUploadAuditResultResponse unmarshall(QueryTrademarkUploadAuditResultResponse queryTrademarkUploadAuditResultResponse, UnmarshallerContext _ctx) {
		
		queryTrademarkUploadAuditResultResponse.setRequestId(_ctx.stringValue("QueryTrademarkUploadAuditResultResponse.RequestId"));
		queryTrademarkUploadAuditResultResponse.setPageSize(_ctx.integerValue("QueryTrademarkUploadAuditResultResponse.PageSize"));
		queryTrademarkUploadAuditResultResponse.setPageNumber(_ctx.integerValue("QueryTrademarkUploadAuditResultResponse.PageNumber"));
		queryTrademarkUploadAuditResultResponse.setTotalPageNumber(_ctx.integerValue("QueryTrademarkUploadAuditResultResponse.TotalPageNumber"));
		queryTrademarkUploadAuditResultResponse.setTotalCount(_ctx.integerValue("QueryTrademarkUploadAuditResultResponse.TotalCount"));

		List<Trademark> trademarks = new ArrayList<Trademark>();
		for (int i = 0; i < _ctx.lengthValue("QueryTrademarkUploadAuditResultResponse.Trademarks.Length"); i++) {
			Trademark trademark = new Trademark();
			trademark.setTrademarkName(_ctx.stringValue("QueryTrademarkUploadAuditResultResponse.Trademarks["+ i +"].TrademarkName"));
			trademark.setStatus(_ctx.longValue("QueryTrademarkUploadAuditResultResponse.Trademarks["+ i +"].Status"));
			trademark.setRegistrationNumber(_ctx.stringValue("QueryTrademarkUploadAuditResultResponse.Trademarks["+ i +"].RegistrationNumber"));
			trademark.setIcon(_ctx.stringValue("QueryTrademarkUploadAuditResultResponse.Trademarks["+ i +"].Icon"));
			trademark.setClassification(_ctx.stringValue("QueryTrademarkUploadAuditResultResponse.Trademarks["+ i +"].Classification"));
			trademark.setOrderPrice(_ctx.stringValue("QueryTrademarkUploadAuditResultResponse.Trademarks["+ i +"].OrderPrice"));
			trademark.setTmType(_ctx.stringValue("QueryTrademarkUploadAuditResultResponse.Trademarks["+ i +"].TmType"));
			trademark.setAuditResult(_ctx.stringValue("QueryTrademarkUploadAuditResultResponse.Trademarks["+ i +"].AuditResult"));

			trademarks.add(trademark);
		}
		queryTrademarkUploadAuditResultResponse.setTrademarks(trademarks);
	 
	 	return queryTrademarkUploadAuditResultResponse;
	}
}