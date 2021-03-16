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

package com.aliyuncs.reid_cloud.transform.v20201029;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid_cloud.model.v20201029.ListDevicesImagesResponse;
import com.aliyuncs.reid_cloud.model.v20201029.ListDevicesImagesResponse.DeviceImage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevicesImagesResponseUnmarshaller {

	public static ListDevicesImagesResponse unmarshall(ListDevicesImagesResponse listDevicesImagesResponse, UnmarshallerContext _ctx) {
		
		listDevicesImagesResponse.setRequestId(_ctx.stringValue("ListDevicesImagesResponse.RequestId"));
		listDevicesImagesResponse.setErrorCode(_ctx.stringValue("ListDevicesImagesResponse.ErrorCode"));
		listDevicesImagesResponse.setErrorMessage(_ctx.stringValue("ListDevicesImagesResponse.ErrorMessage"));
		listDevicesImagesResponse.setMessage(_ctx.stringValue("ListDevicesImagesResponse.Message"));
		listDevicesImagesResponse.setCode(_ctx.stringValue("ListDevicesImagesResponse.Code"));
		listDevicesImagesResponse.setDynamicCode(_ctx.stringValue("ListDevicesImagesResponse.DynamicCode"));
		listDevicesImagesResponse.setSuccess(_ctx.booleanValue("ListDevicesImagesResponse.Success"));
		listDevicesImagesResponse.setDynamicMessage(_ctx.stringValue("ListDevicesImagesResponse.DynamicMessage"));

		List<DeviceImage> deviceImages = new ArrayList<DeviceImage>();
		for (int i = 0; i < _ctx.lengthValue("ListDevicesImagesResponse.DeviceImages.Length"); i++) {
			DeviceImage deviceImage = new DeviceImage();
			deviceImage.setIpcId(_ctx.longValue("ListDevicesImagesResponse.DeviceImages["+ i +"].IpcId"));
			deviceImage.setImageUrl(_ctx.stringValue("ListDevicesImagesResponse.DeviceImages["+ i +"].ImageUrl"));

			deviceImages.add(deviceImage);
		}
		listDevicesImagesResponse.setDeviceImages(deviceImages);
	 
	 	return listDevicesImagesResponse;
	}
}