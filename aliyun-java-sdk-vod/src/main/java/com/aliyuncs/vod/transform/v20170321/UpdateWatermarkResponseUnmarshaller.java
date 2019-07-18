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

import com.aliyuncs.vod.model.v20170321.UpdateWatermarkResponse;
import com.aliyuncs.vod.model.v20170321.UpdateWatermarkResponse.WatermarkInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateWatermarkResponseUnmarshaller {

	public static UpdateWatermarkResponse unmarshall(UpdateWatermarkResponse updateWatermarkResponse, UnmarshallerContext _ctx) {
		
		updateWatermarkResponse.setRequestId(_ctx.stringValue("UpdateWatermarkResponse.RequestId"));

		WatermarkInfo watermarkInfo = new WatermarkInfo();
		watermarkInfo.setCreationTime(_ctx.stringValue("UpdateWatermarkResponse.WatermarkInfo.CreationTime"));
		watermarkInfo.setType(_ctx.stringValue("UpdateWatermarkResponse.WatermarkInfo.Type"));
		watermarkInfo.setIsDefault(_ctx.stringValue("UpdateWatermarkResponse.WatermarkInfo.IsDefault"));
		watermarkInfo.setWatermarkId(_ctx.stringValue("UpdateWatermarkResponse.WatermarkInfo.WatermarkId"));
		watermarkInfo.setName(_ctx.stringValue("UpdateWatermarkResponse.WatermarkInfo.Name"));
		watermarkInfo.setFileUrl(_ctx.stringValue("UpdateWatermarkResponse.WatermarkInfo.FileUrl"));
		watermarkInfo.setWatermarkConfig(_ctx.stringValue("UpdateWatermarkResponse.WatermarkInfo.WatermarkConfig"));
		updateWatermarkResponse.setWatermarkInfo(watermarkInfo);
	 
	 	return updateWatermarkResponse;
	}
}