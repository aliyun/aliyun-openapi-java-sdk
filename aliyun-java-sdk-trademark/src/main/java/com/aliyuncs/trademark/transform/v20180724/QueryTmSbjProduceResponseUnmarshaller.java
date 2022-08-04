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

import com.aliyuncs.trademark.model.v20180724.QueryTmSbjProduceResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTmSbjProduceResponse.TmSbjProduceList;
import com.aliyuncs.trademark.model.v20180724.QueryTmSbjProduceResponse.TmSbjProduceList.Extend;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTmSbjProduceResponseUnmarshaller {

	public static QueryTmSbjProduceResponse unmarshall(QueryTmSbjProduceResponse queryTmSbjProduceResponse, UnmarshallerContext _ctx) {
		
		queryTmSbjProduceResponse.setRequestId(_ctx.stringValue("QueryTmSbjProduceResponse.RequestId"));

		List<TmSbjProduceList> moudle = new ArrayList<TmSbjProduceList>();
		for (int i = 0; i < _ctx.lengthValue("QueryTmSbjProduceResponse.Moudle.Length"); i++) {
			TmSbjProduceList tmSbjProduceList = new TmSbjProduceList();
			tmSbjProduceList.setBitFlag(_ctx.longValue("QueryTmSbjProduceResponse.Moudle["+ i +"].BitFlag"));
			tmSbjProduceList.setBizId(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].BizId"));
			tmSbjProduceList.setClassificationCode(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].ClassificationCode"));
			tmSbjProduceList.setDeleteFlag(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].DeleteFlag"));
			tmSbjProduceList.setEnv(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].Env"));
			tmSbjProduceList.setLoaId(_ctx.longValue("QueryTmSbjProduceResponse.Moudle["+ i +"].LoaId"));
			tmSbjProduceList.setMainOrderId(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].MainOrderId"));
			tmSbjProduceList.setMaterialId(_ctx.longValue("QueryTmSbjProduceResponse.Moudle["+ i +"].MaterialId"));
			tmSbjProduceList.setMaterialName(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].MaterialName"));
			tmSbjProduceList.setOrderId(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].OrderId"));
			tmSbjProduceList.setOrderPrice(_ctx.floatValue("QueryTmSbjProduceResponse.Moudle["+ i +"].OrderPrice"));
			tmSbjProduceList.setPrincipalKey(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].PrincipalKey"));
			tmSbjProduceList.setPrincipalName(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].PrincipalName"));
			tmSbjProduceList.setProductType(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].ProductType"));
			tmSbjProduceList.setRiskSource(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].RiskSource"));
			tmSbjProduceList.setStatus(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].Status"));
			tmSbjProduceList.setSubmitAuditTime(_ctx.longValue("QueryTmSbjProduceResponse.Moudle["+ i +"].SubmitAuditTime"));
			tmSbjProduceList.setSubmitStatus(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].SubmitStatus"));
			tmSbjProduceList.setSubmitTime(_ctx.longValue("QueryTmSbjProduceResponse.Moudle["+ i +"].SubmitTime"));
			tmSbjProduceList.setSubmitTimes(_ctx.longValue("QueryTmSbjProduceResponse.Moudle["+ i +"].SubmitTimes"));
			tmSbjProduceList.setTmCode(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].TmCode"));
			tmSbjProduceList.setTmIcon(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].TmIcon"));
			tmSbjProduceList.setTmName(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].TmName"));
			tmSbjProduceList.setType(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].Type"));
			tmSbjProduceList.setUserId(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].UserId"));

			Extend extend = new Extend();
			extend.setBid(_ctx.longValue("QueryTmSbjProduceResponse.Moudle["+ i +"].Extend.Bid"));
			extend.setBlackIcon(_ctx.booleanValue("QueryTmSbjProduceResponse.Moudle["+ i +"].Extend.BlackIcon"));
			extend.setLoaOssKey(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].Extend.LoaOssKey"));
			extend.setLogoGoodsId(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].Extend.LogoGoodsId"));
			extend.setMaterialId(_ctx.stringValue("QueryTmSbjProduceResponse.Moudle["+ i +"].Extend.MaterialId"));
			extend.setSubmitCount(_ctx.longValue("QueryTmSbjProduceResponse.Moudle["+ i +"].Extend.SubmitCount"));
			extend.setTmNametype(_ctx.longValue("QueryTmSbjProduceResponse.Moudle["+ i +"].Extend.TmNametype"));
			tmSbjProduceList.setExtend(extend);

			moudle.add(tmSbjProduceList);
		}
		queryTmSbjProduceResponse.setMoudle(moudle);
	 
	 	return queryTmSbjProduceResponse;
	}
}