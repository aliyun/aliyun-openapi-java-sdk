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

package com.aliyuncs.videorecog.transform.v20200320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.videorecog.model.v20200320.DetectVideoShotResponse;
import com.aliyuncs.videorecog.model.v20200320.DetectVideoShotResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectVideoShotResponseUnmarshaller {

	public static DetectVideoShotResponse unmarshall(DetectVideoShotResponse detectVideoShotResponse, UnmarshallerContext _ctx) {
		
		detectVideoShotResponse.setRequestId(_ctx.stringValue("DetectVideoShotResponse.RequestId"));

		Data data = new Data();

		List<Integer> shotFrameIds = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("DetectVideoShotResponse.Data.ShotFrameIds.Length"); i++) {
			shotFrameIds.add(_ctx.integerValue("DetectVideoShotResponse.Data.ShotFrameIds["+ i +"]"));
		}
		data.setShotFrameIds(shotFrameIds);
		detectVideoShotResponse.setData(data);
	 
	 	return detectVideoShotResponse;
	}
}