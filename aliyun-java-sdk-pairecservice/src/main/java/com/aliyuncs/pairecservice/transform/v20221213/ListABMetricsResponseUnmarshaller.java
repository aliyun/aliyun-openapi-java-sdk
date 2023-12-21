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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.ListABMetricsResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListABMetricsResponse.ABMetricsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListABMetricsResponseUnmarshaller {

	public static ListABMetricsResponse unmarshall(ListABMetricsResponse listABMetricsResponse, UnmarshallerContext _ctx) {
		
		listABMetricsResponse.setRequestId(_ctx.stringValue("ListABMetricsResponse.RequestId"));
		listABMetricsResponse.setTotalCount(_ctx.longValue("ListABMetricsResponse.TotalCount"));

		List<ABMetricsItem> aBMetrics = new ArrayList<ABMetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListABMetricsResponse.ABMetrics.Length"); i++) {
			ABMetricsItem aBMetricsItem = new ABMetricsItem();
			aBMetricsItem.setABMetricId(_ctx.stringValue("ListABMetricsResponse.ABMetrics["+ i +"].ABMetricId"));
			aBMetricsItem.setName(_ctx.stringValue("ListABMetricsResponse.ABMetrics["+ i +"].Name"));
			aBMetricsItem.setDescription(_ctx.stringValue("ListABMetricsResponse.ABMetrics["+ i +"].Description"));
			aBMetricsItem.setSceneId(_ctx.stringValue("ListABMetricsResponse.ABMetrics["+ i +"].SceneId"));
			aBMetricsItem.setSceneName(_ctx.stringValue("ListABMetricsResponse.ABMetrics["+ i +"].SceneName"));
			aBMetricsItem.setType(_ctx.stringValue("ListABMetricsResponse.ABMetrics["+ i +"].Type"));
			aBMetricsItem.setRealtime(_ctx.stringValue("ListABMetricsResponse.ABMetrics["+ i +"].Realtime"));
			aBMetricsItem.setTableMetaId(_ctx.stringValue("ListABMetricsResponse.ABMetrics["+ i +"].TableMetaId"));
			aBMetricsItem.setResultTableMetaId(_ctx.stringValue("ListABMetricsResponse.ABMetrics["+ i +"].ResultTableMetaId"));
			aBMetricsItem.setResultResourceId(_ctx.stringValue("ListABMetricsResponse.ABMetrics["+ i +"].ResultResourceId"));
			aBMetricsItem.setDefinition(_ctx.stringValue("ListABMetricsResponse.ABMetrics["+ i +"].Definition"));
			aBMetricsItem.setStatisticsCycle(_ctx.integerValue("ListABMetricsResponse.ABMetrics["+ i +"].StatisticsCycle"));
			aBMetricsItem.setLeftMetricId(_ctx.stringValue("ListABMetricsResponse.ABMetrics["+ i +"].LeftMetricId"));
			aBMetricsItem.setRightMetricId(_ctx.stringValue("ListABMetricsResponse.ABMetrics["+ i +"].RightMetricId"));
			aBMetricsItem.setOperator(_ctx.stringValue("ListABMetricsResponse.ABMetrics["+ i +"].Operator"));

			aBMetrics.add(aBMetricsItem);
		}
		listABMetricsResponse.setABMetrics(aBMetrics);
	 
	 	return listABMetricsResponse;
	}
}