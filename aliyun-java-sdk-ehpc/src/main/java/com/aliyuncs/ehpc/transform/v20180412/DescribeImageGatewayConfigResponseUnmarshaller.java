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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.DescribeImageGatewayConfigResponse;
import com.aliyuncs.ehpc.model.v20180412.DescribeImageGatewayConfigResponse.Imagegw;
import com.aliyuncs.ehpc.model.v20180412.DescribeImageGatewayConfigResponse.Imagegw.LocationInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageGatewayConfigResponseUnmarshaller {

	public static DescribeImageGatewayConfigResponse unmarshall(DescribeImageGatewayConfigResponse describeImageGatewayConfigResponse, UnmarshallerContext _ctx) {
		
		describeImageGatewayConfigResponse.setRequestId(_ctx.stringValue("DescribeImageGatewayConfigResponse.RequestId"));

		Imagegw imagegw = new Imagegw();
		imagegw.setDefaultImageLocation(_ctx.stringValue("DescribeImageGatewayConfigResponse.Imagegw.DefaultImageLocation"));
		imagegw.setPullUpdateTimeout(_ctx.longValue("DescribeImageGatewayConfigResponse.Imagegw.PullUpdateTimeout"));
		imagegw.setMongoDBURI(_ctx.stringValue("DescribeImageGatewayConfigResponse.Imagegw.MongoDBURI"));
		imagegw.setImageExpirationTimeout(_ctx.stringValue("DescribeImageGatewayConfigResponse.Imagegw.ImageExpirationTimeout"));
		imagegw.setUpdateDateTime(_ctx.stringValue("DescribeImageGatewayConfigResponse.Imagegw.UpdateDateTime"));

		List<LocationInfo> locations = new ArrayList<LocationInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageGatewayConfigResponse.Imagegw.Locations.Length"); i++) {
			LocationInfo locationInfo = new LocationInfo();
			locationInfo.setLocation(_ctx.stringValue("DescribeImageGatewayConfigResponse.Imagegw.Locations["+ i +"].Location"));
			locationInfo.setRemoteType(_ctx.stringValue("DescribeImageGatewayConfigResponse.Imagegw.Locations["+ i +"].RemoteType"));
			locationInfo.setAuthentication(_ctx.stringValue("DescribeImageGatewayConfigResponse.Imagegw.Locations["+ i +"].Authentication"));
			locationInfo.setURL(_ctx.stringValue("DescribeImageGatewayConfigResponse.Imagegw.Locations["+ i +"].URL"));

			locations.add(locationInfo);
		}
		imagegw.setLocations(locations);
		describeImageGatewayConfigResponse.setImagegw(imagegw);
	 
	 	return describeImageGatewayConfigResponse;
	}
}