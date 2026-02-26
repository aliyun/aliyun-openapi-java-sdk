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

import com.aliyuncs.ehpc.model.v20180412.InspectImageResponse;
import com.aliyuncs.ehpc.model.v20180412.InspectImageResponse.ImageStatus;
import com.aliyuncs.ehpc.model.v20180412.InspectImageResponse.ImageStatus.ImageInspectInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class InspectImageResponseUnmarshaller {

	public static InspectImageResponse unmarshall(InspectImageResponse inspectImageResponse, UnmarshallerContext _ctx) {
		
		inspectImageResponse.setRequestId(_ctx.stringValue("InspectImageResponse.RequestId"));

		ImageStatus imageStatus = new ImageStatus();

		ImageInspectInfo imageInspectInfo = new ImageInspectInfo();
		imageInspectInfo.setBuildArch(_ctx.stringValue("InspectImageResponse.ImageStatus.ImageInspectInfo.BuildArch"));
		imageInspectInfo.setBuildDate(_ctx.stringValue("InspectImageResponse.ImageStatus.ImageInspectInfo.BuildDate"));
		imageInspectInfo.setBootStrap(_ctx.stringValue("InspectImageResponse.ImageStatus.ImageInspectInfo.BootStrap"));
		imageInspectInfo.setDefFrom(_ctx.stringValue("InspectImageResponse.ImageStatus.ImageInspectInfo.DefFrom"));
		imageInspectInfo.setContainerVersion(_ctx.stringValue("InspectImageResponse.ImageStatus.ImageInspectInfo.ContainerVersion"));
		imageInspectInfo.setSchemaVersion(_ctx.stringValue("InspectImageResponse.ImageStatus.ImageInspectInfo.SchemaVersion"));
		imageStatus.setImageInspectInfo(imageInspectInfo);
		inspectImageResponse.setImageStatus(imageStatus);
	 
	 	return inspectImageResponse;
	}
}