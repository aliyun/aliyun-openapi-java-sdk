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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.DetectImageCodesResponse;
import com.aliyuncs.imm.model.v20200930.DetectImageCodesResponse.CodesItem;
import com.aliyuncs.imm.model.v20200930.DetectImageCodesResponse.CodesItem.Boundary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectImageCodesResponseUnmarshaller {

	public static DetectImageCodesResponse unmarshall(DetectImageCodesResponse detectImageCodesResponse, UnmarshallerContext _ctx) {
		
		detectImageCodesResponse.setRequestId(_ctx.stringValue("DetectImageCodesResponse.RequestId"));

		List<CodesItem> codes = new ArrayList<CodesItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectImageCodesResponse.Codes.Length"); i++) {
			CodesItem codesItem = new CodesItem();
			codesItem.setContent(_ctx.stringValue("DetectImageCodesResponse.Codes["+ i +"].Content"));
			codesItem.setConfidence(_ctx.floatValue("DetectImageCodesResponse.Codes["+ i +"].Confidence"));
			codesItem.setType(_ctx.stringValue("DetectImageCodesResponse.Codes["+ i +"].Type"));

			Boundary boundary = new Boundary();
			boundary.setWidth(_ctx.longValue("DetectImageCodesResponse.Codes["+ i +"].Boundary.Width"));
			boundary.setHeight(_ctx.longValue("DetectImageCodesResponse.Codes["+ i +"].Boundary.Height"));
			boundary.setLeft(_ctx.longValue("DetectImageCodesResponse.Codes["+ i +"].Boundary.Left"));
			boundary.setTop(_ctx.longValue("DetectImageCodesResponse.Codes["+ i +"].Boundary.Top"));
			codesItem.setBoundary(boundary);

			codes.add(codesItem);
		}
		detectImageCodesResponse.setCodes(codes);
	 
	 	return detectImageCodesResponse;
	}
}