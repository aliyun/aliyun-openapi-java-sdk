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

	public static DetectQRCodesResponse unmarshall(DetectQRCodesResponse detectQRCodesResponse, UnmarshallerContext _ctx) {
		
		detectQRCodesResponse.setRequestId(_ctx.stringValue("DetectQRCodesResponse.RequestId"));

		List<SuccessDetailsItem> successDetails = new ArrayList<SuccessDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectQRCodesResponse.SuccessDetails.Length"); i++) {
			SuccessDetailsItem successDetailsItem = new SuccessDetailsItem();
			successDetailsItem.setSrcUri(_ctx.stringValue("DetectQRCodesResponse.SuccessDetails["+ i +"].SrcUri"));

			List<QRCodesItem> qRCodes = new ArrayList<QRCodesItem>();
			for (int j = 0; j < _ctx.lengthValue("DetectQRCodesResponse.SuccessDetails["+ i +"].QRCodes.Length"); j++) {
				QRCodesItem qRCodesItem = new QRCodesItem();
				qRCodesItem.setContent(_ctx.stringValue("DetectQRCodesResponse.SuccessDetails["+ i +"].QRCodes["+ j +"].Content"));

				QRCodesRectangle qRCodesRectangle = new QRCodesRectangle();
				qRCodesRectangle.setLeft(_ctx.stringValue("DetectQRCodesResponse.SuccessDetails["+ i +"].QRCodes["+ j +"].QRCodesRectangle.Left"));
				qRCodesRectangle.setTop(_ctx.stringValue("DetectQRCodesResponse.SuccessDetails["+ i +"].QRCodes["+ j +"].QRCodesRectangle.Top"));
				qRCodesRectangle.setWidth(_ctx.stringValue("DetectQRCodesResponse.SuccessDetails["+ i +"].QRCodes["+ j +"].QRCodesRectangle.Width"));
				qRCodesRectangle.setHeight(_ctx.stringValue("DetectQRCodesResponse.SuccessDetails["+ i +"].QRCodes["+ j +"].QRCodesRectangle.Height"));
				qRCodesItem.setQRCodesRectangle(qRCodesRectangle);

				qRCodes.add(qRCodesItem);
			}
			successDetailsItem.setQRCodes(qRCodes);

			successDetails.add(successDetailsItem);
		}
		detectQRCodesResponse.setSuccessDetails(successDetails);

		List<FailDetailsItem> failDetails = new ArrayList<FailDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectQRCodesResponse.FailDetails.Length"); i++) {
			FailDetailsItem failDetailsItem = new FailDetailsItem();
			failDetailsItem.setSrcUri(_ctx.stringValue("DetectQRCodesResponse.FailDetails["+ i +"].SrcUri"));
			failDetailsItem.setErrorCode(_ctx.stringValue("DetectQRCodesResponse.FailDetails["+ i +"].ErrorCode"));
			failDetailsItem.setErrorMessage(_ctx.stringValue("DetectQRCodesResponse.FailDetails["+ i +"].ErrorMessage"));

			failDetails.add(failDetailsItem);
		}
		detectQRCodesResponse.setFailDetails(failDetails);
	 
	 	return detectQRCodesResponse;
	}
}