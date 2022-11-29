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

import com.aliyuncs.sae.model.v20190506.DescribeGreyTagRouteResponse;
import com.aliyuncs.sae.model.v20190506.DescribeGreyTagRouteResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeGreyTagRouteResponse.Data.AlbRule;
import com.aliyuncs.sae.model.v20190506.DescribeGreyTagRouteResponse.Data.AlbRule.Scrulesitem2;
import com.aliyuncs.sae.model.v20190506.DescribeGreyTagRouteResponse.Data.DubboRule;
import com.aliyuncs.sae.model.v20190506.DescribeGreyTagRouteResponse.Data.DubboRule.Item;
import com.aliyuncs.sae.model.v20190506.DescribeGreyTagRouteResponse.Data.ScRule;
import com.aliyuncs.sae.model.v20190506.DescribeGreyTagRouteResponse.Data.ScRule.Scrulesitem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGreyTagRouteResponseUnmarshaller {

	public static DescribeGreyTagRouteResponse unmarshall(DescribeGreyTagRouteResponse describeGreyTagRouteResponse, UnmarshallerContext _ctx) {
		
		describeGreyTagRouteResponse.setRequestId(_ctx.stringValue("DescribeGreyTagRouteResponse.RequestId"));
		describeGreyTagRouteResponse.setMessage(_ctx.stringValue("DescribeGreyTagRouteResponse.Message"));
		describeGreyTagRouteResponse.setTraceId(_ctx.stringValue("DescribeGreyTagRouteResponse.TraceId"));
		describeGreyTagRouteResponse.setErrorCode(_ctx.stringValue("DescribeGreyTagRouteResponse.ErrorCode"));
		describeGreyTagRouteResponse.setCode(_ctx.stringValue("DescribeGreyTagRouteResponse.Code"));
		describeGreyTagRouteResponse.setSuccess(_ctx.booleanValue("DescribeGreyTagRouteResponse.Success"));

		Data data = new Data();
		data.setGreyTagRouteId(_ctx.longValue("DescribeGreyTagRouteResponse.Data.GreyTagRouteId"));
		data.setName(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.Description"));
		data.setCreateTime(_ctx.longValue("DescribeGreyTagRouteResponse.Data.CreateTime"));
		data.setUpdateTime(_ctx.longValue("DescribeGreyTagRouteResponse.Data.UpdateTime"));
		data.setAppId(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.AppId"));

		List<ScRule> scRules = new ArrayList<ScRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGreyTagRouteResponse.Data.ScRules.Length"); i++) {
			ScRule scRule = new ScRule();
			scRule.setPath(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.ScRules["+ i +"].path"));
			scRule.setCondition(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.ScRules["+ i +"].condition"));

			List<Scrulesitem> items = new ArrayList<Scrulesitem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGreyTagRouteResponse.Data.ScRules["+ i +"].items.Length"); j++) {
				Scrulesitem scrulesitem = new Scrulesitem();
				scrulesitem.setType(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.ScRules["+ i +"].items["+ j +"].type"));
				scrulesitem.setName(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.ScRules["+ i +"].items["+ j +"].name"));
				scrulesitem.setOperator(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.ScRules["+ i +"].items["+ j +"].operator"));
				scrulesitem.setValue(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.ScRules["+ i +"].items["+ j +"].value"));
				scrulesitem.setCond(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.ScRules["+ i +"].items["+ j +"].cond"));
				scrulesitem.setIndex(_ctx.integerValue("DescribeGreyTagRouteResponse.Data.ScRules["+ i +"].items["+ j +"].index"));
				scrulesitem.setExpr(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.ScRules["+ i +"].items["+ j +"].expr"));

				items.add(scrulesitem);
			}
			scRule.setItems(items);

			scRules.add(scRule);
		}
		data.setScRules(scRules);

		List<AlbRule> albRules = new ArrayList<AlbRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGreyTagRouteResponse.Data.AlbRules.Length"); i++) {
			AlbRule albRule = new AlbRule();
			albRule.setServiceId(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.AlbRules["+ i +"].serviceId"));
			albRule.setIngressId(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.AlbRules["+ i +"].ingressId"));
			albRule.setCondition(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.AlbRules["+ i +"].condition"));

			List<Scrulesitem2> items1 = new ArrayList<Scrulesitem2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGreyTagRouteResponse.Data.AlbRules["+ i +"].items.Length"); j++) {
				Scrulesitem2 scrulesitem2 = new Scrulesitem2();
				scrulesitem2.setType(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.AlbRules["+ i +"].items["+ j +"].type"));
				scrulesitem2.setName(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.AlbRules["+ i +"].items["+ j +"].name"));
				scrulesitem2.setOperator(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.AlbRules["+ i +"].items["+ j +"].operator"));
				scrulesitem2.setValue(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.AlbRules["+ i +"].items["+ j +"].value"));
				scrulesitem2.setCond(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.AlbRules["+ i +"].items["+ j +"].cond"));
				scrulesitem2.setIndex(_ctx.integerValue("DescribeGreyTagRouteResponse.Data.AlbRules["+ i +"].items["+ j +"].index"));
				scrulesitem2.setExpr(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.AlbRules["+ i +"].items["+ j +"].expr"));

				items1.add(scrulesitem2);
			}
			albRule.setItems1(items1);

			albRules.add(albRule);
		}
		data.setAlbRules(albRules);

		List<DubboRule> dubboRules = new ArrayList<DubboRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGreyTagRouteResponse.Data.DubboRules.Length"); i++) {
			DubboRule dubboRule = new DubboRule();
			dubboRule.setServiceName(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.DubboRules["+ i +"].serviceName"));
			dubboRule.setGroup(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.DubboRules["+ i +"].group"));
			dubboRule.setVersion(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.DubboRules["+ i +"].version"));
			dubboRule.setMethodName(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.DubboRules["+ i +"].methodName"));
			dubboRule.setCondition(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.DubboRules["+ i +"].condition"));

			List<Item> items3 = new ArrayList<Item>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGreyTagRouteResponse.Data.DubboRules["+ i +"].items.Length"); j++) {
				Item item = new Item();
				item.setIndex(_ctx.integerValue("DescribeGreyTagRouteResponse.Data.DubboRules["+ i +"].items["+ j +"].index"));
				item.setExpr(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.DubboRules["+ i +"].items["+ j +"].expr"));
				item.setOperator(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.DubboRules["+ i +"].items["+ j +"].operator"));
				item.setValue(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.DubboRules["+ i +"].items["+ j +"].value"));
				item.setCond(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.DubboRules["+ i +"].items["+ j +"].cond"));
				item.setType(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.DubboRules["+ i +"].items["+ j +"].type"));
				item.setName(_ctx.stringValue("DescribeGreyTagRouteResponse.Data.DubboRules["+ i +"].items["+ j +"].name"));

				items3.add(item);
			}
			dubboRule.setItems3(items3);

			dubboRules.add(dubboRule);
		}
		data.setDubboRules(dubboRules);
		describeGreyTagRouteResponse.setData(data);
	 
	 	return describeGreyTagRouteResponse;
	}
}