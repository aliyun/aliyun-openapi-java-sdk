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
package com.aliyuncs.green.transform.v20161206;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20161206.ImageDetectionResponse;
import com.aliyuncs.green.model.v20161206.ImageDetectionResponse.ImageResult;
import com.aliyuncs.green.model.v20161206.ImageDetectionResponse.ImageResult.AdResult;
import com.aliyuncs.green.model.v20161206.ImageDetectionResponse.ImageResult.ErrorResult;
import com.aliyuncs.green.model.v20161206.ImageDetectionResponse.ImageResult.IllegalResult;
import com.aliyuncs.green.model.v20161206.ImageDetectionResponse.ImageResult.OcrResult;
import com.aliyuncs.green.model.v20161206.ImageDetectionResponse.ImageResult.PornResult;
import com.aliyuncs.green.model.v20161206.ImageDetectionResponse.ImageResult.QrcodeResult;
import com.aliyuncs.green.model.v20161206.ImageDetectionResponse.ImageResult.SensitiveFaceResult;
import com.aliyuncs.green.model.v20161206.ImageDetectionResponse.ImageResult.SensitiveFaceResult.ImageSensitiveFaceHitItem;
import com.aliyuncs.green.model.v20161206.ImageDetectionResponse.ImageResult.SensitiveFaceResult.ImageSensitiveFaceHitItem.ImageSensitiveFaceSimiInfo;
import com.aliyuncs.green.model.v20161206.ImageDetectionResponse.ImageResult.SpamResult;
import com.aliyuncs.green.model.v20161206.ImageDetectionResponse.ImageResult.SpamResult.KeywordResult;
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

			QrcodeResult qrcodeResult = new QrcodeResult();

			List<String> qrcodeList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ImageDetectionResponse.ImageResults["+ i +"].QrcodeResult.QrcodeList.Length"); j++) {
				qrcodeList.add(context.stringValue("ImageDetectionResponse.ImageResults["+ i +"].QrcodeResult.QrcodeList["+ j +"]"));
			}
			qrcodeResult.setQrcodeList(qrcodeList);
			imageResult.setQrcodeResult(qrcodeResult);

			SensitiveFaceResult sensitiveFaceResult = new SensitiveFaceResult();

			List<ImageSensitiveFaceHitItem> items = new ArrayList<ImageSensitiveFaceHitItem>();
			for (int j = 0; j < context.lengthValue("ImageDetectionResponse.ImageResults["+ i +"].SensitiveFaceResult.Items.Length"); j++) {
				ImageSensitiveFaceHitItem imageSensitiveFaceHitItem = new ImageSensitiveFaceHitItem();
				imageSensitiveFaceHitItem.setX(context.floatValue("ImageDetectionResponse.ImageResults["+ i +"].SensitiveFaceResult.Items["+ j +"].X"));
				imageSensitiveFaceHitItem.setY(context.floatValue("ImageDetectionResponse.ImageResults["+ i +"].SensitiveFaceResult.Items["+ j +"].Y"));
				imageSensitiveFaceHitItem.setw(context.floatValue("ImageDetectionResponse.ImageResults["+ i +"].SensitiveFaceResult.Items["+ j +"].w"));
				imageSensitiveFaceHitItem.seth(context.floatValue("ImageDetectionResponse.ImageResults["+ i +"].SensitiveFaceResult.Items["+ j +"].h"));

				List<ImageSensitiveFaceSimiInfo> simiInfoList = new ArrayList<ImageSensitiveFaceSimiInfo>();
				for (int k = 0; k < context.lengthValue("ImageDetectionResponse.ImageResults["+ i +"].SensitiveFaceResult.Items["+ j +"].SimiInfoList.Length"); k++) {
					ImageSensitiveFaceSimiInfo imageSensitiveFaceSimiInfo = new ImageSensitiveFaceSimiInfo();
					imageSensitiveFaceSimiInfo.setName(context.stringValue("ImageDetectionResponse.ImageResults["+ i +"].SensitiveFaceResult.Items["+ j +"].SimiInfoList["+ k +"].Name"));
					imageSensitiveFaceSimiInfo.setScore(context.floatValue("ImageDetectionResponse.ImageResults["+ i +"].SensitiveFaceResult.Items["+ j +"].SimiInfoList["+ k +"].Score"));

					simiInfoList.add(imageSensitiveFaceSimiInfo);
				}
				imageSensitiveFaceHitItem.setSimiInfoList(simiInfoList);

				items.add(imageSensitiveFaceHitItem);
			}
			sensitiveFaceResult.setItems(items);
			imageResult.setSensitiveFaceResult(sensitiveFaceResult);

			AdResult adResult = new AdResult();
			adResult.setRate(context.floatValue("ImageDetectionResponse.ImageResults["+ i +"].AdResult.Rate"));
			adResult.setLabel(context.integerValue("ImageDetectionResponse.ImageResults["+ i +"].AdResult.Label"));
			adResult.setRiskType(context.integerValue("ImageDetectionResponse.ImageResults["+ i +"].AdResult.RiskType"));

			List<String> riskDetails = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ImageDetectionResponse.ImageResults["+ i +"].AdResult.RiskDetails.Length"); j++) {
				riskDetails.add(context.stringValue("ImageDetectionResponse.ImageResults["+ i +"].AdResult.RiskDetails["+ j +"]"));
			}
			adResult.setRiskDetails(riskDetails);
			imageResult.setAdResult(adResult);

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