/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.green.transform.v20160525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20160525.ImageDetectionResponse;
import com.aliyuncs.green.model.v20160525.ImageDetectionResponse.ImageResult;
import com.aliyuncs.green.model.v20160525.ImageDetectionResponse.ImageResult.ErrorResult;
import com.aliyuncs.green.model.v20160525.ImageDetectionResponse.ImageResult.IllegalResult;
import com.aliyuncs.green.model.v20160525.ImageDetectionResponse.ImageResult.OcrResult;
import com.aliyuncs.green.model.v20160525.ImageDetectionResponse.ImageResult.PornResult;
import com.aliyuncs.green.model.v20160525.ImageDetectionResponse.ImageResult.SpamResult;
import com.aliyuncs.green.model.v20160525.ImageDetectionResponse.ImageResult.SpamResult.KeywordResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImageDetectionResponseUnmarshaller {

	public static ImageDetectionResponse unmarshall(ImageDetectionResponse imageDetectionResponse, UnmarshallerContext context) {
		
		imageDetectionResponse.setCode(context.stringValue("ImageDetectionResponse.Code"));
		imageDetectionResponse.setMsg(context.stringValue("ImageDetectionResponse.Msg"));

		List<ImageResult> imageResults = new ArrayList<ImageResult>();
		for (int i = 0; i < context.lengthValue("ImageDetectionResponse.ImageResults.Length"); i++) {
			ImageResult imageResult = new ImageResult();
			imageResult.setTaskId(context.stringValue("ImageDetectionResponse.ImageResults["+ i +"].TaskId"));
			imageResult.setImageName(context.stringValue("ImageDetectionResponse.ImageResults["+ i +"].ImageName"));

			PornResult pornResult = new PornResult();
			pornResult.setRate(context.floatValue("ImageDetectionResponse.ImageResults["+ i +"].PornResult.Rate"));
			pornResult.setLabel(context.integerValue("ImageDetectionResponse.ImageResults["+ i +"].PornResult.Label"));
			imageResult.setPornResult(pornResult);

			IllegalResult illegalResult = new IllegalResult();
			illegalResult.setRate(context.floatValue("ImageDetectionResponse.ImageResults["+ i +"].IllegalResult.Rate"));
			illegalResult.setLabel(context.integerValue("ImageDetectionResponse.ImageResults["+ i +"].IllegalResult.Label"));
			imageResult.setIllegalResult(illegalResult);

			OcrResult ocrResult = new OcrResult();

			List<String> text = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ImageDetectionResponse.ImageResults["+ i +"].OcrResult.Text.Length"); j++) {
				text.add(context.stringValue("ImageDetectionResponse.ImageResults["+ i +"].OcrResult.Text["+ j +"]"));
			}
			ocrResult.setText(text);
			imageResult.setOcrResult(ocrResult);

			SpamResult spamResult = new SpamResult();
			spamResult.setHit(context.booleanValue("ImageDetectionResponse.ImageResults["+ i +"].SpamResult.Hit"));

			List<KeywordResult> keywordResults = new ArrayList<KeywordResult>();
			for (int j = 0; j < context.lengthValue("ImageDetectionResponse.ImageResults["+ i +"].SpamResult.KeywordResults.Length"); j++) {
				KeywordResult keywordResult = new KeywordResult();
				keywordResult.setKeywordCtx(context.stringValue("ImageDetectionResponse.ImageResults["+ i +"].SpamResult.KeywordResults["+ j +"].KeywordCtx"));
				keywordResult.setKeywordType(context.stringValue("ImageDetectionResponse.ImageResults["+ i +"].SpamResult.KeywordResults["+ j +"].KeywordType"));

				keywordResults.add(keywordResult);
			}
			spamResult.setKeywordResults(keywordResults);
			imageResult.setSpamResult(spamResult);

			ErrorResult errorResult = new ErrorResult();
			errorResult.setCode(context.stringValue("ImageDetectionResponse.ImageResults["+ i +"].ErrorResult.Code"));
			errorResult.setMsg(context.stringValue("ImageDetectionResponse.ImageResults["+ i +"].ErrorResult.Msg"));
			imageResult.setErrorResult(errorResult);

			imageResults.add(imageResult);
		}
		imageDetectionResponse.setImageResults(imageResults);
	 
	 	return imageDetectionResponse;
	}
}