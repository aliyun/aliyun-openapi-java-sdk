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

package com.aliyuncs.objectdet.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.objectdet.model.v20191230.ClassifyVehicleInsuranceResponse;
import com.aliyuncs.objectdet.model.v20191230.ClassifyVehicleInsuranceResponse.Data;
import com.aliyuncs.objectdet.model.v20191230.ClassifyVehicleInsuranceResponse.Data.Label;
import com.aliyuncs.transform.UnmarshallerContext;


public class ClassifyVehicleInsuranceResponseUnmarshaller {

	public static ClassifyVehicleInsuranceResponse unmarshall(ClassifyVehicleInsuranceResponse classifyVehicleInsuranceResponse, UnmarshallerContext _ctx) {
		
		classifyVehicleInsuranceResponse.setRequestId(_ctx.stringValue("ClassifyVehicleInsuranceResponse.RequestId"));

		Data data = new Data();
		data.setThreshold(_ctx.floatValue("ClassifyVehicleInsuranceResponse.Data.Threshold"));

		List<Label> labels = new ArrayList<Label>();
		for (int i = 0; i < _ctx.lengthValue("ClassifyVehicleInsuranceResponse.Data.Labels.Length"); i++) {
			Label label = new Label();
			label.setScore(_ctx.floatValue("ClassifyVehicleInsuranceResponse.Data.Labels["+ i +"].Score"));
			label.setName(_ctx.stringValue("ClassifyVehicleInsuranceResponse.Data.Labels["+ i +"].Name"));

			labels.add(label);
		}
		data.setLabels(labels);
		classifyVehicleInsuranceResponse.setData(data);
	 
	 	return classifyVehicleInsuranceResponse;
	}
}