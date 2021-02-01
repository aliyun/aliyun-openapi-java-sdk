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

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.VerifyFaceMaskResponse;
import com.aliyuncs.facebody.model.v20191230.VerifyFaceMaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyFaceMaskResponseUnmarshaller {

	public static VerifyFaceMaskResponse unmarshall(VerifyFaceMaskResponse verifyFaceMaskResponse, UnmarshallerContext _ctx) {
		
		verifyFaceMaskResponse.setRequestId(_ctx.stringValue("VerifyFaceMaskResponse.RequestId"));

		Data data = new Data();
		data.setConfidence(_ctx.floatValue("VerifyFaceMaskResponse.Data.Confidence"));
		data.setMask(_ctx.integerValue("VerifyFaceMaskResponse.Data.Mask"));
		data.setMaskRef(_ctx.integerValue("VerifyFaceMaskResponse.Data.MaskRef"));

		List<Integer> rectangle = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("VerifyFaceMaskResponse.Data.Rectangle.Length"); i++) {
			rectangle.add(_ctx.integerValue("VerifyFaceMaskResponse.Data.Rectangle["+ i +"]"));
		}
		data.setRectangle(rectangle);

		List<Integer> rectangleRef = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("VerifyFaceMaskResponse.Data.RectangleRef.Length"); i++) {
			rectangleRef.add(_ctx.integerValue("VerifyFaceMaskResponse.Data.RectangleRef["+ i +"]"));
		}
		data.setRectangleRef(rectangleRef);

		List<Float> thresholds = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("VerifyFaceMaskResponse.Data.Thresholds.Length"); i++) {
			thresholds.add(_ctx.floatValue("VerifyFaceMaskResponse.Data.Thresholds["+ i +"]"));
		}
		data.setThresholds(thresholds);
		verifyFaceMaskResponse.setData(data);
	 
	 	return verifyFaceMaskResponse;
	}
}