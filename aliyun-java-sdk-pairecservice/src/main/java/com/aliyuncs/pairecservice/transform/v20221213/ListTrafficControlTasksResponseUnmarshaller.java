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

import com.aliyuncs.pairecservice.model.v20221213.ListTrafficControlTasksResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListTrafficControlTasksResponse.TrafficControlTasksItem;
import com.aliyuncs.pairecservice.model.v20221213.ListTrafficControlTasksResponse.TrafficControlTasksItem.TrafficControlTargetsItem;
import com.aliyuncs.pairecservice.model.v20221213.ListTrafficControlTasksResponse.TrafficControlTasksItem.TrafficControlTargetsItem.SplitParts;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrafficControlTasksResponseUnmarshaller {

	public static ListTrafficControlTasksResponse unmarshall(ListTrafficControlTasksResponse listTrafficControlTasksResponse, UnmarshallerContext _ctx) {
		
		listTrafficControlTasksResponse.setRequestId(_ctx.stringValue("ListTrafficControlTasksResponse.RequestId"));
		listTrafficControlTasksResponse.setTotalCount(_ctx.stringValue("ListTrafficControlTasksResponse.TotalCount"));

		List<TrafficControlTasksItem> trafficControlTasks = new ArrayList<TrafficControlTasksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTrafficControlTasksResponse.TrafficControlTasks.Length"); i++) {
			TrafficControlTasksItem trafficControlTasksItem = new TrafficControlTasksItem();
			trafficControlTasksItem.setTrafficControlTaskId(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTaskId"));
			trafficControlTasksItem.setName(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].Name"));
			trafficControlTasksItem.setDescription(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].Description"));
			trafficControlTasksItem.setSceneId(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].SceneId"));
			trafficControlTasksItem.setSceneName(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].SceneName"));
			trafficControlTasksItem.setProductStatus(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].ProductStatus"));
			trafficControlTasksItem.setPrepubStatus(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].PrepubStatus"));
			trafficControlTasksItem.setExecutionTime(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].ExecutionTime"));
			trafficControlTasksItem.setStartTime(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].StartTime"));
			trafficControlTasksItem.setEndTime(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].EndTime"));
			trafficControlTasksItem.setBehaviorTableMetaId(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].BehaviorTableMetaId"));
			trafficControlTasksItem.setUserTableMetaId(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].UserTableMetaId"));
			trafficControlTasksItem.setItemTableMetaId(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].ItemTableMetaId"));
			trafficControlTasksItem.setUserConditionType(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].UserConditionType"));
			trafficControlTasksItem.setUserConditionArray(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].UserConditionArray"));
			trafficControlTasksItem.setUserConditionExpress(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].UserConditionExpress"));
			trafficControlTasksItem.setStatisBehaviorConditionType(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].StatisBehaviorConditionType"));
			trafficControlTasksItem.setStatisBehaviorConditionArray(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].StatisBehaviorConditionArray"));
			trafficControlTasksItem.setStatisBahaviorConditionExpress(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].StatisBahaviorConditionExpress"));
			trafficControlTasksItem.setControlType(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].ControlType"));
			trafficControlTasksItem.setControlGranularity(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].ControlGranularity"));
			trafficControlTasksItem.setControlLogic(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].ControlLogic"));
			trafficControlTasksItem.setItemConditionType(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].ItemConditionType"));
			trafficControlTasksItem.setItemConditionArray(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].ItemConditionArray"));
			trafficControlTasksItem.setItemConditionExpress(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].ItemConditionExpress"));
			trafficControlTasksItem.setGmtCreateTime(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].GmtCreateTime"));
			trafficControlTasksItem.setGmtModifiedTime(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].GmtModifiedTime"));
			trafficControlTasksItem.setEverPublished(_ctx.booleanValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].EverPublished"));

			List<TrafficControlTargetsItem> trafficControlTargets = new ArrayList<TrafficControlTargetsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets.Length"); j++) {
				TrafficControlTargetsItem trafficControlTargetsItem = new TrafficControlTargetsItem();
				trafficControlTargetsItem.setTrafficControlTargetId(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].TrafficControlTargetId"));
				trafficControlTargetsItem.setName(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].Name"));
				trafficControlTargetsItem.setStartTime(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].StartTime"));
				trafficControlTargetsItem.setEndTime(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].EndTime"));
				trafficControlTargetsItem.setItemConditionType(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].ItemConditionType"));
				trafficControlTargetsItem.setItemConditionArray(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].ItemConditionArray"));
				trafficControlTargetsItem.setItemConditionExpress(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].ItemConditionExpress"));
				trafficControlTargetsItem.setEvent(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].Event"));
				trafficControlTargetsItem.setValue(_ctx.floatValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].Value"));
				trafficControlTargetsItem.setStatisPeriod(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].StatisPeriod"));
				trafficControlTargetsItem.setToleranceValue(_ctx.longValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].ToleranceValue"));
				trafficControlTargetsItem.setRecallName(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].RecallName"));
				trafficControlTargetsItem.setStatus(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].Status"));
				trafficControlTargetsItem.setGmtCreateTime(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].GmtCreateTime"));
				trafficControlTargetsItem.setGmtModifiedTime(_ctx.stringValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].GmtModifiedTime"));
				trafficControlTargetsItem.setNewProductRegulation(_ctx.booleanValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].NewProductRegulation"));

				SplitParts splitParts = new SplitParts();

				List<Long> timePoints = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].SplitParts.TimePoints.Length"); k++) {
					timePoints.add(_ctx.longValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].SplitParts.TimePoints["+ k +"]"));
				}
				splitParts.setTimePoints(timePoints);

				List<Long> setValues = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].SplitParts.SetValues.Length"); k++) {
					setValues.add(_ctx.longValue("ListTrafficControlTasksResponse.TrafficControlTasks["+ i +"].TrafficControlTargets["+ j +"].SplitParts.SetValues["+ k +"]"));
				}
				splitParts.setSetValues(setValues);
				trafficControlTargetsItem.setSplitParts(splitParts);

				trafficControlTargets.add(trafficControlTargetsItem);
			}
			trafficControlTasksItem.setTrafficControlTargets(trafficControlTargets);

			trafficControlTasks.add(trafficControlTasksItem);
		}
		listTrafficControlTasksResponse.setTrafficControlTasks(trafficControlTasks);
	 
	 	return listTrafficControlTasksResponse;
	}
}