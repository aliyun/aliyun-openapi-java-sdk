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

import com.aliyuncs.trademark_inner.model.v20180801.QueryProduceListResponse;
import com.aliyuncs.trademark_inner.model.v20180801.QueryProduceListResponse.TmProduces;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProduceListResponseUnmarshaller {

	public static QueryProduceListResponse unmarshall(QueryProduceListResponse queryProduceListResponse, UnmarshallerContext context) {
		
		queryProduceListResponse.setRequestId(context.stringValue("QueryProduceListResponse.RequestId"));
		queryProduceListResponse.setTotalItemNum(context.integerValue("QueryProduceListResponse.TotalItemNum"));
		queryProduceListResponse.setCurrentPageNum(context.integerValue("QueryProduceListResponse.CurrentPageNum"));
		queryProduceListResponse.setPageSize(context.integerValue("QueryProduceListResponse.PageSize"));
		queryProduceListResponse.setTotalPageNum(context.integerValue("QueryProduceListResponse.TotalPageNum"));
		queryProduceListResponse.setPrePage(context.booleanValue("QueryProduceListResponse.PrePage"));
		queryProduceListResponse.setNextPage(context.booleanValue("QueryProduceListResponse.NextPage"));

		List<TmProduces> data = new ArrayList<TmProduces>();
		for (int i = 0; i < context.lengthValue("QueryProduceListResponse.Data.Length"); i++) {
			TmProduces tmProduces = new TmProduces();
			tmProduces.setBizId(context.stringValue("QueryProduceListResponse.Data["+ i +"].BizId"));
			tmProduces.setOrderId(context.stringValue("QueryProduceListResponse.Data["+ i +"].OrderId"));
			tmProduces.setMaterialName(context.stringValue("QueryProduceListResponse.Data["+ i +"].MaterialName"));
			tmProduces.setTmIcon(context.stringValue("QueryProduceListResponse.Data["+ i +"].TmIcon"));
			tmProduces.setTmName(context.stringValue("QueryProduceListResponse.Data["+ i +"].TmName"));
			tmProduces.setTmNumber(context.stringValue("QueryProduceListResponse.Data["+ i +"].TmNumber"));
			tmProduces.setCreateTime(context.longValue("QueryProduceListResponse.Data["+ i +"].CreateTime"));
			tmProduces.setType(context.integerValue("QueryProduceListResponse.Data["+ i +"].Type"));
			tmProduces.setStatus(context.integerValue("QueryProduceListResponse.Data["+ i +"].Status"));
			tmProduces.setUserId(context.stringValue("QueryProduceListResponse.Data["+ i +"].UserId"));
			tmProduces.setOrderPrice(context.floatValue("QueryProduceListResponse.Data["+ i +"].OrderPrice"));
			tmProduces.setLoaUrl(context.stringValue("QueryProduceListResponse.Data["+ i +"].LoaUrl"));
			tmProduces.setReceiptUrl(context.stringValue("QueryProduceListResponse.Data["+ i +"].ReceiptUrl"));
			tmProduces.setNote(context.stringValue("QueryProduceListResponse.Data["+ i +"].Note"));
			tmProduces.setSubmitCount(context.integerValue("QueryProduceListResponse.Data["+ i +"].SubmitCount"));

			data.add(tmProduces);
		}
		queryProduceListResponse.setData(data);
	 
	 	return queryProduceListResponse;
	}
}