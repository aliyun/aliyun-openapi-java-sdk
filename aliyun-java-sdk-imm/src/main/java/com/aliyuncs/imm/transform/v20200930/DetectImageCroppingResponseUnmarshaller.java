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

import com.aliyuncs.imm.model.v20200930.DetectImageCroppingResponse;
import com.aliyuncs.imm.model.v20200930.DetectImageCroppingResponse.CroppingsItem;
import com.aliyuncs.imm.model.v20200930.DetectImageCroppingResponse.CroppingsItem.Boundary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectImageCroppingResponseUnmarshaller {

	public static DetectImageCroppingResponse unmarshall(DetectImageCroppingResponse detectImageCroppingResponse, UnmarshallerContext _ctx) {
		
		detectImageCroppingResponse.setRequestId(_ctx.stringValue("DetectImageCroppingResponse.RequestId"));

		List<CroppingsItem> croppings = new ArrayList<CroppingsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectImageCroppingResponse.Croppings.Length"); i++) {
			CroppingsItem croppingsItem = new CroppingsItem();
			croppingsItem.setAspectRatio(_ctx.stringValue("DetectImageCroppingResponse.Croppings["+ i +"].AspectRatio"));
			croppingsItem.setConfidence(_ctx.floatValue("DetectImageCroppingResponse.Croppings["+ i +"].Confidence"));

			Boundary boundary = new Boundary();
			boundary.setWidth(_ctx.longValue("DetectImageCroppingResponse.Croppings["+ i +"].Boundary.Width"));
			boundary.setHeight(_ctx.longValue("DetectImageCroppingResponse.Croppings["+ i +"].Boundary.Height"));
			boundary.setLeft(_ctx.longValue("DetectImageCroppingResponse.Croppings["+ i +"].Boundary.Left"));
			boundary.setTop(_ctx.longValue("DetectImageCroppingResponse.Croppings["+ i +"].Boundary.Top"));
			croppingsItem.setBoundary(boundary);

			croppings.add(croppingsItem);
		}
		detectImageCroppingResponse.setCroppings(croppings);
	 
	 	return detectImageCroppingResponse;
	}
}