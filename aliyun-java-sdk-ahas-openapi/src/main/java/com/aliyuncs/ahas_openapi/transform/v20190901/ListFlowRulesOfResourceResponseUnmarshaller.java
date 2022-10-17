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

import com.aliyuncs.ahas_openapi.model.v20190901.ListFlowRulesOfResourceResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ListFlowRulesOfResourceResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.ListFlowRulesOfResourceResponse.Data.DatasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowRulesOfResourceResponseUnmarshaller {

	public static ListFlowRulesOfResourceResponse unmarshall(ListFlowRulesOfResourceResponse listFlowRulesOfResourceResponse, UnmarshallerContext _ctx) {
		
		listFlowRulesOfResourceResponse.setRequestId(_ctx.stringValue("ListFlowRulesOfResourceResponse.RequestId"));
		listFlowRulesOfResourceResponse.setMessage(_ctx.stringValue("ListFlowRulesOfResourceResponse.Message"));
		listFlowRulesOfResourceResponse.setCode(_ctx.stringValue("ListFlowRulesOfResourceResponse.Code"));
		listFlowRulesOfResourceResponse.setSuccess(_ctx.booleanValue("ListFlowRulesOfResourceResponse.Success"));

		Data data = new Data();
		data.setPageIndex(_ctx.integerValue("ListFlowRulesOfResourceResponse.Data.PageIndex"));
		data.setTotalPage(_ctx.integerValue("ListFlowRulesOfResourceResponse.Data.TotalPage"));
		data.setPageSize(_ctx.integerValue("ListFlowRulesOfResourceResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListFlowRulesOfResourceResponse.Data.TotalCount"));

		List<DatasItem> datas = new ArrayList<DatasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowRulesOfResourceResponse.Data.Datas.Length"); i++) {
			DatasItem datasItem = new DatasItem();
			datasItem.setRefResource(_ctx.stringValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].RefResource"));
			datasItem.setClusterFallbackThreshold(_ctx.integerValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].ClusterFallbackThreshold"));
			datasItem.setNamespace(_ctx.stringValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].Namespace"));
			datasItem.setLimitOrigin(_ctx.stringValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].LimitOrigin"));
			datasItem.setStatDurationMs(_ctx.integerValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].StatDurationMs"));
			datasItem.setClusterThresholdType(_ctx.integerValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].ClusterThresholdType"));
			datasItem.setRuleId(_ctx.longValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].RuleId"));
			datasItem.setRelationStrategy(_ctx.integerValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].RelationStrategy"));
			datasItem.setAppName(_ctx.stringValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].AppName"));
			datasItem.setResource(_ctx.stringValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].Resource"));
			datasItem.setClusterEstimatedMaxQps(_ctx.floatValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].ClusterEstimatedMaxQps"));
			datasItem.setControlBehavior(_ctx.integerValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].ControlBehavior"));
			datasItem.setMaxQueueingTimeMs(_ctx.integerValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].MaxQueueingTimeMs"));
			datasItem.setClusterFallbackStrategy(_ctx.integerValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].ClusterFallbackStrategy"));
			datasItem.setWarmUpPeriodSec(_ctx.integerValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].WarmUpPeriodSec"));
			datasItem.setClusterMode(_ctx.booleanValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].ClusterMode"));
			datasItem.setThresholdMode(_ctx.integerValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].ThresholdMode"));
			datasItem.setThreshold(_ctx.floatValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].Threshold"));
			datasItem.setEnable(_ctx.booleanValue("ListFlowRulesOfResourceResponse.Data.Datas["+ i +"].Enable"));

			datas.add(datasItem);
		}
		data.setDatas(datas);
		listFlowRulesOfResourceResponse.setData(data);
	 
	 	return listFlowRulesOfResourceResponse;
	}
}