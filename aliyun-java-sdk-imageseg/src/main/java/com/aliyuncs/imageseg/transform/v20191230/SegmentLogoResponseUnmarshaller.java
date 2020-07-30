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

package com.aliyuncs.imageseg.transform.v20191230;

import com.aliyuncs.imageseg.model.v20191230.SegmentLogoResponse;
import com.aliyuncs.imageseg.model.v20191230.SegmentLogoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SegmentLogoResponseUnmarshaller {

	public static SegmentLogoResponse unmarshall(SegmentLogoResponse segmentLogoResponse, UnmarshallerContext _ctx) {
		
		segmentLogoResponse.setRequestId(_ctx.stringValue("SegmentLogoResponse.RequestId"));

		Data data = new Data();
		data.setImageURL(_ctx.stringValue("SegmentLogoResponse.Data.ImageURL"));
		segmentLogoResponse.setData(data);
	 
	 	return segmentLogoResponse;
	}
}