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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryOrderCommissionRateResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderCommissionRateResponse.CommissionModel;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderCommissionRateResponse.CommissionModel.CommissionInfo;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderCommissionRateResponse.CommissionModel.CommissionInfo.RateConfig;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderCommissionRateResponse.CommissionModel.CommissionInfo.RateConfig.ConfigsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrderCommissionRateResponseUnmarshaller {

	public static QueryOrderCommissionRateResponse unmarshall(QueryOrderCommissionRateResponse queryOrderCommissionRateResponse, UnmarshallerContext _ctx) {
		
		queryOrderCommissionRateResponse.setRequestId(_ctx.stringValue("QueryOrderCommissionRateResponse.RequestId"));
		queryOrderCommissionRateResponse.setCode(_ctx.stringValue("QueryOrderCommissionRateResponse.Code"));
		queryOrderCommissionRateResponse.setMessage(_ctx.stringValue("QueryOrderCommissionRateResponse.Message"));

		List<CommissionModel> commissionModels = new ArrayList<CommissionModel>();
		for (int i = 0; i < _ctx.lengthValue("QueryOrderCommissionRateResponse.CommissionModels.Length"); i++) {
			CommissionModel commissionModel = new CommissionModel();
			commissionModel.setLmOrderId(_ctx.longValue("QueryOrderCommissionRateResponse.CommissionModels["+ i +"].LmOrderId"));

			CommissionInfo commissionInfo = new CommissionInfo();
			commissionInfo.setRateType(_ctx.stringValue("QueryOrderCommissionRateResponse.CommissionModels["+ i +"].CommissionInfo.RateType"));

			RateConfig rateConfig = new RateConfig();

			List<ConfigsItem> configs = new ArrayList<ConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryOrderCommissionRateResponse.CommissionModels["+ i +"].CommissionInfo.RateConfig.Configs.Length"); j++) {
				ConfigsItem configsItem = new ConfigsItem();
				configsItem.setValue(_ctx.longValue("QueryOrderCommissionRateResponse.CommissionModels["+ i +"].CommissionInfo.RateConfig.Configs["+ j +"].Value"));
				configsItem.setValueUnit(_ctx.stringValue("QueryOrderCommissionRateResponse.CommissionModels["+ i +"].CommissionInfo.RateConfig.Configs["+ j +"].ValueUnit"));

				configs.add(configsItem);
			}
			rateConfig.setConfigs(configs);
			commissionInfo.setRateConfig(rateConfig);
			commissionModel.setCommissionInfo(commissionInfo);

			commissionModels.add(commissionModel);
		}
		queryOrderCommissionRateResponse.setCommissionModels(commissionModels);
	 
	 	return queryOrderCommissionRateResponse;
	}
}