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

import com.aliyuncs.imm.model.v20170906.GetImageCroppingSuggestionsResponse;
import com.aliyuncs.imm.model.v20170906.GetImageCroppingSuggestionsResponse.CroppingSuggestionsItem;
import com.aliyuncs.imm.model.v20170906.GetImageCroppingSuggestionsResponse.CroppingSuggestionsItem.CroppingBoundary;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageCroppingSuggestionsResponseUnmarshaller {

	public static GetImageCroppingSuggestionsResponse unmarshall(GetImageCroppingSuggestionsResponse getImageCroppingSuggestionsResponse, UnmarshallerContext _ctx) {
		
		getImageCroppingSuggestionsResponse.setRequestId(_ctx.stringValue("GetImageCroppingSuggestionsResponse.RequestId"));
		getImageCroppingSuggestionsResponse.setImageUri(_ctx.stringValue("GetImageCroppingSuggestionsResponse.ImageUri"));

		List<CroppingSuggestionsItem> croppingSuggestions = new ArrayList<CroppingSuggestionsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetImageCroppingSuggestionsResponse.CroppingSuggestions.Length"); i++) {
			CroppingSuggestionsItem croppingSuggestionsItem = new CroppingSuggestionsItem();
			croppingSuggestionsItem.setScore(_ctx.floatValue("GetImageCroppingSuggestionsResponse.CroppingSuggestions["+ i +"].Score"));
			croppingSuggestionsItem.setAspectRatio(_ctx.stringValue("GetImageCroppingSuggestionsResponse.CroppingSuggestions["+ i +"].AspectRatio"));

			CroppingBoundary croppingBoundary = new CroppingBoundary();
			croppingBoundary.setLeft(_ctx.integerValue("GetImageCroppingSuggestionsResponse.CroppingSuggestions["+ i +"].CroppingBoundary.Left"));
			croppingBoundary.setTop(_ctx.integerValue("GetImageCroppingSuggestionsResponse.CroppingSuggestions["+ i +"].CroppingBoundary.Top"));
			croppingBoundary.setWidth(_ctx.integerValue("GetImageCroppingSuggestionsResponse.CroppingSuggestions["+ i +"].CroppingBoundary.Width"));
			croppingBoundary.setHeight(_ctx.integerValue("GetImageCroppingSuggestionsResponse.CroppingSuggestions["+ i +"].CroppingBoundary.Height"));
			croppingSuggestionsItem.setCroppingBoundary(croppingBoundary);

			croppingSuggestions.add(croppingSuggestionsItem);
		}
		getImageCroppingSuggestionsResponse.setCroppingSuggestions(croppingSuggestions);
	 
	 	return getImageCroppingSuggestionsResponse;
	}
}