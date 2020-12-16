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

package com.aliyuncs.companyreg.transform.v20200306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20200306.QueryCommodityConfigResponse;
import com.aliyuncs.companyreg.model.v20200306.QueryCommodityConfigResponse.Data;
import com.aliyuncs.companyreg.model.v20200306.QueryCommodityConfigResponse.Data.CommodityModulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCommodityConfigResponseUnmarshaller {

	public static QueryCommodityConfigResponse unmarshall(QueryCommodityConfigResponse queryCommodityConfigResponse, UnmarshallerContext _ctx) {
		
		queryCommodityConfigResponse.setRequestId(_ctx.stringValue("QueryCommodityConfigResponse.RequestId"));

		Data data = new Data();
		data.setProductLine(_ctx.stringValue("QueryCommodityConfigResponse.Data.ProductLine"));
		data.setCommodityCode(_ctx.stringValue("QueryCommodityConfigResponse.Data.CommodityCode"));
		data.setDescription(_ctx.stringValue("QueryCommodityConfigResponse.Data.Description"));
		data.setStartingPrice(_ctx.stringValue("QueryCommodityConfigResponse.Data.StartingPrice"));
		data.setType(_ctx.integerValue("QueryCommodityConfigResponse.Data.Type"));
		data.setIconUrl(_ctx.stringValue("QueryCommodityConfigResponse.Data.IconUrl"));
		data.setProtocolUrl(_ctx.stringValue("QueryCommodityConfigResponse.Data.ProtocolUrl"));

		List<CommodityModulesItem> commodityModules = new ArrayList<CommodityModulesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCommodityConfigResponse.Data.CommodityModules.Length"); i++) {
			CommodityModulesItem commodityModulesItem = new CommodityModulesItem();
			commodityModulesItem.setModuleCode(_ctx.stringValue("QueryCommodityConfigResponse.Data.CommodityModules["+ i +"].ModuleCode"));
			commodityModulesItem.setModuleName(_ctx.stringValue("QueryCommodityConfigResponse.Data.CommodityModules["+ i +"].ModuleName"));
			commodityModulesItem.setModuleDescription(_ctx.stringValue("QueryCommodityConfigResponse.Data.CommodityModules["+ i +"].ModuleDescription"));
			commodityModulesItem.setModuleType(_ctx.stringValue("QueryCommodityConfigResponse.Data.CommodityModules["+ i +"].ModuleType"));
			commodityModulesItem.setModuleTip(_ctx.stringValue("QueryCommodityConfigResponse.Data.CommodityModules["+ i +"].ModuleTip"));
			commodityModulesItem.setLxModuleCode(_ctx.stringValue("QueryCommodityConfigResponse.Data.CommodityModules["+ i +"].LxModuleCode"));
			commodityModulesItem.setModuleValue(_ctx.stringValue("QueryCommodityConfigResponse.Data.CommodityModules["+ i +"].ModuleValue"));
			commodityModulesItem.setModuleUrl(_ctx.stringValue("QueryCommodityConfigResponse.Data.CommodityModules["+ i +"].ModuleUrl"));
			commodityModulesItem.setSortNumber(_ctx.integerValue("QueryCommodityConfigResponse.Data.CommodityModules["+ i +"].SortNumber"));

			commodityModules.add(commodityModulesItem);
		}
		data.setCommodityModules(commodityModules);
		queryCommodityConfigResponse.setData(data);
	 
	 	return queryCommodityConfigResponse;
	}
}