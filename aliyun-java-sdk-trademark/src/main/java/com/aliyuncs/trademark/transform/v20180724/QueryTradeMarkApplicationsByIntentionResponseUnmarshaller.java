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

import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationsByIntentionResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationsByIntentionResponse.TmProduces;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationsByIntentionResponse.TmProduces.FirstClassification;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationsByIntentionResponse.TmProduces.ThirdClassifications;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTradeMarkApplicationsByIntentionResponseUnmarshaller {

	public static QueryTradeMarkApplicationsByIntentionResponse unmarshall(QueryTradeMarkApplicationsByIntentionResponse queryTradeMarkApplicationsByIntentionResponse, UnmarshallerContext _ctx) {
		
		queryTradeMarkApplicationsByIntentionResponse.setRequestId(_ctx.stringValue("QueryTradeMarkApplicationsByIntentionResponse.RequestId"));
		queryTradeMarkApplicationsByIntentionResponse.setCurrentPageNum(_ctx.integerValue("QueryTradeMarkApplicationsByIntentionResponse.CurrentPageNum"));
		queryTradeMarkApplicationsByIntentionResponse.setTotalPageNum(_ctx.integerValue("QueryTradeMarkApplicationsByIntentionResponse.TotalPageNum"));
		queryTradeMarkApplicationsByIntentionResponse.setPageSize(_ctx.integerValue("QueryTradeMarkApplicationsByIntentionResponse.PageSize"));
		queryTradeMarkApplicationsByIntentionResponse.setTotalItemNum(_ctx.integerValue("QueryTradeMarkApplicationsByIntentionResponse.TotalItemNum"));

		List<TmProduces> data = new ArrayList<TmProduces>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeMarkApplicationsByIntentionResponse.Data.Length"); i++) {
			TmProduces tmProduces = new TmProduces();
			tmProduces.setPrincipalDescription(_ctx.stringValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].PrincipalDescription"));
			tmProduces.setType(_ctx.integerValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].Type"));
			tmProduces.setStatus(_ctx.integerValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].Status"));
			tmProduces.setOrderPrice(_ctx.floatValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].OrderPrice"));
			tmProduces.setUpdateTime(_ctx.longValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].UpdateTime"));
			tmProduces.setMaterialName(_ctx.stringValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].MaterialName"));
			tmProduces.setPrincipalValue(_ctx.integerValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].PrincipalValue"));
			tmProduces.setCreateTime(_ctx.longValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].CreateTime"));
			tmProduces.setBizId(_ctx.stringValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].BizId"));
			tmProduces.setServicePrice(_ctx.floatValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].ServicePrice"));
			tmProduces.setTmIcon(_ctx.stringValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].TmIcon"));
			tmProduces.setTmName(_ctx.stringValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].TmName"));
			tmProduces.setMaterialId(_ctx.stringValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].MaterialId"));
			tmProduces.setSupplementId(_ctx.longValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].SupplementId"));
			tmProduces.setLoaUrl(_ctx.stringValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].LoaUrl"));
			tmProduces.setTmNumber(_ctx.stringValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].TmNumber"));
			tmProduces.setNote(_ctx.stringValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].Note"));
			tmProduces.setSupplementStatus(_ctx.integerValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].SupplementStatus"));
			tmProduces.setTotalPrice(_ctx.floatValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].TotalPrice"));

			FirstClassification firstClassification = new FirstClassification();
			firstClassification.setClassificationName(_ctx.stringValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].FirstClassification.ClassificationName"));
			firstClassification.setClassificationCode(_ctx.stringValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].FirstClassification.ClassificationCode"));
			tmProduces.setFirstClassification(firstClassification);

			List<ThirdClassifications> thirdClassification = new ArrayList<ThirdClassifications>();
			for (int j = 0; j < _ctx.lengthValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].ThirdClassification.Length"); j++) {
				ThirdClassifications thirdClassifications = new ThirdClassifications();
				thirdClassifications.setClassificationName(_ctx.stringValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].ThirdClassification["+ j +"].ClassificationName"));
				thirdClassifications.setClassificationCode(_ctx.stringValue("QueryTradeMarkApplicationsByIntentionResponse.Data["+ i +"].ThirdClassification["+ j +"].ClassificationCode"));

				thirdClassification.add(thirdClassifications);
			}
			tmProduces.setThirdClassification(thirdClassification);

			data.add(tmProduces);
		}
		queryTradeMarkApplicationsByIntentionResponse.setData(data);
	 
	 	return queryTradeMarkApplicationsByIntentionResponse;
	}
}