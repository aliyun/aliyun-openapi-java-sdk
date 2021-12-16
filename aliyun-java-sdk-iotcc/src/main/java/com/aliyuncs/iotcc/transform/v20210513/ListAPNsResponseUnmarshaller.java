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

package com.aliyuncs.iotcc.transform.v20210513;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotcc.model.v20210513.ListAPNsResponse;
import com.aliyuncs.iotcc.model.v20210513.ListAPNsResponse.IoTCloudConnectorGatewayModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAPNsResponseUnmarshaller {

	public static ListAPNsResponse unmarshall(ListAPNsResponse listAPNsResponse, UnmarshallerContext _ctx) {
		
		listAPNsResponse.setRequestId(_ctx.stringValue("ListAPNsResponse.RequestId"));
		listAPNsResponse.setTotalCount(_ctx.integerValue("ListAPNsResponse.TotalCount"));
		listAPNsResponse.setNextToken(_ctx.stringValue("ListAPNsResponse.NextToken"));
		listAPNsResponse.setMaxResults(_ctx.integerValue("ListAPNsResponse.MaxResults"));

		List<IoTCloudConnectorGatewayModel> aPNs = new ArrayList<IoTCloudConnectorGatewayModel>();
		for (int i = 0; i < _ctx.lengthValue("ListAPNsResponse.APNs.Length"); i++) {
			IoTCloudConnectorGatewayModel ioTCloudConnectorGatewayModel = new IoTCloudConnectorGatewayModel();
			ioTCloudConnectorGatewayModel.setISP(_ctx.stringValue("ListAPNsResponse.APNs["+ i +"].ISP"));
			ioTCloudConnectorGatewayModel.setAPN(_ctx.stringValue("ListAPNsResponse.APNs["+ i +"].APN"));
			ioTCloudConnectorGatewayModel.setName(_ctx.stringValue("ListAPNsResponse.APNs["+ i +"].Name"));
			ioTCloudConnectorGatewayModel.setDescription(_ctx.stringValue("ListAPNsResponse.APNs["+ i +"].Description"));

			List<String> zoneList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAPNsResponse.APNs["+ i +"].ZoneList.Length"); j++) {
				zoneList.add(_ctx.stringValue("ListAPNsResponse.APNs["+ i +"].ZoneList["+ j +"]"));
			}
			ioTCloudConnectorGatewayModel.setZoneList(zoneList);

			List<String> featureList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAPNsResponse.APNs["+ i +"].FeatureList.Length"); j++) {
				featureList.add(_ctx.stringValue("ListAPNsResponse.APNs["+ i +"].FeatureList["+ j +"]"));
			}
			ioTCloudConnectorGatewayModel.setFeatureList(featureList);

			aPNs.add(ioTCloudConnectorGatewayModel);
		}
		listAPNsResponse.setAPNs(aPNs);
	 
	 	return listAPNsResponse;
	}
}