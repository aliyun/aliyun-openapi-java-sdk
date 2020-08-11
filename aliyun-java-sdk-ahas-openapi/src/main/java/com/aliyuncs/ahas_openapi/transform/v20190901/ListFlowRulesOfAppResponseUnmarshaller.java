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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.ListFlowRulesOfAppResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ListFlowRulesOfAppResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.ListFlowRulesOfAppResponse.Data.DatasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowRulesOfAppResponseUnmarshaller {

	public static ListFlowRulesOfAppResponse unmarshall(ListFlowRulesOfAppResponse listFlowRulesOfAppResponse, UnmarshallerContext _ctx) {
		
		listFlowRulesOfAppResponse.setRequestId(_ctx.stringValue("ListFlowRulesOfAppResponse.RequestId"));
		listFlowRulesOfAppResponse.setCode(_ctx.stringValue("ListFlowRulesOfAppResponse.Code"));
		listFlowRulesOfAppResponse.setMessage(_ctx.stringValue("ListFlowRulesOfAppResponse.Message"));
		listFlowRulesOfAppResponse.setSuccess(_ctx.booleanValue("ListFlowRulesOfAppResponse.Success"));

		Data data = new Data();
		data.setPageIndex(_ctx.integerValue("ListFlowRulesOfAppResponse.Data.PageIndex"));
		data.setPageSize(_ctx.integerValue("ListFlowRulesOfAppResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListFlowRulesOfAppResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.integerValue("ListFlowRulesOfAppResponse.Data.TotalPage"));

		List<DatasItem> datas = new ArrayList<DatasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowRulesOfAppResponse.Data.Datas.Length"); i++) {
			DatasItem datasItem = new DatasItem();
			datasItem.setRuleId(_ctx.longValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].RuleId"));
			datasItem.setAppName(_ctx.stringValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].AppName"));
			datasItem.setNamespace(_ctx.stringValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].Namespace"));
			datasItem.setRefResource(_ctx.stringValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].RefResource"));
			datasItem.setResource(_ctx.stringValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].Resource"));
			datasItem.setLimitOrigin(_ctx.stringValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].LimitOrigin"));
			datasItem.setControlBehavior(_ctx.integerValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].ControlBehavior"));
			datasItem.setRelationStrategy(_ctx.integerValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].RelationStrategy"));
			datasItem.setThreshold(_ctx.floatValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].Threshold"));
			datasItem.setEnable(_ctx.booleanValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].Enable"));
			datasItem.setMaxQueueingTimeMs(_ctx.integerValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].MaxQueueingTimeMs"));
			datasItem.setWarmUpPeriodSec(_ctx.integerValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].WarmUpPeriodSec"));
			datasItem.setClusterMode(_ctx.booleanValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].ClusterMode"));
			datasItem.setClusterThresholdType(_ctx.integerValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].ClusterThresholdType"));
			datasItem.setClusterFallbackStrategy(_ctx.integerValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].ClusterFallbackStrategy"));
			datasItem.setClusterFallbackThreshold(_ctx.integerValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].ClusterFallbackThreshold"));
			datasItem.setStatDurationMs(_ctx.integerValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].StatDurationMs"));
			datasItem.setClusterEstimatedMaxQps(_ctx.floatValue("ListFlowRulesOfAppResponse.Data.Datas["+ i +"].ClusterEstimatedMaxQps"));

			datas.add(datasItem);
		}
		data.setDatas(datas);
		listFlowRulesOfAppResponse.setData(data);
	 
	 	return listFlowRulesOfAppResponse;
	}
}