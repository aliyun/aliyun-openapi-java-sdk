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

import com.aliyuncs.imm.model.v20170906.DetectLogoResponse;
import com.aliyuncs.imm.model.v20170906.DetectLogoResponse.FailDetailsItem;
import com.aliyuncs.imm.model.v20170906.DetectLogoResponse.SuccessDetailsItem;
import com.aliyuncs.imm.model.v20170906.DetectLogoResponse.SuccessDetailsItem.LogoBoxDetailItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectLogoResponseUnmarshaller {

	public static DetectLogoResponse unmarshall(DetectLogoResponse detectLogoResponse, UnmarshallerContext _ctx) {
		
		detectLogoResponse.setRequestId(_ctx.stringValue("DetectLogoResponse.RequestId"));

		List<String> srcUris = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DetectLogoResponse.SrcUris.Length"); i++) {
			srcUris.add(_ctx.stringValue("DetectLogoResponse.SrcUris["+ i +"]"));
		}
		detectLogoResponse.setSrcUris(srcUris);

		List<SuccessDetailsItem> successDetails = new ArrayList<SuccessDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectLogoResponse.SuccessDetails.Length"); i++) {
			SuccessDetailsItem successDetailsItem = new SuccessDetailsItem();
			successDetailsItem.setSrcUri(_ctx.stringValue("DetectLogoResponse.SuccessDetails["+ i +"].SrcUri"));
			successDetailsItem.setTime(_ctx.stringValue("DetectLogoResponse.SuccessDetails["+ i +"].Time"));
			successDetailsItem.setGetImageTime(_ctx.stringValue("DetectLogoResponse.SuccessDetails["+ i +"].GetImageTime"));
			successDetailsItem.setDetectTime(_ctx.stringValue("DetectLogoResponse.SuccessDetails["+ i +"].DetectTime"));

			List<LogoBoxDetailItem> logoBoxDetail = new ArrayList<LogoBoxDetailItem>();
			for (int j = 0; j < _ctx.lengthValue("DetectLogoResponse.SuccessDetails["+ i +"].LogoBoxDetail.Length"); j++) {
				LogoBoxDetailItem logoBoxDetailItem = new LogoBoxDetailItem();
				logoBoxDetailItem.setPUID(_ctx.stringValue("DetectLogoResponse.SuccessDetails["+ i +"].LogoBoxDetail["+ j +"].PUID"));
				logoBoxDetailItem.setType(_ctx.stringValue("DetectLogoResponse.SuccessDetails["+ i +"].LogoBoxDetail["+ j +"].Type"));
				logoBoxDetailItem.setScore(_ctx.floatValue("DetectLogoResponse.SuccessDetails["+ i +"].LogoBoxDetail["+ j +"].Score"));

				List<String> box = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DetectLogoResponse.SuccessDetails["+ i +"].LogoBoxDetail["+ j +"].Box.Length"); k++) {
					box.add(_ctx.stringValue("DetectLogoResponse.SuccessDetails["+ i +"].LogoBoxDetail["+ j +"].Box["+ k +"]"));
				}
				logoBoxDetailItem.setBox(box);

				logoBoxDetail.add(logoBoxDetailItem);
			}
			successDetailsItem.setLogoBoxDetail(logoBoxDetail);

			successDetails.add(successDetailsItem);
		}
		detectLogoResponse.setSuccessDetails(successDetails);

		List<FailDetailsItem> failDetails = new ArrayList<FailDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectLogoResponse.FailDetails.Length"); i++) {
			FailDetailsItem failDetailsItem = new FailDetailsItem();
			failDetailsItem.setSrcUri(_ctx.stringValue("DetectLogoResponse.FailDetails["+ i +"].SrcUri"));
			failDetailsItem.setReason(_ctx.stringValue("DetectLogoResponse.FailDetails["+ i +"].Reason"));

			failDetails.add(failDetailsItem);
		}
		detectLogoResponse.setFailDetails(failDetails);
	 
	 	return detectLogoResponse;
	}
}