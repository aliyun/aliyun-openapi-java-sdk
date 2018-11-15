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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.DetectClothesResponse;
import com.aliyuncs.imm.model.v20170906.DetectClothesResponse.FailDetailsItem;
import com.aliyuncs.imm.model.v20170906.DetectClothesResponse.SuccessDetailsItem;
import com.aliyuncs.imm.model.v20170906.DetectClothesResponse.SuccessDetailsItem.ClothesBoxDetailItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectClothesResponseUnmarshaller {

	public static DetectClothesResponse unmarshall(DetectClothesResponse detectClothesResponse, UnmarshallerContext context) {
		
		detectClothesResponse.setRequestId(context.stringValue("DetectClothesResponse.RequestId"));

		List<String> srcUris = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DetectClothesResponse.SrcUris.Length"); i++) {
			srcUris.add(context.stringValue("DetectClothesResponse.SrcUris["+ i +"]"));
		}
		detectClothesResponse.setSrcUris(srcUris);

		List<SuccessDetailsItem> successDetails = new ArrayList<SuccessDetailsItem>();
		for (int i = 0; i < context.lengthValue("DetectClothesResponse.SuccessDetails.Length"); i++) {
			SuccessDetailsItem successDetailsItem = new SuccessDetailsItem();
			successDetailsItem.setSrcUri(context.stringValue("DetectClothesResponse.SuccessDetails["+ i +"].SrcUri"));
			successDetailsItem.setTime(context.stringValue("DetectClothesResponse.SuccessDetails["+ i +"].Time"));
			successDetailsItem.setGetImageTime(context.stringValue("DetectClothesResponse.SuccessDetails["+ i +"].GetImageTime"));
			successDetailsItem.setDetectTime(context.stringValue("DetectClothesResponse.SuccessDetails["+ i +"].DetectTime"));

			List<ClothesBoxDetailItem> clothesBoxDetail = new ArrayList<ClothesBoxDetailItem>();
			for (int j = 0; j < context.lengthValue("DetectClothesResponse.SuccessDetails["+ i +"].ClothesBoxDetail.Length"); j++) {
				ClothesBoxDetailItem clothesBoxDetailItem = new ClothesBoxDetailItem();
				clothesBoxDetailItem.setPUID(context.stringValue("DetectClothesResponse.SuccessDetails["+ i +"].ClothesBoxDetail["+ j +"].PUID"));
				clothesBoxDetailItem.setType(context.stringValue("DetectClothesResponse.SuccessDetails["+ i +"].ClothesBoxDetail["+ j +"].Type"));
				clothesBoxDetailItem.setScore(context.floatValue("DetectClothesResponse.SuccessDetails["+ i +"].ClothesBoxDetail["+ j +"].Score"));

				List<String> box = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DetectClothesResponse.SuccessDetails["+ i +"].ClothesBoxDetail["+ j +"].Box.Length"); k++) {
					box.add(context.stringValue("DetectClothesResponse.SuccessDetails["+ i +"].ClothesBoxDetail["+ j +"].Box["+ k +"]"));
				}
				clothesBoxDetailItem.setBox(box);

				clothesBoxDetail.add(clothesBoxDetailItem);
			}
			successDetailsItem.setClothesBoxDetail(clothesBoxDetail);

			successDetails.add(successDetailsItem);
		}
		detectClothesResponse.setSuccessDetails(successDetails);

		List<FailDetailsItem> failDetails = new ArrayList<FailDetailsItem>();
		for (int i = 0; i < context.lengthValue("DetectClothesResponse.FailDetails.Length"); i++) {
			FailDetailsItem failDetailsItem = new FailDetailsItem();
			failDetailsItem.setSrcUri(context.stringValue("DetectClothesResponse.FailDetails["+ i +"].SrcUri"));
			failDetailsItem.setReason(context.stringValue("DetectClothesResponse.FailDetails["+ i +"].Reason"));

			failDetails.add(failDetailsItem);
		}
		detectClothesResponse.setFailDetails(failDetails);
	 
	 	return detectClothesResponse;
	}
}