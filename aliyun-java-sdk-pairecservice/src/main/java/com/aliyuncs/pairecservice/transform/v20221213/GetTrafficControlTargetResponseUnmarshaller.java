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

import com.aliyuncs.pairecservice.model.v20221213.GetTrafficControlTargetResponse;
import com.aliyuncs.pairecservice.model.v20221213.GetTrafficControlTargetResponse.SplitParts;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTrafficControlTargetResponseUnmarshaller {

	public static GetTrafficControlTargetResponse unmarshall(GetTrafficControlTargetResponse getTrafficControlTargetResponse, UnmarshallerContext _ctx) {
		
		getTrafficControlTargetResponse.setRequestId(_ctx.stringValue("GetTrafficControlTargetResponse.RequestId"));
		getTrafficControlTargetResponse.setTrafficControlTargetId(_ctx.stringValue("GetTrafficControlTargetResponse.TrafficControlTargetId"));
		getTrafficControlTargetResponse.setName(_ctx.stringValue("GetTrafficControlTargetResponse.Name"));
		getTrafficControlTargetResponse.setStartTime(_ctx.stringValue("GetTrafficControlTargetResponse.StartTime"));
		getTrafficControlTargetResponse.setEndTime(_ctx.stringValue("GetTrafficControlTargetResponse.EndTime"));
		getTrafficControlTargetResponse.setItemConditionType(_ctx.stringValue("GetTrafficControlTargetResponse.ItemConditionType"));
		getTrafficControlTargetResponse.setItemConditionArray(_ctx.stringValue("GetTrafficControlTargetResponse.ItemConditionArray"));
		getTrafficControlTargetResponse.setItemConditionExpress(_ctx.stringValue("GetTrafficControlTargetResponse.ItemConditionExpress"));
		getTrafficControlTargetResponse.setEvent(_ctx.stringValue("GetTrafficControlTargetResponse.Event"));
		getTrafficControlTargetResponse.setValue(_ctx.floatValue("GetTrafficControlTargetResponse.Value"));
		getTrafficControlTargetResponse.setStatisPeriod(_ctx.stringValue("GetTrafficControlTargetResponse.StatisPeriod"));
		getTrafficControlTargetResponse.setToleranceValue(_ctx.longValue("GetTrafficControlTargetResponse.ToleranceValue"));
		getTrafficControlTargetResponse.setRecallName(_ctx.stringValue("GetTrafficControlTargetResponse.RecallName"));
		getTrafficControlTargetResponse.setStatus(_ctx.stringValue("GetTrafficControlTargetResponse.Status"));
		getTrafficControlTargetResponse.setGmtCreateTime(_ctx.stringValue("GetTrafficControlTargetResponse.GmtCreateTime"));
		getTrafficControlTargetResponse.setNewProductRegulation(_ctx.booleanValue("GetTrafficControlTargetResponse.NewProductRegulation"));

		SplitParts splitParts = new SplitParts();

		List<Long> timePoints = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetTrafficControlTargetResponse.SplitParts.TimePoints.Length"); i++) {
			timePoints.add(_ctx.longValue("GetTrafficControlTargetResponse.SplitParts.TimePoints["+ i +"]"));
		}
		splitParts.setTimePoints(timePoints);

		List<Long> setValues = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetTrafficControlTargetResponse.SplitParts.SetValues.Length"); i++) {
			setValues.add(_ctx.longValue("GetTrafficControlTargetResponse.SplitParts.SetValues["+ i +"]"));
		}
		splitParts.setSetValues(setValues);

		List<Long> setPoints = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetTrafficControlTargetResponse.SplitParts.SetPoints.Length"); i++) {
			setPoints.add(_ctx.longValue("GetTrafficControlTargetResponse.SplitParts.SetPoints["+ i +"]"));
		}
		splitParts.setSetPoints(setPoints);
		getTrafficControlTargetResponse.setSplitParts(splitParts);
	 
	 	return getTrafficControlTargetResponse;
	}
}