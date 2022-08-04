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

import com.aliyuncs.trademark.model.v20180724.QueryProduceListResponse;
import com.aliyuncs.trademark.model.v20180724.QueryProduceListResponse.TmProduces;
import com.aliyuncs.trademark.model.v20180724.QueryProduceListResponse.TmProduces.Classification;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProduceListResponseUnmarshaller {

	public static QueryProduceListResponse unmarshall(QueryProduceListResponse queryProduceListResponse, UnmarshallerContext _ctx) {
		
		queryProduceListResponse.setRequestId(_ctx.stringValue("QueryProduceListResponse.RequestId"));
		queryProduceListResponse.setNextPage(_ctx.booleanValue("QueryProduceListResponse.NextPage"));
		queryProduceListResponse.setTotalItemNum(_ctx.integerValue("QueryProduceListResponse.TotalItemNum"));
		queryProduceListResponse.setPrePage(_ctx.booleanValue("QueryProduceListResponse.PrePage"));
		queryProduceListResponse.setCurrentPageNum(_ctx.integerValue("QueryProduceListResponse.CurrentPageNum"));
		queryProduceListResponse.setPageSize(_ctx.integerValue("QueryProduceListResponse.PageSize"));
		queryProduceListResponse.setTotalPageNum(_ctx.integerValue("QueryProduceListResponse.TotalPageNum"));

		List<TmProduces> data = new ArrayList<TmProduces>();
		for (int i = 0; i < _ctx.lengthValue("QueryProduceListResponse.Data.Length"); i++) {
			TmProduces tmProduces = new TmProduces();
			tmProduces.setStatus(_ctx.integerValue("QueryProduceListResponse.Data["+ i +"].Status"));
			tmProduces.setType(_ctx.integerValue("QueryProduceListResponse.Data["+ i +"].Type"));
			tmProduces.setOrderPrice(_ctx.floatValue("QueryProduceListResponse.Data["+ i +"].OrderPrice"));
			tmProduces.setUpdateTime(_ctx.longValue("QueryProduceListResponse.Data["+ i +"].UpdateTime"));
			tmProduces.setMaterialName(_ctx.stringValue("QueryProduceListResponse.Data["+ i +"].MaterialName"));
			tmProduces.setCreateTime(_ctx.longValue("QueryProduceListResponse.Data["+ i +"].CreateTime"));
			tmProduces.setUserId(_ctx.stringValue("QueryProduceListResponse.Data["+ i +"].UserId"));
			tmProduces.setReceiptUrl(_ctx.stringValue("QueryProduceListResponse.Data["+ i +"].ReceiptUrl"));
			tmProduces.setBizId(_ctx.stringValue("QueryProduceListResponse.Data["+ i +"].BizId"));
			tmProduces.setTmIcon(_ctx.stringValue("QueryProduceListResponse.Data["+ i +"].TmIcon"));
			tmProduces.setTmName(_ctx.stringValue("QueryProduceListResponse.Data["+ i +"].TmName"));
			tmProduces.setLoaUrl(_ctx.stringValue("QueryProduceListResponse.Data["+ i +"].LoaUrl"));
			tmProduces.setNote(_ctx.stringValue("QueryProduceListResponse.Data["+ i +"].Note"));
			tmProduces.setTmNumber(_ctx.stringValue("QueryProduceListResponse.Data["+ i +"].TmNumber"));
			tmProduces.setPrincipalName(_ctx.integerValue("QueryProduceListResponse.Data["+ i +"].PrincipalName"));
			tmProduces.setSubmitCount(_ctx.integerValue("QueryProduceListResponse.Data["+ i +"].SubmitCount"));
			tmProduces.setOrderId(_ctx.stringValue("QueryProduceListResponse.Data["+ i +"].OrderId"));

			Classification classification = new Classification();
			classification.setClassificationName(_ctx.stringValue("QueryProduceListResponse.Data["+ i +"].Classification.ClassificationName"));
			classification.setClassificationCode(_ctx.stringValue("QueryProduceListResponse.Data["+ i +"].Classification.ClassificationCode"));
			tmProduces.setClassification(classification);

			data.add(tmProduces);
		}
		queryProduceListResponse.setData(data);
	 
	 	return queryProduceListResponse;
	}
}