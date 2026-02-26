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

package com.aliyuncs.imageprocess.transform.v20200320;

import com.aliyuncs.imageprocess.model.v20200320.TargetVolumeSegmentResponse;
import com.aliyuncs.imageprocess.model.v20200320.TargetVolumeSegmentResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class TargetVolumeSegmentResponseUnmarshaller {

	public static TargetVolumeSegmentResponse unmarshall(TargetVolumeSegmentResponse targetVolumeSegmentResponse, UnmarshallerContext _ctx) {
		
		targetVolumeSegmentResponse.setRequestId(_ctx.stringValue("TargetVolumeSegmentResponse.RequestId"));
		targetVolumeSegmentResponse.setCode(_ctx.stringValue("TargetVolumeSegmentResponse.Code"));
		targetVolumeSegmentResponse.setMessage(_ctx.stringValue("TargetVolumeSegmentResponse.Message"));

		Data data = new Data();
		data.setResultURL(_ctx.stringValue("TargetVolumeSegmentResponse.Data.ResultURL"));
		targetVolumeSegmentResponse.setData(data);
	 
	 	return targetVolumeSegmentResponse;
	}
}