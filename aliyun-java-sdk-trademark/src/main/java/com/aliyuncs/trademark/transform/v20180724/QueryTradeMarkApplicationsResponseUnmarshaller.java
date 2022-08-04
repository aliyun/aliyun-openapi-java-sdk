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
		queryTradeMarkApplicationsResponse.setCurrentPageNum(_ctx.integerValue("QueryTradeMarkApplicationsResponse.CurrentPageNum"));
		queryTradeMarkApplicationsResponse.setTotalPageNum(_ctx.integerValue("QueryTradeMarkApplicationsResponse.TotalPageNum"));
		queryTradeMarkApplicationsResponse.setPageSize(_ctx.integerValue("QueryTradeMarkApplicationsResponse.PageSize"));
		queryTradeMarkApplicationsResponse.setTotalItemNum(_ctx.integerValue("QueryTradeMarkApplicationsResponse.TotalItemNum"));

		List<TmProduces> data = new ArrayList<TmProduces>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeMarkApplicationsResponse.Data.Length"); i++) {
			TmProduces tmProduces = new TmProduces();
			tmProduces.setType(_ctx.integerValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Type"));
			tmProduces.setStatus(_ctx.integerValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Status"));
			tmProduces.setOrderPrice(_ctx.floatValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].OrderPrice"));
			tmProduces.setSubmitAuditTime(_ctx.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].SubmitAuditTime"));
			tmProduces.setUpdateTime(_ctx.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].UpdateTime"));
			tmProduces.setMaterialName(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].MaterialName"));
			tmProduces.setRemark(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Remark"));
			tmProduces.setCreateTime(_ctx.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].CreateTime"));
			tmProduces.setUserId(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].UserId"));
			tmProduces.setBizId(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].BizId"));
			tmProduces.setServicePrice(_ctx.floatValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].ServicePrice"));
			tmProduces.setTmIcon(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].TmIcon"));
			tmProduces.setTmName(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].TmName"));
			tmProduces.setMaterialId(_ctx.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].MaterialId"));
			tmProduces.setSupplementId(_ctx.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].SupplementId"));
			tmProduces.setLoaUrl(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].LoaUrl"));
			tmProduces.setTmNumber(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].TmNumber"));
			tmProduces.setNote(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Note"));
			tmProduces.setSupplementStatus(_ctx.integerValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].SupplementStatus"));
			tmProduces.setPrincipalName(_ctx.integerValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].PrincipalName"));
			tmProduces.setTotalPrice(_ctx.floatValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].TotalPrice"));
			tmProduces.setSubmitTime(_ctx.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].SubmitTime"));
			tmProduces.setOrderId(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].OrderId"));

			List<String> flags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Flags.Length"); j++) {
				flags.add(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].Flags["+ j +"]"));
			}
			tmProduces.setFlags(flags);

			FirstClassification firstClassification = new FirstClassification();
			firstClassification.setClassificationName(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].FirstClassification.ClassificationName"));
			firstClassification.setClassificationCode(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].FirstClassification.ClassificationCode"));
			tmProduces.setFirstClassification(firstClassification);

			RenewResponse renewResponse = new RenewResponse();
			renewResponse.setEngName(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.EngName"));
			renewResponse.setRegisterTime(_ctx.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.RegisterTime"));
			renewResponse.setEngAddress(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.EngAddress"));
			renewResponse.setAddress(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.Address"));
			renewResponse.setName(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.Name"));
			renewResponse.setSubmitSbjtime(_ctx.longValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].RenewResponse.SubmitSbjtime"));
			tmProduces.setRenewResponse(renewResponse);

			List<ThirdClassifications> thirdClassification = new ArrayList<ThirdClassifications>();
			for (int j = 0; j < _ctx.lengthValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].ThirdClassification.Length"); j++) {
				ThirdClassifications thirdClassifications = new ThirdClassifications();
				thirdClassifications.setClassificationName(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].ThirdClassification["+ j +"].ClassificationName"));
				thirdClassifications.setClassificationCode(_ctx.stringValue("QueryTradeMarkApplicationsResponse.Data["+ i +"].ThirdClassification["+ j +"].ClassificationCode"));

				thirdClassification.add(thirdClassifications);
			}
			tmProduces.setThirdClassification(thirdClassification);

			data.add(tmProduces);
		}
		queryTradeMarkApplicationsResponse.setData(data);
	 
	 	return queryTradeMarkApplicationsResponse;
	}
}