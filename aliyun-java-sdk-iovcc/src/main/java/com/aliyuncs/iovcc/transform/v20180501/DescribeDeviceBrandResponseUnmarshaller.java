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

package com.aliyuncs.iovcc.transform.v20180501;

import com.aliyuncs.iovcc.model.v20180501.DescribeDeviceBrandResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeDeviceBrandResponse.DeviceBrand;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceBrandResponseUnmarshaller {

	public static DescribeDeviceBrandResponse unmarshall(DescribeDeviceBrandResponse describeDeviceBrandResponse, UnmarshallerContext _ctx) {
		
		describeDeviceBrandResponse.setRequestId(_ctx.stringValue("DescribeDeviceBrandResponse.RequestId"));

		DeviceBrand deviceBrand = new DeviceBrand();
		deviceBrand.setDeviceBrandId(_ctx.longValue("DescribeDeviceBrandResponse.DeviceBrand.DeviceBrandId"));
		deviceBrand.setDeviceBrand(_ctx.stringValue("DescribeDeviceBrandResponse.DeviceBrand.DeviceBrand"));
		deviceBrand.setProjectId(_ctx.stringValue("DescribeDeviceBrandResponse.DeviceBrand.ProjectId"));
		deviceBrand.setManufacture(_ctx.stringValue("DescribeDeviceBrandResponse.DeviceBrand.Manufacture"));
		deviceBrand.setDescription(_ctx.stringValue("DescribeDeviceBrandResponse.DeviceBrand.Description"));
		describeDeviceBrandResponse.setDeviceBrand(deviceBrand);
	 
	 	return describeDeviceBrandResponse;
	}
}