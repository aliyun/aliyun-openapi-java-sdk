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

import com.aliyuncs.imm.model.v20170906.DetectQRCodesResponse;
import com.aliyuncs.imm.model.v20170906.DetectQRCodesResponse.FailDetailsItem;
import com.aliyuncs.imm.model.v20170906.DetectQRCodesResponse.SuccessDetailsItem;
import com.aliyuncs.imm.model.v20170906.DetectQRCodesResponse.SuccessDetailsItem.QRCodesItem;
import com.aliyuncs.imm.model.v20170906.DetectQRCodesResponse.SuccessDetailsItem.QRCodesItem.QRCodesRectangle;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectQRCodesResponseUnmarshaller {

	public static DetectQRCodesResponse unmarshall(DetectQRCodesResponse detectQRCodesResponse, UnmarshallerContext context) {
		
		detectQRCodesResponse.setRequestId(context.stringValue("DetectQRCodesResponse.RequestId"));

		List<SuccessDetailsItem> successDetails = new ArrayList<SuccessDetailsItem>();
		for (int i = 0; i < context.lengthValue("DetectQRCodesResponse.SuccessDetails.Length"); i++) {
			SuccessDetailsItem successDetailsItem = new SuccessDetailsItem();
			successDetailsItem.setSrcUri(context.stringValue("DetectQRCodesResponse.SuccessDetails["+ i +"].SrcUri"));

			List<QRCodesItem> qRCodes = new ArrayList<QRCodesItem>();
			for (int j = 0; j < context.lengthValue("DetectQRCodesResponse.SuccessDetails["+ i +"].QRCodes.Length"); j++) {
				QRCodesItem qRCodesItem = new QRCodesItem();
				qRCodesItem.setContent(context.stringValue("DetectQRCodesResponse.SuccessDetails["+ i +"].QRCodes["+ j +"].Content"));

				QRCodesRectangle qRCodesRectangle = new QRCodesRectangle();
				qRCodesRectangle.setLeft(context.stringValue("DetectQRCodesResponse.SuccessDetails["+ i +"].QRCodes["+ j +"].QRCodesRectangle.Left"));
				qRCodesRectangle.setTop(context.stringValue("DetectQRCodesResponse.SuccessDetails["+ i +"].QRCodes["+ j +"].QRCodesRectangle.Top"));
				qRCodesRectangle.setWidth(context.stringValue("DetectQRCodesResponse.SuccessDetails["+ i +"].QRCodes["+ j +"].QRCodesRectangle.Width"));
				qRCodesRectangle.setHeight(context.stringValue("DetectQRCodesResponse.SuccessDetails["+ i +"].QRCodes["+ j +"].QRCodesRectangle.Height"));
				qRCodesItem.setQRCodesRectangle(qRCodesRectangle);

				qRCodes.add(qRCodesItem);
			}
			successDetailsItem.setQRCodes(qRCodes);

			successDetails.add(successDetailsItem);
		}
		detectQRCodesResponse.setSuccessDetails(successDetails);

		List<FailDetailsItem> failDetails = new ArrayList<FailDetailsItem>();
		for (int i = 0; i < context.lengthValue("DetectQRCodesResponse.FailDetails.Length"); i++) {
			FailDetailsItem failDetailsItem = new FailDetailsItem();
			failDetailsItem.setSrcUri(context.stringValue("DetectQRCodesResponse.FailDetails["+ i +"].SrcUri"));
			failDetailsItem.setErrorCode(context.stringValue("DetectQRCodesResponse.FailDetails["+ i +"].ErrorCode"));
			failDetailsItem.setErrorMessage(context.stringValue("DetectQRCodesResponse.FailDetails["+ i +"].ErrorMessage"));

			failDetails.add(failDetailsItem);
		}
		detectQRCodesResponse.setFailDetails(failDetails);
	 
	 	return detectQRCodesResponse;
	}
}