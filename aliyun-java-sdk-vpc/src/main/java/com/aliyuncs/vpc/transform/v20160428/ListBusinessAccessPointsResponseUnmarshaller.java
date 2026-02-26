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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.ListBusinessAccessPointsResponse;
import com.aliyuncs.vpc.model.v20160428.ListBusinessAccessPointsResponse.BusinessAccessPointsItem;
import com.aliyuncs.vpc.model.v20160428.ListBusinessAccessPointsResponse.BusinessAccessPointsItem.OpticalModuleModelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBusinessAccessPointsResponseUnmarshaller {

	public static ListBusinessAccessPointsResponse unmarshall(ListBusinessAccessPointsResponse listBusinessAccessPointsResponse, UnmarshallerContext _ctx) {
		
		listBusinessAccessPointsResponse.setRequestId(_ctx.stringValue("ListBusinessAccessPointsResponse.RequestId"));

		List<BusinessAccessPointsItem> businessAccessPoints = new ArrayList<BusinessAccessPointsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBusinessAccessPointsResponse.BusinessAccessPoints.Length"); i++) {
			BusinessAccessPointsItem businessAccessPointsItem = new BusinessAccessPointsItem();
			businessAccessPointsItem.setAccessPointId(_ctx.stringValue("ListBusinessAccessPointsResponse.BusinessAccessPoints["+ i +"].AccessPointId"));
			businessAccessPointsItem.setAccessPointName(_ctx.stringValue("ListBusinessAccessPointsResponse.BusinessAccessPoints["+ i +"].AccessPointName"));
			businessAccessPointsItem.setSupportLineOperator(_ctx.stringValue("ListBusinessAccessPointsResponse.BusinessAccessPoints["+ i +"].SupportLineOperator"));
			businessAccessPointsItem.setSupportPortTypes(_ctx.stringValue("ListBusinessAccessPointsResponse.BusinessAccessPoints["+ i +"].SupportPortTypes"));
			businessAccessPointsItem.setCloudBoxInstanceIds(_ctx.stringValue("ListBusinessAccessPointsResponse.BusinessAccessPoints["+ i +"].CloudBoxInstanceIds"));
			businessAccessPointsItem.setLongitude(_ctx.doubleValue("ListBusinessAccessPointsResponse.BusinessAccessPoints["+ i +"].Longitude"));
			businessAccessPointsItem.setLatitude(_ctx.doubleValue("ListBusinessAccessPointsResponse.BusinessAccessPoints["+ i +"].Latitude"));

			List<OpticalModuleModelsItem> opticalModuleModels = new ArrayList<OpticalModuleModelsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListBusinessAccessPointsResponse.BusinessAccessPoints["+ i +"].OpticalModuleModels.Length"); j++) {
				OpticalModuleModelsItem opticalModuleModelsItem = new OpticalModuleModelsItem();
				opticalModuleModelsItem.setPortType(_ctx.stringValue("ListBusinessAccessPointsResponse.BusinessAccessPoints["+ i +"].OpticalModuleModels["+ j +"].PortType"));
				opticalModuleModelsItem.setOpticalModuleModel(_ctx.stringValue("ListBusinessAccessPointsResponse.BusinessAccessPoints["+ i +"].OpticalModuleModels["+ j +"].OpticalModuleModel"));

				opticalModuleModels.add(opticalModuleModelsItem);
			}
			businessAccessPointsItem.setOpticalModuleModels(opticalModuleModels);

			businessAccessPoints.add(businessAccessPointsItem);
		}
		listBusinessAccessPointsResponse.setBusinessAccessPoints(businessAccessPoints);
	 
	 	return listBusinessAccessPointsResponse;
	}
}