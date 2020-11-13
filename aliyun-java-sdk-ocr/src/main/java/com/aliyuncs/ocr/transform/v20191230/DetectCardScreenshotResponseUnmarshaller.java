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

package com.aliyuncs.ocr.transform.v20191230;

import com.aliyuncs.ocr.model.v20191230.DetectCardScreenshotResponse;
import com.aliyuncs.ocr.model.v20191230.DetectCardScreenshotResponse.Data;
import com.aliyuncs.ocr.model.v20191230.DetectCardScreenshotResponse.Data.SpoofResult;
import com.aliyuncs.ocr.model.v20191230.DetectCardScreenshotResponse.Data.SpoofResult.ResultMap;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectCardScreenshotResponseUnmarshaller {

	public static DetectCardScreenshotResponse unmarshall(DetectCardScreenshotResponse detectCardScreenshotResponse, UnmarshallerContext _ctx) {
		
		detectCardScreenshotResponse.setRequestId(_ctx.stringValue("DetectCardScreenshotResponse.RequestId"));

		Data data = new Data();
		data.setIsCard(_ctx.booleanValue("DetectCardScreenshotResponse.Data.IsCard"));
		data.setIsBlur(_ctx.booleanValue("DetectCardScreenshotResponse.Data.IsBlur"));

		SpoofResult spoofResult = new SpoofResult();
		spoofResult.setIsSpoof(_ctx.booleanValue("DetectCardScreenshotResponse.Data.SpoofResult.IsSpoof"));

		ResultMap resultMap = new ResultMap();
		resultMap.setScreenScore(_ctx.floatValue("DetectCardScreenshotResponse.Data.SpoofResult.ResultMap.ScreenScore"));
		resultMap.setScreenThreshold(_ctx.floatValue("DetectCardScreenshotResponse.Data.SpoofResult.ResultMap.ScreenThreshold"));
		spoofResult.setResultMap(resultMap);
		data.setSpoofResult(spoofResult);
		detectCardScreenshotResponse.setData(data);
	 
	 	return detectCardScreenshotResponse;
	}
}