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

package com.aliyuncs.ivpd.transform.v20190625;

import com.aliyuncs.ivpd.model.v20190625.SegmentBodyResponse;
import com.aliyuncs.ivpd.model.v20190625.SegmentBodyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SegmentBodyResponseUnmarshaller {

	public static SegmentBodyResponse unmarshall(SegmentBodyResponse segmentBodyResponse, UnmarshallerContext _ctx) {
		
		segmentBodyResponse.setRequestId(_ctx.stringValue("SegmentBodyResponse.RequestId"));
		segmentBodyResponse.setCode(_ctx.stringValue("SegmentBodyResponse.Code"));
		segmentBodyResponse.setMessage(_ctx.stringValue("SegmentBodyResponse.Message"));

		Data data = new Data();
		data.setImageUrl(_ctx.stringValue("SegmentBodyResponse.Data.ImageUrl"));
		segmentBodyResponse.setData(data);
	 
	 	return segmentBodyResponse;
	}
}