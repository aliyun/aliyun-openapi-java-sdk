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

import com.aliyuncs.imm.model.v20170906.DetectImageCelebrityResponse;
import com.aliyuncs.imm.model.v20170906.DetectImageCelebrityResponse.CelebrityItem;
import com.aliyuncs.imm.model.v20170906.DetectImageCelebrityResponse.CelebrityItem.CelebrityBoundary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectImageCelebrityResponseUnmarshaller {

	public static DetectImageCelebrityResponse unmarshall(DetectImageCelebrityResponse detectImageCelebrityResponse, UnmarshallerContext context) {
		
		detectImageCelebrityResponse.setRequestId(context.stringValue("DetectImageCelebrityResponse.RequestId"));
		detectImageCelebrityResponse.setImageUri(context.stringValue("DetectImageCelebrityResponse.ImageUri"));

		List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
		for (int i = 0; i < context.lengthValue("DetectImageCelebrityResponse.Celebrity.Length"); i++) {
			CelebrityItem celebrityItem = new CelebrityItem();
			celebrityItem.setCelebrityName(context.stringValue("DetectImageCelebrityResponse.Celebrity["+ i +"].CelebrityName"));
			celebrityItem.setCelebrityGender(context.stringValue("DetectImageCelebrityResponse.Celebrity["+ i +"].CelebrityGender"));
			celebrityItem.setCelebrityConfidence(context.floatValue("DetectImageCelebrityResponse.Celebrity["+ i +"].CelebrityConfidence"));
			celebrityItem.setCelebrityLibraryName(context.stringValue("DetectImageCelebrityResponse.Celebrity["+ i +"].CelebrityLibraryName"));

			CelebrityBoundary celebrityBoundary = new CelebrityBoundary();
			celebrityBoundary.setLeft(context.integerValue("DetectImageCelebrityResponse.Celebrity["+ i +"].CelebrityBoundary.Left"));
			celebrityBoundary.setTop(context.integerValue("DetectImageCelebrityResponse.Celebrity["+ i +"].CelebrityBoundary.Top"));
			celebrityBoundary.setWidth(context.integerValue("DetectImageCelebrityResponse.Celebrity["+ i +"].CelebrityBoundary.Width"));
			celebrityBoundary.setHeight(context.integerValue("DetectImageCelebrityResponse.Celebrity["+ i +"].CelebrityBoundary.Height"));
			celebrityItem.setCelebrityBoundary(celebrityBoundary);

			celebrity.add(celebrityItem);
		}
		detectImageCelebrityResponse.setCelebrity(celebrity);
	 
	 	return detectImageCelebrityResponse;
	}
}