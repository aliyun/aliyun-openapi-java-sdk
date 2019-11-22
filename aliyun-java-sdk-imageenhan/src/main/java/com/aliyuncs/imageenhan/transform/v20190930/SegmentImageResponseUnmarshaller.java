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

package com.aliyuncs.imageenhan.transform.v20190930;

import com.aliyuncs.imageenhan.model.v20190930.SegmentImageResponse;
import com.aliyuncs.imageenhan.model.v20190930.SegmentImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SegmentImageResponseUnmarshaller {

	public static SegmentImageResponse unmarshall(SegmentImageResponse segmentImageResponse, UnmarshallerContext _ctx) {
		
		segmentImageResponse.setRequestId(_ctx.stringValue("SegmentImageResponse.RequestId"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("SegmentImageResponse.Data.Url"));
		segmentImageResponse.setData(data);
	 
	 	return segmentImageResponse;
	}
}