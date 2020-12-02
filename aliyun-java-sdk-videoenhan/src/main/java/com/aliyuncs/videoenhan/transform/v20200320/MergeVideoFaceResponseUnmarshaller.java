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

package com.aliyuncs.videoenhan.transform.v20200320;

import com.aliyuncs.videoenhan.model.v20200320.MergeVideoFaceResponse;
import com.aliyuncs.videoenhan.model.v20200320.MergeVideoFaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class MergeVideoFaceResponseUnmarshaller {

	public static MergeVideoFaceResponse unmarshall(MergeVideoFaceResponse mergeVideoFaceResponse, UnmarshallerContext _ctx) {
		
		mergeVideoFaceResponse.setRequestId(_ctx.stringValue("MergeVideoFaceResponse.RequestId"));

		Data data = new Data();
		data.setVideoURL(_ctx.stringValue("MergeVideoFaceResponse.Data.VideoURL"));
		mergeVideoFaceResponse.setData(data);
	 
	 	return mergeVideoFaceResponse;
	}
}