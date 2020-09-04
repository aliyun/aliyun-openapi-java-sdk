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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.GetImageQualityResponse;
import com.aliyuncs.imm.model.v20170906.GetImageQualityResponse.ImageQuality;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageQualityResponseUnmarshaller {

	public static GetImageQualityResponse unmarshall(GetImageQualityResponse getImageQualityResponse, UnmarshallerContext _ctx) {
		
		getImageQualityResponse.setRequestId(_ctx.stringValue("GetImageQualityResponse.RequestId"));
		getImageQualityResponse.setImageUri(_ctx.stringValue("GetImageQualityResponse.ImageUri"));

		ImageQuality imageQuality = new ImageQuality();
		imageQuality.setOverallScore(_ctx.floatValue("GetImageQualityResponse.ImageQuality.OverallScore"));
		imageQuality.setClarityScore(_ctx.floatValue("GetImageQualityResponse.ImageQuality.ClarityScore"));
		imageQuality.setClarity(_ctx.floatValue("GetImageQualityResponse.ImageQuality.Clarity"));
		imageQuality.setExposureScore(_ctx.floatValue("GetImageQualityResponse.ImageQuality.ExposureScore"));
		imageQuality.setExposure(_ctx.floatValue("GetImageQualityResponse.ImageQuality.Exposure"));
		imageQuality.setContrastScore(_ctx.floatValue("GetImageQualityResponse.ImageQuality.ContrastScore"));
		imageQuality.setContrast(_ctx.floatValue("GetImageQualityResponse.ImageQuality.Contrast"));
		imageQuality.setColorScore(_ctx.floatValue("GetImageQualityResponse.ImageQuality.ColorScore"));
		imageQuality.setColor(_ctx.floatValue("GetImageQualityResponse.ImageQuality.Color"));
		imageQuality.setCompositionScore(_ctx.floatValue("GetImageQualityResponse.ImageQuality.CompositionScore"));
		getImageQualityResponse.setImageQuality(imageQuality);
	 
	 	return getImageQualityResponse;
	}
}