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

import com.aliyuncs.imageseg.model.v20191230.SegmentHDSkyResponse;
import com.aliyuncs.imageseg.model.v20191230.SegmentHDSkyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SegmentHDSkyResponseUnmarshaller {

	public static SegmentHDSkyResponse unmarshall(SegmentHDSkyResponse segmentHDSkyResponse, UnmarshallerContext _ctx) {
		
		segmentHDSkyResponse.setRequestId(_ctx.stringValue("SegmentHDSkyResponse.RequestId"));

		Data data = new Data();
		data.setImageURL(_ctx.stringValue("SegmentHDSkyResponse.Data.ImageURL"));
		segmentHDSkyResponse.setData(data);
	 
	 	return segmentHDSkyResponse;
	}
}