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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.AddWatermarkResponse;
import com.aliyuncs.vod.model.v20170321.AddWatermarkResponse.WatermarkInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddWatermarkResponseUnmarshaller {

	public static AddWatermarkResponse unmarshall(AddWatermarkResponse addWatermarkResponse, UnmarshallerContext _ctx) {
		
		addWatermarkResponse.setRequestId(_ctx.stringValue("AddWatermarkResponse.RequestId"));

		WatermarkInfo watermarkInfo = new WatermarkInfo();
		watermarkInfo.setCreationTime(_ctx.stringValue("AddWatermarkResponse.WatermarkInfo.CreationTime"));
		watermarkInfo.setType(_ctx.stringValue("AddWatermarkResponse.WatermarkInfo.Type"));
		watermarkInfo.setIsDefault(_ctx.stringValue("AddWatermarkResponse.WatermarkInfo.IsDefault"));
		watermarkInfo.setWatermarkId(_ctx.stringValue("AddWatermarkResponse.WatermarkInfo.WatermarkId"));
		watermarkInfo.setName(_ctx.stringValue("AddWatermarkResponse.WatermarkInfo.Name"));
		watermarkInfo.setFileUrl(_ctx.stringValue("AddWatermarkResponse.WatermarkInfo.FileUrl"));
		watermarkInfo.setWatermarkConfig(_ctx.stringValue("AddWatermarkResponse.WatermarkInfo.WatermarkConfig"));
		addWatermarkResponse.setWatermarkInfo(watermarkInfo);
	 
	 	return addWatermarkResponse;
	}
}