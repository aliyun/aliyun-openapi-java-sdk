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

import com.aliyuncs.vod.model.v20170321.GetWatermarkResponse;
import com.aliyuncs.vod.model.v20170321.GetWatermarkResponse.WatermarkInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWatermarkResponseUnmarshaller {

	public static GetWatermarkResponse unmarshall(GetWatermarkResponse getWatermarkResponse, UnmarshallerContext context) {
		
		getWatermarkResponse.setRequestId(context.stringValue("GetWatermarkResponse.RequestId"));

		WatermarkInfo watermarkInfo = new WatermarkInfo();
		watermarkInfo.setCreationTime(context.stringValue("GetWatermarkResponse.WatermarkInfo.CreationTime"));
		watermarkInfo.setType(context.stringValue("GetWatermarkResponse.WatermarkInfo.Type"));
		watermarkInfo.setIsDefault(context.stringValue("GetWatermarkResponse.WatermarkInfo.IsDefault"));
		watermarkInfo.setWatermarkId(context.stringValue("GetWatermarkResponse.WatermarkInfo.WatermarkId"));
		watermarkInfo.setName(context.stringValue("GetWatermarkResponse.WatermarkInfo.Name"));
		watermarkInfo.setFileUrl(context.stringValue("GetWatermarkResponse.WatermarkInfo.FileUrl"));
		watermarkInfo.setWatermarkConfig(context.stringValue("GetWatermarkResponse.WatermarkInfo.WatermarkConfig"));
		getWatermarkResponse.setWatermarkInfo(watermarkInfo);
	 
	 	return getWatermarkResponse;
	}
}