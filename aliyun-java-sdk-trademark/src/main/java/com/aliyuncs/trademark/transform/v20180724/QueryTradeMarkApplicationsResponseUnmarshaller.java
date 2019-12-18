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

import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationsResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationsResponse.TmProduces;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationsResponse.TmProduces.FirstClassification;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationsResponse.TmProduces.RenewResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationsResponse.TmProduces.ThirdClassifications;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTradeMarkApplicationsResponseUnmarshaller {

	public static QueryTradeMarkApplicationsResponse unmarshall(QueryTradeMarkApplicationsResponse queryTradeMarkApplicationsResponse, UnmarshallerContext _ctx) {
		
		queryTradeMarkApplicationsResponse.setRequestId(_ctx.stringValue("QueryTradeMarkApplicationsResponse.RequestId"));
		queryTradeMarkApplicationsResponse.setTotalItemNum(_ctx.integerValue("QueryTradeMarkApplicationsResponse.TotalItemNum"));
		queryTradeMarkApplicationsResponse.setCurrentPageNum(_ctx.integerValue("QueryTradeMarkApplicationsResponse.CurrentPageNum"));
		queryTradeMarkApplicationsResponse.setPageSize(_ctx.integerValue("QueryTradeMarkApplicationsResponse.PageSize"));
		queryTradeMarkApplicationsResponse.setTotalPageNum(_ctx.integerValue("QueryTradeMarkApplicationsResponse.TotalPageNum"));

		List<TmProduces> data = new ArrayList<TmProduces>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeMarkApplicationsResponse.Data.Length"); i++) {
			TmProduces tmProduces = new TmProduces();
			tmProduces.setBizId(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].BizId"));
			tmProduces.setOrderId(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].OrderId"));
			tmProduces.setMaterialName(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].MaterialName"));
			tmProduces.setTmIcon(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].TmIcon"));
			tmProduces.setTmName(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].TmName"));
			tmProduces.setTmNumber(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].TmNumber"));
			tmProduces.setCreateTime(_ctx.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].CreateTime"));
			tmProduces.setType(_ctx.integerValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Type"));
			tmProduces.setStatus(_ctx.integerValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Status"));
			tmProduces.setUserId(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].UserId"));
			tmProduces.setOrderPrice(_ctx.floatValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].OrderPrice"));
			tmProduces.setMaterialId(_ctx.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].MaterialId"));
			tmProduces.setLoaUrl(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].LoaUrl"));
			tmProduces.setNote(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Note"));
			tmProduces.setUpdateTime(_ctx.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].UpdateTime"));
			tmProduces.setSupplementStatus(_ctx.integerValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].SupplementStatus"));
			tmProduces.setSupplementId(_ctx.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].SupplementId"));
			tmProduces.setTotalPrice(_ctx.floatValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].TotalPrice"));
			tmProduces.setServicePrice(_ctx.floatValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].ServicePrice"));

			List<String> flags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Flags.Length"); j++) {
				flags.add(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Flags["+ j +"]"));
			}
			tmProduces.setFlags(flags);

			FirstClassification firstClassification = new FirstClassification();
			firstClassification.setClassificationCode(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].FirstClassification.ClassificationCode"));
			firstClassification.setClassificationName(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].FirstClassification.ClassificationName"));
			tmProduces.setFirstClassification(firstClassification);

			RenewResponse renewResponse = new RenewResponse();
			renewResponse.setName(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.Name"));
			renewResponse.setEngName(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.EngName"));
			renewResponse.setAddress(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.Address"));
			renewResponse.setEngAddress(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.EngAddress"));
			renewResponse.setRegisterTime(_ctx.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.RegisterTime"));
			renewResponse.setSubmitSbjtime(_ctx.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.SubmitSbjtime"));
			tmProduces.setRenewResponse(renewResponse);

			List<ThirdClassifications> thirdClassification = new ArrayList<ThirdClassifications>();
			for (int j = 0; j < _ctx.lengthValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].ThirdClassification.Length"); j++) {
				ThirdClassifications thirdClassifications = new ThirdClassifications();
				thirdClassifications.setClassificationCode(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].ThirdClassification["+ j +"].ClassificationCode"));
				thirdClassifications.setClassificationName(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].ThirdClassification["+ j +"].ClassificationName"));

				thirdClassification.add(thirdClassifications);
			}
			tmProduces.setThirdClassification(thirdClassification);

			data.add(tmProduces);
		}
		queryTradeMarkApplicationsResponse.setData(data);
	 
	 	return queryTradeMarkApplicationsResponse;
	}
}