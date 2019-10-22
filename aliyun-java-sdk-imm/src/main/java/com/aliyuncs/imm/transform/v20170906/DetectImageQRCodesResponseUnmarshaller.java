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

import com.aliyuncs.imm.model.v20170906.DetectImageQRCodesResponse;
import com.aliyuncs.imm.model.v20170906.DetectImageQRCodesResponse.QRCodesItem;
import com.aliyuncs.imm.model.v20170906.DetectImageQRCodesResponse.QRCodesItem.QRCodeBoundary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectImageQRCodesResponseUnmarshaller {

	public static DetectImageQRCodesResponse unmarshall(DetectImageQRCodesResponse detectImageQRCodesResponse, UnmarshallerContext _ctx) {
		
		detectImageQRCodesResponse.setRequestId(_ctx.stringValue("DetectImageQRCodesResponse.RequestId"));
		detectImageQRCodesResponse.setImageUri(_ctx.stringValue("DetectImageQRCodesResponse.ImageUri"));

		List<QRCodesItem> qRCodes = new ArrayList<QRCodesItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectImageQRCodesResponse.QRCodes.Length"); i++) {
			QRCodesItem qRCodesItem = new QRCodesItem();
			qRCodesItem.setContent(_ctx.stringValue("DetectImageQRCodesResponse.QRCodes["+ i +"].Content"));

			QRCodeBoundary qRCodeBoundary = new QRCodeBoundary();
			qRCodeBoundary.setTop(_ctx.integerValue("DetectImageQRCodesResponse.QRCodes["+ i +"].QRCodeBoundary.Top"));
			qRCodeBoundary.setLeft(_ctx.integerValue("DetectImageQRCodesResponse.QRCodes["+ i +"].QRCodeBoundary.Left"));
			qRCodeBoundary.setWidth(_ctx.integerValue("DetectImageQRCodesResponse.QRCodes["+ i +"].QRCodeBoundary.Width"));
			qRCodeBoundary.setHeight(_ctx.integerValue("DetectImageQRCodesResponse.QRCodes["+ i +"].QRCodeBoundary.Height"));
			qRCodesItem.setQRCodeBoundary(qRCodeBoundary);

			qRCodes.add(qRCodesItem);
		}
		detectImageQRCodesResponse.setQRCodes(qRCodes);
	 
	 	return detectImageQRCodesResponse;
	}
}