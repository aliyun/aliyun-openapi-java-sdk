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
package com.aliyuncs.green.transform.v20160616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20160616.ImageResultsResponse;
import com.aliyuncs.green.model.v20160616.ImageResultsResponse.ImageDetectResult;
import com.aliyuncs.green.model.v20160616.ImageResultsResponse.ImageDetectResult.ImageResult;
import com.aliyuncs.green.model.v20160616.ImageResultsResponse.ImageDetectResult.ImageResult.ErrorResult;
import com.aliyuncs.green.model.v20160616.ImageResultsResponse.ImageDetectResult.ImageResult.IllegalResult;
import com.aliyuncs.green.model.v20160616.ImageResultsResponse.ImageDetectResult.ImageResult.OcrResult;
import com.aliyuncs.green.model.v20160616.ImageResultsResponse.ImageDetectResult.ImageResult.PornResult;
import com.aliyuncs.green.model.v20160616.ImageResultsResponse.ImageDetectResult.ImageResult.QrcodeResult;
import com.aliyuncs.green.model.v20160616.ImageResultsResponse.ImageDetectResult.ImageResult.SpamResult;
import com.aliyuncs.green.model.v20160616.ImageResultsResponse.ImageDetectResult.ImageResult.SpamResult.KeywordResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImageResultsResponseUnmarshaller {

	public static ImageResultsResponse unmarshall(ImageResultsResponse imageResultsResponse, UnmarshallerContext context) {
		
		imageResultsResponse.setCode(context.stringValue("ImageResultsResponse.Code"));
		imageResultsResponse.setMsg(context.stringValue("ImageResultsResponse.Msg"));

		List<ImageDetectResult> imageDetectResults = new ArrayList<ImageDetectResult>();
		for (int i = 0; i < context.lengthValue("ImageResultsResponse.ImageDetectResults.Length"); i++) {
			ImageDetectResult imageDetectResult = new ImageDetectResult();
			imageDetectResult.setCode(context.stringValue("ImageResultsResponse.ImageDetectResults["+ i +"].Code"));
			imageDetectResult.setMsg(context.stringValue("ImageResultsResponse.ImageDetectResults["+ i +"].Msg"));
			imageDetectResult.setStatus(context.stringValue("ImageResultsResponse.ImageDetectResults["+ i +"].Status"));

			ImageResult imageResult = new ImageResult();
			imageResult.setTaskId(context.stringValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.TaskId"));
			imageResult.setImageName(context.stringValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.ImageName"));

			PornResult pornResult = new PornResult();
			pornResult.setRate(context.floatValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.PornResult.Rate"));
			pornResult.setLabel(context.integerValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.PornResult.Label"));
			imageResult.setPornResult(pornResult);

			IllegalResult illegalResult = new IllegalResult();
			illegalResult.setRate(context.floatValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.IllegalResult.Rate"));
			illegalResult.setLabel(context.integerValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.IllegalResult.Label"));
			imageResult.setIllegalResult(illegalResult);

			OcrResult ocrResult = new OcrResult();

			List<String> text = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.OcrResult.Text.Length"); j++) {
				text.add(context.stringValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.OcrResult.Text["+ j +"]"));
			}
			ocrResult.setText(text);
			imageResult.setOcrResult(ocrResult);

			SpamResult spamResult = new SpamResult();
			spamResult.setHit(context.booleanValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.SpamResult.Hit"));

			List<KeywordResult> keywordResults = new ArrayList<KeywordResult>();
			for (int j = 0; j < context.lengthValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.SpamResult.KeywordResults.Length"); j++) {
				KeywordResult keywordResult = new KeywordResult();
				keywordResult.setKeywordCtx(context.stringValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.SpamResult.KeywordResults["+ j +"].KeywordCtx"));
				keywordResult.setKeywordType(context.stringValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.SpamResult.KeywordResults["+ j +"].KeywordType"));

				keywordResults.add(keywordResult);
			}
			spamResult.setKeywordResults(keywordResults);
			imageResult.setSpamResult(spamResult);

			QrcodeResult qrcodeResult = new QrcodeResult();

			List<String> qrcodeList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.QrcodeResult.QrcodeList.Length"); j++) {
				qrcodeList.add(context.stringValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.QrcodeResult.QrcodeList["+ j +"]"));
			}
			qrcodeResult.setQrcodeList(qrcodeList);
			imageResult.setQrcodeResult(qrcodeResult);

			ErrorResult errorResult = new ErrorResult();
			errorResult.setCode(context.stringValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.ErrorResult.Code"));
			errorResult.setMsg(context.stringValue("ImageResultsResponse.ImageDetectResults["+ i +"].ImageResult.ErrorResult.Msg"));
			imageResult.setErrorResult(errorResult);
			imageDetectResult.setImageResult(imageResult);

			imageDetectResults.add(imageDetectResult);
		}
		imageResultsResponse.setImageDetectResults(imageDetectResults);
	 
	 	return imageResultsResponse;
	}
}