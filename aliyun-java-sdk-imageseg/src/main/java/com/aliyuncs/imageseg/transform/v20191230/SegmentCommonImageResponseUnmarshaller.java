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

import com.aliyuncs.imageseg.model.v20191230.SegmentCommonImageResponse;
import com.aliyuncs.imageseg.model.v20191230.SegmentCommonImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SegmentCommonImageResponseUnmarshaller {

	public static SegmentCommonImageResponse unmarshall(SegmentCommonImageResponse segmentCommonImageResponse, UnmarshallerContext _ctx) {
		
		segmentCommonImageResponse.setRequestId(_ctx.stringValue("SegmentCommonImageResponse.RequestId"));

		Data data = new Data();
		data.setImageURL(_ctx.stringValue("SegmentCommonImageResponse.Data.ImageURL"));
		segmentCommonImageResponse.setData(data);
	 
	 	return segmentCommonImageResponse;
	}
}