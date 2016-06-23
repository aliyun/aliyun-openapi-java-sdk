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
package com.aliyuncs.green.transform.v20160621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20160621.ImageResultResponse;
import com.aliyuncs.green.model.v20160621.ImageResultResponse.ImageResult;
import com.aliyuncs.green.model.v20160621.ImageResultResponse.ImageResult.ErrorResult;
import com.aliyuncs.green.model.v20160621.ImageResultResponse.ImageResult.IllegalResult;
import com.aliyuncs.green.model.v20160621.ImageResultResponse.ImageResult.OcrResult;
import com.aliyuncs.green.model.v20160621.ImageResultResponse.ImageResult.PornResult;
import com.aliyuncs.green.model.v20160621.ImageResultResponse.ImageResult.QrcodeResult;
import com.aliyuncs.green.model.v20160621.ImageResultResponse.ImageResult.SpamResult;
import com.aliyuncs.green.model.v20160621.ImageResultResponse.ImageResult.SpamResult.KeywordResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImageResultResponseUnmarshaller {

	public static ImageResultResponse unmarshall(ImageResultResponse imageResultResponse, UnmarshallerContext context) {
		
		imageResultResponse.setCode(context.stringValue("ImageResultResponse.Code"));
		imageResultResponse.setMsg(context.stringValue("ImageResultResponse.Msg"));
		imageResultResponse.setStatus(context.stringValue("ImageResultResponse.Status"));

		ImageResult imageResult = new ImageResult();
		imageResult.setTaskId(context.stringValue("ImageResultResponse.ImageResult.TaskId"));
		imageResult.setImageName(context.stringValue("ImageResultResponse.ImageResult.ImageName"));

		PornResult pornResult = new PornResult();
		pornResult.setRate(context.floatValue("ImageResultResponse.ImageResult.PornResult.Rate"));
		pornResult.setLabel(context.integerValue("ImageResultResponse.ImageResult.PornResult.Label"));
		imageResult.setPornResult(pornResult);

		IllegalResult illegalResult = new IllegalResult();
		illegalResult.setRate(context.floatValue("ImageResultResponse.ImageResult.IllegalResult.Rate"));
		illegalResult.setLabel(context.integerValue("ImageResultResponse.ImageResult.IllegalResult.Label"));
		imageResult.setIllegalResult(illegalResult);

		OcrResult ocrResult = new OcrResult();

		List<String> text = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ImageResultResponse.ImageResult.OcrResult.Text.Length"); i++) {
			text.add(context.stringValue("ImageResultResponse.ImageResult.OcrResult.Text["+ i +"]"));
		}
		ocrResult.setText(text);
		imageResult.setOcrResult(ocrResult);

		SpamResult spamResult = new SpamResult();
		spamResult.setHit(context.booleanValue("ImageResultResponse.ImageResult.SpamResult.Hit"));

		List<KeywordResult> keywordResults = new ArrayList<KeywordResult>();
		for (int i = 0; i < context.lengthValue("ImageResultResponse.ImageResult.SpamResult.KeywordResults.Length"); i++) {
			KeywordResult keywordResult = new KeywordResult();
			keywordResult.setKeywordCtx(context.stringValue("ImageResultResponse.ImageResult.SpamResult.KeywordResults["+ i +"].KeywordCtx"));
			keywordResult.setKeywordType(context.stringValue("ImageResultResponse.ImageResult.SpamResult.KeywordResults["+ i +"].KeywordType"));

			keywordResults.add(keywordResult);
		}
		spamResult.setKeywordResults(keywordResults);
		imageResult.setSpamResult(spamResult);

		QrcodeResult qrcodeResult = new QrcodeResult();

		List<String> qrcodeList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ImageResultResponse.ImageResult.QrcodeResult.QrcodeList.Length"); i++) {
			qrcodeList.add(context.stringValue("ImageResultResponse.ImageResult.QrcodeResult.QrcodeList["+ i +"]"));
		}
		qrcodeResult.setQrcodeList(qrcodeList);
		imageResult.setQrcodeResult(qrcodeResult);

		ErrorResult errorResult = new ErrorResult();
		errorResult.setCode(context.stringValue("ImageResultResponse.ImageResult.ErrorResult.Code"));
		errorResult.setMsg(context.stringValue("ImageResultResponse.ImageResult.ErrorResult.Msg"));
		imageResult.setErrorResult(errorResult);
		imageResultResponse.setImageResult(imageResult);
	 
	 	return imageResultResponse;
	}
}