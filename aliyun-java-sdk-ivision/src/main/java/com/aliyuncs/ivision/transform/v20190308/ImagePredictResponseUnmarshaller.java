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

package com.aliyuncs.ivision.transform.v20190308;

import com.aliyuncs.ivision.model.v20190308.ImagePredictResponse;
import com.aliyuncs.ivision.model.v20190308.ImagePredictResponse.ImagePredict;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImagePredictResponseUnmarshaller {

	public static ImagePredictResponse unmarshall(ImagePredictResponse imagePredictResponse, UnmarshallerContext _ctx) {
		
		imagePredictResponse.setRequestId(_ctx.stringValue("ImagePredictResponse.RequestId"));

		ImagePredict imagePredict = new ImagePredict();
		imagePredict.setStatus(_ctx.stringValue("ImagePredictResponse.ImagePredict.Status"));
		imagePredict.setPredictResult(_ctx.stringValue("ImagePredictResponse.ImagePredict.PredictResult"));
		imagePredict.setPredictId(_ctx.stringValue("ImagePredictResponse.ImagePredict.PredictId"));
		imagePredict.setPredictTime(_ctx.stringValue("ImagePredictResponse.ImagePredict.PredictTime"));
		imagePredict.setDataUrl(_ctx.stringValue("ImagePredictResponse.ImagePredict.DataUrl"));
		imagePredict.setCode(_ctx.stringValue("ImagePredictResponse.ImagePredict.Code"));
		imagePredict.setMessage(_ctx.stringValue("ImagePredictResponse.ImagePredict.Message"));
		imagePredict.setModelId(_ctx.stringValue("ImagePredictResponse.ImagePredict.ModelId"));
		imagePredictResponse.setImagePredict(imagePredict);
	 
	 	return imagePredictResponse;
	}
}