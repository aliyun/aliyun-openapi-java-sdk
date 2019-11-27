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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeDrdsComponentsResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsComponentsResponse.DrdsComponent;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsComponentsResponse.DrdsComponent.DrdsAzoneInfo;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsComponentsResponse.DrdsComponent.DrdsSeries;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsComponentsResponseUnmarshaller {

	public static DescribeDrdsComponentsResponse unmarshall(DescribeDrdsComponentsResponse describeDrdsComponentsResponse, UnmarshallerContext _ctx) {
		
		describeDrdsComponentsResponse.setRequestId(_ctx.stringValue("DescribeDrdsComponentsResponse.RequestId"));
		describeDrdsComponentsResponse.setSuccess(_ctx.booleanValue("DescribeDrdsComponentsResponse.Success"));

		List<DrdsComponent> drdsComponents = new ArrayList<DrdsComponent>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsComponentsResponse.DrdsComponents.Length"); i++) {
			DrdsComponent drdsComponent = new DrdsComponent();
			drdsComponent.setRegionId(_ctx.stringValue("DescribeDrdsComponentsResponse.DrdsComponents["+ i +"].RegionId"));
			drdsComponent.setRegionName(_ctx.stringValue("DescribeDrdsComponentsResponse.DrdsComponents["+ i +"].RegionName"));

			List<String> mysqlVersions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDrdsComponentsResponse.DrdsComponents["+ i +"].MysqlVersions.Length"); j++) {
				mysqlVersions.add(_ctx.stringValue("DescribeDrdsComponentsResponse.DrdsComponents["+ i +"].MysqlVersions["+ j +"]"));
			}
			drdsComponent.setMysqlVersions(mysqlVersions);

			List<DrdsAzoneInfo> drdsAzoneInfos = new ArrayList<DrdsAzoneInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDrdsComponentsResponse.DrdsComponents["+ i +"].DrdsAzoneInfos.Length"); j++) {
				DrdsAzoneInfo drdsAzoneInfo = new DrdsAzoneInfo();
				drdsAzoneInfo.setZoneId(_ctx.stringValue("DescribeDrdsComponentsResponse.DrdsComponents["+ i +"].DrdsAzoneInfos["+ j +"].ZoneId"));
				drdsAzoneInfo.setZoneName(_ctx.stringValue("DescribeDrdsComponentsResponse.DrdsComponents["+ i +"].DrdsAzoneInfos["+ j +"].ZoneName"));
				drdsAzoneInfo.setSupportVpc(_ctx.booleanValue("DescribeDrdsComponentsResponse.DrdsComponents["+ i +"].DrdsAzoneInfos["+ j +"].SupportVpc"));
				drdsAzoneInfo.setSupportClassic(_ctx.booleanValue("DescribeDrdsComponentsResponse.DrdsComponents["+ i +"].DrdsAzoneInfos["+ j +"].SupportClassic"));

				drdsAzoneInfos.add(drdsAzoneInfo);
			}
			drdsComponent.setDrdsAzoneInfos(drdsAzoneInfos);

			List<DrdsSeries> drdsSeriesList = new ArrayList<DrdsSeries>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDrdsComponentsResponse.DrdsComponents["+ i +"].DrdsSeriesList.Length"); j++) {
				DrdsSeries drdsSeries = new DrdsSeries();
				drdsSeries.setSeriesName(_ctx.stringValue("DescribeDrdsComponentsResponse.DrdsComponents["+ i +"].DrdsSeriesList["+ j +"].SeriesName"));
				drdsSeries.setSeries(_ctx.stringValue("DescribeDrdsComponentsResponse.DrdsComponents["+ i +"].DrdsSeriesList["+ j +"].Series"));

				List<String> specs = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDrdsComponentsResponse.DrdsComponents["+ i +"].DrdsSeriesList["+ j +"].Specs.Length"); k++) {
					specs.add(_ctx.stringValue("DescribeDrdsComponentsResponse.DrdsComponents["+ i +"].DrdsSeriesList["+ j +"].Specs["+ k +"]"));
				}
				drdsSeries.setSpecs(specs);

				drdsSeriesList.add(drdsSeries);
			}
			drdsComponent.setDrdsSeriesList(drdsSeriesList);

			drdsComponents.add(drdsComponent);
		}
		describeDrdsComponentsResponse.setDrdsComponents(drdsComponents);
	 
	 	return describeDrdsComponentsResponse;
	}
}