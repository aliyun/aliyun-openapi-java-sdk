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

import com.aliyuncs.imm.model.v20170906.DetectImageTextsResponse;
import com.aliyuncs.imm.model.v20170906.DetectImageTextsResponse.OCRItem;
import com.aliyuncs.imm.model.v20170906.DetectImageTextsResponse.OCRItem.OCRBoundary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectImageTextsResponseUnmarshaller {

	public static DetectImageTextsResponse unmarshall(DetectImageTextsResponse detectImageTextsResponse, UnmarshallerContext _ctx) {
		
		detectImageTextsResponse.setRequestId(_ctx.stringValue("DetectImageTextsResponse.RequestId"));
		detectImageTextsResponse.setImageUri(_ctx.stringValue("DetectImageTextsResponse.ImageUri"));

		List<OCRItem> oCR = new ArrayList<OCRItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectImageTextsResponse.OCR.Length"); i++) {
			OCRItem oCRItem = new OCRItem();
			oCRItem.setOCRContents(_ctx.stringValue("DetectImageTextsResponse.OCR["+ i +"].OCRContents"));
			oCRItem.setOCRConfidence(_ctx.floatValue("DetectImageTextsResponse.OCR["+ i +"].OCRConfidence"));

			OCRBoundary oCRBoundary = new OCRBoundary();
			oCRBoundary.setLeft(_ctx.integerValue("DetectImageTextsResponse.OCR["+ i +"].OCRBoundary.Left"));
			oCRBoundary.setTop(_ctx.integerValue("DetectImageTextsResponse.OCR["+ i +"].OCRBoundary.Top"));
			oCRBoundary.setWidth(_ctx.integerValue("DetectImageTextsResponse.OCR["+ i +"].OCRBoundary.Width"));
			oCRBoundary.setHeight(_ctx.integerValue("DetectImageTextsResponse.OCR["+ i +"].OCRBoundary.Height"));
			oCRItem.setOCRBoundary(oCRBoundary);

			oCR.add(oCRItem);
		}
		detectImageTextsResponse.setOCR(oCR);
	 
	 	return detectImageTextsResponse;
	}
}