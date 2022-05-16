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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.ListGreyTagRouteResponse;
import com.aliyuncs.sae.model.v20190506.ListGreyTagRouteResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListGreyTagRouteResponse.Data.ResultItem;
import com.aliyuncs.sae.model.v20190506.ListGreyTagRouteResponse.Data.ResultItem.DubboRule;
import com.aliyuncs.sae.model.v20190506.ListGreyTagRouteResponse.Data.ResultItem.DubboRule.Item2;
import com.aliyuncs.sae.model.v20190506.ListGreyTagRouteResponse.Data.ResultItem.ScRule;
import com.aliyuncs.sae.model.v20190506.ListGreyTagRouteResponse.Data.ResultItem.ScRule.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGreyTagRouteResponseUnmarshaller {

	public static ListGreyTagRouteResponse unmarshall(ListGreyTagRouteResponse listGreyTagRouteResponse, UnmarshallerContext _ctx) {
		
		listGreyTagRouteResponse.setRequestId(_ctx.stringValue("ListGreyTagRouteResponse.RequestId"));
		listGreyTagRouteResponse.setMessage(_ctx.stringValue("ListGreyTagRouteResponse.Message"));
		listGreyTagRouteResponse.setTraceId(_ctx.stringValue("ListGreyTagRouteResponse.TraceId"));
		listGreyTagRouteResponse.setErrorCode(_ctx.stringValue("ListGreyTagRouteResponse.ErrorCode"));
		listGreyTagRouteResponse.setCode(_ctx.stringValue("ListGreyTagRouteResponse.Code"));
		listGreyTagRouteResponse.setSuccess(_ctx.booleanValue("ListGreyTagRouteResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("ListGreyTagRouteResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("ListGreyTagRouteResponse.Data.PageSize"));
		data.setTotalSize(_ctx.longValue("ListGreyTagRouteResponse.Data.TotalSize"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListGreyTagRouteResponse.Data.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setGreyTagRouteId(_ctx.longValue("ListGreyTagRouteResponse.Data.Result["+ i +"].GreyTagRouteId"));
			resultItem.setName(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].Name"));
			resultItem.setDescription(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].Description"));
			resultItem.setCreateTime(_ctx.longValue("ListGreyTagRouteResponse.Data.Result["+ i +"].CreateTime"));
			resultItem.setUpdateTime(_ctx.longValue("ListGreyTagRouteResponse.Data.Result["+ i +"].UpdateTime"));

			List<ScRule> scRules = new ArrayList<ScRule>();
			for (int j = 0; j < _ctx.lengthValue("ListGreyTagRouteResponse.Data.Result["+ i +"].ScRules.Length"); j++) {
				ScRule scRule = new ScRule();
				scRule.setPath(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].ScRules["+ j +"].path"));
				scRule.setCondition(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].ScRules["+ j +"].condition"));

				List<Item> items = new ArrayList<Item>();
				for (int k = 0; k < _ctx.lengthValue("ListGreyTagRouteResponse.Data.Result["+ i +"].ScRules["+ j +"].items.Length"); k++) {
					Item item = new Item();
					item.setType(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].ScRules["+ j +"].items["+ k +"].type"));
					item.setName(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].ScRules["+ j +"].items["+ k +"].name"));
					item.setOperator(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].ScRules["+ j +"].items["+ k +"].operator"));
					item.setValue(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].ScRules["+ j +"].items["+ k +"].value"));
					item.setCond(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].ScRules["+ j +"].items["+ k +"].cond"));
					item.setIndex(_ctx.integerValue("ListGreyTagRouteResponse.Data.Result["+ i +"].ScRules["+ j +"].items["+ k +"].index"));
					item.setExpr(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].ScRules["+ j +"].items["+ k +"].expr"));

					items.add(item);
				}
				scRule.setItems(items);

				scRules.add(scRule);
			}
			resultItem.setScRules(scRules);

			List<DubboRule> dubboRules = new ArrayList<DubboRule>();
			for (int j = 0; j < _ctx.lengthValue("ListGreyTagRouteResponse.Data.Result["+ i +"].DubboRules.Length"); j++) {
				DubboRule dubboRule = new DubboRule();
				dubboRule.setServiceName(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].DubboRules["+ j +"].serviceName"));
				dubboRule.setGroup(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].DubboRules["+ j +"].group"));
				dubboRule.setVersion(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].DubboRules["+ j +"].version"));
				dubboRule.setMethodName(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].DubboRules["+ j +"].methodName"));
				dubboRule.setCondition(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].DubboRules["+ j +"].condition"));

				List<Item2> items1 = new ArrayList<Item2>();
				for (int k = 0; k < _ctx.lengthValue("ListGreyTagRouteResponse.Data.Result["+ i +"].DubboRules["+ j +"].items.Length"); k++) {
					Item2 item2 = new Item2();
					item2.setIndex(_ctx.integerValue("ListGreyTagRouteResponse.Data.Result["+ i +"].DubboRules["+ j +"].items["+ k +"].index"));
					item2.setExpr(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].DubboRules["+ j +"].items["+ k +"].expr"));
					item2.setOperator(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].DubboRules["+ j +"].items["+ k +"].operator"));
					item2.setValue(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].DubboRules["+ j +"].items["+ k +"].value"));
					item2.setCond(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].DubboRules["+ j +"].items["+ k +"].cond"));
					item2.setType(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].DubboRules["+ j +"].items["+ k +"].type"));
					item2.setName(_ctx.stringValue("ListGreyTagRouteResponse.Data.Result["+ i +"].DubboRules["+ j +"].items["+ k +"].name"));

					items1.add(item2);
				}
				dubboRule.setItems1(items1);

				dubboRules.add(dubboRule);
			}
			resultItem.setDubboRules(dubboRules);

			result.add(resultItem);
		}
		data.setResult(result);
		listGreyTagRouteResponse.setData(data);
	 
	 	return listGreyTagRouteResponse;
	}
}