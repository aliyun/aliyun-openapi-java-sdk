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
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectClothesResponseUnmarshaller {

	public static DetectClothesResponse unmarshall(DetectClothesResponse detectClothesResponse, UnmarshallerContext _ctx) {
		
		detectClothesResponse.setRequestId(_ctx.stringValue("DetectClothesResponse.RequestId"));

		List<String> srcUris = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DetectClothesResponse.SrcUris.Length"); i++) {
			srcUris.add(_ctx.stringValue("DetectClothesResponse.SrcUris["+ i +"]"));
		}
		detectClothesResponse.setSrcUris(srcUris);

		List<SuccessDetailsItem> successDetails = new ArrayList<SuccessDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectClothesResponse.SuccessDetails.Length"); i++) {
			SuccessDetailsItem successDetailsItem = new SuccessDetailsItem();
			successDetailsItem.setSrcUri(_ctx.stringValue("DetectClothesResponse.SuccessDetails["+ i +"].SrcUri"));
			successDetailsItem.setTime(_ctx.stringValue("DetectClothesResponse.SuccessDetails["+ i +"].Time"));
			successDetailsItem.setGetImageTime(_ctx.stringValue("DetectClothesResponse.SuccessDetails["+ i +"].GetImageTime"));
			successDetailsItem.setDetectTime(_ctx.stringValue("DetectClothesResponse.SuccessDetails["+ i +"].DetectTime"));

			List<ClothesBoxDetailItem> clothesBoxDetail = new ArrayList<ClothesBoxDetailItem>();
			for (int j = 0; j < _ctx.lengthValue("DetectClothesResponse.SuccessDetails["+ i +"].ClothesBoxDetail.Length"); j++) {
				ClothesBoxDetailItem clothesBoxDetailItem = new ClothesBoxDetailItem();
				clothesBoxDetailItem.setPUID(_ctx.stringValue("DetectClothesResponse.SuccessDetails["+ i +"].ClothesBoxDetail["+ j +"].PUID"));
				clothesBoxDetailItem.setType(_ctx.stringValue("DetectClothesResponse.SuccessDetails["+ i +"].ClothesBoxDetail["+ j +"].Type"));
				clothesBoxDetailItem.setScore(_ctx.floatValue("DetectClothesResponse.SuccessDetails["+ i +"].ClothesBoxDetail["+ j +"].Score"));

				List<String> box = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DetectClothesResponse.SuccessDetails["+ i +"].ClothesBoxDetail["+ j +"].Box.Length"); k++) {
					box.add(_ctx.stringValue("DetectClothesResponse.SuccessDetails["+ i +"].ClothesBoxDetail["+ j +"].Box["+ k +"]"));
				}
				clothesBoxDetailItem.setBox(box);

				clothesBoxDetail.add(clothesBoxDetailItem);
			}
			successDetailsItem.setClothesBoxDetail(clothesBoxDetail);

			successDetails.add(successDetailsItem);
		}
		detectClothesResponse.setSuccessDetails(successDetails);

		List<FailDetailsItem> failDetails = new ArrayList<FailDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectClothesResponse.FailDetails.Length"); i++) {
			FailDetailsItem failDetailsItem = new FailDetailsItem();
			failDetailsItem.setSrcUri(_ctx.stringValue("DetectClothesResponse.FailDetails["+ i +"].SrcUri"));
			failDetailsItem.setReason(_ctx.stringValue("DetectClothesResponse.FailDetails["+ i +"].Reason"));

			failDetails.add(failDetailsItem);
		}
		detectClothesResponse.setFailDetails(failDetails);
	 
	 	return detectClothesResponse;
	}
}