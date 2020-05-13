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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListDeviceBrandsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListDeviceBrandsResponse.DeviceBrandsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceBrandsResponseUnmarshaller {

	public static ListDeviceBrandsResponse unmarshall(ListDeviceBrandsResponse listDeviceBrandsResponse, UnmarshallerContext _ctx) {
		
		listDeviceBrandsResponse.setRequestId(_ctx.stringValue("ListDeviceBrandsResponse.RequestId"));

		List<DeviceBrandsItem> deviceBrands = new ArrayList<DeviceBrandsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceBrandsResponse.DeviceBrands.Length"); i++) {
			DeviceBrandsItem deviceBrandsItem = new DeviceBrandsItem();
			deviceBrandsItem.setDeviceBrandId(_ctx.longValue("ListDeviceBrandsResponse.DeviceBrands["+ i +"].DeviceBrandId"));
			deviceBrandsItem.setDeviceBrand(_ctx.stringValue("ListDeviceBrandsResponse.DeviceBrands["+ i +"].DeviceBrand"));
			deviceBrandsItem.setProjectId(_ctx.stringValue("ListDeviceBrandsResponse.DeviceBrands["+ i +"].ProjectId"));
			deviceBrandsItem.setManufacture(_ctx.stringValue("ListDeviceBrandsResponse.DeviceBrands["+ i +"].Manufacture"));
			deviceBrandsItem.setDescription(_ctx.stringValue("ListDeviceBrandsResponse.DeviceBrands["+ i +"].Description"));

			deviceBrands.add(deviceBrandsItem);
		}
		listDeviceBrandsResponse.setDeviceBrands(deviceBrands);
	 
	 	return listDeviceBrandsResponse;
	}
}