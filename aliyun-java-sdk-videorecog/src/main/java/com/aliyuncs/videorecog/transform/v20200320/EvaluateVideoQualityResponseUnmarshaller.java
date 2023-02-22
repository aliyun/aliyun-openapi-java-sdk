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

package com.aliyuncs.videorecog.transform.v20200320;

import com.aliyuncs.videorecog.model.v20200320.EvaluateVideoQualityResponse;
import com.aliyuncs.videorecog.model.v20200320.EvaluateVideoQualityResponse.Data;
import com.aliyuncs.videorecog.model.v20200320.EvaluateVideoQualityResponse.Data.VideoQualityInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class EvaluateVideoQualityResponseUnmarshaller {

	public static EvaluateVideoQualityResponse unmarshall(EvaluateVideoQualityResponse evaluateVideoQualityResponse, UnmarshallerContext _ctx) {
		
		evaluateVideoQualityResponse.setRequestId(_ctx.stringValue("EvaluateVideoQualityResponse.RequestId"));
		evaluateVideoQualityResponse.setCode(_ctx.stringValue("EvaluateVideoQualityResponse.Code"));
		evaluateVideoQualityResponse.setMessage(_ctx.stringValue("EvaluateVideoQualityResponse.Message"));

		Data data = new Data();
		data.setJsonUrl(_ctx.stringValue("EvaluateVideoQualityResponse.Data.JsonUrl"));
		data.setPdfUrl(_ctx.stringValue("EvaluateVideoQualityResponse.Data.PdfUrl"));

		VideoQualityInfo videoQualityInfo = new VideoQualityInfo();
		videoQualityInfo.setCompressiveStrength(_ctx.floatValue("EvaluateVideoQualityResponse.Data.VideoQualityInfo.CompressiveStrength"));
		videoQualityInfo.setNoiseIntensity(_ctx.floatValue("EvaluateVideoQualityResponse.Data.VideoQualityInfo.NoiseIntensity"));
		videoQualityInfo.setBlurriness(_ctx.floatValue("EvaluateVideoQualityResponse.Data.VideoQualityInfo.Blurriness"));
		videoQualityInfo.setColorContrast(_ctx.floatValue("EvaluateVideoQualityResponse.Data.VideoQualityInfo.ColorContrast"));
		videoQualityInfo.setColorSaturation(_ctx.floatValue("EvaluateVideoQualityResponse.Data.VideoQualityInfo.ColorSaturation"));
		videoQualityInfo.setLuminance(_ctx.floatValue("EvaluateVideoQualityResponse.Data.VideoQualityInfo.Luminance"));
		videoQualityInfo.setColorfulness(_ctx.floatValue("EvaluateVideoQualityResponse.Data.VideoQualityInfo.Colorfulness"));
		videoQualityInfo.setMosScore(_ctx.floatValue("EvaluateVideoQualityResponse.Data.VideoQualityInfo.MosScore"));
		data.setVideoQualityInfo(videoQualityInfo);
		evaluateVideoQualityResponse.setData(data);
	 
	 	return evaluateVideoQualityResponse;
	}
}