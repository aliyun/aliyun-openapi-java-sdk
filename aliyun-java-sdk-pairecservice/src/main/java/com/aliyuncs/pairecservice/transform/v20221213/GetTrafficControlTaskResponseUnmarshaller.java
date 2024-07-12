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

import com.aliyuncs.pairecservice.model.v20221213.GetTrafficControlTaskResponse;
import com.aliyuncs.pairecservice.model.v20221213.GetTrafficControlTaskResponse.TrafficControlTargetsItem;
import com.aliyuncs.pairecservice.model.v20221213.GetTrafficControlTaskResponse.TrafficControlTargetsItem.SplitParts;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTrafficControlTaskResponseUnmarshaller {

	public static GetTrafficControlTaskResponse unmarshall(GetTrafficControlTaskResponse getTrafficControlTaskResponse, UnmarshallerContext _ctx) {
		
		getTrafficControlTaskResponse.setRequestId(_ctx.stringValue("GetTrafficControlTaskResponse.RequestId"));
		getTrafficControlTaskResponse.setTrafficControlTaskId(_ctx.stringValue("GetTrafficControlTaskResponse.TrafficControlTaskId"));
		getTrafficControlTaskResponse.setName(_ctx.stringValue("GetTrafficControlTaskResponse.Name"));
		getTrafficControlTaskResponse.setDescription(_ctx.stringValue("GetTrafficControlTaskResponse.Description"));
		getTrafficControlTaskResponse.setSceneId(_ctx.stringValue("GetTrafficControlTaskResponse.SceneId"));
		getTrafficControlTaskResponse.setSceneName(_ctx.stringValue("GetTrafficControlTaskResponse.SceneName"));
		getTrafficControlTaskResponse.setProductStatus(_ctx.stringValue("GetTrafficControlTaskResponse.ProductStatus"));
		getTrafficControlTaskResponse.setPrepubStatus(_ctx.stringValue("GetTrafficControlTaskResponse.PrepubStatus"));
		getTrafficControlTaskResponse.setExecutionTime(_ctx.stringValue("GetTrafficControlTaskResponse.ExecutionTime"));
		getTrafficControlTaskResponse.setStartTime(_ctx.stringValue("GetTrafficControlTaskResponse.StartTime"));
		getTrafficControlTaskResponse.setEndTime(_ctx.stringValue("GetTrafficControlTaskResponse.EndTime"));
		getTrafficControlTaskResponse.setBehaviorTableMetaId(_ctx.stringValue("GetTrafficControlTaskResponse.BehaviorTableMetaId"));
		getTrafficControlTaskResponse.setUserTableMetaId(_ctx.stringValue("GetTrafficControlTaskResponse.UserTableMetaId"));
		getTrafficControlTaskResponse.setItemTableMetaId(_ctx.stringValue("GetTrafficControlTaskResponse.ItemTableMetaId"));
		getTrafficControlTaskResponse.setUserConditionType(_ctx.stringValue("GetTrafficControlTaskResponse.UserConditionType"));
		getTrafficControlTaskResponse.setUserConditionArray(_ctx.stringValue("GetTrafficControlTaskResponse.UserConditionArray"));
		getTrafficControlTaskResponse.setUserConditionExpress(_ctx.stringValue("GetTrafficControlTaskResponse.UserConditionExpress"));
		getTrafficControlTaskResponse.setStatisBehaviorConditionType(_ctx.stringValue("GetTrafficControlTaskResponse.StatisBehaviorConditionType"));
		getTrafficControlTaskResponse.setStatisBehaviorConditionArray(_ctx.stringValue("GetTrafficControlTaskResponse.StatisBehaviorConditionArray"));
		getTrafficControlTaskResponse.setStatisBehaviorConditionExpress(_ctx.stringValue("GetTrafficControlTaskResponse.StatisBehaviorConditionExpress"));
		getTrafficControlTaskResponse.setControlType(_ctx.stringValue("GetTrafficControlTaskResponse.ControlType"));
		getTrafficControlTaskResponse.setControlGranularity(_ctx.stringValue("GetTrafficControlTaskResponse.ControlGranularity"));
		getTrafficControlTaskResponse.setControlLogic(_ctx.stringValue("GetTrafficControlTaskResponse.ControlLogic"));
		getTrafficControlTaskResponse.setItemConditionType(_ctx.stringValue("GetTrafficControlTaskResponse.ItemConditionType"));
		getTrafficControlTaskResponse.setItemConditionArray(_ctx.stringValue("GetTrafficControlTaskResponse.ItemConditionArray"));
		getTrafficControlTaskResponse.setItemConditionExpress(_ctx.stringValue("GetTrafficControlTaskResponse.ItemConditionExpress"));
		getTrafficControlTaskResponse.setGmtCreateTime(_ctx.stringValue("GetTrafficControlTaskResponse.GmtCreateTime"));
		getTrafficControlTaskResponse.setGmtModifiedTime(_ctx.stringValue("GetTrafficControlTaskResponse.GmtModifiedTime"));
		getTrafficControlTaskResponse.setEverPublished(_ctx.booleanValue("GetTrafficControlTaskResponse.EverPublished"));

		List<TrafficControlTargetsItem> trafficControlTargets = new ArrayList<TrafficControlTargetsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTrafficControlTaskResponse.TrafficControlTargets.Length"); i++) {
			TrafficControlTargetsItem trafficControlTargetsItem = new TrafficControlTargetsItem();
			trafficControlTargetsItem.setTrafficControlTargetId(_ctx.stringValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].TrafficControlTargetId"));
			trafficControlTargetsItem.setName(_ctx.stringValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].Name"));
			trafficControlTargetsItem.setStartTime(_ctx.stringValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].StartTime"));
			trafficControlTargetsItem.setEndTime(_ctx.stringValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].EndTime"));
			trafficControlTargetsItem.setItemConditionType(_ctx.stringValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].ItemConditionType"));
			trafficControlTargetsItem.setItemConditionArray(_ctx.stringValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].ItemConditionArray"));
			trafficControlTargetsItem.setItemConditionExpress(_ctx.stringValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].ItemConditionExpress"));
			trafficControlTargetsItem.setEvent(_ctx.stringValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].Event"));
			trafficControlTargetsItem.setValue(_ctx.floatValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].Value"));
			trafficControlTargetsItem.setStatisPeriod(_ctx.stringValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].StatisPeriod"));
			trafficControlTargetsItem.setToleranceValue(_ctx.longValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].ToleranceValue"));
			trafficControlTargetsItem.setRecallName(_ctx.stringValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].RecallName"));
			trafficControlTargetsItem.setStatus(_ctx.stringValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].Status"));
			trafficControlTargetsItem.setGmtCreateTime(_ctx.stringValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].GmtCreateTime"));
			trafficControlTargetsItem.setGmtModifiedTime(_ctx.stringValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].GmtModifiedTime"));
			trafficControlTargetsItem.setNewProductRegulation(_ctx.booleanValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].NewProductRegulation"));

			SplitParts splitParts = new SplitParts();

			List<Integer> timePoints = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].SplitParts.TimePoints.Length"); j++) {
				timePoints.add(_ctx.integerValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].SplitParts.TimePoints["+ j +"]"));
			}
			splitParts.setTimePoints(timePoints);

			List<Integer> setPoints = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].SplitParts.SetPoints.Length"); j++) {
				setPoints.add(_ctx.integerValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].SplitParts.SetPoints["+ j +"]"));
			}
			splitParts.setSetPoints(setPoints);

			List<Long> setValues = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].SplitParts.SetValues.Length"); j++) {
				setValues.add(_ctx.longValue("GetTrafficControlTaskResponse.TrafficControlTargets["+ i +"].SplitParts.SetValues["+ j +"]"));
			}
			splitParts.setSetValues(setValues);
			trafficControlTargetsItem.setSplitParts(splitParts);

			trafficControlTargets.add(trafficControlTargetsItem);
		}
		getTrafficControlTaskResponse.setTrafficControlTargets(trafficControlTargets);
	 
	 	return getTrafficControlTaskResponse;
	}
}