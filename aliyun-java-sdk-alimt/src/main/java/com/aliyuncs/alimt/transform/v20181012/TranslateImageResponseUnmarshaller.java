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

package com.aliyuncs.alimt.transform.v20181012;

import com.aliyuncs.alimt.model.v20181012.TranslateImageResponse;
import com.aliyuncs.alimt.model.v20181012.TranslateImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class TranslateImageResponseUnmarshaller {

	public static TranslateImageResponse unmarshall(TranslateImageResponse translateImageResponse, UnmarshallerContext _ctx) {
		
		translateImageResponse.setRequestId(_ctx.stringValue("TranslateImageResponse.RequestId"));
		translateImageResponse.setCode(_ctx.integerValue("TranslateImageResponse.Code"));
		translateImageResponse.setMessage(_ctx.stringValue("TranslateImageResponse.Message"));

		Data data = new Data();
		data.setInPaintingUrl(_ctx.stringValue("TranslateImageResponse.Data.InPaintingUrl"));
		data.setTemplateJson(_ctx.stringValue("TranslateImageResponse.Data.TemplateJson"));
		data.setFinalImageUrl(_ctx.stringValue("TranslateImageResponse.Data.FinalImageUrl"));
		translateImageResponse.setData(data);
	 
	 	return translateImageResponse;
	}
}